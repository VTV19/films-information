package org.hse.template.client.rest.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

@Schema(description = "Короткая информация о фильмах/сериалах")
data class Films(
    @JsonProperty("Search")
    @Schema(description = "Список найденных фильмов/сериалов")
    var search: List<FilmShort>?,

    @JsonProperty("totalResults")
    @Schema(description = "Кол-во результатов")
    var totalResults: String?
)
