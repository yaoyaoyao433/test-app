package com.facebook.react.uimanager;

import android.util.SparseArray;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m extends al {
    final SparseArray<af> a;
    private final Object d;

    public m(al alVar, Object obj) {
        super(alVar);
        this.b = new r();
        this.a = new SparseArray<>();
        this.d = obj;
    }

    public final af a(int i) {
        af afVar = this.a.get(i);
        if (afVar == null) {
            synchronized (this.d) {
                afVar = e(i);
                if (afVar != null) {
                    a(afVar);
                }
            }
        }
        return afVar;
    }

    public final void a(af afVar) {
        this.a.put(afVar.getReactTag(), afVar);
    }

    public final void b(int i) {
        this.a.remove(i);
    }
}
