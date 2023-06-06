package com.sankuai.waimai.business.restaurant.base.skuchoose;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c c = new c();
    public Map<String, WeakReference<MRNDialog>> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "744afdd40abecc7286da263f0facc4ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "744afdd40abecc7286da263f0facc4ea");
        } else {
            this.b = new ConcurrentHashMap();
        }
    }

    public static c a() {
        return c;
    }

    public final MRNDialog a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c91ccde9b01228dcfab123e6db9176", RobustBitConfig.DEFAULT_VALUE)) {
            return (MRNDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c91ccde9b01228dcfab123e6db9176");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        WeakReference<MRNDialog> weakReference = this.b.get(str);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        this.b.remove(str);
        return null;
    }
}
