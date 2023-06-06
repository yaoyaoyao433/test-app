package android.arch.lifecycle;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    @NonNull
    @MainThread
    public abstract b a();

    @MainThread
    public abstract void a(@NonNull e eVar);

    @MainThread
    public abstract void b(@NonNull e eVar);

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean a(@NonNull b bVar) {
            return compareTo(bVar) >= 0;
        }
    }
}
