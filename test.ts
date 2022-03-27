  function getDrink (type: string) {
    if (type === 'coke') {
      type = 'Coke';
    } else if (type === 'pepsi') {
      type = 'Pepsi';
    } else if (type === 'mountain dew') {
      type = 'Mountain Dew';
    } else if (type === 'lemonade') {
      type = 'Lemonade';
    } else if (type === 'fanta') {
      type = 'Fanta';
    } else {
      // acts as our "default"
      type = 'Unknown drink!';
    }
    return 'You\'ve picked a ' + type;
  }
  
  
  function getDrink2 ( type: string | number ) {
  
    var drinks : {[type: string] : string}  = {
      'coke': 'Coke',
      'pepsi': 'Pepsi',
      'lemonade':  'Lemonade',  
      'mountain dew': 'Mountain Dew',
      'default':  'Unknown drink!'
      
    };
    return (drinks[type] || drinks['default']);
  }
  
