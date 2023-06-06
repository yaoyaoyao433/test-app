package retrofit.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class MainThreadExecutor implements Executor {
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.handler.post(runnable);
    }
}
