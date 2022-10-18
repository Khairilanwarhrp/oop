public class personberaksi {
    public static void main(String[]args){
        person personku = new person();
        
        personku.nama ="anton";
        personku.jeniskelamin ="laki laki"; 
        personku.umur =25;
        System.out.println("nama :" + personku.nama);
        System.out.println("jenis kelamin :" + personku.jeniskelamin);
        System.out.println("umur :" + personku.umur);

        personku.nama ="riko";
        personku.jeniskelamin ="laki laki"; 
        personku.umur =20;
        System.out.println("nama :" + personku.nama);
        System.out.println("jenis kelamin :" + personku.jeniskelamin);
        System.out.println("umur :" + personku.umur);


        
    }
}
