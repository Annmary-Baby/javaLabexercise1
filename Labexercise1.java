
public class Labexercise1
{
public static void main(String args[])
{
AppliancesServices appliance1=new AppliancesServices("Laptop","hp");
AppliancesServices appliance2=new AppliancesServices("Mobile","Vivo");

        appliance1.repair();
        appliance1.repair("Grains in the screen");
        appliance2.scheduleMaintenance("Annmary");

        
        System.out.println("Is appliance1 under warranty? " + appliance1.warranty());
        appliance1.setUnderWarranty(true);
        System.out.println("Is appliance1 under warranty now? " + appliance1.warranty());

}
}