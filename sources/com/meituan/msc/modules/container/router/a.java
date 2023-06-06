package com.meituan.msc.modules.container.router;

import com.meituan.msc.common.process.MSCActivity0;
import com.meituan.msc.common.process.MSCActivityM1;
import com.meituan.msc.common.process.MSCActivityM2;
import com.meituan.msc.common.process.MSCActivityM3;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.msc.modules.container.MSCActivity1;
import com.meituan.msc.modules.container.MSCActivity2;
import com.meituan.msc.modules.container.MSCActivity3;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum a {
    OTHER(MSCActivity.class, MSCActivity0.class),
    TASK_1(MSCActivity1.class, MSCActivityM1.class),
    TASK_2(MSCActivity2.class, MSCActivityM2.class),
    TASK_3(MSCActivity3.class, MSCActivityM3.class);
    
    public static ChangeQuickRedirect a;
    private static final Map<Class<? extends MSCActivity>, a> i = new HashMap();
    private static final Map<String, a> j = new HashMap();
    public final List<Class<? extends MSCActivity>> f;
    private final Class<? extends MSCActivity> g;
    private final Class<? extends MSCActivity> h;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7625e92d0d6fa66b72cfc2e6314db349", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7625e92d0d6fa66b72cfc2e6314db349") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ea980dd0f249718b9e3e01cf4ee66c2", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ea980dd0f249718b9e3e01cf4ee66c2") : (a[]) values().clone();
    }

    static {
        a[] valuesCustom;
        for (a aVar : valuesCustom()) {
            for (Class<? extends MSCActivity> cls : aVar.f) {
                i.put(cls, aVar);
                j.put(cls.getName(), aVar);
            }
        }
    }

    a(Class cls, Class cls2) {
        Object[] objArr = {r10, Integer.valueOf(r11), cls, cls2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95685d7efa487bc841ef1b16fcf500de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95685d7efa487bc841ef1b16fcf500de");
            return;
        }
        this.f = new ArrayList();
        this.g = cls;
        this.h = cls2;
        this.f.add(cls);
        this.f.add(cls2);
    }

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a4753fcab819deb7856bac63989f727", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a4753fcab819deb7856bac63989f727");
        }
        a aVar = j.get(str);
        if (aVar != null) {
            return aVar;
        }
        try {
            Class<?> cls = Class.forName(str);
            Object[] objArr2 = {cls};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "abfafa8eacd33a0230529ea0b1ce5da3", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "abfafa8eacd33a0230529ea0b1ce5da3");
            }
            a aVar2 = i.get(cls);
            if (aVar2 != null) {
                return aVar2;
            }
            for (Map.Entry<Class<? extends MSCActivity>, a> entry : i.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    return entry.getValue();
                }
            }
            return null;
        } catch (ClassCastException | ClassNotFoundException e) {
            g.a(e);
            return null;
        }
    }
}
