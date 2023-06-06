package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.ha;
import com.xiaomi.push.ho;
import com.xiaomi.push.ia;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public final class bd extends m.a {
    final /* synthetic */ ia a;
    final /* synthetic */ Context b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bd(ia iaVar, Context context) {
        this.a = iaVar;
        this.b = context;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return Constants.VIA_REPORT_TYPE_DATALINE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a != null) {
            this.a.c = com.xiaomi.push.service.ad.a();
            ag.a(this.b.getApplicationContext()).a((ag) this.a, ha.Notification, true, (ho) null, true);
        }
    }
}
