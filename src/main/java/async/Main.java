package async;

import io.vavr.control.Option;

public class Main {
    public static void main(String[] args) {
        AsyncTest.getCeoById("ceo_1").thenAccept(optCeo ->
                System.out.println(optCeo.getOrElse(() -> null))
        );

        AsyncTest.getEnterpriseByCeoId("ceo_1").thenAccept(optEnterprise ->
                System.out.println(optEnterprise.getOrElse(() -> null))
        );

        AsyncTest.getCEOAndEnterprise("ceo_1").thenAccept(tuple -> {
            Option<Ceo> ceoOpt = tuple._1;
            Option<Enterprise> enterpriseOpt = tuple._2;
            System.out.println("CEO: " + ceoOpt.getOrElse(() -> null));
            System.out.println("Enterprise: " + enterpriseOpt.getOrElse(() -> null));
        });
    }


}

// You can use join() on your CompletableFuture objects
// to block the main thread until the asynchronous computation is complete.
// or get()

