package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class nj extends mq<nk> {
    @Override // com.tencent.mapsdk.internal.mq
    public final /* synthetic */ mp<nk> a(nk nkVar) {
        return new ni(this, nkVar);
    }

    public nj(sh shVar) {
        super(shVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private ni a2(nk nkVar) {
        return new ni(this, nkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.mq
    /* renamed from: b */
    public synchronized ni a(int i) {
        return (ni) super.a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.mq
    public synchronized ni b(@NonNull nk nkVar) {
        return (ni) super.b((nj) nkVar);
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void f() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ni niVar = (ni) this.c.get(this.c.keyAt(i));
            sh shVar = this.a;
            niVar.a(((Long) shVar.a((CallbackRunnable<sh.AnonymousClass50>) new sh.AnonymousClass50(niVar.a()), (sh.AnonymousClass50) 0L)).longValue());
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void g() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ni niVar = (ni) this.e.get(this.e.keyAt(i));
            sh shVar = this.a;
            shVar.a(new sh.AnonymousClass52(niVar.b(), niVar.a()));
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void h() {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.a.b(((ni) this.g.get(this.g.keyAt(i))).b());
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
