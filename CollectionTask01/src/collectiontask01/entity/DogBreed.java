/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiontask01.entity;

/**
 *
 * @author Exequiel Hordt
 * @version 29 Sep 2022
 */
public class DogBreed {

    private String name;
    private int age;
    private String nickname;
    private String breed;

    public DogBreed() {
    }

    public DogBreed(String name, int age, String nickname, String breed) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ". Raza: " + breed;
    }

}
