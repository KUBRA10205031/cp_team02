# 1- Go to https://qa-gm3.quaspareparts.com/
# 2- User should be logged in.
# 3- User should click account button.
# 4- Click "Account Management"
# 5- Click "Departments"
# 6- Verify displaying Department's list
  Feature: Departments list
    Scenario: Kullanici departments listesini görüntüler
      Given Kullanici login olur ve account menagement'e gider
      When Departments'e tiklar
      Then Departments listesini görüntüler