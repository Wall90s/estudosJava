package exe3;

public abstract class ConversaoDeUnidadesDeArea {
    public static final double METRO_EM_PES_QUADRADOS = 10.76;
    public static final double PE_QUADRADO_EM_CENTIMETROS_QUADRADOS = 929;
    public static final double MILHA_EM_ACRES = 640;
    public static final double ACRE_EM_PES_QUADRADOS = 43560;

    public static double converterMetrosParaPesQuadrados(double a){
        return METRO_EM_PES_QUADRADOS * a;
    }

    public static double converterPesQuadradosParaCentimetrosQuadrados(double a){
        return PE_QUADRADO_EM_CENTIMETROS_QUADRADOS * a;
    }

    public static double converterMilhasParaAcres(double a){
        return MILHA_EM_ACRES * a;
    }

    public static double converterAcresParaPesQuadrados(double a ){
        return ACRE_EM_PES_QUADRADOS * a;
    }

}
