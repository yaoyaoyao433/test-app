package com.airbnb.lottie;

import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.WorkerThread;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public Map<String, List<com.airbnb.lottie.model.layer.d>> b;
    Map<String, g> c;
    public Map<String, com.airbnb.lottie.model.c> d;
    public SparseArrayCompat<com.airbnb.lottie.model.d> e;
    LongSparseArray<com.airbnb.lottie.model.layer.d> f;
    public List<com.airbnb.lottie.model.layer.d> g;
    public Rect h;
    public float i;
    public float j;
    public float k;
    public final m a = new m();
    private final HashSet<String> l = new HashSet<>();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void a(String str) {
        this.l.add(str);
    }

    public final void a(boolean z) {
        this.a.a = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final com.airbnb.lottie.model.layer.d a(long j) {
        return this.f.get(j);
    }

    public final float a() {
        return (b() / this.k) * 1000.0f;
    }

    public final float b() {
        return this.j - this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (com.airbnb.lottie.model.layer.d dVar : this.g) {
            sb.append(dVar.a("\t"));
        }
        return sb.toString();
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {
        @WorkerThread
        @Nullable
        @Deprecated
        public static e a(String str) {
            return f.a(str, (String) null).a;
        }
    }
}
