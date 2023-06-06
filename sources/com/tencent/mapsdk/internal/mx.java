package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mx extends mq<my> {
    @Override // com.tencent.mapsdk.internal.mq
    public final /* synthetic */ mp<my> a(my myVar) {
        return new mw(this, myVar);
    }

    public mx(sh shVar) {
        super(shVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private mp<my> a2(my myVar) {
        return new mw(this, myVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.mq
    public synchronized mw b(@NonNull my myVar) {
        return (mw) super.b((mx) myVar);
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void f() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            mw mwVar = (mw) this.c.get(this.c.keyAt(i));
            sh shVar = this.a;
            mwVar.a(((Long) shVar.a((CallbackRunnable<sh.AnonymousClass63>) new sh.AnonymousClass63(mwVar.a()), (sh.AnonymousClass63) 0L)).longValue());
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
            mw mwVar = (mw) this.e.get(this.e.keyAt(i));
            sh shVar = this.a;
            shVar.a(new sh.AnonymousClass64(mwVar.b(), mwVar.a()));
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void c() {
        int size = this.b.size();
        boolean m = this.a.m();
        for (int i = 0; i < size; i++) {
            m |= ((mw) this.b.get(this.b.keyAt(i))).a().getIsAnimate();
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
