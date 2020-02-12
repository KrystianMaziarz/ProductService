package pl.com.edge.productservice.services;

import pl.com.edge.productservice.model.Product;
import pl.com.edge.productservice.model.Type;

class DiscountPrice {
    static void setPriceAfterDiscount(Product product) {

        if (product.getType().equals(Type.FEMALE) || product.getType().equals(Type.MALE)) {
            if (product.getPrice() != null) {
                product.setDiscountPrice(product.getPrice() * 0.95);
            }
        }
        if (product.getType().equals(Type.KID)) {
            if (product.getPrice() != null) {
                product.setDiscountPrice(product.getPrice() * 0.90);
            }
        }

    }
}
