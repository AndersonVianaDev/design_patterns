package org.anderson.curso_ada.structural.composite.example1.model;

import java.util.List;

public class Folder implements FileSystemItem {

    private String name;
    private List<FileSystemItem> list;

    public Folder(String name, List<FileSystemItem> list) {
        this.name = name;
        this.list = list;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for(FileSystemItem item: list) {
            item.print(structure + "| ");
        }
    }
}
