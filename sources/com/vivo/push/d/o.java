package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class o implements Runnable {
    final /* synthetic */ com.vivo.push.b.n a;
    final /* synthetic */ n b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(n nVar, com.vivo.push.b.n nVar2) {
        this.b = nVar;
        this.a = nVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.a;
        pushMessageCallback.onLog(context, this.a.d(), this.a.e(), this.a.f());
    }
}
