/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoalukl4b;

/**
 *
 * @author MOKLET-2
 */
public class LatihanSoalUKL4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaiPertama = 5; //nilai dari suku pertama
        int nilaiTerakhir = 75;//nilai untuk suku terakhir
        int selisih = 5; //nilai beda tiap sukunya
        int updateNilai; //untuk update nilai
        
        for (int j = 0; j < 5; j++){ //membuat perulangan vertikal
            for (int k = j; k < 5; k++){ //membuat perulangan horizontal
                
                updateNilai = nilaiPertama;
                nilaiPertama += selisih;
                
                System.out.print(updateNilai + " ");
                
            }
            System.out.println (" ");
        }
    }
    
}
