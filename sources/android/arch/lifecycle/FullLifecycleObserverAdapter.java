package android.arch.lifecycle;

import android.arch.lifecycle.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements GenericLifecycleObserver {
    private final FullLifecycleObserver a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.a = fullLifecycleObserver;
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public final void a(f fVar, d.a aVar) {
        switch (aVar) {
            case ON_CREATE:
                return;
            case ON_START:
                return;
            case ON_RESUME:
                return;
            case ON_PAUSE:
                return;
            case ON_STOP:
                return;
            case ON_DESTROY:
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
