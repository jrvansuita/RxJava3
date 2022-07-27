# RxJava3 Study

Learning about [RX Java 3](https://reactivex.io/documentation/operators.html)

```gradle
implementation "io.reactivex.rxjava3:rxjava:3.1.5"
```

#### Operators

<details open>
<summary><b>Just</b> - <a href="https://reactivex.io/documentation/operators/just.html">Observable.just()</a> </summary>

> _Convert an object or a set of objects into an Observable. Check_ <code>Just().sample()</code> [📌](docs.github.com/pt/get-started)

```kotlin
Observable.just(1, "Two", false, Date()).subscribe { Log.d(TAG, "onNext: $it") }

//onNext: 1
//onNext: Two
//onNext: false
//onNext: Wed Jul 27 15:38:35 GMT-03:00 2022
```

</details>


<details>
<summary><b>FromArray</b> - <a href="https://reactivex.io/documentation/operators/from.html">Observable.fromArray()</a> </summary>

> _Converts an array into an Observable that emits those items. Check_ <code>FromArray().sample()</code> [📌](docs.github.com/pt/get-started)

```kotlin
Observable.fromArray("First", "Second", "Third").subscribe { Log.d(TAG, "onNext: $it") }

//onNext: First
//onNext: Second
//onNext: Third
```

</details>


<details>
<summary><b>FromIterable</b> - <a href="https://reactivex.io/documentation/operators/from.html">Observable.fromIterable()</a> </summary>

> _Converts an collection into an Observable that emits the items as sequence. Check_ <code>FromIterable().sample()</code> [📌](docs.github.com/pt/get-started)

```kotlin
Observable.fromIterable(listOf("One", "Two", "Three")).subscribe { Log.d(TAG, "onNext: $it") }

//onNext: One
//onNext: Two
//onNext: Three
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

### References


