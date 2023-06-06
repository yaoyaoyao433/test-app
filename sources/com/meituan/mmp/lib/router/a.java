package com.meituan.mmp.lib.router;

import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.HeraActivity1;
import com.meituan.mmp.lib.HeraActivity2;
import com.meituan.mmp.lib.HeraActivity3;
import com.meituan.mmp.lib.mp.MPActivity0;
import com.meituan.mmp.lib.mp.MPActivity1;
import com.meituan.mmp.lib.mp.MPActivity2;
import com.meituan.mmp.lib.mp.MPActivity3;
import com.meituan.mmp.lib.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum a {
    OTHER(HeraActivity.class, MPActivity0.class),
    TASK_1(HeraActivity1.class, MPActivity1.class),
    TASK_2(HeraActivity2.class, MPActivity2.class),
    TASK_3(HeraActivity3.class, MPActivity3.class);
    
    public static ChangeQuickRedirect a;
    private static final Map<Class<? extends HeraActivity>, a> i = new HashMap();
    private static final Map<String, a> j = new HashMap();
    public final List<Class<? extends HeraActivity>> f;
    private final Class<? extends HeraActivity> g;
    private final Class<? extends HeraActivity> h;

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b908c62db1f6050ebd09d322374f67f8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b908c62db1f6050ebd09d322374f67f8") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58d7e6ef649a4c45c82d5080bc59d9c5", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58d7e6ef649a4c45c82d5080bc59d9c5") : (a[]) values().clone();
    }

    static {
        a[] valuesCustom;
        for (a aVar : valuesCustom()) {
            for (Class<? extends HeraActivity> cls : aVar.f) {
                i.put(cls, aVar);
                j.put(cls.getName(), aVar);
            }
        }
    }

    a(Class cls, Class cls2) {
        Object[] objArr = {r10, Integer.valueOf(r11), cls, cls2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1740ff40b3b5712ef6bf951b97e02c79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1740ff40b3b5712ef6bf951b97e02c79");
            return;
        }
        this.f = new ArrayList();
        this.g = cls;
        this.h = cls2;
        this.f.add(cls);
        this.f.add(cls2);
    }

    public static List<a> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a911a0835b92c21dda64f86371c39be9", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a911a0835b92c21dda64f86371c39be9") : h.a(TASK_1, TASK_2, TASK_3);
    }

    public final Class<? extends HeraActivity> a(boolean z) {
        return z ? this.h : this.g;
    }

    public static com.meituan.mmp.lib.mp.a a(Class<? extends HeraActivity> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a134a95d66fb39ab916c0e09dc4ab57", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.mp.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a134a95d66fb39ab916c0e09dc4ab57");
        }
        if (MPActivity0.class.isAssignableFrom(cls)) {
            return com.meituan.mmp.lib.mp.a.STANDARD;
        }
        if (MPActivity1.class.isAssignableFrom(cls)) {
            return com.meituan.mmp.lib.mp.a.TASK_1;
        }
        if (MPActivity2.class.isAssignableFrom(cls)) {
            return com.meituan.mmp.lib.mp.a.TASK_2;
        }
        if (MPActivity3.class.isAssignableFrom(cls)) {
            return com.meituan.mmp.lib.mp.a.TASK_3;
        }
        return com.meituan.mmp.lib.mp.a.MAIN;
    }

    public static a b(Class<? extends HeraActivity> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99d6e1704000fc0f9a31a8d01ecaef5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99d6e1704000fc0f9a31a8d01ecaef5b");
        }
        a aVar = i.get(cls);
        if (aVar != null) {
            return aVar;
        }
        for (Map.Entry<Class<? extends HeraActivity>, a> entry : i.entrySet()) {
            if (entry.getKey().isAssignableFrom(cls)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3dbd4fc65c10f49912926109b1b7943", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3dbd4fc65c10f49912926109b1b7943");
        }
        a aVar = j.get(str);
        if (aVar != null) {
            return aVar;
        }
        try {
            return b(Class.forName(str));
        } catch (ClassCastException | ClassNotFoundException e) {
            com.meituan.mmp.lib.trace.b.a(e);
            return null;
        }
    }

    public static Class<? extends HeraActivity> a(com.meituan.mmp.lib.mp.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5113812dd5a8d09f287b0b20084f6606", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5113812dd5a8d09f287b0b20084f6606");
        }
        switch (aVar) {
            case TASK_1:
                return MPActivity1.class;
            case TASK_2:
                return MPActivity2.class;
            case TASK_3:
                return MPActivity3.class;
            default:
                return null;
        }
    }

    public static List<com.meituan.mmp.lib.mp.a> a(Collection<com.meituan.mmp.lib.mp.a> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ae8661addd05897d32530da592ba651", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ae8661addd05897d32530da592ba651");
        }
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, new Comparator<com.meituan.mmp.lib.mp.a>() { // from class: com.meituan.mmp.lib.router.a.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(com.meituan.mmp.lib.mp.a aVar, com.meituan.mmp.lib.mp.a aVar2) {
                com.meituan.mmp.lib.mp.a aVar3 = aVar;
                com.meituan.mmp.lib.mp.a aVar4 = aVar2;
                Object[] objArr2 = {aVar3, aVar4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54a2e955f4c2a87cc6313ec20062762d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54a2e955f4c2a87cc6313ec20062762d")).intValue();
                }
                if (aVar3 == aVar4) {
                    return 0;
                }
                if (aVar3 == null) {
                    return 1;
                }
                if (aVar4 == null) {
                    return -1;
                }
                return aVar3.ordinal() - aVar4.ordinal();
            }
        });
        return arrayList;
    }
}
