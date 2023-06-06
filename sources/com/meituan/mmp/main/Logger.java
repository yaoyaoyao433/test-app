package com.meituan.mmp.main;

import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class Logger {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void disableAutoPageDisappear(Object obj) {
    }

    public void disableAutoPageView(Object obj) {
    }

    public void log(String str, String str2, Map<String, Object> map) {
    }

    public void log(String str, String str2, Map<String, Object> map, long j) {
    }

    public void mgeClick(String str, String str2, String str3, Map<String, Object> map) {
    }

    public void mgePageDisappear(String str, String str2, Map<String, Object> map) {
    }

    public void mgePageView(String str, String str2, Map<String, Object> map) {
    }

    public void mgeView(String str, String str2, String str3, Map<String, Object> map) {
    }

    public void i(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bae7aa5ef1c91db9f274c2fe70b78df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bae7aa5ef1c91db9f274c2fe70b78df");
        } else {
            joinMessage(objArr);
        }
    }

    public void w(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93c1afee5da53a759511f9b079ac4166", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93c1afee5da53a759511f9b079ac4166");
        } else {
            joinMessage(objArr);
        }
    }

    public void e(String str, Throwable th, Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e685519dd109f97042b11c2d5e299d27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e685519dd109f97042b11c2d5e299d27");
        } else {
            Log.e(str, joinMessage(objArr), th);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public HashMap<String, Object> b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bae3500b5edef1da07d349cbc63bafb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bae3500b5edef1da07d349cbc63bafb");
            } else {
                this.b = new HashMap<>();
            }
        }

        public final a a(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c944fc2c8d68714123649ef5845fe6", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c944fc2c8d68714123649ef5845fe6");
            }
            this.b.put(str, obj);
            return this;
        }
    }

    public static String joinMessage(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c7779ef3ed644ace78b82f8dc5f6ad1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c7779ef3ed644ace78b82f8dc5f6ad1e");
        }
        if (objArr.length > 1) {
            return TextUtils.join(StringUtil.SPACE, objArr);
        }
        Object obj = objArr.length == 1 ? objArr[0] : null;
        return obj == null ? "" : obj.toString();
    }
}
