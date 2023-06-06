package com.xiaomi.push;

import com.xiaomi.push.cj;
import com.xiaomi.push.p;
/* loaded from: classes6.dex */
public final class cl extends p.b {
    p.b a;
    final /* synthetic */ cj b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cl(cj cjVar) {
        this.b = cjVar;
    }

    @Override // com.xiaomi.push.p.b
    public final void a() {
        cj.b bVar = (cj.b) this.b.a.peek();
        if (bVar == null || !bVar.c()) {
            return;
        }
        if (this.b.a.remove(bVar)) {
            this.a = bVar;
        }
        if (this.a != null) {
            this.a.a();
        }
    }

    @Override // com.xiaomi.push.p.b
    public final void b() {
        if (this.a != null) {
            this.a.b();
        }
    }
}
