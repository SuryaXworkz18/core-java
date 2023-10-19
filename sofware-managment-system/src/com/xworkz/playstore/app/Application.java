package com.xworkz.playstore.app;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Application {

    private int appID;
    private String appName;
    private double appSize;
    private String releaseDate;
    private String appOwner;
    private String apptype;
    private String appVersion;



}
