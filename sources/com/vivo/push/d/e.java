package com.vivo.push.d;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.sdk.PushMessageCallback;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ com.vivo.push.b.i b;
    final /* synthetic */ d c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(d dVar, String str, com.vivo.push.b.i iVar) {
        this.c = dVar;
        this.a = str;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        if (!TextUtils.isEmpty(this.a)) {
            PushMessageCallback pushMessageCallback = this.c.b;
            context2 = this.c.a;
            pushMessageCallback.onReceiveRegId(context2, this.a);
        }
        PushMessageCallback pushMessageCallback2 = this.c.b;
        context = this.c.a;
        pushMessageCallback2.onBind(context, this.b.h(), this.b.d());
    }
}
