package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public final class bc extends m.a {
    final /* synthetic */ az a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bc(az azVar) {
        this.a = azVar;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return "10053";
    }

    @Override // java.lang.Runnable
    public final void run() {
        bq bqVar;
        bq unused;
        Context unused2;
        bqVar = this.a.j;
        if (bqVar != null) {
            unused = this.a.j;
            unused2 = this.a.a;
            az.a(this.a, "delete_time");
        }
    }
}
