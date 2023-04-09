class ReVamp
{
   public static void whichFWF(Monster m1, Monster m2)
   {
      m1.frightenWithFriend(m2);
   }
   public static void main(String [] args)
   {
      Vampire v1 = new Vampire();
      Vampire v2 = new Vampire();

      Monster m1 = new Monster();
      Monster m2 = new Monster();

      Monster mv1 = new Vampire();
      Monster mv2 = new Vampire();

      System.out.println("===Part 1: Vampire References, Vampire Objects===");

      whichFWF(v1, v2);
      v1.frightenWithFriend(v2);

      System.out.println("===Part 2: Monster References, Monster Objects===");

      whichFWF(m1, m2);
      m1.frightenWithFriend(m2);

      System.out.println("===Part 3: Mixed Company===");

      m1.frightenWithFriend(v1);
      v1.frightenWithFriend(m1);

      System.out.println("===Part 4: Monster References, Vampire Objects===");

      whichFWF(mv1, mv2);
      mv1.frightenWithFriend(mv2);

      System.out.println("===Part 5: Total Mayhem===");

      mv1.frightenWithFriend(m1);
      mv1.frightenWithFriend(v1);
      whichFWF(mv1, v1);
      m1.frightenWithFriend(mv1);
      v1.frightenWithFriend(mv1);

      System.out.println();
   }
}
