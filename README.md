[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/jaiERqTP)
# UG 4 Inheritance

![img_1.png](img_1.png)

## Penjelasan Class

### Colokan
- Berbentuk abstract class. properti class bisa dilihat di class diagram.
- Buatlah juga getter dan setternya. 
- Class ini mempunyai abstract method bernama getRealBandwidth yang akan di-<b>OVERRIDE</b> oleh class __VGA__ dan __HDMI__ yang meng-extend dari kelas Colokan.
### HDMI
- Class ini meng-_extend_ dari kelas Colokan. karena sudah meng-extend dari kelas Colokan, Anda hanya perlu membuat konstruktor yang sama dengan class Colokan dan meng-override method getRealBandWidth.
- __getRealBandWidth__
    
    di Class Colokan, ada properti __promisedBandwidth__. Meskipun begitu, terkadang bandwidth aslinya tidak sesuai dengan bandwidth yang sudah dijanjikan. Oleh karena itu, method ini berfungsi untuk mengembalikan nilai bandwidth yang sesungguhnya.

    cara mencarinya: dari properti harga, hitunglah rasionya dengan harga pasaran, yaitu Rp. 50.000. Misal, harga kabel 30.000, dengan promisedBandwidthnya 50mbps, maka rasionya adalah 30.000/50.000 => 3/5. Nah, jika rasionya kurang dari 1, maka bandwidth-nya dikalikan dengan rasionya. dalam kasus ini, karena 3/5 lebih kecil dari 1, maka bandwidth aslinya adalah 3/5 * promisedBandwidth => __3/5 * 50mbps = 30mbps__. Kalau misalnya harga kabel adalah 60.000, maka 60.000/50.000 adalah 6/5. Karena 6/5 > 1, maka bandwidth aslinya sama dengan bandwidth yang dijanjikan.
    
### VGA
- sama kek di atas, cuma __harga pasarannya diganti 30.000__
### TV
- buatlah kelas TV sesuai dengan class diagram di atas. Untuk kelas ini tidak usah pakai getter dan setter. Hanya perlu bikin method connect dan sebuah konstruktor seperti di class diagram. 
- __connect(Colokan : colokan)__
    menerima parameter berupa colokan. method ini berfungsi mengisi properti colokan dengan parameter yang sudah diberikan.  Printlah sebuah pesan jika menjalankan method ini! (_System.out.println("Berhasil Connect ke - " + colokan.getMerk()_))

# OUTPUT

![img_2.png](img_2.png)