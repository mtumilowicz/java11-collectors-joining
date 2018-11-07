[![Build Status](https://travis-ci.com/mtumilowicz/java11-collectors-joining.svg?branch=master)](https://travis-ci.com/mtumilowicz/java11-collectors-joining)

# java11-collectors-joining
The main goal of this project is to show `Collectors.joining` API
and `String.join`.

# preface
## collectors
```
public static 
Collector<CharSequence, ?, String> 
joining()
```
```
public static 
Collector<CharSequence, ?, String> 
joining(CharSequence delimiter)
```
```
public static 
Collector<CharSequence, ?, String> 
joining(CharSequence delimiter,
        CharSequence prefix,
        CharSequence suffix)
```
## string
```
public static 
String 
join(CharSequence delimiter, CharSequence... elements)
```
```
public static 
String 
join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
```

# project description
We provide tests for mentioned above methods.
* "a", "b", "c" -> "abc"
    ```
    Stream.of("a", "b", "c").collect(Collectors.joining());
    ```
    ```
    String.join("", "a", "b", "c");
    ```
* "a", "b", "c" -> "a,b,c"
    ```
    Stream.of("a", "b", "c").collect(Collectors.joining(","));
    ```
    ```
    String.join(",", List.of("a", "b", "c"));
    ```
* "a", "b", "c" -> "prefix-a,b,c-suffix"
    ```
    Stream.of("a", "b", "c").collect(Collectors.joining(",", "prefix-", "-suffix"));
    ```

# remarks
* If you don't need to - don't use streams - `String.join` is faster.
* If you want to customize joining - take a look at `StringJoiner` - 
please refer my other github project [StringJoiner](https://github.com/mtumilowicz/java11-StringJoiner).