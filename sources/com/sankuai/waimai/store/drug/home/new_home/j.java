package com.sankuai.waimai.store.drug.home.new_home;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends com.sankuai.waimai.store.poilist.mach.a<BaseModuleDesc> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.param.a b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(@Nullable List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list);
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String a(String str) {
        return "MachDrugHomePage";
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String a(String str, String str2) {
        return "新版医药首页 Mach模版";
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* bridge */ /* synthetic */ void a(BaseModuleDesc baseModuleDesc, com.sankuai.waimai.mach.recycler.c cVar) {
    }

    public static /* synthetic */ List a(j jVar, List list) {
        char c = 1;
        char c2 = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "abc65e38a0eba643ec1227d45397a6a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "abc65e38a0eba643ec1227d45397a6a3");
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < com.sankuai.shangou.stone.util.a.c(list)) {
            BaseModuleDesc baseModuleDesc = (BaseModuleDesc) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (baseModuleDesc != null) {
                int i2 = baseModuleDesc.index;
                Object[] objArr2 = new Object[2];
                objArr2[c2] = baseModuleDesc;
                objArr2[c] = Integer.valueOf(i2);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                com.sankuai.waimai.store.poilist.mach.f fVar = null;
                if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "e7209a5bff56ed9117c56528afacc17e", RobustBitConfig.DEFAULT_VALUE)) {
                    fVar = (com.sankuai.waimai.store.poilist.mach.f) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "e7209a5bff56ed9117c56528afacc17e");
                } else {
                    com.sankuai.waimai.mach.recycler.c a2 = !t.a(baseModuleDesc.templateId) ? jVar.a(i2, baseModuleDesc, baseModuleDesc.moduleId, 0) : null;
                    if (a2 != null) {
                        fVar = new com.sankuai.waimai.store.poilist.mach.f(baseModuleDesc, a2);
                    }
                }
                if (fVar != null) {
                    arrayList.add(fVar);
                }
            }
            i++;
            c = 1;
            c2 = 0;
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* bridge */ /* synthetic */ String a(@NonNull BaseModuleDesc baseModuleDesc) {
        return baseModuleDesc.templateId;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* synthetic */ Map a(int i, @NonNull BaseModuleDesc baseModuleDesc) {
        BaseModuleDesc baseModuleDesc2 = baseModuleDesc;
        Object[] objArr = {Integer.valueOf(i), baseModuleDesc2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab159af96a08572a9dc8aa80afcdfa42", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab159af96a08572a9dc8aa80afcdfa42");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", Long.valueOf(this.b.c));
        hashMap.put("category_type", Long.valueOf(this.b.c));
        hashMap.put("navigate_type", Long.valueOf(this.b.c));
        hashMap.put("session_id", Statistics.getSession());
        hashMap.put(Constants.Environment.KEY_UNION_ID, com.sankuai.waimai.store.drug.home.model.b.a());
        hashMap.put("pageSource", t.a(this.b.J) ? "other" : this.b.J);
        hashMap.put("index", Integer.valueOf(baseModuleDesc2.index));
        hashMap.put("api_stids", this.b.T);
        hashMap.put("trace_id", baseModuleDesc2.categoryInfo == null ? "" : baseModuleDesc2.categoryInfo.traceId);
        hashMap.put("rank_trace_id", baseModuleDesc2.categoryInfo == null ? "" : baseModuleDesc2.categoryInfo.rankTraceId);
        hashMap.put("search_bar_extend_func", this.b.ah);
        hashMap.put("sec_cat_id", baseModuleDesc2.categoryInfo == null ? "" : baseModuleDesc2.categoryInfo.code);
        hashMap.put("sec_cat_name", baseModuleDesc2.categoryInfo == null ? "" : baseModuleDesc2.categoryInfo.name);
        hashMap.put("subject_index", Integer.valueOf(baseModuleDesc2.index));
        hashMap.put("section", "1");
        hashMap.put("price_update_group", com.sankuai.waimai.store.drug.home.util.b.b(this.b, com.sankuai.waimai.store.drug.home.util.b.h, ""));
        hashMap.put("isSubjectBanner", Boolean.TRUE);
        hashMap.put("ad_poi_icon", com.sankuai.waimai.platform.utils.sharedpreference.a.a().b((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.key_poi_ad_icon_url, ""));
        hashMap.put("third_cat_id", com.sankuai.waimai.store.drug.home.util.b.b(this.b, com.sankuai.waimai.store.drug.home.util.b.f, 0L));
        if ("supermarket-drug-home-banner".equals(baseModuleDesc2.templateId)) {
            hashMap.put("banner_ad_icon", ImageQualityUtil.a(this.g, com.sankuai.waimai.store.view.banner.bizinfo.a.a(), 2, com.sankuai.shangou.stone.util.h.a(this.g, 10.0f)));
        }
        Map map = baseModuleDesc2.jsonData;
        if (map == null) {
            map = new HashMap();
        }
        map.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap);
        return map;
    }

    public j(@NonNull SCBaseActivity sCBaseActivity, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(sCBaseActivity, new k(sCBaseActivity, aVar.G), DefaultHeaderService.KEY_DRUG);
        Object[] objArr = {sCBaseActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4958c6fd744ff842ed9baef25b3a4074", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4958c6fd744ff842ed9baef25b3a4074");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9dda6a8b81610966af3e7f085be543f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9dda6a8b81610966af3e7f085be543f");
        }
        return str2 + ":新版医药首页 Mach模版预渲染失败！";
    }

    public final void a(final a aVar, final List<BaseModuleDesc> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb1892e68cfc815b294aaf28c87e34e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb1892e68cfc815b294aaf28c87e34e");
            return;
        }
        final int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        if (a2 <= 1) {
            if (a2 == 1) {
                rx.d.a((d.a) new d.a<List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.drug.home.new_home.j.5
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Object obj) {
                        rx.j jVar = (rx.j) obj;
                        Object[] objArr2 = {jVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e272b50c2a6d61d69eae2c331432fd1c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e272b50c2a6d61d69eae2c331432fd1c");
                        } else {
                            jVar.onNext(j.a(j.this, list));
                        }
                    }
                }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).c(new rx.functions.b<List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.drug.home.new_home.j.4
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list2) {
                        List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list3 = list2;
                        Object[] objArr2 = {list3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f9067f7cbf37f4d17ce4e826f883bf7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f9067f7cbf37f4d17ce4e826f883bf7");
                        } else if (aVar != null) {
                            aVar.a(list3);
                        }
                    }
                });
                return;
            } else if (aVar != null) {
                aVar.a(null);
                return;
            } else {
                return;
            }
        }
        int ceil = (int) Math.ceil(a2 / 2.0d);
        LinkedList<List> linkedList = new LinkedList();
        for (int i = 0; i < 2; i++) {
            int i2 = i * ceil;
            if (i2 >= a2) {
                break;
            }
            List a3 = com.sankuai.shangou.stone.util.a.a(list, i2, i2 + ceil);
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a3)) {
                linkedList.add(a3);
            }
        }
        LinkedList linkedList2 = new LinkedList();
        for (final List list2 : linkedList) {
            linkedList2.add(rx.d.a((d.a) new d.a<List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.drug.home.new_home.j.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    rx.j jVar = (rx.j) obj;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3908f93dffa37b1711ff7388ec65bba9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3908f93dffa37b1711ff7388ec65bba9");
                    } else {
                        jVar.onNext(j.a(j.this, list2));
                    }
                }
            }).b(rx.schedulers.a.e()));
        }
        rx.d.a((Iterable<? extends rx.d<?>>) linkedList2, new rx.functions.k<List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.drug.home.new_home.j.3
            public static ChangeQuickRedirect a;

            @Override // rx.functions.k
            public final /* synthetic */ List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> call(Object[] objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "4923e3e04a377c6b51da4ce7c6edcd5e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "4923e3e04a377c6b51da4ce7c6edcd5e");
                }
                ArrayList arrayList = new ArrayList(a2);
                if (objArr2 != null && objArr2.length > 0) {
                    for (Object obj : objArr2) {
                        if (obj instanceof List) {
                            arrayList.addAll((List) obj);
                        }
                    }
                }
                return arrayList;
            }
        }).a(rx.android.schedulers.a.a()).c(new rx.functions.b<List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>>>() { // from class: com.sankuai.waimai.store.drug.home.new_home.j.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list3) {
                List<com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc>> list4 = list3;
                Object[] objArr2 = {list4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36267fa11580642a09c7b64ebf43505d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36267fa11580642a09c7b64ebf43505d");
                } else if (aVar != null) {
                    aVar.a(list4);
                }
            }
        });
    }
}
