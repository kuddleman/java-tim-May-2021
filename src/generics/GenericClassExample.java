package generics;

public class GenericClassExample {
    public static void main(String[] args) {
//    Product product = new Product(121, "Soap");
//    int pId = (int)product.getProductId();
//    String productDescription = (String)product.getProductDescription();

        Product1<Integer, String> prod = new Product1<>(121, "Soap");
        Product1<String, String> anotherProd = new Product1<>("idnum", "anotherSoap");
    }

}

class Product1< PRODUCT, DESCRIPTION > {
    private PRODUCT productId;
    private DESCRIPTION productDescription;

    public Product1(PRODUCT productId, DESCRIPTION productDescription) {
        this.productId = productId;
        this.productDescription = productDescription;
    }





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
