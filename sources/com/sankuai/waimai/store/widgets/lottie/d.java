package com.sankuai.waimai.store.widgets.lottie;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.airbnb.lottie.e;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import com.sankuai.shangou.stone.util.j;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends al.b<Map<String, com.airbnb.lottie.e>> {
    public static ChangeQuickRedirect a;
    private final List<String> b;
    private final b c;
    private final c d;
    private final e e;
    private final Map<String, String> f;

    @Override // com.sankuai.waimai.store.util.al.b
    public final /* synthetic */ Map<String, com.airbnb.lottie.e> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c02e57f3d4156974ef5a82cc56e82a91", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c02e57f3d4156974ef5a82cc56e82a91");
        }
        HashMap hashMap = new HashMap(this.f);
        hashMap.putAll(b());
        return a2((Map<String, String>) hashMap);
    }

    @Override // com.sankuai.waimai.store.util.al.b
    public final /* synthetic */ void a(Map<String, com.airbnb.lottie.e> map) {
        Map<String, com.airbnb.lottie.e> map2 = map;
        Object[] objArr = {map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61451ea2af5e2455063e22815884f5ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61451ea2af5e2455063e22815884f5ca");
        } else if (this.e != null) {
            this.e.a(map2);
        }
    }

    public d(String str, e eVar) {
        this(a(com.sankuai.waimai.store.util.b.a()), com.sankuai.shangou.stone.util.a.d(str), null, eVar);
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b632444fc444d397a9e73655d05cc79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b632444fc444d397a9e73655d05cc79");
        }
    }

    public d(List<String> list, Map<String, String> map, e eVar) {
        this(a(com.sankuai.waimai.store.util.b.a()), list, map, eVar);
        Object[] objArr = {list, map, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad2583b24066103ae501ae5bbae62edf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad2583b24066103ae501ae5bbae62edf");
        }
    }

    private d(String str, List<String> list, Map<String, String> map, e eVar) {
        Object[] objArr = {str, list, map, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d8941993418dee53fcc1559fb65418", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d8941993418dee53fcc1559fb65418");
            return;
        }
        this.c = new b(str);
        this.d = new c();
        this.e = eVar;
        this.b = new ArrayList();
        if (list != null) {
            this.b.addAll(list);
        }
        this.f = new HashMap();
        if (map != null) {
            this.f.putAll(map);
        }
    }

    @NonNull
    private static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21f07dfb87bbfdfda63e7873e167bb0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21f07dfb87bbfdfda63e7873e167bb0e");
        }
        File a2 = ab.a(context, "sg_lottie_file", ".lottie_composition_cache", u.b);
        return a2 != null ? a2.getAbsolutePath() : "";
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private Map<String, com.airbnb.lottie.e> a2(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6085e3fb88bff7a38699905c3d8de603", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6085e3fb88bff7a38699905c3d8de603");
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                try {
                    com.airbnb.lottie.e a2 = e.a.a(entry.getValue());
                    if (a2 != null) {
                        hashMap.put(entry.getKey(), a2);
                    }
                } catch (Throwable th) {
                    com.sankuai.shangou.stone.util.log.a.a(th);
                }
            }
        }
        return hashMap;
    }

    @NonNull
    private Map<String, String> b() {
        Map<String, String> map;
        String a2;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ad1eb1eeedf10a5a61ae618341565f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ad1eb1eeedf10a5a61ae618341565f");
        }
        b bVar = this.c;
        List<String> list = this.b;
        int i = 1;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a6c31392b311dae37ebf5b91153d6a08", RobustBitConfig.DEFAULT_VALUE)) {
            map = (Map) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a6c31392b311dae37ebf5b91153d6a08");
        } else {
            HashMap hashMap = new HashMap();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    Object[] objArr3 = new Object[i];
                    objArr3[0] = str;
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "534bbb1531970e22758a178247424c4d", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (String) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "534bbb1531970e22758a178247424c4d");
                    } else {
                        String a3 = bVar.a(str);
                        if (TextUtils.isEmpty(a3)) {
                            a2 = "";
                        } else {
                            File file = new File(a3);
                            a2 = (file.exists() && file.canRead()) ? j.a(file) : "";
                        }
                    }
                    if (!TextUtils.isEmpty(a2)) {
                        hashMap.put(str, a2);
                    }
                    i = 1;
                }
            }
            map = hashMap;
        }
        for (String str2 : this.b) {
            if (!map.containsKey(str2)) {
                String a4 = this.d.a(str2);
                if (!TextUtils.isEmpty(a4)) {
                    map.put(str2, a4);
                    b bVar2 = this.c;
                    Object[] objArr4 = new Object[2];
                    objArr4[c] = str2;
                    objArr4[1] = a4;
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "3cf6434ce24734f07792051213561db3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "3cf6434ce24734f07792051213561db3");
                    } else {
                        String a5 = bVar2.a(str2);
                        if (!TextUtils.isEmpty(a5) && bVar2.b(a5)) {
                            FileUtils.writeFile(a5, a4, false);
                        }
                    }
                    c = 0;
                }
            }
            c = 0;
        }
        return map;
    }
}
