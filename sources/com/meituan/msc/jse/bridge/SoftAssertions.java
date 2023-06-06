package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SoftAssertions {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void assertUnreachable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "414ec8909497f7257dccf07010fcebdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "414ec8909497f7257dccf07010fcebdf");
        } else {
            ReactSoftException.logSoftException("SoftAssertions", new AssertionException(str));
        }
    }

    public static void assertCondition(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "825db5693d0b5b19b40661a167def769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "825db5693d0b5b19b40661a167def769");
        } else if (z) {
        } else {
            ReactSoftException.logSoftException("SoftAssertions", new AssertionException(str));
        }
    }

    public static <T> T assertNotNull(@Nullable T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0d47030aaedfe3a715f5955d0c7e62b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0d47030aaedfe3a715f5955d0c7e62b6");
        }
        if (t == null) {
            ReactSoftException.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!"));
        }
        return t;
    }
}
