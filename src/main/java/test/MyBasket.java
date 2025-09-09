package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBasket implements Basket {

    private final Map<String, Integer> cart = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    @Override
    public void removeProduct(String product) {
        cart.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        cart.put(product, quantity);
    }

    @Override
    public void clear() {
        cart.clear();
    }

    @Override
    public List<String> getProducts() {
        return cart.keySet().stream().toList();
    }

    @Override
    public int getProductQuantity(String product) {
        return cart.getOrDefault(product, 0);
    }
}
