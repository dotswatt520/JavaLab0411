package com.cht.training;

enum OSType {
    IOS(1),Android(2),Linux(3),ChromeOS(4);

    private int id;

    private OSType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
class OSDetail{
    private OSType type;

    public OSDetail(OSType type) {
        this.type = type;
    }

    public void vendor(){
        switch (type){
            case IOS:
                System.out.println("APPLE");
            case Linux:
                System.out.println("RedHat");
            case Android:
                System.out.println("Google");
            case ChromeOS:
                System.out.println("Alphabet");
                System.out.println("Alphabet:"+type.getId());
        }
    }
}
public class Main14 {
    public static void main(String[] args) {
        OSDetail detail = new OSDetail(OSType.ChromeOS);
        detail.vendor();
    }
}
