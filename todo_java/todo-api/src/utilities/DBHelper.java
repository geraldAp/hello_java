package utilities;

import java.sql.ResultSet;
import java.util.function.Function;

public class DBHelper {
    public static <T> T executeQuery(String sql, Function<ResultSet, T> handler) {

    }
}
