package com.vivo.push.d;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends z {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        com.vivo.push.util.p.d("OnClearCacheTask", "delete push info " + this.a.getPackageName());
        com.vivo.push.util.y.b(this.a).a();
    }
}
