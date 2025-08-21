# 📘 Praktikum OOP Java – Inheritance 2 Tingkat

## 📝 Deskripsi
Repository ini berisi tugas kuliah **Pemrograman Berorientasi Objek (OOP)** dengan topik **Inheritance (pewarisan) 2 tingkat** menggunakan bahasa pemrograman **Java**.  

Inheritance (pewarisan) memungkinkan sebuah class mewarisi atribut dan method dari class lain. Pada tugas ini digunakan **multi-level inheritance**, yaitu pewarisan bertingkat hingga dua level (**superclass → subclass → subclass lanjutan**).

---

## 📂 Struktur Folder
`
├── Building/ // Contoh 1: Bangunan
│ ├── Building.java
│ ├── House.java
│ └── SmartHouse.java
│
├── Example 1/ // Contoh 2: Kendaraan
│ ├── Vehicle.java
│ ├── Car.java
│ └── SportCar.java
│
└── Ecample 2/ // Contoh 3: Elektronik
├── Electronic.java
├── Laptop.java
└── LaptopGaming.java
`

---

## 📌 Contoh 1 – Bangunan 🏢🏠
**Folder:** `Building/`  
- `Building.java` → class induk.  
- `House.java` → subclass dari `Building`.  
- `SmartHouse.java` → subclass dari `House`.  

---

## 📌 Contoh 2 – Kendaraan 🚗🏎️
**Folder:** `Example 1/`  
- `Vehicle.java` → class induk.  
- `Car.java` → subclass dari `Vehicle`.  
- `SportCar.java` → subclass dari `Car`.  

---

## 📌 Contoh 3 – Elektronik 💻🎮
**Folder:** `Ecample 2/`  
- `Electronic.java` → class induk.  
- `Laptop.java` → subclass dari `Electronic`.  
- `LaptopGaming.java` → subclass dari `Laptop`.  

---

## 🎯 Tujuan Pembelajaran
- Memahami konsep **multi-level inheritance** dalam OOP.  
- Menerapkan pewarisan untuk membuat kode yang lebih modular.  
- Menunjukkan bagaimana subclass dapat menambahkan atau memodifikasi perilaku superclass.  
