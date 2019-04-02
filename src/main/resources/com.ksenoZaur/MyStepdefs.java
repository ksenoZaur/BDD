package com.ksenoZaur;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;

public class MyStepdefs {

    PatternGenerator gen;

    @Допустим("^Я имею класс генератор$")
    public void яИмеюКлассГенератор() {
        this.gen = PatternGenerator();
    }

    @Когда("^Я выбираю паттерн, я просматриваю список с доступными паттернами$")
    public void яВыбираюПаттернЯПросматриваюСписокСДоступнымиПаттернами() {
    }

    @Когда("^Я выбираю язык, я просматриваю список с доступными языками$")
    public void яВыбираюЯзыкЯПросматриваюСписокСДоступнымиЯзыками() {

    }
}
