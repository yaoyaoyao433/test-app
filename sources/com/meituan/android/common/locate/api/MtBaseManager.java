package com.meituan.android.common.locate.api;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
@Deprecated
/* loaded from: classes2.dex */
public class MtBaseManager {
    private static volatile boolean c = false;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Map<String, Boolean> d = new ConcurrentHashMap();
    public Context a;
    public String b;

    public MtBaseManager(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a492df75568d68f1d552a04949c327c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a492df75568d68f1d552a04949c327c");
        } else if (context == null) {
        } else {
            if (TextUtils.isEmpty(str) && LocationUtils.a(context)) {
                throw new RuntimeException("bizKey Can not be empty！！！");
            }
            this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            this.b = TextUtils.isEmpty(str) ? "outer" : str;
        }
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c56d1416a981c6e68d74d546f366e0d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c56d1416a981c6e68d74d546f366e0d5");
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace.length > 2 && stackTrace[2] != null) {
                return stackTrace[2].getClassName() + CommonConstant.Symbol.DOT + stackTrace[2].getMethodName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Deprecated
    public static void setCanUseSystemPermissionMethod(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b56ec4088583882940151228c02c4ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b56ec4088583882940151228c02c4ca");
            return;
        }
        Context a = g.a();
        if (a != null && LocationUtils.a(a)) {
            throw new RuntimeException("此方法已经过时，调用无效果");
        }
    }

    public static void setCanUseSystemPermissionMethod(boolean z, @NonNull String str, @NonNull Context context) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "950af40fcf4febe469cfb09acacefd91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "950af40fcf4febe469cfb09acacefd91");
        } else if (TextUtils.isEmpty(str)) {
            if (context == null) {
                context = g.a();
            }
            if (context != null && LocationUtils.a(context)) {
                throw new RuntimeException("bizKey不允许为null");
            }
        } else {
            synchronized (d) {
                try {
                    if (z) {
                        d.put(str, Boolean.TRUE);
                    } else {
                        d.remove(str);
                    }
                    c = d.size() > 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3321ee9f83d304ef8a4cd4fd5e942eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3321ee9f83d304ef8a4cd4fd5e942eb");
        } else if (this.a == null || !LocationUtils.a(this.a)) {
        } else {
            throw new RuntimeException("废弃方法" + b() + " 不允许调用");
        }
    }
}
