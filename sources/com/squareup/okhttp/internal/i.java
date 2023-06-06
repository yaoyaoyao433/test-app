package com.squareup.okhttp.internal;

import com.squareup.okhttp.ab;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i {
    private final Set<ab> a = new LinkedHashSet();

    public final synchronized void a(ab abVar) {
        this.a.add(abVar);
    }

    public final synchronized void b(ab abVar) {
        this.a.remove(abVar);
    }

    public final synchronized boolean c(ab abVar) {
        return this.a.contains(abVar);
    }
}
