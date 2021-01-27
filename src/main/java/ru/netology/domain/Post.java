package ru.netology.domain;

public class Post {
    private int idOwner;
    private int idPost;
    private Title title;
    private MainInformation mainInformation;
    private Interaction interaction;

    public class Title {
        private String iconUrl;
        private String title;
        private boolean attached;
        private int date;
        private Complain complain;
        private boolean bookmark;

        public class Complain {
            private boolean canComplain;
            private int idFrom;
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
        private Like like;
        private Comment comment;
        private Share share;
        private int countView;

        public class Like {
            private boolean canLike;
            private int idAuthor;
            private boolean likeOrNot;
            private int countLike;
        }

        public class Comment {
            private boolean canPost;
            private int idAuthor;
            private String textComment;
            private int countComment;
        }

        public class Share {
            private boolean canShare;
            private int idAuthor;
            private boolean share;
            private int countShare;
        }

        //               + get/set на все
    }

    //               + get/set на все

}
