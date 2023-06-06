package com.sankuai.waimai.store.config;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"sm_config_center_v2", "sm_config_center_android", "sm_redirect_map", "drug_config_center"};

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbb73304acdd3cc47909b328531f84b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbb73304acdd3cc47909b328531f84b7");
        } else if (!b(context) || k.b()) {
        } else {
            a(context, true);
        }
    }

    public static void a(Context context, boolean z) {
        String[] strArr;
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac485085761abef8acf50b1abcd1d0f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac485085761abef8acf50b1abcd1d0f6");
            return;
        }
        com.sankuai.waimai.platform.utils.d.a(context, "__horn_debug__", z);
        for (String str : b) {
            if (!TextUtils.isEmpty(str)) {
                Horn.debug(context, str, z);
                com.dianping.judas.util.a.a("SGHornDebug,%s", str + CommonConstant.Symbol.COMMA + z);
            }
        }
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d938a8c2dbb9ad037d49dab740a0ba2d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d938a8c2dbb9ad037d49dab740a0ba2d")).booleanValue() : com.sankuai.waimai.platform.utils.d.b(context, "__horn_debug__", false);
    }
}
