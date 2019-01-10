//
//  ChupAppUITests.swift
//  ChupAppUITests
//
//  Created by Iñaki Janeiro Olague on 12/31/18.
//  Copyright © 2018 VoidMX. All rights reserved.
//

import XCTest

class ChupAppUITests: XCTestCase {

    let app = XCUIApplication()

    override func setUp() {
        // Put setup code here. This method is called before the invocation of each test method in the class.
        super.setUp()
        // In UI tests it is usually best to stop immediately when a failure occurs.
        continueAfterFailure = false

        // UI tests must launch the application that they test. Doing this in setup will make sure it happens for each test method.
        XCUIApplication().launch()

        // In UI tests it’s important to set the initial state - such as interface orientation - required for your tests before they run. The setUp method is a good place to do this.
    }

    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testSoloModeInvocation() {
        let soloButton = app.buttons.matching(identifier: "soloButton").element

        soloButton.tap()

        XCTAssert(app.buttons["Drink Up"].exists, "User not redirected to games menu in solo mode")
    }

    func testCreateAParty() {
        let partyButton = app.buttons.matching(identifier: "partyButton").element
    
        partyButton.tap()
        app.buttons["Create Party"].tap()

        XCTAssert(app.buttons["Drink Up"].exists, "User not redirected to games menu in party mode")
    }

    func testJoinAParty() {
        let partyButton = app.buttons.matching(identifier: "partyButton").element

        partyButton.tap()
        app.buttons["Join Party"].tap()

        XCTAssert(app.staticTexts["Enter PIN:"].exists, "User not redirected to join party menu")
    }

    //Test to check the logo in the Launch Screen
    //Waiting for the logo
    /*
    func testLaunchScreenLogo(){
        let launchScreenLogo = app.images.matching(identifier: "launchScreenLogo").element
        
        XCTAssert(launchScreenLogo.exists, "Image in the launch screen not showing up")
    }
    */

    func testChangeLaunchScreen() {
        let soloButton = app.buttons.matching(identifier: "soloButton").element
        
        XCTAssert(soloButton.exists, "The launch screen is not moving into the main menu")
    }
}
