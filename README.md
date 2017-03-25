# ORMLite-RxJava

A collection of thin RxJava wrappers around query methods in my [fork of `ormlite-core`](https://github.com/cbruegg/ormlite-core). If you prefer not to use my fork, since it is deprecated, just delete the methods referencing non-existing methods. 

It is recommended to use a separate `Scheduler` for operations on the database, for example:

```java
private static final Scheduler DB = Scheduler.newThread();

void foo() {
  someObservable.subscribeOn(DB). [...]
}
```
