package com.sankuai.shangou.stone.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class p {
    public static ChangeQuickRedirect a;

    public static boolean a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "1f08a1f4bd31b6441fb5343c4741b3b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "1f08a1f4bd31b6441fb5343c4741b3b3")).booleanValue();
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static <T> T a(Object obj, @NonNull Class<? extends T> cls) {
        Object[] objArr = {obj, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9b94c666ccdec50eecf0fcf3b03272b", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9b94c666ccdec50eecf0fcf3b03272b");
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
