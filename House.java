import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class House {
    private int number;
    List<Room> rooms = new ArrayList<>();

    //строка, сохраняет последнее значение номера дома
    static String lastHouseHumber;

    //метод для считывания int переменной и ее присваивания в number
    public void createNewHouse(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите номер дома: ");
        this.number = scanner.nextInt();
        lastHouseHumber = "Дом #" + this.number;
    }

    //метод который помещает объект класса Room в массив rooms
    public void addRoom(Room room){
        rooms.add(room);
    }

    //цикл, перебираем комнаты
    public void searchRooms(){
        for (Room room: rooms){
            room.searchHuman();
        }
    }
}
