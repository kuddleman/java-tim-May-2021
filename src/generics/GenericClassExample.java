package generics;

public class GenericClassExample {
    Product product = new Product(121, "Soap");
    int pId = product.g

}
class Product{
    private Object productId;   //might be a string, integer...we don't know
    private Object productDescription;

    public Product(Object product, Object productDescription) {
        this.productId = product;
        this.productDescription = productDescription;
    }

    public void setProduct(Object productId) {
        this.productId = productId;
    }

    public void setProductDescription(Object productDescription) {
        this.productDescription = productDescription;
    }

    public Object getProductId() {
        return productId;
    }

    public Object getProductDescription() {
        return productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productDescription=" + productDescription +
                '}';
    }
}
