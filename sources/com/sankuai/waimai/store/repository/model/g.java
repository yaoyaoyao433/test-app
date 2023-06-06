package com.sankuai.waimai.store.repository.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.PoiOperationItem;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final List<String> q = Arrays.asList("recommend_guess_floor");
    public int b;
    public String c;
    public int d;
    public boolean e;
    public int f;
    public GoodsPoiCategory g;
    public com.sankuai.waimai.store.entity.a h;
    public boolean i;
    public List<PoiOperationItem> j;
    public List<RestMenuResponse.NavigateItem> k;
    public Poi l;
    public List<BaseModuleDesc> m;
    public BaseModuleDesc n;
    public com.sankuai.waimai.store.poilist.mach.f<BaseModuleDesc> o;
    public e p;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "379df57c84e07d7a7101033c216558eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "379df57c84e07d7a7101033c216558eb");
            return;
        }
        this.i = false;
        this.m = new ArrayList();
    }

    public static List<g> a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        BaseModuleDesc baseModuleDesc = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba8161fa0567d4efb7dee094dbc1f8e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba8161fa0567d4efb7dee094dbc1f8e2");
        }
        RestMenuResponse.a aVar = restMenuResponse.poiTags;
        LinkedList linkedList = new LinkedList();
        if (aVar != null) {
            int i = aVar.b;
            if (i == 1) {
                g gVar = new g();
                gVar.k = aVar.c;
                gVar.b = 4;
                linkedList.add(gVar);
            } else if (i == 2) {
                g gVar2 = new g();
                gVar2.k = aVar.c;
                gVar2.b = 5;
                linkedList.add(gVar2);
            }
        }
        if (w.a(restMenuResponse.getPoi()) && !b(restMenuResponse)) {
            g gVar3 = new g();
            gVar3.b = 6;
            gVar3.l = restMenuResponse.mPoi;
            gVar3.m.clear();
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) restMenuResponse.moduleList)) {
                Iterator<BaseModuleDesc> it = restMenuResponse.moduleList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BaseModuleDesc next = it.next();
                    if (next != null && !TextUtils.equals(next.nativeId, "native") && TextUtils.equals("food_discount", next.moduleId)) {
                        baseModuleDesc = next;
                        break;
                    }
                }
            }
            if (baseModuleDesc != null) {
                gVar3.m.add(baseModuleDesc);
            }
            linkedList.add(gVar3);
        }
        if (restMenuResponse.mBanners != null) {
            g gVar4 = new g();
            gVar4.j = restMenuResponse.mBanners;
            gVar4.b = 3;
            linkedList.add(gVar4);
        }
        boolean b = b(restMenuResponse, linkedList) | false;
        if (!b) {
            b |= a(restMenuResponse, linkedList);
        }
        if (!b) {
            g gVar5 = new g();
            gVar5.b = 9;
            gVar5.f = 2;
            linkedList.add(gVar5);
        }
        return linkedList;
    }

    public static boolean b(@Nullable RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82094e2b94d86a75099c7a87a818e99e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82094e2b94d86a75099c7a87a818e99e")).booleanValue();
        }
        if (restMenuResponse != null) {
            try {
                if (restMenuResponse.getPoi().addition.floorTagsMrn) {
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }

    private static boolean a(@NonNull RestMenuResponse restMenuResponse, @NonNull List<g> list) {
        if (com.sankuai.shangou.stone.util.a.b(restMenuResponse.floorTags)) {
            return false;
        }
        List<GoodsPoiCategory> list2 = restMenuResponse.floorTags;
        LinkedList linkedList = new LinkedList();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            GoodsPoiCategory goodsPoiCategory = list2.get(i);
            if (goodsPoiCategory != null) {
                if (i == 0) {
                    g gVar = new g();
                    if (goodsPoiCategory.floorNumber == 5 || goodsPoiCategory.floorStyleType == 1) {
                        gVar.b = 9;
                        gVar.f = 1;
                    } else {
                        gVar.b = 9;
                        gVar.f = 2;
                    }
                    linkedList.add(gVar);
                }
                g gVar2 = new g();
                if (goodsPoiCategory.floorStyleType == 1) {
                    gVar2.b = 10;
                } else {
                    gVar2.b = 1;
                }
                gVar2.g = goodsPoiCategory;
                gVar2.d = i;
                gVar2.i = b(goodsPoiCategory);
                if (goodsPoiCategory.isSelected()) {
                    gVar2.e = true;
                }
                linkedList.add(gVar2);
            }
        }
        com.sankuai.shangou.stone.util.a.a((Collection) list, (Collection) linkedList);
        return com.sankuai.shangou.stone.util.a.a((Collection<?>) linkedList);
    }

    private static boolean b(@NonNull RestMenuResponse restMenuResponse, @NonNull List<g> list) {
        boolean z = false;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) restMenuResponse.moduleList)) {
            int i = 0;
            for (BaseModuleDesc baseModuleDesc : restMenuResponse.moduleList) {
                if (baseModuleDesc != null && !t.a(baseModuleDesc.moduleId) && q.contains(baseModuleDesc.moduleId)) {
                    g gVar = new g();
                    gVar.b = 11;
                    gVar.n = baseModuleDesc;
                    gVar.d = i;
                    a(gVar, baseModuleDesc);
                    i++;
                    list.add(gVar);
                    z = true;
                }
            }
        }
        return z;
    }

    private static void a(@NonNull g gVar, @NonNull BaseModuleDesc baseModuleDesc) {
        boolean z = true;
        Object[] objArr = {gVar, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66f36159d94fd809f4f01cb3102f4d27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66f36159d94fd809f4f01cb3102f4d27");
            return;
        }
        Map<String, Object> map = baseModuleDesc.jsonData;
        if (map == null) {
            return;
        }
        Object obj = map.get(DMKeys.KEY_SELECTED);
        z = (!(obj instanceof Double) || ((Double) obj).doubleValue() <= 0.0d) ? false : false;
        gVar.e = z;
        if (z) {
            map.put("selected_index", 0);
        }
    }

    public static List<g> a(List<GoodsPoiCategory> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b968e4d22bebf2a0ae1f0483b69631b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b968e4d22bebf2a0ae1f0483b69631b");
        }
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                GoodsPoiCategory goodsPoiCategory = list.get(i);
                g gVar = new g();
                gVar.b = 1;
                if (a(goodsPoiCategory)) {
                    gVar.b = 11;
                }
                gVar.g = goodsPoiCategory;
                gVar.i = c(goodsPoiCategory);
                if (goodsPoiCategory.isSelected()) {
                    gVar.e = true;
                }
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    public static boolean a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afbe839773ea0784a5361b5436ed94bb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afbe839773ea0784a5361b5436ed94bb")).booleanValue() : (goodsPoiCategory == null || goodsPoiCategory.cardType != 1 || goodsPoiCategory.cardModuleData == null || t.a(goodsPoiCategory.cardModuleData.templateId) || goodsPoiCategory.cardModuleData.jsonData == null) ? false : true;
    }

    private static boolean b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7eec046739ab97413b3e00d5bd0f720f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7eec046739ab97413b3e00d5bd0f720f")).booleanValue();
        }
        if (!p.a(goodsPoiCategory) && !p.a(goodsPoiCategory.spus)) {
            int size = goodsPoiCategory.spus.size();
            for (int i = 0; i < size; i++) {
                GoodsSpu goodsSpu = goodsPoiCategory.spus.get(i);
                if (goodsSpu != null && a(goodsSpu)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4acc572e1314c121b1d0cf3549ebd195", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4acc572e1314c121b1d0cf3549ebd195")).booleanValue();
        }
        if (!p.a(goodsPoiCategory) && !p.a(goodsPoiCategory.spus)) {
            int size = goodsPoiCategory.spus.size();
            for (int i = 0; i < size; i++) {
                GoodsSpu goodsSpu = goodsPoiCategory.spus.get(i);
                if (goodsSpu != null && a(goodsSpu)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02b9863d184f43634f307ed54fd35931", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02b9863d184f43634f307ed54fd35931")).booleanValue() : goodsSpu.handPriceInfo == null ? (goodsSpu.mTopNumberAndPrivacyTag == null && TextUtils.isEmpty(goodsSpu.deliveryTimeShow) && !b(goodsSpu)) ? false : true : (goodsSpu.handPriceInfo.isShowNewStyle() && goodsSpu.mTopNumberAndPrivacyTag == null && TextUtils.isEmpty(goodsSpu.deliveryTimeShow)) ? false : true;
    }

    private static boolean b(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cd121e075abaaa90f665fc005570887", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cd121e075abaaa90f665fc005570887")).booleanValue() : com.sankuai.shangou.stone.util.i.e(Double.valueOf(goodsSpu.memberPrice), Double.valueOf(0.0d)) && !goodsSpu.isBuyPlus();
    }

    public static List<g> a(List<GoodsSpu> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7979d0ef5f9c3423270df3999bc9b16", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7979d0ef5f9c3423270df3999bc9b16");
        }
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                com.sankuai.waimai.store.entity.a aVar = new com.sankuai.waimai.store.entity.a("", (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i), (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i + 1));
                g gVar = new g();
                gVar.b = 2;
                gVar.h = aVar;
                if (i == 0) {
                    gVar.c = str;
                }
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    public static g a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79a27eb70f3c8f6721c647b5809c90fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79a27eb70f3c8f6721c647b5809c90fa");
        }
        g gVar = new g();
        gVar.b = 8;
        gVar.c = str;
        return gVar;
    }
}
