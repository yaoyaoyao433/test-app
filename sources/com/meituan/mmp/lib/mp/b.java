package com.meituan.mmp.lib.mp;

import android.app.ActivityManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.lib.remote.RemoteService;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final List<a> b = new CopyOnWriteArrayList();
    private static final Map<com.meituan.mmp.lib.mp.a, List<WeakReference<a>>> c = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(com.meituan.mmp.lib.mp.a aVar);
    }

    static {
        for (com.meituan.mmp.lib.mp.a aVar : com.meituan.mmp.lib.mp.a.valuesCustom()) {
            c.put(aVar, new CopyOnWriteArrayList());
        }
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f53a038b3bf55de4b4f6ba040153e790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f53a038b3bf55de4b4f6ba040153e790");
        } else if (b.contains(aVar)) {
        } else {
            b.add(aVar);
        }
    }

    public static void a(com.meituan.mmp.lib.mp.a aVar, a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f87a423922d79db6df2737d3df479bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f87a423922d79db6df2737d3df479bf");
            return;
        }
        List<WeakReference<a>> list = c.get(aVar);
        synchronized (list) {
            list.add(new WeakReference<>(aVar2));
        }
    }

    public static void a(com.meituan.mmp.lib.mp.a aVar) {
        ArrayList<WeakReference> arrayList;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61f15e10a27a0bb3628469cd3660a5af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61f15e10a27a0bb3628469cd3660a5af");
            return;
        }
        for (a aVar2 : b) {
            aVar2.a(aVar);
        }
        List<WeakReference<a>> list = c.get(aVar);
        synchronized (list) {
            arrayList = new ArrayList(list);
            list.clear();
        }
        for (WeakReference weakReference : arrayList) {
            a aVar3 = (a) weakReference.get();
            if (aVar3 != null) {
                aVar3.a(aVar);
            }
        }
    }

    public static List<com.meituan.mmp.lib.mp.a> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b20f6745b071642492de49ee3621d83", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b20f6745b071642492de49ee3621d83");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ab.a("am.getRunningAppProcesses");
            List<ActivityManager.RunningAppProcessInfo> a2 = Privacy.createActivityManager(MMPEnvHelper.getContext(), ContainerInfo.ENV_MMP).a();
            ab.a();
            if (a2 != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : a2) {
                    com.meituan.mmp.lib.mp.a a3 = com.meituan.mmp.lib.mp.a.a(runningAppProcessInfo.processName);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
            }
            RemoteService.a(new ArrayList(arrayList));
        } catch (Throwable th) {
            com.meituan.mmp.lib.trace.b.a(th);
        }
        return arrayList;
    }
}
