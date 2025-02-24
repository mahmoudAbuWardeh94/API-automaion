Feature: List of API Cases

  @Simple-Books
  Scenario Outline: Returns a list of books using GET API contain <scenarioName>
    When Send the API call GET https://simple-books-api.glitch.me/books with query parameters
    """
    <url>
    """
    Then Should received success response with status code 200.

    Examples:
      | scenarioName                                             | url                                                                                      |
      | fiction type                                             | ?type=fiction                                                                          |
      | non-fiction type                                         | ?type=non-fiction                                                                          |
      | limit                                                    | ?limit=2                                                                          |