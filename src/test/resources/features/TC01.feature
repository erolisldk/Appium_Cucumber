Feature: General Store
  Scenario: Pozitif Test
    When Ulke menusunden "Austria" secilir
    And İsim kutusuna "Safinaz" girilir
    And Cinsiyet seceneklerinden "Female" secilir
    And Lets Shop butonuna tiklanir
    Then Sayfa basliginin "Products" oldugu dogrulanir