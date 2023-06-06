package com.sankuai.waimai.business.restaurant.base.skuchoose;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.restaurant.shopcart.popup.MRNDialog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
@ReactModule(name = ChooseSkuDialogModule.NAME)
/* loaded from: classes4.dex */
public class ChooseSkuDialogModule extends ReactContextBaseJavaModule {
    public static final String NAME = "ChooseSkuDialogModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.sankuai.waimai.restaurant.shopcart.ui.a mCartAnimationHelper;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    public ChooseSkuDialogModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81e20f16c06645949ae9c17776b41da6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81e20f16c06645949ae9c17776b41da6");
        }
    }

    @ReactMethod
    public void saveAttrCache(String str, String str2, final String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "daef6697916f59d55ebf0ca174862295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "daef6697916f59d55ebf0ca174862295");
            return;
        }
        MRNDialog a = c.a().a(str);
        if (a instanceof ChooseSkuGoodsRNDialog) {
            final long parseLong = Long.parseLong(str2);
            final GoodsSpu l = ((ChooseSkuGoodsRNDialog) a).l();
            ai.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dc79e4a7ce89edcc008fe89fdfaf6ea6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dc79e4a7ce89edcc008fe89fdfaf6ea6");
                    } else if (l != null && parseLong == l.getId() && parseLong == l.getId()) {
                        l.setFoodMultiSpuResponseNew(str3);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getAttrCache(String str, String str2, String str3, final Callback callback) {
        Object[] objArr = {str, str2, str3, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df22999de751ea8c1662e054ab663b7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df22999de751ea8c1662e054ab663b7b");
            return;
        }
        MRNDialog a = c.a().a(str);
        if (a instanceof ChooseSkuGoodsRNDialog) {
            final long parseLong = Long.parseLong(str2);
            final GoodsSpu l = ((ChooseSkuGoodsRNDialog) a).l();
            ai.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc8d94b44544a9f238fdb098df6abd1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc8d94b44544a9f238fdb098df6abd1e");
                    } else if (l != null && parseLong == l.getId() && parseLong == l.getId()) {
                        callback.invoke(l.getFoodMultiSpuResponseNew());
                    }
                }
            });
        }
    }

    @ReactMethod
    public void increaseFood(String str, ReadableMap readableMap, final String str2, ReadableArray readableArray, double d, double d2, String str3, final Promise promise) {
        final GoodsSku goodsSku;
        Object[] objArr = {str, readableMap, str2, readableArray, Double.valueOf(d), Double.valueOf(d2), str3, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e822a93217e814b84cd0dd00a5b173dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e822a93217e814b84cd0dd00a5b173dd");
            return;
        }
        MRNDialog a = c.a().a(str);
        if (a instanceof ChooseSkuGoodsRNDialog) {
            final ChooseSkuGoodsRNDialog chooseSkuGoodsRNDialog = (ChooseSkuGoodsRNDialog) a;
            final com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = chooseSkuGoodsRNDialog.c;
            chooseSkuGoodsRNDialog.o();
            final WeakReference<View> weakReference = chooseSkuGoodsRNDialog.d;
            final View view = a.getView();
            if (gVar == null || readableMap == null || readableArray == null || TextUtils.isEmpty(str2)) {
                return;
            }
            final View a2 = com.sankuai.waimai.business.restaurant.rn.bridge.a.a(view, str3);
            final GoodsSpu goodsSpu = new GoodsSpu();
            goodsSpu.parseJson(com.sankuai.waimai.business.restaurant.rn.bridge.a.a(readableMap));
            List<GoodsSku> skus = goodsSpu.getSkus();
            final long parseLong = Long.parseLong(str2);
            if (skus != null) {
                GoodsSku goodsSku2 = null;
                Iterator<GoodsSku> it = skus.iterator();
                loop0: while (true) {
                    goodsSku = goodsSku2;
                    while (it.hasNext()) {
                        goodsSku2 = it.next();
                        if (parseLong == goodsSku2.getSkuId()) {
                            break;
                        }
                    }
                }
                final JSONArray a3 = com.sankuai.waimai.business.restaurant.rn.bridge.a.a(readableArray);
                final GoodsAttr[] goodsAttrArr = (GoodsAttr[]) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson(a3.toString(), new TypeToken<GoodsAttr[]>() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.3
                }.getType());
                if (goodsSku != null) {
                    ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.4
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4b8c41d22198a3f5cf6e8f3abd6ffb73", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4b8c41d22198a3f5cf6e8f3abd6ffb73");
                            } else if (chooseSkuGoodsRNDialog.n()) {
                                if (ChooseSkuDialogModule.this.getCurrentActivity() != null && chooseSkuGoodsRNDialog.i != null) {
                                    com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a aVar = chooseSkuGoodsRNDialog.i;
                                    String str4 = chooseSkuGoodsRNDialog.h;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(goodsSpu.getId());
                                    String sb2 = sb.toString();
                                    String str5 = str2;
                                    String jSONArray = a3.toString();
                                    a.InterfaceC0845a interfaceC0845a = new a.InterfaceC0845a() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.4.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a.InterfaceC0845a
                                        public final void a(Map<String, Object> map) {
                                            Object[] objArr3 = {map};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b684cbeddcfcd14e74dc0b22f6717954", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b684cbeddcfcd14e74dc0b22f6717954");
                                                return;
                                            }
                                            WritableMap createMap = Arguments.createMap();
                                            if (map != null) {
                                                createMap.putInt("countWithTotal", ((Integer) map.get("countWithTotal")).intValue());
                                                createMap.putInt("countWithSpu", ((Integer) map.get("countWithSpu")).intValue());
                                                createMap.putInt("countWithSku", ((Integer) map.get("countWithSku")).intValue());
                                                createMap.putInt("countWithAttrs", ((Integer) map.get("countWithAttrs")).intValue());
                                                promise.resolve(createMap);
                                            }
                                        }
                                    };
                                    Object[] objArr3 = {str4, sb2, str5, jSONArray, interfaceC0845a};
                                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a.a;
                                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "efce7834c5e98c7bca20ea6a2d605fb1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "efce7834c5e98c7bca20ea6a2d605fb1");
                                    } else if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(sb2) && !TextUtils.isEmpty(sb2) && !TextUtils.isEmpty(jSONArray)) {
                                        int andIncrement = aVar.c.getAndIncrement();
                                        aVar.b.put(Integer.valueOf(andIncrement), interfaceC0845a);
                                        aVar.a(0, andIncrement, str4, sb2, str5, jSONArray);
                                    }
                                }
                            } else {
                                k.a().a(ChooseSkuDialogModule.this.getCurrentActivity(), gVar.f(), goodsSpu, goodsSku, goodsAttrArr, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.4.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                    public final void a() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "a06a4ae13895a371acbbe7d57eb3f8ed", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "a06a4ae13895a371acbbe7d57eb3f8ed");
                                        }
                                    }

                                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                    public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                        Object[] objArr4 = {bVar};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "81fc9c1350be9fae7f8513dce481a999", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "81fc9c1350be9fae7f8513dce481a999");
                                            return;
                                        }
                                        if (ChooseSkuDialogModule.this.mCartAnimationHelper == null) {
                                            ChooseSkuDialogModule.this.mCartAnimationHelper = new com.sankuai.waimai.restaurant.shopcart.ui.a();
                                        }
                                        ChooseSkuDialogModule.this.mCartAnimationHelper.a(ChooseSkuDialogModule.this.getReactApplicationContext(), a2, weakReference == null ? null : (View) weakReference.get(), (ViewGroup) view);
                                        WritableMap shopCartOrderCount = ChooseSkuDialogModule.this.getShopCartOrderCount(gVar.f(), goodsSpu.getId(), parseLong, goodsAttrArr);
                                        if (shopCartOrderCount != null) {
                                            promise.resolve(shopCartOrderCount);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                    public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar2) {
                                        Object[] objArr4 = {aVar2};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "bface93c5b58196899b4d7c8ba6932d7", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "bface93c5b58196899b4d7c8ba6932d7");
                                        } else if (aVar2 == null || TextUtils.isEmpty(aVar2.getMessage())) {
                                        } else {
                                            ae.b(ChooseSkuDialogModule.this.getCurrentActivity(), aVar2.getMessage());
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        }
    }

    @ReactMethod
    public void decreaseFood(String str, ReadableMap readableMap, final String str2, ReadableArray readableArray, final Promise promise) {
        final GoodsSku goodsSku;
        Object[] objArr = {str, readableMap, str2, readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a9dc0ed00b89a59087d576d176ddb4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a9dc0ed00b89a59087d576d176ddb4b");
            return;
        }
        MRNDialog a = c.a().a(str);
        if (a instanceof ChooseSkuGoodsRNDialog) {
            final ChooseSkuGoodsRNDialog chooseSkuGoodsRNDialog = (ChooseSkuGoodsRNDialog) a;
            final com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = chooseSkuGoodsRNDialog.c;
            chooseSkuGoodsRNDialog.o();
            if (gVar == null || readableMap == null || readableArray == null || TextUtils.isEmpty(str2)) {
                return;
            }
            final GoodsSpu goodsSpu = new GoodsSpu();
            goodsSpu.parseJson(com.sankuai.waimai.business.restaurant.rn.bridge.a.a(readableMap));
            List<GoodsSku> skus = goodsSpu.getSkus();
            final long parseLong = Long.parseLong(str2);
            if (skus != null) {
                GoodsSku goodsSku2 = null;
                Iterator<GoodsSku> it = skus.iterator();
                loop0: while (true) {
                    goodsSku = goodsSku2;
                    while (it.hasNext()) {
                        goodsSku2 = it.next();
                        if (parseLong == goodsSku2.getSkuId()) {
                            break;
                        }
                    }
                }
                final JSONArray a2 = com.sankuai.waimai.business.restaurant.rn.bridge.a.a(readableArray);
                final GoodsAttr[] goodsAttrArr = (GoodsAttr[]) com.sankuai.waimai.business.restaurant.goodsdetail.constants.a.a().fromJson(a2.toString(), new TypeToken<GoodsAttr[]>() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.5
                }.getType());
                if (goodsSku != null) {
                    ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.6
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "197a6104a285914cc77bda43a9579c72", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "197a6104a285914cc77bda43a9579c72");
                            } else if (!chooseSkuGoodsRNDialog.n()) {
                                k.a().a(gVar.f(), goodsSpu, goodsSku, goodsAttrArr, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.6.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                    public final void a() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0bf959e88677b187c1fde56c811e064b", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0bf959e88677b187c1fde56c811e064b");
                                        }
                                    }

                                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                    public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                                    }

                                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                                    public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                        Object[] objArr3 = {bVar};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "53f450ad09353c0a46dab7af30fa8de9", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "53f450ad09353c0a46dab7af30fa8de9");
                                            return;
                                        }
                                        WritableMap shopCartOrderCount = ChooseSkuDialogModule.this.getShopCartOrderCount(gVar.f(), goodsSpu.getId(), parseLong, goodsAttrArr);
                                        if (shopCartOrderCount != null) {
                                            promise.resolve(shopCartOrderCount);
                                        } else {
                                            promise.reject("1", "CartData empty");
                                        }
                                    }
                                });
                            } else {
                                if (chooseSkuGoodsRNDialog.i != null) {
                                    com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a aVar = chooseSkuGoodsRNDialog.i;
                                    String str3 = chooseSkuGoodsRNDialog.h;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(goodsSpu.getId());
                                    String sb2 = sb.toString();
                                    String str4 = str2;
                                    String jSONArray = a2.toString();
                                    a.InterfaceC0845a interfaceC0845a = new a.InterfaceC0845a() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.6.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a.InterfaceC0845a
                                        public final void a(Map<String, Object> map) {
                                            Object[] objArr3 = {map};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5b8245922664735565b16e4ea7a83e38", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5b8245922664735565b16e4ea7a83e38");
                                                return;
                                            }
                                            WritableMap createMap = Arguments.createMap();
                                            if (map != null) {
                                                createMap.putInt("countWithTotal", ((Integer) map.get("countWithTotal")).intValue());
                                                createMap.putInt("countWithSpu", ((Integer) map.get("countWithSpu")).intValue());
                                                createMap.putInt("countWithSku", ((Integer) map.get("countWithSku")).intValue());
                                                createMap.putInt("countWithAttrs", ((Integer) map.get("countWithAttrs")).intValue());
                                                promise.resolve(createMap);
                                            }
                                        }
                                    };
                                    Object[] objArr3 = {str3, sb2, str4, jSONArray, interfaceC0845a};
                                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.poicontainer.machpro.menu.a.a;
                                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "165e6a07fbd7ff4c09f73b7b764c2053", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "165e6a07fbd7ff4c09f73b7b764c2053");
                                    } else if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(sb2) && !TextUtils.isEmpty(sb2) && !TextUtils.isEmpty(jSONArray)) {
                                        int andIncrement = aVar.c.getAndIncrement();
                                        aVar.b.put(Integer.valueOf(andIncrement), interfaceC0845a);
                                        aVar.a(1, andIncrement, str3, sb2, str4, jSONArray);
                                    }
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    @ReactMethod
    public void orderedCount(final String str, final String str2, final String str3, final String str4, final ReadableArray readableArray, final Promise promise) {
        Object[] objArr = {str, str2, str3, str4, readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8868f48d7efefbfbd132cbfd007e3538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8868f48d7efefbfbd132cbfd007e3538");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.7
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 268
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.base.skuchoose.ChooseSkuDialogModule.AnonymousClass7.run():void");
                }
            });
        }
    }

    public WritableMap getShopCartOrderCount(String str, long j, long j2, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {str, new Long(j), new Long(j2), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08ff67b0002ee46efce0c41e1fb1be7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08ff67b0002ee46efce0c41e1fb1be7e");
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(str);
        if (n != null) {
            int e = n.e();
            int a = n.a(j);
            int a2 = n.a(j, j2);
            int a3 = n.a(j, j2, goodsAttrArr);
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("countWithTotal", e);
            createMap.putInt("countWithSpu", a);
            createMap.putInt("countWithSku", a2);
            createMap.putInt("countWithAttrs", a3);
            return createMap;
        }
        return null;
    }
}
