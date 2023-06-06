package com.sankuai.waimai.store.platform.domain.manager.order;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.util.ae;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements Serializable {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.store.platform.domain.manager.order.util.b<String, com.sankuai.waimai.store.platform.domain.core.shopcart.b> b;
    private final com.sankuai.waimai.store.platform.domain.manager.order.util.b<String, com.sankuai.waimai.store.platform.domain.manager.poi.a> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b {
        public static ChangeQuickRedirect a;
        @Nullable
        private final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b c;
        private final String d;

        public a(String str, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
            Object[] objArr = {e.this, str, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dbcd57594414a5ca98648688ee0cafb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dbcd57594414a5ca98648688ee0cafb");
                return;
            }
            this.c = bVar;
            this.d = str;
        }

        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
        public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e eVar) {
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e6230886d3884e629bcb8e420d21a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e6230886d3884e629bcb8e420d21a1");
            } else if (this.c != null) {
                this.c.a(eVar);
            }
        }

        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e98085ff65f45b01e6a23cc7ee7aeb9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e98085ff65f45b01e6a23cc7ee7aeb9");
                return;
            }
            com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(this.c);
            String str = ae.b;
            ae.a(str, "CalculateCallback.onStart mPoiId=" + this.d);
        }

        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
        public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70fb1915f49e705715b8baa292364829", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70fb1915f49e705715b8baa292364829");
                return;
            }
            com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar, this.c);
            long currentTimeMillis = System.currentTimeMillis();
            String str = ae.b;
            ae.a(str, "CalculateCallback.onSuccess mPoiId=" + this.d + "; cartData=" + bVar);
            String str2 = ae.b;
            StringBuilder sb = new StringBuilder("CalculateCallback.onSuccess useTime=");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            ae.a(str2, sb.toString());
        }

        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
        public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549b0e7f363812b43ea45f1e44a4484e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549b0e7f363812b43ea45f1e44a4484e");
                return;
            }
            com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(aVar, this.c);
            String str = ae.b;
            ae.a(str, "CalculateCallback.onFailure mPoiId=" + this.d + aVar);
        }

        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
        public final String b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4d0d5405bcf3e27ddd9995a11c83a1f", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4d0d5405bcf3e27ddd9995a11c83a1f");
            }
            if (this.c != null) {
                return this.c.b();
            }
            return super.b();
        }
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ead446779efc879ad4d2c6149bdcaed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ead446779efc879ad4d2c6149bdcaed");
            return;
        }
        com.sankuai.waimai.store.manager.globalcart.a a2 = com.sankuai.waimai.store.manager.globalcart.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.manager.globalcart.a.a;
        List<? extends List<?>> innerList = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "301ba69e0872a71b6ad6e83950f0e6ae", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "301ba69e0872a71b6ad6e83950f0e6ae") : com.sankuai.waimai.foundation.core.service.globalcart.a.a().getInnerList();
        ArrayList arrayList = new ArrayList();
        for (List<?> list : innerList) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                String str = "";
                if (obj instanceof String) {
                    str = (String) obj;
                } else if (obj instanceof Long) {
                    str = String.valueOf(obj);
                }
                arrayList2.add(str);
            }
            arrayList.add(arrayList2);
        }
        com.sankuai.waimai.store.platform.domain.manager.order.util.a aVar = new com.sankuai.waimai.store.platform.domain.manager.order.util.a(arrayList);
        this.b = new com.sankuai.waimai.store.platform.domain.manager.order.util.b<>(aVar);
        this.c = new com.sankuai.waimai.store.platform.domain.manager.order.util.b<>(aVar);
    }

    public final void a(String str, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc505408f21b7ed95d1ea36c83ed93e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc505408f21b7ed95d1ea36c83ed93e0");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b i = i(str);
        i.a(b(str), new a(str, bVar));
        String str2 = ae.b;
        ae.a(str2, "ShopRepo.resetOrder cartData=" + i.hashCode() + "; poiId=" + str);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7890d2a7cf94d792c923f0848dd0f1b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7890d2a7cf94d792c923f0848dd0f1b2");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b i = i(str);
        i.c();
        String str2 = ae.b;
        ae.a(str2, "ShopRepo.resetOrderWithoutCalculate cartData=" + i.hashCode() + "; poiId=" + str);
    }

    public final void a(String str, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd6be4b24841ab511174c4fd762c46d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd6be4b24841ab511174c4fd762c46d3");
        } else {
            this.c.a(str, aVar);
        }
    }

    public final com.sankuai.waimai.store.platform.domain.manager.poi.a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368e6e5761c17ebfe1a54359395223d9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368e6e5761c17ebfe1a54359395223d9") : this.c.a(str);
    }

    public final int a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d8e55b4e8b9a9db7abd958e26e01f2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d8e55b4e8b9a9db7abd958e26e01f2")).intValue() : i(str).a(j);
    }

    public final int a(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a635be9642359014d51f9afecaad422f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a635be9642359014d51f9afecaad422f")).intValue() : i(str).a(j, j2);
    }

    public final int a(String str, long j, long j2, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {str, new Long(j), new Long(j2), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1825b050e2a4685dbaa1422d5f6f3e9b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1825b050e2a4685dbaa1422d5f6f3e9b")).intValue() : i(str).a(j, j2, goodsAttrArr);
    }

    public final int a(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec6d69f87e09da899105ea7b471fe17", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec6d69f87e09da899105ea7b471fe17")).intValue() : i(str).a(j, str2);
    }

    public final HandPriceInfo b(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9933e78f3e6e834818beeb73b0ecbf6a", RobustBitConfig.DEFAULT_VALUE) ? (HandPriceInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9933e78f3e6e834818beeb73b0ecbf6a") : i(str).b(j, j2);
    }

    public final int c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96864f6bc7063ec4a11da091b35b11e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96864f6bc7063ec4a11da091b35b11e0")).intValue();
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b a2 = this.b.a(str);
        if (a2 != null) {
            return a2.e();
        }
        return 0;
    }

    public final int d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "610eb8653ce9faeadbe9a6adce210d8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "610eb8653ce9faeadbe9a6adce210d8b")).intValue();
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b a2 = this.b.a(str);
        if (a2 != null) {
            return a2.e();
        }
        return 0;
    }

    public final JSONArray a() {
        com.sankuai.waimai.store.platform.domain.manager.poi.a value;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48f16e38119e9f24c9e88dc3432ae4fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48f16e38119e9f24c9e88dc3432ae4fb");
        }
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, com.sankuai.waimai.store.platform.domain.manager.poi.a> entry : this.c.a()) {
            if (entry != null && (value = entry.getValue()) != null && value.b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", value.b.getOfficialPoiId());
                    jSONObject.put("name", value.b.name);
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
        return jSONArray;
    }

    public final double e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a3e8c515b19158f48b1d4400308495", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a3e8c515b19158f48b1d4400308495")).doubleValue() : i(str).g.mTotalAndBoxPrice;
    }

    public final double f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8185feecaffa7c7d857bdbb84cdeb56", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8185feecaffa7c7d857bdbb84cdeb56")).doubleValue() : i(str).g();
    }

    public final void b(String str, com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45233f9132d5ab9f431258ad12d54558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45233f9132d5ab9f431258ad12d54558");
        } else {
            i(str).b(this.c.a(str), bVar);
        }
    }

    public final void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa7621ab826cc3dfb5d06b6e90a30b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa7621ab826cc3dfb5d06b6e90a30b7");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b i = i(str);
        i.s = true;
        i.r = System.currentTimeMillis();
    }

    public final void a(String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i, int i2, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), Integer.valueOf(i2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a716cfd37bc39f473a8c52742566e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a716cfd37bc39f473a8c52742566e6");
        } else {
            i(str).a(goodsSpu, goodsSku, goodsAttrArr, i, i2, b(str), new a(str, bVar));
        }
    }

    public final OrderedFood a(String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i) {
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097aac65172474bfb3b9490833cd5e38", RobustBitConfig.DEFAULT_VALUE) ? (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097aac65172474bfb3b9490833cd5e38") : i(str).a(goodsSpu, goodsSku, goodsAttrArr, i, b(str));
    }

    public final void a(String str, OrderedFood orderedFood, int i, int i2, int i3, int i4, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27ee5adcbab4bbfb76f83f99b6654454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27ee5adcbab4bbfb76f83f99b6654454");
        } else {
            i(str).a(orderedFood, i, i2, i3, b(str), i4, new a(str, bVar));
        }
    }

    public final void b(String str, OrderedFood orderedFood, int i, int i2, int i3, int i4, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb80c157c4190bb4293819d9828c375", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb80c157c4190bb4293819d9828c375");
        } else {
            i(str).b(orderedFood, i, i2, i3, b(str), i4, new a(str, bVar));
        }
    }

    public final void a(String str, OrderedFood orderedFood) {
        Object[] objArr = {str, orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb2e14f6aca53e8207e75e38ec19a561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb2e14f6aca53e8207e75e38ec19a561");
        } else {
            i(str).a(orderedFood);
        }
    }

    public final void a(String str, GoodsSpu goodsSpu, long j) {
        Object[] objArr = {str, goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deab63cf17f39a59c525a107dd416a7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deab63cf17f39a59c525a107dd416a7e");
        } else {
            i(str).a(goodsSpu, j);
        }
    }

    public final void c(String str, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ad753b875fb52cbacb1dc61325af4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ad753b875fb52cbacb1dc61325af4a");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b i = i(str);
        i.q = i(str).q;
        i.b(b(str), new a(str, bVar));
    }

    public final void a(GoodsSpu goodsSpu, String str, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {goodsSpu, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "784444c91fab4ec2761ed116c5aa6acc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "784444c91fab4ec2761ed116c5aa6acc");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b i = i(str);
        i.q = i(str).q;
        i.a(goodsSpu, b(str), new a(str, bVar));
    }

    public final void b(String str, OrderedFood orderedFood) {
        Object[] objArr = {str, orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93f979371af0d6f7234a9f9ad2de1f33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93f979371af0d6f7234a9f9ad2de1f33");
        } else {
            i(str).b(orderedFood);
        }
    }

    public final ArrayList<OrderedFood> h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60fed569d75278628d2baf19ee42aacd", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60fed569d75278628d2baf19ee42aacd") : i(str).i();
    }

    public final ArrayList<OrderedFood> b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05f029d17dc4369a82697d28efc6d7e1", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05f029d17dc4369a82697d28efc6d7e1") : i(str).b(j);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:22|23|(1:25)(2:51|(1:58)(1:57))|(4:27|(1:29)|30|31)|33|34|35|36|(1:38)|39|(1:41)(1:48)|42|(1:46)|47|30|31) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.sankuai.waimai.globalcart.model.a> b() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.platform.domain.manager.order.e.b():java.util.List");
    }

    public final List<OrderedFood> a(String str, List<OrderedFood> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b3baee5ff3e30b9c1072809c451375", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b3baee5ff3e30b9c1072809c451375");
        }
        return com.sankuai.shangou.stone.util.a.b(list) ? new ArrayList() : i(str).a(list);
    }

    @NonNull
    public final com.sankuai.waimai.store.platform.domain.core.shopcart.b i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1634197e1c5acfc7842ef55528ecc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.platform.domain.core.shopcart.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1634197e1c5acfc7842ef55528ecc6");
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b a2 = this.b.a(str);
        if (a2 == null) {
            synchronized (this.b) {
                a2 = this.b.a(str);
                if (a2 == null) {
                    a2 = new com.sankuai.waimai.store.platform.domain.core.shopcart.b();
                    if (com.sankuai.waimai.store.platform.domain.manager.poi.a.b(str)) {
                        this.b.a(str, a2);
                    }
                }
            }
        }
        try {
            String str2 = ae.b;
            StringBuilder sb = new StringBuilder("ShopRepo.getCartData poiId=");
            sb.append(str);
            sb.append("; mKeyTab=");
            sb.append(this.b.b.b.toString());
            ae.a(str2, sb.toString());
        } catch (Exception unused) {
        }
        return a2;
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c7b414f61659b221075453a4bd63acb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c7b414f61659b221075453a4bd63acb");
            return;
        }
        this.b.b(str, str2);
        try {
            String str3 = ae.b;
            StringBuilder sb = new StringBuilder("ShopRepo.addNewPoiId poiId=");
            sb.append(str);
            sb.append(";newPoiId=");
            sb.append(str2);
            sb.append("; mKeyTab=");
            sb.append(this.b.b.b.toString());
            ae.a(str3, sb.toString());
        } catch (Exception unused) {
        }
    }

    public final boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94ba6574a4372da346dcd1f265f1ed67", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94ba6574a4372da346dcd1f265f1ed67")).booleanValue() : this.b.c(str, str2);
    }

    public final String j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d13927e644994edc4bfc3a7cdd0bfca8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d13927e644994edc4bfc3a7cdd0bfca8") : this.b.b(str);
    }
}
