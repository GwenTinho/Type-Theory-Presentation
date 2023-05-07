type Arrow = Bool -> String

arr :: Arrow
arr = \b -> if b then "something" else "something else"
