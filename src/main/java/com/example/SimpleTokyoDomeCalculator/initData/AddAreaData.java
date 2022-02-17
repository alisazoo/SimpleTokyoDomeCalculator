package com.example.SimpleTokyoDomeCalculator.initData;

import com.example.SimpleTokyoDomeCalculator.controller.PlaceController;
import com.example.SimpleTokyoDomeCalculator.domain.Place;
import com.example.SimpleTokyoDomeCalculator.repository.PlaceRepository;
import com.sun.xml.bind.v2.runtime.reflect.Lister;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AddAreaData implements CommandLineRunner {

    private final PlaceRepository placeRepository;

    public AddAreaData(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Place imperialPalace = new Place("皇居", 1150436.87);
        imperialPalace.setResult(PlaceController.calcResult(imperialPalace));
        placeRepository.save(imperialPalace);

        Place tokyoStation = new Place("東京駅", 182000.0);
        tokyoStation.setResult(PlaceController.calcResult(tokyoStation));
        placeRepository.save(tokyoStation);

        Place saitamaArena= new Place("さいたまスーパーアリーナ", 43730.0);
        saitamaArena.setResult(PlaceController.calcResult(saitamaArena));
        placeRepository.save(saitamaArena);

        Place yokohamaArena= new Place("横浜アリーナ", 45800.0);
        yokohamaArena.setResult(PlaceController.calcResult(yokohamaArena));
        placeRepository.save(yokohamaArena);

        Place miyagiBbPark= new Place("宮城球場（楽天生命パーク宮城)", 13351.83);
        miyagiBbPark.setResult(PlaceController.calcResult(miyagiBbPark));
        placeRepository.save(miyagiBbPark);

        Place forbiddenCity= new Place("紫禁城(The Forbidden City)", 720000.0);
        forbiddenCity.setResult(PlaceController.calcResult(forbiddenCity));
        placeRepository.save(forbiddenCity);

        Place madisonSquareGarden = new Place("Madison Square Garden (NY)", 76000.0);
        madisonSquareGarden.setResult(PlaceController.calcResult(madisonSquareGarden));
        placeRepository.save(madisonSquareGarden);

        Place wembleyStadium = new Place("Wembley Stadium (105m x 68m)", (105.0*68));
        wembleyStadium.setResult(PlaceController.calcResult(wembleyStadium));
        placeRepository.save(wembleyStadium);

//        埼玉スタジアム 52635

    }
}
