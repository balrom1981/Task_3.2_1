package ru.netology.domain;

public class Post {
    private int id;
    private Title title;
    private MainInformation mainInformation;
    private Interaction interaction;

    public class Title {
        private String iconUrl;
        private String title;
        private boolean attached;
        private int time;
        private Complain complain;
        private boolean bookmark;

        public class Complain {
            private boolean spam;
            private boolean insult;
            private boolean forAdult;
            private boolean drugPromotion;
//            ...
//             + get/set на все поля
        }

//               + get/set на все поля

    }

    public class MainInformation {
        private String information;
        private String imageUrl;
        private String reference;

        //               + get/set на все

    }

    public class Interaction {
        private boolean likeOrNot;
        private String comment;
        private boolean share;

        //               + get/set на все
    }

    //               + get/set на все

}
