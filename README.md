# RxJava3 Study

[RXJava](https://reactivex.io/documentation/operators.html) is a reactive programming library for implementing easy asynchronous code by using Observer pattern, Iterator pattern and functional programming. I'm currently using it in some projects and intent keep this repo updated as I start using any other feature by this lib.

### Dependency
```gradle
implementation "io.reactivex.rxjava3:rxjava:3.1.5"
```

### Creationals Operators

<details open><summary><b>Just</b> - <a href="https://reactivex.io/documentation/operators/creational/just.html">Observable.just()</a> </summary>

> _Convert an object or a set of objects into an Observable. Check_ <code>Just().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/Just.kt)

```kotlin
Observable.just(1, "Two", false, Date()).subscribe { Log.d(TAG, "onNext: $it") }

//onNext: 1
//onNext: Two
//onNext: false
//onNext: Wed Jul 27 15:38:35 GMT-03:00 2022
```

</details>


<details><summary><b>FromArray</b> - <a href="https://reactivex.io/documentation/operators/creational/from.html">Observable.fromArray()</a> </summary>

> _Converts an array into an Observable that emits those items. Check_ <code>FromArray().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/FromArray.kt)

```kotlin
Observable.fromArray("First", "Second", "Third").subscribe { Log.d(TAG, "onNext: $it") }

//onNext: First
//onNext: Second
//onNext: Third
```

</details>


<details><summary><b>FromIterable</b> - <a href="https://reactivex.io/documentation/operators/creational/from.html">Observable.fromIterable()</a> </summary>

> _Converts an collection into an Observable that emits the items as sequence. Check_ <code>FromIterable().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/FromIterable.kt)

```kotlin
Observable.fromIterable(listOf("One", "Two", "Three")).subscribe { Log.d(TAG, "onNext: $it") }

//onNext: One
//onNext: Two
//onNext: Three
```
</details>

<details><summary><b>Range</b> - <a href="https://reactivex.io/documentation/operators/creational/range.html">Observable.range()</a> </summary>

> _Returns an Observable that emits a sequence of Integers within a specified range. Check_ <code>Range().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/Range.kt)

```kotlin
Observable.range(5, 3).subscribe { Log.d(TAG, "onNext: $it") }

// onNext: 5
// onNext: 6
// onNext: 7
```
</details>

<details><summary><b>Repeat</b> - <a href="https://reactivex.io/documentation/operators/creational/repeat.html">Observable.repeat()</a> </summary>

> _Returns an Observable that repeats the sequence of items emitted by the current Observable at most count times. Check_ <code>Repeat().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/Repeat.kt)

```kotlin
Observable.just("My Text").repeat(2).subscribe { Log.d(TAG, "onNext: $it") }

//onNext: My Text
//onNext: My Text
```
</details>

<details><summary><b>Interval</b> - <a href="https://reactivex.io/documentation/operators/interval.html">Observable.interval()</a> </summary>

> _Returns an Observable that emits a sequential number every specified interval of time. On Android devices works even in background. Check_ <code>Interval().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/creational/Interval.kt)

```kotlin
Observable.interval(1, TimeUnit.SECONDS).subscribe { Log.d(TAG, "onNext: Hit") }

//onNext: Hit
//onNext: Hit
//onNext: Hit
//onNext: Hit
//onNext: Hit
//onNext: Hit
//... and continues
```
</details>


### Conditionals Operators

<details><summary><b>TakeWhile</b> - <a href="https://reactivex.io/documentation/operators/takewhile.html">Observable.takeWhile()</a> </summary>

> _While the condition is satisfied, emits the items by the Observable. Check_ <code>TakeWhile().sample()</code> [📌](src/main/java/com/vansuita/rxjava/operators/conditional/TakeWhile.kt)

```kotlin
Observable
    .interval(1, TimeUnit.SECONDS)
    .takeWhile { it <= 3 }
    .subscribe { 
        Log.d(TAG, "onNext: $it - Hit")
    }

//onNext: 0 - Hit
//onNext: 1 - Hit
//onNext: 2 - Hit
//onNext: 3 - Hit
```
</details>


-----


```kotlin   
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


