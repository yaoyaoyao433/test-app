package android.arch.lifecycle;

import android.arch.lifecycle.a;
import android.arch.lifecycle.d;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {
    private final Object a;
    private final a.C0001a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = a.a.b(this.a.getClass());
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    public final void a(f fVar, d.a aVar) {
        a.C0001a c0001a = this.b;
        Object obj = this.a;
        a.C0001a.a(c0001a.a.get(aVar), fVar, aVar, obj);
        a.C0001a.a(c0001a.a.get(d.a.ON_ANY), fVar, aVar, obj);
    }
}
