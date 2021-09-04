package one.digitalinnovation.experts.productcatalog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "product", type = "catalog")
public class Product {

    @Id
    private Long id;

    private String name;

    private Integer amount;
}
