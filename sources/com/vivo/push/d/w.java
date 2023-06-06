package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.PushMessageCallback;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class w implements Runnable {
    final /* synthetic */ UPSNotificationMessage a;
    final /* synthetic */ u b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(u uVar, UPSNotificationMessage uPSNotificationMessage) {
        this.b = uVar;
        this.a = uPSNotificationMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.a;
        pushMessageCallback.onNotificationMessageClicked(context, this.a);
    }
}
