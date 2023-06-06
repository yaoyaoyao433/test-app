package com.sankuai.waimai.platform.capacity.ad;

import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static Method b;

    public static void a(List<String> list) {
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc7da638d24a06cad7160ceb63e3da90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc7da638d24a06cad7160ceb63e3da90");
        } else if (!com.sankuai.waimai.foundation.core.a.c() && com.sankuai.waimai.platform.capacity.persistent.sp.a.b(b.a, "upload_mach_ad_event", false)) {
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cf4a741b31bec75ee298d047cdc191f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cf4a741b31bec75ee298d047cdc191f2");
                return;
            }
            if (b == null) {
                try {
                    b = Class.forName("com.sankuai.meituan.takeoutnew.app.dev.capacity.ad.AdThirdPartUpload").getMethod("report", String.class);
                } catch (ClassNotFoundException | NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
            if (b != null) {
                try {
                    b.invoke(null, str2);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
