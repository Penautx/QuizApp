
# Quiz Rest Application

Quiz Application is designed for people that love to prove their knowledge in simple closed questions.
Just choose categories you want to challenge with and set up difficulty, number of questions.
 



## API Reference

### URL: https://opentdb.com/

#### Get random questions filtered by following parameters:



```http
  GET /api.php?amount=2
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `amount` | `String` | returns 2 random questions |


```http
  GET /api.php?amount=5&category=25
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `category`  | `String` | returns 5 questions of given category|

```http
  GET /api.php?amount=5&category=25&difficulty=medium
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `difficulty`  | `String` | returns 5 questions of given category in medium difficulty|

```http
  GET /api_count.php?category=25
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `category`  | `String` | returns existing number of questions in given category in trivia database|





## Technologies

 - Spring boot
 - H2 database
 - Thymeleaf html engine
 - REST
## Acknowledgements


 - [Open Trivia Database](https://opentdb.com/)
 - [Software Developement Academy](https://sdacademy.pl/) 
 - [Readme.so](https://readme.so/)
 

