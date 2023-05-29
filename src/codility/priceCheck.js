function priceCheck(products, productPrices, productSold, soldPrice) {
    // Write your code here
  var map = new Map();
       for(let i = 0; i < products.length ; i++){
           // add all the products and their prices in the Dictionary for fast lookup
           map.set(products[i], productPrices[i]);
       }
      let incorrect = 0; // ihe number of incorrect
       for(let i = 0; i < productSold.length ; i++){
           let original = map.get(productSold[i]);
           // get the original price
           if(original){
               if(original != soldPrice[i]) {
                   //incorrect
                   incorrect++;
               }
           } else {
               //product not found, incorrect
               incorrect++;
           }
       }
       return incorrect;
}