- [X] English version  
- [X] Polska wersja  
  
## ENGLISH VERSION
You might know some pretty large perfect squares. But what about the NEXT one?  

Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.    

If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is positive.
  
Examples:
  
findNextSquare(121) --> returns 144  
findNextSquare(625) --> returns 676  
findNextSquare(114) --> returns -1 since 114 is not a perfect  

  ---  
## POLSKA WERSJA  
Używając odpowiednich funkcji można poznać całkowite pierwiastki pewnej dużej liczby.  
W tym zadaniu celem będzie znalezienie liczby, której pierwiastek jest dokładnie o 1 większy niż podanej liczby.  
By uzyskać rozwiązanie należy w funkcji findNextSquare jako parametr podać liczbę. Jeśli liczba posiada całkowity pierwiastek, funkcja zwróci wartość kolejnej liczby podniesionej do potęgi 2, w przeciwnym wypadku funkcja zwróci wartość -1;  
__Możemy założyć, żę liczba podana jako parametr jest liczbą dodatnią__
  
Przykłady:  
  
findNextSquare(121) --> zwraca 144  
findNextSquare(625) --> zwraca 676  
findNextSquare(114) --> zwraca -1, bo 114 nie posiada całkowitego pierwiastka  
