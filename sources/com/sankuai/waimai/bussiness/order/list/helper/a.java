package com.sankuai.waimai.bussiness.order.list.helper;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, long j, long j2, String str, String str2, int i, double d, String str3, long j3, String str4, String str5) {
        Object[] objArr = {activity, new Long(j), new Long(j2), str, str2, Integer.valueOf(i), Double.valueOf(d), str3, new Long(j3), str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb060e7296b3792b215d0dd93a00a9bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb060e7296b3792b215d0dd93a00a9bc");
        } else {
            com.sankuai.waimai.business.im.api.a.a().a(activity, null, 3, j, j2, str, 0L, 10, str5, false, a(str2, i, d, str3, j3, str4, 0));
        }
    }

    public static void a(Activity activity, int i, long j, int i2, String str, int i3) {
        Object[] objArr = {activity, Integer.valueOf(i), new Long(j), Integer.valueOf(i2), str, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f296fae76d074f749ee11bacf00df1d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f296fae76d074f749ee11bacf00df1d9");
        } else {
            com.sankuai.waimai.business.im.api.a.a().b(activity, str, i, false, j, i2, i3);
        }
    }

    @NonNull
    public static Bundle a(@Nullable String str, @Nullable int i, @Nullable double d, @Nullable String str2, @Nullable long j, String str3, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Double.valueOf(d), str2, new Long(j), str3, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05574286cb15d3f336a2de25c4ae1164", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05574286cb15d3f336a2de25c4ae1164");
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("status_desc", str);
        }
        bundle.putInt("status", i);
        bundle.putDouble("total", d);
        bundle.putLong("order_time", r.a(str2, 0L));
        bundle.putLong("order_view_id", j);
        bundle.putString("food_desc", str3);
        bundle.putInt("ref", i2);
        return bundle;
    }
}
