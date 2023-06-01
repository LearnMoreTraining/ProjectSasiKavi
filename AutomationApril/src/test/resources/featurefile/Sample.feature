Feature: To handle static and dynamic

  @StaticDropdown
  Scenario: To handle the static dropdown
    Given user navigates to URL
    When Iterate the static dropdown values
    And Handle the static dropdown

  @Dynamic
  Scenario: To handle dynamic dropdown
    Given user navigates to URL
    When Handle the dynamic dropdown

    @AutoSugg
  Scenario: Auto Suggestive
    Given user navigates to URL
    When handle Auto suggestive

      @Table
      Scenario: TableHan
        Given user navigates to URL
        When handle Table

        @MouseHower
  Scenario:
    Given user navigates to URL
    When handle the mouse action

   @Frame
  Scenario: To handle the frame
    Given user navigates to URL
    When User handles the frame

     @cal
  Scenario: Calander
    Given user navigates to URL

