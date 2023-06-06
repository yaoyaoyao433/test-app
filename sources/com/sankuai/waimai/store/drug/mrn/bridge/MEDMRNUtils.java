package com.sankuai.waimai.store.drug.mrn.bridge;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.store.mrn.d;
import com.sankuai.waimai.store.mrn.event.c;
import com.sankuai.waimai.store.mrn.shopcartbridge.a;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.b;
import com.sankuai.xm.im.session.SessionId;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MEDMRNUtils extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFromRestaurantAndDetail(int i) {
        return i == 1 || i == 9 || i == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isImEnable(int i, int i2) {
        return (i == 1 || i == 2 || i2 == 0) ? false : true;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "MEDMRNUtils";
    }

    public MEDMRNUtils(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02358da76cd6fb9f50675244fa8df8f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02358da76cd6fb9f50675244fa8df8f8");
        }
    }

    @ReactMethod
    public void shopKingkongClick(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c982a9aab575c78f8e711d8468985fc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c982a9aab575c78f8e711d8468985fc6");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.drug.mrn.bridge.MEDMRNUtils.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9d45e9daaa27c6620e83c4fb0fd1da15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9d45e9daaa27c6620e83c4fb0fd1da15");
                        return;
                    }
                    try {
                        if (b.a(MEDMRNUtils.this.getCurrentActivity())) {
                            d.a(promise, new RuntimeException("[shopKingkongClick]Context is dead!"));
                            return;
                        }
                        ReadableMap map = readableMap.getMap("navigateItem");
                        String string = readableMap.getString("poiId");
                        String poiIdStr = MEDMRNUtils.getPoiIdStr(readableMap);
                        JSONObject a2 = a.a(map);
                        RestMenuResponse.NavigateItem navigateItem = new RestMenuResponse.NavigateItem();
                        if (a2 != null) {
                            navigateItem.parseJson(a2);
                            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.mrn.event.a(navigateItem, string, poiIdStr));
                        }
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void onPoiImClick(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c79179d9b1fa24d855b00ee6c502c8b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c79179d9b1fa24d855b00ee6c502c8b4");
        } else if (getCurrentActivity() == null || getCurrentActivity().isFinishing()) {
            d.a(promise, new Exception("[onIMClick] activity is null or finishing"));
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.drug.mrn.bridge.MEDMRNUtils.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0badc5595633bbc08e92fdf3b2551bec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0badc5595633bbc08e92fdf3b2551bec");
                        return;
                    }
                    try {
                        int i = readableMap.getInt("sourcePage");
                        String string = readableMap.getString("volleyTag");
                        int i2 = readableMap.getInt("dx_source");
                        String poiIdStr = MEDMRNUtils.getPoiIdStr(readableMap);
                        String string2 = readableMap.getString("poi_id");
                        String string3 = readableMap.getString("spu_id");
                        String string4 = readableMap.getString(Constants.EventConstants.KEY_ORDER_ID);
                        ReadableArray array = readableMap.getArray("phone_list");
                        final ArrayList arrayList = new ArrayList();
                        Iterator<Object> it = array.toArrayList().iterator();
                        while (true) {
                            String str = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (next != null) {
                                str = next.toString();
                            }
                            arrayList.add(str);
                        }
                        ReadableMap map = readableMap.getMap("bottom_poi_im_info");
                        if (MEDMRNUtils.this.isImEnable(map.getInt("poi_im_entrance_status"), map.getInt("poi_dx_id"))) {
                            if (MEDMRNUtils.this.isFromRestaurantAndDetail(i)) {
                                Bundle bundle = new Bundle();
                                if (i == 1 || i == 9) {
                                    bundle.putString("sg-dx-im-from", "sg-from-Restaurant");
                                    bundle.putString("sg-msgOriginId", "c_waimai_qeknbhm9");
                                }
                                com.sankuai.waimai.business.im.api.a.a().a(MEDMRNUtils.this.getReactApplicationContext().getCurrentActivity(), null, 1, 0L, Long.valueOf(string2).longValue(), poiIdStr, Long.valueOf(string3).longValue(), 10, string, false, bundle);
                                return;
                            }
                            com.sankuai.waimai.business.im.api.a.a().a(MEDMRNUtils.this.getReactApplicationContext().getCurrentActivity(), (SessionId) null, i2, Long.valueOf(string4).longValue(), Long.valueOf(string2).longValue(), poiIdStr, Long.valueOf(string3).longValue(), 10, string, false);
                            return;
                        }
                        new CustomDialog.a(MEDMRNUtils.this.getReactApplicationContext().getCurrentActivity()).b(R.string.wm_st_shop_cart_phone_dialog).b(R.string.cancel, (DialogInterface.OnClickListener) null).a(R.string.wm_st_shop_cart_dial, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.drug.mrn.bridge.MEDMRNUtils.2.1
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bdc03357605da7b6a22c2ecafd014e5f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bdc03357605da7b6a22c2ecafd014e5f");
                                } else {
                                    MEDMRNUtils.this.makeCall(MEDMRNUtils.this.getReactApplicationContext().getCurrentActivity(), arrayList);
                                }
                            }
                        }).b();
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeCall(final Activity activity, final ArrayList<String> arrayList) {
        Object[] objArr = {activity, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ab29c38501bc97e6fea4e24081da4cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ab29c38501bc97e6fea4e24081da4cd");
        } else if (activity != null) {
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                ae.a(activity, (int) R.string.wm_st_shop_cart_none_phones);
            } else {
                new CustomDialog.a(activity).a(R.string.wm_st_shop_cart_dial).a((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.drug.mrn.bridge.MEDMRNUtils.3
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dfb6cc4b93e0e035e3d8e81c6cc253e9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dfb6cc4b93e0e035e3d8e81c6cc253e9");
                        } else {
                            z.a(activity, (String) arrayList.get(i));
                        }
                    }
                }).b(R.string.cancel, (DialogInterface.OnClickListener) null).c();
            }
        }
    }

    @ReactMethod
    public void scrollPoiToTop(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f53e4b96842a7eb2afd50ef41bbc4265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f53e4b96842a7eb2afd50ef41bbc4265");
        } else if (readableMap == null) {
        } else {
            scrollPoiToTopNative(readableMap.hasKey("poiId") ? readableMap.getString("poiId") : "", getPoiIdStr(readableMap), promise);
        }
    }

    private void scrollPoiToTopNative(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35593f4790bffe71c7568e45c8676d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35593f4790bffe71c7568e45c8676d43");
        } else {
            al.b(new Runnable() { // from class: com.sankuai.waimai.store.drug.mrn.bridge.MEDMRNUtils.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df64b572f1619e4df3a7704b044bacf1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df64b572f1619e4df3a7704b044bacf1");
                        return;
                    }
                    try {
                        if (b.a(MEDMRNUtils.this.getCurrentActivity())) {
                            d.a(promise, new RuntimeException("[商家页锚点]Context is dead!"));
                            return;
                        }
                        com.meituan.android.bus.a.a().c(new c(str, str2));
                        d.a(promise);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            }, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getPoiIdStr(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64ae1d6b02b37224f765212b8fb581f1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64ae1d6b02b37224f765212b8fb581f1") : (readableMap != null && readableMap.hasKey(FoodDetailNetWorkPreLoader.URI_POI_STR)) ? readableMap.getString(FoodDetailNetWorkPreLoader.URI_POI_STR) : "";
    }
}
