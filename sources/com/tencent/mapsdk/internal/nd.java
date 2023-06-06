package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class nd extends mq<ne> {
    @Override // com.tencent.mapsdk.internal.mq
    public final /* synthetic */ mp<ne> a(ne neVar) {
        return new nc(this, neVar);
    }

    public nd(sh shVar) {
        super(shVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private mp<ne> a2(ne neVar) {
        return new nc(this, neVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.mq
    public synchronized nc b(@NonNull ne neVar) {
        return (nc) super.b((nd) neVar);
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void f() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            nc ncVar = (nc) this.c.get(this.c.keyAt(i));
            sh shVar = this.a;
            ncVar.a(((Long) shVar.a((CallbackRunnable<sh.AnonymousClass59>) new sh.AnonymousClass59(ncVar.a()), (sh.AnonymousClass59) 0L)).longValue());
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void h() {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.a.c(((mp) this.g.get(this.g.keyAt(i))).b());
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void g() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            nc ncVar = (nc) this.e.get(this.e.keyAt(i));
            sh shVar = this.a;
            shVar.a(new sh.AnonymousClass60(ncVar.b(), ncVar.a()));
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void c() {
        int size = this.b.size();
        boolean m = this.a.m();
        for (int i = 0; i < size; i++) {
            m |= ((nc) this.b.get(this.b.keyAt(i))).a().isAnimate();
        }
        if (m) {
            this.a.j.v = true;
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void e() {
        if (this.a.x()) {
            this.a.j.v = true;
        }
    }
}
