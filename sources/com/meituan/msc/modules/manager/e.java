package com.meituan.msc.modules.manager;

import android.support.annotation.NonNull;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static volatile e b;

    public final JSONArray a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed37f0a84478198d2bcc26c8bae3d4a2", RobustBitConfig.DEFAULT_VALUE) ? (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed37f0a84478198d2bcc26c8bae3d4a2") : b(obj);
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc89e6ec96942eb2315fd57fb3a268f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc89e6ec96942eb2315fd57fb3a268f2");
        }
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    @NonNull
    public static JSONArray b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "924aad09584aff99cae5e73614c0d4ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "924aad09584aff99cae5e73614c0d4ff");
        }
        if (obj == null) {
            return new JSONArray();
        }
        return (obj == null || !obj.getClass().isArray()) ? Arguments.getJSArgs(new Object[]{obj}) : Arguments.getJSArgs((Object[]) obj);
    }

    @NonNull
    public static JSONArray a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "181b6247fcf15037dc3fddd16368e0a4", RobustBitConfig.DEFAULT_VALUE) ? (JSONArray) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "181b6247fcf15037dc3fddd16368e0a4") : Arguments.getJSArgs(objArr);
    }
}
