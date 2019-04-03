package com.ksenoZaur;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.То;
import cucumber.runtime.junit.Assertions;
import org.junit.Assert;

import java.util.List;

public class MyStepdefs {

    Generator generator;
    List<String> patterns;
    List<String> languages;

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

        patterns = this.generator.getPatterns();

    }


    @Когда("^Я выбираю язык$")
    public void яВыбираюЯзык() {

        this.generator.getLanguages();

    }

    @То("^я просматриваю список с доступными языками$")
    public void яПросматриваюСписокСДоступнымиЯзыками() {

        languages = this.generator.getLanguages();

    }
}