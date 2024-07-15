package org.anderson.curso_ada.structural.composite.example1;

import org.anderson.curso_ada.structural.composite.example1.model.Archive;
import org.anderson.curso_ada.structural.composite.example1.model.FileSystemItem;
import org.anderson.curso_ada.structural.composite.example1.model.Folder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileSystemItem item1 = new Archive("archive 1");
        FileSystemItem item2 = new Archive("archive 2");
        FileSystemItem item3 = new Archive("archive 3");
        FileSystemItem item4 = new Archive("archive 4");

        FileSystemItem folder1 = new Folder("sf1", Arrays.asList(item1));
        FileSystemItem folder2 = new Folder("sf2", Arrays.asList(item2, folder1));
        FileSystemItem folder = new Folder("folder", Arrays.asList(folder2, item3, item4));

        folder.print("");
    }
}
