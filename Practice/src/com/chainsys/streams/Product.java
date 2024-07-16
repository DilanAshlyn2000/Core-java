package com.chainsys.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
	private String name;
	private String category;
	private double price;
	private int stock;

	public Product(String name, String category, double price, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	@Override
	public String toString() {
		return "Product{" + "name='" + name + '\'' + ", category='" + category + '\'' + ", price=" + price + ", stock="
				+ stock + '}';
	}

	public static void main(String[] args) {
		// Creating a list of Product objects
		List<Product> products = Arrays.asList(new Product("Laptop", "Electronics", 1200.00, 20),
				new Product("Mouse", "Electronics", 25.00, 50), new Product("Keyboard", "Electronics", 80.00, 30),
				new Product("T-shirt", "Fashion", 35.50, 100), new Product("Jeans", "Fashion", 50.00, 80),
				new Product("Headphones", "Electronics", 120.00, 15), new Product("Socks", "Fashion", 5.00, 200),
				new Product("Smartphone", "Electronics", 800.00, 10));

		// Filtering products by category
		List<Product> electronicsProducts = products.stream()
				.filter(product -> product.getCategory().equals("Electronics")).collect(Collectors.toList());

		System.out.println("Electronics Products:");
		electronicsProducts.forEach(System.out::println);

		//Mapping products to names
		List<String> productNames = products.stream().map(Product::getName).collect(Collectors.toList());

		System.out.println("\nProduct Names:");
		productNames.forEach(System.out::println);

		// Sum of total stock
		int totalElectronicsStock = products.stream().filter(product -> product.getCategory().equals("Electronics"))
				.mapToInt(Product::getStock).sum();

		System.out.println("\nTotal Stock of Electronics Products: " + totalElectronicsStock);

		// Grouping products by category
		Map<String, List<Product>> productsByCategory = products.stream()
				.collect(Collectors.groupingBy(Product::getCategory));

		System.out.println("\nProducts grouped by Category:");
		productsByCategory.forEach((category, productList) -> {
			System.out.println(category + ":");
			productList.forEach(System.out::println);
		});

		// Sorting products by price 
		List<Product> sortedProductsByPrice = products.stream()
				.sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice())).collect(Collectors.toList());

		System.out.println("\nProducts sorted by Price (ascending):");
		sortedProductsByPrice.forEach(System.out::println);
	}
}
