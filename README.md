# GraphQL

## Endpoint

http://localhost:8080/graphiql


### query - users
```graphql
{
  users{
    id 
    name
    email
    nickName
  }
}
```

![users](./images/image1.png)

### mutation - user

```graphql
mutation {
  createUser(input: {name: "Logan", email: "logan.81k@gmail", nickName: "울트라짱"}) {
    id
    name
    email
    nickName
  } 
}
```
![create-user](./images/image2.png)

### query - users
```graphql
{
  users{
    id 
    name
    email
    nickName
  }
}
```

![users](./images/image3.png)

### query - user(id: 1) name, email only
```graphql
{
  user(id: 1) {
    name
    email
  }
}
```

![user](./images/image4.png)