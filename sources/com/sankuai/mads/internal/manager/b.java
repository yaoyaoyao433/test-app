package com.sankuai.mads.internal.manager;

import kotlin.Metadata;
import kotlin.jvm.internal.h;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class b implements Runnable {
    private final /* synthetic */ kotlin.jvm.functions.a a;

    public b(kotlin.jvm.functions.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        h.a(this.a.invoke(), "invoke(...)");
    }
}
