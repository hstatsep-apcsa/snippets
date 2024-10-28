/* Lesson 2 Coding Activity Question 3 */

import java.util.Scanner;

class U4_L2_Activity_Three
{
  public static void main(String[] args)
  {
    // Declare a Scanner.
    Scanner scan = new Scanner(System.in);

    // Set a flag variable, cont, to control the loop.
    int cont = 1;

    // Set up temporary variables to store the current location.
    double lon = 0;
    double lat = 0;

    // Set up a max and min for latitude and longitude.
    // Note that maxLat is set up to be the minimum lat so that if 
    // any value entered is greater than maxLat, we replace
    // maxLat with the new value
    

    // While cont == 1, continue the loop.
    while(cont == 1)
    {
      // Input a lat and lon value (reverse order)
      System.out.println("Please enter the longitude: ");
      lon = scan.nextDouble();
      System.out.println("Please enter the latitude: ");
      lat = scan.nextDouble();
      

      // If the values are invalid, print an error, and continue the loop.
      if( /* condition*/ )
        System.out.println("Incorrect Latitude or Longitude");

      // Otherwise, check for a new max or min and ask the
      // user if they would like to continue.
      else
      {
        if(lat > maxLat)
          // update maxLat
        // update the next 3
      }
      System.out.println("Would you like to enter another location? (1 for yes, 0 for no)");
      cont = scan.nextInt();

    } // while

    // Print the results.
    System.out.println("Farthest North: " + maxLat);
    System.out.println("Farthest South: " + minLat);
    System.out.println("Farthest East: " + maxLon);
    System.out.println("Farthest West: " + minLon);
  }
} 
