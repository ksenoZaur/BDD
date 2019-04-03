package com.ksenoZaur;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    public List<String> getPatterns() {
        return  new ArrayList<String>() {{ add("Adapter"); add("Proxy"); add("Decorator"); add("Composite");}};
    }

    public List<String> getLanguages() {
        return  new ArrayList<String>() {{ add("Java"); add("C#"); add("JavaScript");}};
    }

    public String generate(String currentLanguage, String currentPattern) {

        if( currentPattern.equals("Adapter")) {
            if (currentLanguage.equals("Java"))
                return "interface RoundPeg {private int radius;public RoundPeg( int radius );public int " +
                        "getRadius();}class SquarePeg{private int width;public SquarePeg( int width ){this.width " +
                        "= width;}public int getWidth(){return this.width;}}class SquarePegAdapter implements " +
                        "RoundPeg{private SquarePeg peg;public SquarePegAdapter( SquarePeg peg ) {this.peg = peg;}" +
                        "@Override public int getRadius() {return (int)(peg.getWidth() * Math.sqrt(2)/2);}}public " +
                        "class RoundHole {private int radius;public int getRadius() {return this.radius;}public " +
                        "RoundHole( int radius ) {this.redius = radius;}public bool fits( RoundPeg peg ){if( " +
                        "peg.getRadius() <= this.radius )return true;elsereturn false;}}";
            else if (currentLanguage.equals("C#"))
                return "\uFEFFusing System;  namespace Adapter {    class MainApp  {    static void Main()    {" +
                        "      RoundPeg roundPeg = new SquarePegAdapter();      roundPeg.getRadius();      " +
                        "RoundHole hole = new RoundHole(radius);hod.fits(roundPeg);    }  }   class RoundPeg  {    " +
                        "int radius;    public virtual int getRadius()    {      return radius;    }  }   class " +
                        "SquarePegAdapter : RoundPeg  {    private SquarePeg adaptee = new SquarePeg();     public " +
                        "override int getRadius()    {      adaptee.getWidth();    }  }   class SquarePeg  " +
                        "{int width;    public int getWidth()    {      return width;    }  } }";

            return "\uFEFFfunction SquarePeg( width ) {var width = width;this.getWidth = function () " +
                    "{return width;};};function SquarePegAdapter ( adaptee ) {this.getRadius = function () " +
                    "{return adaptee.getWidth();};};var squarePeg = new SquarePeg(1);var squareAdapter = new " +
                    "SquareAdapter(squarePeg);squareAdapter.getRadius();";
        }

        if( currentLanguage.equals("Java"))
            return "public class Main {public static void main(String[] args) {ThirdPartyYoutubeLib object " +
                    "= new CachedYoutubeClass(); String[] result = object.listVideos();}}public interface " +
                    "ThirdPartyYoutubeLib {public String[] listVideos();public String getVideoInfo(int id)" +
                    ";public File downloadVideo(int id);}public class ThirdPartyYoutubeClass implements " +
                    "ThirdPartyYoutubeLib {private String[] vieos;public String[] listVideos(){return " +
                    "this.videos;}public String getVideoInfo(int id){return this.videos[ i ];}public File " +
                    "downloadVideo(int id){return new File( videos[ i ] );}}public class CachedYoutubeClass " +
                    "implements ThirdPartyYoutubeLib{private ThirdPartyYoutubeClass service;public " +
                    "CachedYoutubeClass( ThirdPartyYoutubeClass s){this.service = s;}public " +
                    "CachedYoutubeClass(){}public String[] listVideos(){if( service == null ){service = " +
                    "new ThirdPartyYoutubeClass(); }return service.listVideos();}public String getVideoInfo" +
                    "(int id){if( service == null ){service = new ThirdPartyYoutubeClass(); }return service." +
                    "getVideoInfo(id);}public File downloadVideo(int id){if( service == null ){service = new " +
                    "ThirdPartyYoutubeClass(); }return service.downloadVideo(id);}}";
            else if (currentLanguage.equals("C#"))return  "using System;using System.Threading;class MainApp{static void Main(){  IMath p = new " +
                    "MathProxy();  Console.WriteLine(\"4 + 2 = \" + p.Add(4, 2));  Console.WriteLine(\"4 - " +
                    "2 = \" + p.Sub(4, 2));  Console.WriteLine(\"4 * 2 = \" + p.Mul(4, 2));  Console.WriteLine" +
                    "(\"4 / 2 = \" + p.Div(4, 2));  Console.Read();}}public interface IMath{double add(double " +
                    "x, double y);double Sub(double x, double y);double Mul(double x, double y);double Div(double" +
                    " x, double y);}class Math : IMath{public Math(){    Console.WriteLine(\"Create object Math. " +
                    "Wait...\");    Thread.Sleep(1000);}public double Add(double x, double y){return x + y;}public " +
                    "double Sub(double x, double y){return x - y;}public double Mul(double x, double y){" +
                    "return x * y;}public double Div(double x, double y){return x / y;}}class MathProxy : " +
                    "IMath{Math math;public MathProxy(){  math = null;}public double Add(double x, double y){  " +
                    "return x + y;}public double Sub(double x, double y){  return x - y;}public double Mul(double " +
                    "x, double y){  if (math == null)      math = new Math();  return math.Mul(x, y);}public double " +
                    "Div(double x, double y){  if (math == null)      math = new Math();  return math.Div(x, y);}}";

        return "function IMath() {this.add = function(x, y) {};this.sub = function(x, y) {};}function " +
                "RMath() {this.add = function(x, y) {return x + y;};this.sub = function(x, y) {return x - " +
                "y;};}RMath.prototype = new IMath();RMath.prototype.constructor = RMath;function MathProxy() " +
                "{var math = new RMath();this.add = function(x, y) {return math.add(x, y);};this.sub = function" +
                "(x, y) {return math.sub(x, y);};}var test = new MathProxy();alert(test.add(3, 2));" +
                " // 5alert(test.sub(3, 2)); // 1";
    }
}
