class Nestedif{
public static void main(String[]args){
String address="Solapur,Maharashtra";
if(address.endsWith("Mahatrashtra")){ //true--will check nxt if

if(address.contains("Solapur")){
System.out.println("Your city is Solapur");
}

else if(address.contains("Mumbai")){
System.out.println("Your city is Mumbai");
}
else{
System.out.println(address.split(",")[0]);
}
}
else{
System.out.println("You are not living in India");
}
}
}