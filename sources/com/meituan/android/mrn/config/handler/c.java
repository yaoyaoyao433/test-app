package com.meituan.android.mrn.config.handler;

import com.google.gson.Gson;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.AbstractList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements com.meituan.android.mrn.utils.config.c<d> {
    public static ChangeQuickRedirect a;
    public static final com.meituan.android.mrn.utils.collection.a<String, Object> b = com.meituan.android.mrn.utils.collection.a.a();
    public static final List<?> c = new AbstractList<Object>() { // from class: com.meituan.android.mrn.config.handler.c.1
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }
    };
    protected Map<String, d> d;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92bb0ba905677f51ef0c265a26a193f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92bb0ba905677f51ef0c265a26a193f6");
        } else {
            this.d = new ConcurrentHashMap();
        }
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ Object a(d dVar) {
        Type f;
        d dVar2 = dVar;
        Object[] objArr = {dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a5a8f931a97cb9eb7bcec7891df6842", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a5a8f931a97cb9eb7bcec7891df6842");
        }
        String str = dVar2.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        String b2 = (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3dd0013386bf37d966c0bc29ebd03a18", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3dd0013386bf37d966c0bc29ebd03a18") : com.meituan.android.mrn.common.b.a(com.meituan.android.mrn.common.a.a())).b(str, (String) null);
        if (b.containsKey(b2)) {
            return b.get(b2);
        }
        Gson a2 = com.meituan.android.mrn.utils.g.a();
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8d5f06481c07ddb40fbadcbe45175c99", RobustBitConfig.DEFAULT_VALUE)) {
            f = (Type) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8d5f06481c07ddb40fbadcbe45175c99");
        } else {
            d dVar3 = this.d.get(str);
            if (dVar3 == null) {
                throw new IllegalStateException("Unregistered key");
            }
            f = dVar3.f();
        }
        return a2.fromJson(b2, f);
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ boolean b(d dVar) {
        d dVar2 = dVar;
        Object[] objArr = {dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "118195badf6ffa945a9c9bb947a1a624", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "118195badf6ffa945a9c9bb947a1a624")).booleanValue();
        }
        String str = dVar2.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d198884f28db5bd3bd85337a4282f93", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d198884f28db5bd3bd85337a4282f93")).booleanValue() : this.d.containsKey(str)) && com.meituan.android.mrn.common.b.a(com.meituan.android.mrn.common.a.a()).a(str);
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ void c(d dVar) {
        d dVar2 = dVar;
        Object[] objArr = {dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30072ed6748d92982def43c4646918fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30072ed6748d92982def43c4646918fa");
        } else {
            this.d.remove(dVar2.b);
        }
    }

    @Override // com.meituan.android.mrn.utils.config.c
    public final /* synthetic */ void d(d dVar) {
        d dVar2 = dVar;
        Object[] objArr = {dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "722ffda84d7e3a653d71c9006a1c094d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "722ffda84d7e3a653d71c9006a1c094d");
        } else {
            this.d.put(dVar2.b, dVar2);
        }
    }

    static {
        b.put("CONTAINS_ALL_LIST", c);
    }
}
