package org.hse.template.client.rest.api

import org.hse.template.client.rest.model.FilmFull
import org.hse.template.client.rest.model.Films
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "films-information")
interface FilmsInfoClient {

    @GetMapping
    fun search(
        @RequestParam("t") title: String,
        @RequestParam("apikey") apiKey: String
    ): FilmFull

    @GetMapping
    fun movie(
        @RequestParam("i") id: String,
        @RequestParam("apikey") apiKey: String
    ): FilmFull

    @GetMapping
    fun movies(
        @RequestParam("s") title: String,
        @RequestParam("y") year: String,
        @RequestParam("apikey") apiKey: String,
        @RequestParam("type") type: String = "movie"
    ): Films

    @GetMapping
    fun series(
        @RequestParam("t") title: String,
        @RequestParam("plot") plot: String,
        @RequestParam("apikey") apiKey: String,
        @RequestParam("type") type: String = "series"
    ): FilmFull

    @GetMapping
    fun seriesOrMovie(
        @RequestParam("t") title: String,
        @RequestParam("type") type: String,
        @RequestParam("y") year: String,
        @RequestParam("plot") plot: String,
        @RequestParam("apikey") apiKey: String
    ): FilmFull
}
