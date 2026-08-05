package io.cetrax.grpc;

import io.cetrax.Cetrax;

import java.io.IOException;

public class Test {

    public static void main(String args[]) throws IOException {
        final Cetrax cetrax = new CetraxOnGrpc("cetrax.casp.prd-samtwo.prd.slb.sfdc.net:11983");
//        cetrax.objects().drop("test");
//        cetrax.objects().create("test");
        System.out.println(cetrax.objects().size("test"));
        for (int i = 0; i < 100_000; ++i) {
            try {
                long start = System.currentTimeMillis();
                System.out.println("size: " + cetrax.objects().size("configs"));
                cetrax.objects().get("test", "foo");
                long end = System.currentTimeMillis();
                System.out.println(end - start);
            } catch (Exception e) {
                System.out.println("iteration " + i);
                e.printStackTrace();
            }
        }
        System.out.println(cetrax.objects().size("test"));
        cetrax.objects().drop("test");
    }
}
