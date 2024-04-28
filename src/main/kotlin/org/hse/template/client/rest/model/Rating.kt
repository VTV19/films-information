package org.hse.template.client.rest.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Рейтинг фильма/сериала на определенном ресурсе")
data class Rating(
    @JsonProperty("Source")
    @Schema(description = "Ресурс")
    var source: String?,

    @JsonProperty("Value")
    @Schema(description = "Рейтинг")
    var value: String?,
)
