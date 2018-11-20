/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accidentescr;

import com.teamdev.jxmaps.*;
import com.teamdev.jxmaps.MapReadyHandler;
import com.teamdev.jxmaps.MapStatus;
import com.teamdev.jxmaps.swing.MapView;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author reese
 */
public class Mapa extends MapView{
    
    private Map map;
    public Mapa(String name){
        JFrame frame = new JFrame(name);
    
        setOnMapReadyHandler(new MapReadyHandler(){
            @Override
            public void onMapReady(MapStatus status) {
            
                if( status == MapStatus.MAP_STATUS_OK){
                    
                    map = getMap();
                    
                    MapOptions mapOptions = new MapOptions();
                    MapTypeControlOptions controlOptions = new MapTypeControlOptions();
                    mapOptions.setMapTypeControlOptions(controlOptions);
                    
                    map.setOptions(mapOptions);
                    map.setCenter(new LatLng(9.933516, -84.076623));
                    map.setZoom(20.0);
                    
                    Marker mark = new Marker(map);
                    mark.setPosition(map.getCenter());
                    
                    Circle circle = new Circle(map);
                    circle.setCenter(mark.getPosition());
                    circle.setRadius(20);
                    
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
                }
            }
        });
    
        frame.add(this,BorderLayout.CENTER);
        frame.setSize(700,500);
        frame.setVisible(true);
    }
    
}
