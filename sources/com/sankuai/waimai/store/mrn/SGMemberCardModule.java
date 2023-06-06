package com.sankuai.waimai.store.mrn;

import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.YodaConfirm;
import com.meituan.android.yoda.YodaResponseListener;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMemberCardModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ReactApplicationContext mContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNMemberCard";
    }

    public SGMemberCardModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3fdfdfc04c3ce1a2cefe69af8c4b14a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3fdfdfc04c3ce1a2cefe69af8c4b14a");
        } else {
            this.mContext = reactApplicationContext;
        }
    }

    @ReactMethod
    public void startYodaVerify(final String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51f1c0748cdf26e109a063a68598d142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51f1c0748cdf26e109a063a68598d142");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGMemberCardModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "af0d51e7b8edaa2ffe3f44174858ae1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "af0d51e7b8edaa2ffe3f44174858ae1e");
                        return;
                    }
                    try {
                        FragmentActivity fragmentActivity = (FragmentActivity) com.sankuai.waimai.foundation.utils.activity.a.a().c();
                        if (fragmentActivity == null || fragmentActivity.isFinishing()) {
                            return;
                        }
                        YodaConfirm yodaConfirm = YodaConfirm.getInstance(fragmentActivity, new YodaResponseListener() { // from class: com.sankuai.waimai.store.mrn.SGMemberCardModule.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.yoda.YodaResponseListener
                            public final void onCancel(String str2) {
                            }

                            @Override // com.meituan.android.yoda.YodaResponseListener
                            public final void onYodaResponse(String str2, String str3) {
                                Object[] objArr3 = {str2, str3};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d22a178081c4e45ee699d1716fe48ffe", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d22a178081c4e45ee699d1716fe48ffe");
                                    return;
                                }
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str2);
                                createMap.putString(OtherVerifyTypeConstants.RESPONSE_CODE_IDENTITY, str3);
                                promise.resolve(createMap);
                            }

                            @Override // com.meituan.android.yoda.YodaResponseListener
                            public final void onError(String str2, Error error) {
                                Object[] objArr3 = {str2, error};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "78fcb711e139afb4f768b70e7dbe879f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "78fcb711e139afb4f768b70e7dbe879f");
                                } else {
                                    promise.reject(str2, error.message);
                                }
                            }
                        });
                        com.meituan.android.yoda.d a2 = com.meituan.android.yoda.d.a();
                        a2.b = R.style.WmSgMyFlingVerifyTheme;
                        yodaConfirm.registerBusinessUIConfig(a2).startConfirm(str);
                    } catch (Exception e) {
                        d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void sendOpenCardSuccessMessage(final String str, final String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d061871c6147caa2d195dfb15f719690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d061871c6147caa2d195dfb15f719690");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGMemberCardModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "112eb17a284dc79a9bcc59e52ab30aeb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "112eb17a284dc79a9bcc59e52ab30aeb");
                        return;
                    }
                    try {
                        a a2 = b.a(str);
                        if (a2 == null) {
                            d.a(promise, new NullPointerException(String.format("poiId不合法：%s", str)));
                            return;
                        }
                        com.sankuai.waimai.store.event.a aVar = new com.sankuai.waimai.store.event.a(a2.b, a2.c);
                        aVar.c = r.a(str2, 0L);
                        com.meituan.android.bus.a.a().c(aVar);
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("brandId", str2);
                        createMap.putString("poiId", String.valueOf(a2.b));
                        createMap.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, a2.c);
                        ((DeviceEventManagerModule.RCTDeviceEventEmitter) SGMemberCardModule.this.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("OpenCardSuccessNotification", createMap);
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putInt("code", 0);
                        createMap2.putString("message", "success");
                        promise.resolve(createMap2);
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                        d.a(promise, e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void verifyCodeLength(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca88334ae76adfd0bf0b5112f11ac012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca88334ae76adfd0bf0b5112f11ac012");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", 0);
        createMap.putString("message", "success");
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("minCodeLen", j.h().c(SCConfigPath.BRAND_MEMBER_MIN_CODE_LEN));
        createMap2.putInt("maxCodeLen", j.h().c(SCConfigPath.BRAND_MEMBER_MAX_CODE_LEN));
        createMap.putMap("data", createMap2);
        promise.resolve(createMap);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1459d0f30bb68e378fb13061fd01de9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1459d0f30bb68e378fb13061fd01de9");
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("minCodeLen", j.h().c(SCConfigPath.BRAND_MEMBER_MIN_CODE_LEN));
        createMap.putInt("maxCodeLen", j.h().c(SCConfigPath.BRAND_MEMBER_MAX_CODE_LEN));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("codeLen", createMap);
        return createMap2.toHashMap();
    }
}
