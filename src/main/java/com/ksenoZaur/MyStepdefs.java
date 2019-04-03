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

    @И("^список содержит паттерн Adapter$")
    public void списокСодержитПаттернAdapter() {
        Assert.assertEquals("Adapter", this.patterns.get( 0 ));
    }

    @И("^список содержит паттерн Proxy$")
    public void списокСодержитПаттернProxy() {
        Assert.assertEquals("Proxy", this.patterns.get( 1 ));
    }

    @И("^список содержит паттерн Decorator$")
    public void списокСодержитПаттернDecorator() {
        Assert.assertEquals("Decorator", this.patterns.get( 2 ));
    }

    @И("^список содержит паттерн Composite$")
    public void списокСодержитПаттернComposite() {
        Assert.assertEquals("Composite", this.patterns.get( 3 ));
    }


    @Когда("^Я выбираю язык$")
    public void яВыбираюЯзык() {

        this.generator.getLanguages();

    }

    @То("^я просматриваю список с доступными языками$")
    public void яПросматриваюСписокСДоступнымиЯзыками() {

        languages = this.generator.getLanguages();

    }

    @И("^список содержит язык Java$")
    public void списокСодержитЯзыкJava() {
        Assert.assertEquals("Java", this.patterns.get( 0 ));
    }

    @И("^список содержит язык C#$")
    public void списокСодержитЯзыкC() {
        Assert.assertEquals("C#", this.patterns.get( 1 ));
    }

    @И("^список содержит язык JavaScript$")
    public void списокСодержитЯзыкJavaScript() {
        Assert.assertEquals("JavaScript", this.patterns.get( 2 ));
    }
}