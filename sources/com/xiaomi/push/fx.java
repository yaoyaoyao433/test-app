package com.xiaomi.push;
/* loaded from: classes6.dex */
public final class fx implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ fu b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fx(fu fuVar, String str) {
        this.b = fuVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        by.a().a(this.a, true);
    }
}
