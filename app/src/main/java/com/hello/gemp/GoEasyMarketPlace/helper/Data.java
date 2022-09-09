package com.hello.gemp.GoEasyMarketPlace.helper;

import com.hello.gemp.GoEasyMarketPlace.model.Category;
import com.hello.gemp.GoEasyMarketPlace.model.Offer;
import com.hello.gemp.GoEasyMarketPlace.model.Product;

import java.util.ArrayList;
import java.util.List;


public class Data {
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> newList = new ArrayList<>();
    List<Product> popularList = new ArrayList<>();
    List<Offer> offerList = new ArrayList<>();

    public List<Category> getCategoryList() {
        Category category = new Category("1", "Food", "https://image.flaticon.com/icons/png/512/262/262344.png");
        categoryList.add(category);
        category = new Category("2", "Home & Cleaning", "https://lisasnatural.com/wp-content/uploads/2018/05/housecleanicon-300x228.jpg");
        categoryList.add(category);
        category = new Category("3", "Baby Care", "https://tips4tots.files.wordpress.com/2015/08/medical-insurance-free-icon.png");
        categoryList.add(category);
        category = new Category("4", "sports & Nutrition", "https://kathleenhalme.com/images/nutrition-clipart-sport.jpg");
        categoryList.add(category);
        category = new Category("5", "Pet care", "http://kasperstromman.files.wordpress.com/2013/05/dog-cat-above-board.jpg");
        categoryList.add(category);
        category = new Category("6", "Health & Household", "https://thumbs.dreamstime.com/b/household-cleaning-products-accessories-basket-there-mop-detergents-rubber-gloves-glass-cleaner-sponges-89944820.jpg");
        categoryList.add(category);
        return categoryList;
    }

