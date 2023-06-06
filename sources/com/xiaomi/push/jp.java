package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes6.dex */
public final class jp implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ jo d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jp(jo joVar, String str, String str2, String str3) {
        this.d = joVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        context = this.d.b;
        SharedPreferences.Editor edit = context.getSharedPreferences(this.a, 4).edit();
        edit.putString(this.b, this.c);
        edit.commit();
    }
}
