package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class nf extends mq<nh> {
    @Override // com.tencent.mapsdk.internal.mq
    public final /* synthetic */ mp<nh> a(nh nhVar) {
        return new ng(this, nhVar);
    }

    public nf(sh shVar) {
        super(shVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private ng a2(nh nhVar) {
        return new ng(this, nhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.mq
    public synchronized ng b(@NonNull nh nhVar) {
        return (ng) super.b((nf) nhVar);
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void f() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ng ngVar = (ng) this.c.get(this.c.keyAt(i));
            sh shVar = this.a;
            ngVar.a(((Long) shVar.a((CallbackRunnable<sh.AnonymousClass73>) new sh.AnonymousClass73(ngVar.a()), (sh.AnonymousClass73) 0L)).longValue());
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void g() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ng ngVar = (ng) this.e.get(this.e.keyAt(i));
            sh shVar = this.a;
            shVar.a(new sh.AnonymousClass74(ngVar.b(), ngVar.a()));
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void h() {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.a.b(((mp) this.g.get(this.g.keyAt(i))).b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(long j) {
        if (this.a == null || j == 0) {
            return 0;
        }
        return this.a.a(j);
    }
}
