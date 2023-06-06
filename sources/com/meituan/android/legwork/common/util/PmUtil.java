package com.meituan.android.legwork.common.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class PmUtil {
    public static ChangeQuickRedirect a;
    private static int b;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PlatformType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a<T> {
        T a();

        T b();

        T c();

        T d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();

        void c();
    }

    static {
        if ("mt".equalsIgnoreCase("wm")) {
            b = 1;
        } else if ("wm".equalsIgnoreCase("wm")) {
            b = 2;
        } else if ("dp".equalsIgnoreCase("wm")) {
            b = 3;
        } else {
            b = 0;
        }
    }

    public static int a() {
        return b;
    }

    public static void a(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "355b2962c033daff4eabcc10788d0c9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "355b2962c033daff4eabcc10788d0c9c");
            return;
        }
        switch (b) {
            case 1:
                bVar.a();
                return;
            case 2:
                bVar.b();
                return;
            case 3:
                bVar.c();
                return;
            default:
                return;
        }
    }

    @Nullable
    public static <T> T a(@NonNull a<T> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53dca9545d51485100c4240102f4b5ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53dca9545d51485100c4240102f4b5ee");
        }
        if (b == 1) {
            return aVar.a();
        }
        if (b == 2) {
            return aVar.b();
        }
        if (b == 3) {
            return aVar.c();
        }
        return aVar.d();
    }
}
