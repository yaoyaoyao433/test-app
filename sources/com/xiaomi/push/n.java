package com.xiaomi.push;

import android.content.SharedPreferences;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public final class n extends m.b {
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ m d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, m.a aVar, boolean z, String str) {
        super(aVar);
        this.d = mVar;
        this.b = z;
        this.c = str;
    }

    @Override // com.xiaomi.push.m.b
    final void a() {
        SharedPreferences sharedPreferences;
        if (this.b) {
            return;
        }
        sharedPreferences = this.d.e;
        sharedPreferences.edit().putLong(this.c, System.currentTimeMillis()).commit();
    }
}
