package com.meituan.android.legwork.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public static float b;
    public static float c;
    public static float d;
    public static float e;

    public static int a(int i) {
        float f;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "194640278aba7b014d4f8a994b586f5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "194640278aba7b014d4f8a994b586f5e")).intValue();
        }
        if (b != 0.0f) {
            f = b;
        } else {
            f = com.meituan.android.legwork.a.a().getResources().getDisplayMetrics().density;
        }
        return (int) ((i * f) + 0.5d);
    }

    public static int a(float f) {
        float f2;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bea3fcfa73a91c4e5a775ad118e53441", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bea3fcfa73a91c4e5a775ad118e53441")).intValue();
        }
        if (b != 0.0f) {
            f2 = b;
        } else {
            f2 = com.meituan.android.legwork.a.a().getResources().getDisplayMetrics().density;
        }
        return (int) ((f * f2) + 0.5d);
    }

    public static int b(float f) {
        float f2;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8332ef004e1d1dd09e7f9293f022909b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8332ef004e1d1dd09e7f9293f022909b")).intValue();
        }
        if (b != 0.0f) {
            f2 = b;
        } else {
            f2 = com.meituan.android.legwork.a.a().getResources().getDisplayMetrics().density;
        }
        return (int) ((f / f2) + 0.5d);
    }
}
