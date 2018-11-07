import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mtumilowicz on 2018-11-07.
 */
public class CollectorsJoiningTest {
    @Test
    public void collectors_joining_default() {
        var concat = Stream.of("a", "b", "c")
                .collect(Collectors.joining());
        
        assertThat(concat, is("abc"));
    }

    @Test
    public void collectors_joining_delimiter() {
        var concat = Stream.of("a", "b", "c")
                .collect(Collectors.joining(","));

        assertThat(concat, is("a,b,c"));
    }

    @Test
    public void collectors_joining_delimiter_prefix_suffix() {
        var concat = Stream.of("a", "b", "c")
                .collect(Collectors.joining(",",
                        "prefix-",
                        "-suffix"));

        assertThat(concat, is("prefix-a,b,c-suffix"));
    }
    
    @Test
    public void string_join_args() {
        var join = String.join(",", "a", "b", "c");
    
        assertThat(join, is("a,b,c"));
    }

    @Test
    public void string_join_iterable() {
        var join = String.join(",", List.of("a", "b", "c"));

        assertThat(join, is("a,b,c"));
    }
}
