package company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String address;
    private List<Product> productList;

    public Company(String name, String address, List<Product> productList){
        this.name = name;
        this.address = address;
        this.productList = productList;
    }

    public Product getMostExpensiveProduct(){
        Product mostExpensiveProduct = productList.get(0);
        for (int i=1;i<productList.size();i++){
            if(mostExpensiveProduct.getCost() < productList.get(i).getCost()){
                mostExpensiveProduct = productList.get(i);
            }
        }
        return mostExpensiveProduct;
    }

    public List<Product> getProductsMoreExpensiveThan(double cost){
        List<Product> result = new ArrayList<>();
        for (int i=0;i<productList.size();i++){
            if(productList.get(i).getCost() > cost){
                result.add(productList.get(i));
            }
        }
        return result;
    }

}
