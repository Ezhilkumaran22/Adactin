@Sanity
Feature: To validate Login Function

  Background: 
    Given user adactin login page

  Scenario Outline: Validate Login Functionality
    When user entered "<username>" and "<password>" user click login button navigate search hotel page
    And user choose "<Hotellocation>","<HotelName>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<Adult>","<Children>"
    And user click search button user go to next page
    And user choose hotel and click continue button go to payment page
    And user enter "<FirstName>","<LastName>","<Address>","<CreditCardNum>","<CreditCardType>","<ExpiryMonth>","<ExpiryYear>","<CvvNum>"
    And user click book now button and user get booking details
    Then user have valid credenttials page

    Examples: 
      | username     | password | Hotellocation | HotelName   | RoomType | NumberOfRooms | CheckInDate | CheckOutDate | Adult | Children | FirstName | LastName | Address                        | CreditCardNum      | CreditCardType | ExpiryMonth | ExpiryYear | CvvNum |
      | Ezhilkumaran | qwert    | Sydney        | Hotel Creek | Standard |             2 | 19/10/2021  | 19/10/2021   |     2 |        2 | Ezhil     | Kumaran  | CSR-Complex,Medavakkam,Chennai | 987654321987654321 | VISA           | July        |       2022 |    678 |
