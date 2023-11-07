class AppliancesServices
{
private String applianceType;
private String brand;
private boolean warranty;

public AppliancesServices()//default constructor
{
}

public AppliancesServices( String applianceType, String brand)//parameterized constructor
{
this.applianceType=applianceType;
this.brand=brand;

}
public AppliancesServices(String applianceType, String brand, boolean warranty)//constructor overloading
{
this.applianceType=applianceType;
this.brand=brand;
this.warranty=warranty;
}
public void repair()//method1
    {
        System.out.println("Repairing the " + brand + " " + applianceType);
    }

    
    public void repair(String issue) //method2 overloading
	{
        System.out.println("Repairing the " + brand + " " + applianceType + " for the issue: " + issue);
    }

    
    public void scheduleMaintenance(String technician)//method3 overloading
	{
        System.out.println("Scheduling maintenance for the " + brand + " " + applianceType + " with " + technician);
    }
	public void setUnderWarranty(boolean underWarranty) 
	{
        this.warranty = warranty;
    }

    public boolean warranty() {
        return warranty;
    }
}