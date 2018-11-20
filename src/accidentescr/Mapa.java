/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accidentescr;

import Model.RespuestaConsulta1;
import com.teamdev.jxmaps.*;
import com.teamdev.jxmaps.MapReadyHandler;
import com.teamdev.jxmaps.MapStatus;
import com.teamdev.jxmaps.swing.MapView;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author reese
 */
public class Mapa extends MapView{
    
    private Map map;
    ArrayList<RespuestaConsulta1> lugares;
    
    public Mapa(String name, ArrayList<RespuestaConsulta1> res){
        JFrame frame = new JFrame(name);
        lugares = res;
        System.out.println("voy1");
        
        setOnMapReadyHandler(new MapReadyHandler(){
            @Override
            public void onMapReady(MapStatus status) {
            
                if( status == MapStatus.MAP_STATUS_OK){
                    System.out.println("voy2");
                    map = getMap();
                    
                    MapOptions mapOptions = new MapOptions();
                    MapTypeControlOptions controlOptions = new MapTypeControlOptions();
                    mapOptions.setMapTypeControlOptions(controlOptions);
                    
                    RespuestaConsulta1 res1 = lugares.get(0);
                    Double[] coord1 = toDecimal(res1.getCoordenadaX(), res1.getCoordenadaY());
                    System.out.println(coord1[0] + " " + coord1[1]);
                    
                    /*map.setOptions(mapOptions);
                    map.setCenter(new LatLng(coord1[0], coord1[1]));
                    map.setZoom(20.0);
                    
                    Marker mark = new Marker(map);
                    mark.setPosition(map.getCenter());
                    
                    Circle circle = new Circle(map);
                    circle.setCenter(mark.getPosition());
                    circle.setRadius(5);
                    
                    CircleOptions co = new CircleOptions();
                    co.setFillColor("#FF0000");
                    co.setFillOpacity(0.35);
                    circle.setOptions(co);
                    
                    Marker mark2 = new Marker(map);
                    mark2.setPosition(new LatLng(9.933621, -84.076317));
                    
                    Circle circle1 = new Circle(map);
                    circle1.setCenter(mark2.getPosition());
                    circle1.setRadius(20);
                    
                    co.setFillColor("#00FF00");
                    circle1.setOptions(co);
                    */
                    
                    map.setOptions(mapOptions);
                    map.setCenter(new LatLng(coord1[0], coord1[1]));
                    map.setZoom(20.0);
                    
                    CircleOptions co = new CircleOptions();
                    co.setFillColor("#FF0000");
                    co.setFillOpacity(0.35);
                    
                    
                    /*Marker mark = new Marker(map);
                    mark.setPosition(map.getCenter());
                    
                    Circle circle = new Circle(map);
                    circle.setCenter(mark.getPosition());
                    circle.setRadius(5);
                    circle.setOptions(co);*/
                    
                    
                    for(RespuestaConsulta1 res : lugares){
                        Double[] coord2 = toDecimal(res.getCoordenadaX(), res.getCoordenadaY());
                        Marker mark2 = new Marker(map);
                        mark2.setPosition(new LatLng(coord2[0], coord2[1]));

                        Circle circle1 = new Circle(map);
                        circle1.setCenter(mark2.getPosition());
                        circle1.setRadius(20);
                        //co.setFillColor("#00FF00");
                        circle1.setOptions(co);
                    }
                }
            }
        });
    
        frame.add(this,BorderLayout.CENTER);
        frame.setSize(700,500);
        frame.setVisible(true);
    }
    
    
    public static Double[] toDecimal(String latitude, String longitude) {
        try {
            String[] lat = latitude.replaceAll("[^0-9.\\s-]", "").split(" ");
            String[] lng = longitude.replaceAll("[^0-9.\\s-]", "").split(" ");
            Double dlat = toDecimal(lat); 
            Double dlng = toDecimal(lng);
            return new Double[]{dlat, dlng};
        } catch(Exception ex) {
            //log.error(String.format("Error en el formato de las coordenadas: %s %s", new Object[]{latitude, longitude}), ex);
            return null;
        }
    }
 
    public static Double toDecimal(String latOrLng) {
        try {
            String[] latlng = latOrLng.replaceAll("[^0-9.\\s-]", "").split(" ");
            Double dlatlng = toDecimal(latlng); 
            return dlatlng;
        } catch(Exception ex) {
            //log.error(String.format("Error en el formato de las coordenadas: %s ", new Object[]{latOrLng}), ex);
            return null;
        }
    }
 
    public static Double toDecimal(String[] coord) {
        double d = Double.parseDouble(coord[0]);
        double m = Double.parseDouble(coord[1]);
        double s = Double.parseDouble(coord[2]);
        double signo = 1;
        if (coord[0].startsWith("-"))
            signo = -1;
        return signo * (Math.abs(d) + (m / 60.0) + (s / 3600.0));
    }
    
}
