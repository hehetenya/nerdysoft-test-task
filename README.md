# The program output is:

1. Create singleton class VirtualProductCodeManager 

Is code used: true

Is code used: false

2. Most expensive product: Product{name='Product C', price=100.0}

3. Most popular product: Product{name='Product A', price=20.5}

4. Average age is: 23.0

5. Map with products as keys and list of users as value 

key: Product{name='Product A', price=20.5} value: [User{name='Alice', age=32}, User{name='Bob', age=19}, User{name='Charlie', age=20}, User{name='John', age=27}]

key: Product{name='Product D', price=81.25} value: [User{name='Alice', age=32}, User{name='Charlie', age=20}, User{name='John', age=27}]

key: Product{name='Product C', price=100.0} value: [User{name='Alice', age=32}, User{name='John', age=27}]

key: Product{name='Product B', price=50.0} value: [User{name='Bob', age=19}, User{name='John', age=27}]

6. a) List of products sorted by price: [Product{name='Product A', price=20.5}, Product{name='Product B', price=50.0}, Product{name='Product D', price=81.25}, Product{name='Product C', price=100.0}]

6. b) List of orders sorted by user agge in descending order: [Order{user=User{name='Alice', age=32}, products=[Product{name='Product A', price=20.5}, Product{name='Product C', price=100.0}, Product{name='Product D', price=81.25}]}, Order{user=User{name='John', age=27}, products=[Product{name='Product C', price=100.0}, Product{name='Product D', price=81.25}, Product{name='Product A', price=20.5}, Product{name='Product B', price=50.0}]}, Order{user=User{name='Charlie', age=20}, products=[Product{name='Product A', price=20.5}, Product{name='Product D', price=81.25}]}, Order{user=User{name='Bob', age=19}, products=[Product{name='Product A', price=20.5}, Product{name='Product B', price=50.0}]}]

7. Calculate the total weight of each order 

order: Order{user=User{name='Charlie', age=20}, products=[Product{name='Product A', price=20.5}, Product{name='Product D', price=81.25}]} total weight: 25

order: Order{user=User{name='Alice', age=32}, products=[Product{name='Product A', price=20.5}, Product{name='Product C', price=100.0}, Product{name='Product D', price=81.25}]} total weight: 25

order: Order{user=User{name='Bob', age=19}, products=[Product{name='Product A', price=20.5}, Product{name='Product B', price=50.0}]} total weight: 42

order: Order{user=User{name='John', age=27}, products=[Product{name='Product C', price=100.0}, Product{name='Product D', price=81.25}, Product{name='Product A', price=20.5}, Product{name='Product B', price=50.0}]} total weight: 42

