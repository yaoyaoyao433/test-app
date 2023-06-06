package com.sankuai.waimai.store.drug.home.new_home.realtime;

import android.arch.lifecycle.k;
import android.arch.lifecycle.o;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.realtime.b;
import com.sankuai.waimai.store.drug.home.util.c;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NewDrugHomeRealtimeViewModel extends o {
    public static ChangeQuickRedirect a;
    public long b;
    public CategoryInfo c;
    public List<BaseModuleDesc> d;
    public BaseModuleDesc e;
    public com.sankuai.waimai.store.drug.home.realtime.a f;
    public List<String> g;
    public boolean h;
    public CategoryInfo i;
    public boolean j;
    public String k;
    public List<CategoryInfo> l;
    public k<a<Pair<CategoryInfo, BaseModuleDesc>>> m;
    public k<a<Pair<CategoryInfo, List<BaseModuleDesc>>>> n;
    public k<PoiVerticalityDataResponse> o;
    private int p;
    private Handler q;

    public NewDrugHomeRealtimeViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9d2ce5253e4e88e4545c1ce6f0a064", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9d2ce5253e4e88e4545c1ce6f0a064");
            return;
        }
        this.b = -1L;
        this.p = 3000;
        this.g = new ArrayList(Arrays.asList("b_waimai_egp2c7ci_mc", "b_waimai_3t8inatm_mc", "b_waimai_cuiyuhp4_mc", "b_waimai_2x6ufr79_mc", "b_waimai_ux54hjl6_mc", "b_waimai_lsvjnbsq_mc"));
        this.h = false;
        this.j = false;
        this.k = null;
        this.m = new k<>();
        this.n = new k<>();
        this.o = new k<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(NewDrugHomeRealtimeViewModel newDrugHomeRealtimeViewModel, SCBaseActivity sCBaseActivity, com.sankuai.waimai.store.param.a aVar, PoiVerticalityDataResponse poiVerticalityDataResponse, boolean z) {
        PoiData poidata;
        BaseModuleDesc baseModuleDesc;
        Pair pair;
        boolean z2 = true;
        Object[] objArr = {sCBaseActivity, aVar, poiVerticalityDataResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, newDrugHomeRealtimeViewModel, changeQuickRedirect, false, "9aab098c418ecb1edf492db0ae7742c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, newDrugHomeRealtimeViewModel, changeQuickRedirect, false, "9aab098c418ecb1edf492db0ae7742c3");
        } else if (newDrugHomeRealtimeViewModel.c == null || newDrugHomeRealtimeViewModel.c.index >= 0) {
            PoiData poidata2 = 0;
            poidata2 = 0;
            if (newDrugHomeRealtimeViewModel.e != null && newDrugHomeRealtimeViewModel.e.jsonData != null && (newDrugHomeRealtimeViewModel.e.jsonData.get("poi_list") instanceof List) && (baseModuleDesc = (BaseModuleDesc) com.sankuai.shangou.stone.util.a.a((List<Object>) poiVerticalityDataResponse.machPoiCardInfos, 0)) != null && baseModuleDesc.jsonData != null && (baseModuleDesc.jsonData.get("poi_list") instanceof List)) {
                List list = (List) newDrugHomeRealtimeViewModel.e.jsonData.get("poi_list");
                List list2 = (List) baseModuleDesc.jsonData.get("poi_list");
                ArrayList<Pair> arrayList = new ArrayList();
                int i = 0;
                for (int max = Math.max(0, newDrugHomeRealtimeViewModel.f.c); max < list.size(); max++) {
                    if (newDrugHomeRealtimeViewModel.a((Map) com.sankuai.shangou.stone.util.a.a((List<Object>) list, max), (Map) com.sankuai.shangou.stone.util.a.a((List<Object>) list2, i))) {
                        arrayList.add(Pair.create(Integer.valueOf(max), Integer.valueOf(i)));
                    }
                    i++;
                }
                if (arrayList.size() > 0) {
                    for (Pair pair2 : arrayList) {
                        list.remove(((Integer) pair2.first).intValue());
                        list.add(((Integer) pair2.first).intValue(), list2.get(((Integer) pair2.second).intValue()));
                    }
                    BaseModuleDesc baseModuleDesc2 = new BaseModuleDesc();
                    baseModuleDesc2.index = newDrugHomeRealtimeViewModel.e.index;
                    baseModuleDesc2.categoryInfo = newDrugHomeRealtimeViewModel.e.categoryInfo;
                    baseModuleDesc2.templateId = newDrugHomeRealtimeViewModel.e.templateId;
                    baseModuleDesc2.jsonData = newDrugHomeRealtimeViewModel.e.jsonData;
                    pair = Pair.create(newDrugHomeRealtimeViewModel.c, baseModuleDesc2);
                } else {
                    pair = null;
                }
                poidata = 0;
                poidata2 = pair;
            } else {
                if (!com.sankuai.shangou.stone.util.a.b(newDrugHomeRealtimeViewModel.d) && !com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.machPoiCardInfos)) {
                    ArrayList arrayList2 = null;
                    int i2 = 0;
                    for (int max2 = Math.max(0, newDrugHomeRealtimeViewModel.f.c); max2 < newDrugHomeRealtimeViewModel.d.size(); max2++) {
                        BaseModuleDesc baseModuleDesc3 = (BaseModuleDesc) com.sankuai.shangou.stone.util.a.a((List<Object>) newDrugHomeRealtimeViewModel.d, max2);
                        BaseModuleDesc baseModuleDesc4 = (BaseModuleDesc) com.sankuai.shangou.stone.util.a.a((List<Object>) poiVerticalityDataResponse.machPoiCardInfos, i2);
                        if (baseModuleDesc3 != null && baseModuleDesc4 != null && newDrugHomeRealtimeViewModel.a(baseModuleDesc3.jsonData, baseModuleDesc4.jsonData)) {
                            baseModuleDesc3.jsonData = baseModuleDesc4.jsonData;
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(baseModuleDesc3);
                        }
                        i2++;
                    }
                    if (!com.sankuai.shangou.stone.util.a.b(arrayList2)) {
                        poidata = Pair.create(newDrugHomeRealtimeViewModel.c, arrayList2);
                    }
                }
                poidata = 0;
            }
            z2 = (z && newDrugHomeRealtimeViewModel.b() && com.sankuai.waimai.store.drug.home.new_home.util.a.a(newDrugHomeRealtimeViewModel.l, poiVerticalityDataResponse.categoryInfos)) ? false : false;
            if (poidata2 != 0) {
                a<Pair<CategoryInfo, BaseModuleDesc>> aVar2 = new a<>();
                aVar2.a = poidata2;
                if (z2) {
                    com.sankuai.waimai.store.drug.home.new_home.util.a.a(sCBaseActivity, poiVerticalityDataResponse, aVar, false);
                    aVar2.b = poiVerticalityDataResponse;
                }
                newDrugHomeRealtimeViewModel.m.b((k<a<Pair<CategoryInfo, BaseModuleDesc>>>) aVar2);
            } else if (poidata == 0) {
                if (z2) {
                    com.sankuai.waimai.store.drug.home.new_home.util.a.a(sCBaseActivity, poiVerticalityDataResponse, aVar, false);
                    newDrugHomeRealtimeViewModel.o.b((k<PoiVerticalityDataResponse>) poiVerticalityDataResponse);
                }
            } else {
                a<Pair<CategoryInfo, List<BaseModuleDesc>>> aVar3 = new a<>();
                aVar3.a = poidata;
                if (z2) {
                    com.sankuai.waimai.store.drug.home.new_home.util.a.a(sCBaseActivity, poiVerticalityDataResponse, aVar, false);
                    aVar3.b = poiVerticalityDataResponse;
                }
                newDrugHomeRealtimeViewModel.n.b((k<a<Pair<CategoryInfo, List<BaseModuleDesc>>>>) aVar3);
            }
        }
    }

    public boolean b() {
        return this.i != null && this.i.categoryCodeType == 1;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab2281a7c2dda29574d6d2da8a58ff1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab2281a7c2dda29574d6d2da8a58ff1");
            return;
        }
        if (!com.sankuai.shangou.stone.util.a.b(this.d)) {
            this.d.clear();
        }
        this.e = null;
        this.b = -1L;
        g();
    }

    public final void a(int i) {
        if (i > 0) {
            this.p = i;
        }
    }

    public final void a(@NonNull CategoryInfo categoryInfo, @NonNull BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {categoryInfo, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b39bb289429ba907ad4e3ab02faf19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b39bb289429ba907ad4e3ab02faf19");
        } else if (c.a(baseModuleDesc.templateId)) {
            this.c = categoryInfo;
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(baseModuleDesc);
        } else if (c.b(baseModuleDesc.templateId)) {
            this.c = categoryInfo;
            this.e = baseModuleDesc;
        }
    }

    private boolean a(Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7dea113c9248ec548c034d8f5e283e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7dea113c9248ec548c034d8f5e283e6")).booleanValue();
        }
        if (map == null || map2 == null) {
            return false;
        }
        long a2 = b.a(map.get("id"));
        long a3 = b.a(map2.get("id"));
        String a4 = b.a(map);
        String a5 = b.a(map2);
        return !((a2 > a3 ? 1 : (a2 == a3 ? 0 : -1)) == 0 && ((TextUtils.isEmpty(a4) && TextUtils.isEmpty(a5)) || (!TextUtils.isEmpty(a4) && !TextUtils.isEmpty(a5) && a4.equals(a5))));
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f41810ba12f60f888097955fe97cdb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f41810ba12f60f888097955fe97cdb6");
            return;
        }
        if (this.q == null) {
            this.q = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.drug.home.new_home.realtime.NewDrugHomeRealtimeViewModel.3
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(@NonNull Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87b58e1c27e83bad2819cbed395f48d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87b58e1c27e83bad2819cbed395f48d2");
                        return;
                    }
                    super.handleMessage(message);
                    if (message.obj instanceof com.sankuai.waimai.store.drug.home.realtime.a) {
                        NewDrugHomeRealtimeViewModel.this.a((com.sankuai.waimai.store.drug.home.realtime.a) message.obj);
                    }
                }
            };
        }
        Message obtain = Message.obtain();
        obtain.obj = this.f;
        f();
        this.q.sendMessageDelayed(obtain, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a53d1b49421d6ffa7c1044f7d8146caa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a53d1b49421d6ffa7c1044f7d8146caa");
        } else if (this.q != null) {
            this.q.removeCallbacksAndMessages(null);
        }
    }

    public com.sankuai.waimai.store.drug.home.realtime.a e() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaab648935936a3e7b8f7ee13163fc67", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.drug.home.realtime.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaab648935936a3e7b8f7ee13163fc67");
        }
        com.sankuai.waimai.store.drug.home.realtime.a aVar = new com.sankuai.waimai.store.drug.home.realtime.a();
        aVar.a = a((Object) aVar);
        if (this.b < 0) {
            aVar.e = "";
            aVar.b = -1;
            aVar.d = (this.e == null || this.e.jsonData == null || !(this.e.jsonData.get("poi_list") instanceof List)) ? com.sankuai.shangou.stone.util.a.a((List) this.d) : ((List) this.e.jsonData.get("poi_list")).size();
            aVar.c = -1;
            return aVar;
        }
        if (this.e == null) {
            while (true) {
                if (i >= this.d.size()) {
                    break;
                }
                BaseModuleDesc baseModuleDesc = this.d.get(i);
                if (baseModuleDesc != null && baseModuleDesc.jsonData != null) {
                    long a2 = b.a(baseModuleDesc.jsonData.get("id"));
                    if (TextUtils.isEmpty(aVar.e)) {
                        aVar.e = "[" + a2;
                    } else {
                        aVar.e += CommonConstant.Symbol.COMMA + a2;
                    }
                    if (a2 == this.b) {
                        aVar.e += CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                        aVar.b = i;
                        aVar.d = this.d.size() - i;
                        aVar.c = i;
                        break;
                    }
                }
                i++;
            }
        } else if (this.e.jsonData != null && (this.e.jsonData.get("poi_list") instanceof List)) {
            List list = (List) this.e.jsonData.get("poi_list");
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                Map map = (Map) list.get(i);
                if (map != null) {
                    long a3 = b.a(map.get("id"));
                    if (TextUtils.isEmpty(aVar.e)) {
                        aVar.e = "[" + a3;
                    } else {
                        aVar.e += CommonConstant.Symbol.COMMA + a3;
                    }
                    if (a3 == this.b) {
                        aVar.e += CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                        aVar.b = i;
                        aVar.d = list.size() - i;
                        aVar.c = i;
                        break;
                    }
                }
                i++;
            }
        }
        return aVar;
    }

    private String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02bef67af7a3ddd31b2e259680565b1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02bef67af7a3ddd31b2e259680565b1d");
        }
        return System.identityHashCode(obj) + "@" + System.currentTimeMillis();
    }

    public void a(com.sankuai.waimai.store.drug.home.realtime.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f7b44269023b5f0d73210ba6f7c8df7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f7b44269023b5f0d73210ba6f7c8df7");
        } else if (aVar == null || aVar.h) {
        } else {
            com.sankuai.waimai.store.base.net.c.a(aVar.a);
            aVar.h = true;
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca67cb15be59110206dee0887121bda6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca67cb15be59110206dee0887121bda6");
            return;
        }
        a(this.f);
        f();
    }

    @Override // android.arch.lifecycle.o
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b44c1be517fbf4b262564094b6138c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b44c1be517fbf4b262564094b6138c0");
            return;
        }
        super.a();
        g();
    }
}
