# Clean Code 2019

**Zadanie 1:** Clean Code

Klasa `cleancode.task1.doIt` nie przestrzega zasad Clean Code. Przerefaktoruj kod zgodnie z zasadami poznanymi podczas wykładu.

Pytania uzupełniające:
- Jaka jest rola tej klasy? 
- Jaką funkcjonalność realizuje?
- Upewnij się czy wszystkie metody są zaimplementowane poprawnie.
---

**Zadanie 2:** Clean Code 2

Klasa `cleancode.task2.ItemInBasket`
Przepisz implementację metody 'getPrice' tak, aby był czytelniejszy 
i nie miał w sobie ani jednego warunku.
---

**Zadanie 3:** Single Responsibility Principle

Klasa `cleancode.task3srp.Employee`
Podziel klasę na mniejsze tak, aby każda była odpowiedzialna za pojedynczą funkcjonalność.


**Zadanie 4:** Single Responsibility Principle
Reprezentacja modelu ksiązki oraz możliwość jej drukowania (czytania) powinna być odseparowana. Dostarcz oddzielne implementacje modelu książki oraz 
jej drukowania zgodnie z Single Responsibility Principle. 

Pakiet, w którym należy umieścić rozwiązanie: `cleancode.task4srp.book.solution`

---

**Zadanie 5:** Open-closed principle

Limity prędkości i kary za jej przekroczenie są różne dla każdego z 50 stanów USA. Należy dostarczyć łatwo rozszerzalną implementację, w której każdy 
stan będzie mógł zdefiniować swoje kary. Na chwilę obecną załóżmy, że będą to 3 stany USA, które skorzystają z naszego API, ale niewykluczone, że w 
przyszłości inne stany również decydują się je wykorzystać.

Pakiet, w którym należy umieścić rozwiązanie: `cleancode.task5ocp.speedlimits.solution`

---



**Zadanie 6:** Dependency Inversion Principle

Mamy serwis informujący o zmianach pogodowych. Informacje o zmianach wysyłane są na różne urządzenia: telefony lub skrzynki poczty elektronicznej. Oba te urządzenia łączy jedna wspólna cecha jaką jest odbiór wiadomości i jej wyświetlenie. Telefon i skrzynka są modułami niskopoziomowymi, natomiast "Tracker" jest modułem wysokopoziomowym, który nie powinien zależeć od modułów niskopoziomowych.

Pakiet, w którym należy dostarczyć rozwiązanie: `cleancode.task6dip.weathertracker.solution`