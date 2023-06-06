package retrofit;

import com.sankuai.waimai.launcher.util.aop.b;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public abstract class CallbackRunnable<T> implements Runnable {
    private final Callback<T> callback;
    private final Executor callbackExecutor;
    private final ErrorHandler errorHandler;

    public abstract ResponseWrapper obtainResponse();

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallbackRunnable(Callback<T> callback, Executor executor, ErrorHandler errorHandler) {
        this.callback = callback;
        this.callbackExecutor = executor;
        this.errorHandler = errorHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            final ResponseWrapper obtainResponse = obtainResponse();
            b.a(this.callbackExecutor, new Runnable() { // from class: retrofit.CallbackRunnable.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    CallbackRunnable.this.callback.success(obtainResponse.responseBody, obtainResponse.response);
                }
            });
        } catch (RetrofitError e) {
            e = e;
            Throwable handleError = this.errorHandler.handleError(e);
            if (handleError != e) {
                e = RetrofitError.unexpectedError(e.getUrl(), handleError);
            }
            b.a(this.callbackExecutor, new Runnable() { // from class: retrofit.CallbackRunnable.2
                @Override // java.lang.Runnable
                public void run() {
                    CallbackRunnable.this.callback.failure(e);
                }
            });
        }
    }
}
