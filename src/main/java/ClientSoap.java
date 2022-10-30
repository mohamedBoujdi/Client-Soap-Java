import me.boujdi.proxy.BanqueService;
import me.boujdi.proxy.BanqueWS;

public class ClientSoap {
    public static void main(String[] args) {
        //create a service
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        //call the service
        System.out.println(stub.convert(100));
        System.out.println(stub.consulterCompte(1).getSolde());
        stub.listComptes().forEach(a-> System.out.println(a.getCode()+" " +
                ""+ a.getClient().getNom()+" "+a.getSolde()));

    }
}
