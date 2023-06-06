package com.meituan.mmp.main;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class x {
    public static ChangeQuickRedirect a;
    public static final ArrayList<com.meituan.mmp.lib.interfaces.c> b = new ArrayList<>();
    public static final Handler c = new Handler(Looper.getMainLooper());
    public static final HashMap<String, ICustomEventDispatch> d = new HashMap<>();

    public static void a(com.meituan.mmp.lib.interfaces.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d7941a3fe92419ffe08cf96caaf213f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d7941a3fe92419ffe08cf96caaf213f");
            return;
        }
        synchronized (b) {
            b.add(cVar);
        }
    }

    public static void b(com.meituan.mmp.lib.interfaces.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7716c49eac79f9bc67bdf4cef675de07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7716c49eac79f9bc67bdf4cef675de07");
            return;
        }
        synchronized (b) {
            b.remove(cVar);
        }
    }
}
