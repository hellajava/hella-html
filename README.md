# Hella easy HTML in Java

Hella is a library for generating dynamic HTML in vanilla Java. It is lightweight and fast, requires no external dependencies, and supports all standard (and custom) HTML tags.

Released under the MIT License and free for everyone.

## Getting Started
Add the Maven dependency

```xml
<dependency>
    <groupId>sh.blake.hella</groupId>
    <artifactId>hella-html</artifactId>
    <version>1.0.0</version>
</dependency>
```

or for Gradle users
```
compile "sh.blake.hella:hella-html:1.0.0"
```

And finally the static import

```java
import static sh.blake.hella.Html.*;
```

## Example Usage
### Java code

```java
html(
    head(
        title(text("Hello World"))
    ),
    body(
        div(clazz("container"),
            h1(text("Hello world, HTML edition!")),
            p(text("Made hella easy in Java")),
            a(href("https://hella.blake.sh/"), text("Visit our homepage!"))
        )
    )
).toString();
```

### HTML output

```html
<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<div class="container">
    <h1>Hello world, HTML edition!</h1>
    <p>Made hella easy in Java</p>
    <a href="https://hella.blake.sh/">Visit our homepage!</a>
</div>
</body>
</html>
```

Note: formatted for readability, generated HTML will not have newlines or tabs

## Custom Tags and Attributes
Add custom tags with `tag(name, children...)` and custom attributes with `attr(name, value)`

## Inlining

Inline data directly from files with `fromFile(path)` and from resources with `fromResource(path)`