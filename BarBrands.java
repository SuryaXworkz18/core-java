class BarBrands{


 
    static String brands[] = {
        "100 Piper's", "McRum", "Johnnie Walker", "Black Dog", "McWhisky",
        "Bagpiper", "Glenfiddich", "Blender's Pride", "Irish Whisky",
        "Vat 69", "Wild Turkey", "Old Monk", "Black & White",
        "IB (likely Indian Bourbon)", "Manshion House", "Choice",
        "Officer's Choice", "8 PM", "Bowmore"
    };

    static int price[] = {200,400,1000,300,250,2000,700,900,450,5000,10000,2500,1500,1000,3500,600,350,850,1150};
	
    public static void main(String args[]) {
        /*System.out.println("My Brand is " + Brands[4] + Brands[0] + Brands[1] + Brands[2]
                + Brands[3] + Brands[4] + Brands[5] + Brands[6] + Brands[7] + Brands[8]
                + Brands[9] + Brands[10]);*/
				
				
		System.out.println("Total brands " + brands.length);

        for(int b = 0  ; b < brands.length   ; b++){
        System.out.println(brands[b]);

		}
	
	    System.out.println("The brands are available are:");
		System.out.println("-----------------------------------");
		System.out.println( brands[0] + "|" + " price - " +price[0]);
		System.out.println( brands[1] + "|" + " price - " +price[1]);
		System.out.println( brands[2] + "|" + " price - " +price[2]);
		System.out.println( brands[3] + "|" + " price - " +price[3]);
		System.out.println( brands[4] + "|" + " price - " +price[4]);
		System.out.println( brands[5] + "|" + " price - " +price[5]);
		System.out.println( brands[6] + "|" + " price - " +price[6]);
		System.out.println( brands[7] + "|" + " price - " +price[7]);
		System.out.println( brands[8] + "|" + " price - " +price[8]);
		System.out.println( brands[9] + "|" + " price - " +price[9]);
		System.out.println("-----------------------------------");
		
    }
 }