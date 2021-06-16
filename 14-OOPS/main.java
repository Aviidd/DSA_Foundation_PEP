public class main{
    public static class phone{
        String companyName;      //this is class
        String model;
        String color;
        int ram;
        int storage;
        int batteryPower;


        public phone(String companyName, String model, String color, int ram, int storage, int batteryPower){   //parameterized constructor
            this.companyName = companyName;
            this.model = model;
            this.color = color;
            this.ram = ram;
            this.storage  storage;
            this.batteryPower = batteryPower;
        }

        public phone() {   //default constructor.   
                            
                             //this concept is called constructor chaining.
        }

        public String getinfo(){                    //this is function in class
            StringBuilder sb=new StringBuilder();
            sb.append("Company Name: " + this.companyName + "\n");
            sb.append("Model: " + this.model + "\n");
            sb.append("Color: " + this.color + "\n");
            sb.append("Ram: " + this.ram + "GB\n");
            sb.append("Storage: " + this.storage + "GB\n");
            sb.append("Battery Power: " + this.batteryPower + "MAH\n");

            return sb.toString();
        }
    }

    public static void test1(){
        phone p1=new phone();             //this is object of class phone.
        p1.companyName="Samsung";
        p1.model="M31s";
        p1.color="black";
        p1.ram=8;
        p1.storage=128;
        p1.batteryPower=6000;

        phone p2=new phone();
        p2.companyName="Samsung";
        p2.model="M31s";
        p2.color="blue";
        p2.ram=12;
        p2.storage=256;
        p2.batteryPower=7000;

        phone p3=new phone();
        p3.companyName="Samsung";
        p3.model="M31s";
        p3.color="white";
        p3.ram=16;
        p3.storage=512;
        p3.batteryPower=9000;

        System.out.println(p1.getinfo());
        System.out.println("-----------");
        System.out.pritnln(p2.getinfo());
        System.out.pritnln("-------");
        System.out.println(p3.getinfo());

    }

    public static void main(String[] args){
        test1();

    }
}