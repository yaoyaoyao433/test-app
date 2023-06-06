package com.sankuai.waimai.platform.capacity.network.errorhanding;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static final int b = 2131364212;
    public static final int c = 2131364208;

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a2f06c200bfe0224f6de6f885c84f20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a2f06c200bfe0224f6de6f885c84f20");
        } else {
            ae.a(activity, c);
        }
    }

    public static String a(Context context, BaseResponse baseResponse) {
        Object[] objArr = {context, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffe2bbcd19ae70a991601585f4e7fd9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffe2bbcd19ae70a991601585f4e7fd9a");
        }
        int i = c;
        Object[] objArr2 = {context, baseResponse, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1ea0b6927a4bd1875820b3ba4490d6bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1ea0b6927a4bd1875820b3ba4490d6bf");
        }
        if (baseResponse != null) {
            if (baseResponse.code == 0) {
                return null;
            }
            if (!TextUtils.isEmpty(baseResponse.msg)) {
                return baseResponse.msg;
            }
        }
        return context.getString(i);
    }
}
