abstract class Bharatvanshi {
        public abstract void fight();

    
    public abstract void obey();

   
    public abstract void kind();
}

class Pandav extends Bharatvanshi {
    @Override
    public void fight() {
        System.out.println("Pandav fights bravely.");
    }

    @Override
    public void obey() {
        System.out.println("Pandav is obedient.");
    }

    @Override
    public void kind() {
        System.out.println("Pandav is kind.");
    }
}

class Kaurav extends Bharatvanshi {
    @Override
    public void fight() {
        System.out.println("Kaurav fights fiercely.");
    }

    @Override
    public void obey() {
        System.out.println("Kaurav disobeys.");
    }

    @Override
    public void kind() {
        System.out.println("Kaurav is cruel.");
    }
}

class Arjun extends Pandav {
    }

class Bheem extends Pandav {
    @Override
    public void kind() {
        System.out.println("Bheem is less kind but still obedient.");
    }
}

class Duryodhan extends Kaurav {
   
}

class Vikarn extends Kaurav {
    @Override
    public void obey() {
        System.out.println("Vikarn is obedient.");
    }

    @Override
    public void kind() {
        System.out.println("Vikarn is kind.");
    }
}

public class MahabharatTest {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}