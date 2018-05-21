package org.np9.reactive;

import org.np9.reactive.dto.Movie;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author nekperu15739
 */
public class MockReactiveMovieMovieService implements ReactiveMovieService {

    public Flux<Movie> all() {
        return Flux.just(mocMovie());
    }

    public Mono<Movie> byId(final String id) {
        return Mono.just(mocMovie());
    }

    private Movie mocMovie() {
        return Movie.builder()
                .id("id")
                .title("title")
                .gender("gender")
                .build();
    }

}
