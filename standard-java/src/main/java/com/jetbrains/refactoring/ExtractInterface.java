package com.jetbrains.refactoring;


public class ExtractInterface implements ExtractInterfaceName {
    public class Alpha{}
    public class Bravo{}
    public class Charlie{}
    public class Delta{}

    @Override
    public Bravo alphaBravo(Alpha a) {
        return new Bravo();
    }

    @Override
    public Delta charlieDelta(Charlie c) {
        return new Delta();
    }

    public class Echo implements com.jetbrains.refactoring.Echo {
        @Override
        public Bravo alphaBravo(Alpha a) {
            return new Bravo();
        }

        @Override
        public Delta charlieDelta(Charlie c) {
            return new Delta();
        }
    }
}
