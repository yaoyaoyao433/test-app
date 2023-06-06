package com.meituan.android.common.locate.controller;

import com.meituan.android.common.locate.api.GpsMonitorStateManager;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.reporter.h;
import com.meituan.android.common.locate.reporter.j;
import com.meituan.android.common.locate.reporter.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public class f {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile f d;
    private Set<String> a;
    private Map<String, Boolean> b;
    private boolean c;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8524494e3fc142268fce21959268726", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8524494e3fc142268fce21959268726");
            return;
        }
        this.a = Collections.synchronizedSet(new HashSet());
        this.b = Collections.synchronizedMap(new HashMap());
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3d4c78adce3d12c2db4faa6ac784ea8", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3d4c78adce3d12c2db4faa6ac784ea8");
        }
        if (d == null) {
            synchronized (f.class) {
                if (d == null) {
                    d = new f();
                }
            }
        }
        return d;
    }

    private boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc049aefa823e8b7f306d647f9341f43", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc049aefa823e8b7f306d647f9341f43")).booleanValue() : t.a(g.a()).a(this.a);
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa5526f03534350fa7982c61fbd8e57a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa5526f03534350fa7982c61fbd8e57a");
            return;
        }
        this.c = false;
        List<String> h = a().h();
        for (int i = 0; i < h.size(); i++) {
            if (j.a(g.a()).a(h.get(i))) {
                this.c = true;
            }
        }
    }

    public synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf2d8ebba940b76c0d461c160a345817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf2d8ebba940b76c0d461c160a345817");
            return;
        }
        this.a.add(str);
        l();
    }

    public synchronized void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e304fe7e6394a75a8672d7c02a652e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e304fe7e6394a75a8672d7c02a652e6");
            return;
        }
        if (z) {
            this.b.put(str, Boolean.valueOf(z));
        }
    }

    public synchronized void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "488402530e7928a01365ee3fa486dfc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "488402530e7928a01365ee3fa486dfc9");
            return;
        }
        this.a.remove(str);
        l();
    }

    public synchronized void b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a9652468f783c07771240f2623579eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a9652468f783c07771240f2623579eb");
            return;
        }
        if (z && this.b.containsKey(str)) {
            this.b.remove(str);
        }
    }

    public synchronized boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a230b72bcd70a02f4746a3dff1bd767", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a230b72bcd70a02f4746a3dff1bd767")).booleanValue();
        }
        return this.b.size() > 0;
    }

    public synchronized String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa4daf901b949230fa57c603b52f3a9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa4daf901b949230fa57c603b52f3a9f");
        } else if (this.a.size() == 0) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(it.next() + ";");
            }
            if (sb.length() > 1) {
                return sb.substring(0, sb.length() - 1);
            }
            return null;
        }
    }

    public synchronized boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d151e837f6b6292c7523befebb0cc49", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d151e837f6b6292c7523befebb0cc49")).booleanValue();
        }
        if (this.a != null && this.a.size() != 0) {
            if (e()) {
                return true;
            }
            if (t.a(g.a()).a()) {
                return k();
            }
            return false;
        }
        return false;
    }

    public boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c32f3a73e74ddbd340e15022efe1256e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c32f3a73e74ddbd340e15022efe1256e")).booleanValue();
        }
        Set<String> bizNames = GpsMonitorStateManager.getInstance().getBizNames();
        if (this.a.size() == 0 || bizNames.size() == 0) {
            return false;
        }
        HashSet hashSet = new HashSet(this.a);
        hashSet.retainAll(bizNames);
        return h.a(g.a()).a(hashSet);
    }

    public boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65db226732a9ec317979e1cd446f1f50", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65db226732a9ec317979e1cd446f1f50")).booleanValue() : h.a(g.a()).a(this.a);
    }

    public synchronized boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6101e4c738ce9feb833b8bd9e9417ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6101e4c738ce9feb833b8bd9e9417ef")).booleanValue();
        }
        if (this.a != null && this.a.size() != 0) {
            if (t.a(g.a()).b()) {
                return k();
            }
            return false;
        }
        return false;
    }

    public List<String> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10995d236fe768f91b11ac715cbae12a", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10995d236fe768f91b11ac715cbae12a") : new ArrayList(this.a);
    }

    public boolean i() {
        return this.c;
    }

    public boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b00888dab95d00ba7e5124e11e65500", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b00888dab95d00ba7e5124e11e65500")).booleanValue() : j.a(g.a()).g();
    }
}
