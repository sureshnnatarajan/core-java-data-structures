package com.suresh.learnings.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearningStreams {

	public static void main(String[] args) {

		List<ReportCard> reportCards = Arrays.asList(
				new ReportCard("Suresh", "suresh@inevitable.co.in", 75),
				new ReportCard("Shubathara", "shubify@shubify.com", 100),
				new ReportCard("Shreemithran", "mithran@mithran.com", 100)
				);
		
		System.out.println(reportCards);
		
		List<ReportCard> topScorers = new ArrayList<>();
		//Use Java 7
		for (ReportCard reportCard : reportCards) {
			if (reportCard.getScore() > 80) {
				topScorers.add(reportCard);
			}
		}
		System.out.println("Using Java 7 ===> ");
		System.out.println(topScorers);
		
		//Use Java8 Streams
		topScorers = reportCards
						.stream()
						.filter(reportCard -> reportCard.getScore() > 80)
						.collect(Collectors.toList());
		
		System.out.println("Using Streams ===> ");
		System.out.println(topScorers);
		
		//Use Java 8 Streams to get names
		List<String> names = 
			reportCards.stream()
					   .filter(reportCard -> (reportCard.getScore() > 80))
					   .map(ReportCard :: getName)
					   .collect(Collectors.toList());
		
		System.out.println("names--->" + names);
		
		//Use Java8 Streams  
		// NOTE: This results in Class Cast Exception since sorting cannot be performed on ReportCard.
		topScorers = reportCards
						.stream()
						.sorted()
						.collect(Collectors.toList());
		
		System.out.println("Using Streams with sorted ===> ");
		System.out.println(topScorers);
	}

}
