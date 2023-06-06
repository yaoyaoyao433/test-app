package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public final class ba extends m.a {
    final /* synthetic */ az a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ba(az azVar) {
        this.a = azVar;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return "10052";
    }

    @Override // java.lang.Runnable
    public final void run() {
        bq bqVar;
        bq unused;
        Context unused2;
        com.xiaomi.channel.commonutils.logger.c.c("exec== mUploadJob");
        bqVar = this.a.j;
        if (bqVar != null) {
            unused = this.a.j;
            unused2 = this.a.a;
            az.a(this.a, "upload_time");
        }
    }
}
