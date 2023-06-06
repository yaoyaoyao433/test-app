package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.push.dh;
import com.xiaomi.push.dj;
import com.xiaomi.push.hg;
/* loaded from: classes6.dex */
public final class bc {
    public static void a(Context context, Intent intent, Uri uri) {
        dh a;
        dj djVar;
        if (context == null) {
            return;
        }
        ag.a(context).a();
        if (dh.a(context.getApplicationContext()).e == null) {
            dh.a(context.getApplicationContext()).a(ap.a(context.getApplicationContext()).b.a, context.getPackageName(), com.xiaomi.push.service.z.a(context.getApplicationContext()).a(hg.AwakeInfoUploadWaySwitch.by, 0), new aq());
            com.xiaomi.push.service.z.a(context).a(new be(102, "awake online config", context));
        }
        if ((context instanceof Activity) && intent != null) {
            a = dh.a(context.getApplicationContext());
            djVar = dj.ACTIVITY;
        } else if (!(context instanceof Service) || intent == null) {
            if (uri == null || TextUtils.isEmpty(uri.toString())) {
                return;
            }
            dh.a(context.getApplicationContext()).a(dj.PROVIDER, context, (Intent) null, uri.toString());
            return;
        } else if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            a = dh.a(context.getApplicationContext());
            djVar = dj.SERVICE_COMPONENT;
        } else {
            a = dh.a(context.getApplicationContext());
            djVar = dj.SERVICE_ACTION;
        }
        a.a(djVar, context, intent, (String) null);
    }
}