    public List<Product> getProductList() {
        Product product = new Product("1", "1", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "3", "XAF.", "1000", "10% OFF", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("2", "1", "Banana", "Rich in potassium and vitamins B6 and C, bananas also contain essential amino acids, high amounts of carbohydrate and fiber, but low amounts of protein and fat", "1 Bounch", "XAF.", "500", "20% OFF", "https://images-na.ssl-images-amazon.com/images/I/21DejQuoT2L.jpg");
        productList.add(product);
        product = new Product("3", "2", "House Clean Liquid", "This cleaning agent works effectively in cleaning the kitchen and bathroom. It is formulated with active chemicals that dissolve dirt and whitens the surface even without much effort from you", "1 Lit.", "XAF.", "1500", "5% OFF", "http://sunsetcleaningcia.com/wp-content/uploads/2016/05/houseclean.png");
        productList.add(product);
        product = new Product("4", "2", "House Clean Brush", "A Cleaner is responsible for all basic cleaning in and around the facility or office building. This can entail dusting, mopping, sweeping, vacuuming, and cleaning smudges off windows and doors", "1 Piece", "XAF.", "1000", "10% OFF", "https://www.clean-hoouse.com/wp-content/uploads/2017/09/13.png");
        productList.add(product);
        product = new Product("5", "3", "Pampers", "Pampers Are Designed With Babies in Mind Disposable diapers have come a long", "1 Piece", "XAF.", "500", "10% OFF", "https://cdn.bmstores.co.uk/images/hpcProductImage/imgFull/311448-Pampers-Baby-Dry-Size-4-Maxi-251.jpg");
        productList.add(product);
        product = new Product("6", "3", "Baby Oil", "Baby oil is a human-made mineral oil. Like petroleum jelly, baby oil is made from a byproduct that’s leftover when oil is refined. Baby oil is further refined until it’s safe for skin care and other beauty uses", "500 Ml", "XAF.", "2000", "", "https://www.fortunaonline.net/media/catalog/product/cache/1/small_image/295x/040ec09b1e35df139433887a97daa66f/n/k/nkbcp12_-_xia-shib-ao-baby-oil-200ml.png");
        productList.add(product);
        product = new Product("7", "4", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "1", "XAF.", "200", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("8", "4", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "8", "XAF.", "2OO0", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("9", "5", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "5", "XAF.", "1000", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("10", "5", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "2", "XAF.", "300", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("11", "6", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "10", "XAF.", "5000", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("12", "6", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "4", "XAF.", "1500", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        productList.add(product);
        product = new Product("13", "1", "Litchi", "Litchi fruits help to provide strength to your skin, hair, and nails. They have both anti-inflammatory and antioxidant properties. Lychee fruit is rich in copper", "16.8g", "XAF.", "2000", "30% OFF", "https://cdn.shopify.com/s/files/1/0665/4989/products/lichee-485x400_grande.jpg");
        productList.add(product);
        return productList;
    }

    public List<Product> getNewList() {
        Product product = new Product("1", "1", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "2", "XAF.", "500", "10% OFF", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        newList.add(product);
        product = new Product("2", "1", "Banana", "Rich in potassium and vitamins B6 and C, bananas also contain essential amino acids, high amounts of carbohydrate and fiber, but low amounts of protein and fat", "1 Bounch", "XAF.", "1000", "20% OFF", "https://images-na.ssl-images-amazon.com/images/I/21DejQuoT2L.jpg");
        newList.add(product);
        product = new Product("3", "2", "House Clean Liquid", "This cleaning agent works effectively in cleaning the kitchen and bathroom. It is formulated with active chemicals that dissolve dirt and whitens the surface even without much effort from you", "1 Lit.", "XAF.", "2500", "", "http://sunsetcleaningcia.com/wp-content/uploads/2016/05/houseclean.png");
        newList.add(product);
        product = new Product("4", "2", "House Clean Brush", "A Cleaner is responsible for all basic cleaning in and around the facility or office building. This can entail dusting, mopping, sweeping, vacuuming, and cleaning smudges off windows and doors", "1 Piece", "XAF.", "1000", "", "https://www.clean-hoouse.com/wp-content/uploads/2017/09/13.png");
        newList.add(product);
        product = new Product("5", "3", "Pampers", "Pampers Are Designed With Babies in Mind Disposable diapers have come a long", "1 Piece", "2000", "XAF.", "10% OFF", "https://cdn.bmstores.co.uk/images/hpcProductImage/imgFull/311448-Pampers-Baby-Dry-Size-4-Maxi-251.jpg");
        newList.add(product);
        return newList;
    }

    public List<Product> getPopularList() {
        Product product = new Product("6", "3", "Baby Oil", "Baby oil is a human-made mineral oil. Like petroleum jelly, baby oil is made from a byproduct that’s leftover when oil is refined. Baby oil is further refined until it’s safe for skin care and other beauty uses", "500 Ml", "XAF.", "31", "", "https://www.fortunaonline.net/media/catalog/product/cache/1/small_image/295x/040ec09b1e35df139433887a97daa66f/n/k/nkbcp12_-_xia-shib-ao-baby-oil-200ml.png");
        popularList.add(product);
        product = new Product("7", "4", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "10", "XAF.", "2000", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        popularList.add(product);
        product = new Product("8", "4", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "8", "XAF.", "1000", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        popularList.add(product);
        product = new Product("9", "5", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "6", "XAF.", "1500", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        popularList.add(product);
        product = new Product("10", "5", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "2", "XAF.", "300", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        popularList.add(product);
        product = new Product("11", "6", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "2", "XAF.", "350", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        popularList.add(product);
        product = new Product("12", "6", "Apple", "Sweet reddish and soft apple for your health full of vitamins. Red Apple is good for heart and memory functions well", "1", "XAF.", "250", "", "https://storage.googleapis.com/zopnow-static/images/products/320/fresh-apple-red-delicious-v-500-g.png");
        popularList.add(product);
        product = new Product("13", "1", "Litche", "Litchi fruits help to provide strength to your skin, hair, and nails. They have both anti-inflammatory and antioxidant properties. 4. Lychee fruit is rich in copper", "10.8G", "XAF.", "1500", "30%OFF", "https://cdn.shopify.com/s/files/1/0665/4989/products/lichee-485x400_grande.jpg");
        popularList.add(product);
        return popularList;
    }

    public List<Offer> getOfferList() {
        Offer offer = new Offer("http://1.bp.blogspot.com/-MMt-60IWEdw/VqZsh45Dv8I/AAAAAAAAMHg/70D9tVowlyc/s1600/askmegrocery-republic-day-offer.jpg");
        offerList.add(offer);
        offer = new Offer("http://www.lootkaro.com/wp-content/uploads/2016/05/as1.jpg");
        offerList.add(offer);
        offer = new Offer("https://453xbcknr3t3ahr522mms518-wpengine.netdna-ssl.com/wp-content/themes/iga-west/images/banner-save-more.jpg");
        offerList.add(offer);
        offer = new Offer("https://images-eu.ssl-images-amazon.com/images/G/31/img16/Grocery/SVD/July18/750x375.png");
        offerList.add(offer);
        offer = new Offer("https://images-eu.ssl-images-amazon.com/images/G/31/img16/Grocery/BreakfastStore/kmande_2018-06-15T12-00_f010a5_1121973_grocery_750x375.jpg");
        offerList.add(offer);
        offer = new Offer("http://www.enjoygrocery.com/images/enjoygrocery-offer.jpg");
        offerList.add(offer);


        return offerList;
    }
}
