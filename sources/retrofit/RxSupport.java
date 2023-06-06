package retrofit;

import com.sankuai.waimai.launcher.util.aop.b;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import rx.d;
import rx.j;
import rx.subscriptions.e;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class RxSupport {
    private final ErrorHandler errorHandler;
    private final Executor executor;
    private final RequestInterceptor requestInterceptor;

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface Invoker {
        ResponseWrapper invoke(RequestInterceptor requestInterceptor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RxSupport(Executor executor, ErrorHandler errorHandler, RequestInterceptor requestInterceptor) {
        this.executor = executor;
        this.errorHandler = errorHandler;
        this.requestInterceptor = requestInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d createRequestObservable(final Invoker invoker) {
        return d.a((d.a) new d.a<Object>() { // from class: retrofit.RxSupport.1
            @Override // rx.functions.b
            public void call(j<? super Object> jVar) {
                RequestInterceptorTape requestInterceptorTape = new RequestInterceptorTape();
                RxSupport.this.requestInterceptor.intercept(requestInterceptorTape);
                FutureTask futureTask = new FutureTask(RxSupport.this.getRunnable(jVar, invoker, requestInterceptorTape), null);
                jVar.add(e.a(futureTask));
                b.a(RxSupport.this.executor, futureTask);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getRunnable(final j<? super Object> jVar, final Invoker invoker, final RequestInterceptorTape requestInterceptorTape) {
        return new Runnable() { // from class: retrofit.RxSupport.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (jVar.isUnsubscribed()) {
                        return;
                    }
                    jVar.onNext(invoker.invoke(requestInterceptorTape).responseBody);
                    jVar.onCompleted();
                } catch (RetrofitError e) {
                    jVar.onError(RxSupport.this.errorHandler.handleError(e));
                }
            }
        };
    }
}
