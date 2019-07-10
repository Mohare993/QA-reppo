const animals = ["dog", "pikachu", "megalogon", "aardvark", "cat"];

const y = animals.filter((value, index, array) => {
    return !value.startsWith("mega");
}).map((value, index, array) => {
    if (index < array.length -1)
        return value + ", ";
    else 
        return value;
    
}).reduce((prev, value, index, array) => prev + value, "Animals : ");

console.log(y)