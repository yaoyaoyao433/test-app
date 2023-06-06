package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class nm extends mq<nn> {
    @Override // com.tencent.mapsdk.internal.mq
    public final /* synthetic */ mp<nn> a(nn nnVar) {
        return new nl(this, nnVar);
    }

    public nm(sh shVar) {
        super(shVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private mp<nn> a2(nn nnVar) {
        return new nl(this, nnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.mq
    public synchronized nl b(@NonNull nn nnVar) {
        return (nl) super.b((nm) nnVar);
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void f() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            nl nlVar = (nl) this.c.get(this.c.keyAt(i));
            sh shVar = this.a;
            nlVar.a(((Long) shVar.a((CallbackRunnable<sh.AnonymousClass65>) new sh.AnonymousClass65(nlVar.a()), (sh.AnonymousClass65) 0L)).longValue());
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void g() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            nl nlVar = (nl) this.e.get(this.e.keyAt(i));
            sh shVar = this.a;
            shVar.a(new sh.AnonymousClass66(nlVar.b(), nlVar.a()));
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
            m |= ((nl) this.b.get(this.b.keyAt(i))).a().isAnimate();
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
