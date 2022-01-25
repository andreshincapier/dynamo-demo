## Dymanodb

Dymano example

### POST 
``
curl -H "Content-type: application/json" -X POST http://localhost:8080/users -d '{"emailAddress": "sample@email.com", "firstName": "Bob", "lastName": "Jones"}'
``

### GET 
``
curl http://localhost:8080/users/fca6fb69-e4cd-4195-bd37-a292f963e21a
``