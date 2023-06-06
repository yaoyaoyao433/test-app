package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.internal.sh;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class na extends mq<nb> {
    @Override // com.tencent.mapsdk.internal.mq
    public final /* synthetic */ mp<nb> a(nb nbVar) {
        return new mz(this, nbVar);
    }

    public na(sh shVar) {
        super(shVar);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private mp<nb> a2(nb nbVar) {
        return new mz(this, nbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.tencent.mapsdk.internal.mq
    public synchronized mz b(@NonNull nb nbVar) {
        return (mz) super.b((na) nbVar);
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void f() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            mz mzVar = (mz) this.c.get(this.c.keyAt(i));
            sh shVar = this.a;
            mzVar.a(((Long) shVar.a((CallbackRunnable<sh.AnonymousClass71>) new sh.AnonymousClass71(mzVar.a()), (sh.AnonymousClass71) 0L)).longValue());
            mzVar.a().setBitmap(null);
            mzVar.a().setLatLngBounds(null);
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void g() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            mz mzVar = (mz) this.e.get(this.e.keyAt(i));
            sh shVar = this.a;
            shVar.a(new sh.AnonymousClass72(mzVar.b(), mzVar.a()));
            mzVar.a().setBitmap(null);
            mzVar.a().setLatLngBounds(null);
        }
    }

    @Override // com.tencent.mapsdk.internal.mq
    public final void h() {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.a.c(((mp) this.g.get(this.g.keyAt(i))).b());
        }
    }
}
