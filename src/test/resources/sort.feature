Feature: Sort
  @web
    @sort
  Scenario Outline: user sort product by ascending and descending
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    When user select sort product by "<sort_by>"
    Then result product sort by "<sort_result>"


    Examples:
      |sort_by          |sort_result      |
      |name_ascending   |name A to Z      |
      |name_descending  |name Z to A      |
      |price_ascending  |price low to high|
      |price_descending |price high to low|