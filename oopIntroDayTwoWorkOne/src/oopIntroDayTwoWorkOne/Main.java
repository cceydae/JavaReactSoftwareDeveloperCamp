package oopIntroDayTwoWorkOne;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1235979,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + ANGULAR)",
				"Engin Demirog",
				0);
		
		Product product2 = new Product(1332369,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JAVA + REACT)",
				"Engin Demirog",
				58);
		
		Product product3 = new Product();
		product3.id =1240541;
		product3.name="Programlamaya Giri� i�in Temel Kurs";
		product3.trainer="Engin Demirog";
		product3.completedPart=100;
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			
			System.out.println("Kurs ismi: "+ product.name);
			System.out.println("E�itmeniniz: "+ product.trainer);
			System.out.println("Tamamland�: "+ product.completedPart);
		}
		
		
		
		Category category1 = new Category(1,"Kurslar�m");
		Category category2 = new Category(2,"T�m Kurslar");
		Category category3 = new Category(3,"Kampa Haz�rl�k");
		Category category4 = new Category(4,"S�k Sorulan Sorular");
		
		Category[] categories = {category1,category2,category3,category4};
		
		for(Category category : categories) {
			System.out.println("Se�ilen kategori: "+ category.name);
		}
		
		
		
		ProductManager productManager =new ProductManager();
		productManager.startCourse(product1);
		productManager.startCourse(product2);
		productManager.startCourse(product3);
		productManager.nextLesson();
	}

}
