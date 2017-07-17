/**
 * Created by nana1 on 6/30/2017.
 */

// allows action to perform on specific object
// use it to overide different functionality for specific objects that inheritated from base clas



class Movie {
    private String name; //field name

    //constructor
    public Movie(String name) {
        this.name = name;
    }

    //method plot()
    public String plot() {
        return "No plot here";
    }

    //getter
    public String getName() {
        return name;
    }
}


// class Jaws
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}


// class IndependenceDay
class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "ALiens attempt to take over the Earth";
    }
}

//class MazeRunner
class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape scary monsters";
    }
}

//class StarWars
class StarWars extends Movie {
    public StarWars() {
        super("star wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the world";
    }
}


//class Forgetable
class Forgetable extends Movie {
    public Forgetable() {
        super("forgetable");
    }

    // no plot method
}

//main class
public class Main {
    public static void main(String[] args) {
        for(int i= 1; i <11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : "+ movie.getName()+ "\n"
                    + "Plot: "+ movie.plot()+ "\n");
        }
    }

    // method randomMovie()
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random()*5)+1;
        System.out.println("random number generated was " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }




}
