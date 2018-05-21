package org.np9.reactive.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * @author nekperu15739
 */
@Builder
@Getter
@RequiredArgsConstructor
@ToString
public class Movie {

    private final String id;
    private final String title;
    private final String gender;

}
