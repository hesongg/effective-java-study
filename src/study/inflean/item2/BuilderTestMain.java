package study.inflean.item2;

public class BuilderTestMain {

    public static void main(String[] args) {
        var testBuild = Product.withMandatory("test",
                                              1000)
                               .description("1000")
                               .name("1000") // withMandatory 에서 초기화한 필드 다시 호출 가능 -> 깔끔하게 구현하지 못하는 듯
                               .build();

        var test = Product.builder()
                          .build();
    }
}
