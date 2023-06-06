package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.c;
import com.xiaomi.mipush.sdk.ag;
import com.xiaomi.mipush.sdk.am;
import com.xiaomi.mipush.sdk.ap;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.mipush.sdk.d;
import com.xiaomi.mipush.sdk.e;
import com.xiaomi.mipush.sdk.g;
import com.xiaomi.mipush.sdk.x;
import com.xiaomi.push.al;
import com.xiaomi.push.gt;
import com.xiaomi.push.jl;
/* loaded from: classes6.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {
    private static boolean a = false;
    private boolean b;

    public NetworkStatusReceiver() {
        this.b = false;
        this.b = true;
    }

    public NetworkStatusReceiver(Object obj) {
        this.b = false;
        a = true;
    }

    public static boolean a() {
        return a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.b) {
            return;
        }
        jl.a().post(new a(this, context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        if (!ag.a(context).c() && ap.a(context).b.a() && !ap.a(context).b()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                com.xiaomi.push.service.a.a(context).a(intent);
            } catch (Exception e) {
                c.a(e);
            }
        }
        gt.a(context);
        if (al.a(context) && ag.a(context).f()) {
            ag.a(context).d();
        }
        if (al.a(context)) {
            if ("syncing".equals(x.a(context).a(am.DISABLE_PUSH))) {
                g.h(context);
            }
            if ("syncing".equals(x.a(context).a(am.ENABLE_PUSH))) {
                g.i(context);
            }
            if ("syncing".equals(x.a(context).a(am.UPLOAD_HUAWEI_TOKEN))) {
                g.j(context);
            }
            if ("syncing".equals(x.a(context).a(am.UPLOAD_FCM_TOKEN))) {
                g.k(context);
            }
            if ("syncing".equals(x.a(context).a(am.UPLOAD_COS_TOKEN))) {
                g.l(context);
            }
            if ("syncing".equals(x.a(context).a(am.UPLOAD_FTOS_TOKEN))) {
                g.m(context);
            }
            if (e.a() && e.b(context)) {
                e.a(context);
                e.c(context);
            }
            b.a(context);
            d.a(context);
        }
    }
}
