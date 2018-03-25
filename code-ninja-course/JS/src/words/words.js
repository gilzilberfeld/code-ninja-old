const words = [
    'dog', 'cat', 'horse', 'goat', 'cat', 'horse', 'fish', 'dog', 'dog', 'fish'  ];

function find() {

  var vector_sz = 0;
  var word;

  vector_sz = words.length;

  if (vector_sz === 0) {
    console.log('Please enter some words!');
    return -1;
  }

  var frequency = [];
  var unique_words = [];
  var count = 0;
  var isUnique;

  for (i = 0; i < words.length; i++) {
    isUnique = true;

    for (j = 0; j < unique_words.length; j++) {
      if (words[i] === unique_words[j]) {
        isUnique = false;
      }
    }

    if (isUnique) {
      unique_words.push(words[i]);
    }
  }
  for (i = 0; i < unique_words.length; i++) {
    for (j = 0; j < words.length; j++) {
      if (unique_words[i] == words[j]) {
        count = count + 1;
      }
    }
    frequency.push(count);
    count = 0;
  }

  for (i = 0; i < unique_words.length; i++) {
    console.log(unique_words[i] + ' ' + frequency[i]);
  }
  return 0;
}
