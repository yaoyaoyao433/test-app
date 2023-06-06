package com.sankuai.waimai.business.page.home.head.promotionbg;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.helper.ResourceHelper;
import com.sankuai.waimai.business.page.home.model.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    public static String b = "search_btn_color_provider";
    private static e d;
    private final Context c;

    public static e a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5247bfce232669809eabb1a47f5b3d15", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5247bfce232669809eabb1a47f5b3d15");
        }
        if (d == null) {
            d = new e(context);
        }
        return d;
    }

    private e(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1763ffe422f87347456d5a58e5ac64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1763ffe422f87347456d5a58e5ac64");
        } else {
            this.c = context.getApplicationContext();
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe165a7cd5c3ca36a681956a413190b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe165a7cd5c3ca36a681956a413190b4");
        }
        h resource = new ResourceHelper(this.c).getResource(b);
        return resource != null ? resource.g : "";
    }
}
