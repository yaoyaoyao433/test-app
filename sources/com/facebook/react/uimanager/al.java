package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class al {
    private final SparseArray<af> a;
    protected com.facebook.react.common.e b;
    Map<Integer, af> c;
    private final SparseBooleanArray d;

    /* JADX INFO: Access modifiers changed from: protected */
    public al(al alVar) {
        this.c = new ConcurrentHashMap();
        this.a = alVar.a;
        this.d = alVar.d;
        this.b = alVar.b;
    }

    public al() {
        this.c = new ConcurrentHashMap();
        this.a = new SparseArray<>();
        this.d = new SparseBooleanArray();
        this.b = new com.facebook.react.common.e();
    }

    public final void b(af afVar) {
        this.b.a();
        int reactTag = afVar.getReactTag();
        this.a.put(reactTag, afVar);
        this.d.put(reactTag, true);
    }

    public final void c(int i) {
        this.b.a();
        if (i == -1) {
            return;
        }
        if (!this.d.get(i)) {
            throw new i("View with tag " + i + " is not registered as a root view");
        }
        this.a.remove(i);
        this.d.delete(i);
    }

    public final void c(af afVar) {
        this.b.a();
        this.a.put(afVar.getReactTag(), afVar);
    }

    public final void d(int i) {
        this.b.a();
        if (this.d.get(i)) {
            throw new i("Trying to remove root node " + i + " without using removeRootNode!");
        }
        this.a.remove(i);
        this.c.remove(Integer.valueOf(i));
    }

    public final af e(int i) {
        this.b.a();
        return this.a.get(i);
    }

    public final boolean f(int i) {
        this.b.a();
        return this.d.get(i);
    }

    public final int a() {
        this.b.a();
        return this.d.size();
    }

    public final int g(int i) {
        this.b.a();
        return this.d.keyAt(i);
    }
}
