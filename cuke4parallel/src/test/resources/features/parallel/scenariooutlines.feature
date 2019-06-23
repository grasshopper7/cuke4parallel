Feature: Feature Scenario Outlines
      
  Scenario Outline: ScenarioOutline
    Given "First" step of "<num>" row of scenario outline
    Given "Second" step of "<num>" row of scenario outline
    
    Examples:
    | num    |
    | First  |
    | Second |