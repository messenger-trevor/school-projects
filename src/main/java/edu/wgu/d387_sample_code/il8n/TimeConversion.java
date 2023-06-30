package edu.wgu.d387_sample_code.il8n;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Repository
public class TimeConversion {
    DateTimeFormatter ET = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma 'ET'");
    DateTimeFormatter MT = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma 'MT'");
    DateTimeFormatter UTC = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma 'UTC'");
    ZonedDateTime zonedDateTime;
    ZonedDateTime ETZoneDateTime;
    ZonedDateTime MTZoneDateTime;
    ZonedDateTime UTCZoneDateTime;

    public TimeConversion() {
        this.zonedDateTime = ZonedDateTime.now();
        this.ETZoneDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        this.MTZoneDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Denver"));
        this.UTCZoneDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));

    }
    public String getTimes() {
        String concatTimes = "";
        String tempETString = ETZoneDateTime.format(ET);
        String tempMTString = MTZoneDateTime.format(MT);
        String tempUTCString = UTCZoneDateTime.format(UTC);
        concatTimes = "The next online live presentation is at: " + tempMTString + ", " +  tempETString  + ", or " + tempUTCString;
        return concatTimes;
    }
}
