package lesson8.task4;

class Contract {

    private String numb;
    private String date;
    private String[] tovar = {"Автомобиль", "Квартира"};

    void setNumb() {
        this.numb = "123/4";
    }

    void setDate() {
        this.date = "24.10.2019";
    }

    String getNumb() {
        return numb;
    }

    String getDate() {
        return date;
    }

    String[] getTovar() {
        return tovar;
    }
}