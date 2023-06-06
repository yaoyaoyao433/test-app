package com.sankuai.meituan.location.collector.utils;

import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private Object b;

    public e(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a8c4c403da146f29e62d40028a9cf07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a8c4c403da146f29e62d40028a9cf07");
        } else {
            this.b = obj;
        }
    }

    public static boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c1c3ab3174e66aa452d63d1a534ee05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c1c3ab3174e66aa452d63d1a534ee05")).booleanValue();
        }
        try {
            obj.getClass().getDeclaredMethod("reportCollectorRecord", byte[].class);
            return true;
        } catch (Throwable unused) {
            LogUtils.a("retrofit report method not exist");
            return false;
        }
    }

    public final boolean a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f62716faef6e95a03f8c1c2f8ce08e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f62716faef6e95a03f8c1c2f8ce08e8")).booleanValue();
        }
        try {
            return ((Boolean) i.a(this.b, "reportCollectorRecord", bArr)).booleanValue();
        } catch (Exception e) {
            LogUtils.a(getClass(), e);
            return false;
        }
    }
}
