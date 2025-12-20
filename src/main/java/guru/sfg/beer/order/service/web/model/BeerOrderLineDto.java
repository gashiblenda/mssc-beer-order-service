package guru.sfg.beer.order.service.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerOrderLineDto {

	@JsonProperty("id")
	private UUID id;

	@JsonProperty("version")
	private Integer version;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
	@JsonProperty("createdDate")
	private OffsetDateTime createdDate;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
	@JsonProperty("lastModifiedDate")
	private OffsetDateTime lastModifiedDate;

	private String upc;
	private String beerName;
	private String beerStyle;
	private UUID beerId;
	private int orderQuantity;
	private BigDecimal price;

	private Integer quantityAllocated;
}