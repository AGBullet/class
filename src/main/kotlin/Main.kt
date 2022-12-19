fun main(args: Array<String>) {
    val animals = listOf(Cat("рыба","дом",true),
        Dog("мясо","улица",false),
        Horse("морковь","стойло",true))

    val doctor : Doctor = Doctor();

    for (animal in animals)
    {
        doctor.treatAnimal(animal);
    }
}