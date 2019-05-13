package dk.askou.foto.fileextension;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

public class SimpleFileVisitorDefault extends SimpleFileVisitor {

    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {


        Objects.requireNonNull(file);
        Objects.requireNonNull(attrs);


        Path sti = (Path) file;
//        System.out.println(sti.toString());
        if (sti.toString().endsWith(".jpg") || sti.toString().endsWith(".pid")  || sti.toString().endsWith(".ico")) {
            System.out.println(sti.toString());
        }
        return FileVisitResult.CONTINUE;
    }


    @Override
    public FileVisitResult visitFileFailed(Object file, IOException exc)
            throws IOException {
        return FileVisitResult.CONTINUE;
    }

}
