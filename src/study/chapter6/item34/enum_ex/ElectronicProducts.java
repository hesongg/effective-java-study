package study.chapter6.item34.enum_ex;

import static study.chapter6.item34.enum_ex.ElectronicProducts.Company.APPLE;
import static study.chapter6.item34.enum_ex.ElectronicProducts.Company.SAMSUNG;

public enum ElectronicProducts {
    GALAXY(SAMSUNG),
    FLIP(SAMSUNG),
    IPHONE(APPLE),
    MACBOOK(APPLE);

    private final Company company;

    ElectronicProducts(Company company) {
        this.company = company;
    }

    String getLink() {
        return company.getLink(this);
    }

    enum Company {
        SAMSUNG {
            @Override
            String getLink(ElectronicProducts electronicProducts) {
                return "samsung.com/" + electronicProducts.name();
            }
        },
        APPLE {
            @Override
            String getLink(ElectronicProducts electronicProducts) {
                return "apple.com/" + electronicProducts.name();
            }
        };

        abstract String getLink(ElectronicProducts electronicProducts);
    }
}
