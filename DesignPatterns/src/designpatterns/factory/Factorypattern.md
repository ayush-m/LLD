# Factory Pattern

### Pitfalls
- Never have your factory create objects based on Type paramter as this will violate open/close principle  
  e.g.  
  `+ createProduct(ProductType:Enum)`  

