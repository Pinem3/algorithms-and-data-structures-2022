package ru.mirea.practice.task2;

public enum Size {
    XXS(32) {
        @Override
        public void getDescription() {
            System.out.println("Детский размер");
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private final int clotheSize;
    Size(int clotheSize) {
        this.clotheSize = clotheSize;
    }

    public void getDescription() {
        System.out.println("Взрослый размер" + clotheSize);
    }
}
