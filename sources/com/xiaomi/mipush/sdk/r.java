package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.ho;
import com.xiaomi.push.ie;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class r {
    private static int a;

    public static void a(Context context, n nVar) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(RemoteMessageConst.MSGTYPE, 3);
        intent.putExtra("key_command", nVar);
        new PushServiceReceiver().onReceive(context, intent);
    }

    private static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                return !queryBroadcastReceivers.isEmpty();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static int a(Context context) {
        if (a == 0) {
            Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
            if (a(context, intent)) {
                a = 1;
            } else {
                a = 2;
            }
        }
        return a;
    }

    public static n a(String str, List<String> list, long j, String str2, String str3) {
        n nVar = new n();
        nVar.a = str;
        nVar.d = list;
        nVar.b = j;
        nVar.c = str2;
        nVar.e = str3;
        return nVar;
    }

    public static o a(ie ieVar, ho hoVar, boolean z) {
        o oVar = new o();
        oVar.a = ieVar.c;
        if (!TextUtils.isEmpty(ieVar.g)) {
            oVar.b = 1;
            oVar.d = ieVar.g;
        } else if (!TextUtils.isEmpty(ieVar.f)) {
            oVar.b = 2;
            oVar.e = ieVar.f;
        } else if (!TextUtils.isEmpty(ieVar.l)) {
            oVar.b = 3;
            oVar.f = ieVar.l;
        } else {
            oVar.b = 0;
        }
        oVar.m = ieVar.k;
        if (ieVar.h != null) {
            oVar.c = ieVar.h.d;
        }
        if (hoVar != null) {
            if (TextUtils.isEmpty(oVar.a)) {
                oVar.a = hoVar.a;
            }
            if (TextUtils.isEmpty(oVar.e)) {
                oVar.e = hoVar.c;
            }
            oVar.k = hoVar.e;
            oVar.l = hoVar.d;
            oVar.h = hoVar.f;
            oVar.i = hoVar.i;
            oVar.g = hoVar.h;
            Map<String, String> map = hoVar.j;
            oVar.o.clear();
            if (map != null) {
                oVar.o.putAll(map);
            }
        }
        oVar.j = z;
        return oVar;
    }
}
