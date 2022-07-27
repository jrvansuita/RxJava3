# RxJava3 Study
Learning about [RX Java 3](https://reactivex.io/documentation/operators.html) 


#### Operators

<details open>
<summary><b>Just</b> - <a href="https://reactivex.io/documentation/operators/just.html">Observable.just()</a> </summary>

> _Convert an object or an array of objects into an Observable. Check_ <code>Just().sample()</code> [📌](docs.github.com/pt/get-started)

```kotlin
Observable.just(1, "Two", false, Date()).subscribe { Log.d(TAG, "onNext : $it") }

//onNext : 1
//onNext : Two
//onNext : false
//onNext : Wed Jul 27 15:38:35 GMT-03:00 2022
```
</details>


<details>
<summary><b>FromArray</b> - <a href="https://reactivex.io/documentation/operators/from.html">Observable.fromArray()</a> </summary>

> _Convert any object and data types into Observables. Check_ <code>FromArray().sample()</code> [📌](docs.github.com/pt/get-started)

```kotlin
Observable.fromArray("First", "Second", "Third").subscribe { Log.d(TAG, "onNext : $it") }

//onNext : First
//onNext : Second
//onNext : Third
```
</details>



-----



 [```Just().sample()```](docs.github.com/pt/get-started) 📌
 
 
```kotlin   
  
   Operators().fromArray()
   Operators().fromIterable()
   Operators().range()
   Operators().repeat()
   Operators().interval()
   Operators().intervalWithTakeWhile()
   Operators().timer()
   Operators().create()
   Operators().filter()
   Operators().last()
   Operators().distinct()
   Operators().skip()
   Operators().buffer()
   Operators().map()
```
