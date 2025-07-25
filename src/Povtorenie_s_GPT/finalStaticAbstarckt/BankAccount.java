package Povtorenie_s_GPT.finalStaticAbstarckt;

public class BankAccount {
    final String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    final void printAccountInfo() {
        System.out.println("Account Number: " + accountNumber + " Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);

    }

    public static void main(String[] args) {
        BankAccount ba = new SavingsAccount("1233", 100.0);
        ba.printAccountInfo();
    }
}

/*final class MathUtils {
    final double PI = 3.1415926535;

    final double square(double x) {
        return PI * x;
    }

}
class MyMathUtils extends MathUtils {

    @Override
    double square(double x) {
        return PI * x;
    }

    public static void main(String[] args) {

    }
}*/

class Employee {
    static int empCount;

    public Employee() {
        empCount++;
        System.out.println("Объект №: " + empCount + " создан");
    }


    public static void main(String[] args) {
        Employee e = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

    }
}

class StaticBloky {
    static String companyName;
    String name;

    static {
        companyName = "OpenAI";
        System.out.println("Static блок: companyName установлен -> " + companyName);
    }

    StaticBloky(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name: " + name + " Company: " + companyName);
    }

    public static void main(String[] args) {
        StaticBloky sb = new StaticBloky("Alex");
        StaticBloky sb2 = new StaticBloky("Bob");
        StaticBloky sb3 = new StaticBloky("John");
        sb.printInfo();
        sb2.printInfo();
        sb3.printInfo();
    }

}

class Employee2 {
    static String companyName;
    static String workTime;

    static {
        companyName = "OpenAI";
        workTime = "09:00-18:00";
    }

    static class HRDepartment {
        public void printPolicy() {
            System.out.println("Kompany: " + companyName + " Work Time: " + workTime);
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Employee2.HRDepartment hr = new Employee2.HRDepartment();
        hr.printPolicy();
    }
}


class Employee3 {
    static String companyName;
    static String benefitsForEmployee;

    static {
        companyName = "OpenAI";
        benefitsForEmployee = "\n- Медицинская страховка\n" + "- Оплачиваемый отпуск\n" + "- Гибкий график";
    }

    static class Benefits {
        public void printPolicy() {
            System.out.println("Льготы для сотрудников " + companyName + ": " + benefitsForEmployee);
        }
    }
}

class Main3 {
    public static void main(String[] args) {
        Employee3.Benefits b = new Employee3.Benefits();
        b.printPolicy();
    }
}

class Team {
    static class Member {
        String name;
        String role;

        Member(String name, String role) {
            this.name = name;
            this.role = role;
        }

        public void printInfo() {
            System.out.println("Member: " + name + " Role: " + role);
        }
    }

    public static void main(String[] args) {
        Team.Member m1 = new Team.Member("Алексей", "Разработчик");
        Team.Member m2 = new Team.Member("Мария", "Тестировщик");
        Team.Member m3 = new Team.Member("Иван", "Дизайнер");
        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
    }
}

interface Config {
    static class Version {
        static String version; {
            version = "1.0.5";
        }
        public void printVersion () {
            System.out.println("App's version is: " + version);
        }
    }

    public static void main(String[] args) {
        Config.Version v = new Config.Version();
        v.printVersion();

    }
}