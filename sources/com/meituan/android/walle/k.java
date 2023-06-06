package com.meituan.android.walle;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;

    @Nullable
    public static String a(@NonNull Context context, @NonNull String str) {
        Map<String, String> a2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e37d481d7b36bde001e115f2e40012a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e37d481d7b36bde001e115f2e40012a2");
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0a1ea5c3617289b2c1e27ac28f1f6118", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0a1ea5c3617289b2c1e27ac28f1f6118");
        } else {
            String a3 = a(context);
            a2 = TextUtils.isEmpty(a3) ? null : e.a(new File(a3));
        }
        if (a2 == null) {
            return null;
        }
        return a2.get(str);
    }

    @Nullable
    public static String a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f223a4f5973ec8a4f0fcd6ae0eb40c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f223a4f5973ec8a4f0fcd6ae0eb40c3");
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }
}
