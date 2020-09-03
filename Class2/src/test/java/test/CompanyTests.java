package test;

import company.Company;
import company.Product;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CompanyTests {

    @Test
    public void testMostExpensiveProduct(){

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"laptop",500));
        productList.add(new Product(2,"phone",1500));
        productList.add(new Product(1,"book",5));

        Company company = new Company("TG","Rio Branco", productList);

        Assert.assertEquals(company.getMostExpensiveProduct().getName(), "phone");
    }

    @Test
    public void testProductsMoreExpensiveThan(){

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"laptop",500));
        productList.add(new Product(2,"phone",1500));
        productList.add(new Product(3,"book",5));

        Company company = new Company("TG","Rio Branco", productList);

        Assert.assertEquals(company.getProductsMoreExpensiveThan(300).size(), 2);
    }
}
