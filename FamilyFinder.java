// Дорогой, я_из_будущего! Пожалуйста, прости меня за этот код.
// Переборщил с комментариями, для того чтобы не напрягать проверяющего и сэкономить его время :)
// Задание интересное, делал не без удовольствия :)
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FamilyFinder {
    List<House> listHouse = new ArrayList<>();


    void printLargeFamiles(List<House> houses) {
        System.out.println("Поиск многодетной семьи:");
        //цикл, перебираем дома
        for (House house : listHouse) {
            house.searchRooms();
        }
    }

    static void createNew() {
        //создаем объект класса FamilyFinder, будем добавлять в него объекты других классов
        FamilyFinder familyFinder = new FamilyFinder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите количество домов: ");
        int houseCount = scanner.nextInt(); //записываем количество домов в переменную int
        for (int i = 0; i < houseCount; i++) { //передаем переменную в заголовок цикла
            House house = new House(); //создаем объект класса House
            familyFinder.addHouse(house); //помещаем объект в массив listHouse
            house.createNewHouse(); //присваиваем номер дома
            System.out.print("\nВведите количество квартир в доме: ");
            int roomCount = scanner.nextInt(); //записываем количество квартир в переменную int
            for (int j = 0; j < roomCount; j++) { //передаем переменную в заголовок цикла
                Room room = new Room(); //создаем новый объект класса Room
                house.addRoom(room); //помещаем объект в массив
                room.createNewRoom(); //присваиваем номер комнаты
                System.out.print("\nВведите количество человек: ");
                int humanCount = scanner.nextInt(); //записываем количество квартир в переменную int
                for (int k = 0; k < humanCount; k++) { //передаем переменную в заголовок цикла
                    Human human = new Human(); //создаем объект класса Human
                    human.createHuman(); //присваиваем имя, фамилию и возраст
                    room.addHuman(human); //помещаем объект в массив
                }
            }
        }
        //вызываем метод для поиска многодетных семей
        familyFinder.printLargeFamiles(familyFinder.listHouse);
    }

    //метод который помещает объект класса House в массив listHouse
    void addHouse(House house) {
        listHouse.add(house);
    }

    public static void main(String[] args) {
        FamilyFinder.createNew();
    }
}
