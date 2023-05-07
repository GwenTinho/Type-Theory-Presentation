type Arrow = fn(bool) -> String;

let arr: Arrow = |b| if b { String::from("Hello") } else { String::from("World") };
