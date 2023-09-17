package com.kuzmin.course;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
   // private ClassicalMusic(){}//Конструктор с ограничиенным доступом. Используется в случае
    //применения factory-metod. Такой конструктор не дает создавать объекты используя new, надо использовать только метод

   /* public ClassicalMusic getClassicalMusic() {// factory-metod вызываемый из xml-файла
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }*/
    @Override
    public String getSong(){
        return "Hungarian Rhapsody";
    }
}
