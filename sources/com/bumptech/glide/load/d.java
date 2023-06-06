package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.l;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d<T> implements g<T> {
    private final Collection<? extends g<T>> a;
    private String b;

    @SafeVarargs
    public d(g<T>... gVarArr) {
        if (gVarArr.length <= 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.a = Arrays.asList(gVarArr);
    }

    @Override // com.bumptech.glide.load.g
    public final l<T> a(l<T> lVar, int i, int i2) {
        l<T> lVar2 = lVar;
        for (g<T> gVar : this.a) {
            l<T> a = gVar.a(lVar2, i, i2);
            if (lVar2 != null && !lVar2.equals(lVar) && !lVar2.equals(a)) {
                lVar2.d();
            }
            lVar2 = a;
        }
        return lVar2;
    }

    @Override // com.bumptech.glide.load.g
    public final String a() {
        if (this.b == null) {
            StringBuilder sb = new StringBuilder();
            for (g<T> gVar : this.a) {
                sb.append(gVar.a());
            }
            this.b = sb.toString();
        }
        return this.b;
    }
}
