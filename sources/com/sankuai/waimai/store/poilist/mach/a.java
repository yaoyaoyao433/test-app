package com.sankuai.waimai.store.poilist.mach;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.cache.CacheException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.recycler.b;
import com.sankuai.waimai.mach.recycler.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect f;
    private String a;
    public BaseActivity g;
    protected com.sankuai.waimai.mach.d h;
    protected com.sankuai.waimai.mach.recycler.b i;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poilist.mach.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1285a {
        Object a(Object obj);

        String b(Object obj);
    }

    public abstract String a(T t);

    public abstract String a(String str);

    public String a(String str, String str2) {
        return "商家页=》可复用mach模版";
    }

    public abstract Map<String, Object> a(int i, T t);

    public abstract void a(T t, com.sankuai.waimai.mach.recycler.c cVar);

    public a(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.mach.d dVar, String str) {
        this(baseActivity, dVar, str, new com.sankuai.waimai.mach.recycler.b(str));
        Object[] objArr = {baseActivity, dVar, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17f0177b1de40a2fef4621e71d03c2be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17f0177b1de40a2fef4621e71d03c2be");
        }
    }

    public a(@NonNull BaseActivity baseActivity, @NonNull com.sankuai.waimai.mach.d dVar, String str, com.sankuai.waimai.mach.recycler.b bVar) {
        Object[] objArr = {baseActivity, dVar, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "750b21ff2951bb11dbcec2b7fd5ca3fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "750b21ff2951bb11dbcec2b7fd5ca3fe");
            return;
        }
        this.g = baseActivity;
        this.h = dVar;
        this.a = str;
        this.i = bVar;
    }

    public final void a(@NonNull com.sankuai.waimai.mach.d dVar) {
        this.h = dVar;
    }

    public final com.sankuai.waimai.mach.recycler.b b() {
        return this.i;
    }

    @Nullable
    public final com.sankuai.waimai.mach.recycler.c a(int i, T t, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), t, str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac87530e7475e41085a41e494ac31cb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.recycler.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac87530e7475e41085a41e494ac31cb4");
        }
        Map<String, Object> a = a(i, (int) t);
        String a2 = a((a<T>) t);
        String a3 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        com.sankuai.waimai.store.util.mach.b bVar = new com.sankuai.waimai.store.util.mach.b(a2, getClass().getSimpleName());
        h a4 = this.i.a(a2, a2, a3, 3000);
        if (a4 != null) {
            if (this.g == null || this.g.isDestroyed() || this.h == null) {
                return null;
            }
            com.sankuai.waimai.store.mach.c cVar = new com.sankuai.waimai.store.mach.c(this.g, this.g.w());
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.sankuai.waimai.store.mach.clickhandler.a());
            cVar.a(arrayList);
            com.sankuai.waimai.mach.recycler.c cVar2 = new com.sankuai.waimai.mach.recycler.c(a2, a4, cVar.a(this.h), a3, this.a);
            this.i.a(this.g, cVar2, i2, 0, a, a3);
            a((a<T>) t, cVar2);
            if (cVar2.b() == null) {
                bVar.a(CacheException.LOAD_BUNDLE_SUCCESS_RENDER_FAILURE, "", a2, "", new Exception(b(a2, a3)));
                return null;
            }
            return cVar2;
        }
        bVar.a(a2, a(a2, a3), new com.sankuai.waimai.mach.manager.cache.CacheException(17807));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rx.d<List<f>> a(List list, int i, final InterfaceC1285a interfaceC1285a) {
        Object[] objArr = {list, Integer.valueOf(i), interfaceC1285a};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8bba39622d6e5aa8652f8d15f6d0d4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8bba39622d6e5aa8652f8d15f6d0d4e");
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int size = list != null ? list.size() : 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            Object a = interfaceC1285a.a(obj);
            if (a != null) {
                String a2 = a((a<T>) a);
                if (!TextUtils.isEmpty(a2)) {
                    if (this.g == null || this.g.isDestroyed() || this.h == null) {
                        return null;
                    }
                    String a3 = a(interfaceC1285a.b(obj));
                    com.sankuai.waimai.store.mach.c cVar = new com.sankuai.waimai.store.mach.c(this.g, this.g.w());
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(new com.sankuai.waimai.store.mach.clickhandler.a());
                    cVar.a(arrayList3);
                    com.sankuai.waimai.mach.recycler.c cVar2 = new com.sankuai.waimai.mach.recycler.c(a2, a2, cVar.a(this.h), a3, this.a);
                    cVar2.a(a(i2, (int) a));
                    cVar2.n = i;
                    cVar2.o = 0;
                    arrayList.add(cVar2);
                    arrayList2.add(obj);
                }
            }
        }
        return rx.d.a((d.a) new d.a<List<f>>() { // from class: com.sankuai.waimai.store.poilist.mach.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj2) {
                final j jVar = (j) obj2;
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19f83e4acf566348ed0d1efa2bda845d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19f83e4acf566348ed0d1efa2bda845d");
                } else {
                    a.this.i.a(a.this.g, arrayList, new b.c() { // from class: com.sankuai.waimai.store.poilist.mach.a.1.1
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.sankuai.waimai.mach.recycler.b.c
                        public final void a(Map<com.sankuai.waimai.mach.recycler.c, b.C1020b> map) {
                            Object[] objArr3 = {map};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f2e201041d68c1144970b5ae9863ac83", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f2e201041d68c1144970b5ae9863ac83");
                                return;
                            }
                            if (a.this.g == null || a.this.g.isDestroyed()) {
                                jVar.onNext(null);
                            } else {
                                int size2 = arrayList != null ? arrayList.size() : 0;
                                ArrayList arrayList4 = new ArrayList();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    com.sankuai.waimai.mach.recycler.c cVar3 = (com.sankuai.waimai.mach.recycler.c) arrayList.get(i3);
                                    if (cVar3.b() != null) {
                                        if (arrayList2.size() > i3) {
                                            Object obj3 = arrayList2.get(i3);
                                            a.this.a((a) interfaceC1285a.a(obj3), cVar3);
                                            arrayList4.add(new f(obj3, cVar3));
                                        }
                                    } else {
                                        String str = cVar3.j;
                                        if (TextUtils.isEmpty(str)) {
                                            str = "AbsRecycleMachHelper";
                                        }
                                        new com.sankuai.waimai.store.util.mach.b(cVar3.a(), str).a(CacheException.LOAD_BUNDLE_SUCCESS_RENDER_FAILURE, "", cVar3.a(), "", new Exception(a.this.b(cVar3.a(), cVar3.j)));
                                    }
                                }
                                jVar.onNext(arrayList4);
                            }
                            jVar.onCompleted();
                        }
                    });
                }
            }
        });
    }

    public String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b312176696ea101e7a5ff924a6e11002", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b312176696ea101e7a5ff924a6e11002");
        }
        return str + ":商家页=》可复用mach模版预渲染失败！";
    }
}
