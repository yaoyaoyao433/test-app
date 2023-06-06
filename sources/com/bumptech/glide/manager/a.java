package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements g {
    private final Set<h> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    @Override // com.bumptech.glide.manager.g
    public final void a(h hVar) {
        this.a.add(hVar);
        if (this.c) {
            hVar.e();
        } else if (this.b) {
            hVar.c();
        } else {
            hVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b = true;
        for (h hVar : com.bumptech.glide.util.h.a(this.a)) {
            hVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b = false;
        for (h hVar : com.bumptech.glide.util.h.a(this.a)) {
            hVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.c = true;
        for (h hVar : com.bumptech.glide.util.h.a(this.a)) {
            hVar.e();
        }
    }
}
