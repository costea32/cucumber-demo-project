@FeatureTag
Feature: Demo
  This feature is supposed to do something

#  Background:
#    Given this is my first step


#  @Optional
#  Scenario: demo scenario 2
#    Given this is my first step
#    But I use '455' as a parameter
#    Then There are 455 parameters
#    And There is 1 parameters


  Scenario Outline: Scenario With examples
    Given I use '<testvalue>' as a parameter

    @Must
    Examples:
      | testvalue |
      | 1         |
      | 2         |

    @Optional
    Examples:
    |testvalue|
    |5        |