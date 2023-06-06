package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mv extends mq<mu> {
    @Override // com.tencent.mapsdk.internal.mq
    public final /* synthetic */ mp<mu> a(mu muVar) {
        return new mt(this, muVar);
    }

    public mv(sh shVar) {
        super(shVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private mp<mu> a2(mu muVar) {
        return new mt(this, muVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.mq
    public synchronized mt b(@NonNull mu muVar) {
        return (mt) super.b((mv) muVar);
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void f() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            mt mtVar = (mt) this.c.get(this.c.keyAt(i));
            sh shVar = this.a;
            mtVar.a(((Long) shVar.a((CallbackRunnable<sh.AnonymousClass56>) new sh.AnonymousClass56(mtVar.a()), (sh.AnonymousClass56) 0L)).longValue());
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
            mt mtVar = (mt) this.e.get(this.e.keyAt(i));
            sh shVar = this.a;
            shVar.a(new sh.AnonymousClass58(mtVar.b(), mtVar.a()));
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void c() {
        int size = this.b.size();
        boolean m = this.a.m();
        for (int i = 0; i < size; i++) {
            m |= ((mt) this.b.get(this.b.keyAt(i))).a().isAnimate();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final VectorHeatAggregationUnit a(long j, LatLng latLng) {
        if (this.a == null) {
            return null;
        }
        sh shVar = this.a;
        return (VectorHeatAggregationUnit) shVar.a(new sh.AnonymousClass62(j, latLng), (sh.AnonymousClass62) null);
    }
}
