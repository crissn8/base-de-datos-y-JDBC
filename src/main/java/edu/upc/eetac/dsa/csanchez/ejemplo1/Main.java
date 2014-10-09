package edu.upc.eetac.dsa.csanchez.ejemplo1;

import edu.upc.eetac.dsa.csanchez.ejemplo1.MySQLAccess;

public class Main {
  public static void main(String[] args) throws Exception {
    MySQLAccess dao = new MySQLAccess();
    dao.readDataBase();
  }

} 