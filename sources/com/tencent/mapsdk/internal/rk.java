package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rk {
    public final int a;
    public final int b;
    private final String c = "_night";
    private final List<rq> d = new CopyOnWriteArrayList();

    public rk(int i, int i2, List<rq> list) {
        this.a = i;
        this.b = i2;
        this.d.addAll(list);
        Collections.sort(list, new Comparator<rq>() { // from class: com.tencent.mapsdk.internal.rk.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(rq rqVar, rq rqVar2) {
                return rqVar2.a() - rqVar.a();
            }

            private static int a(rq rqVar, rq rqVar2) {
                return rqVar2.a() - rqVar.a();
            }
        });
    }

    public final Object[] a(ft ftVar, boolean z) {
        for (rq rqVar : this.d) {
            if (rqVar.a(ftVar)) {
                Bitmap a = rqVar.a(z);
                StringBuilder sb = new StringBuilder();
                sb.append(rqVar.c);
                sb.append(z ? "_night" : "");
                String sb2 = sb.toString();
                return (!z || rqVar.e == null || rqVar.e.length() <= 0) ? new Object[]{sb2, rqVar.d, a} : new Object[]{sb2, rqVar.e, a};
            }
        }
        return null;
    }

    private int a() {
        return this.a;
    }

    private int b() {
        return this.b;
    }
}
