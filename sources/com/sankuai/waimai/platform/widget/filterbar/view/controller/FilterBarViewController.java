package com.sankuai.waimai.platform.widget.filterbar.view.controller;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.SearchStatisticsData;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.g;
import com.sankuai.waimai.platform.widget.filterbar.presenter.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class FilterBarViewController {
    public static ChangeQuickRedirect a;
    public a.InterfaceC1093a b;
    public a.c c;
    int d;
    public String e;
    public SearchStatisticsData f;
    b g;
    int h;
    c i;
    public boolean j;
    public boolean k;
    Object l;
    private int m;
    private long n;
    private long o;
    private boolean p;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DialogType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface FilterType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface PageType {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);

        void b(int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b extends a {
        void a();

        void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
    }

    public static /* synthetic */ void a(FilterBarViewController filterBarViewController, long j, com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar) {
        Object[] objArr = {new Long(j), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, filterBarViewController, changeQuickRedirect, false, "f4634346861a0c28962e052432109894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, filterBarViewController, changeQuickRedirect, false, "f4634346861a0c28962e052432109894");
            return;
        }
        Map<String, Object> hashMap = new HashMap<>();
        String str = "";
        String str2 = null;
        switch (filterBarViewController.h) {
            case 1:
                str = "b_21NTG";
                str2 = "c_m84bv26";
                break;
            case 2:
            case 4:
                str = "b_U7ZI3";
                break;
            case 3:
                str = "b_FLgH0";
                filterBarViewController.a(hashMap, cVar);
                if (filterBarViewController.f != null && filterBarViewController.e != null && filterBarViewController.e.equals(filterBarViewController.f.searchKeyword)) {
                    hashMap.put("type", Integer.valueOf(filterBarViewController.f.searchWordType));
                    hashMap.put("search_key", filterBarViewController.e);
                    hashMap.put("view_key", filterBarViewController.f.viewKeyword);
                    break;
                } else {
                    hashMap.put("search_key", filterBarViewController.e);
                    break;
                }
                break;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (filterBarViewController.h != 3) {
            ArrayList<Map<String, Object>> a2 = filterBarViewController.a(cVar, j);
            if (a2.size() > 0) {
                Iterator<Map<String, Object>> it = a2.iterator();
                while (it.hasNext()) {
                    JudasManualManager.a a3 = JudasManualManager.a(str).a(filterBarViewController.l).a(it.next());
                    if (!TextUtils.isEmpty(str2)) {
                        a3.a(str2);
                    }
                    a3.a();
                }
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        if (cVar.c != null && !cVar.c.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, g> entry : cVar.c.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("code", entry.getKey());
                        jSONObject.put("min", entry.getValue().b);
                        jSONObject.put("max", entry.getValue().c);
                        jSONArray.put(jSONObject);
                        hashSet.add(entry.getKey());
                    } catch (JSONException unused) {
                    }
                }
            }
            if (jSONArray.length() > 0) {
                hashMap.put("interval", jSONArray.toString());
            }
        }
        hashMap.put("type", String.valueOf(j));
        if (j == 1) {
            hashMap.put("codes", String.valueOf(cVar.a));
        } else if (j == 2) {
            hashSet.addAll(cVar.b);
            hashMap.put("codes", filterBarViewController.a(hashSet));
        }
        JudasManualManager.a a4 = JudasManualManager.a(str).a(filterBarViewController.l).a(hashMap);
        if (!TextUtils.isEmpty(str2)) {
            a4.a(str2);
        }
        a4.a();
    }

    public static /* synthetic */ void a(FilterBarViewController filterBarViewController, com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar, long j) {
        Object[] objArr = {cVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, filterBarViewController, changeQuickRedirect, false, "64a6af97820a026148429f1d54362beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, filterBarViewController, changeQuickRedirect, false, "64a6af97820a026148429f1d54362beb");
            return;
        }
        String str = "";
        String str2 = null;
        switch (filterBarViewController.h) {
            case 1:
                str = "b_QEGEq";
                str2 = "c_m84bv26";
                break;
            case 2:
            case 4:
                str = "b_ge94y";
                break;
            case 3:
                str = "b_KnLVX";
                break;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", String.valueOf(j));
        if (filterBarViewController.h == 3) {
            filterBarViewController.a(hashMap, cVar);
        }
        JudasManualManager.a a2 = JudasManualManager.b(str).a(filterBarViewController.l).a((Map<String, Object>) hashMap);
        if (!TextUtils.isEmpty(str2)) {
            a2.a(str2);
        }
        a2.a();
    }

    public FilterBarViewController(@NonNull a.c cVar, @NonNull com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar, int i, int i2, @NonNull b bVar2, Object obj) {
        Object[] objArr = {cVar, bVar, Integer.valueOf(i), Integer.valueOf(i2), bVar2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32d39312f60f082af2fe56f40b7b923c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32d39312f60f082af2fe56f40b7b923c");
            return;
        }
        this.j = true;
        this.k = false;
        this.p = true;
        Object[] objArr2 = {cVar, bVar, Integer.valueOf(i), Integer.valueOf(i2), bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8f4746b79a6f1d079a7b46ec3e30439", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8f4746b79a6f1d079a7b46ec3e30439");
        } else {
            this.g = bVar2;
            this.m = i;
            this.h = i2;
            this.c = cVar;
            Object[] objArr3 = {cVar, bVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b51e0150df5061d6ae183c7eabc175d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b51e0150df5061d6ae183c7eabc175d7");
            } else {
                this.b = new com.sankuai.waimai.platform.widget.filterbar.presenter.b(cVar, bVar);
                cVar.a((a.c) this.b);
                this.b.a(new a.b() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar2) {
                        Object[] objArr4 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cfa3ed903e14ea7e5558405aa7106361", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cfa3ed903e14ea7e5558405aa7106361");
                        } else if (cVar2.a != null) {
                            FilterBarViewController.a(FilterBarViewController.this, cVar2, 1L);
                            if (FilterBarViewController.this.g != null) {
                                FilterBarViewController.this.g.a(1);
                            }
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void c() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9eb402be341b836a1f0bc978f03c9d51", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9eb402be341b836a1f0bc978f03c9d51");
                        } else if (FilterBarViewController.this.g != null) {
                            FilterBarViewController.this.g.b(2);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d87ae9fc991c8c507a892d2db21f95d1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d87ae9fc991c8c507a892d2db21f95d1");
                        } else if (FilterBarViewController.this.g != null) {
                            FilterBarViewController.this.g.b(1);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void b(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar2) {
                        Object[] objArr4 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ab2521c93402147ca67666169b89fbde", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ab2521c93402147ca67666169b89fbde");
                        } else if (cVar2.a != null) {
                            FilterBarViewController.this.a(cVar2.a.longValue(), cVar2.b);
                            if (FilterBarViewController.this.i != null) {
                                String.valueOf(FilterBarViewController.this.d);
                                String.valueOf(com.meituan.android.time.c.b());
                            }
                            FilterBarViewController.a(FilterBarViewController.this, 1L, cVar2);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void c(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar2) {
                        Object[] objArr4 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "94e58257a57ef02c70cf2f2ac1f441f4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "94e58257a57ef02c70cf2f2ac1f441f4");
                        } else if (cVar2.d != null) {
                            FilterBarViewController.a(FilterBarViewController.this, cVar2, 0L);
                            if (FilterBarViewController.this.g != null) {
                                FilterBarViewController.this.g.a(3);
                            }
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void b() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0b6b161c5d88220debdd51203000ffe9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0b6b161c5d88220debdd51203000ffe9");
                        } else if (FilterBarViewController.this.g != null) {
                            FilterBarViewController.this.g.b(3);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void d(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar2) {
                        Object[] objArr4 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6e9201217af74e47f55b41dd22bb9d31", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6e9201217af74e47f55b41dd22bb9d31");
                        } else if (cVar2.d != null) {
                            FilterBarViewController.a(FilterBarViewController.this, 0L, cVar2);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void f(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar2) {
                        Object[] objArr4 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a0b024ba41d304fbde3c471cf4df385f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a0b024ba41d304fbde3c471cf4df385f");
                        } else if (cVar2.a != null) {
                            FilterBarViewController.this.a(cVar2.a.longValue(), cVar2.b);
                            if (FilterBarViewController.this.i != null) {
                                String.valueOf(FilterBarViewController.this.d);
                                String.valueOf(com.meituan.android.time.c.b());
                            }
                            FilterBarViewController.a(FilterBarViewController.this, 2L, cVar2);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void e(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar2) {
                        Object[] objArr4 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dfaf5510f678a1331816c4f5315667bc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dfaf5510f678a1331816c4f5315667bc");
                            return;
                        }
                        FilterBarViewController.a(FilterBarViewController.this, cVar2, 2L);
                        if (FilterBarViewController.this.g != null) {
                            FilterBarViewController.this.g.a(2);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void a(List<String> list, boolean z) {
                        Object[] objArr4 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8ac27a420705ceae4d0150dd8299eb4c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8ac27a420705ceae4d0150dd8299eb4c");
                        } else if (FilterBarViewController.this.j) {
                            FilterBarViewController.this.a(list, z);
                            FilterBarViewController.this.a(list, FilterBarViewController.this.b());
                        } else if (FilterBarViewController.this.k) {
                            FilterBarViewController.this.a(list, z);
                            FilterBarViewController.this.a(list, FilterBarViewController.this.b());
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
                    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a.C1086a r26, boolean r27, boolean r28, boolean r29, boolean r30) {
                        /*
                            Method dump skipped, instructions count: 236
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.AnonymousClass1.a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b$a$a, boolean, boolean, boolean, boolean):void");
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void g(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar2) {
                        Object[] objArr4 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5000c4760b1f43acc6fef8ee66dacd7c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5000c4760b1f43acc6fef8ee66dacd7c");
                            return;
                        }
                        FilterBarViewController filterBarViewController = FilterBarViewController.this;
                        Object[] objArr5 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect5 = FilterBarViewController.a;
                        if (PatchProxy.isSupport(objArr5, filterBarViewController, changeQuickRedirect5, false, "ff6d7399f53763fb960c832d5e6c224d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, filterBarViewController, changeQuickRedirect5, false, "ff6d7399f53763fb960c832d5e6c224d");
                            return;
                        }
                        String str = "";
                        switch (filterBarViewController.h) {
                            case 1:
                                str = "b_vg7d0a5u";
                                break;
                            case 2:
                            case 4:
                                str = "b_tbxff6fb";
                                break;
                            case 3:
                                str = "b_eveb4qzm";
                                break;
                        }
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        filterBarViewController.a(hashMap, cVar2);
                        JudasManualManager.a(str).a(filterBarViewController.l).a((Map<String, Object>) hashMap).a();
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void h(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar2) {
                        Object[] objArr4 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "00df07e97e62f210f220d32bb84c79f9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "00df07e97e62f210f220d32bb84c79f9");
                            return;
                        }
                        FilterBarViewController.a(FilterBarViewController.this, cVar2, cVar2.e);
                        if (FilterBarViewController.this.g != null) {
                            FilterBarViewController.this.g.a(4);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void d() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "60f0c77d38aa792945edcf0ee5670366", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "60f0c77d38aa792945edcf0ee5670366");
                        } else if (FilterBarViewController.this.g != null) {
                            FilterBarViewController.this.g.b(4);
                        }
                    }

                    @Override // com.sankuai.waimai.platform.widget.filterbar.presenter.a.b
                    public final void i(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar2) {
                        Object[] objArr4 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "324936a505edbf5bade4695be186f8e9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "324936a505edbf5bade4695be186f8e9");
                        } else if (cVar2.a != null) {
                            FilterBarViewController.a(FilterBarViewController.this, cVar2.e, cVar2);
                        }
                    }
                });
            }
            Object[] objArr4 = {2592000000L};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4716f1306a3eea8029d7443f5c62a34c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4716f1306a3eea8029d7443f5c62a34c");
            } else {
                this.b.c(2592000000L);
            }
        }
        this.l = obj;
    }

    public final void a(@NonNull com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2f3571de72663a4656fe825cece667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2f3571de72663a4656fe825cece667");
            return;
        }
        ((com.sankuai.waimai.platform.widget.filterbar.presenter.b) this.b).c = bVar;
        this.b.a();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2119943cabeeb4e6925297903f34378e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2119943cabeeb4e6925297903f34378e");
            return;
        }
        this.b.a();
        this.b.c(this.h == 4);
        if (this.m != 1) {
            return;
        }
        this.b.c(this.n, this.o, this.d);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c45b1f4e63f8ea6eed8e2797e2b3f3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c45b1f4e63f8ea6eed8e2797e2b3f3d");
        } else {
            this.b.b(z);
        }
    }

    public final void a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2de9991367f6e0aa22c7b44461680363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2de9991367f6e0aa22c7b44461680363");
            return;
        }
        this.c.a(j, j2, i);
        this.n = j;
        this.o = j2;
        this.d = i;
    }

    public int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a2d5219e941aba1104c91343c3382a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a2d5219e941aba1104c91343c3382a2")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        com.sankuai.waimai.platform.widget.filterbar.domain.model.b p = this.b.p();
        Set<String> m = this.b.m();
        if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.b(p) && m != null && m.contains(p.a().a)) {
            return this.b.q() ? 2 : 1;
        }
        return 0;
    }

    public void a(List<String> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b80d8df0468c4c9385b5cae1349afbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b80d8df0468c4c9385b5cae1349afbf");
            return;
        }
        com.sankuai.waimai.platform.widget.filterbar.domain.model.b p = this.b.p();
        if (com.sankuai.waimai.platform.widget.filterbar.domain.model.b.b(p)) {
            a(p.a(), list, i);
        }
    }

    private ArrayList<Map<String, Object>> a(com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar, long j) {
        String valueOf;
        Object[] objArr = {cVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efcc14d64308eec1299133e586ced1f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efcc14d64308eec1299133e586ced1f7");
        }
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        if (j == 1) {
            String valueOf2 = String.valueOf(cVar.a);
            HashMap hashMap = new HashMap();
            hashMap.put("type", String.valueOf(j));
            hashMap.put("codes", valueOf2);
            arrayList.add(hashMap);
        } else if (j == 0 && cVar.d != null) {
            if (cVar.d.b == 0) {
                valueOf = String.valueOf(cVar.d.a);
            } else {
                valueOf = String.valueOf(cVar.d.b);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type", String.valueOf(j));
            hashMap2.put("codes", valueOf);
            arrayList.add(hashMap2);
        } else if (j == 2 || j == cVar.e) {
            if (cVar.c != null && !cVar.c.isEmpty()) {
                for (Map.Entry<String, g> entry : cVar.c.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("type", String.valueOf(j));
                        JSONObject jSONObject = new JSONObject();
                        try {
                            hashMap3.put("codes", entry.getKey());
                            jSONObject.put("code", entry.getKey());
                            jSONObject.put("min", entry.getValue().b);
                            jSONObject.put("max", entry.getValue().c);
                            hashMap3.put("interval", jSONObject.toString());
                            arrayList.add(hashMap3);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
            if (cVar.b != null && cVar.b.size() > 0) {
                for (String str : cVar.b) {
                    if (!TextUtils.isEmpty(str)) {
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("type", String.valueOf(j));
                        hashMap4.put("codes", str);
                        arrayList.add(hashMap4);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            HashMap hashMap5 = new HashMap();
            hashMap5.put("type", String.valueOf(j));
            hashMap5.put("codes", "");
            arrayList.add(hashMap5);
        }
        return arrayList;
    }

    void a(Map<String, Object> map, @NonNull com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar) {
        Object[] objArr = {map, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf5d791c3c8cba9da9d8115dec0aee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf5d791c3c8cba9da9d8115dec0aee2");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (cVar.b != null) {
            String str = "";
            for (String str2 : cVar.b) {
                if (!TextUtils.isEmpty(str)) {
                    str = str + CommonConstant.Symbol.COMMA;
                }
                str = str + str2;
                sb.append(str2);
                sb.append(CommonConstant.Symbol.COMMA);
            }
        }
        if (cVar.c != null) {
            for (Map.Entry<String, g> entry : cVar.c.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                    sb.append(entry.getKey());
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        String sb2 = sb.length() > 0 ? sb.deleteCharAt(sb.length() - 1).toString() : "";
        map.put("cat_id", String.valueOf(this.n));
        map.put("template_type", this.f == null ? "" : String.valueOf(this.f.templateType));
        map.put("rank_type", cVar.a == null ? 0L : String.valueOf(cVar.a));
        if (TextUtils.isEmpty(sb2)) {
            sb2 = "0";
        }
        map.put("filter_type", sb2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.List<java.lang.String> r12, boolean r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r2 = 1
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.a
            java.lang.String r10 = "45baadfe160368f54fcdc8667c667e15"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L22:
            java.lang.String r0 = ""
            r1 = 0
            int r2 = r11.h
            r3 = 4
            if (r2 == r3) goto L33
            switch(r2) {
                case 1: goto L2e;
                case 2: goto L33;
                default: goto L2d;
            }
        L2d:
            goto L35
        L2e:
            java.lang.String r0 = "b_ybw8lavi"
            java.lang.String r1 = "c_m84bv26"
            goto L35
        L33:
            java.lang.String r0 = "b_syk15u77"
        L35:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L62
            com.sankuai.waimai.log.judas.JudasManualManager$a r0 = com.sankuai.waimai.log.judas.JudasManualManager.b(r0)
            java.lang.Object r2 = r11.l
            com.sankuai.waimai.log.judas.JudasManualManager$a r0 = r0.a(r2)
            java.lang.String r2 = "codes"
            java.lang.String r12 = r11.a(r12)
            com.sankuai.waimai.log.judas.JudasManualManager$a r12 = r0.a(r2, r12)
            java.lang.String r0 = "status"
            com.sankuai.waimai.log.judas.JudasManualManager$a r12 = r12.a(r0, r13)
            boolean r13 = android.text.TextUtils.isEmpty(r1)
            if (r13 != 0) goto L5f
            r12.a(r1)
        L5f:
            r12.a()
        L62:
            com.sankuai.waimai.platform.widget.filterbar.presenter.a$a r12 = r11.b
            boolean r12 = r12 instanceof com.sankuai.waimai.platform.widget.filterbar.presenter.b
            if (r12 == 0) goto L9f
            com.sankuai.waimai.platform.widget.filterbar.presenter.a$a r12 = r11.b
            com.sankuai.waimai.platform.widget.filterbar.presenter.b r12 = (com.sankuai.waimai.platform.widget.filterbar.presenter.b) r12
            long r12 = r12.r()
            java.lang.String r0 = ""
            int r2 = r11.h
            switch(r2) {
                case 1: goto L7d;
                case 2: goto L78;
                default: goto L77;
            }
        L77:
            goto L81
        L78:
            java.lang.String r0 = "b_waimai_x0y47h91_mv"
            java.lang.String r1 = "c_i5kxn8l"
            goto L81
        L7d:
            java.lang.String r0 = "b_waimai_gfd9ctfn_mv"
            java.lang.String r1 = "c_m84bv26"
        L81:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L9f
            com.sankuai.waimai.log.judas.JudasManualManager$a r0 = com.sankuai.waimai.log.judas.JudasManualManager.a(r0)
            java.lang.Object r2 = r11.l
            com.sankuai.waimai.log.judas.JudasManualManager$a r0 = r0.a(r2)
            com.sankuai.waimai.log.judas.JudasManualManager$a r0 = r0.a(r1)
            java.lang.String r1 = "type"
            com.sankuai.waimai.log.judas.JudasManualManager$a r12 = r0.a(r1, r12)
            r12.a()
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.a(java.util.List, boolean):void");
    }

    private void a(b.a.C1086a c1086a, List<String> list, int i) {
        Object[] objArr = {c1086a, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae02dbaf8774aad35b4bd0a3954aca2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae02dbaf8774aad35b4bd0a3954aca2");
        } else if (c1086a == null || TextUtils.isEmpty(c1086a.h)) {
        } else {
            if (this.h == 1 || this.h == 2) {
                String str = this.h == 2 ? "c_i5kxn8l" : "c_m84bv26";
                if (TextUtils.isEmpty("b_waimai_c9k3cfna_mv")) {
                    return;
                }
                JudasManualManager.a a2 = JudasManualManager.b("b_waimai_c9k3cfna_mv").a(this.l).a("click_status", i);
                a(a2, c1086a.h);
                if (!TextUtils.isEmpty(str)) {
                    a2.a(str);
                }
                a2.a();
            }
        }
    }

    void a(JudasManualManager.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7061665030ee8868758daa02c1c23cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7061665030ee8868758daa02c1c23cdf");
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) new JSONArray(str).get(0);
            aVar.a("coupon_type", jSONObject.optInt("coupon_outer_type"));
            aVar.a("coupon_amt", jSONObject.optString("coupon_amount"));
            aVar.a("red_threshold", jSONObject.optString("order_amount_limit"));
            aVar.a("coupon_id", jSONObject.optLong("id"));
        } catch (Exception unused) {
        }
    }

    private String a(Collection<String> collection) {
        int i = 0;
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e8be24bbd78972cca29ded221cb0665", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e8be24bbd78972cca29ded221cb0665");
        }
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : collection) {
            if (!TextUtils.isEmpty(str)) {
                if (i == 0) {
                    sb.append(str);
                } else {
                    sb.append(CommonConstant.Symbol.COMMA);
                    sb.append(str);
                }
                i++;
            }
        }
        return sb.toString();
    }

    String a(long j, Set<String> set) {
        Object[] objArr = {new Long(j), set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb945c232a90e007cb41ce9c05bc2c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb945c232a90e007cb41ce9c05bc2c3");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("navigate_type", this.d);
            jSONObject.put("category_code", this.n);
            jSONObject.put("sub_category_code", this.o);
            jSONObject.put("sort_code", j);
            JSONArray jSONArray = new JSONArray();
            if (set != null) {
                for (String str : set) {
                    if (str != null) {
                        jSONArray.put(str);
                    }
                }
                jSONObject.put("activity_codes", jSONArray);
            }
            if (this.m == 2) {
                String str2 = this.e;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("search_key", str2);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return jSONObject.toString();
    }
}
