package org.np9.reactive;

import org.np9.reactive.dto.Movie;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author nekperu15739
 */
public interface ReactiveMovieService {

    Flux<Movie> all();

    Mono<Movie> byId(String id);

}
