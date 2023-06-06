package com.meituan.android.legwork.net.manager;

import com.meituan.android.legwork.net.c;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private ConcurrentMap<Integer, List<Class<?>>> b;
    private ConcurrentMap<Integer, ar> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.net.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0270a {
        private static a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f3c26001cc0b754787b0009227dc4a2", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f3c26001cc0b754787b0009227dc4a2") : C0270a.a;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9e8b20c41383411fca1a54f2b5d6a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9e8b20c41383411fca1a54f2b5d6a6");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42e801571dfae4ac0daaa3e7c48b33dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42e801571dfae4ac0daaa3e7c48b33dd");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(CommonAPIService.class);
        this.b.put(0, arrayList);
        new ArrayList();
    }

    public final <T> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d69d5b2a87d6eb108fe97d9889c9dccf", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d69d5b2a87d6eb108fe97d9889c9dccf") : (T) b(cls).a(cls);
    }

    private ar b(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561c3f1f0d41c6849453c8ceefca45e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561c3f1f0d41c6849453c8ceefca45e1");
        }
        for (Integer num : this.b.keySet()) {
            if (this.b.get(num).contains(cls)) {
                if (this.c.get(num) == null) {
                    this.c.put(num, a(num.intValue()).c());
                }
                return this.c.get(num);
            }
        }
        return new c().c();
    }

    private com.meituan.android.legwork.common.net.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b56599e060911cee906a85263a90f38", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.legwork.common.net.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b56599e060911cee906a85263a90f38") : new c();
    }

    public final a.InterfaceC0637a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e2e9f48d7b440461b58af24a330b4f8", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e2e9f48d7b440461b58af24a330b4f8") : b(CommonAPIService.class).a();
    }
}
