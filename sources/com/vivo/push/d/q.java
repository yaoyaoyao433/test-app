package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.sdk.PushMessageCallback;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class q implements Runnable {
    final /* synthetic */ UnvarnishedMessage a;
    final /* synthetic */ p b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(p pVar, UnvarnishedMessage unvarnishedMessage) {
        this.b = pVar;
        this.a = unvarnishedMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.a;
        pushMessageCallback.onTransmissionMessage(context, this.a);
    }
}
