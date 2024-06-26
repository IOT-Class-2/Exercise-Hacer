package mextDay2;

public class Employee { // 'public' Bu sınıfın her yerden erişilebilir olduğunu belirtir
    private String name; // 'private' Bu değişkenin sadece bu sınıf içinden erişilebilir olduğunu belirtir
    // çalışanın adını tutan metin değişkenidir
    protected double salary ; // bu değişkene aynı paket ve alt sınıflardan erişilebilir
    private int age;

    public Employee(String name, double salary, int age){ // bu sınıfın bir örneği oluşturulurken çağrılan metottur
        this.name = name; //"name" parametresini sınıfın 'name' değişkenine atar
        this.salary = salary;
        this.age = age;
    }

    //Getter ve Setter metotları :
    // Bu metotlar , özel değişkenlerin değerlerini dış dünyaya(başka sınıflara yani) vermek için kullanılır.

    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }
    public void raiseSalery(){ //çalışanın maaşını artıran metot
        this.salary = this.salary * 1.2;
    }
}

