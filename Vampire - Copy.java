class Vampire extends Monster
{
   public void frightenWithFriend(Monster m)
   {
      System.out.println("(c) Vampire instigator with Monster friend.");
   }

   public void frightenWithFriend(Vampire v)
   {
      System.out.println("(d) Vampire instigator with Vampire friend.");
   }
}
