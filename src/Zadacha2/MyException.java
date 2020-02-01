package Zadacha2;

    public class MyException extends Exception{
        public MyException(Throwable e) {
            initCause(e);
        }
    }

