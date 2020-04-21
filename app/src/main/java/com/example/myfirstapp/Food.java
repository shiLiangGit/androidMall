package com.example.myfirstapp;

public class Food {

    private Integer price;
    private String name;
    private Integer pic;
    private boolean hot;
    private boolean fish;
    private boolean suan;

    public Food(String name,Integer price,Integer pic, boolean suan, boolean fish, boolean hot) {
        this.setName(name);
        this.setPic(pic);
        this.setPrice(price);
        this.setSuan(suan);
        this.setFish(fish);
        this.setHot(hot);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getPic() {
        return pic;
    }

    private void setPic(Integer pic) {
        this.pic = pic;
    }
    public Integer getPrice() {
        return price;
    }

    private void setPrice(Integer price) {
        this.price = price;
    }

    public boolean getSuan() {
        return suan;
    }

    private void setSuan(boolean suan) {
        this.suan = suan;
    }

    public boolean getFish() {
        return fish;
    }

    private void setFish(boolean fish) {
        this.fish = fish;
    }

    public boolean getHot() {
        return hot;
    }

    private void setHot(boolean hot) {
        this.hot = hot;
    }







}
