class Palindrome_build{
public static void main(String[] args){
if(args.length==0){
System.out.println("Please provide a valid String");
return;
}
String input=args[0];
if(isPalindrome(input)){
System.out.println("String is a palindrome"+input);
}
else{
System.out.println("String is not a palindrome"+input);
}
}
public  static boolean isPalindrome(String word){
boolean istrue=false;
String reversed=new StringBuffer(word).reverse().toString();
if(word.equalsIgnoreCase(reversed)){
 istrue=true;
}
return istrue;
}
}

