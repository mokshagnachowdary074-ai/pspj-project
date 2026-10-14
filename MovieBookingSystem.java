import java.util.Scanner;

class MovieBookingSystem {
public static void main(String[] args) {

Scanner mb = new Scanner(System.in); 

System.out.println("===========MOVIES STREAMING NOW==========");
System.out.println("1. Spiderman Brand New Day - price : Rs.250");
System.out.println("2. Avengers Doomsday - price : Rs.350");
System.out.println("3. Avengers Secret Wars - price : Rs.460");
System.out.println("4. Salaar 2 - price : Rs.170 ");

System.out.print("Enter the movie number (1-4) : ");
int moviename = mb.nextInt();

mb.nextLine(); 

String finalMovie = "";
double price = 0; 

switch (moviename) {
case 1:
finalMovie = "Spiderman Brand New Day";
price = 250;
System.out.println("Selected movie : " + finalMovie);
break;

case 2:
finalMovie = "Avengers Doomsday";
price = 350;
System.out.println("Selected movie : " + finalMovie);
break;

case 3:
finalMovie = "Avengers Secret Wars";
price = 460;
System.out.println("Selected movie : " + finalMovie);
break;

case 4:
finalMovie = "Salaar 2";
price = 170;
System.out.println("Selected movie : " + finalMovie);
break;

default:
System.out.println("Invalid movie name.");
return;
}



System.out.println("%n========== SHOWTIME =========");
System.out.println(" 1. MORNING ");
System.out.println(" 2. EVENING ");

System.out.print("Enter the showtime (1-2): ");
int showtime = mb.nextInt();
String selectedShowtime = "";
double discount = 0;

switch (showtime) {
case 1:
selectedShowtime = "MORNING";
System.out.println("Selected Showtime : MORNING ");
break;
case 2:
selectedShowtime = "EVENING";
System.out.println("Selected Showtime : EVENING ");

discount = price * 0.10; 
break;
default:
System.out.println("Invalid Showtime.");
return;
}


System.out.print("%nSelect seat number (1-40): ");
int m = mb.nextInt();

if (m > 0 && m <= 40) {
System.out.println("Your booking confirmed!");
System.out.println("Enjoy your show.%n");
} else {
System.out.println("Invalid seat.");
return;
}

System.out.print("\nEnter Coupon Code (or press Enter to skip): ");
String couponCode = mb.nextLine().trim();
double couponDiscount = applyCoupon(couponCode, movie.basePrice);


double timeDiscount = showtime.discount;
double totalDiscount = timeDiscount + couponDiscount;
double priceAfterDiscount = movie.basePrice - totalDiscount;
if (priceAfterDiscount < 0) priceAfterDiscount = 0;

double gstAmount = priceAfterDiscount * 0.014;
double finalPrice = priceAfterDiscount + gstAmount;

if (finalPrice < 0) {
finalPrice = 0;
}


System.out.println("===========Movie Bill============");
System.out.println("Movie name : " + finalMovie);
System.out.println("Showtime : " + selectedShowtime);
System.out.printf("Base Price : Rs.%.2f\n", price);

if (discount > 0) {
System.out.printf("Discount : -Rs.%.2f\n", discount);
}

System.out.printf("GST (1.4%%) : Rs.%.2f\n", gstAmount);
System.out.printf("Total Paid : Rs.%.2f\n", finalPrice);
System.out.println("Seat no : " + m);
System.out.println("Thank You Visit Again 🙏");

mb.close(); 
}
} 