/**
 * @auther William Nash
 * This program will take measurments and find the area and the cost of the flooring materials
 */
public class Flooring{
	public static void main(String[] args) {
        double room = 25 * 20;
        double triangle = (12 * 10)/2;
        double totalArea = floorArea(room, triangle);
        //System.out.println(totalArea);
        System.out.printf("The amount of packages needed is %.2f.\n", packageNum(totalArea));
        System.out.printf("The total cost of all the packages is $%.2f", (packageNum(totalArea) * 24.99));

    }

    /**
     * This will calculate the area of the room
     * @param room The area of the bottom part of the room
     * @param triangle The area of the room that is not there
     * @return The area of the room to be laminated
     */
    public static double floorArea(double room, double triangle){
        return (room - triangle);
        //return total;
    }

    /**
     * This will take in the room area and give number of packages needed
     * @param totalAreaFt The total area of the room in feet
     * @return The number of packages of boards needed plus the %20 extra.
     */
    public static double packageNum(double totalAreaFt){
        double totalAreaIn = totalAreaFt * 12;
        //System.out.println(totalAreaIn);
        double boardNum = Math.ceil(totalAreaIn / (30 * 6));
        //System.out.println(boardNum);
        double totalPackages = boardNum / 6;
        //System.out.println(totalPackages);
        double packsExtra = totalPackages * 1.2;
        return packsExtra;
    }
}
