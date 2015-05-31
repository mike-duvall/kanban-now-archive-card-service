package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArchivedCardController {

    @RequestMapping("/archivedCards")
    public List<ArchivedCard> archivedCard() {
        List<ArchivedCard> archivedCardList = new ArrayList<ArchivedCard>();
        ArchivedCard card1 = new ArchivedCard();
        card1.setText("Take Claritin");
        card1.setDate("5/31/2105");
        archivedCardList.add(card1);

        ArchivedCard card2 = new ArchivedCard();
        card2.setText("Save the whales");
        card2.setDate("5/31/2105");
        archivedCardList.add(card2);

        return archivedCardList;
    }
    
}
