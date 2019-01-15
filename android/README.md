Android Project
===============

Currently, the set-up is easy, just clone the project with `git clone` and create a new branch with `git checkout -b <feature-branch-name>` to start coding a feature.
Follow the [thoughtbot git protocol](https://github.com/thoughtbot/guides/tree/master/protocol/git) to write a feature and merge it to master after is approve by the leads.

## Developing

The project is written with Java, so it's recommended to have the latest version. The documentation can be found in the [official site](https://docs.oracle.com/javase/8/docs/).

Is mandatory to use TDD when modifying **anything** from the app, this way we can ensure that every single feature is working correctly.

Now, some conventions that are nice to remember, these are all based of [Google's Java Style Guide](https://google.github.io/styleguide/javaguide.html):

### Braces
* Braces to any structure are not mandatory if the statement fits in one line.
* Otherwise, the block should follow the next suggestions:
  * No line break before the opening brace.
  * Line break after the opening brace.
  * Line break before the closing brace.
  * Line break after the closing brace.
* One statement per line.
* Indentation should be done using 4 spaces.

### Naming

* Class names are written with PascalCase.
* Methods names are written with camelCase.
* Constants are written all in caps with every word separated by an underscore.
* Non-constants are written in camelCase

### Comments
* All comments should be written in a block, such as:
```
/*
 * This is
 * a small
 * comment.
*/
```

*Currently writing more documentation*
