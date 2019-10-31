function countingFrequency(array) {
    let mappingArray = [];
    for (let i = 0; i < array.length; i++) {
        if (isNaN(mappingArray[array[i]])) {
            mappingArray[array[i]] = 1;
        } else {
            mappingArray[array[i]] += 1;
        }
    }

    for (let i in mappingArray) {
        let frequency;
        if (mappingArray[i] > 0) {
            frequency = mappingArray[i] / array.length;
            console.log(`Frequency of ${i} is ${frequency}`);
        }
    }
}

function numberOfElements(array) {
    let numbers = 0;
    let strings = 0;
    for (let element in array) {
        if (typeof array[element] == 'number') {
            numbers++;
        } else if (typeof array[element] == 'string') {
            strings++;
        }
    }
    console.log(`Numbers: ${numbers}, Strings: ${strings} `);
}

function longestWord(sentence) {
    sentence = sentence.replace("-", " ");
    sentence = sentence.replace(",", " ");
    sentence = sentence.replace("?", "");  //Finalizing the sentence thus delete
    sentence = sentence.replace(".", "");  //Finalizing the sentence thus delete
    sentence = sentence.split(" ");
    let longestWord = sentence[0];
    for (let word in sentence) {
        if (sentence[word].length >= longestWord.length) {
            longestWord = sentence[word];
        }
    }
}

function moveCharacters(string) {
    let newString = "";
    for (let i = 0; i < string.length; i += 3) {
        if (string[i + 2] && string[i + 1]) {
            newString = newString.concat(string[i + 1], string[i + 2], string[i]);
        } else {
            if (string[i + 1]) {
                newString = newString.concat(string[i], string[i + 1]);
            } else newString = newString.concat(string[i]);
        }

    }
    console.log(newString);
}


function isNegative(numbers) {
    result = false;
    for (let number in numbers) {
        if (numbers[number] < 0) {
            return true;
        }
    }
    return result;
}


function negativeProduct(array) {
    if (array.every(Array.isArray)) {
        for (let element in array) {
            if (array.some(isNegative)) {
                let max = array[element[0]];
                console.log(max);
                let product = 1;
                for (let i = 0; i < element.length; i++) {
                    if (array[element[i]] >= max && array[element[i]] < 0) {
                        max = array[element[i]];
                    }
                }
                product *= max;
                console.log(product);


            } else {
                console.log("No negatives");
                return;
            }

        }


    } else {
        console.log("Invalid Arguments");
    }

}

function negativesProduct(array) {
    let product = 1;
    let negatives = false;
    let arraysWithNegatives = 0;
    if (array.every(Array.isArray)) {
        for (let i = 0; i < array.length; i++) {
            let max = -Infinity;
            for (let j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    max = (max <= array[i][j] && array[i][j] < 0) ? array[i][j] : max;
                    negatives = true;
                }
            }
            if (negatives) {
                arraysWithNegatives++;
                product *= max;
                negatives = false;
            }
        }
        if (arraysWithNegatives === 0) {
            console.log("No negatives");
        } else {
            console.log(product);
        }
    } else {
        console.log("Invalid Arguments");
    }
}

