package personQueue;

public class SuperMarket{

    @SuppressWarnings("null")
	public static void main(String[] args){
    	
	    Person personBegin = new Person(0);
	    Person firstPerson = new Person(1);
	    Person secondPerson = new Person(2);
	    Person thirdPerson = new Person(3);
	    Person fourthPerson = new Person(4);
	    Person fifthPerson = new Person(5);
	    Person sixthPerson = new Person(6);
	    Person seventhPerson = new Person(7);
	
	    personBegin.addPerson(firstPerson);
	    personBegin.addPerson(secondPerson);
	    personBegin.addPerson(thirdPerson);
	    personBegin.addPerson(fourthPerson);
	    personBegin.addPerson(fifthPerson);
	    personBegin.addPerson(sixthPerson);
	    personBegin.addPerson(seventhPerson);
		

	
	    System.out.print("There are " + personBegin.getQueueSize());
		System.out.println(" people in the queue.");
		
		
		personBegin.servePerson();
		personBegin.servePerson();
		personBegin.servePerson();
		
		while(personBegin == null){
		    System.out.println(personBegin.getItems());
			personBegin = personBegin.getNext();}
	
	    System.out.print("Now, there are " + personBegin.getQueueSize());  
		System.out.println(" people in the queue.");
		personBegin.printMe();
		
	}
}