package com.sankuai.waimai.pouch.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static <T> T a(Map map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "763fa847af7425364cbc76d63570a007", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "763fa847af7425364cbc76d63570a007");
        }
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str)) {
            return null;
        }
        try {
            return (T) map.get(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
