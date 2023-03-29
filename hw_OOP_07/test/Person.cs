class Person
{
    private string name;
    private int age;
    
    public Person()
    {
        this.name = "Unknow";
        this.age = 18;
    }

    public Person(string name)
    {
        this.name = name;
        this.age = 20;
    }

    public Person (string name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public string getName()
    {
        return this.name;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    public void Presenter()
    {
        Console.WriteLine($"Hello, my name is {this.name}, i am {this.age}");
    }
}