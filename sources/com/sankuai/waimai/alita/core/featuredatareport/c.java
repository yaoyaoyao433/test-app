package com.sankuai.waimai.alita.core.featuredatareport;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.aidata.a;
import com.sankuai.waimai.alita.core.featuredatareport.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    String b;
    public com.sankuai.waimai.alita.core.dataupload.a<String, a> c;

    public c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e09cec16d35d5890a1814a5bd7cfc0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e09cec16d35d5890a1814a5bd7cfc0a");
            return;
        }
        this.c = new com.sankuai.waimai.alita.core.dataupload.a<>();
        this.b = str;
    }

    public final void a(@Nullable com.sankuai.waimai.alita.core.config.observabledata.c<a> cVar) {
        List<a> list;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3989683207f8d73a80800be78f7b72d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3989683207f8d73a80800be78f7b72d5");
        } else if (cVar != null && (list = (List) cVar.a()) != null) {
            for (a aVar : list) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e2f8753196d7c80419166b8c7cff0fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e2f8753196d7c80419166b8c7cff0fd");
                } else if (aVar != null) {
                    String str = aVar.c;
                    if (!TextUtils.isEmpty(str)) {
                        this.c.a(str, aVar);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2 */
    public void a(String str, String str2, List<a.c> list, Map<String, List<Map<String, Object>>> map) {
        List<Map<String, Object>> list2;
        b bVar;
        Map hashMap;
        int i = 0;
        Object[] objArr = {str, str2, list, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d667a450dc9243afa172c06fa52d4cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d667a450dc9243afa172c06fa52d4cf");
            return;
        }
        for (a.c cVar : list) {
            if (cVar != null && !TextUtils.isEmpty(cVar.a) && map.containsKey(cVar.a) && (list2 = map.get(cVar.a)) != null) {
                String str3 = TextUtils.isEmpty(cVar.c) ? "data_flow_blue" : cVar.c;
                a.d dVar = new a.d();
                dVar.b = cVar.b;
                dVar.c = str3;
                dVar.d = cVar.d;
                dVar.e = cVar.e;
                dVar.f = cVar.f;
                dVar.g = cVar.g;
                dVar.h = cVar.h;
                String a2 = dVar.a();
                b.a a3 = b.a();
                a3.b = str;
                a3.c = str2;
                a3.d = cVar.a;
                a3.e = a2;
                a3.f = list2;
                Object[] objArr2 = new Object[i];
                ChangeQuickRedirect changeQuickRedirect2 = b.a.a;
                if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "aecfc282659baf89d0f8e2bd57571e5e", RobustBitConfig.DEFAULT_VALUE)) {
                    bVar = (b) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, i, "aecfc282659baf89d0f8e2bd57571e5e");
                } else {
                    bVar = new b();
                    bVar.c = a3.b;
                    bVar.d = a3.c;
                    bVar.e = a3.d;
                    bVar.f = a3.e;
                    bVar.g = a3.f;
                }
                b bVar2 = bVar;
                Object[] objArr3 = new Object[1];
                objArr3[i] = bVar2;
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3d73172b72dcc8354f8fbd1cf538c4c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3d73172b72dcc8354f8fbd1cf538c4c6");
                } else {
                    com.sankuai.waimai.alita.core.utils.c.a("AlitaFeatureDataReportManager.uploadData(): data = " + bVar2.toString());
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "2bffcb4e6248c5abc823298bdf9aef51", RobustBitConfig.DEFAULT_VALUE)) {
                        hashMap = (Map) PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "2bffcb4e6248c5abc823298bdf9aef51");
                    } else {
                        hashMap = new HashMap();
                        hashMap.put("alita_data_type", "sql");
                        hashMap.put("alita_data_bundleId", bVar2.c);
                        hashMap.put("alita_data_bundle_version", bVar2.d);
                        hashMap.put("alita_data_sql_name", bVar2.e);
                        hashMap.put("alita_data_sql_content", bVar2.f);
                        hashMap.put("alita_data_result", bVar2.g);
                    }
                    com.sankuai.waimai.alita.core.dataupload.b.a(hashMap);
                }
            }
            i = 0;
        }
    }
}
