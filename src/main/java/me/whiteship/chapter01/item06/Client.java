package me.whiteship.chapter01.item06;

import me.whiteship.chapter01.item01.Character;
import me.whiteship.chapter01.item01.FontFactory;

public class Client {
  public static void main(String[] args) {
    FontFactory fontFactory = new FontFactory();
    Character character = new Character('h', "white", fontFactory.getFont("nanum:12"));
    Character character2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
    Character character3 = new Character('l', "white", fontFactory.getFont("nanum:12"));
  }
}
