package com.vivo.push;

import com.vivo.push.e;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g implements IPushActionListener {
    final /* synthetic */ e.a a;
    final /* synthetic */ e b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(e eVar, e.a aVar) {
        this.b = eVar;
        this.a = aVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        com.vivo.push.util.b bVar;
        if (i != 0) {
            this.b.k = null;
            bVar = this.b.j;
            bVar.b("APP_TOKEN");
            return;
        }
        Object[] b = this.a.b();
        if (b == null || b.length == 0) {
            com.vivo.push.util.p.a("PushClientManager", "bind app result is null");
        } else {
            this.b.a((String) this.a.b()[0]);
        }
    }
}
