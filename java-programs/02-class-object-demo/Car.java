class Car{
        
     String brand;
     String model;
     String price;
   
     public void drive(){
        System.out.println("start the engine");
	System.out.println("put a gear");
        System.out.println("start driving");        
    }
    
    public void printInfo(){
        System.out.println("My Car Brand is " + brand);
	System.out.println("My Car Model is " + model);
	System.out.println("My Car Price is " + price);
    }

    public static void main(String args[]){
	Car car1 = new Car();        
	car1.brand = "Audi";	
        car1.model = "Q4";
        car1.price = "1crore";	
	car1.printInfo();
        car1.drive();
        
        Car car2 = new Car();
        car2.brand = "Maruthi";	
        car2.model = "Suzuki";
        car2.price = "8Lakhs";	
	car2.printInfo();
        car2.drive();        		

        Car car3 = new Car();
        Car car4 = new Car();
        System.out.println(car3 == car4);        

        Car car5 = new Car();
        Car car6 = car5;
        System.out.println(car6 == car5);        
    }

  }
