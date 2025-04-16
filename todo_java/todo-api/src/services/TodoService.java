package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utilities.DBHelper;

public class TodoService {

    public static List<Map<String, Object>> getTodos() {

        String qry = "SELECT * FROM todo";

        return DBHelper.executeQuery(qry, rs -> {
            List<Map<String, Object>> todos = new ArrayList<>();
            try {

                while (rs.next()) {
                    Map<String, Object> todo = new HashMap<>();

                    todo.put("id", rs.getInt("id"));
                    todo.put("name", rs.getString("name"));
                    todo.put("priority", rs.getString("priority"));
                    todos.add(todo);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return todos;
        });

    }

    public static Map<String, Object> getTodo(int id) {
        return DBHelper.executeQuery("SELECT * FROM todos WHERE id = " + id, rs -> {
            try {
                if (rs.next()) {
                    Map<String, Object> todo = new HashMap<>();
                    todo.put("id", rs.getInt("id"));
                    todo.put("name", rs.getString("name"));
                    todo.put("priority", rs.getString("priority"));
                    return todo;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        });
    }

    public static Map<String, Object> addTodo(int id, String name, String priority) {

        String sql = "INSERT INTO todo (name,priority) values (?,?)";
        int generatedId = DBHelper.executeUpdate(sql, stmt -> {
            stmt.setString(1, name);
            stmt.setString(2, priority);
        });
        if (generatedId != -1) {
            return getTodo(generatedId);
        }
        return null;
    }

    public static Map<String, Object> updateTodoStat(int id, Boolean is_completed, String name, String priority) {

        String sql = "UPDATE todo SET is_completed = ? , name = ? , priority = ?  WHERE id = ? ";

        DBHelper.executeUpdate(sql, stmt -> {
            stmt.setBoolean(1, is_completed);
            stmt.setString(2, name);
            stmt.setString(3, priority);
            stmt.setInt(4, id);
        });

        return getTodo(id);
    }

    public static Boolean deleteTodo(int id) {
        String stmt = "DELETE FROM todo WHERE id = ?";
        int affected =  DBHelper.executeUpdate(stmt, null);
        return affected > 0;
    }

}
