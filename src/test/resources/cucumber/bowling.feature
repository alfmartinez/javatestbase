Feature: Bowling Game
  As a player
  I want to calculate score
  So that I don't need to calculate myself

  Scenario: All gutters
    Given I have a bowling game
    When I hit the gutter 20 times
    Then my score is 0
