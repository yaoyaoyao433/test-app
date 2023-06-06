package com.sankuai.meituan.takeoutnew.util.aop;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static int a(PackageManager packageManager, String str, String str2) {
        Object[] objArr = {packageManager, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64af340db840b4b827980e99e619d0ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64af340db840b4b827980e99e619d0ff")).intValue();
        }
        if (j.a(str)) {
            return -1;
        }
        return packageManager.checkPermission(str, str2);
    }

    public static int a(Context context, @NonNull String str, int i, int i2) {
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "168a8b5c8aea52e3ca0d82bbaba025f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "168a8b5c8aea52e3ca0d82bbaba025f0")).intValue();
        }
        if (j.a(str)) {
            return -1;
        }
        return context.checkPermission(str, i, i2);
    }

    @RequiresApi(api = 23)
    public static int a(Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "563b8ffdee4c8951a83f6449cedd8338", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "563b8ffdee4c8951a83f6449cedd8338")).intValue();
        }
        if (j.a(str)) {
            return -1;
        }
        return context.checkSelfPermission(str);
    }

    public static com.sankuai.waimai.manipulator.runtime.a<Void> a(FragmentActivity fragmentActivity, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {fragmentActivity, Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d65131a41f250f0dae736179b5183292", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.manipulator.runtime.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d65131a41f250f0dae736179b5183292");
        }
        com.sankuai.meituan.takeoutnew.util.c.a().a(i, strArr, iArr);
        return com.sankuai.waimai.manipulator.runtime.a.a();
    }

    public static com.sankuai.waimai.manipulator.runtime.a<Void> a(Fragment fragment, int i, String[] strArr, int[] iArr) {
        Object[] objArr = {fragment, Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1a211cb956cfdeb8927b5f5865c76ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.manipulator.runtime.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1a211cb956cfdeb8927b5f5865c76ff");
        }
        com.sankuai.meituan.takeoutnew.util.c.a().a(i, strArr, iArr);
        return com.sankuai.waimai.manipulator.runtime.a.a();
    }

    public static com.sankuai.waimai.manipulator.runtime.a<Void> a(android.app.Fragment fragment, int i, String[] strArr, int[] iArr) {
        Object[] objArr = {fragment, Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2f2f1074efb196e2ee0c34f89f8f1e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.manipulator.runtime.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2f2f1074efb196e2ee0c34f89f8f1e0");
        }
        com.sankuai.meituan.takeoutnew.util.c.a().a(i, strArr, iArr);
        return com.sankuai.waimai.manipulator.runtime.a.a();
    }
}
