package study.inflean.item2;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Product {
    private final String name;
    private final int price;
    private String description;

    // 필수 파라미터를 받는 정적 팩토리 메소드
    public static ProductBuilder withMandatory(String name, int price) {
        return Product.builder()
                      .name(name)
                      .price(price);
    }
}