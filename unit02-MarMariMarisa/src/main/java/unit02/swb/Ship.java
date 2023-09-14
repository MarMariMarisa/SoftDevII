// package unit02.swb;

// public class Ship {
    
//     private String name;
//     private int hullAmount;
//     private int shieldAmount;
//     private Weapon[] weapons;

//     public Ship(String name,int hullAmount,int shieldAmount,Weapon[] weapons){
//         this.name = name;
//         this.hullAmount = hullAmount;
//         this.shieldAmount = shieldAmount;
//         this.weapons = weapons;
//     }
//     public Ship(String name,int hullAmount){
//         this(name,hullAmount,0,null);
//     }

//     @Override
//     public String toString(){
//         return name + ": shields " + shieldAmount + ". hullAmount " + hullAmount;
        
//     }
//     @Override
//     public boolean equals(Object other){//x.equals(y)}

//         if (other instanceof Ship){
//             Ship otherShip = (Ship)other;
//             return this.name.equals(otherShip.name) && this.hullAmount == otherShip.hullAmount;

//         }
//     return false;
// }
