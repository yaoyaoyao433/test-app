package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.addrsdk.constants.AddressType;
import com.sankuai.waimai.addrsdk.manager.AddressApiManager;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressListResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse;
import com.sankuai.waimai.addrsdk.mvp.bean.CityListBean;
import com.sankuai.waimai.addrsdk.mvp.bean.CitySearchListBean;
import com.sankuai.waimai.addrsdk.mvp.model.d;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.reactnative.model.AddressBackInfo;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class WMAddrSdkModule extends ReactContextBaseJavaModule {
    private static final String DP_SCHEMA = "dianping:/";
    private static final String EVENT_ERROR = "paramsErrorEvent";
    private static final String EVENT_SUCCESS = "showEditAddrEvent";
    private static final String FROM_ADDRESS_LIST = "address_list";
    private static final String FROM_MANUAL_SELECT_ADDRESS = "manual_select_address";
    private static final String FROM_MODIFY_ADDRESS = "modify_address";
    private static final String FROM_ORDER_CONFIRM = "order_confirm";
    private static final String KEY_ADDRESS_BEAN = "addressBean";
    private static final String KEY_API_EXTRA = "apiExtra";
    private static final String KEY_CITY_LIST_DATA = "city_list_data";
    private static final String KEY_CURRENT_LOCATION = "current_location_city";
    private static final String KEY_CUSTOME_CITY = "customer_city";
    private static final String KEY_FROM = "from";
    private static final String KEY_REQUEST_CODE = "requestCode";
    private static final String MT_SCHEMA = "imeituan://www.meituan.com";
    private static final String RESULT_KEY_ADDRESS_BEAN = "addressBean";
    private static final String RESULT_KEY_DEL_ADDRESS_ID = "delAddrressId";
    private static final String RESULT_KEY_TYPE = "type";
    private static final int TYPE_SAVE_OUT_RANGE_ADDRESS = 4;
    private static final int TYPE_TYPE_ADD = 1;
    private static final int TYPE_TYPE_CANCEL = 0;
    private static final int TYPE_TYPE_DELETE = 3;
    private static final int TYPE_TYPE_EDIT = 2;
    private static final String WM_SCHEMA = "meituanwaimai://waimai.meituan.com";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mFrom;
    private int mRequestCode;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMAddrSDK";
    }

    public WMAddrSdkModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "559cc92c9f40fe0e62c2d8550c5adc3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "559cc92c9f40fe0e62c2d8550c5adc3b");
            return;
        }
        this.mRequestCode = 0;
        reactApplicationContext.addActivityEventListener(new ActivityEventListener() { // from class: com.sankuai.waimai.reactnative.modules.WMAddrSdkModule.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.bridge.ActivityEventListener
            public final void onNewIntent(Intent intent) {
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                Object[] objArr2 = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "40d215ae5e752901c34f96cfe1464df7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "40d215ae5e752901c34f96cfe1464df7");
                } else if (WMAddrSdkModule.FROM_ADDRESS_LIST.equalsIgnoreCase(WMAddrSdkModule.this.mFrom)) {
                    WMAddrSdkModule.this.processAddressList(i, intent);
                } else {
                    WMAddrSdkModule.this.processOnActivityResult(i, intent);
                }
            }
        });
    }

    @ReactMethod
    public void getAddrList(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67f02fdf746b5132f3a391ad09ee7365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67f02fdf746b5132f3a391ad09ee7365");
            return;
        }
        if (str == null) {
            str = "";
        }
        com.sankuai.waimai.addrsdk.a.a(com.sankuai.waimai.reactnative.constants.a.a);
        try {
            fetchAddressList(str, promise);
        } catch (Throwable th) {
            promise.reject(th);
        }
    }

    private void fetchAddressList(String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90e476100856229b422bf226ba1e764c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90e476100856229b422bf226ba1e764c");
        } else {
            AddressApiManager.getInstance().getAddressList(AddressType.LBS_TYPE, str, new d<BaseResponse<AddressListResponse>, String>() { // from class: com.sankuai.waimai.reactnative.modules.WMAddrSdkModule.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.addrsdk.mvp.model.d
                public final /* synthetic */ void a(String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eab8114fdfc8ad16f54a629cb6a8afe1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eab8114fdfc8ad16f54a629cb6a8afe1");
                    } else {
                        promise.reject("response_error", str3);
                    }
                }

                @Override // com.sankuai.waimai.addrsdk.mvp.model.d
                public final /* synthetic */ void b(BaseResponse<AddressListResponse> baseResponse) {
                    BaseResponse<AddressListResponse> baseResponse2 = baseResponse;
                    Object[] objArr2 = {baseResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "91967d3f3de0682d22965090f411bee1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "91967d3f3de0682d22965090f411bee1");
                    } else if (baseResponse2 == null) {
                        promise.reject("response_error", "response is null");
                    } else {
                        try {
                            String json = com.sankuai.waimai.addrsdk.utils.c.a().toJson(baseResponse2);
                            if (TextUtils.isEmpty(json)) {
                                promise.reject("response_error", "result is empty");
                            } else {
                                promise.resolve(json);
                            }
                            com.sankuai.waimai.platform.domain.manager.location.a.a(com.sankuai.waimai.platform.domain.manager.location.a.a(baseResponse2.getData()));
                        } catch (Throwable th) {
                            promise.reject(th);
                        }
                    }
                }
            });
        }
    }

    @ReactMethod
    public void showEditAddr(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f8897c640ee1740b59561512dc024ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f8897c640ee1740b59561512dc024ef");
            return;
        }
        com.sankuai.waimai.addrsdk.a.a(com.sankuai.waimai.reactnative.constants.a.a);
        try {
            this.mRequestCode = readableMap.hasKey("requestCode") ? readableMap.getInt("requestCode") : 10001;
            this.mFrom = readableMap.hasKey("from") ? readableMap.getString("from") : "";
            String string = readableMap.hasKey(KEY_API_EXTRA) ? readableMap.getString(KEY_API_EXTRA) : "";
            String string2 = readableMap.hasKey("addressBean") ? readableMap.getString("addressBean") : "";
            if (!TextUtils.isEmpty(string2)) {
                com.sankuai.waimai.addrsdk.utils.c.a().fromJson(string2, AddressBean.class);
            }
            Bundle bundle = new Bundle();
            String str = WM_SCHEMA;
            if (com.sankuai.waimai.foundation.core.a.e()) {
                str = MT_SCHEMA;
            } else if (com.sankuai.waimai.foundation.core.a.f()) {
                str = DP_SCHEMA;
            }
            com.sankuai.waimai.foundation.router.a.a(getCurrentActivity(), com.sankuai.waimai.addrsdk.manager.a.a().a("index", FROM_MODIFY_ADDRESS, str, string, string2, AddressScene.DEFAULT_SCENE.getValue(), AddressType.LBS_TYPE.getValue(), com.sankuai.waimai.addrsdk.utils.c.a().toJson(com.sankuai.waimai.platform.domain.manager.location.a.a()), this.mRequestCode, com.sankuai.waimai.platform.capacity.abtest.b.c(getCurrentActivity())), bundle, this.mRequestCode);
        } catch (Throwable th) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("code", "params_error");
            createMap.putString("msg", th.getMessage());
            sendEvent(EVENT_ERROR, createMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAddressList(int i, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bd7f13b8747560b3b7b9d9ad8489add", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bd7f13b8747560b3b7b9d9ad8489add");
        } else if (i != this.mRequestCode || intent == null) {
        } else {
            int a = f.a(intent, "waimai_addrsdk_address_operate_type", 0);
            WritableMap createMap = Arguments.createMap();
            if (a == 203) {
                boolean a2 = f.a(intent, "waimai_addrsdk_force_save", false);
                AddressBean addressBean = (AddressBean) f.c(intent, "waimai_addrsdk_address");
                if (a2) {
                    com.sankuai.waimai.platform.domain.manager.location.a.b(com.meituan.android.singleton.b.a);
                    com.sankuai.waimai.platform.domain.manager.location.a.c();
                } else {
                    com.sankuai.waimai.platform.domain.manager.location.a.a(com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean));
                }
                createMap.putInt("type", 2);
                createMap.putString("addressBean", com.sankuai.waimai.addrsdk.utils.c.a().toJson(addressBean));
            } else if (a == 202) {
                AddressBean addressBean2 = (AddressBean) f.c(intent, "waimai_addrsdk_address");
                com.sankuai.waimai.platform.domain.manager.location.a.b(com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean2));
                com.sankuai.waimai.platform.domain.manager.location.a.b(com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean2));
                createMap.putInt("type", 1);
                createMap.putString("addressBean", com.sankuai.waimai.addrsdk.utils.c.a().toJson(addressBean2));
            } else if (a == 201) {
                String a3 = f.a(intent, "waimai_addrsdk_del_address_id", "");
                AddressItem a4 = com.sankuai.waimai.platform.domain.manager.location.a.a(com.meituan.android.singleton.b.a);
                if (a4 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a4.id);
                    if (a3.equals(sb.toString())) {
                        com.sankuai.waimai.platform.domain.manager.location.a.b(com.meituan.android.singleton.b.a);
                        com.sankuai.waimai.platform.domain.manager.location.a.c();
                    }
                }
                createMap.putInt("type", 3);
                createMap.putString(RESULT_KEY_DEL_ADDRESS_ID, a3);
            } else {
                createMap.putInt("type", 0);
            }
            sendEvent(EVENT_SUCCESS, createMap);
        }
    }

    private void processAddressFromMMp(Intent intent) {
        AddressBean addressBean;
        boolean z;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c749c609faba668592aeab22539a255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c749c609faba668592aeab22539a255");
            return;
        }
        int i = -1;
        try {
            AddressBackInfo addressBackInfo = (AddressBackInfo) com.sankuai.waimai.addrsdk.utils.c.a().fromJson(f.a(intent, "resultData"), (Class<Object>) AddressBackInfo.class);
            if (addressBackInfo != null) {
                i = addressBackInfo.addressOperateType;
                z = addressBackInfo.forceSave;
                addressBean = addressBackInfo.address;
            } else {
                addressBean = null;
                z = false;
            }
            WritableMap createMap = Arguments.createMap();
            if (i == 203) {
                if (z) {
                    com.sankuai.waimai.platform.domain.manager.location.a.b(com.meituan.android.singleton.b.a);
                    com.sankuai.waimai.platform.domain.manager.location.a.c();
                } else {
                    com.sankuai.waimai.platform.domain.manager.location.a.a(com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean));
                }
                createMap.putInt("type", 2);
                createMap.putString("addressBean", com.sankuai.waimai.addrsdk.utils.c.a().toJson(addressBean));
            } else if (i == 202) {
                com.sankuai.waimai.platform.domain.manager.location.a.b(com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean));
                com.sankuai.waimai.platform.domain.manager.location.a.b(com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean));
                createMap.putInt("type", 1);
                createMap.putString("addressBean", com.sankuai.waimai.addrsdk.utils.c.a().toJson(addressBean));
            } else if (i == 201) {
                String str = addressBean != null ? addressBean.addressViewId : "";
                AddressItem a = com.sankuai.waimai.platform.domain.manager.location.a.a(com.meituan.android.singleton.b.a);
                if (a != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a.id);
                    if (str.equals(sb.toString())) {
                        com.sankuai.waimai.platform.domain.manager.location.a.b(com.meituan.android.singleton.b.a);
                        com.sankuai.waimai.platform.domain.manager.location.a.c();
                    }
                }
                createMap.putInt("type", 3);
                createMap.putString(RESULT_KEY_DEL_ADDRESS_ID, str);
            } else {
                createMap.putInt("type", 0);
            }
            sendEvent(EVENT_SUCCESS, createMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processOnActivityResult(int i, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecd817e6723754c05a05e5c51cd5259c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecd817e6723754c05a05e5c51cd5259c");
        } else if (i != this.mRequestCode || intent == null) {
        } else {
            int a = f.a(intent, "waimai_addrsdk_address_operate_type", 0);
            String a2 = f.a(intent, "resultData");
            String a3 = f.a(intent, "appId");
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && "be7dcad4cf774fed".equals(a3)) {
                processAddressFromMMp(intent);
                return;
            }
            WritableMap createMap = Arguments.createMap();
            if (a == 203) {
                boolean a4 = f.a(intent, "waimai_addrsdk_force_save", false);
                AddressBean addressBean = (AddressBean) f.c(intent, "waimai_addrsdk_address");
                createMap.putInt("type", a4 ? 4 : 2);
                createMap.putString("addressBean", com.sankuai.waimai.addrsdk.utils.c.a().toJson(addressBean));
            } else if (a == 202) {
                createMap.putInt("type", 1);
                createMap.putString("addressBean", com.sankuai.waimai.addrsdk.utils.c.a().toJson((AddressBean) f.c(intent, "waimai_addrsdk_address")));
            } else if (a == 201) {
                String a5 = f.a(intent, "waimai_addrsdk_del_address_id", "");
                createMap.putInt("type", 3);
                createMap.putString(RESULT_KEY_DEL_ADDRESS_ID, a5);
            } else {
                createMap.putInt("type", 0);
            }
            sendEvent(EVENT_SUCCESS, createMap);
        }
    }

    private void sendEvent(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bbba44de8120b9aa3eccecf16d4c288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bbba44de8120b9aa3eccecf16d4c288");
        } else {
            new com.sankuai.waimai.reactnative.utils.c(getReactApplicationContext()).a(str, writableMap);
        }
    }

    @ReactMethod
    public void getCityList(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6efa13dd7a1954f4502d970b34416d7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6efa13dd7a1954f4502d970b34416d7a");
            return;
        }
        try {
            fetchCityList(promise);
        } catch (Throwable th) {
            promise.reject(th);
        }
    }

    private void fetchCityList(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "510fd09c8afbdf884d08ec35ab035fbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "510fd09c8afbdf884d08ec35ab035fbe");
            return;
        }
        final WritableMap createMap = Arguments.createMap();
        AddressApiManager.getInstance().cityList(new d<CityListBean, String>() { // from class: com.sankuai.waimai.reactnative.modules.WMAddrSdkModule.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.addrsdk.mvp.model.d
            public final /* synthetic */ void a(String str) {
                String str2 = str;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "32238aef605373b290b12bc778d601ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "32238aef605373b290b12bc778d601ea");
                } else {
                    promise.reject("response_error", str2);
                }
            }

            @Override // com.sankuai.waimai.addrsdk.mvp.model.d
            public final /* synthetic */ void b(CityListBean cityListBean) {
                CityListBean cityListBean2 = cityListBean;
                Object[] objArr2 = {cityListBean2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a5c0d91f7b2eda7f19ba17f771ecdf4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a5c0d91f7b2eda7f19ba17f771ecdf4c");
                } else if (cityListBean2 == null) {
                    promise.reject("response_error", "response is null");
                } else {
                    try {
                        String json = com.sankuai.waimai.addrsdk.utils.c.a().toJson(cityListBean2);
                        if (TextUtils.isEmpty(json)) {
                            promise.reject("response_error", "result is empty");
                            return;
                        }
                        com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
                        String v = b != null ? b.v() : "未定位";
                        String a2 = new com.sankuai.waimai.addrsdk.utils.f(com.meituan.android.singleton.b.a, "waimai_addrsdk").a("clicked_city");
                        createMap.putString(WMAddrSdkModule.KEY_CITY_LIST_DATA, json);
                        createMap.putString(WMAddrSdkModule.KEY_CURRENT_LOCATION, v);
                        createMap.putString(WMAddrSdkModule.KEY_CUSTOME_CITY, a2);
                        promise.resolve(createMap);
                    } catch (Throwable th) {
                        promise.reject(th);
                    }
                }
            }
        });
    }

    @ReactMethod
    public void getSearchResult(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1b0ee28dea4edc64219c208baa15a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1b0ee28dea4edc64219c208baa15a3e");
            return;
        }
        try {
            fetchSearchRequest(str, promise);
        } catch (Throwable th) {
            promise.reject(th);
        }
    }

    private void fetchSearchRequest(String str, final Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec0858ca4cb33c1911d6af07b6382f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec0858ca4cb33c1911d6af07b6382f7");
        } else {
            AddressApiManager.getInstance().citySearch(str, new d<CitySearchListBean, String>() { // from class: com.sankuai.waimai.reactnative.modules.WMAddrSdkModule.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.addrsdk.mvp.model.d
                public final /* synthetic */ void a(String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c0a82170dee13ca405722f4710f6721b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c0a82170dee13ca405722f4710f6721b");
                    } else {
                        promise.reject("response_error", str3);
                    }
                }

                @Override // com.sankuai.waimai.addrsdk.mvp.model.d
                public final /* synthetic */ void b(CitySearchListBean citySearchListBean) {
                    CitySearchListBean citySearchListBean2 = citySearchListBean;
                    Object[] objArr2 = {citySearchListBean2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8818f4bbb65fdc5fe62b942909af5e98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8818f4bbb65fdc5fe62b942909af5e98");
                    } else if (citySearchListBean2 == null) {
                        promise.reject("response_error", "response is null");
                    } else {
                        try {
                            String json = com.sankuai.waimai.addrsdk.utils.c.a().toJson(citySearchListBean2);
                            if (TextUtils.isEmpty(json)) {
                                promise.reject("response_error", "result is empty");
                            } else {
                                promise.resolve(json);
                            }
                        } catch (Throwable th) {
                            promise.reject(th);
                        }
                    }
                }
            });
        }
    }

    @ReactMethod
    public void removeCustomerCities(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b20ec26e78190b4ed751ae186d76942c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b20ec26e78190b4ed751ae186d76942c");
            return;
        }
        new com.sankuai.waimai.addrsdk.utils.f(com.meituan.android.singleton.b.a, "waimai_addrsdk").a("clicked_city", "");
        new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMAddrSdkModule.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc07dc7b862f7ca3e910f76b21d26765", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc07dc7b862f7ca3e910f76b21d26765");
                } else {
                    promise.resolve("");
                }
            }
        }, 300L);
    }
}
