package product;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];
        double maxPrice = Double.MIN_VALUE,price;
        int pid,quantity,pidOfMaxPrice =0;

        for(int i=0;i<5;i++){
            System.out.println("Product: "+(i+1));
             pid = sc.nextInt();
             price = sc.nextDouble();
             quantity = sc.nextInt();
            products[i]= new Product(pid,price,quantity);

            if(maxPrice<products[i].getPrice()){// logic for finding the item with max price
                maxPrice=products[i].getPrice();
                pidOfMaxPrice=products[i].getPid();
            }

        }
        //System.out.println(Arrays.toString(products));
        System.out.println("The max price item is : "+pidOfMaxPrice);
        System.out.println("The total amount spend on purchase is : "+totalAmountSpend(products));
    }

    private static double totalAmountSpend(Product[] products)
    {
        double total=0.0;
        for(int i=0;i<5;i++){
            total+=(products[i].getPrice()*products[i].getQuantity());
        }
        return total;

    }
}
