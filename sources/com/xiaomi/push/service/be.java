package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public final class be extends m.a {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ Context c;
    final /* synthetic */ String d;
    final /* synthetic */ Notification e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public be(int i, String str, Context context, String str2, Notification notification) {
        this.a = i;
        this.b = str;
        this.c = context;
        this.d = str2;
        this.e = notification;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return bc.a(this.a, this.b);
    }

    @Override // java.lang.Runnable
    @TargetApi(19)
    public final void run() {
        bc.a(this.c, this.d, this.a, this.b, this.e);
    }
}
