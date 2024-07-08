import java.util.Scanner;

public class Human extends Room {
    String name;
    String lastName;
    int age;

    //строка, присваиваем каждому человеку номер его дома и квартиры
    private String houseNumber;
    private String roomNumber;


    //метод, присваиваем объекту Human имя, фамилию, возраст, номер дома и квартиры
    public void createHuman(){
        this.houseNumber = House.lastHouseHumber; //присваиваем последнее значение номер дома
        this.roomNumber = Room.lastRoomNumber;//присваиваем последнее значение номер квартиры
        System.out.println("Введите имя, фамилию и возраст человека, разделение должно быть через пробел:");
        Scanner scanner = new Scanner(System.in);
        String humanInfo = scanner.nextLine();
        Scanner scannerHumanInfo = new Scanner(humanInfo);
        this.name = scannerHumanInfo.next();
        this.lastName = scannerHumanInfo.next();
        this.age = scannerHumanInfo.nextInt();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
}
