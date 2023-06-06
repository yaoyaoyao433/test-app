package com.sankuai.waimai.business.knb;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.URLUtil;
import com.dianping.titans.client.ImageTitleHelper;
import com.dianping.titans.js.IJSHandlerDelegate;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.dianping.titans.utils.CookieUtil;
import com.dianping.titans.utils.LocalIdUtils;
import com.dianping.titansadapter.AbstractJSBPerformer;
import com.dianping.titansmodel.i;
import com.dianping.titansmodel.j;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.waimai.business.knb.h;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.LocationResultCode;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.kit.share.WMShareProvider;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.share.bean.WeixinBean;
import com.sankuai.waimai.kit.share.listener.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpCookie;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends AbstractJSBPerformer {
    public static ChangeQuickRedirect a;
    public ArrayMap<String, Object> b;
    private Context c;
    private BroadcastReceiver d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);
    }

    @Override // com.dianping.titansadapter.AbstractJSBPerformer, com.dianping.titansadapter.IJSBPerformer
    public final boolean isPerformerApiSupported(int i) {
        return i == 6;
    }

    public static /* synthetic */ BroadcastReceiver a(h hVar, BroadcastReceiver broadcastReceiver) {
        hVar.d = null;
        return null;
    }

    public static /* synthetic */ String a(h hVar, Context context, File file) {
        Object[] objArr = {context, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "39893adac337e527c4475aba44233100", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "39893adac337e527c4475aba44233100");
        }
        Uri uriForFile = WMShareProvider.getUriForFile(context, context.getPackageName() + ".WMShareProvider", file);
        context.grantUriPermission("com.tencent.mm", uriForFile, 1);
        return uriForFile.toString();
    }

    public static /* synthetic */ void a(h hVar, Activity activity, WeixinBean weixinBean, b bVar, IJSHandlerDelegate iJSHandlerDelegate) {
        Object[] objArr = {activity, weixinBean, bVar, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "6ec1075951a74b297e710f304383939e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "6ec1075951a74b297e710f304383939e");
        } else if ((bVar.b == null && aa.a(bVar.c)) || bVar.a == null) {
        } else {
            weixinBean.setImageData(bVar.b, bVar.a);
            weixinBean.setImagePath(bVar.c);
            com.sankuai.waimai.kit.share.b bVar2 = new com.sankuai.waimai.kit.share.b(activity);
            c cVar = new c(iJSHandlerDelegate);
            Object[] objArr2 = {weixinBean, cVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.kit.share.b.a;
            if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "a4eb4682f1d915979a57ef63da7ace84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "a4eb4682f1d915979a57ef63da7ace84");
                return;
            }
            if (bVar2.b == null) {
                bVar2.b = new com.sankuai.waimai.kit.share.strategy.a(bVar2.e, bVar2.d.get());
            }
            bVar2.b.a(weixinBean, cVar);
        }
    }

    public static /* synthetic */ void a(h hVar, JSONObject jSONObject, IJSHandlerDelegate iJSHandlerDelegate, WMLocation wMLocation) {
        Object[] objArr = {jSONObject, iJSHandlerDelegate, wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "9cd670341032d0e49c46ba1ac8847b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "9cd670341032d0e49c46ba1ac8847b50");
            return;
        }
        JsBridgeResult jsBridgeResult = new JsBridgeResult();
        if (!wMLocation.hasLocatedPermission) {
            jsBridgeResult.errorCode = -100;
            jsBridgeResult.errorMsg = "no auth";
            iJSHandlerDelegate.failCallback(jsBridgeResult);
            return;
        }
        if (wMLocation == null || wMLocation.getLocationResultCode().a != 1200) {
            jsBridgeResult.errorCode = -1;
            jsBridgeResult.errorMsg = "internal error";
        } else {
            jsBridgeResult.errorCode = 0;
        }
        double latitude = wMLocation.getLatitude() != 0.0d ? wMLocation.getLatitude() : -10000.0d;
        double longitude = wMLocation.getLongitude() != 0.0d ? wMLocation.getLongitude() : -10000.0d;
        jsBridgeResult.putProperty("lat", Double.valueOf(latitude));
        jsBridgeResult.putProperty("lng", Double.valueOf(longitude));
        jsBridgeResult.putProperty(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, Float.valueOf(com.sankuai.waimai.business.knb.util.b.a(wMLocation.getSpeed())));
        jsBridgeResult.putProperty(JsBridgeResult.PROPERTY_LOCATION_ALTITUDE, com.sankuai.waimai.business.knb.util.b.a(Double.valueOf(wMLocation.getAltitude())));
        jsBridgeResult.putProperty(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, Float.valueOf(com.sankuai.waimai.business.knb.util.b.a(wMLocation.getAccuracy())));
        iJSHandlerDelegate.successCallback(jsBridgeResult);
    }

    public static /* synthetic */ void b(h hVar, JSONObject jSONObject, IJSHandlerDelegate iJSHandlerDelegate, WMLocation wMLocation) {
        double doubleValue;
        double doubleValue2;
        Object[] objArr = {jSONObject, iJSHandlerDelegate, wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "a97d8e835e2f1e8f00dea656b5331697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "a97d8e835e2f1e8f00dea656b5331697");
            return;
        }
        JsBridgeResult jsBridgeResult = new JsBridgeResult();
        if (!wMLocation.hasLocatedPermission) {
            jsBridgeResult.errorCode = -100;
            jsBridgeResult.errorMsg = "no auth";
            iJSHandlerDelegate.failCallback(jsBridgeResult);
            return;
        }
        if (wMLocation == null || wMLocation.getLocationResultCode().a != 1200) {
            jsBridgeResult.errorCode = -1;
            jsBridgeResult.errorMsg = "internal error";
        } else {
            jsBridgeResult.errorCode = 0;
        }
        String optString = jSONObject.optString("type", JsBridgeResult.LOCATION_TYPE_GCJ02);
        if (!JsBridgeResult.LOCATION_TYPE_GCJ02.equalsIgnoreCase(optString) && !JsBridgeResult.LOCATION_TYPE_WGS84.equalsIgnoreCase(optString)) {
            optString = JsBridgeResult.LOCATION_TYPE_GCJ02;
        }
        if (JsBridgeResult.LOCATION_TYPE_WGS84.equals(optString)) {
            Bundle extras = wMLocation.getExtras();
            doubleValue = -10000.0d;
            if (extras != null) {
                doubleValue = com.sankuai.waimai.business.knb.util.b.a(Double.valueOf(extras.getDouble("gpslat", -10000.0d))).doubleValue();
                doubleValue2 = com.sankuai.waimai.business.knb.util.b.a(Double.valueOf(extras.getDouble("gpslng", -10000.0d))).doubleValue();
            } else {
                doubleValue2 = -10000.0d;
            }
        } else {
            doubleValue = com.sankuai.waimai.business.knb.util.b.a(Double.valueOf(wMLocation.getLatitude())).doubleValue();
            doubleValue2 = com.sankuai.waimai.business.knb.util.b.a(Double.valueOf(wMLocation.getLongitude())).doubleValue();
        }
        jsBridgeResult.putProperty("lat", Double.valueOf(doubleValue));
        jsBridgeResult.putProperty("lng", Double.valueOf(doubleValue2));
        jsBridgeResult.putProperty(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, Float.valueOf(com.sankuai.waimai.business.knb.util.b.a(wMLocation.getSpeed())));
        jsBridgeResult.putProperty(JsBridgeResult.PROPERTY_LOCATION_ALTITUDE, com.sankuai.waimai.business.knb.util.b.a(Double.valueOf(wMLocation.getAltitude())));
        jsBridgeResult.putProperty(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, Float.valueOf(com.sankuai.waimai.business.knb.util.b.a(wMLocation.getAccuracy())));
        iJSHandlerDelegate.successCallback(jsBridgeResult);
    }

    public h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a9f0c5259c904f6cae97e899e47da33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a9f0c5259c904f6cae97e899e47da33");
            return;
        }
        this.b = new ArrayMap<>(1);
        this.c = context;
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public final void bind(com.dianping.titansmodel.apimodel.a aVar, IJSHandlerDelegate<Object> iJSHandlerDelegate) {
        Object[] objArr = {aVar, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6138d09696b7e0f82614118c51c0ffdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6138d09696b7e0f82614118c51c0ffdc");
        } else {
            ((BaseJsHandler) iJSHandlerDelegate).jsCallbackErrorMsg("ERR_NOT_IMPLEMENTED");
        }
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public final void login(final IJSHandlerDelegate<com.dianping.titansmodel.g> iJSHandlerDelegate) {
        Object[] objArr = {iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c44d4a44fdaaa23a0b5b1946a3f62b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c44d4a44fdaaa23a0b5b1946a3f62b8");
            return;
        }
        User a2 = com.sankuai.waimai.business.knb.util.b.a(iJSHandlerDelegate.getContext());
        if (a2 != null) {
            iJSHandlerDelegate.successCallback(a(a2));
            return;
        }
        final Activity activity = iJSHandlerDelegate.getJsHost().getActivity();
        if (this.d == null) {
            this.d = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.knb.WMJSBPerformer$1
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    com.sankuai.waimai.business.knb.model.b a3;
                    Object[] objArr2 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2683210c4b027770a18675ebd6bffa1b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2683210c4b027770a18675ebd6bffa1b");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.e("mLoginReceiver", "receive loginevent broadcast", new Object[0]);
                    if (intent.getAction().equals("com.sankuai.meituan.login.action")) {
                        if (com.sankuai.waimai.platform.utils.f.c(intent, "type") instanceof UserCenter.d) {
                            switch ((UserCenter.d) r13) {
                                case login:
                                    a3 = h.this.a(com.sankuai.waimai.business.knb.util.b.a(iJSHandlerDelegate.getContext()));
                                    try {
                                        CookieUtil.setCookie(new HttpCookie("token", a3.e));
                                    } catch (Exception e) {
                                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                                    }
                                    iJSHandlerDelegate.successCallback(a3);
                                    break;
                                case cancel:
                                case logout:
                                    iJSHandlerDelegate.failCallback(null);
                                    break;
                            }
                        }
                        if (activity instanceof h.a) {
                            ((h.a) activity).a(1);
                        }
                        com.sankuai.waimai.business.knb.util.b.a(iJSHandlerDelegate.getContext(), h.this.d);
                        h.a(h.this, (BroadcastReceiver) null);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.sankuai.meituan.login.action");
            iJSHandlerDelegate.getContext().registerReceiver(this.d, intentFilter);
            iJSHandlerDelegate.setOnDestroyListener(new IJSHandlerDelegate.OnDestroyListener() { // from class: com.sankuai.waimai.business.knb.h.4
                public static ChangeQuickRedirect a;

                @Override // com.dianping.titans.js.IJSHandlerDelegate.OnDestroyListener
                public final void onDestroy() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4ed61c7d5885c7c348721676c822455", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4ed61c7d5885c7c348721676c822455");
                        return;
                    }
                    com.sankuai.waimai.business.knb.util.b.a(iJSHandlerDelegate.getContext(), h.this.d);
                    h.a(h.this, (BroadcastReceiver) null);
                }
            });
        }
        if (activity instanceof a) {
            ((a) activity).a(3);
        }
        com.sankuai.waimai.platform.domain.manager.user.a.a((Context) activity);
    }

    @Override // com.dianping.titansadapter.AbstractJSBPerformer, com.dianping.titansadapter.IJSBPerformer
    public final void getLocation(JSONObject jSONObject, final IJSHandlerDelegate<JsBridgeResult> iJSHandlerDelegate) {
        Object[] objArr = {jSONObject, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef56fbab7b1c1cb3fece9c29eb231f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef56fbab7b1c1cb3fece9c29eb231f0d");
            return;
        }
        final JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        String sceneToken = ((BaseJsHandler) iJSHandlerDelegate).getSceneToken();
        final com.sankuai.waimai.foundation.location.v2.g a2 = com.sankuai.waimai.foundation.location.v2.g.a();
        final DeviceLocateCallback deviceLocateCallback = new DeviceLocateCallback() { // from class: com.sankuai.waimai.business.knb.h.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(WMLocation wMLocation) {
                Object[] objArr2 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d38a197222da8e56b23f291cb2cacb46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d38a197222da8e56b23f291cb2cacb46");
                } else if (com.sankuai.waimai.kit.a.a().b()) {
                    double b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(h.this.c, "mock_longitude", Double.NaN);
                    double b3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(h.this.c, "mock_latitude", Double.NaN);
                    if (!Double.isNaN(b2) && !Double.isNaN(b3)) {
                        WMLocation wMLocation2 = new WMLocation("mockLocate");
                        wMLocation2.setLatitude(b3);
                        wMLocation2.setLongitude(b2);
                        LocationResultCode locationResultCode = new LocationResultCode();
                        locationResultCode.a = 1200;
                        locationResultCode.b = "mock success";
                        wMLocation2.setLocationResultCode(locationResultCode);
                        h.a(h.this, jSONObject2, iJSHandlerDelegate, wMLocation2);
                        return;
                    }
                    h.b(h.this, jSONObject2, iJSHandlerDelegate, wMLocation);
                } else {
                    h.b(h.this, jSONObject2, iJSHandlerDelegate, wMLocation);
                }
            }
        };
        final String name = com.sankuai.waimai.platform.domain.manager.location.v2.b.KNB.name();
        k kVar = new k(iJSHandlerDelegate.getJsHost().getActivity(), sceneToken);
        Object[] objArr2 = {deviceLocateCallback, name, kVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.foundation.location.v2.g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "96a4588ad85db11b4c14f46e7ac3ecd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "96a4588ad85db11b4c14f46e7ac3ecd2");
            return;
        }
        a2.c();
        a2.c.a(new DeviceLocateCallback() { // from class: com.sankuai.waimai.foundation.location.v2.g.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback
            public final void a(@Nullable WMLocation wMLocation) {
                Object[] objArr3 = {wMLocation};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ff144efb466226373dc32c2f3a81ae02", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ff144efb466226373dc32c2f3a81ae02");
                } else if (deviceLocateCallback != null) {
                    deviceLocateCallback.a(wMLocation);
                    com.sankuai.waimai.foundation.location.b c2 = com.sankuai.waimai.foundation.location.e.c();
                    Pair[] pairArr = new Pair[3];
                    pairArr[0] = Pair.create("callTag", name);
                    pairArr[1] = Pair.create("DeviceLocateCallback", deviceLocateCallback);
                    pairArr[2] = Pair.create("location", wMLocation != null ? wMLocation.toString() : StringUtil.NULL);
                    c2.a("LocationManagerV3", "startLocateForBusiness", pairArr);
                }
            }
        }, false, kVar);
    }

    @Override // com.dianping.titansadapter.AbstractJSBPerformer, com.dianping.titansadapter.IJSBPerformer
    public final void stopLocating() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a7f03431132212907b5f9dd2e19ba0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a7f03431132212907b5f9dd2e19ba0");
        } else if (com.sankuai.waimai.platform.domain.manager.location.v2.a.b) {
            com.sankuai.waimai.foundation.location.v2.g.a().d();
        }
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public final void getCityInfo(IJSHandlerDelegate<com.dianping.titansmodel.c> iJSHandlerDelegate) {
        Object[] objArr = {iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2666578fa7f233315c86339b9ac47644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2666578fa7f233315c86339b9ac47644");
            return;
        }
        if (iJSHandlerDelegate != null && iJSHandlerDelegate.getJsHost() != null) {
            this.b.put("host", iJSHandlerDelegate.getJsHost().getUrl());
            Babel.log("waimai_app_knb_host", "waimai_app_knb_host", this.b);
        } else {
            this.b.put("host", "url get failed");
            Babel.log("waimai_app_knb_host", "waimai_app_knb_host", this.b);
        }
        City m = com.sankuai.waimai.foundation.location.v2.g.a().m();
        City n = com.sankuai.waimai.foundation.location.v2.g.a().n();
        com.dianping.titansmodel.c cVar = new com.dianping.titansmodel.c();
        if (n != null) {
            cVar.e = n.getCityCode();
            cVar.d = n.getCityName();
        }
        if (m != null) {
            cVar.c = m.getCityCode();
            cVar.b = m.getCityName();
        }
        cVar.f = "mt";
        if (iJSHandlerDelegate != null) {
            if (TextUtils.isEmpty(cVar.d)) {
                cVar.errorMsg = "city info is null";
                iJSHandlerDelegate.failCallback(cVar);
                return;
            }
            iJSHandlerDelegate.successCallback(cVar);
        }
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public final void getUserInfo(IJSHandlerDelegate<j> iJSHandlerDelegate) {
        Object[] objArr = {iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d653648bf00941c0c5ef2fe53b69be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d653648bf00941c0c5ef2fe53b69be");
        } else {
            iJSHandlerDelegate.successCallback(a(com.sankuai.waimai.business.knb.util.b.a(iJSHandlerDelegate.getContext())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.waimai.business.knb.model.b a(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bd43eba94f1f92588c868eeaf007822", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.knb.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bd43eba94f1f92588c868eeaf007822");
        }
        com.sankuai.waimai.business.knb.model.b bVar = new com.sankuai.waimai.business.knb.model.b();
        if (user != null) {
            bVar.b = String.valueOf(user.id);
            bVar.e = user.token;
            bVar.i = user.hasPassword;
            bVar.j = user.avatarurl;
            bVar.k = user.username;
            bVar.h = user.mobile;
        } else {
            bVar.b = "-1";
            bVar.errorMsg = "user not login.";
        }
        bVar.c = com.sankuai.waimai.business.knb.services.a.b();
        bVar.p = com.sankuai.waimai.business.knb.services.a.a();
        bVar.o = "mt";
        return bVar;
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public final void getFingerprint(com.dianping.titansmodel.apimodel.c cVar, final IJSHandlerDelegate<com.dianping.titansmodel.d> iJSHandlerDelegate) {
        Object[] objArr = {cVar, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab07cf30f28f15df760a3da2e701367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab07cf30f28f15df760a3da2e701367");
            return;
        }
        final FingerprintManager fingerprintManager = com.sankuai.waimai.kit.fingerPrint.a.a().b;
        if (fingerprintManager == null) {
            com.dianping.titansmodel.d dVar = new com.dianping.titansmodel.d();
            dVar.errorMsg = "fingerprint is null";
            iJSHandlerDelegate.failCallback(dVar);
        } else if (KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.sankuai.waimai.business.knb.h.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76642d5ee0d56ed776a2670cb8ebf406", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76642d5ee0d56ed776a2670cb8ebf406");
                    return;
                }
                com.dianping.titansmodel.d dVar2 = new com.dianping.titansmodel.d();
                dVar2.b = fingerprintManager.fingerprint();
                iJSHandlerDelegate.successCallback(dVar2);
            }
        })) {
        } else {
            com.dianping.titansmodel.d dVar2 = new com.dianping.titansmodel.d();
            dVar2.errorMsg = "thread error";
            iJSHandlerDelegate.failCallback(dVar2);
        }
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public final void logout(IJSHandlerDelegate<com.dianping.titansmodel.g> iJSHandlerDelegate) {
        Object[] objArr = {iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7f414baf9cc6b7870a69490806bc5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7f414baf9cc6b7870a69490806bc5a");
            return;
        }
        Context context = iJSHandlerDelegate.getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d8fc6d058c3b37212367ffbc1ba088b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d8fc6d058c3b37212367ffbc1ba088b3");
        } else {
            GlobalCartManager.getInstance().exit();
            UserCenter.getInstance(context).logout();
            Object[] objArr3 = {0L};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.knb.services.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b62d666d349c0065b67f5ab6acfcb95d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b62d666d349c0065b67f5ab6acfcb95d");
            } else {
                com.sankuai.waimai.platform.b.A().a(0L);
            }
        }
        iJSHandlerDelegate.successCallback(null);
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public final void pay(com.dianping.titansmodel.apimodel.e eVar, IJSHandlerDelegate<Object> iJSHandlerDelegate) {
        Object[] objArr = {eVar, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a9f2e4f4725efa656e6894f7d2dae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a9f2e4f4725efa656e6894f7d2dae6");
        } else {
            ((BaseJsHandler) iJSHandlerDelegate).jsCallbackErrorMsg("ERR_NOT_IMPLEMENTED");
        }
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public final void share(com.dianping.titansmodel.apimodel.f fVar, IJSHandlerDelegate<com.dianping.titansmodel.h> iJSHandlerDelegate) {
        com.sankuai.waimai.business.knb.webview.b bVar;
        int i;
        Object[] objArr = {fVar, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be9e8d8c13db7ff5575a1964f88fbab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be9e8d8c13db7ff5575a1964f88fbab3");
        } else if (fVar == null || iJSHandlerDelegate.getContext() == null) {
        } else {
            Object[] objArr2 = {fVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e742b7804ea226b0cc5484202f2817a7", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (com.sankuai.waimai.business.knb.webview.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e742b7804ea226b0cc5484202f2817a7");
            } else {
                bVar = new com.sankuai.waimai.business.knb.webview.b();
                bVar.b = fVar.g;
                bVar.c = fVar.f;
                bVar.d = fVar.c;
                bVar.e = fVar.d;
                int i2 = fVar.b;
                Object[] objArr3 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.knb.util.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5e04e212b5cd0a247f72d25502446e37", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5e04e212b5cd0a247f72d25502446e37")).intValue();
                } else {
                    int i3 = (i2 & 128) > 0 ? 128 : 0;
                    if ((i2 & 512) > 0) {
                        i3 |= 512;
                    }
                    if ((i2 & 2) > 0) {
                        i3 |= 2;
                    }
                    i = (i2 & 256) > 0 ? i3 | 256 : i3;
                }
                bVar.f = i;
                bVar.i = fVar.j;
                bVar.j = fVar.k;
                bVar.k = fVar.l;
                bVar.l = fVar.m;
            }
            com.sankuai.waimai.business.knb.util.a.a(bVar, iJSHandlerDelegate.getJsHost().getUrl());
            Activity activity = iJSHandlerDelegate.getJsHost().getActivity();
            if (activity instanceof FragmentActivity) {
                final WeakReference weakReference = new WeakReference(iJSHandlerDelegate);
                com.sankuai.waimai.business.knb.util.a.a(activity, null, new d() { // from class: com.sankuai.waimai.business.knb.h.7
                    public static ChangeQuickRedirect b;

                    @Override // com.sankuai.waimai.business.knb.d
                    public final void b(int i4, int i5) {
                        Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(i5)};
                        ChangeQuickRedirect changeQuickRedirect4 = b;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "834d77a0c19d5ed460e7b52c73c2873c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "834d77a0c19d5ed460e7b52c73c2873c");
                            return;
                        }
                        IJSHandlerDelegate iJSHandlerDelegate2 = (IJSHandlerDelegate) weakReference.get();
                        if (iJSHandlerDelegate2 == null) {
                            return;
                        }
                        com.dianping.titansmodel.h hVar = new com.dianping.titansmodel.h();
                        hVar.b = i4;
                        switch (i5) {
                            case 1:
                                iJSHandlerDelegate2.successCallback(hVar);
                                return;
                            case 2:
                                hVar.errorCode = -300;
                                hVar.errorMsg = "FAILED";
                                iJSHandlerDelegate2.failCallback(hVar);
                                return;
                            case 3:
                                hVar.errorCode = -300;
                                hVar.errorMsg = "CANCEL";
                                iJSHandlerDelegate2.failCallback(hVar);
                                return;
                            default:
                                hVar.errorCode = -500;
                                hVar.errorMsg = "NONE";
                                iJSHandlerDelegate2.failCallback(hVar);
                                return;
                        }
                    }
                });
            }
        }
    }

    @Override // com.dianping.titansadapter.AbstractJSBPerformer, com.dianping.titansadapter.IJSBPerformer
    public final void shareImage(JSONObject jSONObject, final IJSHandlerDelegate<com.dianping.titansmodel.h> iJSHandlerDelegate) {
        int i;
        String str;
        Object[] objArr = {jSONObject, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "326bdea2475b062ccbf636dee78ec8a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "326bdea2475b062ccbf636dee78ec8a2");
            return;
        }
        int optInt = jSONObject.optInt("channel", 0);
        final String optString = jSONObject.optString("image", "");
        String optString2 = jSONObject.optString("thumbPic", "");
        int optInt2 = jSONObject.optInt("picQuality", 80);
        Object[] objArr2 = {Integer.valueOf(optInt), optString, Integer.valueOf(optInt2), optString2, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e28cc2c411407fe69bf68d2cf1d3475", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e28cc2c411407fe69bf68d2cf1d3475");
            return;
        }
        final WeixinBean weixinBean = new WeixinBean();
        if (optInt == 0 || optInt == 1) {
            weixinBean.setType(optInt);
            if (aa.a(optString2)) {
                optString2 = optString;
            }
            if (aa.a(optString) || aa.a(optString2)) {
                Object[] objArr3 = {iJSHandlerDelegate};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "420ac87978b2dca5837260176dd898ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "420ac87978b2dca5837260176dd898ce");
                    return;
                } else {
                    a(ImageTitleHelper.ERR_IMG_OBTAIN, "require parameters", iJSHandlerDelegate);
                    return;
                }
            }
            JsHost jsHost = iJSHandlerDelegate.getJsHost();
            if (jsHost == null || !jsHost.isActivated()) {
                Object[] objArr4 = {iJSHandlerDelegate};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "27d20b79be608e4a8170b9126a43dab2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "27d20b79be608e4a8170b9126a43dab2");
                    return;
                } else {
                    a(-500, "no host", iJSHandlerDelegate);
                    return;
                }
            } else if (!new com.sankuai.waimai.kit.share.b(jsHost.getActivity()).a()) {
                Object[] objArr5 = {iJSHandlerDelegate};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7fe92ae1abd434af990e60df7b7b4f49", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7fe92ae1abd434af990e60df7b7b4f49");
                    return;
                } else {
                    a(-502, "can not find share channel,you should install channel app first", iJSHandlerDelegate);
                    return;
                }
            } else {
                final b bVar = new b();
                final Activity activity = jsHost.getActivity();
                if (a(optString2)) {
                    final String sceneToken = ((BaseJsHandler) iJSHandlerDelegate).getSceneToken();
                    str = optString;
                    i = optInt2;
                    TitansPermissionUtil.checkSelfPermission(iJSHandlerDelegate.getJsHost().getActivity(), PermissionGuard.PERMISSION_STORAGE_READ, sceneToken, new IRequestPermissionCallback() { // from class: com.sankuai.waimai.business.knb.h.8
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.titans.result.IRequestPermissionCallback
                        public final void onResult(boolean z, int i2) {
                            Object[] objArr6 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9d6934d1625e96f1c12737b2662a7065", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9d6934d1625e96f1c12737b2662a7065");
                            } else if (z) {
                                File file = LocalIdUtils.getFile(optString, sceneToken);
                                if (file == null) {
                                    file = new File(optString);
                                }
                                if (!file.exists()) {
                                    h.this.a(iJSHandlerDelegate);
                                    return;
                                }
                                Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(file.getAbsolutePath());
                                Bitmap a3 = com.sankuai.waimai.kit.share.util.a.a(a2, 32768.0d);
                                bVar.a = com.sankuai.waimai.kit.share.util.a.a(a3);
                                a2.recycle();
                                a3.recycle();
                                h.a(h.this, activity, weixinBean, bVar, iJSHandlerDelegate);
                            } else {
                                h hVar = h.this;
                                hVar.a(i2, "no permission for Storage.read，sceneToken:" + sceneToken, iJSHandlerDelegate);
                            }
                        }
                    });
                } else {
                    i = optInt2;
                    str = optString;
                    b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
                    c2.b = activity;
                    c2.c = optString2;
                    c2.a(new b.a() { // from class: com.sankuai.waimai.business.knb.h.9
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr6 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3add38f4303b2fe27f6d6fc46eac6208", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3add38f4303b2fe27f6d6fc46eac6208");
                                return;
                            }
                            bVar.a = com.sankuai.waimai.kit.share.util.a.a(com.sankuai.waimai.kit.share.util.a.a(bitmap, 32768.0d));
                            h.a(h.this, activity, weixinBean, bVar, iJSHandlerDelegate);
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f0e502e1e676f6b20616101fc44d5fce", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f0e502e1e676f6b20616101fc44d5fce");
                            } else {
                                h.this.a(iJSHandlerDelegate);
                            }
                        }
                    }, 1);
                }
                final String str2 = str;
                if (a(str2)) {
                    final String sceneToken2 = ((BaseJsHandler) iJSHandlerDelegate).getSceneToken();
                    TitansPermissionUtil.checkSelfPermission(iJSHandlerDelegate.getJsHost().getActivity(), PermissionGuard.PERMISSION_STORAGE_READ, sceneToken2, new IRequestPermissionCallback() { // from class: com.sankuai.waimai.business.knb.h.10
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.titans.result.IRequestPermissionCallback
                        public final void onResult(boolean z, int i2) {
                            Object[] objArr6 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a01598f48d95a3f621664860de80f6e1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a01598f48d95a3f621664860de80f6e1");
                            } else if (z) {
                                File file = LocalIdUtils.getFile(str2, sceneToken2);
                                if (file == null) {
                                    file = new File(str2);
                                }
                                if (!file.exists()) {
                                    h.this.a(iJSHandlerDelegate);
                                    return;
                                }
                                bVar.c = h.a(h.this, activity, file);
                                h.a(h.this, activity, weixinBean, bVar, iJSHandlerDelegate);
                            } else {
                                h hVar = h.this;
                                hVar.a(i2, "no permission for Storage.read，sceneToken:" + sceneToken2, iJSHandlerDelegate);
                            }
                        }
                    });
                    return;
                }
                b.C0608b c3 = com.sankuai.meituan.mtimageloader.loader.a.c();
                c3.b = activity;
                c3.c = optString2;
                c3.f = i;
                c3.a(new b.a() { // from class: com.sankuai.waimai.business.knb.h.11
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr6 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "582da723ce25d69f6a5ff4260a6a910c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "582da723ce25d69f6a5ff4260a6a910c");
                            return;
                        }
                        bVar.b = com.sankuai.waimai.kit.share.util.a.a(com.sankuai.waimai.kit.share.util.a.a(bitmap, 1.048576E7d));
                        h.a(h.this, activity, weixinBean, bVar, iJSHandlerDelegate);
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "58802c1d2931ac007c80473abf320062", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "58802c1d2931ac007c80473abf320062");
                        } else {
                            h.this.a(iJSHandlerDelegate);
                        }
                    }
                }, 1);
                return;
            }
        }
        a(iJSHandlerDelegate);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public byte[] a;
        public byte[] b;
        public String c;

        public b() {
        }
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7cae1d48f36dbcbcaa88d7137477c36", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7cae1d48f36dbcbcaa88d7137477c36")).booleanValue() : (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IJSHandlerDelegate<com.dianping.titansmodel.h> iJSHandlerDelegate) {
        Object[] objArr = {iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9940ac8de88c53d91903d77fdcd9d179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9940ac8de88c53d91903d77fdcd9d179");
        } else {
            a(-401, "pamameter error", iJSHandlerDelegate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, IJSHandlerDelegate<com.dianping.titansmodel.h> iJSHandlerDelegate) {
        Object[] objArr = {Integer.valueOf(i), str, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d253e3bcf9f63eb968443e85853961b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d253e3bcf9f63eb968443e85853961b");
            return;
        }
        com.dianping.titansmodel.h hVar = new com.dianping.titansmodel.h();
        hVar.errorCode = i;
        hVar.errorMsg = str;
        iJSHandlerDelegate.failCallback(hVar);
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public final void uploadPhoto(com.dianping.titansmodel.apimodel.g gVar, IJSHandlerDelegate<i> iJSHandlerDelegate) {
        List list;
        Object[] objArr = {gVar, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccbbde821abbe2e14c5dcf20a571a6dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccbbde821abbe2e14c5dcf20a571a6dd");
            return;
        }
        i iVar = new i();
        iVar.b = new com.dianping.titansmodel.f[0];
        if (gVar == null || TextUtils.isEmpty(gVar.b)) {
            iVar.errorMsg = "data is null or localIds is empty.";
            iJSHandlerDelegate.failCallback(iVar);
            return;
        }
        try {
            list = (List) new Gson().fromJson(gVar.b, new TypeToken<List<String>>() { // from class: com.sankuai.waimai.business.knb.h.1
            }.getType());
        } catch (Exception unused) {
            list = null;
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            iVar.errorMsg = "localIds is empty.";
            iJSHandlerDelegate.failCallback(iVar);
        } else if (Privacy.createPermissionGuard().a(com.meituan.android.singleton.b.a, PermissionGuard.PERMISSION_STORAGE_READ, ((BaseJsHandler) iJSHandlerDelegate).getSceneToken()) <= 0) {
            iVar.errorMsg = "read external storage permission denied.";
            iJSHandlerDelegate.failCallback(iVar);
            ae.a(com.meituan.android.singleton.b.a, (int) R.string.wm_knb_no_sd_card_permission);
        } else {
            User a2 = com.sankuai.waimai.business.knb.util.b.a(iJSHandlerDelegate.getContext());
            if (a2 == null) {
                ae.a(com.meituan.android.singleton.b.a, (int) R.string.wm_knb_login_first_before_upload);
                iVar.errorMsg = "unlogined.";
                iJSHandlerDelegate.failCallback(iVar);
                return;
            }
            com.sankuai.waimai.launcher.util.aop.b.a(new com.sankuai.waimai.business.knb.task.a(com.meituan.android.singleton.b.a, a2.token, list2, (JsHandler) iJSHandlerDelegate, iVar, iJSHandlerDelegate), new com.dianping.titansmodel.apimodel.g[0]);
        }
    }

    @Override // com.dianping.titansadapter.AbstractJSBPerformer, com.dianping.titansadapter.IJSBPerformer
    public final void onPerform(int i, JSONObject jSONObject, IJSHandlerDelegate<JsBridgeResult> iJSHandlerDelegate) {
        Object[] objArr = {Integer.valueOf(i), jSONObject, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6949ebf0c6f71fb129b4d311114d0ff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6949ebf0c6f71fb129b4d311114d0ff5");
        } else if (i != 6) {
        } else {
            String optString = jSONObject.optString(JsBridgeResult.ARG_KEY_SHARE_MINI_PROGRAM_ID, null);
            if (optString == null) {
                JsBridgeResult jsBridgeResult = new JsBridgeResult();
                jsBridgeResult.errorCode = ImageTitleHelper.ERR_IMG_OBTAIN;
                jsBridgeResult.errorMsg = "missing id";
                iJSHandlerDelegate.failCallback(jsBridgeResult);
                return;
            }
            String optString2 = jSONObject.optString("path", null);
            if (optString2 == null) {
                JsBridgeResult jsBridgeResult2 = new JsBridgeResult();
                jsBridgeResult2.errorCode = ImageTitleHelper.ERR_IMG_OBTAIN;
                jsBridgeResult2.errorMsg = "missing path";
                iJSHandlerDelegate.failCallback(jsBridgeResult2);
                return;
            }
            String optString3 = jSONObject.optString("title", null);
            if (optString3 == null) {
                JsBridgeResult jsBridgeResult3 = new JsBridgeResult();
                jsBridgeResult3.errorCode = ImageTitleHelper.ERR_IMG_OBTAIN;
                jsBridgeResult3.errorMsg = "missing title";
                iJSHandlerDelegate.failCallback(jsBridgeResult3);
                return;
            }
            String optString4 = jSONObject.optString("image", null);
            if (optString4 == null) {
                JsBridgeResult jsBridgeResult4 = new JsBridgeResult();
                jsBridgeResult4.errorCode = ImageTitleHelper.ERR_IMG_OBTAIN;
                jsBridgeResult4.errorMsg = "missing imageUrl";
                iJSHandlerDelegate.failCallback(jsBridgeResult4);
                return;
            }
            String optString5 = jSONObject.optString("url", null);
            if (optString5 == null) {
                JsBridgeResult jsBridgeResult5 = new JsBridgeResult();
                jsBridgeResult5.errorCode = ImageTitleHelper.ERR_IMG_OBTAIN;
                jsBridgeResult5.errorMsg = "missing url";
                iJSHandlerDelegate.failCallback(jsBridgeResult5);
                return;
            }
            String optString6 = jSONObject.optString("content", "");
            JsHost jsHost = iJSHandlerDelegate.getJsHost();
            if (jsHost == null) {
                JsBridgeResult jsBridgeResult6 = new JsBridgeResult();
                jsBridgeResult6.errorCode = -500;
                jsBridgeResult6.errorMsg = "no host";
                iJSHandlerDelegate.failCallback(jsBridgeResult6);
                return;
            }
            com.sankuai.waimai.kit.share.b bVar = new com.sankuai.waimai.kit.share.b(jsHost.getActivity());
            if (!bVar.a()) {
                JsBridgeResult jsBridgeResult7 = new JsBridgeResult();
                jsBridgeResult7.errorCode = -502;
                jsBridgeResult7.errorMsg = "can not find share channel,you should install channel app first";
                iJSHandlerDelegate.failCallback(jsBridgeResult7);
                return;
            }
            int optInt = jSONObject.optInt("type", 0);
            WeixinBean weixinBean = new WeixinBean();
            weixinBean.setType(0);
            Object[] objArr2 = {weixinBean, optString4};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ff0e336acb262e40fe307292cf278c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ff0e336acb262e40fe307292cf278c0");
            } else {
                weixinBean.setMiniProgramLocalImage(false);
                if (LocalIdUtils.isValid(optString4)) {
                    Uri parse = Uri.parse(optString4);
                    if (parse.isHierarchical()) {
                        String queryParameter = parse.getQueryParameter("url");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            weixinBean.setImagePath(queryParameter);
                            weixinBean.setMiniProgramLocalImage(true);
                        }
                    }
                }
                weixinBean.setImgUrl(optString4);
            }
            weixinBean.setTitle(optString3);
            weixinBean.setUrl(optString5);
            if (optString6 == null) {
                optString6 = "";
            }
            weixinBean.setContent(optString6);
            weixinBean.setMiniProgramId(optString);
            weixinBean.setMiniProgramPath(optString2);
            weixinBean.setMiniprogramType(optInt);
            final WeakReference weakReference = new WeakReference(iJSHandlerDelegate);
            bVar.a(weixinBean, new com.sankuai.waimai.kit.share.listener.b() { // from class: com.sankuai.waimai.business.knb.h.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.kit.share.listener.b
                public final void a(ShareBean shareBean, b.a aVar) {
                    Object[] objArr3 = {shareBean, aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a2ee4c2e3fcc9006403f93f80805add6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a2ee4c2e3fcc9006403f93f80805add6");
                        return;
                    }
                    IJSHandlerDelegate iJSHandlerDelegate2 = (IJSHandlerDelegate) weakReference.get();
                    if (iJSHandlerDelegate2 == null) {
                        return;
                    }
                    JsBridgeResult jsBridgeResult8 = new JsBridgeResult();
                    switch (AnonymousClass3.b[aVar.ordinal()]) {
                        case 1:
                            iJSHandlerDelegate2.successCallback(jsBridgeResult8);
                            return;
                        case 2:
                            jsBridgeResult8.errorCode = -300;
                            jsBridgeResult8.errorMsg = "CANCEL";
                            iJSHandlerDelegate2.failCallback(jsBridgeResult8);
                            return;
                        case 3:
                            jsBridgeResult8.errorCode = -300;
                            jsBridgeResult8.errorMsg = "FAILED";
                            iJSHandlerDelegate2.failCallback(jsBridgeResult8);
                            return;
                        default:
                            jsBridgeResult8.errorCode = -500;
                            jsBridgeResult8.errorMsg = "NONE";
                            iJSHandlerDelegate2.failCallback(jsBridgeResult8);
                            return;
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.knb.h$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] b = new int[b.a.valuesCustom().length];

        static {
            try {
                b[b.a.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.a.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.a.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.a.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = new int[UserCenter.d.valuesCustom().length];
            try {
                a[UserCenter.d.login.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[UserCenter.d.cancel.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[UserCenter.d.logout.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements com.sankuai.waimai.kit.share.listener.b {
        public static ChangeQuickRedirect a;
        public WeakReference<IJSHandlerDelegate<com.dianping.titansmodel.h>> b;

        public c(IJSHandlerDelegate<com.dianping.titansmodel.h> iJSHandlerDelegate) {
            Object[] objArr = {iJSHandlerDelegate};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41f457752f511e3b7f0e1e4903f603dd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f457752f511e3b7f0e1e4903f603dd");
            } else {
                this.b = new WeakReference<>(iJSHandlerDelegate);
            }
        }

        @Override // com.sankuai.waimai.kit.share.listener.b
        public final void a(ShareBean shareBean, b.a aVar) {
            Object[] objArr = {shareBean, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69e3e2de979b18e264c1e6edbdb77a36", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69e3e2de979b18e264c1e6edbdb77a36");
                return;
            }
            IJSHandlerDelegate<com.dianping.titansmodel.h> iJSHandlerDelegate = this.b.get();
            if (iJSHandlerDelegate != null) {
                com.dianping.titansmodel.h hVar = new com.dianping.titansmodel.h();
                if (aVar == b.a.COMPLETE) {
                    if (shareBean.getChannel() == 2) {
                        hVar.b = 0;
                    } else {
                        hVar.b = 1;
                    }
                    iJSHandlerDelegate.successCallback(hVar);
                } else if (aVar == b.a.CANCEL) {
                    hVar.errorCode = -300;
                    hVar.errorMsg = "unshare";
                    iJSHandlerDelegate.failCallback(hVar);
                } else {
                    hVar.errorCode = -1;
                    hVar.errorMsg = "internal error";
                    iJSHandlerDelegate.failCallback(hVar);
                }
            }
        }
    }
}
