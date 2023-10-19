package com.xworkz.irctc.railway;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Train {

private int pnrNo;
private String trainName;
private String trainType;
private int noCoaches;
private int noAcCoaches;
private String departerTiming;
private String reachTime;
private String startingPoint;
private String endpoint;


}
