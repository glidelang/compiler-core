<!--suppress HtmlDeprecatedAttribute -->
<h1 align="center">
    <!--suppress CheckImageSize -->
<img width="250" height="250" alt="The LiquidLang logo" src="images/lq.png"><br>
    LiquidLang Compiler
</h1>
<p align="center">
    <em>Core Module, 0.0.1 dev</em>
    <br><br>
    <img alt="Discord" src="https://img.shields.io/discord/944945693989146634?color=blue&label=Discord&style=for-the-badge">
</p>
<hr>

## Suggestions
File a suggestion, or RFC on the GitHub Issues page in this repository. RFCs should be filed when making major changes to the language and API.

## Tests
LiquidLang tests are written in the `src/test/java` directory. Example files that can be parsed are in the `src/test/resources`. For
debugging, please use the `-v` or `--verbose` flag.

## Supported semantics
This is a list of currently supported semantics in Glide.
- Function *parameter* overloading (the parameter count has to differ)
- Function *return-type* overloading
- Imports (and anti-circular import strategy)
- Function calls and declarations
- Variable definitions, reassignments (not kept track of)

## Upcoming support for semantics
This is a list of semantics that will be or is currently in development and will be released soon in Glide.
- Function *parameter* overloading (the parameter types)
- `struct` in Glide