package com.sankuai.waimai.bussiness.order.confirm.helper;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb852efca200a58ad598ad01a45bc15c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb852efca200a58ad598ad01a45bc15c") : new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f04a14459b54fdbe982eba532abf1ff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f04a14459b54fdbe982eba532abf1ff6");
            return;
        }
        String a2 = a();
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, str, a2 + CommonConstant.Symbol.UNDERLINE + (b(context, str) + 1));
    }

    public static int b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87393ebc40461bc830140428971f670f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87393ebc40461bc830140428971f670f")).intValue();
        }
        String a2 = a();
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, str, "");
        if (b == null || b.length() == 0) {
            return 0;
        }
        String[] split = b.split(CommonConstant.Symbol.UNDERLINE);
        if (split.length != 2) {
            return 0;
        }
        String str2 = split[0];
        String str3 = split[1];
        if (TextUtils.equals(a2, str2)) {
            return NumberUtils.parseInt(str3, 0);
        }
        return 0;
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b6d8d9367631386f9e6f4c7110c07f3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b6d8d9367631386f9e6f4c7110c07f3")).booleanValue() : TextUtils.equals(a(), com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "order_confirm_vip_float_guide", ""));
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bacad2a8ca7f3ab67edf850d7e60ecc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bacad2a8ca7f3ab67edf850d7e60ecc3");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "order_confirm_vip_float_guide", a());
        }
    }
}
