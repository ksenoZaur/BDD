package com.ksenoZaur;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.То;

import java.util.ArrayList;

public class MyStepdefs {

    Generator generator;

    @Допустим("^Я имею класс генератор$")
    public void яИмеюКлассГенератор() {

        this.generator = new Generator();

    }

    @Когда("^Я выбираю паттерн$")
    public void яВыбираюПаттерн() {

        this.generator.getPatterns();

    }

    @То("^Я просматриваю список с доступными паттернами$")
    public void яПросматриваюСписокСДоступнымиПаттернами() {

    }

    @Когда("^Я выбираю язык$")
    public void яВыбираюЯзык() {

    }

    @То("^я просматриваю список с доступными языками$")
    public void яПросматриваюСписокСДоступнымиЯзыками() {

    }
}
