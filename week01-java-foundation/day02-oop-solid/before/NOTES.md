# Day 2 — OOP and SOLID Refactor: Order/Invoice System

## SOLID violations in the "before" version

**Single Responsibility Principle**
_Where does `Order` do more than one job? What are the separate reasons it could change?_


**Open/Closed Principle**
_What has to change in `calculateTotal()` every time a new customer type is added?_


**Liskov Substitution Principle**
_Why does `GiftOrder` break the promise that any `Order` can be used wherever an `Order` is expected?_


**Interface Segregation Principle**
_What would a class implementing `OrderOperations` be forced to do, even if it only needed one or two of those methods?_


**Dependency Inversion Principle**
_Where does `Order` depend on a concrete class instead of an abstraction, and why does that make testing or swapping behavior harder?_


---

## Before vs. After: what changed when I tried to extend it

_Pick one realistic change — e.g. "add a GOLD customer tier" or "add SMS notifications instead of email" —
and describe concretely what you'd have to touch in the BEFORE version vs. the AFTER version to make that change._

**Change I tried:**

**In the BEFORE version, I had to:**

**In the AFTER version, I had to:**

---

## Interview practice

**Q: Where does inheritance go wrong in practice?**

_Answer this using your own `GiftOrder` example, not a generic textbook answer._

