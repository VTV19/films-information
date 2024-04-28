package org.hse.template.client.rest.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

@Schema(description = "Длинная информация о фильме/сериале")
data class FilmFull(
    @JsonProperty("Title")
    @Schema(description = "Название")
    var title: String?,

    @JsonProperty("Rated")
    @Schema(description = "Rated")
    var rated: String?,

    @JsonProperty("Year")
    @Schema(description = "Год выхода")
    var year: String?,

    @JsonProperty("Released")
    @Schema(description = "Дата релиза")
    var released: String?,

    @JsonProperty("Runtime")
    @Schema(description = "Продолжительность")
    var runtime: String?,

    @JsonProperty("Genre")
    @Schema(description = "Жанр")
    var genre: String?,

    @JsonProperty("Director")
    @Schema(description = "Режиссер")
    var director: String?,

    @JsonProperty("Writer")
    @Schema(description = "Автор(ы) произведения")
    var writer: String?,

    @JsonProperty("Actors")
    @Schema(description = "Актеры")
    var actors: String?,

    @JsonProperty("Plot")
    @Schema(description = "Описание")
    var plot: String?,

    @JsonProperty("Language")
    @Schema(description = "Язык(и)")
    var language: String?,

    @JsonProperty("Country")
    @Schema(description = "Страна(ы)")
    var country: String?,

    @JsonProperty("Awards")
    @Schema(description = "Награды")
    var awards: String?,

    @JsonProperty("Poster")
    @Schema(description = "Ссылка на постер")
    var poster: String?,

    @JsonProperty("Ratings")
    @Schema(description = "Список рейтингов фильма/сериала на определенных ресурсах")
    var ratings: List<Rating>?,

    @JsonProperty("Metascore")
    @Schema(description = "Metascore")
    var metascore: String?,

    @JsonProperty("imdbRating")
    @Schema(description = "imdbRating")
    var imdbRating: String?,

    @JsonProperty("imdbVotes")
    @Schema(description = "imdbVotes")
    var imdbVotes: String?,

    @JsonProperty("imdbID")
    @Schema(description = "imdbID")
    var imdbID: String?,

    @JsonProperty("Type")
    @Schema(description = "Тип (фильм/сериал/эпизод)")
    var type: String?,

    @JsonProperty("DVD")
    @Schema(description = "DVD")
    var dvd: String?,

    @JsonProperty("BoxOffice")
    @Schema(description = "BoxOffice")
    var boxOffice: String?,

    @JsonProperty("Production")
    @Schema(description = "Production")
    var production: String?,

    @JsonProperty("Website")
    @Schema(description = "Website")
    var website: String?,

    @JsonProperty("totalSeasons")
    @Schema(description = "totalSeasons")
    var totalSeasons: String?,

    @JsonProperty("Response")
    @Schema(description = "Response")
    var response: String?
)
