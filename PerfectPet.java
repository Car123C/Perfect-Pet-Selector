// Determines the perfect pet based on color, season and name

import java.util.Scanner;
public class PerfectPet {
public static boolean isVowel(char letter) {
letter=Character.toLowerCase(letter);
return letter=='a'||letter =='e'||letter =='i'||letter =='o'||letter =='u';
}
}
public static void main(String[]args) {
Scanner input=new Scanner(System.in);
System.out.println("Enter color (red, blue, green):");
String color=input.nextLine().toLowerCase();
while (!color.equals("red")&& !color.equals("blue")&&!color.equals("green")) 
    {
System.out.println("Invalid color");
color=input.nextLine().toLowerCase();
}
System.out.println("Enter season (winter, spring, summer, fall):");
String season=input.nextLine().toLowerCase();
while (!season.equals("winter")&&!season.equals("spring")&&!season.equals("summer")&&!season.equals("fall")) {
    System.out.println("Invalid season. Enter winter, spring, summer, or fall:");
    season = input.nextLine().toLowerCase();
}
System.out.println("Enter name:");
String name = input.nextLine();
String pet="";
if (color.equals("blue")&&season.equals("fall")) {
    pet="alligator";
}
else if (color.equals("blue")&&season.equals("spring")) {
    pet="ostrich";
}
if(color.equals("green") &&season.equals("winter")&&!isVowel(name.charAt(0))) {
    pet="giraffe";
}
if (color.equals("green")&&!season.equals("fall") &&!pet.equals("giraffe")) {
    pet = "dog";
}
if (color.equals("red")) {if(isVowel(name.charAt(0))) {
pet="porcupine";
} else {
pet="panda";
}
}
System.out.println("The perfect pet for you is a " + pet + "!");
}
