package com.sankuai.waimai.store.search.ui.result.mach.process;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.OasisModule;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4753200d3dcc466c11d66683a2e31791", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4753200d3dcc466c11d66683a2e31791")).booleanValue() : TextUtils.equals(str, "supermarket-search-product");
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b96295ccdd049240a5ba4242afcaa70e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b96295ccdd049240a5ba4242afcaa70e")).booleanValue() : TextUtils.equals(str, "supermarket-search-poi");
    }

    public static void a(OasisModule oasisModule) {
        Object[] objArr = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51513ff86a316b54c01dad60faab98ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51513ff86a316b54c01dad60faab98ac");
        } else if (oasisModule == null) {
        } else {
            oasisModule.templateType = 0;
            oasisModule.nativeTemplateId = "wm_search_category_template_radical";
        }
    }

    public static void b(OasisModule oasisModule) {
        Object[] objArr = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d384606c2e3bbde8bbfe104d6c2b7471", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d384606c2e3bbde8bbfe104d6c2b7471");
        } else if (oasisModule == null) {
        } else {
            oasisModule.templateType = 0;
            oasisModule.nativeTemplateId = "wm_search_feed_product_750";
        }
    }
}
