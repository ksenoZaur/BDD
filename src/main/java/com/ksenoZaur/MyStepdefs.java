package com.ksenoZaur;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.То;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class MyStepdefs {

    Generator generator;
    List<String> patterns;
    List<String> languages;

    String code;
    String currentPattern;
    String currentLanguage;

    // Чтение кода из файла для проверки
    private String readFromFile( String path ){
        String text = null;

        try {

            text = new String(Files.readAllBytes(new File( path ).toPath()), StandardCharsets.UTF_8);
            text = text.replaceAll("\\n", "");
            text = text.replaceAll("\\r", "");
            text = text.replaceAll("\\t", "");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }

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
        Assert.assertEquals("Java", this.languages.get( 0 ));
    }

    @И("^список содержит язык C#$")
    public void списокСодержитЯзыкC() {
        Assert.assertEquals("C#", this.languages.get( 1 ));
    }

    @И("^список содержит язык JavaScript$")
    public void списокСодержитЯзыкJavaScript() {
        Assert.assertEquals("JavaScript", this.languages.get( 2 ));
    }

    @Когда("^Я выбираю паттерн \"([^\"]*)\"$")
    public void яВыбираюПаттерн(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        this.currentPattern = this.generator.getPatterns().get( 0 );
        Assert.assertEquals( arg0, this.currentPattern);

//        throw new PendingException();
    }

    @И("^Я выбираю язык \"([^\"]*)\"$")
    public void яВыбираюЯзык(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if( this.generator.getLanguages().indexOf(arg0) > -1 )
            this.currentLanguage = arg0;

        Assert.assertEquals( arg0, this.currentLanguage);

//        throw new PendingException();
    }

    @И("^Я нажимаю кнопку Generate$")
    public void яНажимаюКнопкуGenerate() {

        this.code = this.generator.generate(this.currentLanguage, this.currentPattern);

    }

    @То("^Я получаю код, аналогичный коду в файле \"([^\"]*)\"$")
    public void яПолучаюКодАналогичныйКодуВФайле(String arg0) throws Throwable {

        String expected = this.readFromFile("src/main/resources/com.ksenoZaur/input/" + arg0);
        Assert.assertEquals(expected, this.code);
    }


}