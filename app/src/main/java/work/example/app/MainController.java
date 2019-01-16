package work.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.*;
import java.util.Optional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class MainController {
    @Autowired
    private CarteRepository carteRepository;
    @Autowired
    private MonitorRepository monitorRepository;
    @Autowired
    private PlacaVideoRepository placaVideoRepository;
    @Autowired
    private MouseRepository mouseRepository;
    @Autowired
    private ScaunRepository scaunRepository;
    @Autowired
    private FacturaRepository facturaRepository;
    @Autowired
    private DetaliuFacturaRepository detaliuFacturaRepository;
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path="/add",method = RequestMethod.POST)
    public @ResponseBody
    String addNewBook (@RequestBody RequestCarte requestCarte) {

        Carte c = new Carte();
        c.setNume(requestCarte.getNume());
        c.setAutor(requestCarte.getAutor());
        c.setNumarPagini(requestCarte.getNumarPagini());
        c.setPret(requestCarte.getPret());
        c.setLink(requestCarte.getLink());
        c.setRating(0);
        carteRepository.save(c);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Carte> getAllBooks() {
        // This returns a JSON or XML with the users
        return carteRepository.findAll();
    }
    
    @GetMapping(path="/findBook")
    public @ResponseBody
    Optional<Carte> getBook(@RequestParam Integer id) {
        // This returns a JSON or XML with the users
        return carteRepository.findById(id);
    }
    
    @GetMapping(path="/findBookIncreaseRating")
    public @ResponseBody
    Optional<Carte> increaseBookRating(@RequestParam Integer id) {
         carteRepository.increaseBookRating(id);
         return carteRepository.findById(id);
    }
    
    @GetMapping(path="/findUpdateBook")
    public @ResponseBody
    Optional<Carte> modifyBook(@RequestParam Integer id, @RequestParam String nume, @RequestParam String autor, @RequestParam Integer numarPagini, @RequestParam Double pret, @RequestParam String link) {
        carteRepository.modifyBook(id,nume,autor,numarPagini,pret,link);
        return carteRepository.findById(id);
    }
    
    @RequestMapping(path="/addMonitor",method = RequestMethod.POST)
    public @ResponseBody
    String addNewMonitor (@RequestBody RequestMonitor requestMonitor) {

        Monitor m = new Monitor();
        m.setNume(requestMonitor.getNume());
        m.setProducator(requestMonitor.getProducator());
        m.setSerie(requestMonitor.getSerie());
        m.setRezolutie(requestMonitor.getRezolutie());
        m.setDiagonala(requestMonitor.getDiagonala());
        m.setNumarFPS(requestMonitor.getNumarFPS());
        m.setPret(requestMonitor.getPret());
        m.setLink(requestMonitor.getLink());
        m.setRating(0);
        monitorRepository.save(m);
        return "Saved";
    }

    @GetMapping(path="/allMonitors")
    public @ResponseBody Iterable<Monitor> getAllMonitors() {
        return monitorRepository.findAll();
    }
    
    @GetMapping(path="/findMonitor")
    public @ResponseBody
    Optional<Monitor> getMonitor(@RequestParam Integer id) {
        // This returns a JSON or XML with the users
        return monitorRepository.findById(id);
    }

    @GetMapping(path="/findMonitorIncreaseRating")
    public @ResponseBody
    Optional<Monitor> increaseMonitorRating(@RequestParam Integer id) {
        monitorRepository.increaseMonitorRating(id);
        return monitorRepository.findById(id);
    }
    
    @GetMapping(path="/findUpdateMonitor")
    public @ResponseBody
    Optional<Monitor> modifyMonitor(@RequestParam Integer id,
                                    @RequestParam String nume,
                                    @RequestParam String producator,
                                    @RequestParam String serie,
                                    @RequestParam String rezolutie,
                                    @RequestParam Integer diagonala,
                                    @RequestParam Integer numarFPS,
                                    @RequestParam Double pret,
                                    @RequestParam String link) {
        monitorRepository.modifyMonitor(id,nume,producator,serie,rezolutie,diagonala,numarFPS,pret,link);
        return monitorRepository.findById(id);
    }
    
    @RequestMapping(path="/addPlacaVideo",method = RequestMethod.POST)
    public @ResponseBody
    String addNewPlacaVideo (@RequestBody RequestPlacaVideo requestPlacaVideo) {

        PlacaVideo pv = new PlacaVideo();
        pv.setNume(requestPlacaVideo.getNume());
        pv.setProducator(requestPlacaVideo.getProducator());
        pv.setSerie(requestPlacaVideo.getSerie());
        pv.setMemorie(requestPlacaVideo.getMemorie());
        pv.setFrecventa(requestPlacaVideo.getFrecventa());
        pv.setSlot(requestPlacaVideo.getConector());
        pv.setPret(requestPlacaVideo.getPret());
        pv.setLink(requestPlacaVideo.getLink());
        pv.setRating(0);
        placaVideoRepository.save(pv);
        return "Saved";
    }

    @GetMapping(path="/allPlaciVideo")
    public @ResponseBody Iterable<PlacaVideo> getAllPlaciVideo() {
        return placaVideoRepository.findAll();
    }
    
    @GetMapping(path="/findPlacaVideo")
    public @ResponseBody
    Optional<PlacaVideo> getPlacaVideo(@RequestParam Integer id) {
        // This returns a JSON or XML with the users
        return placaVideoRepository.findById(id);
    }

    @GetMapping(path="/findPlacaVideoIncreaseRating")
    public @ResponseBody
    Optional<PlacaVideo> increasePlacaVideoRating(@RequestParam Integer id) {
        placaVideoRepository.increaseVideoRating(id);
        return placaVideoRepository.findById(id);
    }
    
    @GetMapping(path="/findUpdateVideo")
    public @ResponseBody
    Optional<PlacaVideo> modifyPlacaVIdeo(@RequestParam Integer id,
                                @RequestParam String nume,
                                @RequestParam String producator,
                                @RequestParam String serie,
                                @RequestParam String memorie,
                                @RequestParam Integer frecventa,
                                @RequestParam String slot,
                                @RequestParam Double pret,
                                @RequestParam String link) {
        placaVideoRepository.modifyPlacaVideo(id,nume,producator,serie,memorie,frecventa,slot,pret,link);
        return placaVideoRepository.findById(id);
    }
    
   @RequestMapping(path="/addMouse",method = RequestMethod.POST)
    public @ResponseBody
    String addNewMouse (@RequestBody RequestMouse requestMouse) {

        Mouse ms = new Mouse();
        ms.setNume(requestMouse.getNume());
        ms.setProducator(requestMouse.getProducator());
        ms.setSerie(requestMouse.getSerie());
        ms.setDpi(requestMouse.getDpi());
        ms.setNumarButoane(requestMouse.getNumarButoane());
        ms.setAmbidextru(requestMouse.getAmbidextru());
        ms.setPret(requestMouse.getPret());
        ms.setLink(requestMouse.getLink());
        ms.setRating(0);
        mouseRepository.save(ms);
        return "Saved";
    }

    @GetMapping(path="/allMouse")
    public @ResponseBody Iterable<Mouse> getAllMouse() {
        return mouseRepository.findAll();
    }
    
    @GetMapping(path="/findMouse")
    public @ResponseBody
    Optional<Mouse> getMouse(@RequestParam Integer id) {
        // This returns a JSON or XML with the users
        return mouseRepository.findById(id);
    }

    @GetMapping(path="/findMouseIncreaseRating")
    public @ResponseBody
    Optional<Mouse> increaseMouseRating(@RequestParam Integer id) {
        mouseRepository.increaseMouseRating(id);
        return mouseRepository.findById(id);
    }
    
    @GetMapping(path="/findUpdateMouse")
    public @ResponseBody
    Optional<Mouse> modifyMouse(@RequestParam Integer id,
                                    @RequestParam String nume,
                                    @RequestParam String producator,
                                    @RequestParam String serie,
                                    @RequestParam Integer dpi,
                                    @RequestParam Integer numarButoane,
                                    @RequestParam String ambidextru,
                                    @RequestParam Double pret,
                                    @RequestParam String link) {
        mouseRepository.modifyMouse(id,nume,producator,serie,dpi,numarButoane,ambidextru,pret,link);
        return mouseRepository.findById(id);
    }
    
    @RequestMapping(path="/addScaun",method = RequestMethod.POST)
    public @ResponseBody
    String addNewScaun (@RequestBody RequestScaun requestScaun) {

        Scaun s = new Scaun();
        s.setNume(requestScaun.getNume());
        s.setProducator(requestScaun.getProducator());
        s.setSerie(requestScaun.getSerie());
        s.setGreutateMaxima(requestScaun.getGreutateMaxima());
        s.setNiveleInaltime(requestScaun.getNiveleInaltime());
        s.setPret(requestScaun.getPret());
        s.setLink(requestScaun.getLink());
        s.setRating(0);
        scaunRepository.save(s);
        return "Saved";
    }

    @GetMapping(path="/allScaune")
    public @ResponseBody Iterable<Scaun> getAllScaune() {
        return scaunRepository.findAll();
    }
    
    @GetMapping(path="/findScaun")
    public @ResponseBody
    Optional<Scaun> getScaun(@RequestParam Integer id) {
        // This returns a JSON or XML with the users
        return scaunRepository.findById(id);
    }

    @GetMapping(path="/findScaunIncreaseRating")
    public @ResponseBody
    Optional<Scaun> increaseScaunRating(@RequestParam Integer id) {
        scaunRepository.increaseChairRating(id);
        return scaunRepository.findById(id);
    }
    
    @GetMapping(path="/findUpdateScaun")
    public @ResponseBody
    Optional<Scaun> modifyScaun(@RequestParam Integer id,
                                          @RequestParam String nume,
                                          @RequestParam String producator,
                                          @RequestParam String serie,
                                          @RequestParam Integer greutateMaxima,
                                          @RequestParam Integer niveleInaltime,
                                          @RequestParam Double pret,
                                          @RequestParam String link) {
        scaunRepository.modifyScaun(id,nume,producator,serie,greutateMaxima,niveleInaltime,pret,link);
        return scaunRepository.findById(id);
    }
    
    @RequestMapping(path="/addFactura",method = RequestMethod.POST)
    public @ResponseBody
    String addNewFactura (@RequestBody RequestFactura requestFactura) {

        String timeStamp = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
        Factura f = new Factura();
        f.setDataFactura(timeStamp);
        f.setTotalFactura(requestFactura.getTotalFactura());
        f.setReferintaInterna(new Random().nextLong());
        f.setUserRef(requestFactura.getUserRef());
        facturaRepository.save(f);
        for (DetaliuFactura df: requestFactura.getDetaliiFactura()) {
            DetaliuFactura detaliuFactura = new DetaliuFactura();
            detaliuFactura.setNume(df.getNume());
            detaliuFactura.setPret(df.getPret());
            detaliuFactura.setIdFacturaParinte(f.getReferintaInterna());
            detaliuFacturaRepository.save(detaliuFactura);
        }
        return "Saved";
    }

    @GetMapping(path="/allFacturi")
    public @ResponseBody Iterable<Factura> getAllFacturi() {
        return facturaRepository.findAll();
    }
    
    @GetMapping(path="/allDetaliiFacturi")
    public @ResponseBody Iterable<DetaliuFactura> getAllDetaliiFacturi() {
        return detaliuFacturaRepository.getDetaliiFacturaQuery();
    }
    
    @GetMapping(path="/allDataFacturi")
    public @ResponseBody Iterable<ResponseFactura> getAllDataFacturi(@RequestParam Integer idUserCurent) {
        List<Factura> listFactura = facturaRepository.getFacturiQuesry();
        List<DetaliuFactura> listDetaliuFactura = detaliuFacturaRepository.getDetaliiFacturaQuery();
        List<ResponseFactura> facturiResponseList = new ArrayList<>();
        Map<Long, List<DetaliuFactura> > sortMap = new HashMap<>();
        for(int i=0;i<listFactura.size();i++){
            List<DetaliuFactura> tmpDetList = new ArrayList<>();
            for(int j=0;j<listDetaliuFactura.size();j++){
                if(listDetaliuFactura.get(j).getIdFacturaParinte().equals(listFactura.get(i).getReferintaInterna())){
                    tmpDetList.add(listDetaliuFactura.get(j));
                }
            }
            sortMap.put(listFactura.get(i).getReferintaInterna(),tmpDetList);
        }
        User currentUser = userRepository.getOneUserByID(idUserCurent).get(0);
        for(int i = 0;i<listFactura.size();i++){
            ResponseFactura tmpResponseFacutra = new ResponseFactura(
                    listFactura.get(i).getId(),
                    listFactura.get(i).getDataFactura(),
                    listFactura.get(i).getTotalFactura(),
                    currentUser,
                    sortMap.get(listFactura.get(i).getReferintaInterna())
            );
            if(listFactura.get(i).getUserRef().equals(currentUser.getId())) facturiResponseList.add(tmpResponseFacutra);
        }

        return facturiResponseList;
    }
    
    @RequestMapping(path="/addUser",method = RequestMethod.POST)
    public @ResponseBody
    Integer addNewSUser (@RequestBody RequestUser requestUser) {

        List<User> allUsers = userRepository.getUsersQuery();
        Boolean isUserAlreadyRegistered = false;
        for(int i=0;i<allUsers.size();i++){
            if(requestUser.getEmail().equals(allUsers.get(i).getEmail())){
                isUserAlreadyRegistered = true;
            }
        }
        if(isUserAlreadyRegistered){
            return 1;
        }
        else{
            User u = new User();
            u.setNume(requestUser.getNume());
            u.setAdresa(requestUser.getAdresa());
            u.setEmail(requestUser.getEmail());
            u.setParola(requestUser.getParola());
            u.setRole("Client");
            userRepository.save(u);
            return 0;
        }
    }

    @GetMapping(path="/findUser")
    public @ResponseBody
    Optional<User> getUser(@RequestParam String email, @RequestParam String parola) {
        List<User> allUsers = userRepository.getUsersQuery();
        User requiredUser = null;
        for(int i=0;i<allUsers.size();i++){
            if(email.equals(allUsers.get(i).getEmail()) && parola.equals(allUsers.get(i).getParola())){
                requiredUser = allUsers.get(i);
            }
        }
        if(requiredUser != null) return userRepository.findById(requiredUser.getId());
        else return null;
    }

    @GetMapping(path="/findUpdateUser")
    public @ResponseBody
    void modifyUser(@RequestParam Integer id,
                                @RequestParam String nume,
                                @RequestParam String adresa,
                                @RequestParam String email,
                                @RequestParam String parola
                            ) {
        userRepository.modifyUser(id,nume,adresa,email,parola);
    }
    
    @GetMapping(path="/searchCarte")
    public @ResponseBody Iterable<Carte> searchCarte(@RequestParam String nume) {
        return carteRepository.searchCarteByName(nume);
    }

    @GetMapping(path="/searchMonitor")
    public @ResponseBody Iterable<Monitor> searchMonitor(@RequestParam String nume) {
        return monitorRepository.searchMonitorByName(nume);
    }

    @GetMapping(path="/searchPlacaVideo")
    public @ResponseBody Iterable<PlacaVideo> searchPlacaVideo(@RequestParam String nume) {
        return placaVideoRepository.searchPlacaVideoByName(nume);
    }

    @GetMapping(path="/searchMouse")
    public @ResponseBody Iterable<Mouse> searchMouse(@RequestParam String nume) {
        return mouseRepository.searchMouseByName(nume);
    }

    @GetMapping(path="/searchScaun")
    public @ResponseBody Iterable<Scaun> searchScaun(@RequestParam String nume) {
        return scaunRepository.searchScaunByName(nume);
    }
}
