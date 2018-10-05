package com.example.hp.wehack;

public class Message {
    private String text;
    private MemberData data;
    private boolean belongsToCurrentUser;

    public Message(String text, MemberData data, boolean belongsToCurrentUser) {
        this.text = text;
        this.data = data;
        this.belongsToCurrentUser = belongsToCurrentUser;
//        if(belongsToCurrentUser==false){
//            this.text = translate(kn,text);
//        }
//        else{
//            this.text = translate(pa,text);
//        }
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MemberData getData() {
        return data;
    }

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
    }
}