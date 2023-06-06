package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public final Set<com.bumptech.glide.request.c> a = Collections.newSetFromMap(new WeakHashMap());
    public final List<com.bumptech.glide.request.c> b = new ArrayList();
    public boolean c;

    public final void a() {
        this.c = true;
        for (com.bumptech.glide.request.c cVar : com.bumptech.glide.util.h.a(this.a)) {
            if (cVar.e()) {
                cVar.d();
                this.b.add(cVar);
            }
        }
    }

    public final void b() {
        this.c = false;
        for (com.bumptech.glide.request.c cVar : com.bumptech.glide.util.h.a(this.a)) {
            if (!cVar.f() && !cVar.h() && !cVar.e()) {
                cVar.b();
            }
        }
        this.b.clear();
    }
}
