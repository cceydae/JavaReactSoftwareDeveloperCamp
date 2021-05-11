package oopIntroDayTwoWorkOne;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1235979,
				"Yazýlým Geliþtirici Yetiþtirme Kampý(C# + ANGULAR)",
				"Engin Demirog",
				0);
		
		Product product2 = new Product(1332369,
				"Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)",
				"Engin Demirog",
				58);
		
		Product product3 = new Product();
		product3.id =1240541;
		product3.name="Programlamaya Giriþ için Temel Kurs";
		product3.trainer="Engin Demirog";
		product3.completedPart=100;
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			
			System.out.println("Kurs ismi: "+ product.name);
			System.out.println("Eðitmeniniz: "+ product.trainer);
			System.out.println("Tamamlandý: "+ product.completedPart);
		}
		
		
		
		Category category1 = new Category(1,"Kurslarým");
		Category category2 = new Category(2,"Tüm Kurslar");
		Category category3 = new Category(3,"Kampa Hazýrlýk");
		Category category4 = new Category(4,"Sýk Sorulan Sorular");
		
		Category[] categories = {category1,category2,category3,category4};
		
		for(Category category : categories) {
			System.out.println("Seçilen kategori: "+ category.name);
		}
		
		
		
		ProductManager productManager =new ProductManager();
		productManager.startCourse(product1);
		productManager.startCourse(product2);
		productManager.startCourse(product3);
		productManager.nextLesson();
	}

}
