package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class np extends mq<nq> {
    @Override // com.tencent.mapsdk.internal.mq
    public final /* synthetic */ mp<nq> a(nq nqVar) {
        return new no(this, nqVar);
    }

    public np(sh shVar) {
        super(shVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private mp<nq> a2(nq nqVar) {
        return new no(this, nqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.mq
    public synchronized no b(@NonNull nq nqVar) {
        return (no) super.b((np) nqVar);
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void f() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            no noVar = (no) this.c.get(this.c.keyAt(i));
            sh shVar = this.a;
            noVar.a(((Long) shVar.a((CallbackRunnable<sh.AnonymousClass67>) new sh.AnonymousClass67(noVar.a()), (sh.AnonymousClass67) 0L)).longValue());
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void g() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            no noVar = (no) this.e.get(this.e.keyAt(i));
            sh shVar = this.a;
            shVar.a(new sh.AnonymousClass69(noVar.b(), noVar.a()));
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
    public final void c() {
        int size = this.b.size();
        boolean m = this.a.m();
        for (int i = 0; i < size; i++) {
            m |= ((no) this.b.get(this.b.keyAt(i))).a().getIsAnimate();
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
