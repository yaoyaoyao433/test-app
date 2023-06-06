package com.meituan.android.legwork.mrn.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.R;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.loader.LoadConfigImpl;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.legwork.common.location.BaseLocationManager;
import com.meituan.android.legwork.ui.component.CommonDialog;
import com.meituan.android.legwork.utils.w;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.tencent.mapsdk.internal.y;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LocationBridgeModule extends ReactContextBaseJavaModule {
    public static final String ACTUAL_LOCATION_ERROR_GPS_SERVICE_CLOSED = "2";
    public static final String ACTUAL_LOCATION_ERROR_LOCATE_ERROR = "3";
    public static final String ACTUAL_LOCATION_ERROR_NO_COARSE_PERMISSION = "1";
    public static final String TAG = "location";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BanmaLocation";
    }

    public LocationBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61b0557c28b92e21989bd9ea7ed6972a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61b0557c28b92e21989bd9ea7ed6972a");
        }
    }

    @ReactMethod
    public void updateDefaultLocated(double d, double d2, String str, Promise promise) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13111b677d396f672fae895e862a94ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13111b677d396f672fae895e862a94ba");
            return;
        }
        x.c("LocationBridgeModule.updateDefaultLocated()", "调用桥updateDefaultLocated，参数：defaultLng：" + d + "，defaultLat：" + d2 + "，cityName：" + str);
        com.meituan.android.legwork.common.location.c.l().a(d, d2, str, "", true, promise);
    }

    @ReactMethod
    public void updateDefaultLocatedNew(double d, double d2, String str, boolean z, Promise promise) {
        String optString;
        String str2;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fee516321c5e93cc3bb28035fddcbf31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fee516321c5e93cc3bb28035fddcbf31");
            return;
        }
        x.c("LocationBridgeModule.updateDefaultLocatedNew()", "调用桥updateDefaultLocatedNew，参数：defaultLng：" + d + "，defaultLat：" + d2 + "，cityInfo：" + str + ", needCheckCityInfo: " + z);
        String str3 = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString2 = jSONObject.optString("cityName");
                try {
                    optString = jSONObject.optString("cityId");
                    str2 = optString2;
                } catch (JSONException e) {
                    e = e;
                    str3 = optString2;
                    x.e("LocationBridgeModule.updateDefaultLocatedNew()", "更新城市信息异常");
                    x.a(e);
                    str2 = str3;
                    optString = "";
                    com.meituan.android.legwork.common.location.c.l().a(d, d2, str2, optString, z, promise);
                }
            } catch (JSONException e2) {
                e = e2;
            }
            com.meituan.android.legwork.common.location.c.l().a(d, d2, str2, optString, z, promise);
        }
        str2 = str3;
        optString = "";
        com.meituan.android.legwork.common.location.c.l().a(d, d2, str2, optString, z, promise);
    }

    @ReactMethod
    public void getCityInfo(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27df7d043ce49c422515717a357f5716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27df7d043ce49c422515717a357f5716");
            return;
        }
        x.c("LocationBridgeModule.getCityInfo()", "调用桥getCityInfo");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("cityId", com.meituan.android.legwork.common.location.c.l().j());
        hashMap2.put(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(com.meituan.android.legwork.common.location.c.l().b));
        hashMap2.put(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(com.meituan.android.legwork.common.location.c.l().c));
        hashMap2.put("cityName", com.meituan.android.legwork.common.location.c.l().d);
        hashMap2.put("appCityName", com.meituan.android.legwork.common.location.c.l().g());
        HashMap hashMap3 = new HashMap();
        hashMap3.put("cityId", com.meituan.android.legwork.common.location.c.l().e());
        hashMap3.put("cityName", com.meituan.android.legwork.common.location.c.l().d());
        hashMap3.put(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(com.meituan.android.legwork.common.location.c.l().b()));
        hashMap3.put(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(com.meituan.android.legwork.common.location.c.l().c()));
        hashMap.put("city", hashMap2);
        hashMap.put("locatedCity", hashMap3);
        x.c("LocationBridgeModule.getCityInfo()", "getCityInfo桥返回结果：objectParams：" + hashMap.toString());
        promise.resolve(Arguments.makeNativeMap(hashMap));
    }

    @ReactMethod
    public void requestActualLocation(String str, String str2, Promise promise) {
        String str3 = str;
        Object[] objArr = {str3, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "842abcd974f682f282dccd8f7032e023", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "842abcd974f682f282dccd8f7032e023");
            return;
        }
        x.c("LocationBridgeModule.requestActualLocation()", "调用桥requestActualLocation,参数：from：" + str3);
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            x.b("LocationBridgeModule.requestActualLocation()", "拿不到页面");
            promise.reject("3", "3");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str3 = "default";
        }
        String str4 = str3;
        boolean z = w.a(str2) > 0;
        boolean a = w.a(reactApplicationContext);
        if (z && a) {
            x.b("LocationBridgeModule.requestActualLocation()", "有权限，开始定位");
            currentActivity.runOnUiThread(h.a(currentActivity, str2, promise, str4));
        } else if (z) {
            x.b("LocationBridgeModule.requestActualLocation()", "无GPS权限");
            CommonDialog commonDialog = new CommonDialog(currentActivity);
            commonDialog.a("定位服务未开启");
            commonDialog.a(true);
            commonDialog.b("请在系统设置中开启定位服务，以便骑手准确到达您的地址");
            commonDialog.b(true);
            commonDialog.d("去设置");
            commonDialog.c(IPaymentManager.NO_ACTION);
            commonDialog.c(true);
            commonDialog.a(reactApplicationContext.getResources().getColor(R.color.legwork_common_text_color_FFFF8C28));
            commonDialog.setCancelable(false);
            commonDialog.setCanceledOnTouchOutside(false);
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = i.a;
            commonDialog.e = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "49652650958e28dcab3b0655e586eecb", RobustBitConfig.DEFAULT_VALUE) ? (CommonDialog.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "49652650958e28dcab3b0655e586eecb") : new i(this);
            Object[] objArr3 = {commonDialog};
            ChangeQuickRedirect changeQuickRedirect4 = j.a;
            commonDialog.d = PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "05fd3cc61bdbef311db67df6a9df1c76", RobustBitConfig.DEFAULT_VALUE) ? (CommonDialog.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "05fd3cc61bdbef311db67df6a9df1c76") : new j(commonDialog);
            commonDialog.show();
            promise.reject("2", "2");
        } else {
            x.b("LocationBridgeModule.requestActualLocation()", "无APP定位权限或者gps权限，先弹app权限弹窗: ");
            try {
                com.meituan.android.privacy.interfaces.e createPermissionGuard = Privacy.createPermissionGuard();
                Activity currentActivity2 = getCurrentActivity();
                Object[] objArr4 = {this, promise, str2, reactApplicationContext, str4};
                ChangeQuickRedirect changeQuickRedirect5 = k.a;
                createPermissionGuard.a(currentActivity2, "Locate.once", str2, PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "d7100aa8b66709a24d51fdcf25faaf68", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.d) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "d7100aa8b66709a24d51fdcf25faaf68") : new k(this, promise, str2, reactApplicationContext, str4));
            } catch (Exception e) {
                x.b("LocationBridgeModule.requestActualLocation()", "获取app定位权限异常");
                x.a(e);
                promise.reject("1", "1");
            }
        }
    }

    public static /* synthetic */ void lambda$requestActualLocation$34(Activity activity, String str, Promise promise, String str2) {
        boolean z = false;
        Object[] objArr = {activity, str, promise, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55b491721dd0e28bf1b29a928d93eff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55b491721dd0e28bf1b29a928d93eff8");
            return;
        }
        com.meituan.android.legwork.common.location.c l = com.meituan.android.legwork.common.location.c.l();
        Loader.OnLoadCompleteListener a = LocationBridgeModule$$Lambda$7.a(promise);
        Object[] objArr2 = {activity, str, a, str2};
        ChangeQuickRedirect changeQuickRedirect3 = BaseLocationManager.a;
        if (PatchProxy.isSupport(objArr2, l, changeQuickRedirect3, false, "e6ad5a71d8197f056a0b08d994734d93", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, l, changeQuickRedirect3, false, "e6ad5a71d8197f056a0b08d994734d93")).booleanValue();
        } else if (a != null && !TextUtils.isEmpty(str2)) {
            if (l.f == null) {
                l.f = new HashMap();
            }
            BaseLocationManager.b bVar = l.f.get(str);
            if (bVar == null) {
                LoadConfigImpl loadConfigImpl = new LoadConfigImpl();
                loadConfigImpl.set(LoadConfig.LOCATION_TIMEOUT, "3000");
                loadConfigImpl.set(LoadConfig.IS_GEARS_RESULT_NEED_BEARING_WHEN_GPS_LOSING, "TRUE");
                loadConfigImpl.set(LoadConfig.DELIVER_INTERVAL, "1000");
                loadConfigImpl.set("business_id", "biz_016");
                com.meituan.android.privacy.locate.g a2 = com.meituan.android.privacy.locate.g.a(activity, str, l.k());
                if (a2 == null) {
                    x.c("BaseLocationManager.requestActualLocation", "无法创建定位wrapper，可能activity已经destroy");
                } else {
                    Loader<MtLocation> a3 = a2.a(com.meituan.android.legwork.a.a(), LocationLoaderFactory.LoadStrategy.newest, loadConfigImpl);
                    if (a3 == null) {
                        x.c("BaseLocationManager.requestActualLocation", "无法创建定位loader，校验定位策略失败");
                    } else {
                        Object[] objArr3 = {l, str2, str};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.legwork.common.location.a.a;
                        bVar = new BaseLocationManager.b(a3, a, PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "ce737f10f5a25550cb4b02da872412cd", RobustBitConfig.DEFAULT_VALUE) ? (BaseLocationManager.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "ce737f10f5a25550cb4b02da872412cd") : new com.meituan.android.legwork.common.location.a(l, str2, str));
                        l.f.put(str, bVar);
                        x.c("BaseLocationManager.requestActualLocation", "开启新的定位: " + str2);
                    }
                }
            } else {
                x.c("BaseLocationManager.requestActualLocation", "正在定位中...增加一处监听:" + str2);
                Object[] objArr4 = {a};
                ChangeQuickRedirect changeQuickRedirect5 = BaseLocationManager.b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect5, false, "4a04bd03e7edf860222b404cf2c21f0d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect5, false, "4a04bd03e7edf860222b404cf2c21f0d");
                } else {
                    Object[] objArr5 = new Object[1];
                    StringBuilder sb = new StringBuilder("LocationMap addListener: ");
                    sb.append(bVar.c != null);
                    objArr5[0] = sb.toString();
                    x.c("BaseLocationManager.requestActualLocation", objArr5);
                    if (bVar.c != null) {
                        BaseLocationManager.LegworkOnLoadCompleteListener.a(bVar.c, a);
                    }
                }
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = BaseLocationManager.b.a;
            if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "48ffd1bf644a9156f1765ab7ab76de23", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "48ffd1bf644a9156f1765ab7ab76de23")).booleanValue();
            } else {
                Object[] objArr7 = new Object[1];
                StringBuilder sb2 = new StringBuilder("LocationMap startLoading: ");
                sb2.append(bVar.b != null);
                objArr7[0] = sb2.toString();
                x.c("BaseLocationManager.requestActualLocation", objArr7);
                if (bVar.b != null) {
                    bVar.b.startLoading();
                    z = true;
                }
            }
        }
        if (z) {
            return;
        }
        promise.reject("3", "3");
    }

    public static /* synthetic */ void lambda$null$33(Promise promise, Loader loader, MtLocation mtLocation) {
        String str;
        Object[] objArr = {promise, loader, mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "21368be586eba72979d5f7f4cc05848d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "21368be586eba72979d5f7f4cc05848d");
            return;
        }
        Object[] objArr2 = new Object[1];
        StringBuilder sb = new StringBuilder("定位完成:");
        if (mtLocation == null) {
            str = "";
        } else {
            str = CommonConstant.Symbol.BRACKET_LEFT + mtLocation.getLongitude() + CommonConstant.Symbol.COMMA + mtLocation.getLatitude() + ") time:" + mtLocation.getTime();
        }
        sb.append(str);
        objArr2[0] = sb.toString();
        x.b("LocationBridgeModule.requestActualLocation()", objArr2);
        if (mtLocation != null && mtLocation.getStatusCode() == 0) {
            HashMap hashMap = new HashMap(5);
            hashMap.put(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(mtLocation.getLongitude()));
            hashMap.put(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(mtLocation.getLatitude()));
            hashMap.put(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, Float.valueOf(mtLocation.getAccuracy()));
            promise.resolve(Arguments.makeNativeMap(hashMap));
            return;
        }
        promise.reject("3", "3");
    }

    public static /* synthetic */ void lambda$requestActualLocation$35(LocationBridgeModule locationBridgeModule) {
        Object[] objArr = {locationBridgeModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "abc4f600131897b3b158df799d4a180b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "abc4f600131897b3b158df799d4a180b");
            return;
        }
        ReactApplicationContext reactApplicationContext = locationBridgeModule.getReactApplicationContext();
        Object[] objArr2 = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect3 = w.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "956069abb7956978fbde86118aeae3b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "956069abb7956978fbde86118aeae3b6");
            return;
        }
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.addFlags(y.a);
        reactApplicationContext.startActivity(intent);
    }

    public static /* synthetic */ void lambda$requestActualLocation$36(CommonDialog commonDialog) {
        Object[] objArr = {commonDialog};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24a7ce6586fe2303856c715f4957d058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24a7ce6586fe2303856c715f4957d058");
        } else {
            commonDialog.dismiss();
        }
    }

    public static /* synthetic */ void lambda$requestActualLocation$39(LocationBridgeModule locationBridgeModule, Promise promise, String str, Context context, String str2, String str3, int i) {
        Object[] objArr = {locationBridgeModule, promise, str, context, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77f1b733bb4c3323b2459664bee1610a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77f1b733bb4c3323b2459664bee1610a");
            return;
        }
        x.c("LocationBridgeModule.requestActualLocation()", "隐私合规 请求权限结果:" + i);
        Activity currentActivity = locationBridgeModule.getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            x.b("LocationBridgeModule.requestActualLocation()", "拿不到页面");
            promise.reject("1", "1");
            return;
        }
        int a = w.a(str);
        x.c("LocationBridgeModule.requestActualLocation()", "隐私合规 重新获取权限结果:" + a);
        if (a == -4) {
            x.b("LocationBridgeModule.requestActualLocation()", "无APP定位权限【不再询问】");
            CommonDialog commonDialog = new CommonDialog(currentActivity);
            commonDialog.a("定位服务未授权");
            commonDialog.a(true);
            commonDialog.b("请开启定位服务授权，以便骑手准确到达您的地址");
            commonDialog.b(true);
            commonDialog.d("去设置");
            commonDialog.c(IPaymentManager.NO_ACTION);
            commonDialog.c(true);
            commonDialog.a(context.getResources().getColor(R.color.legwork_common_text_color_FFFF8C28));
            commonDialog.setCancelable(false);
            commonDialog.setCanceledOnTouchOutside(false);
            Object[] objArr2 = {locationBridgeModule};
            ChangeQuickRedirect changeQuickRedirect3 = l.a;
            commonDialog.e = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "bf01a6f4e63f969dd688ed6791e25c6f", RobustBitConfig.DEFAULT_VALUE) ? (CommonDialog.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "bf01a6f4e63f969dd688ed6791e25c6f") : new l(locationBridgeModule);
            Object[] objArr3 = {commonDialog};
            ChangeQuickRedirect changeQuickRedirect4 = m.a;
            commonDialog.d = PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "f704e3cd921366dcec491da0cb214794", RobustBitConfig.DEFAULT_VALUE) ? (CommonDialog.b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "f704e3cd921366dcec491da0cb214794") : new m(commonDialog);
            commonDialog.show();
        } else if (a == -7 || a > 0) {
            locationBridgeModule.requestActualLocation(str2, str, promise);
            return;
        }
        promise.reject("1", "1");
    }

    public static /* synthetic */ void lambda$null$37(LocationBridgeModule locationBridgeModule) {
        Object[] objArr = {locationBridgeModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e91204a1764c13231903b3e8fb125b9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e91204a1764c13231903b3e8fb125b9b");
            return;
        }
        ReactApplicationContext reactApplicationContext = locationBridgeModule.getReactApplicationContext();
        Object[] objArr2 = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect3 = w.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "1bbecc5e452fbc1581e8e2050f7c3cf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "1bbecc5e452fbc1581e8e2050f7c3cf8");
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + reactApplicationContext.getPackageName()));
        intent.addFlags(y.a);
        if (reactApplicationContext.getPackageManager().resolveActivity(intent, 65536) != null) {
            try {
                reactApplicationContext.startActivity(intent);
                return;
            } catch (Exception unused) {
                Intent intent2 = new Intent("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
                intent2.addFlags(y.a);
                if (reactApplicationContext.getPackageManager().resolveActivity(intent2, 65536) != null) {
                    reactApplicationContext.startActivity(intent2);
                    return;
                }
                return;
            }
        }
        Intent intent3 = new Intent("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
        intent3.addFlags(y.a);
        if (reactApplicationContext.getPackageManager().resolveActivity(intent3, 65536) != null) {
            reactApplicationContext.startActivity(intent3);
        }
    }

    public static /* synthetic */ void lambda$null$38(CommonDialog commonDialog) {
        Object[] objArr = {commonDialog};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "973889ed6772b5baf251fba9ea126dcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "973889ed6772b5baf251fba9ea126dcc");
        } else {
            commonDialog.dismiss();
        }
    }
}
