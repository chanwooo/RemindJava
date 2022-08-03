package com.company;

public class OverloadingAndFriends {
    public static void main(String[] args) {

        Marine marine1 = new Marine("송이1");
        marine1.stop();
        System.out.println(marine1);
        marine1.useStimPack();
        marine1.useStimPack();
        marine1.useStimPack();
        marine1.useStimPack();
        marine1.hold();
        marine1.patrol(new Coord(1.1, 1.1));
        System.out.println(marine1);

        Marine marine2 = new Marine("송이2");
        marine1.attack(marine2);
        System.out.println(marine2);
    }
}

interface Unit {
    void move(Coord pos);
    void stop();
    void attack(UnitImpl target);
    void patrol(Coord pos);
    void hold();
}

class UnitImpl implements Unit {

    protected String name;
    protected int hp;
    protected int damage;
    protected int attackDelay;
    protected int attackRange;
    protected int armor;
    protected int sight;
    protected double moveSpeed;
    protected Coord pos = null;
    //지상, 공중유닛
    //공격 대상 (지대공 지대지)
    //공격범위(스플레시)


    UnitImpl() {
        pos = new Coord(0.0, 0.0);
    }

    @Override
    public void move(Coord pos) {
        this.pos = pos;
        System.out.println("move to " + this.pos + "to" + pos);
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void attack(UnitImpl target) {
        System.out.println(target);
        target.hp -= damage;
        System.out.println("attack: " + this.name + " -> " + target.name);
        System.out.println(target);
    }


    @Override
    public void patrol(Coord pos) {
        System.out.println("patrol " + this.pos + " <-> " + pos);
    }

    @Override
    public void hold() {
        System.out.println("hold position!");
    }

    @Override
    public String toString() {
        return "name : " + this.name + ", hp : " + this.hp;
    }

}

class Marine extends UnitImpl {

    Marine() {
        this.name = "Terran Marine";
        this.hp = 40;
        this.damage = 6;
        this.attackDelay = 15;
        this.attackRange = 4;
        this.sight = 7;
        this.moveSpeed = 1.8;
        System.out.println("한판 붙어볼까, 애송이?");
    }

    Marine(String name) {
        this();
        this.name = name;
    }


    public void useStimPack() {
        if (this.hp <= 10) {
            System.out.println("not enough hp");
            return;
        }
        this.hp -= 10;
        System.out.println("Stim Pack!");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "name : " + this.name + ", hp : " + this.hp + ", damage : " + this.damage;
    }
}

class Coord {
    double x;
    double y;

    Coord(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[x : " + x + "y : " + y + "]";
    }
}
