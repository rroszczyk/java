public class Person
{
    public String FirstName;
    protected String LastName;
    String Affilate;
    private String Email;

    public Person(String aFirstName, String aLastName, String aEmail)
    {
        this.FirstName = aFirstName;
        this.LastName = aLastName;
        this.Email = aEmail;
        this.Affilate = "other";
    }

    public void Introduce()
    {
        System.out.println(this.Affilate +
                           this.FirstName + this.LastName + this.Email);
    }
}
