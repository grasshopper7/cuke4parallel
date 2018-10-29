Feature: Feature 3
      
  Scenario Outline: ScenarioOutline 1
    Given the details from parallel3step1 are <num>
    Given the details from parallel3step2 are <num>
    
    Examples:
    | num |
    |  1  |
    |  2  |
    |  3  |