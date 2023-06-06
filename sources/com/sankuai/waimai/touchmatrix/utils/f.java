package com.sankuai.waimai.touchmatrix.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static ConcurrentHashMap<String, String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f76d2bdb69e10927e22156baa066f6d1", RobustBitConfig.DEFAULT_VALUE) ? (ConcurrentHashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f76d2bdb69e10927e22156baa066f6d1") : com.sankuai.waimai.touchmatrix.rebuild.utils.a.a();
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02ad0d58ce09e4627b0fe205175444fd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02ad0d58ce09e4627b0fe205175444fd") : a(null);
    }

    private static String a(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "380d5f598d40b40eade45fd88cc9f3bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "380d5f598d40b40eade45fd88cc9f3bb");
        }
        String str = "";
        Activity c = com.sankuai.waimai.touchmatrix.rebuild.message.a.c(null);
        if (c instanceof com.sankuai.waimai.foundation.core.base.activity.c) {
            Map<String, String> Z_ = ((com.sankuai.waimai.foundation.core.base.activity.c) c).Z_();
            if (Z_ != null && !Z_.isEmpty() && com.sankuai.waimai.touchmatrix.rebuild.utils.a.a() != null && !com.sankuai.waimai.touchmatrix.rebuild.utils.a.a().isEmpty()) {
                str = com.sankuai.waimai.touchmatrix.rebuild.utils.a.a().get(Z_.get("page_id"));
            }
        } else {
            String b = c.a().b();
            if (!TextUtils.isEmpty(b)) {
                str = com.sankuai.waimai.touchmatrix.rebuild.utils.a.a().get(b);
            }
        }
        return (!TextUtils.isEmpty(str) || c == null) ? str : c.getComponentName().getClassName();
    }
}
