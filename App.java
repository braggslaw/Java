public class App {
	
	public static void main(String[] args) {
		double regularPrice = 9.99;
		double salePrice = 5.99;
		double amtWalletBefore = 20.00;
		double amtWalletAfter = 15;
		int numFriends1 = 100;
		int numFriends2 = 30;
		int ageOfFriend1 = 33;
		int ageOfFriend2 = 27;
		int numFriendsPerYear = numFriends1 / ageOfFriend1;
		String firstNameFriend1 = "John";
		String lastNameFriend1 = "Doe";
		char middleIntialFriend1 = 'F';
		//4a. money in wallet after buying item
		System.out.printf("Wallet balance before purchase: $%.2f.", amtWalletBefore);
		System.out.println();
		amtWalletAfter = amtWalletBefore - regularPrice;
		System.out.println("4a. Wallet balance after purchase: $" + amtWalletAfter + ".");
		System.out.println();
		//4b. # of friends you have made each year based on age and # of friends
		System.out.println("4b. I made " + numFriendsPerYear + " friends each year since age " + ageOfFriend1 + ".");
		System.out.println();
		//4c. full name = first + mid + last
		String fullName1 = firstNameFriend1 + " " + middleIntialFriend1 + ". " + lastNameFriend1;
		//5. print all values
		System.out.println(fullName1);
		System.out.println("Regular Price of Item 1: " + regularPrice);
		System.out.println("Sale Price or Item 1: " + salePrice);
		System.out.println("Amount in Wallet before purchase: " + amtWalletBefore);
		System.out.println("Amount in Wallet after purchase: " + amtWalletAfter);
		System.out.println("Number or Friends 1: " + numFriends1);
		System.out.println("Number or Friends 2: " + numFriends2);
		System.out.println("Age of Friend 1: " + ageOfFriend1);
		System.out.println("Age or Friend 2: " + ageOfFriend2);
		System.out.println("Number or Friends Per Year: " + numFriendsPerYear);
		System.out.println("First Name of Friend 1: " + firstNameFriend1);
		System.out.println("Last Name or Friend 1: " + lastNameFriend1);
		System.out.println("Middle Initial of Friend 1: " + middleIntialFriend1);
	}
}
