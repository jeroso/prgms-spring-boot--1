package com.github.prgrms.userMgnt.common;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Utils {
    public static LocalDateTime convertTime(Timestamp timestamp) {
        return timestamp == null ? null : timestamp.toLocalDateTime();
    }

    public static Timestamp convertStamp(LocalDateTime localDateTime) {
        return localDateTime == null ? null : Timestamp.valueOf(localDateTime);
    }

}
