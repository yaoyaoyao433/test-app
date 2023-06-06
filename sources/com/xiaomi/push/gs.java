package com.xiaomi.push;

import com.xiaomi.push.p;
/* loaded from: classes6.dex */
public final class gs extends p.b {
    final /* synthetic */ Runnable a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gs(Runnable runnable) {
        this.a = runnable;
    }

    @Override // com.xiaomi.push.p.b
    public final void a() {
        this.a.run();
    }
}
