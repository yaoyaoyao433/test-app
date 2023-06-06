package com.tencent.mapsdk.internal;

import java.util.ArrayList;
import java.util.Iterator;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hs extends hn {
    private ArrayList<hn> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private hs(hn... hnVarArr) {
        super(0L);
        long j = 0;
        this.g = new ArrayList<>();
        for (int i = 0; i < hnVarArr.length; i++) {
            this.g.add(hnVarArr[i]);
            j += hnVarArr[i].a();
        }
        this.e = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.internal.hn
    public final void d() {
        super.d();
        Iterator<hn> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.tencent.mapsdk.internal.hn
    public final void b() {
        super.b();
        Iterator<hn> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.tencent.mapsdk.internal.hn
    public final boolean c() {
        Iterator<hn> it = this.g.iterator();
        while (it.hasNext()) {
            if (!it.next().c()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mapsdk.internal.hn
    public final void a(GL10 gl10) {
        a(gl10, 0L);
    }

    @Override // com.tencent.mapsdk.internal.hn
    protected final void a(GL10 gl10, long j) {
        if (this.g == null || this.g.isEmpty()) {
            return;
        }
        Iterator<hn> it = this.g.iterator();
        while (it.hasNext()) {
            hn next = it.next();
            if (!next.c()) {
                next.a(gl10);
                return;
            }
        }
    }
}
