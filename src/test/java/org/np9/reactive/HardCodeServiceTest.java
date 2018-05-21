package org.np9.reactive;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.np9.reactive.dto.Movie;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * @author nekperu15739
 */
@RunWith(MockitoJUnitRunner.class)
public class HardCodeServiceTest {

    public static final String ID = "id";

    @Mock
    private ReactiveMovieService movieService;

    @Mock
    private Mono<Movie> monoOfMovie;

    @Mock
    private Flux<Movie> fluxOfMovies;

    @Test
    public void all() {
        when(movieService.all()).thenReturn(fluxOfMovies);
        StepVerifier.create(movieService.all())
                .assertNext(movie -> assertThat(movie).isNotNull());
    }

    @Test
    public void byId() {
        when(movieService.byId(ID)).thenReturn(monoOfMovie);
        StepVerifier.create(movieService.byId(ID))
                .assertNext(movie -> assertThat(movie).isNotNull());
    }

}
