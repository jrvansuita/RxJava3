# RxJava3 Study

Learning about [RX Java 3](https://reactivex.io/documentation/operators.html)

```gradle
implementation "io.reactivex.rxjava3:rxjava:3.1.5"
```

#### Operators

<details open><summary><b>Just</b> - <a href="https://reactivex.io/documentation/operators/just.html">Observable.just()</a> </summary>

> _Convert an object or a set of objects into an Observable. Check_ <code>Just().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/Just.kt)

```kotlin
Observable.just(1, "Two", false, Date()).subscribe { Log.d(TAG, "onNext: $it") }

//onNext: 1
//onNext: Two
//onNext: false
//onNext: Wed Jul 27 15:38:35 GMT-03:00 2022
```

</details>


<details><summary><b>FromArray</b> - <a href="https://reactivex.io/documentation/operators/from.html">Observable.fromArray()</a> </summary>

> _Converts an array into an Observable that emits those items. Check_ <code>FromArray().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/FromArray.kt)

```kotlin
Observable.fromArray("First", "Second", "Third").subscribe { Log.d(TAG, "onNext: $it") }

//onNext: First
//onNext: Second
//onNext: Third
```

</details>


<details><summary><b>FromIterable</b> - <a href="https://reactivex.io/documentation/operators/from.html">Observable.fromIterable()</a> </summary>

> _Converts an collection into an Observable that emits the items as sequence. Check_ <code>FromIterable().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/FromIterable.kt)

```kotlin
Observable.fromIterable(listOf("One", "Two", "Three")).subscribe { Log.d(TAG, "onNext: $it") }

//onNext: One
//onNext: Two
//onNext: Three
```
</details>

<details><summary><b>Range</b> - <a href="https://reactivex.io/documentation/operators/range.html">Observable.range()</a> </summary>

> _Returns an Observable that emits a sequence of Integers within a specified range. Check_ <code>Range().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/Range.kt)

```kotlin
Observable.range(5, 3).subscribe { Log.d(TAG, "onNext: $it") }

// onNext: 5
// onNext: 6
// onNext: 7
```
</details>

-----


```kotlin   
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

- RxJava [@github.com/ReactiveX/RxJava](https://github.com/ReactiveX/RxJava)


