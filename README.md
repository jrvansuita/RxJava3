# RxJava3 Study

[RXJava](https://reactivex.io/documentation/operators.html) is a reactive programming library for implementing easy asynchronous code by using Observer pattern, Iterator pattern and functional programming. I'm currently using it in some projects and intent keep this repo updated as I start using any other feature by this lib.

### Dependency
```gradle
implementation "io.reactivex.rxjava3:rxjava:3.1.5"
```

### Creationals Operators

<details open><summary><b>Just</b> - <a href="https://reactivex.io/documentation/operators/just.html">Observable.just()</a> </summary>

> _Convert an object or a set of objects into an Observable. Check_ <code>Just().sample()</code> [📌](app/src/main/java/com/vansuita/rxjava/operators/creational/Just.kt)

```kotlin
Observable.just(1, "Two", false, Date()).subscribe { Log.d(TAG, "onNext: $it") }

//onNext: 1
//onNext: Two
//onNext: false
//onNext: Wed Jul 27 15:38:35 GMT-03:00 2022
```

</details>

<details><summary><b>Create</b> - <a href="https://reactivex.io/documentation/operators/create.html">Observable.create()</a> </summary>

> _Will create a fresh instance of ObservableEmitter every time a subscriber start listening to the scope implementation result.. Check_ <code>Create().sample()</code> [📌](app/src/main/java/com/vansuita/rxjava/operators/creational/Create.kt)

```kotlin
Observable.create {
        try {
            for (i in 1..5) {
                it.onNext(i)
            }

            it.onComplete()
        } catch (e: Exception) {
            it.onError(e)
        }
    }.subscribe({
        Log.d(TAG, "onNext: $it")
    }, {
        Log.d(TAG, "onError $it")
    }, {
        Log.d(TAG, "onComplete")
    })

//onNext: 1
//onNext: 2
//onNext: 3
//onNext: 4
//onNext: 5
//onComplete
```

</details>


<details><summary><b>FromArray</b> - <a href="https://reactivex.io/documentation/operators/from.html">Observable.fromArray()</a> </summary>

> _Converts an array into an Observable that emits those items. Check_ <code>FromArray().sample()</code> [📌](app/src/main/java/com/vansuita/rxjava/operators/creational/FromArray.kt)

```kotlin
Observable.fromArray("First", "Second", "Third").subscribe { Log.d(TAG, "onNext: $it") }

//onNext: First
//onNext: Second
//onNext: Third
```

</details>


<details><summary><b>FromIterable</b> - <a href="https://reactivex.io/documentation/operators/from.html">Observable.fromIterable()</a> </summary>

> _Converts an collection into an Observable that emits the items as sequence. Check_ <code>FromIterable().sample()</code> [📌](app/src/main/java/com/vansuita/rxjava/operators/creational/FromIterable.kt)

```kotlin
Observable.fromIterable(listOf("One", "Two", "Three")).subscribe { Log.d(TAG, "onNext: $it") }

//onNext: One
//onNext: Two
//onNext: Three
```
</details>

<details><summary><b>Range</b> - <a href="https://reactivex.io/documentation/operators/range.html">Observable.range()</a> </summary>

> _Returns an Observable that emits a sequence of Integers within a specified range. Check_ <code>Range().sample()</code> [📌](app/src/main/java/com/vansuita/rxjava/operators/creational/Range.kt)

```kotlin
Observable.range(5, 3).subscribe { Log.d(TAG, "onNext: $it") }

// onNext: 5
// onNext: 6
// onNext: 7
```
</details>

<details><summary><b>Repeat</b> - <a href="https://reactivex.io/documentation/operators/repeat.html">Observable.repeat()</a> </summary>

> _Returns an Observable that repeats the sequence of items emitted by the current Observable at most count times. Check_ <code>Repeat().sample()</code> [📌](app/src/main/java/com/vansuita/rxjava/operators/creational/Repeat.kt)

```kotlin
Observable.just("My Text").repeat(2).subscribe { Log.d(TAG, "onNext: $it") }

//onNext: My Text
//onNext: My Text
```
</details>

<details><summary><b>Interval</b> - <a href="https://reactivex.io/documentation/operators/interval.html">Observable.interval()</a> </summary>

> _Emits a sequential number every specified interval of time. On Android devices works even in background. Check_ <code>Interval().sample()</code> [📌](app/src/main/java/com/vansuita/rxjava/operators/creational/Interval.kt)

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


<details><summary><b>Timer</b> - <a href="https://reactivex.io/documentation/operators/timer.html">Observable.timer()</a> </summary>

> _Emits one single time after a specified delay. Check_ <code>Timer().sample()</code> [📌](app/src/main/java/com/vansuita/rxjava/operators/creational/Timer.kt)

```kotlin
Observable.timer(2, TimeUnit.SECONDS).subscribe { Log.d(TAG, "onNext: delayed by 2 seconds") }

//onNext: delayed by 2 seconds
```
</details>

### Filtering Observables

<details><summary><b>Filter</b> - <a href="https://reactivex.io/documentation/operators/filter.html">Observable.filter()</a> </summary>

> _Filters items emitted by the current Observable. Check_ <code>Filter().sample()</code> [📌](app/src/main/java/com/vansuita/rxjava/operators/filteral/Filter.kt)

```kotlin
Observable
    .fromIterable(listOf("Home", "Horse", "Castle", "Game"))
    .filter { it.startsWith("H") }
    .subscribe {
        Log.d(TAG, "onNext: $it")
    }

//onNext: Home
//onNext: Horse
```
</details>


### Conditionals Operators

<details><summary><b>TakeWhile</b> - <a href="https://reactivex.io/documentation/operators/takewhile.html">Observable.takeWhile()</a> </summary>

> _While the condition is satisfied, emits the items by the Observable. Check_ <code>TakeWhile().sample()</code> [📌](app/src/main/java/com/vansuita/rxjava/operators/conditional/TakeWhile.kt)

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
   Operators().last()
   Operators().distinct()
   Operators().skip()
   Operators().buffer()
   Operators().map()
```

### References

- RxJava [@github.com/ReactiveX/RxJava](https://github.com/ReactiveX/RxJava)


