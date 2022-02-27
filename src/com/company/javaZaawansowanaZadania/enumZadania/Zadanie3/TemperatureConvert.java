package com.company.javaZaawansowanaZadania.enumZadania.Zadanie3;

public enum TemperatureConvert implements Converter{

    C_F("C", "F",new Converter()    {
        @Override
        public float convert(float tempIn) {
            return (tempIn  * 1.8f) + 32f;
        }
    }),
    C_K("C", "K",new Converter()    {
        @Override
        public float convert(float tempIn) {
            return tempIn + 274.15f;
        }
    }),
    K_C("K", "C",new Converter()    {
        @Override
        public float convert(float tempIn) {
            return tempIn - 272.15f;
        }
    }),
    F_C("F", "C",new Converter()    {
        @Override
        public float convert(float tempIn) {
            return (tempIn -32f) / 1.8f;
        }
    }),
    F_K("F", "K",new Converter()    {
        @Override
        public float convert(float tempIn) {
            return (((tempIn -32f)*5)/9) + 273.15f;
        }
    }),
    K_F("K", "F",new Converter()    {
        @Override
        public float convert(float tempIn) {
            return tempIn - 457.87f;
        }
    }),;

    private String tempIn;
    private String tempOut;
    private Converter converter;

    TemperatureConvert(String tempIn, String tempOut, Converter converter) {
        this.tempIn = tempIn;
        this.tempOut = tempOut;
        this.converter = converter;
    }

    public static float tempertureConvert(String tempIn, String tempOut, float temp){
        float exitTemp = 0f;
        for(TemperatureConvert tempConv : TemperatureConvert.values()){
            if(tempIn.equals(tempConv.getTempIn()) && tempOut.equals(tempConv.getTempOut())){
                exitTemp = tempConv.converter.convert(temp);
            }
        }return exitTemp;
    }

    public void setConverter(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return converter;
    }

    public String getTempIn() {
        return tempIn;
    }

    public void setTempIn(String tempIn) {
        this.tempIn = tempIn;
    }

    public String getTempOut() {
        return tempOut;
    }

    public void setTempOut(String tempOut) {
        this.tempOut = tempOut;
    }

    @Override
    public float convert(float tempIn) {
        return 0;
    }

//    Converter c_fConverter = new Converter() {
//        @Override
//        public float convert(float tempIn) {
//            return tempIn * 33.8f;
//        }
//    };



}
