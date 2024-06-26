package mextDay2;

public class Engineer extends Employee { //'public' bu sınıfın her yerden erişilebilir olduğunu belirtir
    // 'extends' Employee,Engineer classını(sınıfın) Employee sınıfından miras aldığını belirtir
    // 'Employee' sınıfından miras aldığını belirtir. Yani ' Engineer' sınıfının tüm özelliklerine ve metotlarına sahip olur.

    public Engineer(String name, double salary, int age){ // bu sınıfın örneğini oluşturulurken çağrılan metottur.
        super(name, salary, age);// 'Employee' sınıfının yapıcı metotdunu çağırır.'name','salary','age' parametrelerini
        // 'Employee' sınıfına iletir.
        // Bu sınıfın yapıcı metodunu çağırır
    }


    // Constracture ---> Yapıcı metot
    public double getAnnualBonus(){ // Engineer in yıllık bonusunu hesaplayan metottur. Ve bu metotdu döndürür.
        return super.salary * .05; // Bu metot Employee sınıfından alınan maaş/salary değişkenine erişir
        //Ne ile erişir? super anahtar kelimesi ile erişir.
        //Metotun genel işlevi ise maaşın %5' ini hesaplar ve döndürür. Bu Engineer 'in yıllık bonusunu belirler.
    }

}
