package com.sankuai.waimai.machpro.animator;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a c;
    public Map<Integer, WeakReference<MPJSCallBack>> b;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd34350438e94e0ed66fdec8c7d07d76", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd34350438e94e0ed66fdec8c7d07d76");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public final void b() {
        MPJSCallBack mPJSCallBack;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5836cfa2da8c9c59640bc5042d9c872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5836cfa2da8c9c59640bc5042d9c872");
        } else if (this.b == null || this.b.size() <= 0) {
        } else {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.b);
            this.b.clear();
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() != null && (mPJSCallBack = (MPJSCallBack) ((WeakReference) entry.getValue()).get()) != null) {
                    mPJSCallBack.invoke((MachMap) null);
                }
                it.remove();
            }
        }
    }
}
