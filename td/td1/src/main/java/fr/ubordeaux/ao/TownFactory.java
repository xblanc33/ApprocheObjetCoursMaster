package fr.ubordeaux.ao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TownFactory {
    private BufferedReader br;
    private final String file = "./villes_france.csv";

    public TownFactory() {
        try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("le fichier n'est pas accessible !");
		}
    }
    public Town getNextTown() {
        String line;
		try {
            line = br.readLine();
            if (line == null) return null;

            String[] cells = line.split(",");
            return new Town(cells[4], Integer.parseInt(cells[8].substring(1, cells[10].length()-1) ));
		} catch (IOException e) {
			return null;
        }
    }

    public static void main(String[] args) {
        TownFactory tf = new TownFactory();
        for (int i=0 ; i<36700; i++) {
            System.out.println(tf.getNextTown().toString());
        }
    }
}