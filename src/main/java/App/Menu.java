package App;

public class Menu {

    int id , price;
    String name , categories;

    public Menu(){}
    public Menu(int id , String name , int price , String categories){
        setId(id);
        setName(name);
        setPrice(price);
        setCategories(categories);
    }
    public Menu( String name , int price , String categories){
        setName(name);
        setPrice(price);
        setCategories(categories);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
}
