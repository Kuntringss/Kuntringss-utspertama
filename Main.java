class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs(username:"ini_username", pasword: "ini_pasword" );

        mhs.SetNama(nama:"Genta Aryana");
        mhs.SetNim(nim"A123");
        mhs.SetSmt(smt:2);

        System.out.println("Nama Mhs: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getUsername());
        System.out.println("Username: " + mhs.getUsername());
        System.out.println("Password : " + mhs.getPassword());
    }
}