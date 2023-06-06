package com.meituan.android.neohybrid.neo.report;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public HashMap<String, Object> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9b08bfe8adb7b3c63ff74b64021e6cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9b08bfe8adb7b3c63ff74b64021e6cb");
        } else {
            this.b = new HashMap<>();
        }
    }

    public final a a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b84706d398aa62e1e7996deea8b76566", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b84706d398aa62e1e7996deea8b76566");
        }
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.b.put(str, obj);
        }
        return this;
    }

    private a b(Map<String, ?> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a0c1d1e35b5f6065920fefd344ddb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a0c1d1e35b5f6065920fefd344ddb7");
        }
        if (map != null) {
            this.b.putAll(map);
        }
        return this;
    }

    public final HashMap<String, Object> b(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc00049cdf839e60944501d2a86eb5c", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc00049cdf839e60944501d2a86eb5c") : a(str, obj).b;
    }

    public static a c(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5aea78cdc858066e98a7ee6eb523ae1f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5aea78cdc858066e98a7ee6eb523ae1f") : new a().a(str, obj);
    }

    public static a a(Map<String, ?> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44874d1a8165824caf8dacc9dd775437", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44874d1a8165824caf8dacc9dd775437") : new a().b(map);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "757597f45256405ff0a6a9da7604df35", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "757597f45256405ff0a6a9da7604df35") : new a();
    }
}
