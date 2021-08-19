import android.graphics.Bitmap

interface MilitaryBranch{
    var ranks: List<Rank>
    var uniform: Uniform
    var people: List<Person>

    fun fight(ranksToFight: List<Rank>)
    fun march()
    fun bingeDrink()

}
class Person(var rank: Rank, heightInInches: Int, weightInPounds: Int)
class Rank(var title: String, var pay: Int, var collarDevice: CollarDevice)

class CollarDevice(var logo: String)

class Uniform(var camoflage: Camoflage, var size: Size)

enum class Camoflage{
    WoodLand,
    Desert,
    NavyBlue,
}
enum class Size{
    Small,
    Medium,
    Large,
}

class CoastGuard: MilitaryBranch {
    override var ranks: List<Rank> = listOf(
        Rank("pettyOfficer", 4, CollarDevice("yellow and blue")),
        Rank("captain", 8, CollarDevice("red and pink")),
        Rank("admiral", 10, CollarDevice("black and red")),
        Rank("private", 2, CollarDevice("orange")),
        Rank("corporal", 3, CollarDevice("pink")),
    )

    override var uniform: Uniform = Uniform(Camoflage.NavyBlue, Size.Medium)

    override var people: List<Person> = listOf(
        Person(Rank("pettyOfficer", 4, CollarDevice("yellow and blue")), 69, 200),
        Person(Rank("captain", 8, CollarDevice("red and pink")), 669, 400),
        Person(Rank("private", 2, CollarDevice("orange")), 420, 169),
    )


    override fun fight(ranksToFight: List<Rank>) {
        var fightersList = mutableListOf<Person>()
        for(rank in ranksToFight){
            for(person in people){
                if(person.rank.pay == rank.pay){
                    fightersList.add(person)
                }
            }
        }
        println(fightersList)
    }

    override fun march() {
        println("Coastie March")
    }

    override fun bingeDrink() {
        println("beer plx thx u i have a dependency on this because of my time in the military")
    }
}

