# Hella easy HTML in Java

**hella-html** is a library for generating dynamic HTML in vanilla Java. It is lightweight and fast, requires no external dependencies, and supports all standard (and custom) HTML tags.

Released under the MIT License and free for everyone.

## Getting started
Add the Maven dependency.

```xml
<dependency>
    <groupId>sh.hella</groupId>
    <artifactId>hella-html</artifactId>
    <version>1.0.1</version>
</dependency>
```

or for Gradle users...
```
compile "sh.hella:hella-html:1.0.0"
```

And finally the static import.

```java
import static sh.hella.html.Html.*;
```

## Example usage
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
            a(href("https://hella.sh/"), text("Visit our homepage!"))
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
    <a href="https://www.hella.sh/">Visit our homepage!</a>
</div>
</body>
</html>
```

Note: formatted for readability, generated HTML will not have newlines or tabs.

## Add and remove tags dynamically
Add and remove tags with the `add` and `remove` methods. Use them conditionally, inside loops, or however else you want.
```java
Node contentDiv = div(clazz("content"));
Node textSpan = span(text("Dynamic text!"));
        
contentDiv.add(textSpan);
contentDiv.toString(); // <div class="content"><span>Dynamic text!</span></div>

contentDiv.remove(textSpan);
contentDiv.toString(); // <div class="content"></div>
```

## Custom tags and attributes
Add custom tags with `tag(name, children...)` and custom attributes with `attr(name, value)`.

### Java code
```java
tag("myCustomTag", 
    div(attr("foo", "bar"),
        text("Hello, custom tags and attributes!")
    )
)
```

### HTML output
```html
<myCustomTag><div foo="bar">Hello, custom tags and attributes!</div></myCustomTag>
```

## Inlining content

Inline data directly from files with `fromFile(path)` and from resources with `fromResource(path)`.

### Java code
```java
style(fromResource("style.css")))
```

### HTML output
```html
<style>
    (contents of style.css)
</style>
```