package com.sankuai.waimai.business.page.home.helper;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Map<String, NavigateItem.a> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2f4df8008fc82bcc2a1be4b4d2126b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2f4df8008fc82bcc2a1be4b4d2126b6");
        } else if (map != null) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "category_bubble_cache", new Gson().toJson(map));
        }
    }

    public static Map a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a03c7b5acaa759da99f7b231c10234ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a03c7b5acaa759da99f7b231c10234ed");
        }
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "category_bubble_cache", (String) null);
        if (TextUtils.isEmpty(b)) {
            return new HashMap();
        }
        try {
            return (Map) new Gson().fromJson(b, new TypeToken<Map<String, NavigateItem.a>>() { // from class: com.sankuai.waimai.business.page.home.helper.a.1
            }.getType());
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.e("BubbleHelper", th.getMessage(), new Object[0]);
            return new HashMap();
        }
    }
}
