(ns app.demo)

(comment
  ; [1, 2, 3, 4];
  [1 2 3 4]

  ; const person = {
  ;    name: "Bob",
  ;    age: 30,
  ; }
  (def person
    {:name "Bob"
     :age 30})

  ; person.name
  (:name person)

  ; function greet(name) {
  ;   return `Hello, ${name}!`;
  ; }
  (defn greet [name]
    (str "Hello, " name "!"))

  ; greet("Alice");
  (greet "Alice")

  ; console.log(greet("Alice"));
  (js/console.log (greet "Alice"))

  ; console.clear()
  (js/console.clear)
)
