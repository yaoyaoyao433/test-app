package com.airbnb.lottie.model.layer;

import android.support.annotation.Nullable;
import com.airbnb.lottie.model.animatable.j;
import com.airbnb.lottie.model.animatable.k;
import com.airbnb.lottie.model.animatable.l;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    final List<com.airbnb.lottie.model.content.b> a;
    final com.airbnb.lottie.e b;
    final String c;
    public final long d;
    public final a e;
    final long f;
    @Nullable
    final String g;
    final List<com.airbnb.lottie.model.content.g> h;
    final l i;
    final int j;
    final int k;
    final int l;
    final float m;
    final float n;
    final int o;
    final int p;
    @Nullable
    final j q;
    @Nullable
    final k r;
    @Nullable
    final com.airbnb.lottie.model.animatable.b s;
    final List<com.airbnb.lottie.value.a<Float>> t;
    final int u;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class b {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        private static final /* synthetic */ int[] e = {a, b, c, d};

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    public d(List<com.airbnb.lottie.model.content.b> list, com.airbnb.lottie.e eVar, String str, long j, a aVar, long j2, @Nullable String str2, List<com.airbnb.lottie.model.content.g> list2, l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable j jVar, @Nullable k kVar, List<com.airbnb.lottie.value.a<Float>> list3, int i6, @Nullable com.airbnb.lottie.model.animatable.b bVar) {
        this.a = list;
        this.b = eVar;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = lVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = i4;
        this.p = i5;
        this.q = jVar;
        this.r = kVar;
        this.t = list3;
        this.u = i6;
        this.s = bVar;
    }

    public final String toString() {
        return a("");
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append("\n");
        d a2 = this.b.a(this.f);
        if (a2 != null) {
            sb.append("\t\tParents: ");
            sb.append(a2.c);
            d a3 = this.b.a(a2.f);
            while (a3 != null) {
                sb.append("->");
                sb.append(a3.c);
                a3 = this.b.a(a3.f);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.h.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.h.size());
            sb.append("\n");
        }
        if (this.j != 0 && this.k != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l)));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.b bVar : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(bVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
