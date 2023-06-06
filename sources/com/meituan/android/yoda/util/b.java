package com.meituan.android.yoda.util;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.yoda.activity.YodaRouterTransparentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3b4bb0ba74916b0aee935f6af3bddf8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3b4bb0ba74916b0aee935f6af3bddf8")).booleanValue();
        }
        List<String> a2 = x.a(activity);
        if (a2 == null || a2.isEmpty()) {
            return false;
        }
        String name = YodaRouterTransparentActivity.class.getName();
        for (String str : a2) {
            if (!TextUtils.isEmpty(str) && str.equals(name)) {
                return true;
            }
        }
        return false;
    }
}
