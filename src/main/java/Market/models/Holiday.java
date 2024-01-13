package Market.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
@RequiredArgsConstructor
@Getter
public enum Holiday {
    NewYear(1,1),
    February23(23,2),
    March8(8,3);

    private final int day;
    private final int month;

}
