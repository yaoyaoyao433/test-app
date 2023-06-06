package com.sankuai.waimai.store.order;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.meituan.mmp.main.ICustomEventDispatch;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msi.api.extension.medicine.shopcart.NotifyNativeShopCartChangeResponse;
import com.meituan.msi.api.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.base.SGDialogMachContainer;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.f;
import com.sankuai.waimai.store.platform.domain.manager.order.d;
import com.sankuai.waimai.store.platform.domain.manager.order.e;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.c;
import com.sankuai.waimai.store.shopping.cart.d;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a implements com.sankuai.waimai.store.i.globalcart.a {
    public static ChangeQuickRedirect a;
    private static volatile a f;
    public e b;
    public com.sankuai.waimai.store.platform.domain.manager.order.c c;
    public boolean d;
    public j<NotifyNativeShopCartChangeResponse> e;
    private ArrayList<com.sankuai.waimai.store.observers.a> g;
    private SGDialogMachContainer h;

    public static /* synthetic */ void a(a aVar, Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2, SCPageConfig sCPageConfig, String str, List list, final String str2, final TextView textView, final String str3) {
        Object[] objArr = {activity, aVar2, sCPageConfig, str, list, str2, textView, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3f3e267e6aeef40663a4f0303b57e03a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3f3e267e6aeef40663a4f0303b57e03a");
            return;
        }
        if (textView != null) {
            textView.setEnabled(false);
        }
        final ArrayList arrayList = new ArrayList(list);
        new com.sankuai.waimai.store.shopping.cart.c(activity, aVar2, sCPageConfig, str).a(new c.a() { // from class: com.sankuai.waimai.store.order.a.13
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.shopping.cart.c.a
            public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
                Object[] objArr2 = {jSONObject, jSONObject2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1992a6b0834863f698268c95419077e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1992a6b0834863f698268c95419077e");
                    return;
                }
                d.a().a("order_business_channel", jSONObject);
                try {
                    jSONObject2.put("drug_extra", str3);
                    HashMap hashMap = new HashMap();
                    hashMap.put("buyNow", 1);
                    HashMap hashMap2 = new HashMap();
                    String a2 = i.a(hashMap);
                    if (a2 == null) {
                        a2 = "";
                    }
                    hashMap2.put("client_trans_data", a2);
                    jSONObject2.put("ext_param", i.a(hashMap2));
                } catch (Exception unused) {
                }
            }

            @Override // com.sankuai.waimai.store.shopping.cart.c.a
            public final void a(d.a aVar3) {
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40182e59f499898b088e4481c89a8522", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40182e59f499898b088e4481c89a8522");
                    return;
                }
                if (textView != null) {
                    aVar3.e = textView;
                }
                aVar3.n = arrayList;
                if (t.a(str2)) {
                    return;
                }
                aVar3.l = str2;
            }
        });
    }

    public static /* synthetic */ void a(a aVar, Activity activity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2, SCPageConfig sCPageConfig, String str, List list, final JSONObject jSONObject, final String str2) {
        Object[] objArr = {activity, aVar2, sCPageConfig, str, list, jSONObject, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "13bb25f70547b6cb6b5160db945524a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "13bb25f70547b6cb6b5160db945524a0");
            return;
        }
        final ArrayList arrayList = new ArrayList(list);
        new com.sankuai.waimai.store.shopping.cart.c(activity, aVar2, sCPageConfig, str).a(new c.a() { // from class: com.sankuai.waimai.store.order.a.11
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.shopping.cart.c.a
            public final void a(JSONObject jSONObject2, JSONObject jSONObject3) {
                Object[] objArr2 = {jSONObject2, jSONObject3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7a81931425e2865d34e8c0d47c40e5b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7a81931425e2865d34e8c0d47c40e5b");
                    return;
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            jSONObject3.put(next, jSONObject.opt(next));
                        } catch (Exception unused) {
                        }
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("buyNow", 1);
                HashMap hashMap2 = new HashMap();
                String a2 = i.a(hashMap);
                if (a2 == null) {
                    a2 = "";
                }
                hashMap2.put("client_trans_data", a2);
                try {
                    jSONObject3.put("ext_param", i.a(hashMap2));
                } catch (Exception unused2) {
                }
            }

            @Override // com.sankuai.waimai.store.shopping.cart.c.a
            public final void a(d.a aVar3) {
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08c1bf276137fd952959763cc61f49ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08c1bf276137fd952959763cc61f49ed");
                    return;
                }
                aVar3.n = arrayList;
                if (t.a(str2)) {
                    return;
                }
                aVar3.l = str2;
            }
        });
    }

    public static /* synthetic */ void a(a aVar, GoodsSpu goodsSpu, GoodsSku goodsSku, final String str, final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {goodsSpu, goodsSku, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ff08847aecaedd6e8681f4dd603662da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ff08847aecaedd6e8681f4dd603662da");
        } else if (goodsSpu != null) {
            aVar.a(goodsSpu, str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.17
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1ce28cfe05e0ef66acbe5046e16bf84", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1ce28cfe05e0ef66acbe5046e16bf84");
                    } else {
                        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar);
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cee432af7b30ce67a67cf89bb9d372e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cee432af7b30ce67a67cf89bb9d372e4");
                        return;
                    }
                    a.this.a(str, bVar2);
                    a.this.c(str);
                    a.this.f(str);
                    com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar2, bVar);
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "034eec5c53e34ff731f889e7efbb8b83", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "034eec5c53e34ff731f889e7efbb8b83");
                    } else {
                        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(aVar2, bVar);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void b(a aVar, String str, com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "74bcd285976c334bcd52143251ab11cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "74bcd285976c334bcd52143251ab11cf");
            return;
        }
        aVar.a(str, bVar);
        aVar.c(str);
        aVar.f(str);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a98e731ff0f6d278f0c084deb7cba7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a98e731ff0f6d278f0c084deb7cba7");
            return;
        }
        this.b = new e();
        this.g = new ArrayList<>();
        this.c = new com.sankuai.waimai.store.platform.domain.manager.order.c();
        this.d = false;
    }

    public static a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59d922c5df3a1e95d9cc6bf7f5ea4817", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59d922c5df3a1e95d9cc6bf7f5ea4817");
        }
        if (f == null) {
            synchronized (a.class) {
                if (f == null) {
                    f = new a();
                }
            }
        }
        return f;
    }

    @Deprecated
    public final void a(long j, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {new Long(j), null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f11cdbd2fa0f5d48d4cd7fbed181e1cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f11cdbd2fa0f5d48d4cd7fbed181e1cf");
        } else {
            a(String.valueOf(j), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
        }
    }

    public final void a(final String str, @Nullable final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42f7a4339b6469938a4ac2031f795ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e42f7a4339b6469938a4ac2031f795ac");
        } else if (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b) {
        } else {
            this.b.a(str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e54773bce20d90857efddf1751c09a5b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e54773bce20d90857efddf1751c09a5b");
                    } else {
                        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar);
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "818feae8cebaaa6a19235555cc786671", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "818feae8cebaaa6a19235555cc786671");
                        return;
                    }
                    a.this.c.c(a.this.s(str));
                    a.this.c(str);
                    a.this.f(str);
                    com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar2, bVar);
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fa6d7a76e3d64be2e8e7791851f3f48", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fa6d7a76e3d64be2e8e7791851f3f48");
                    } else {
                        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(aVar, bVar);
                    }
                }
            });
        }
    }

    @Deprecated
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56f905cbc3fbbcd94f89695806cfcf4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56f905cbc3fbbcd94f89695806cfcf4b");
        } else {
            b(String.valueOf(j));
        }
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ede298ac02b6a109d20b5624d4f91a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ede298ac02b6a109d20b5624d4f91a");
            return;
        }
        this.b.a(str);
        this.c.c(s(str));
    }

    public final void a(com.sankuai.waimai.store.observers.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64392282a723667795009349c5fef810", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64392282a723667795009349c5fef810");
        } else if (aVar == null) {
            throw new NullPointerException();
        } else {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            if (this.g.contains(aVar)) {
                return;
            }
            this.g.add(aVar);
        }
    }

    public final void b(com.sankuai.waimai.store.observers.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a57d5663da548ccf823153735f9e8a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a57d5663da548ccf823153735f9e8a7");
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        this.g.remove(aVar);
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a07461e7e692048f25fae4365b4def0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a07461e7e692048f25fae4365b4def0");
            return;
        }
        if (z) {
            t(str);
        }
        if (this.g == null) {
            return;
        }
        Object[] array = this.g.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            Object obj = array[length];
            if (!(obj instanceof com.sankuai.waimai.store.observers.b)) {
                ((com.sankuai.waimai.store.observers.a) obj).ba_();
            }
        }
    }

    private void t(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e16c928052d5ab669872218e3334a79c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e16c928052d5ab669872218e3334a79c");
            return;
        }
        ICustomEventDispatch registerPrivateEvent = MMPEnvHelper.registerPrivateEvent("notifyNativeShopCartChange");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("poi_id", str);
            registerPrivateEvent.onCustomEventDispatch(jSONObject);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        NotifyNativeShopCartChangeResponse notifyNativeShopCartChangeResponse = new NotifyNativeShopCartChangeResponse();
        notifyNativeShopCartChangeResponse.poi_id = str;
        if (this.e != null) {
            this.e.a(notifyNativeShopCartChangeResponse);
        }
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a32c9cbdf05c405c14f938259ba3e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a32c9cbdf05c405c14f938259ba3e94");
        } else {
            a(str, true);
        }
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final List<WmOrderedFood> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db12a1b24cd95333399302325ea52c32", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db12a1b24cd95333399302325ea52c32");
        }
        final com.sankuai.waimai.store.platform.domain.core.shopcart.b k = k(str);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.platform.domain.core.shopcart.a.a;
        if (PatchProxy.isSupport(objArr2, k, changeQuickRedirect2, false, "4c863f3477edf53f9a1b40b9e889c028", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, k, changeQuickRedirect2, false, "4c863f3477edf53f9a1b40b9e889c028");
        }
        final ArrayList arrayList = new ArrayList();
        final SparseArray sparseArray = new SparseArray();
        d.a.a(k, new d.a.InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.core.shopcart.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
            public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                Object[] objArr3 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "00e3f7188afbfafec4177315dd9c0ab2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "00e3f7188afbfafec4177315dd9c0ab2")).booleanValue();
                }
                WmOrderedFood a2 = a.a(a.this, shopCartItem, i);
                if (sparseArray.get(i) != null) {
                    ((List) sparseArray.get(i)).add(a2);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(a2);
                    sparseArray.put(i, arrayList2);
                }
                if (arrayList.contains(a2) && ((WmOrderedFood) arrayList.get(arrayList.indexOf(a2))).getCartId() == i) {
                    ((WmOrderedFood) arrayList.get(arrayList.indexOf(a2))).count += a2.count;
                } else {
                    arrayList.add(a2);
                }
                return true;
            }
        });
        final int i = com.sankuai.shangou.stone.util.a.b(k.b) ? 0 : k.b.get(0).b;
        d.a.b(k, new d.a.InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.core.shopcart.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
            public final boolean a(ShopCartItem shopCartItem, int i2, int i3, int i4, int i5) {
                Object[] objArr3 = {shopCartItem, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09e94e70abb723606af7cf47afbe9031", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09e94e70abb723606af7cf47afbe9031")).booleanValue();
                }
                WmOrderedFood a2 = a.a(a.this, shopCartItem, i2);
                if (sparseArray.get(i) != null) {
                    List list = (List) sparseArray.get(i);
                    if (list != null && list.contains(a2)) {
                        WmOrderedFood wmOrderedFood = (WmOrderedFood) list.get(list.indexOf(a2));
                        wmOrderedFood.count += a2.count;
                        wmOrderedFood.plusCount = a2.count;
                    } else {
                        a2.plusCount = a2.count;
                        arrayList.add(a2);
                    }
                } else {
                    a2.plusCount = a2.count;
                    arrayList.add(a2);
                }
                return true;
            }
        });
        return arrayList;
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final List<OrderedFood> e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b15597c428f498c98e15b05fe9b2c23", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b15597c428f498c98e15b05fe9b2c23") : p(str);
    }

    @Deprecated
    public final void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e3a3c221c0761ec3c773825d716b319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e3a3c221c0761ec3c773825d716b319");
        } else {
            a(j, "", j2, "");
        }
    }

    public final void a(long j, String str, long j2, String str2) {
        Object[] objArr = {new Long(j), str, new Long(j2), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35079b2b371ae69814d6269d43340508", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35079b2b371ae69814d6269d43340508");
            return;
        }
        if (!t.a(str)) {
            c(String.valueOf(j), str);
        }
        c(String.valueOf(j), String.valueOf(j2));
        if (t.a(str2)) {
            return;
        }
        c(String.valueOf(j), str2);
    }

    private void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5400ecff6b7ffdff7e914399f1966444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5400ecff6b7ffdff7e914399f1966444");
        } else if (com.sankuai.waimai.store.platform.domain.manager.poi.a.b(str2)) {
            this.b.a(str, str2);
        }
    }

    public final boolean b(long j, String str, long j2, String str2) {
        Object[] objArr = {new Long(j), str, new Long(j2), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb1df9e4eedc6a115e5c75eec8eb409", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb1df9e4eedc6a115e5c75eec8eb409")).booleanValue() : b(str, str2) || b(String.valueOf(j), String.valueOf(j2));
    }

    public final boolean b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72a1cefa35bf997ed91f8d532ec93b2f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72a1cefa35bf997ed91f8d532ec93b2f")).booleanValue() : this.b.b(str, str2);
    }

    public final void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e299b5a03ca8f520718fa4f7439a3846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e299b5a03ca8f520718fa4f7439a3846");
            return;
        }
        com.sankuai.waimai.store.manager.globalcart.a.a().c();
        this.b.g(str);
    }

    @Deprecated
    public final void a(long j, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {new Long(j), goodsSpu, goodsSku, goodsAttrArr, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bb7eef628fdd180291d11286f603cbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bb7eef628fdd180291d11286f603cbd");
        } else {
            a(String.valueOf(j), goodsSpu, goodsSku, goodsAttrArr, bVar);
        }
    }

    public final void a(String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        f a2;
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea9d71236a8d759d44845e79e564e92a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea9d71236a8d759d44845e79e564e92a");
        } else if (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b) {
        } else {
            if (bVar != null && (a2 = bVar.a(new f(str, goodsSpu, goodsSku, goodsAttrArr, bVar))) != null && a2.a()) {
                a2.b();
            } else {
                a(str, goodsSpu, goodsSku, goodsAttrArr, (goodsSpu == null || goodsSpu.activityType != 6) ? 0 : 1, -1, bVar);
            }
        }
    }

    @Deprecated
    public final void a(long j, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {new Long(j), goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "589599202742d63cd17c2b687c22e70a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "589599202742d63cd17c2b687c22e70a");
        } else {
            a(String.valueOf(j), goodsSpu, goodsSku, goodsAttrArr, i, bVar);
        }
    }

    public final void a(String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dea4298ee31d0e6d3ff6d7da75c399f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dea4298ee31d0e6d3ff6d7da75c399f");
        } else if (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b) {
        } else {
            a(str, goodsSpu, goodsSku, goodsAttrArr, (goodsSpu == null || goodsSpu.activityType != 6) ? 0 : 1, i, bVar);
        }
    }

    private void a(final String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i, int i2, @Nullable final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        GoodsSku goodsSku2;
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), Integer.valueOf(i2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "658a12f5b87e2945f14717151d6399e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "658a12f5b87e2945f14717151d6399e8");
        } else if (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b) {
        } else {
            DrugOrderMonitor.a(str);
            if (goodsSpu == null || com.sankuai.shangou.stone.util.a.b(goodsSpu.getSkuList())) {
                com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(new com.sankuai.waimai.store.exceptions.a(2, ""), bVar);
                DrugOrderMonitor.a(str, -999, "skuList null");
                return;
            }
            if (goodsSku == null) {
                GoodsSku goodsSku3 = goodsSpu.getSkuList().get(0);
                if (goodsSku3 == null) {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(new com.sankuai.waimai.store.exceptions.a(2, ""), bVar);
                    DrugOrderMonitor.a(str, -999, "sku null");
                    return;
                }
                goodsSku2 = goodsSku3;
            } else {
                goodsSku2 = goodsSku;
            }
            this.d = true;
            int a2 = com.sankuai.waimai.store.platform.domain.manager.order.a.a(goodsSku2, this.b.a(str, goodsSpu.getId(), goodsSku2.getSkuId(), goodsAttrArr), i2);
            com.meituan.android.bus.a.a().c(new c(goodsSpu, goodsSku, 1));
            this.b.a(str, goodsSpu, goodsSku2, goodsAttrArr, i, a2, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.12
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "564058f9900732dcf9e44f55a9ba20b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "564058f9900732dcf9e44f55a9ba20b5");
                    } else if (bVar != null) {
                        bVar.a(eVar);
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d180315ab95567eab32a86882b2ff9cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d180315ab95567eab32a86882b2ff9cf");
                    } else {
                        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar);
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "392b636f9990a5703a3b6ae7ccf8dec5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "392b636f9990a5703a3b6ae7ccf8dec5");
                        return;
                    }
                    a.this.a(str, bVar2);
                    a.this.c(str);
                    a.this.f(str);
                    com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar2, bVar);
                    DrugOrderMonitor.a(str, 0);
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c41169cd1d8352306cb64ce6e3bd6e4d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c41169cd1d8352306cb64ce6e3bd6e4d");
                        return;
                    }
                    com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(aVar, bVar);
                    if (aVar != null) {
                        if (aVar.d) {
                            DrugOrderMonitor.a(str, -999);
                        } else if (aVar.c != null) {
                            DrugOrderMonitor.a(str, aVar.c.b, aVar.c.getMessage());
                        }
                    }
                }
            });
        }
    }

    public final void a(String str, OrderedFood orderedFood, int i, int i2, int i3, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38578a4d58fd444a865370e724495fc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38578a4d58fd444a865370e724495fc5");
        } else {
            a(str, orderedFood, i, i2, i3, -1, bVar);
        }
    }

    public final void a(final String str, OrderedFood orderedFood, int i, int i2, int i3, int i4, @Nullable final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e699618b1e0881034d1d3c3141f8972c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e699618b1e0881034d1d3c3141f8972c");
        } else if (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b) {
        } else {
            DrugOrderMonitor.a(str);
            if (orderedFood == null) {
                com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(new com.sankuai.waimai.store.exceptions.a(2, ""), bVar);
                DrugOrderMonitor.a(str, -999, "paramFood is null");
            } else if (orderedFood.spu == null || orderedFood.sku == null) {
                com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(new com.sankuai.waimai.store.exceptions.a(2, ""), bVar);
                DrugOrderMonitor.a(str, -999, "sku is null");
            } else {
                this.d = true;
                com.meituan.android.bus.a.a().c(new c(orderedFood.spu, orderedFood.sku, 1));
                this.b.a(str, orderedFood, i, i2, i3, i4, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.14
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a57ff019728f870c19726c2eb79673a1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a57ff019728f870c19726c2eb79673a1");
                        } else {
                            com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar);
                        }
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                        Object[] objArr2 = {bVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06d44cd71e5af750d5aa2c8eb566b223", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06d44cd71e5af750d5aa2c8eb566b223");
                            return;
                        }
                        a.this.a(str, bVar2);
                        a.this.c(str);
                        a.this.f(str);
                        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar2, bVar);
                        DrugOrderMonitor.a(str, 0);
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2b07084670a6c413852159e95ba4a99", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2b07084670a6c413852159e95ba4a99");
                            return;
                        }
                        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(aVar, bVar);
                        if (aVar != null) {
                            if (aVar.d) {
                                DrugOrderMonitor.a(str, -999);
                            } else if (aVar.c != null) {
                                DrugOrderMonitor.a(str, aVar.c.b, aVar.c.getMessage());
                            }
                        }
                    }
                });
            }
        }
    }

    @Deprecated
    public final void b(long j, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {new Long(j), goodsSpu, goodsSku, null, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5cbfc434aa93fe0b49ed3185b8198ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5cbfc434aa93fe0b49ed3185b8198ce");
        } else {
            b(String.valueOf(j), goodsSpu, goodsSku, (GoodsAttr[]) null, bVar);
        }
    }

    public final void b(String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6271c9e7f5dcf57a182074794c28ef8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6271c9e7f5dcf57a182074794c28ef8e");
        } else if (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b) {
        } else {
            if (com.sankuai.waimai.store.config.j.h().a(SCConfigPath.FOOD_EXCHANGE_SKU, true) && goodsSpu != null) {
                try {
                    if (!TextUtils.equals(goodsSpu.activityTag, GoodsSpu.ITEM_COLLECTION_REDEEM)) {
                        GoodsSku goodsSku2 = goodsSku == null ? (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0) : goodsSku;
                        if (goodsSku2 != null && a(str, goodsSpu.id, goodsSku2.id) == 1 && d(str, goodsSpu, goodsSku, goodsAttrArr, bVar)) {
                            return;
                        }
                        c(str, goodsSpu, goodsSku, goodsAttrArr, bVar);
                        return;
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                    return;
                }
            }
            c(str, goodsSpu, goodsSku, goodsAttrArr, bVar);
        }
    }

    private void c(final String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, @Nullable final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1756c1036cbfddbc89802b7cf510dbc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1756c1036cbfddbc89802b7cf510dbc5");
            return;
        }
        try {
            if (a(str, goodsSpu, goodsSku, goodsAttrArr, 0) <= 0) {
                a(str, goodsSpu, goodsSku, goodsAttrArr, 1);
            }
        } catch (com.sankuai.waimai.store.exceptions.a e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(new com.sankuai.waimai.store.exceptions.a(2, ""), bVar);
        }
        DrugOrderMonitor.b(str);
        com.meituan.android.bus.a.a().c(new c(goodsSpu, goodsSku, -1));
        a(goodsSpu, str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.15
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55a750fba532de4ffe5dda1cc58325dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55a750fba532de4ffe5dda1cc58325dc");
                } else {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar);
                }
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb6cca2a2c682565c8346703494c3fec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb6cca2a2c682565c8346703494c3fec");
                    return;
                }
                a.this.a(str, bVar2);
                a.this.c(str);
                a.this.f(str);
                com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar2, bVar);
                DrugOrderMonitor.c(str);
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8115ab495e1d0a8b3c4149f2b23e11e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8115ab495e1d0a8b3c4149f2b23e11e7");
                    return;
                }
                com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(aVar, bVar);
                if (aVar != null) {
                    if (aVar.d) {
                        DrugOrderMonitor.c(str);
                    } else if (aVar.c != null) {
                        DrugOrderMonitor.b(str, aVar.c.b, aVar.c.getMessage());
                    }
                }
            }
        });
    }

    public final int a(String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i) throws com.sankuai.waimai.store.exceptions.a {
        GoodsSku goodsSku2;
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c50e1c7c4c18216e6dbf18eba01b06a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c50e1c7c4c18216e6dbf18eba01b06a5")).intValue();
        }
        if (goodsSpu == null || com.sankuai.shangou.stone.util.a.b(goodsSpu.getSkuList())) {
            return 0;
        }
        if (goodsSku == null) {
            GoodsSku goodsSku3 = goodsSpu.getSkuList().get(0);
            if (goodsSku3 == null) {
                return 0;
            }
            goodsSku2 = goodsSku3;
        } else {
            goodsSku2 = goodsSku;
        }
        OrderedFood a2 = this.b.a(str, goodsSpu, goodsSku2, goodsAttrArr, i);
        if (a2 != null) {
            int count = a2.getCount();
            q(str);
            return count;
        }
        return 0;
    }

    public final void b(String str, OrderedFood orderedFood, int i, int i2, int i3, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b0dccaa80cd0d30c11f18c207b6782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b0dccaa80cd0d30c11f18c207b6782");
        } else {
            b(str, orderedFood, i, i2, i3, 1, bVar);
        }
    }

    public final void b(String str, OrderedFood orderedFood, int i, int i2, int i3, int i4, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b0ea8adfb17fa4e9f511fffdc7626f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b0ea8adfb17fa4e9f511fffdc7626f");
        } else if (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b) {
        } else {
            if (orderedFood == null || orderedFood.spu == null || orderedFood.sku == null) {
                com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(new com.sankuai.waimai.store.exceptions.a(2, ""), bVar);
                DrugOrderMonitor.b(str, -999, "spu is null");
                return;
            }
            if (com.sankuai.waimai.store.config.j.h().a(SCConfigPath.FOOD_EXCHANGE_SKU, true)) {
                try {
                    if (orderedFood.spu != null && !TextUtils.equals(orderedFood.spu.activityTag, GoodsSpu.ITEM_COLLECTION_REDEEM)) {
                        GoodsSku goodsSku = orderedFood.sku;
                        if (orderedFood.sku == null) {
                            goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) orderedFood.spu.getSkuList(), 0);
                        }
                        if (goodsSku != null && a(str, orderedFood.spu.id, goodsSku.id) == 1 && d(str, orderedFood.spu, orderedFood.sku, orderedFood.getAttrIds(), bVar)) {
                            return;
                        }
                        c(str, orderedFood, i, i2, i3, i4, bVar);
                        return;
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                    return;
                }
            }
            c(str, orderedFood, i, i2, i3, i4, bVar);
        }
    }

    private void c(final String str, OrderedFood orderedFood, int i, int i2, int i3, int i4, @Nullable final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db2663fe80590e3029f74967b742b7cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db2663fe80590e3029f74967b742b7cf");
            return;
        }
        com.meituan.android.bus.a.a().c(new c(orderedFood.spu, orderedFood.sku, -1));
        DrugOrderMonitor.b(str);
        this.b.b(str, orderedFood, i, i2, i3, i4, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.16
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "190e73f14ca0d5a554841ffc503c1fae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "190e73f14ca0d5a554841ffc503c1fae");
                } else {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar);
                }
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa982ef734fc52738e374ee9f85c5986", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa982ef734fc52738e374ee9f85c5986");
                    return;
                }
                a.this.a(str, bVar2);
                a.this.c(str);
                a.this.f(str);
                com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar2, bVar);
                DrugOrderMonitor.c(str);
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "010c4a30e1cbf41046fa9e89c2846712", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "010c4a30e1cbf41046fa9e89c2846712");
                    return;
                }
                com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(aVar, bVar);
                if (aVar != null) {
                    if (aVar.d) {
                        DrugOrderMonitor.c(str);
                    } else if (aVar.c != null) {
                        DrugOrderMonitor.b(str, aVar.c.b, aVar.c.getMessage());
                    }
                }
            }
        });
    }

    private boolean d(final String str, final GoodsSpu goodsSpu, final GoodsSku goodsSku, final GoodsAttr[] goodsAttrArr, @Nullable final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar;
        String str2;
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "651c68787e58b9264c18036ee944f7fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "651c68787e58b9264c18036ee944f7fd")).booleanValue();
        }
        if (k(str) == null || goodsSpu == null) {
            return false;
        }
        List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list = k(str).b;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = d.a.a;
        if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5c63aafd3cbc3f1fe7b5f6e1681a865b", RobustBitConfig.DEFAULT_VALUE)) {
            Iterator<com.sankuai.waimai.store.platform.domain.core.shopcart.c> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                com.sankuai.waimai.store.platform.domain.core.shopcart.c next = it.next();
                if (next != null && next.g == 146) {
                    cVar = next;
                    break;
                }
            }
        } else {
            cVar = (com.sankuai.waimai.store.platform.domain.core.shopcart.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5c63aafd3cbc3f1fe7b5f6e1681a865b");
        }
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (cVar == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) cVar.j)) {
            return false;
        }
        for (ShopCartItem shopCartItem : cVar.j) {
            if (shopCartItem != null && shopCartItem.food != null && com.sankuai.shangou.stone.util.a.a((List) shopCartItem.food.getItemCollectionRelations()) == 1) {
                OrderedFood orderedFood = shopCartItem.food;
                Long l = (Long) com.sankuai.shangou.stone.util.a.a((List<Object>) orderedFood.getItemCollectionRelations(), 0);
                if (l != null && goodsSku.id == l.longValue()) {
                    arrayList.add(orderedFood.spu);
                    arrayList2.add(orderedFood);
                }
            }
        }
        if (com.sankuai.shangou.stone.util.a.b(arrayList) || com.sankuai.shangou.stone.util.a.b(arrayList2)) {
            return false;
        }
        Activity c = com.sankuai.waimai.store.manager.appinfo.a.c();
        if (com.sankuai.waimai.store.util.b.a(c)) {
            return false;
        }
        try {
            JSONArray jSONArray = new JSONArray(i.a(arrayList));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sku_exchange_delete_list", jSONArray);
            str2 = jSONObject.toString();
        } catch (JSONException e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            str2 = null;
        }
        if (t.a(str2)) {
            return false;
        }
        this.h = new SGDialogMachContainer(c, null, null);
        this.h.a(MarketingModel.DIALOG_SHOW_TYPE_FADE);
        this.h.b = new com.sankuai.waimai.store.mach.event.b() { // from class: com.sankuai.waimai.store.order.a.18
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.event.b
            public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str3, Map<String, Object> map) {
                Object[] objArr3 = {aVar, str3, map};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31e712cbc761b0af0c445b8b8bfe383d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31e712cbc761b0af0c445b8b8bfe383d");
                } else if ("food_exchange_sku_delete_callback".equals(str3)) {
                    Object obj = map.get("button_type");
                    if (obj != null && NumberUtils.parseInt(obj.toString(), -1) == 1) {
                        try {
                            a.this.a(str, goodsSpu, goodsSku, goodsAttrArr, 0);
                            for (OrderedFood orderedFood2 : arrayList2) {
                                if (orderedFood2 != null) {
                                    a.this.a(str, orderedFood2.spu, orderedFood2.sku, goodsAttrArr, 0);
                                }
                            }
                            com.meituan.android.bus.a.a().c(new c(goodsSpu, goodsSku, -1));
                            a.a(a.this, goodsSpu, goodsSku, str, bVar);
                        } catch (Exception e2) {
                            com.sankuai.waimai.store.base.log.a.a(e2);
                        }
                    }
                    a.this.h.dismiss();
                }
            }
        };
        if (this.h.a("supermarket-poi-sku-exchange-delete-dialog", str2)) {
            this.h.show();
            return true;
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void a(String str, CartProduct cartProduct) {
        Object[] objArr = {str, cartProduct};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d258e3d0f2115a903abebf6b9704c1a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d258e3d0f2115a903abebf6b9704c1a9");
        } else if (cartProduct == null) {
        } else {
            this.b.a(str, new OrderedFood().fromGlobalCart(cartProduct));
            q(str);
            f(str);
        }
    }

    public final void g(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8787f283cb6f9bda49dce253676cf347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8787f283cb6f9bda49dce253676cf347");
            return;
        }
        k(str).d.clear();
        d(str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.19
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "250da2597e1623fc83d5827ee80ed9fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "250da2597e1623fc83d5827ee80ed9fa");
                }
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70e748381599b1d93192bedfe0113ab3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70e748381599b1d93192bedfe0113ab3");
                    return;
                }
                a.this.c(str);
                a.this.f(str);
            }
        });
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void a(final GlobalCart globalCart) {
        Object[] objArr = {globalCart};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c25305672b71f49ec67404dc98c6fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c25305672b71f49ec67404dc98c6fdf");
            return;
        }
        e eVar = this.b;
        Object[] objArr2 = {globalCart};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "f7040d2d2bc0f37c64e1d3cab6d07bde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "f7040d2d2bc0f37c64e1d3cab6d07bde");
            return;
        }
        long j = globalCart.poiId;
        Object[] objArr3 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        final com.sankuai.waimai.store.platform.domain.core.shopcart.b i = PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "dff0b0d68efcf4411e1a8c42c11e9e22", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.core.shopcart.b) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "dff0b0d68efcf4411e1a8c42c11e9e22") : eVar.i(String.valueOf(j));
        Object[] objArr4 = {globalCart};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.platform.domain.core.shopcart.b.f;
        if (PatchProxy.isSupport(objArr4, i, changeQuickRedirect4, false, "bd07b001561cab1486698d967da424d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, i, changeQuickRedirect4, false, "bd07b001561cab1486698d967da424d3");
        } else {
            d.a.c(i, new d.a.InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.core.shopcart.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                public final boolean a(ShopCartItem shopCartItem, int i2, int i3, int i4, int i5) {
                    Object[] objArr5 = {shopCartItem, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "856a3ce896038cefed4f520052fdbde9", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "856a3ce896038cefed4f520052fdbde9")).booleanValue();
                    }
                    if (shopCartItem != null && shopCartItem.food != null) {
                        OrderedFood orderedFood = shopCartItem.food;
                        for (GlobalCart.g gVar : globalCart.productList) {
                            if (gVar.c == orderedFood.getSpuId() && gVar.d == orderedFood.getSkuId()) {
                                orderedFood.setCheckStatus(gVar.a());
                            }
                        }
                    }
                    return true;
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void d() {
        com.sankuai.waimai.store.platform.domain.core.shopcart.b value;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae137c694ca01f404494322ba8c184dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae137c694ca01f404494322ba8c184dd");
            return;
        }
        e eVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "1bbef66e646af204c1bad7605284f2c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "1bbef66e646af204c1bad7605284f2c5");
        } else if (eVar.b != null) {
            for (Map.Entry<String, com.sankuai.waimai.store.platform.domain.core.shopcart.b> entry : eVar.b.a()) {
                if (entry != null && (value = entry.getValue()) != null) {
                    value.s = false;
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void b(final String str, CartProduct cartProduct) {
        Object[] objArr = {str, cartProduct};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "207d75781b1f89b345ea91e6d42e5bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "207d75781b1f89b345ea91e6d42e5bd7");
        } else if (cartProduct == null) {
        } else {
            this.b.a(str, new OrderedFood().fromGlobalCart(cartProduct));
            q(str);
            d(str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94b0f52aa2e8b3632f781ec3555899d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94b0f52aa2e8b3632f781ec3555899d6");
                    } else {
                        a.b(a.this, str, bVar);
                    }
                }
            });
        }
    }

    private void d(String str, com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d66de7cf48ea5ef3417cb1c47f7147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d66de7cf48ea5ef3417cb1c47f7147");
        } else {
            this.b.c(str, bVar);
        }
    }

    private void a(GoodsSpu goodsSpu, String str, com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {goodsSpu, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2dfb3e34c17ab55c66747c59bbe1b7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2dfb3e34c17ab55c66747c59bbe1b7d");
        } else {
            this.b.a(goodsSpu, str, bVar);
        }
    }

    @Deprecated
    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da6a15906a2bac12c691916f8b479038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da6a15906a2bac12c691916f8b479038");
        } else {
            h(String.valueOf(j));
        }
    }

    public final void h(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3afccb8709c8a84d9ed647a886c8dfda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3afccb8709c8a84d9ed647a886c8dfda");
        } else {
            d(str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ba0b185b5bd7660661c3e4f82e6f0b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ba0b185b5bd7660661c3e4f82e6f0b1");
                    } else {
                        a.b(a.this, str, bVar);
                    }
                }
            });
        }
    }

    public final void b(final String str, final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "857960458f0e0fab49611bafdb36c383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "857960458f0e0fab49611bafdb36c383");
        } else {
            d(str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8601cb35897ea0d75be3a9b6150b9048", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8601cb35897ea0d75be3a9b6150b9048");
                        return;
                    }
                    a.b(a.this, str, bVar2);
                    bVar.a(bVar2);
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c64f129c01df7a9624c72ad2bbb529ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c64f129c01df7a9624c72ad2bbb529ca");
                        return;
                    }
                    super.a(aVar);
                    bVar.a(aVar);
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a06007cd18e7640f9db062c9b1773c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a06007cd18e7640f9db062c9b1773c2");
                        return;
                    }
                    super.a();
                    bVar.a();
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final String b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3907467648f9fd5e63b512f6b6db8497", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3907467648f9fd5e63b512f6b6db8497") : bVar.b();
                }
            });
        }
    }

    @Deprecated
    public final void b(long j, com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {new Long(j), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd4b9d9b6f59c7a35a0ffec083655a50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd4b9d9b6f59c7a35a0ffec083655a50");
        } else {
            c(String.valueOf(j), bVar);
        }
    }

    public final void c(final String str, final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae622b183f80aec5c692b7c0081820f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae622b183f80aec5c692b7c0081820f3");
            return;
        }
        a(str, 1);
        d(str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9eb7bbd9efc497ee3a519af9f314031e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9eb7bbd9efc497ee3a519af9f314031e");
                } else {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar);
                }
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afe866f0e60af282daf1a130fe09ccd3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afe866f0e60af282daf1a130fe09ccd3");
                    return;
                }
                a.e().q(str);
                a.this.c(str);
                com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(bVar2, bVar);
            }

            @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4ab16bee50bf4fb15e755d3e0ad986f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4ab16bee50bf4fb15e755d3e0ad986f");
                }
                if (bVar != null) {
                    return bVar.b();
                }
                return super.b();
            }
        });
    }

    @Deprecated
    public final boolean c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3f215cfb4952137e503d8064bd3bd55", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3f215cfb4952137e503d8064bd3bd55")).booleanValue() : i(String.valueOf(j));
    }

    public final boolean i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d9e66cc6e8c489fbed1a06942084960", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d9e66cc6e8c489fbed1a06942084960")).booleanValue() : this.b.c(str) > 0;
    }

    public final int j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba0880b836ed3783d196bb711442552", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba0880b836ed3783d196bb711442552")).intValue() : this.b.d(str);
    }

    @Deprecated
    public final com.sankuai.waimai.store.platform.domain.core.shopcart.b d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8612de4c00736500d2d72f60100b3a6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.core.shopcart.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8612de4c00736500d2d72f60100b3a6") : k(String.valueOf(j));
    }

    public final com.sankuai.waimai.store.platform.domain.core.shopcart.b k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb438ec4406b8dd45f0dc7f5769549f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.platform.domain.core.shopcart.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb438ec4406b8dd45f0dc7f5769549f");
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.b i = this.b.i(str);
        return i == null ? new com.sankuai.waimai.store.platform.domain.core.shopcart.b() : i;
    }

    public final void a(String str, @NonNull Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c10dce734be63dd9c71fdd639960559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c10dce734be63dd9c71fdd639960559");
            return;
        }
        com.sankuai.waimai.store.shopping.cart.cache.a aVar = k(str).e;
        Object[] objArr2 = {map};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.shopping.cart.cache.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e6a9a5d139998159e068c75d00b54712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e6a9a5d139998159e068c75d00b54712");
        } else if (map != null) {
            aVar.b.putAll(map);
        }
    }

    @Deprecated
    public final void a(long j, Poi poi) {
        Object[] objArr = {new Long(j), poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d205f191783d438a85017de74d5a7edf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d205f191783d438a85017de74d5a7edf");
        } else {
            a(String.valueOf(j), poi);
        }
    }

    public final void a(String str, Poi poi) {
        Object[] objArr = {str, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "477f87a48b9aea7a08a5c221d975f121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "477f87a48b9aea7a08a5c221d975f121");
        } else {
            this.b.a(str, new com.sankuai.waimai.store.platform.domain.manager.poi.a(poi));
        }
    }

    @Deprecated
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a e(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c0eb08c5ad32a41c112b65bd88cce3c", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c0eb08c5ad32a41c112b65bd88cce3c") : l(String.valueOf(j));
    }

    public final com.sankuai.waimai.store.platform.domain.manager.poi.a l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02df971cdf0f6a6aaa8fb7fe7e5abdf", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02df971cdf0f6a6aaa8fb7fe7e5abdf") : this.b.b(str);
    }

    public final void d(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b8d9166d6b211be86d190a7d2bc11df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b8d9166d6b211be86d190a7d2bc11df");
        } else if (i(str) && !com.sankuai.shangou.stone.util.a.b(list)) {
            for (com.sankuai.waimai.platform.domain.core.order.a aVar : list) {
                if (aVar != null) {
                    OrderedFood fromGlobalCart = new OrderedFood().fromGlobalCart(aVar);
                    if (fromGlobalCart.getStock() == 0) {
                        fromGlobalCart.setStatus(1);
                        this.b.a(str, fromGlobalCart.spu, fromGlobalCart.getSkuId());
                    } else {
                        this.b.b(str, fromGlobalCart);
                    }
                }
            }
            u(str);
        }
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void c(final String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad01a5d3237db700e3a6ad28d9debe4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad01a5d3237db700e3a6ad28d9debe4e");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            for (com.sankuai.waimai.platform.domain.core.order.a aVar : list) {
                OrderedFood fromGlobalCart = new OrderedFood().fromGlobalCart(aVar);
                if (fromGlobalCart.getStock() == 0) {
                    e eVar = this.b;
                    Object[] objArr2 = {str, fromGlobalCart};
                    ChangeQuickRedirect changeQuickRedirect2 = e.a;
                    if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "8aa7dc858c7941a03d0462dfb5e5f304", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "8aa7dc858c7941a03d0462dfb5e5f304");
                    } else {
                        com.sankuai.waimai.store.platform.domain.core.shopcart.b i = eVar.i(str);
                        Object[] objArr3 = {fromGlobalCart};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.platform.domain.core.shopcart.b.f;
                        if (PatchProxy.isSupport(objArr3, i, changeQuickRedirect3, false, "6ab794bc53a2fea9f78894b4f81e2920", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, i, changeQuickRedirect3, false, "6ab794bc53a2fea9f78894b4f81e2920");
                        } else {
                            i.l.a(fromGlobalCart);
                        }
                    }
                } else {
                    this.b.b(str, fromGlobalCart);
                }
            }
            d(str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr4 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3ee7fbbc3216b44af0d37d8ccb51484a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3ee7fbbc3216b44af0d37d8ccb51484a");
                    } else {
                        a.b(a.this, str, bVar);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void b(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7b9c1c5c05b517054137d08fb8e37f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7b9c1c5c05b517054137d08fb8e37f8");
        } else if (!com.sankuai.shangou.stone.util.a.b(list) && i(str)) {
            for (com.sankuai.waimai.platform.domain.core.order.a aVar : list) {
                final OrderedFood fromGlobalCart = new OrderedFood().fromGlobalCart(aVar);
                e eVar = this.b;
                Object[] objArr2 = {str, fromGlobalCart};
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "87967ccc80349b5daefc77425f6acc08", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "87967ccc80349b5daefc77425f6acc08");
                } else {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.b i = eVar.i(str);
                    Object[] objArr3 = {fromGlobalCart};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.platform.domain.core.shopcart.b.f;
                    if (PatchProxy.isSupport(objArr3, i, changeQuickRedirect3, false, "a902da1f85332f479354da62574c2c4d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, i, changeQuickRedirect3, false, "a902da1f85332f479354da62574c2c4d");
                    } else {
                        final com.sankuai.waimai.store.platform.domain.manager.order.d dVar = i.l;
                        Object[] objArr4 = {fromGlobalCart};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.platform.domain.manager.order.d.a;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "c8cdc8aaaeb5083bfe96402d6e88f663", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "c8cdc8aaaeb5083bfe96402d6e88f663");
                        } else {
                            d.a.InterfaceC1265a interfaceC1265a = new d.a.InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.d.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                                public final boolean a(ShopCartItem shopCartItem, int i2, int i3, int i4, int i5) {
                                    Object[] objArr5 = {shopCartItem, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6357140d3eaf19cc48905ac298a83f25", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6357140d3eaf19cc48905ac298a83f25")).booleanValue();
                                    }
                                    if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.sku != null && shopCartItem.food.getSpuId() == fromGlobalCart.getSpuId() && shopCartItem.food.getSkuId() == fromGlobalCart.getSkuId() && shopCartItem.food.sku.getActivityStock() > fromGlobalCart.getStock()) {
                                        shopCartItem.food.sku.setActivityStock(fromGlobalCart.getStock());
                                    }
                                    return true;
                                }
                            };
                            Object[] objArr5 = {interfaceC1265a};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.platform.domain.manager.order.d.a;
                            if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "dd1420a2e5ac1436c2d9b78ba761c055", RobustBitConfig.DEFAULT_VALUE)) {
                                ((Integer) PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "dd1420a2e5ac1436c2d9b78ba761c055")).intValue();
                            } else {
                                com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar = dVar.b;
                                if (bVar != null) {
                                    d.a.c(bVar, interfaceC1265a);
                                }
                            }
                        }
                    }
                }
                q(str);
            }
            u(str);
        }
    }

    private void u(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6340d88c10405cd03aced05f054ff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6340d88c10405cd03aced05f054ff8");
        } else {
            this.b.b(str, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.order.a.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98c23d7e926e1013ef7e92dcbc8472cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98c23d7e926e1013ef7e92dcbc8472cc");
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7e5353039847140c3781d38980a5c5b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7e5353039847140c3781d38980a5c5b");
                        return;
                    }
                    a.this.q(str);
                    a.this.c(str);
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df6778c503256966f04920b26a3197c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df6778c503256966f04920b26a3197c2");
            return;
        }
        e eVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "2455231bfde0d3b86ab1cda8cb4896ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "2455231bfde0d3b86ab1cda8cb4896ad");
        } else {
            eVar.b.b();
            ae.a(ae.b, "ShopRepo.exit mCartDataKeyTabMap.clear");
        }
        com.sankuai.waimai.store.platform.domain.manager.order.c cVar = this.c;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.platform.domain.manager.order.c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "07a515d3a752a8add8b8abada39939be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "07a515d3a752a8add8b8abada39939be");
            return;
        }
        cVar.b.clear();
        cVar.c.clear();
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c3fe9d0963daa6b5f554b60b591f5a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c3fe9d0963daa6b5f554b60b591f5a")).intValue() : com.sankuai.waimai.store.manager.globalcart.a.a().b();
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final List<com.sankuai.waimai.globalcart.model.a> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43150153b5158960f16ca7524263b486", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43150153b5158960f16ca7524263b486") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void a(String str, List<GlobalCart.g> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180ce7c441922f45e767dfd2ed4488cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180ce7c441922f45e767dfd2ed4488cf");
            return;
        }
        ArrayList<OrderedFood> arrayList = new ArrayList();
        for (GlobalCart.g gVar : list) {
            if (gVar != null) {
                OrderedFood fromGlobalCart = new OrderedFood().fromGlobalCart(gVar);
                if (TextUtils.isEmpty(fromGlobalCart.getName()) || fromGlobalCart.getCount() >= 0) {
                    arrayList.add(fromGlobalCart);
                }
            }
        }
        b(str);
        ArrayList arrayList2 = new ArrayList();
        for (OrderedFood orderedFood : arrayList) {
            arrayList2.addAll(orderedFood.getOrderedList());
        }
        this.b.a(str, arrayList2);
        String str2 = ae.b;
        ae.a(str2, "SCOrderManager.setCartDataList poiId=" + str + "; foodsCount=" + arrayList2.size());
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c258544eab2e37c910698862059a2cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c258544eab2e37c910698862059a2cc");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            f(str);
            this.b.a(str, (List) i.a(str2, new TypeToken<List<OrderedFood>>() { // from class: com.sankuai.waimai.store.order.a.8
            }.getType()));
            c(str, (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
        }
    }

    @Deprecated
    public final void a(long j, List<OrderedFood> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2707d5e2b74143f04f295f9d0937b49b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2707d5e2b74143f04f295f9d0937b49b");
        } else {
            e(String.valueOf(j), list);
        }
    }

    public final void e(String str, List<OrderedFood> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042d74c525df117198315a80cb7d0199", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042d74c525df117198315a80cb7d0199");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            ArrayList arrayList = new ArrayList();
            for (OrderedFood orderedFood : list) {
                if (orderedFood != null) {
                    arrayList.addAll(orderedFood.getOrderedList());
                    orderedFood.setCheckStatus(1);
                }
            }
            f(str);
            this.b.a(str, arrayList);
        }
    }

    public final void f(String str, List<OrderedFood> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbc9150d83b6778e7ad5323eda8d6d35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbc9150d83b6778e7ad5323eda8d6d35");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            ArrayList arrayList = new ArrayList();
            for (OrderedFood orderedFood : list) {
                if (orderedFood != null) {
                    arrayList.addAll(orderedFood.getOrderedList());
                    orderedFood.setCheckStatus(1);
                }
            }
            f(str);
            e eVar = this.b;
            Object[] objArr2 = {str, arrayList};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "9403a030b4493722be3e54bd4b756871", RobustBitConfig.DEFAULT_VALUE)) {
                List list2 = (List) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "9403a030b4493722be3e54bd4b756871");
                return;
            }
            new ArrayList();
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                return;
            }
            eVar.i(str).b(arrayList);
        }
    }

    @Deprecated
    public final int f(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2763d3981fca91eeefbefed20cc7af5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2763d3981fca91eeefbefed20cc7af5")).intValue() : a(String.valueOf(j));
    }

    @Override // com.sankuai.waimai.store.i.globalcart.a
    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b5e47eeed103ccea570a6d8e05df532", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b5e47eeed103ccea570a6d8e05df532")).intValue() : this.b.c(str);
    }

    public final int a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa022b1dd6a928273a208008c6a1135", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa022b1dd6a928273a208008c6a1135")).intValue() : this.b.a(str, j);
    }

    public final int a(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa5494f9356a9e966d1197371f49701", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa5494f9356a9e966d1197371f49701")).intValue() : this.b.a(str, j, j2);
    }

    public final int a(String str, long j, long j2, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {str, new Long(j), new Long(j2), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4472b9ec3c939c89f1cf768726dbc1cd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4472b9ec3c939c89f1cf768726dbc1cd")).intValue() : this.b.a(str, j, j2, goodsAttrArr);
    }

    public final int a(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a52cccdfdfbd163b7487875678b750e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a52cccdfdfbd163b7487875678b750e")).intValue() : this.b.a(str, j, str2);
    }

    @Nullable
    public final HandPriceInfo b(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e98b30177c1c131d1363df26050ce67", RobustBitConfig.DEFAULT_VALUE) ? (HandPriceInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e98b30177c1c131d1363df26050ce67") : this.b.b(str, j, j2);
    }

    @Deprecated
    public final String a(long j, long j2, long j3) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba726b396f2d1eff3613a438baf76966", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba726b396f2d1eff3613a438baf76966");
        }
        String valueOf = String.valueOf(j);
        Object[] objArr2 = {valueOf, new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14dcb7dc5611dde2b98db7cfedc554c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14dcb7dc5611dde2b98db7cfedc554c6");
        }
        e eVar = this.b;
        Object[] objArr3 = {valueOf, new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        return PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "59789a52e205c8d378e1439c5e95504f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "59789a52e205c8d378e1439c5e95504f") : eVar.i(valueOf).c(j2, j3);
    }

    public final double m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc4c6f528b62a8e99a3a86fe2d78cbf", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc4c6f528b62a8e99a3a86fe2d78cbf")).doubleValue() : this.b.e(str);
    }

    public final double n(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b7d4f1671036ef22dc69dbc905924a0", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b7d4f1671036ef22dc69dbc905924a0")).doubleValue() : this.b.i(str).d().orderActualPurchaseThresholdPrice;
    }

    public final double o(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a4fccefbfeed5e4aab6d3f5daeff7d6", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a4fccefbfeed5e4aab6d3f5daeff7d6")).doubleValue() : this.b.f(str);
    }

    @Deprecated
    public final List<OrderedFood> g(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "634649fb6fd758ccf420d9a7838a9b7b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "634649fb6fd758ccf420d9a7838a9b7b") : p(String.valueOf(j));
    }

    public final List<OrderedFood> p(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80002079469c61593b2d162ec80e9d90", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80002079469c61593b2d162ec80e9d90") : this.b.h(str);
    }

    @Deprecated
    public final List<OrderedFood> b(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "261170a0d6d1376dd448abe35cff9c9f", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "261170a0d6d1376dd448abe35cff9c9f") : b(String.valueOf(j), j2);
    }

    public final List<OrderedFood> b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aa0b1694dc4f9340b5069ac81127416", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aa0b1694dc4f9340b5069ac81127416") : this.b.b(str, j);
    }

    public final void q(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e9a1314b72bab619faa7a15668264ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e9a1314b72bab619faa7a15668264ca");
        } else {
            a(str, k(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37df901838f6619e2aaef1f6f34b0a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37df901838f6619e2aaef1f6f34b0a18");
        } else if (bVar != null) {
            this.c.a(s(str), bVar);
        }
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3271c334a201cb108f88c1408e537682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3271c334a201cb108f88c1408e537682");
        } else {
            k(str).q = 1;
        }
    }

    public final boolean r(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac50ebab916f70d4e737be53af5f6343", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac50ebab916f70d4e737be53af5f6343")).booleanValue();
        }
        return !i(str) && com.sankuai.shangou.stone.util.a.b(k(str).d);
    }

    public final void a(final Activity activity, final com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, final SCPageConfig sCPageConfig, final String str, @NonNull final List<WmOrderedFood> list, final String str2, final TextView textView, final String str3) {
        Object[] objArr = {activity, aVar, sCPageConfig, str, list, str2, textView, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a8da0d25086c6f5c455ee6bec2a2ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a8da0d25086c6f5c455ee6bec2a2ab");
        } else {
            com.sankuai.waimai.store.shopping.cart.pre.d.a(activity, aVar, sCPageConfig).a(new com.sankuai.waimai.store.shopping.cart.pre.c() { // from class: com.sankuai.waimai.store.order.a.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.shopping.cart.pre.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33d45d26ab242564c9e702c0648c6789", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33d45d26ab242564c9e702c0648c6789");
                    } else {
                        a.a(a.this, activity, aVar, sCPageConfig, str, list, str2, textView, str3);
                    }
                }
            });
        }
    }

    public final String s(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7a0a63b8310f5083fb79195f227ae6e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7a0a63b8310f5083fb79195f227ae6e") : com.sankuai.waimai.store.platform.domain.manager.poi.a.w() ? this.b.j(str) : str;
    }
}
