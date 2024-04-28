package org.hse.template.controller

import org.hse.template.api.FilmsApi
import org.hse.template.client.rest.api.FilmsInfoClient
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class FilmsController(
    private val filmsInfoClient: FilmsInfoClient
) : FilmsApi {
    private val apiKey = "25384e84"

    @GetMapping("/search/{title}")
    override fun search(@PathVariable title: String) = filmsInfoClient.search(title, apiKey)

    @GetMapping("/movie/{id}")
    override fun movie(@PathVariable id: String) = filmsInfoClient.movie(id, apiKey)

    @GetMapping("/movies/{title}&{year}")
    override fun movies(
        @PathVariable title: String,
        @PathVariable year: String
    ) = filmsInfoClient.movies(title, year, apiKey)

    @GetMapping("/series/{title}&{plot}")
    override fun series(
        @PathVariable title: String,
        @PathVariable plot: String
    ) = filmsInfoClient.series(title, plot, apiKey)

    @GetMapping("/seriesOrMovie/{title}&{type}&{year}&{plot}")
    override fun seriesOrMovie(
        @PathVariable title: String,
        @PathVariable type: String,
        @PathVariable year: String,
        @PathVariable plot: String
    ) = filmsInfoClient.seriesOrMovie(title, type, year, plot, apiKey)
}