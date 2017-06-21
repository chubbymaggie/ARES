package de.fau.cs.inf2.cas.ares.io;

import de.fau.cs.inf2.cas.common.io.ReadableEncodedScript;

import java.util.List;

public class AresRecommendationResult {
  public String name;
  public List<ReadableEncodedScript> allMembers;
  public List<ReadableEncodedScript> inputs;
  public List<AresRecommendationSet> recommendationSets;
  public int foundMembers;
  public int numberOfRecommendationSets;
  public double precision;
  public double recall;
  public double accuracyTokens;
  public double accuracyCharacters;
  public String patternOriginal;
  public String patternModified;
  
  /**
   * Instantiates a new ares recommendation result.
   *
   * @param name the name
   * @param allMembers the all members
   * @param inputs the inputs
   * @param recommendationSets the recommendation sets
   * @param foundMembers the found members
   * @param numberOfRecommendationSets the number of recommendation sets
   * @param precision the precision
   * @param recall the recall
   * @param accuracyTokens the accuracy tokens
   * @param accuracyCharacters the accuracy characters
   */
  public AresRecommendationResult(String name, 
      List<ReadableEncodedScript> allMembers,
      List<ReadableEncodedScript> inputs, List<AresRecommendationSet> recommendationSets,
      int foundMembers, int numberOfRecommendationSets, double precision, double recall,
      double accuracyTokens, double accuracyCharacters, String patternOriginal,
      String patternModified) {
    super();
    this.name = name;
    this.allMembers = allMembers;
    this.inputs = inputs;
    this.recommendationSets = recommendationSets;
    this.foundMembers = foundMembers;
    this.numberOfRecommendationSets = numberOfRecommendationSets;
    this.precision = precision;
    this.recall = recall;
    this.accuracyTokens = accuracyTokens;
    this.accuracyCharacters = accuracyCharacters;
    this.patternOriginal = patternOriginal;
    this.patternModified = patternModified;
  }
}