package pl.edu.wszib.labordersspring.config;

import lombok.Value;
import lombok.experimental.NonFinal;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@NonFinal
@Value
@ConstructorBinding
@ConfigurationProperties("orders")
public class OrderConfig {
}
