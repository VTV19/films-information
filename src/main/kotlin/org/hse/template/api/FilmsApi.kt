package org.hse.template.api

import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.hse.template.client.rest.model.FilmFull
import org.hse.template.client.rest.model.Films

interface FilmsApi {

    @Tag(name = "Поиск фильма/сериала по названию")
    @ApiResponses(
        ApiResponse(
            description = "Успешный ответ",
            responseCode = "200"
        )
    )
    fun search(
        @Schema(
            description = "Название",
            defaultValue = "Little Women"
        )
        title: String
    ): FilmFull

    @Tag(name = "Поиск фильма/сериала по ID")
    @ApiResponses(
        ApiResponse(
            description = "Успешный ответ",
            responseCode = "200"
        )
    )
    fun movie(
        @Schema(
            description = "ID",
            defaultValue = "tt3281548"
        )
        id: String
    ): FilmFull

    @Tag(name = "Поиск списка фильмов по названию и году выхода")
    @ApiResponses(
        ApiResponse(
            description = "Успешный ответ",
            responseCode = "200"
        )
    )
    fun movies(
        @Schema(
            description = "Название",
            defaultValue = "Little Women"
        )
        title: String,
        @Schema(
            description = "Год выхода",
            defaultValue = "2019"
        )
        year: String
    ): Films

    @Tag(name = "Поиск сериала по названию + возможность получить либо полное (full), либо короткое (short) его описание")
    @ApiResponses(
        ApiResponse(
            description = "Успешный ответ",
            responseCode = "200"
        )
    )
    fun series(
        @Schema(
            description = "Название",
            defaultValue = "Friends"
        )
        title: String,
        @Schema(
            description = "Описание",
            defaultValue = "short"
        )
        plot: String
    ): FilmFull

    @Tag(name = "Поиск фильма(movie)/сериала(series) по названию и году + возможность получить либо полное (full), либо короткое (short) его описание")
    @ApiResponses(
        ApiResponse(
            description = "Успешный ответ",
            responseCode = "200"
        )
    )
    fun seriesOrMovie(
        @Schema(
            description = "Название",
            defaultValue = "Friends"
        )
        title: String,
        @Schema(
            description = "Тип",
            defaultValue = "series"
        )
        type: String,
        @Schema(
            description = "Год выхода",
            defaultValue = "1994"
        )
        year: String,
        @Schema(
            description = "Описание",
            defaultValue = "full"
        )
        plot: String
    ): FilmFull
}