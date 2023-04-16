public class Person
{
    public String FirstName;
    protected String LastName;
    String Organisation;
    private String Email;

    public Person(String aFirstName, String aLastName,
                  String aOrganisation, String aEmail)
    {
        FirstName = aFirstName;
        LastName = aLastName;
        Organisation = aOrganisation;
        Email = aEmail;
    }

    public void Introduce()
    {
        System.out.println(FirstName + " " + LastName);
        System.out.println("\t" + Organisation);
        System.out.println("\t" + Email);
    }
}
