package org.np9.reactive;

import org.junit.Test;
import org.np9.reactive.dto.Movie;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author nekperu15739
 */
public class HardCodeServiceTest {

    private final ReactiveMovieService service = new MockReactiveMovieMovieService();

    @Test
    public void all() {
        final Flux<Movie> movies = service.all();
        movies.subscribe(System.out::println);
    }

    @Test
    public void byId() {
        final Mono<Movie> movie = service.byId("id");
        movie.subscribe(System.out::println);
    }
}