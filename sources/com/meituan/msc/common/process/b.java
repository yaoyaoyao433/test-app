package com.meituan.msc.common.process;

import android.app.ActivityManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.msc.common.remote.RemoteService;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.reporter.g;
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
    private static final Map<com.meituan.msc.common.process.a, List<WeakReference<a>>> c = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(com.meituan.msc.common.process.a aVar);
    }

    static {
        for (com.meituan.msc.common.process.a aVar : com.meituan.msc.common.process.a.valuesCustom()) {
            c.put(aVar, new CopyOnWriteArrayList());
        }
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50fb60e84a068ef52a2f4e3dc8e3d5bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50fb60e84a068ef52a2f4e3dc8e3d5bb");
        } else if (b.contains(aVar)) {
        } else {
            b.add(aVar);
        }
    }

    public static void a(com.meituan.msc.common.process.a aVar) {
        ArrayList<WeakReference> arrayList;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7943bad735d04b5cb43276f42f15ed35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7943bad735d04b5cb43276f42f15ed35");
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

    public static List<com.meituan.msc.common.process.a> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7436627354a603792356217a6a46e45", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7436627354a603792356217a6a46e45");
        }
        ArrayList arrayList = new ArrayList();
        try {
            List<ActivityManager.RunningAppProcessInfo> a2 = Privacy.createActivityManager(MSCEnvHelper.getContext(), ContainerInfo.ENV_MMP).a();
            if (a2 != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : a2) {
                    com.meituan.msc.common.process.a a3 = com.meituan.msc.common.process.a.a(runningAppProcessInfo.processName);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
            }
            RemoteService.a(new ArrayList(arrayList));
        } catch (Throwable th) {
            g.a(th);
        }
        return arrayList;
    }
}
