package Inheritance;

class Book {
	
	  String name;
	  int price;
	  // author details
	  Author auther;
	  Publisher publisher;
	  Book(String n, int p, Author auther, Publisher publisher )
	  {
	    this.name = n;
	    this.price = p;
	    this.auther = auther;
	    this.publisher = publisher;
	  }
	  public static void main(String[] args) {
	    Author auther = new Author("Michal", 32, "USA");
	    Publisher publisher = new Publisher("Sun Publication","ABC-110", "London");
	    Book b = new Book("Core Java", 800, auther, publisher);
	    System.out.println("Book Name: "+b.name);
	    System.out.println("Book Price: "+b.price);
	    System.out.println("------------Author Details----------");
	    System.out.println("Auther Name: "+b.auther.authorName);
	    System.out.println("Auther Age: "+b.auther.age);
	    System.out.println("Auther place: "+b.auther.place);
	    System.out.println("------------Publisher Details-------");
	    System.out.println("Publisher Name: "+b.publisher.name);
	    System.out.println("Publisher ID: "+b.publisher.publisherID);
	    System.out.println("Publisher City: "+b.publisher.city);
	  }
	  
	}

