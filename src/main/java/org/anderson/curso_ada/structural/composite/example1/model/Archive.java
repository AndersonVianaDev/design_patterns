package org.anderson.curso_ada.structural.composite.example1.model;

public class Archive implements FileSystemItem {

    private String name;

    public Archive(String name) {
        this.name = name;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
    }
}
