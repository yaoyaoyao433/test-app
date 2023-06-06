package com.meituan.msc.modules.router;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.msc.common.config.MSCMultiProcessConfig;
import com.meituan.msc.common.process.MSCActivity0;
import com.meituan.msc.common.utils.y;
import com.meituan.msc.modules.engine.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, Intent intent, boolean z) {
        Uri data;
        Object[] objArr = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50d5b797dec9103690db0e7aafc1b137", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50d5b797dec9103690db0e7aafc1b137")).booleanValue();
        }
        if (z && (data = intent.getData()) != null) {
            com.meituan.msc.modules.reporter.g.d("MultiProcessRouterHelper", "data:", data.toString());
            String a2 = y.a(intent, "appId");
            if (TextUtils.isEmpty(a2)) {
                a2 = intent.getData().getQueryParameter("appId");
            }
            if (TextUtils.isEmpty(a2) || q.d(a2)) {
                com.meituan.msc.modules.reporter.g.d("MultiProcessRouterHelper", "exist runtime at main process", a2);
                return false;
            } else if (!MSCMultiProcessConfig.d().c(a2)) {
                com.meituan.msc.modules.reporter.g.d("MultiProcessRouterHelper", "not in multi process white list", a2);
                return false;
            } else {
                intent.setData(data.buildUpon().path("msc_sub").build());
                intent.setComponent(new ComponentName(context, MSCActivity0.class));
                com.meituan.msc.modules.reporter.g.d("MultiProcessRouterHelper", data, com.meituan.msc.common.process.a.d(), Boolean.valueOf(z));
                return true;
            }
        }
        return false;
    }
}
