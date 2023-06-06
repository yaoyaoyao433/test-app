package com.tencent.tmsqmsp.oaid2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class v extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        boolean z = false;
        int a = com.sankuai.waimai.platform.utils.f.a(intent, "openIdNotifyFlag", 0);
        x.b("shouldUpdateId, notifyFlag : ".concat(String.valueOf(a)));
        if (a != 1) {
            if (a == 2) {
                ArrayList<String> b = com.sankuai.waimai.platform.utils.f.b(intent, "openIdPackageList");
                if (b == null) {
                    return;
                }
                boolean contains = b.contains(context.getPackageName());
                if (contains) {
                    w a2 = x.a().a(com.sankuai.waimai.platform.utils.f.a(intent, "openIdType"));
                    if (a2 != null) {
                        a2.b();
                        return;
                    }
                    return;
                }
                z = contains;
            } else {
                z = true;
            }
            if (a == 0 && z) {
                w a3 = x.a().a(com.sankuai.waimai.platform.utils.f.a(intent, "openIdType"));
                if (a3 != null) {
                    a3.b();
                    return;
                }
                return;
            }
        } else if (TextUtils.equals(com.sankuai.waimai.platform.utils.f.a(intent, "openIdPackage"), context.getPackageName())) {
            z = true;
        }
        if (z) {
            w a4 = x.a().a(com.sankuai.waimai.platform.utils.f.a(intent, "openIdType"));
            if (a4 != null) {
                a4.b();
            }
        }
    }
}
