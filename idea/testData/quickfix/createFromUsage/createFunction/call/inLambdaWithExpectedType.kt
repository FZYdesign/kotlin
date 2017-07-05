// "Create function 'bar'" "true"
// ERROR: A 'return' expression required in a function with a block body ('{...}')
// ERROR: Unresolved reference: TODO

class A<T>(val t: T)

fun <T, U> A<T>.convert(f: (T) -> U) = A(f(t))

fun foo(l: A<String>): A<Int> {
    return l.convert { <caret>bar(it) }
}