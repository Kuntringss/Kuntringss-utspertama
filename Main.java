import pengguna.Mhs;
import pengguna.User;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("Ini_Username", "Ini_Password", " Genta Aryana", "G.111.19.0030", 8);

        // mhs.setNama("Genta Aryana");
        // mhs.setNim("G.111.19.0030");
        // mhs.setSmt(8);

        System.out.println("Nama Mhs : " + mhs.getNama());
        System.out.println("Nim Mhs : " + mhs.getNim());
        System.out.println("Smt Mhs : " + mhs.getSmt());
        System.out.println("Username : " + mhs.getUsername());
        System.out.println("Password : " + mhs.getPassword());

    }
}