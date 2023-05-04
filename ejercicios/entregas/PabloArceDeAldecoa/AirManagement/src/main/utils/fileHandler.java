package main.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class fileHandler {
    private List<String> lines;
    public fileHandler(){
        this.lines = new ArrayList<>();
    }

    public List<String> load(String path) throws IOException {

        if(path == null || path.length() < 1){
            System.err.println("Not valid name");
            return null;
        }
        BufferedReader input = null;

        File file = new File(path);
        if (!file.exists()){
            System.err.println("file not found");
        }

        try {
            input = new BufferedReader(new FileReader(file));

            while (input.ready()){
                String line = input.readLine();
                this.lines.add(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (input != null){
            try{
                input.close();
            } catch (IOException e){
                throw new RuntimeException(e);
            }
        }

    return this.lines;
    }
}
