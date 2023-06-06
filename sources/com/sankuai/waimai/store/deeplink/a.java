package com.sankuai.waimai.store.deeplink;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.deeplink.c;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Activity activity, @NonNull String str, Map<String, Object> map) {
        Object[] objArr = {activity, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e18a39b95af9d98f07bf046c30c5014", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e18a39b95af9d98f07bf046c30c5014");
        } else {
            c.a(activity, str, map);
        }
    }
}
