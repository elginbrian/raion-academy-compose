package com.elginbrian.shopease

data class ProductEntity(
    val id: String,
    val name: String,
    val description: String,
    val rating: Double,
    val photoURL: String,
)

object ProductList {
    val products = listOf(
        ProductEntity(
            id = "1",
            name = "Sports Shoes",
            description = "Lightweight sports shoes with breathable mesh and cushioned soles for running and casual wear.",
            rating = 4.7,
            photoURL = "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//103/MTA-60964257/brd-54034_sepatu-sneakers-pria-olahraga-sport-shoes-casual-running_full01.jpg"
        ),
        ProductEntity(
            id = "2",
            name = "Digital Watch",
            description = "Stylish digital watch with stopwatch, alarm, and water-resistant up to 50 meters.",
            rating = 4.5,
            photoURL = "https://m.media-amazon.com/images/I/81Ub94zEseL.jpg"
        ),
        ProductEntity(
            id = "3",
            name = "Bluetooth Speaker",
            description = "Portable Bluetooth speaker with 360-degree sound and up to 12 hours of battery life.",
            rating = 4.6,
            photoURL = "https://down-id.img.susercontent.com/file/40a83134c52ce31b4bfcdc798238813b"
        ),
        ProductEntity(
            id = "4",
            name = "Backpack",
            description = "Durable and waterproof backpack with multiple compartments, ideal for travel and work.",
            rating = 4.4,
            photoURL = "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full/catalog-image/87/MTA-154003324/brd-44261_tas-ransel-wanita-backpack-korea-pink-martena-ta632p3-gendong-punggung-sekolah-remaja-kuliah-kerja-premium-cewek-murah-fashion-branded-batam-ori-besar_full01-3e44da85.jpg"
        ),
        ProductEntity(
            id = "5",
            name = "Stainless Steel Water Bottle",
            description = "500ml stainless steel water bottle with a vacuum insulation feature to keep drinks hot or cold.",
            rating = 4.8,
            photoURL = "https://down-id.img.susercontent.com/file/id-11134207-7r98s-lljai49lvaxec3"
        ),
        ProductEntity(
            id = "6",
            name = "Desk Lamp",
            description = "LED desk lamp with adjustable brightness levels and a flexible neck for focused lighting.",
            rating = 4.3,
            photoURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS05nlXOXzJKAHHmgGrSwygkOtGhdqztZ9TMA&s"
        ),
        ProductEntity(
            id = "7",
            name = "Wireless Keyboard and Mouse",
            description = "Compact wireless keyboard and mouse combo, perfect for home or office use.",
            rating = 4.5,
            photoURL = "https://images.tokopedia.net/img/cache/700/VqbcmM/2022/10/24/0057fc27-12f4-46aa-9c60-3101cb09edbb.jpg"
        ),
        ProductEntity(
            id = "8",
            name = "Casual T-Shirt",
            description = "100% cotton casual t-shirt available in multiple colors and sizes.",
            rating = 4.2,
            photoURL = "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//catalog-image/91/MTA-121073480/no-brand_no-brand_full01.jpg"
        ),
        ProductEntity(
            id = "9",
            name = "Cookware Set",
            description = "Non-stick cookware set including frying pans and saucepans, ideal for healthy cooking.",
            rating = 4.7,
            photoURL = "https://id-test-11.slatic.net/p/6856f60af95869f66b48730ec0b2a487.jpg"
        ),
        ProductEntity(
            id = "10",
            name = "Wireless Charger",
            description = "Fast wireless charger compatible with most smartphones and AirPods.",
            rating = 4.4,
            photoURL = "https://cworld.id/wp-content/uploads/2022/12/fd8831d8-6545-40ac-ac92-b0b86a5fe7b7.jpg"
        )
    )
}

