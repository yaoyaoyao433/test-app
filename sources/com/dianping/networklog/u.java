package com.dianping.networklog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public final class u {
    public static ChangeQuickRedirect a;

    /* loaded from: classes.dex */
    public static class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a970103d074ab597a619ef50a2c87fa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a970103d074ab597a619ef50a2c87fa");
                return;
            }
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "com.dianping.android.sdk.networklog.extra.basename");
            c.a(a2);
            if (c.e) {
                new StringBuilder("receive rollover ").append(a2);
            }
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a756ed083cbaae4e9cf5beb247011b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a756ed083cbaae4e9cf5beb247011b8");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setAction("com.dianping.android.sdk.networklog.action.rollover");
        intent.putExtra("com.dianping.android.sdk.networklog.extra.basename", str);
        try {
            com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent);
        } catch (Exception unused) {
        }
    }
}
