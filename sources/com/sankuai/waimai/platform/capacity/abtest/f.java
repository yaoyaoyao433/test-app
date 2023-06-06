package com.sankuai.waimai.platform.capacity.abtest;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.encrypt.Env;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends a {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c23393f9dc9f218a4b041d3dad7aacf5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c23393f9dc9f218a4b041d3dad7aacf5")).booleanValue();
        }
        ABStrategy strategy = ABTestManager.getInstance(context).getStrategy(str, null);
        if (strategy == null || TextUtils.isEmpty(strategy.expName)) {
            return false;
        }
        return strategy.expName.equalsIgnoreCase(ErrorCode.ERROR_TYPE_B);
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d0691ee8d5a4499ad1daf962d65eafc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d0691ee8d5a4499ad1daf962d65eafc") : com.sankuai.waimai.foundation.core.a.b() ? Env.a() == Env.EnvType.TEST ? "http://i.c.waimai.test.sankuai.com" : Env.a() == Env.EnvType.STAGE ? "https://i.waimai.st.meituan.com" : "https://i.waimai.meituan.com" : "https://i.waimai.meituan.com";
    }

    public static final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df89d79e48099e6a9cc4f7aaf9032d3a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df89d79e48099e6a9cc4f7aaf9032d3a") : com.sankuai.waimai.foundation.core.a.b() ? Env.a() == Env.EnvType.TEST ? "test" : Env.a() == Env.EnvType.STAGE ? "stage" : "prod" : "prod";
    }
}
