//
//// temporarily stop updating DB
//
//package com.example.SimpleTokyoDomeCalculator.init;
//
//import com.example.SimpleTokyoDomeCalculator.controller.PlaceController;
//import com.example.SimpleTokyoDomeCalculator.domain.Place;
//import com.example.SimpleTokyoDomeCalculator.repository.PlaceRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//
//    private final PlaceRepository placeRepository;
//
//    public DataLoader(PlaceRepository placeRepository) {
//        this.placeRepository = placeRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Place imperialPalace = new Place("皇居", 1150436);
//        imperialPalace.setResult(PlaceController.calcResult(imperialPalace));
//        placeRepository.save(imperialPalace);
//
//        Place tokyoStation = new Place("東京駅", 182000);
//        tokyoStation.setResult(PlaceController.calcResult(tokyoStation));
//        placeRepository.save(tokyoStation);
//
//        Place disneyLand = new Place("ディズニーランド", 510000);
//        disneyLand.setResult(PlaceController.calcResult(disneyLand));
//        placeRepository.save(disneyLand);
//
//        Place saitamaArena= new Place("さいたまスーパーアリーナ", 43730);
//        saitamaArena.setResult(PlaceController.calcResult(saitamaArena));
//        placeRepository.save(saitamaArena);
//
//        Place taitoWard= new Place("台東区", (int)10.08*1000*1000);
//        taitoWard.setResult(PlaceController.calcResult(taitoWard));
//        placeRepository.save(taitoWard);
//
//        Place uenoPark= new Place("上野公園", 530000);
//        uenoPark.setResult(PlaceController.calcResult(uenoPark));
//        placeRepository.save(uenoPark);
//
//        Place centralPark= new Place("Central Park", (4000*800));
//        centralPark.setResult(PlaceController.calcResult(centralPark));
//        placeRepository.save(centralPark);
//
//        Place hydePark= new Place("Hyde Park", 1416000);
//        hydePark.setResult(PlaceController.calcResult(hydePark));
//        placeRepository.save(hydePark);
//
//        Place forbiddenCity= new Place("紫禁城(The Forbidden City)", 720000);
//        forbiddenCity.setResult(PlaceController.calcResult(forbiddenCity));
//        placeRepository.save(forbiddenCity);
//
//        Place madisonSquareGarden = new Place("Madison Square Garden (NY)", 76000);
//        madisonSquareGarden.setResult(PlaceController.calcResult(madisonSquareGarden));
//        placeRepository.save(madisonSquareGarden);
//
//        Place wembleyStadium = new Place("Wembley Stadium (approx.)", 103000);
//        wembleyStadium.setResult(PlaceController.calcResult(wembleyStadium));
//        placeRepository.save(wembleyStadium);
//
////        Place yokohamaArena= new Place("横浜アリーナ", 45800.0);
////        yokohamaArena.setResult(PlaceController.calcResult(yokohamaArena));
////        placeRepository.save(yokohamaArena);
//
////        Place miyagiBbPark= new Place("宮城球場（楽天生命パーク宮城)", 13351.83);
////        miyagiBbPark.setResult(PlaceController.calcResult(miyagiBbPark));
////        placeRepository.save(miyagiBbPark);
//
//
//    }
//}
