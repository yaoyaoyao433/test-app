package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class y implements Runnable {
    final /* synthetic */ com.vivo.push.b.r a;
    final /* synthetic */ x b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(x xVar, com.vivo.push.b.r rVar) {
        this.b = xVar;
        this.a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.a;
        pushMessageCallback.onPublish(context, this.a.h(), this.a.g());
    }
}
