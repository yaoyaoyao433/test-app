package com.huawei.hms.framework.network.grs.c;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class l implements Runnable {
    final /* synthetic */ com.huawei.hms.framework.network.grs.c.b.c a;
    final /* synthetic */ String b;
    final /* synthetic */ com.huawei.hms.framework.network.grs.a.c c;
    final /* synthetic */ com.huawei.hms.framework.network.grs.b d;
    final /* synthetic */ m e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(m mVar, com.huawei.hms.framework.network.grs.c.b.c cVar, String str, com.huawei.hms.framework.network.grs.a.c cVar2, com.huawei.hms.framework.network.grs.b bVar) {
        this.e = mVar;
        this.a = cVar;
        this.b = str;
        this.c = cVar2;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m mVar = this.e;
        mVar.a(mVar.a(this.a, this.b, this.c), this.d);
    }
}
