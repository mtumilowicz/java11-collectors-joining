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