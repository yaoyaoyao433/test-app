package com.sankuai.waimai.business.page.kingkong.log;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(Context context, Intent intent, KingkongInfo kingkongInfo) {
        Object[] objArr = {context, intent, kingkongInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f7cecb6e909f10f626a6364fcac5249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f7cecb6e909f10f626a6364fcac5249");
        } else if (intent != null) {
            Uri data = intent.getData();
            intent.setData((data == null ? new Uri.Builder() : data.buildUpon()).appendQueryParameter("cat_id", String.valueOf(kingkongInfo.d)).appendQueryParameter("stid", com.sankuai.waimai.business.page.common.abtest.a.a(context)).appendQueryParameter("g_source", String.valueOf(kingkongInfo.r)).build());
        }
    }
}
