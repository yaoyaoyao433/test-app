package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.mipush.sdk.g;
/* loaded from: classes6.dex */
public final class h implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ g.a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str, String str2, String str3, g.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        context = g.a;
        g.a(context, this.a, this.b, null, this.c, this.d);
    }
}
