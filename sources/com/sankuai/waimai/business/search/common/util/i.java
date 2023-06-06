package com.sankuai.waimai.business.search.common.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, Bundle bundle) {
        Object[] objArr = {context, str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8480a393b989aadfa016ca7f2fef2c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8480a393b989aadfa016ca7f2fef2c54");
        } else if (TextUtils.isEmpty(str)) {
            com.sankuai.waimai.foundation.router.a.a(context, com.sankuai.waimai.foundation.router.interfaces.c.b, bundle);
        } else {
            com.sankuai.waimai.foundation.router.a.a(context, str, bundle);
        }
    }

    public static void a(Context context, long j, String str, String str2, int i, long j2, String str3) {
        Object[] objArr = {context, new Long(j), str, str2, Integer.valueOf(i), 0L, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7faeb41b2172b9f6676ad89a18d9311d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7faeb41b2172b9f6676ad89a18d9311d");
        } else if (context == null) {
        } else {
            switch (i) {
                case TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM /* 201 */:
                case 202:
                case TbsListener.ErrorCode.APK_VERSION_ERROR /* 203 */:
                case TbsListener.ErrorCode.UNZIP_DIR_ERROR /* 205 */:
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.business.search.ui.guide.history.a(j, str, str2, true, str3));
                    break;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("poiId", j);
            bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
            bundle.putString("poiName", str2);
            bundle.putString("from", "from poi search");
            bundle.putLong("foodId", 0L);
            a(context, str3, bundle);
        }
    }
}
