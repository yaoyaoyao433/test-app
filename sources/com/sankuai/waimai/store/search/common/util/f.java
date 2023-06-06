package com.sankuai.waimai.store.search.common.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, Bundle bundle) {
        Object[] objArr = {context, str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6ef94bc39b1ff52024b8f9e2f98eefc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6ef94bc39b1ff52024b8f9e2f98eefc");
        } else if (TextUtils.isEmpty(str)) {
            com.sankuai.waimai.foundation.router.a.a(context, com.sankuai.waimai.foundation.router.interfaces.c.b, bundle);
        } else {
            com.sankuai.waimai.foundation.router.a.a(context, str, bundle);
        }
    }

    public static void a(Context context, long j, String str, String str2, int i, long j2, String str3, long j3) {
        Object[] objArr = {context, new Long(j), str, str2, Integer.valueOf(i), 0L, str3, new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef0e0e3f74a4b6382b66fd0a564660d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef0e0e3f74a4b6382b66fd0a564660d9");
        } else if (context == null) {
        } else {
            switch (i) {
                case TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM /* 201 */:
                case 202:
                case TbsListener.ErrorCode.APK_VERSION_ERROR /* 203 */:
                case TbsListener.ErrorCode.UNZIP_DIR_ERROR /* 205 */:
                    com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.search.model.e(j, str, str2, true, str3, j3));
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
