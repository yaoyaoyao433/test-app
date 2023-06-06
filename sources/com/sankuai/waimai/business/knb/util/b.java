package com.sankuai.waimai.business.knb.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public static User a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac10c31755c105ffb13718d119783cc7", RobustBitConfig.DEFAULT_VALUE) ? (User) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac10c31755c105ffb13718d119783cc7") : com.sankuai.waimai.platform.domain.manager.user.a.i().b();
    }

    public static boolean a(Context context, BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {context, broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec18f54ab5fa287abf22205453b6947f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec18f54ab5fa287abf22205453b6947f")).booleanValue();
        }
        if (context == null || broadcastReceiver == null) {
            return false;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "104bdfd320192a09dcd4681e68168a3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "104bdfd320192a09dcd4681e68168a3b")).floatValue();
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            return -10000.0f;
        }
        return f;
    }

    public static Double a(Double d) {
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4c49ada7bf27f3a3a822cca9bd24844", RobustBitConfig.DEFAULT_VALUE) ? (Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4c49ada7bf27f3a3a822cca9bd24844") : (Double.isInfinite(d.doubleValue()) || Double.isNaN(d.doubleValue())) ? Double.valueOf(-10000.0d) : d;
    }

    public static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "338fb9267b70193e7b6dcd1050c5f4ab", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "338fb9267b70193e7b6dcd1050c5f4ab")).booleanValue() : uri != null && "1".equals(uri.getQueryParameter("need_login"));
    }

    public static boolean a(String str) {
        Uri parse;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "403e4b91d9881be19b83cc05325acf6f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "403e4b91d9881be19b83cc05325acf6f")).booleanValue() : (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || !"1".equals(parse.getQueryParameter("future"))) ? false : true;
    }

    public static int a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bda11a6486315b1381e70dccd37aeb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bda11a6486315b1381e70dccd37aeb3")).intValue();
        }
        try {
            return Integer.parseInt(obj.toString());
        } catch (Exception unused) {
            return 0;
        }
    }
}
