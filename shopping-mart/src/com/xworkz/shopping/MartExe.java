package com.xworkz.shopping;
import com.xworkz.shopping.productDetails.ProductDetails;
import com.xworkz.shopping.shoping.ShopingMart;

import java.util.Scanner;
public class MartExe {




        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The number of products to be Added");
            int size=sc.nextInt();
            ShopingMart mart = new ShopingMart(size);
            for (int i = 0; i <size ; i++) {

                ProductDetails products = new ProductDetails();
                // System.out.println("Enter the app id");
                // products.setProductId(sc.nextInt());
                System.out.println("Enter the product Name");
                products.setProductName(sc.next());

                System.out.println("Enter the product Price");
                products.setProductPrice(sc.nextDouble());

                System.out.println("Enter the product type");
                products.setProductType(sc.next());

                System.out.println("Enter the manufacturing date of product");
                products.setManufacturingDate(sc.next());

                System.out.println("Enter the expiry date of product");
                products.setExpiryDate(sc.next());

                System.out.println("Enter the product rating");
                products.setProductRating(sc.nextDouble());

                mart.addProducts(products);


            }
            mart.getAllProducts();
            String input = null;
            do {
                System.out.println("Press 1: to get all products");
                System.out.println("Press 2: to get products by name");
                System.out.println("Press 3: to get products by type");
                System.out.println("Press 4: to get application name by price");
                //System.out.println("Press 5: to get updated product name by id");
                // System.out.println("Press 6: to get updated product price by name");
                // System.out.println("Press 7: to get updated Manufacturing date by Name");
                // System.out.println("Press 8:to get Deleted product");
                int options = sc.nextInt();
                switch (options){

                    case 1:mart.getAllProducts();
                        break;

                    case 2:
                        System.out.println("Enter the product Name");
                        mart.getProductByName(sc.next());
                        break;

                    case 3:
                        System.out.println("Enter the product  Type");
                        mart.getProductByType(sc.next());
                        break;

                    case 4:
                        System.out.println("Enter the Product price");
                        mart.getProductNameByPrice(sc.nextInt());
                        break;


                    default:
                        System.out.println("Please enter the valid choice");

                }
                System.out.println("Do you want to continue Y/N");
                input=sc.next();

            } while (input.equals("Y"));
            System.out.println("Thank you for using our app");


        }
    }


