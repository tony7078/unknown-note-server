package unknownnote.unknownnoteserver.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.sql.Timestamp;

@AllArgsConstructor
@Setter
@Getter
public class RecentGraph {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "UTC")
    private Timestamp date;
    private double value;
}
