package com.sankuai.meituan.abtestv2;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static synchronized Map<String, String> a(Context context) {
        synchronized (c.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a46fcb3b2b7de9cbbd3baa45feff69b2", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a46fcb3b2b7de9cbbd3baa45feff69b2");
            }
            try {
                return (Map) com.meituan.android.turbo.a.a(com.meituan.android.turbo.b.a(Map.class, String.class, String.class), context.getSharedPreferences("status", 0).getString("abtestv2_dev_config_pref", ""));
            } catch (com.meituan.android.turbo.exceptions.a e) {
                e.printStackTrace();
                return new HashMap();
            }
        }
    }
}
