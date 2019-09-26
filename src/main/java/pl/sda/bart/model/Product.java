package pl.sda.bart.model;

public class Product {

    private int id;
    private String name;
    private String desc;
    private String photo;
    private int price;
    private int amount;

    public Product(int id, int name, int desc, int photo, int price, int amount) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static class Builder {
        private int id;
        private int name;
        private int desc;
        private int photo;
        private int price;
        private int amount;

        public Builder id(String id) {
            this.id = Integer.parseInt(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Integer.parseInt(name);
            return this;
        }

        public Builder desc(String desc) {
            this.desc = Integer.parseInt(desc);
            return this;
        }

        public Builder photo(String photo) {
            this.photo = Integer.parseInt(photo);
            return this;
        }

        public Builder price(String price) {
            this.price = Integer.parseInt(price);
            return this;
        }

        public Builder amount(String amount) {
            this.amount = Integer.parseInt(amount);
            return this;
        }

        public Product build() {
            return new Product(id, name, desc, photo, price, amount);
        }
    }
}
