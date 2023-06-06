package com.sankuai.waimai.mach.utils;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @NonNull
    private static final HashMap<String, List<Object>> b = new HashMap<>();
    @NonNull
    private static final HashMap<String, List<Runnable>> c = new HashMap<>();
    @NonNull
    private static final Handler d = new Handler(Looper.getMainLooper());

    @MainThread
    public static void cancel(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77455001ac6c299a21a5f50522d01676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77455001ac6c299a21a5f50522d01676");
        } else if (str == null) {
        } else {
            Object[] objArr2 = {"TaskHelper.cancel"};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fb23a7e03c2855b6d161af4346fe15cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fb23a7e03c2855b6d161af4346fe15cd");
            } else if (!a()) {
                new RuntimeException("TaskHelper.cancel要在主线程调用!");
            }
            synchronized (b) {
                a(b.remove(str));
            }
            synchronized (c) {
                b(c.remove(str));
            }
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0307cb1d872b247b688d1baeac526ee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0307cb1d872b247b688d1baeac526ee")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    private static void a(List<Object> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14974ccc41dbb3de6543b79987198671", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14974ccc41dbb3de6543b79987198671");
        } else if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            list.clear();
        }
    }

    private static void b(List<Runnable> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd035f391ff5020ba9f9c2354eea9609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd035f391ff5020ba9f9c2354eea9609");
        } else if (list != null) {
            for (Runnable runnable : list) {
                d.removeCallbacks(runnable);
            }
            list.clear();
        }
    }
}
