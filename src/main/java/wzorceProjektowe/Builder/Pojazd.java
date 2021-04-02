package wzorceProjektowe.Builder;

public class Pojazd {
    private Integer id;
    private String marka;
    private Integer kola;
    private Integer poduszkiPowietrzne;
    private Integer predkoscMax;
    private String rejestracja;

    public static class Builder {
        private Integer id = null;
        private String marka = null;
        private Integer kola = null;
        private Integer poduszkiPowietrzne = null;
        private Integer predkoscMax = null;
        private String rejestracja = null;


        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder marka(String marka) {
            this.marka = marka;
            return this;
        }

    }

}
