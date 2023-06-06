package com.sankuai.waimai.store.skuchoose;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodAttrValue;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodSkuAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodSpuAttr;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m {
    public static ChangeQuickRedirect a;
    private final List<SGGoodAttrValue> b;

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78224847924c3d7b36ecb75c359cd750", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78224847924c3d7b36ecb75c359cd750");
        } else {
            this.b = new ArrayList();
        }
    }

    public final List<String> a(SGGoodAttrValue[] sGGoodAttrValueArr) {
        Object[] objArr = {sGGoodAttrValueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458c438129ab2d51438359e2c625dce7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458c438129ab2d51438359e2c625dce7");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a(sGGoodAttrValueArr)) {
            for (SGGoodAttrValue sGGoodAttrValue : sGGoodAttrValueArr) {
                if (sGGoodAttrValue != null && !TextUtils.isEmpty(sGGoodAttrValue.value)) {
                    arrayList.add(sGGoodAttrValue.value);
                }
            }
        }
        return arrayList;
    }

    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b0ea1ba4d209b253eb6bf30fbf6fe3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b0ea1ba4d209b253eb6bf30fbf6fe3b");
        } else {
            b(goodsSpu);
        }
    }

    private void b(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "469d1aa387c17a531b9df827f8870243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "469d1aa387c17a531b9df827f8870243");
        } else if (goodsSpu != null) {
            List<SGGoodSpuAttr> list = goodsSpu.spuAttrsList;
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (SGGoodSpuAttr sGGoodSpuAttr : list) {
                if (sGGoodSpuAttr != null && !com.sankuai.shangou.stone.util.a.b(sGGoodSpuAttr.valueList)) {
                    arrayList.addAll(sGGoodSpuAttr.valueList);
                }
            }
            this.b.clear();
            this.b.addAll(arrayList);
        }
    }

    public final int a(SGGoodAttrValue sGGoodAttrValue) {
        Object[] objArr = {sGGoodAttrValue};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64f4ac9f47c4dbff55e4e630bf625267", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64f4ac9f47c4dbff55e4e630bf625267")).intValue() : this.b.indexOf(sGGoodAttrValue);
    }

    @NonNull
    public final int[] a(GoodsSpu goodsSpu, SGGoodAttrValue... sGGoodAttrValueArr) {
        Object[] objArr = {goodsSpu, sGGoodAttrValueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b00982c46245bd0c85aa07e48fceafe7", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b00982c46245bd0c85aa07e48fceafe7");
        }
        int[] iArr = new int[this.b.size()];
        if (sGGoodAttrValueArr == null || goodsSpu == null) {
            return iArr;
        }
        for (int i = 0; i < this.b.size(); i++) {
            SGGoodAttrValue sGGoodAttrValue = this.b.get(i);
            if (sGGoodAttrValue != null) {
                iArr[i] = c(goodsSpu, a(goodsSpu, sGGoodAttrValue, sGGoodAttrValueArr)) ? 1 : 0;
            }
        }
        return iArr;
    }

    private SGGoodAttrValue[] a(@NonNull GoodsSpu goodsSpu, @NonNull SGGoodAttrValue sGGoodAttrValue, @NonNull SGGoodAttrValue... sGGoodAttrValueArr) {
        Object[] objArr = {goodsSpu, sGGoodAttrValue, sGGoodAttrValueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89b04ce1b8a1d67380e8e1c7610065b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGGoodAttrValue[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89b04ce1b8a1d67380e8e1c7610065b0");
        }
        int a2 = a(goodsSpu, sGGoodAttrValue);
        if (a2 < 0 || a2 >= sGGoodAttrValueArr.length) {
            return sGGoodAttrValueArr;
        }
        SGGoodAttrValue[] sGGoodAttrValueArr2 = (SGGoodAttrValue[]) Arrays.copyOf(sGGoodAttrValueArr, sGGoodAttrValueArr.length);
        sGGoodAttrValueArr2[a2] = sGGoodAttrValue;
        return sGGoodAttrValueArr2;
    }

    private int a(@NonNull GoodsSpu goodsSpu, SGGoodAttrValue sGGoodAttrValue) {
        Object[] objArr = {goodsSpu, sGGoodAttrValue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4dc5de5aa4954aa8fdfa8a057c1a99b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4dc5de5aa4954aa8fdfa8a057c1a99b")).intValue();
        }
        List<SGGoodSpuAttr> list = goodsSpu.spuAttrsList;
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            SGGoodSpuAttr sGGoodSpuAttr = list.get(i);
            if (sGGoodSpuAttr != null && !com.sankuai.shangou.stone.util.a.b(sGGoodSpuAttr.valueList) && sGGoodSpuAttr.valueList.contains(sGGoodAttrValue)) {
                return i;
            }
        }
        return -1;
    }

    private boolean c(@NonNull GoodsSpu goodsSpu, SGGoodAttrValue... sGGoodAttrValueArr) {
        Object[] objArr = {goodsSpu, sGGoodAttrValueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "590821bac5303e553b0be0708556bd65", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "590821bac5303e553b0be0708556bd65")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(sGGoodAttrValueArr)) {
            return false;
        }
        List<GoodsSku> skus = goodsSpu.getSkus();
        List<Long> a2 = a(goodsSpu, sGGoodAttrValueArr, false);
        if (com.sankuai.shangou.stone.util.a.b(skus) || com.sankuai.shangou.stone.util.a.b(a2)) {
            return false;
        }
        for (GoodsSku goodsSku : skus) {
            if (goodsSku != null && a2.contains(Long.valueOf(goodsSku.id)) && goodsSku.isSoldable()) {
                return true;
            }
        }
        return false;
    }

    public final GoodsSku b(@NonNull GoodsSpu goodsSpu, SGGoodAttrValue... sGGoodAttrValueArr) {
        Object[] objArr = {goodsSpu, sGGoodAttrValueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d731f2ab4949e84cefcca056a034edbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d731f2ab4949e84cefcca056a034edbb");
        }
        if (com.sankuai.shangou.stone.util.a.a(sGGoodAttrValueArr)) {
            Long l = (Long) com.sankuai.shangou.stone.util.a.a((List<Object>) a(goodsSpu, sGGoodAttrValueArr, true), 0);
            return a(goodsSpu.getSkus(), l != null ? l.longValue() : 0L);
        }
        return null;
    }

    private List<Long> a(@NonNull GoodsSpu goodsSpu, @NonNull SGGoodAttrValue[] sGGoodAttrValueArr, boolean z) {
        Object[] objArr = {goodsSpu, sGGoodAttrValueArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efdfa03b968d939582126b563e21f0d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efdfa03b968d939582126b563e21f0d1");
        }
        ArrayList arrayList = new ArrayList();
        Map<Long, Map<String, SGGoodSkuAttr>> clientSkuAttrsMap = goodsSpu.getClientSkuAttrsMap();
        Set<Long> keySet = clientSkuAttrsMap.keySet();
        if (keySet != null) {
            for (Long l : keySet) {
                Map<String, SGGoodSkuAttr> map = clientSkuAttrsMap.get(l);
                if (map != null && a(goodsSpu.spuAttrsList, sGGoodAttrValueArr, map)) {
                    arrayList.add(l);
                    if (z) {
                        return arrayList;
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean a(@NonNull List<SGGoodSpuAttr> list, @NonNull SGGoodAttrValue[] sGGoodAttrValueArr, @NonNull Map<String, SGGoodSkuAttr> map) {
        SGGoodSpuAttr sGGoodSpuAttr;
        SGGoodAttrValue sGGoodAttrValue;
        char c = 0;
        int i = 2;
        Object[] objArr = {list, sGGoodAttrValueArr, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f247fc5a05d6acfc02189f170c29a00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f247fc5a05d6acfc02189f170c29a00")).booleanValue();
        }
        int c2 = com.sankuai.shangou.stone.util.a.c(list);
        int i2 = 0;
        boolean z = true;
        while (i2 < c2) {
            SGGoodSpuAttr sGGoodSpuAttr2 = (SGGoodSpuAttr) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2);
            if (sGGoodSpuAttr2 != null) {
                Object[] objArr2 = new Object[i];
                objArr2[c] = sGGoodSpuAttr2;
                objArr2[1] = sGGoodAttrValueArr;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff801e24ce3bb0308bfe1cd4e70c3a57", RobustBitConfig.DEFAULT_VALUE)) {
                    sGGoodAttrValue = (SGGoodAttrValue) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff801e24ce3bb0308bfe1cd4e70c3a57");
                    sGGoodSpuAttr = sGGoodSpuAttr2;
                } else {
                    sGGoodSpuAttr = sGGoodSpuAttr2;
                    if (!com.sankuai.shangou.stone.util.a.b(sGGoodSpuAttr.valueList)) {
                        for (SGGoodAttrValue sGGoodAttrValue2 : sGGoodAttrValueArr) {
                            if (sGGoodSpuAttr.valueList.contains(sGGoodAttrValue2)) {
                                sGGoodAttrValue = sGGoodAttrValue2;
                                break;
                            }
                        }
                    }
                    sGGoodAttrValue = null;
                }
                String str = sGGoodSpuAttr.name;
                if (sGGoodAttrValue != null && !sGGoodAttrValue.isNonSaleAttr() && map.get(str) != null) {
                    z = TextUtils.equals(map.get(str).value, sGGoodAttrValue.value) & z;
                }
            }
            i2++;
            c = 0;
            i = 2;
        }
        return z;
    }

    private GoodsSku a(List<GoodsSku> list, long j) {
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a0f484db50be472e3c4a3bc0f00fb68", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a0f484db50be472e3c4a3bc0f00fb68");
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (GoodsSku goodsSku : list) {
                if (goodsSku != null && goodsSku.id == j) {
                    return goodsSku;
                }
            }
            return null;
        }
        return null;
    }

    public final void a(@NonNull GoodsAttr[] goodsAttrArr, @NonNull GoodsSpu goodsSpu, @NonNull SGGoodAttrValue[] sGGoodAttrValueArr) {
        Object[] objArr = {goodsAttrArr, goodsSpu, sGGoodAttrValueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17c03236f8f3183111dd55ac1b53ad93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17c03236f8f3183111dd55ac1b53ad93");
            return;
        }
        for (int i = 0; i < sGGoodAttrValueArr.length; i++) {
            SGGoodSpuAttr sGGoodSpuAttr = (SGGoodSpuAttr) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.spuAttrsList, i);
            SGGoodAttrValue sGGoodAttrValue = sGGoodAttrValueArr[i];
            if (sGGoodSpuAttr != null && sGGoodAttrValue != null) {
                goodsAttrArr[i] = sGGoodAttrValue.convertToServerAttr(sGGoodSpuAttr.name);
            } else {
                goodsAttrArr[i] = null;
            }
        }
    }

    public final void a(@NonNull SGGoodAttrValue[] sGGoodAttrValueArr, @NonNull GoodsSpu goodsSpu, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {sGGoodAttrValueArr, goodsSpu, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b6604b245e3a0cc480b119c9390825b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b6604b245e3a0cc480b119c9390825b");
            return;
        }
        OrderedFood a2 = a(goodsSpu, aVar.f());
        if (a2 != null) {
            a(sGGoodAttrValueArr, goodsSpu, a2.getAttrIds());
        } else {
            a(sGGoodAttrValueArr, goodsSpu);
        }
    }

    private OrderedFood a(@NonNull GoodsSpu goodsSpu, long j) {
        Object[] objArr = {goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e293f157c3eda4e151719e7429a606c9", RobustBitConfig.DEFAULT_VALUE) ? (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e293f157c3eda4e151719e7429a606c9") : (OrderedFood) com.sankuai.shangou.stone.util.a.a((List<Object>) com.sankuai.waimai.store.order.a.e().b(j, goodsSpu.getId()), 0);
    }

    private void a(@NonNull SGGoodAttrValue[] sGGoodAttrValueArr, @NonNull GoodsSpu goodsSpu, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {sGGoodAttrValueArr, goodsSpu, goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd97b66e20b6de262c24609908ef4ff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd97b66e20b6de262c24609908ef4ff5");
            return;
        }
        int c = com.sankuai.shangou.stone.util.a.c(goodsSpu.spuAttrsList);
        for (int i = 0; i < c; i++) {
            SGGoodSpuAttr sGGoodSpuAttr = (SGGoodSpuAttr) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.spuAttrsList, i);
            GoodsAttr goodsAttr = (GoodsAttr) com.sankuai.shangou.stone.util.a.a(goodsAttrArr, i);
            if (sGGoodSpuAttr != null && i < sGGoodAttrValueArr.length) {
                sGGoodAttrValueArr[i] = a(sGGoodSpuAttr.valueList, goodsAttr != null ? goodsAttr.value : "");
            }
        }
    }

    private void a(@NonNull SGGoodAttrValue[] sGGoodAttrValueArr, @NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {sGGoodAttrValueArr, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "411be1c9c859f93c11aea0a538923b07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "411be1c9c859f93c11aea0a538923b07");
            return;
        }
        Map<String, SGGoodSkuAttr> map = goodsSpu.getClientSkuAttrsMap().get(Long.valueOf(c(goodsSpu)));
        List<SGGoodSpuAttr> list = goodsSpu.spuAttrsList;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                SGGoodSpuAttr sGGoodSpuAttr = (SGGoodSpuAttr) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                if (sGGoodSpuAttr != null) {
                    SGGoodSkuAttr sGGoodSkuAttr = map != null ? map.get(sGGoodSpuAttr.name) : null;
                    if (i < sGGoodAttrValueArr.length) {
                        sGGoodAttrValueArr[i] = a(sGGoodSpuAttr.valueList, sGGoodSkuAttr != null ? sGGoodSkuAttr.value : "");
                    }
                }
            }
        }
    }

    private long c(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f94b2b0546f140ebb9be90089b40346", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f94b2b0546f140ebb9be90089b40346")).longValue();
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsSpu.getSkuList())) {
            GoodsSku goodsSku = null;
            for (GoodsSku goodsSku2 : goodsSpu.getSkuList()) {
                if (goodsSku2 != null && goodsSku2.isSoldable() && (goodsSku == null || goodsSku2.getPrice() < goodsSku.getPrice())) {
                    goodsSku = goodsSku2;
                }
            }
            if (goodsSku != null) {
                return goodsSku.getSkuId();
            }
            return 0L;
        }
        return 0L;
    }

    private SGGoodAttrValue a(List<SGGoodAttrValue> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6066acc8cb2267b27d032196e31f5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGGoodAttrValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6066acc8cb2267b27d032196e31f5c");
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (SGGoodAttrValue sGGoodAttrValue : list) {
                if (sGGoodAttrValue != null && !TextUtils.isEmpty(sGGoodAttrValue.value) && sGGoodAttrValue.value.equals(str)) {
                    return sGGoodAttrValue;
                }
            }
            return (SGGoodAttrValue) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
        }
        return null;
    }
}
