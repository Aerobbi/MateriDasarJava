import java.util.Scanner;

 public class TebakUltah2 {
 public static void main(String[] args) {
 String set1 =
 " 1 3 5 7\n" +
 " 9 11 13 15\n" +
 "17 19 21 23\n" +
 "25 27 29 31";

 String set2 =
 " 2 3 6 7\n" +
 "10 11 14 15\n" +
 "18 19 22 23\n" +
 "26 27 30 31";

 String set3 =
 " 4 5 6 7\n" +
 "12 13 14 15\n" +
 "20 21 22 23\n" +
 "28 29 30 31";

 String set4 =
 " 8 9 10 11\n" +
 "12 13 14 15\n" +
 "24 25 26 27\n" +
 "28 29 30 31";

 String set5 =
 "16 17 18 19\n" +
 "20 21 22 23\n" +
 "24 25 26 27\n" +
 "28 29 30 31";
 
 int hari = 0;
 
 // Menciptakan Scanner
 Scanner masukan = new Scanner(System.in);

 // Meminta pengguna memberikan jawaban
 System.out.print("Apakah Ultah Anda dalam Set1?\n");
 System.out.print(set1);
 System.out.print("\nMasukkan 0 bila Tidak dan 1 bila Ya: ");
 int jawab = masukan.nextInt();
 
 if (jawab == 1)
 	hari += 1;
 
 // Meminta pengguna memberikan jawaban
 System.out.print("Apakah Ultah Anda dalam Set2?\n");
 System.out.print(set2);
 System.out.print("\nMasukkan 0 bila Tidak dan 1 bila Ya: ");
 int jawab = masukan.nextInt();
 
 if (jawaban == 1)
 	hari += 2;

// Meminta pengguna memberikan jawaban
 System.out.print("Apakah Ultah Anda dalam Set3?\n");
 System.out.print(set3);
 System.out.print("\nMasukkan 0 bila Tidak dan 1 bila Ya: ");
 int jawab = masukan.nextInt();
 
 if (jawab == 1)
 	hari += 4;
 
 // Meminta pengguna memberikan jawaban
 System.out.print("Apakah Ultah Anda dalam Set4?\n");
 System.out.print(set4);
 System.out.print("\nMasukkan 0 bila Tidak dan 1 bila Ya: ");
 int jawab = masukan.nextInt();
 
 if (jawab == 1)
 	hari += 8;
 	
  // Meminta pengguna memberikan jawaban
 System.out.print("Apakah Ultah Anda dalam Set5?\n");
 System.out.print(set5);
 System.out.print("\nMasukkan 0 bila Tidak dan 1 bila Ya: ");
 int jawab = masukan.nextInt();
 
 if (jawab == 1)
 	hari += 16;
 
 System.out.println("\nHari Ulang Tahun Anda adalah " + hari + "!");
 }
 }