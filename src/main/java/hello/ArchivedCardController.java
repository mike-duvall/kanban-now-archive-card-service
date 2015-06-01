package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class ArchivedCardController {


    @RequestMapping("/archivedCards")
    public List<ArchivedCard> archivedCard() {
        List<ArchivedCard> archivedCardList = new ArrayList<ArchivedCard>();
        ArchivedCard card1 = new ArchivedCard();

        String todayDateAsString = getTodayDateAsString();

        card1.setText("Take Claritin");
        card1.setDate(todayDateAsString);
        archivedCardList.add(card1);

        ArchivedCard card2 = new ArchivedCard();
        card2.setText("Save the whales");
        card2.setDate(todayDateAsString);
        archivedCardList.add(card2);

        return archivedCardList;
    }

    public String getTodayDateAsString() {
        DateFormat df = new SimpleDateFormat("M/d/yyyy");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }
}
