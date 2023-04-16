public class Person
{
    private String FirstName;
    String LastName;
    protected String Organisation;
    public String Email;

    public Person(String aFirstName, String aLastName,
                  String aOrganisation, String aEmail)
    {
        this.FirstName = aFirstName;
        this.LastName = aLastName;
        this.Organisation = aOrganisation;
        this.Email = aEmail;
    }

    public void Introduce()
    {
        System.out.println(this.FirstName + " " + this.LastName);
        System.out.println("\t" + this.Organisation);
        System.out.println("\t" + this.Email);
    }
}

