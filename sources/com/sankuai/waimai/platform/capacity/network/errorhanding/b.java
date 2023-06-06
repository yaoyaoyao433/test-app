package com.sankuai.waimai.platform.capacity.network.errorhanding;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.utils.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(Context context, BaseResponse baseResponse) {
        Object[] objArr = {context, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "820d7cdd2cac9f03ba95d76802faa736", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "820d7cdd2cac9f03ba95d76802faa736") : a(context, baseResponse, (int) R.string.wm_loading_fail_try_afterwhile);
    }

    public static String a(Context context, BaseResponse baseResponse, int i) {
        Object[] objArr = {context, baseResponse, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef797b15e8aa188b33e2c21f8a23f14a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef797b15e8aa188b33e2c21f8a23f14a");
        }
        if (baseResponse != null) {
            if (baseResponse.code == 0) {
                return "";
            }
            if (!TextUtils.isEmpty(baseResponse.msg)) {
                return baseResponse.msg;
            }
        }
        return context.getString(i);
    }

    private static boolean a(Context context, Throwable th, int i) {
        Object[] objArr = {context, th, Integer.valueOf((int) R.string.wm_loading_net_error_info)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "825a95e89f225012724124b472f95d6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "825a95e89f225012724124b472f95d6c")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return false;
        }
        m.a(context, (int) R.string.wm_loading_net_error_info, th);
        return true;
    }

    public static boolean a(Context context, Throwable th) {
        Object[] objArr = {context, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30c8b81d92aff059da884d655965aa61", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30c8b81d92aff059da884d655965aa61")).booleanValue() : a(context, th, (int) R.string.wm_loading_net_error_info);
    }
}
