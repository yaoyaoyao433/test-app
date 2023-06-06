package com.meituan.android.legwork.mrn.bridge;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.meituan.android.legwork.bean.PayBean;
import com.meituan.android.legwork.bean.TipSubmitBean;
import com.meituan.android.legwork.bean.orderDetail.ChangeOrderInfoSubmitBean;
import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.android.legwork.monitor.report.ReportService;
import com.meituan.android.legwork.mvp.contract.PayTypeContract;
import com.meituan.android.legwork.mvp.contract.b;
import com.meituan.android.legwork.mvp.presenter.c;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.ui.component.pickerview.a;
import com.meituan.android.legwork.utils.ab;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.r;
import com.meituan.android.legwork.utils.v;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.z;
import com.meituan.android.mrn.engine.u;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.annotation.Nonnull;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonBridgeModule extends ReactContextBaseJavaModule {
    public static final int JUMP_H5_DEFAULT_REQUEST_CODE = 1001;
    public static final int JUMP_NATIVE_DEFAULT_REQUEST_CODE = 1002;
    public static final int REQUEST_CODE_CHANGE_ORDER_PAY = 3;
    public static final int REQUEST_CODE_LIST_PAY = 1;
    public static final int REQUEST_CODE_LIST_TIP_PAY = 2;
    private static final String SHARE_CANCEL = "1";
    private static final int SHARE_NORMAL = 1;
    private static final int SHARE_ORDER = 2;
    private static final String SHARE_SUCCESS = "0";
    private static final String SHARE_UNKNOW = "2";
    public static final String TAG = "CommonBridgeModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int businessType;
    private Calendar calendar;
    private ArrayList<String> dayItems;
    private long endTime;
    private ArrayList<ArrayList<String>> hourItems;
    private com.meituan.android.legwork.mvp.presenter.c mChangeOrderInfoPresenter;
    private b.a mChangeOrderInfoView;
    private long mCurrentTimeMillis;
    private com.meituan.android.legwork.mvp.presenter.e mPayTypePresenter;
    private PayTypeContract.a mPayTypeView;
    private ArrayList<ArrayList<ArrayList<String>>> minuteItems;
    private Dialog progressDialog;
    private int selectedDayPosition;
    private int selectedHourPosition;
    private int selectedMinutePosition;
    private long startTime;
    private long time;
    private com.meituan.android.legwork.ui.component.pickerview.a timerPickerView;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BMLWMRNBridge";
    }

    @ReactMethod
    public void reportSniffer(boolean z, String str, String str2, String str3) {
    }

    public CommonBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56712b3b9ad9614f24b81f1ce10b90ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56712b3b9ad9614f24b81f1ce10b90ce");
            return;
        }
        this.mPayTypePresenter = new com.meituan.android.legwork.mvp.presenter.e(3);
        this.mChangeOrderInfoPresenter = new com.meituan.android.legwork.mvp.presenter.c();
        this.dayItems = new ArrayList<>();
        this.hourItems = new ArrayList<>();
        this.minuteItems = new ArrayList<>();
        this.selectedDayPosition = 0;
        this.selectedHourPosition = 0;
        this.selectedMinutePosition = 0;
        this.businessType = 0;
        this.time = 0L;
        this.startTime = 0L;
        this.endTime = 0L;
    }

    @ReactMethod
    public void trackFeedbackBusinessMonitor(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31eacf1024241fff80c1dc9c10368501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31eacf1024241fff80c1dc9c10368501");
            return;
        }
        if (TextUtils.isEmpty(com.meituan.android.legwork.common.user.a.a().e()) && readableMap.hasKey("phone")) {
            readableMap.getString("phone");
        }
        if (readableMap.hasKey("text")) {
        }
    }

    @ReactMethod
    public void openH5(String str, ReadableMap readableMap, ReadableMap readableMap2) {
        Object[] objArr = {str, readableMap, readableMap2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7287972eaee3da7ecdfde1c8a361e63d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7287972eaee3da7ecdfde1c8a361e63d");
            return;
        }
        Object[] objArr2 = new Object[1];
        StringBuilder sb = new StringBuilder("调用桥openH5, 参数：url:");
        sb.append(str);
        sb.append(",params:");
        sb.append(readableMap == null ? "" : readableMap.toString());
        objArr2[0] = sb.toString();
        x.c("CommonBridgeModule.openH5()", objArr2);
        if (com.meituan.android.legwork.a.b && !TextUtils.isEmpty(str) && str.startsWith("https://paotui.meituan.com/")) {
            str = str.replaceFirst("https://paotui.meituan.com/", com.meituan.android.legwork.net.b.a().a(com.meituan.android.legwork.a.b));
        }
        HashMap hashMap = new HashMap();
        if (readableMap2 != null) {
            for (Map.Entry<String, Object> entry : readableMap2.toHashMap().entrySet()) {
                if (entry.getValue() != null) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        if (readableMap != null) {
            for (Map.Entry<String, Object> entry2 : readableMap.toHashMap().entrySet()) {
                if (entry2.getValue() != null) {
                    hashMap.put(entry2.getKey(), entry2.getValue().toString());
                }
            }
        }
        com.meituan.android.legwork.utils.l.a(getCurrentActivity(), str, hashMap);
    }

    @ReactMethod
    @Deprecated
    public void jumpToH5(String str, ReadableMap readableMap) {
        Object[] objArr = {str, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4f48310c3d047ed3462edf137d675fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4f48310c3d047ed3462edf137d675fb");
            return;
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("https://paotui.meituan.com/")) {
            Object[] objArr2 = new Object[1];
            StringBuilder sb = new StringBuilder("调用桥jumpToH5, 参数：url:");
            sb.append(str);
            sb.append(",params:");
            sb.append(readableMap == null ? "" : readableMap.toString());
            objArr2[0] = sb.toString();
            x.c("CommonBridgeModule.jumpToH5()", objArr2);
            str = str.replaceFirst("https://paotui.meituan.com/", com.meituan.android.legwork.net.b.a().a(com.meituan.android.legwork.a.b));
        }
        HashMap hashMap = new HashMap();
        if (readableMap != null) {
            for (Map.Entry<String, Object> entry : readableMap.toHashMap().entrySet()) {
                if (entry.getValue() != null) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        com.meituan.android.legwork.utils.l.a(getCurrentActivity(), str, hashMap);
    }

    @ReactMethod
    public void jumpToH5ForResult(String str, ReadableMap readableMap, final Promise promise) {
        String str2 = str;
        Object[] objArr = {str2, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a41ea90054cacc30280de8b86f06309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a41ea90054cacc30280de8b86f06309");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Object[] objArr2 = {str2, readableMap, promise, currentActivity, reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.mrn.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "458d1a1d0a69c7bc80ded216df99ce10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "458d1a1d0a69c7bc80ded216df99ce10");
            return;
        }
        Object[] objArr3 = new Object[1];
        StringBuilder sb = new StringBuilder("调用桥jumpToH5ForResult, 参数：url:");
        sb.append(str2);
        sb.append(",params:");
        sb.append(readableMap == null ? "" : readableMap.toString());
        objArr3[0] = sb.toString();
        x.c("CommonBridgeModule.jumpToH5ForResult()", objArr3);
        if (com.meituan.android.legwork.a.b && !TextUtils.isEmpty(str) && str2.startsWith("https://paotui.meituan.com/")) {
            str2 = str2.replaceFirst("https://paotui.meituan.com/", com.meituan.android.legwork.net.b.a().a(com.meituan.android.legwork.a.b));
        }
        final int i = 1001;
        HashMap hashMap = new HashMap();
        if (readableMap != null) {
            for (Map.Entry<String, Object> entry : readableMap.toHashMap().entrySet()) {
                if (entry.getValue() != null) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                    if (TextUtils.equals(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, entry.getKey())) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            i = Integer.parseInt((String) value);
                        } else if (value instanceof Integer) {
                            i = ((Integer) value).intValue();
                        } else if (value instanceof Double) {
                            Double d = (Double) value;
                            if (d.doubleValue() == d.intValue()) {
                                i = d.intValue();
                            }
                        }
                    }
                }
            }
        }
        if (reactApplicationContext != null) {
            reactApplicationContext.addActivityEventListener(new ActivityEventListener() { // from class: com.meituan.android.legwork.mrn.a.1
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.bridge.ActivityEventListener
                public final void onNewIntent(Intent intent) {
                }

                @Override // com.facebook.react.bridge.ActivityEventListener
                public final void onActivityResult(Activity activity, int i2, int i3, Intent intent) {
                    Object[] objArr4 = {activity, Integer.valueOf(i2), Integer.valueOf(i3), intent};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a33f75257d002a2aeeac5f0275b1fad0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a33f75257d002a2aeeac5f0275b1fad0");
                    } else if (i != i2) {
                    } else {
                        reactApplicationContext.removeActivityEventListener(this);
                        WritableMap createMap = Arguments.createMap();
                        if (intent != null) {
                            if (intent.hasExtra("resultData") && !TextUtils.isEmpty(f.a(intent, "resultData"))) {
                                createMap.putString("resultData", f.a(intent, "resultData"));
                            } else if (intent.getExtras() != null) {
                                createMap.putMap("resultData", Arguments.fromBundle(intent.getExtras()));
                            }
                        }
                        if (!createMap.hasKey(Constant.KEY_RESULT_CODE)) {
                            createMap.putInt(Constant.KEY_RESULT_CODE, i3);
                        }
                        if (!createMap.hasKey(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)) {
                            createMap.putInt(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, i2);
                        }
                        promise.resolve(createMap);
                    }
                }
            });
            com.meituan.android.legwork.utils.l.a(currentActivity, str2, hashMap, i);
        }
    }

    @ReactMethod
    public void jumpToNativeForResult(String str, ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {str, readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0e16cfc62854e256e49ec230b3927f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0e16cfc62854e256e49ec230b3927f7");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Object[] objArr2 = {str, readableMap, promise, currentActivity, reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.mrn.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "26cc737ca24c860e91e6289c68aaccbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "26cc737ca24c860e91e6289c68aaccbe");
            return;
        }
        Object[] objArr3 = new Object[1];
        StringBuilder sb = new StringBuilder("调用桥jumpToNativeForResult, 参数：url:");
        sb.append(str);
        sb.append(",params:");
        sb.append(readableMap == null ? "" : readableMap.toString());
        objArr3[0] = sb.toString();
        x.c("CommonBridgeModule.jumpToNativeForResult()", objArr3);
        if (TextUtils.isEmpty(str)) {
            promise.reject("", "url can't be null");
            return;
        }
        final int i = 1002;
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            if (readableMap != null) {
                for (Map.Entry<String, Object> entry : readableMap.toHashMap().entrySet()) {
                    if (entry.getValue() != null) {
                        buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
                        if (TextUtils.equals(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, entry.getKey())) {
                            Object value = entry.getValue();
                            if (value instanceof String) {
                                i = Integer.parseInt((String) value);
                            } else if (value instanceof Integer) {
                                i = ((Integer) value).intValue();
                            } else if ((value instanceof Double) && ((Double) value).doubleValue() == ((Double) value).intValue()) {
                                i = ((Double) value).intValue();
                            }
                        }
                    }
                }
            }
            if (reactApplicationContext == null) {
                return;
            }
            reactApplicationContext.addActivityEventListener(new ActivityEventListener() { // from class: com.meituan.android.legwork.mrn.a.2
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.bridge.ActivityEventListener
                public final void onNewIntent(Intent intent) {
                }

                @Override // com.facebook.react.bridge.ActivityEventListener
                public final void onActivityResult(Activity activity, int i2, int i3, Intent intent) {
                    Object[] objArr4 = {activity, Integer.valueOf(i2), Integer.valueOf(i3), intent};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bac8c00aaafc2c1de7da0575a9be289a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bac8c00aaafc2c1de7da0575a9be289a");
                    } else if (i != i2) {
                    } else {
                        reactApplicationContext.removeActivityEventListener(this);
                        WritableMap createMap = Arguments.createMap();
                        if (intent != null) {
                            if (intent.hasExtra("resultData") && !TextUtils.isEmpty(f.a(intent, "resultData"))) {
                                createMap.putString("resultData", f.a(intent, "resultData"));
                            } else if (intent.getExtras() != null) {
                                createMap.putMap("resultData", Arguments.fromBundle(intent.getExtras()));
                            }
                        }
                        if (!createMap.hasKey(Constant.KEY_RESULT_CODE)) {
                            createMap.putInt(Constant.KEY_RESULT_CODE, i3);
                        }
                        if (!createMap.hasKey(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)) {
                            createMap.putInt(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, i2);
                        }
                        promise.resolve(createMap);
                    }
                }
            });
            com.meituan.android.legwork.common.util.i.a(currentActivity, buildUpon.toString(), i);
        } catch (Exception e) {
            promise.reject("", "open native page failed", e);
        }
    }

    @ReactMethod
    @Deprecated
    public void monitorBusiness(boolean z, String str, ReadableMap readableMap, int i, int i2, String str2) {
        HashMap<String, Object> hashMap;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, readableMap, Integer.valueOf(i), Integer.valueOf(i2), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3513e5031c7825bb2376462b5c6a67c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3513e5031c7825bb2376462b5c6a67c7");
            return;
        }
        if (readableMap == null) {
            hashMap = new HashMap<>();
        } else {
            hashMap = readableMap.toHashMap();
        }
        HashMap<String, Object> hashMap2 = hashMap;
        if (z) {
            q.a(str, hashMap2, i2, str2, null);
        } else {
            q.a(str, hashMap2);
        }
    }

    @ReactMethod
    public void newMonitorBusiness(boolean z, String str, int i, ReadableMap readableMap, int i2, int i3, String str2) {
        HashMap<String, Object> hashMap;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), readableMap, Integer.valueOf(i2), Integer.valueOf(i3), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e81358456c13f3f6879873792fc876d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e81358456c13f3f6879873792fc876d");
            return;
        }
        if (readableMap == null) {
            hashMap = new HashMap<>();
        } else {
            hashMap = readableMap.toHashMap();
        }
        dealDoubleToLong(str, hashMap);
        if (!z) {
            q.a(str, i, hashMap);
            return;
        }
        Object[] objArr2 = {str, Integer.valueOf(i), hashMap, Integer.valueOf(i3), str2, null, null};
        ChangeQuickRedirect changeQuickRedirect3 = q.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "1d27d1255cf82c8922c84f8adde30c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "1d27d1255cf82c8922c84f8adde30c77");
        } else if (q.a(i)) {
            try {
                ReportService.report2DaBai(str, (int) (com.meituan.android.time.c.b() / 1000), hashMap);
            } catch (Exception e) {
                x.b("MonitorUtil.newReportMonitorAndES()", "reportNormal error,exception msg:", e);
                x.a(e);
            }
        }
    }

    public void dealDoubleToLong(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd088c0b3d1074df0738562a3828fb14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd088c0b3d1074df0738562a3828fb14");
        } else if (TextUtils.equals("LegworkLog", str) && map != null && (map.get("time") instanceof Double)) {
            long longValue = ((Double) map.get("time")).longValue();
            StringBuilder sb = new StringBuilder();
            sb.append(longValue);
            map.put("time", sb.toString());
        }
    }

    @ReactMethod
    public void fetchTagsWidth(int i, ReadableArray readableArray, ReadableArray readableArray2, Promise promise) {
        int i2 = i;
        Object[] objArr = {Integer.valueOf(i), readableArray, readableArray2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a513528b5c88c9f42ca12a3250d88d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a513528b5c88c9f42ca12a3250d88d1e");
            return;
        }
        Object[] objArr2 = new Object[1];
        StringBuilder sb = new StringBuilder("调用桥jumpToNativeForResult, 参数：fontSize:");
        sb.append(i2);
        sb.append(",normalTags:");
        sb.append(readableArray == null ? "" : readableArray.toString());
        sb.append(",specialTags:");
        sb.append(readableArray2 == null ? "" : readableArray2.toString());
        objArr2[0] = sb.toString();
        x.c("CommonBridgeModule.fetchTagsWidth()", objArr2);
        try {
            TextView textView = new TextView(com.meituan.android.legwork.a.a());
            if (i2 <= 0) {
                i2 = 13;
            }
            textView.setTextSize(i2);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            if (readableArray != null) {
                int size = readableArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    writableNativeArray.pushDouble(com.meituan.android.legwork.utils.h.b(textView.getPaint().measureText(readableArray.getString(i3))));
                }
            }
            WritableNativeArray writableNativeArray2 = new WritableNativeArray();
            if (readableArray2 != null) {
                int size2 = readableArray2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    writableNativeArray2.pushDouble(com.meituan.android.legwork.utils.h.b(textView.getPaint().measureText(readableArray2.getString(i4))));
                }
            }
            WritableNativeArray writableNativeArray3 = new WritableNativeArray();
            writableNativeArray3.pushArray((WritableArray) writableNativeArray);
            writableNativeArray3.pushArray((WritableArray) writableNativeArray2);
            if (promise != null) {
                x.c("CommonBridgeModule.fetchTagsWidth()", "桥jumpToNativeForResult的返回结果, result:" + writableNativeArray3.toString());
                promise.resolve(writableNativeArray3);
            }
        } catch (Exception e) {
            x.a(e);
            if (promise != null) {
                x.c("CommonBridgeModule.fetchTagsWidth()", "桥jumpToNativeForResult失败，error msg:", e.getMessage());
                promise.reject("fetchTagsWidthError", e.getMessage());
            }
        }
    }

    @ReactMethod
    public void fetchPayResult(final String str, int i, int i2, final int i3, final boolean z, final Promise promise) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5459056e814c1c00aae5873e83a42ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5459056e814c1c00aae5873e83a42ac7");
            return;
        }
        x.c("CommonBridgeModule.fetchPayResult()", "调用桥fetchPayResult, 参数：orderId:" + str + ",longitude:" + i + ",latitude:" + i2 + "，businessType：" + i3 + "，isDetail：" + z);
        this.mPayTypePresenter.d = 1;
        this.mPayTypeView = new PayTypeContract.a() { // from class: com.meituan.android.legwork.mrn.bridge.CommonBridgeModule.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
            public final FragmentManager a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b32d1792e2c71e01ac667df9eafd769", RobustBitConfig.DEFAULT_VALUE) ? (FragmentManager) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b32d1792e2c71e01ac667df9eafd769") : CommonBridgeModule.this.getFragmentManager();
            }

            @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
            public final void a(int i4) {
                Object[] objArr2 = {Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9ac2731068c2ef87effc73f5ff4df841", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9ac2731068c2ef87effc73f5ff4df841");
                } else if (i4 == 3) {
                    CommonBridgeModule.this.mPayTypePresenter.a(str);
                } else {
                    rx.d.a(new com.meituan.android.legwork.net.subscriber.a<PayBean>() { // from class: com.meituan.android.legwork.mrn.bridge.CommonBridgeModule.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.legwork.net.subscriber.a
                        public final /* synthetic */ void a(PayBean payBean) {
                            PayBean payBean2 = payBean;
                            Object[] objArr3 = {payBean2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7b2646ad05db35764df68fdf3a73f8bb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7b2646ad05db35764df68fdf3a73f8bb");
                            } else {
                                CommonBridgeModule.this.gotoOnlinePay(payBean2.payTradeNo, payBean2.payToken, promise, 1);
                            }
                        }

                        @Override // com.meituan.android.legwork.net.subscriber.a
                        public final void a(boolean z2, int i5, String str2) {
                            Object[] objArr3 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i5), str2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ebdceb448dc9eecaa3bb2a0fcdd0fd6f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ebdceb448dc9eecaa3bb2a0fcdd0fd6f");
                                return;
                            }
                            ab.a(str2);
                            x.c("CommonBridgeModule.fetchPayResult()", "桥fetchPayResult失败，errCode:" + i5 + "，message：" + str2);
                            Promise promise2 = promise;
                            StringBuilder sb = new StringBuilder();
                            sb.append(i5);
                            promise2.reject(sb.toString(), str2);
                        }
                    }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getPayParams(str).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
                    if (z) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("order_id", str);
                        hashMap.put("businessType", Integer.valueOf(i3));
                        hashMap.put("order_status", 1);
                        com.meituan.android.legwork.statistics.a.b(CommonBridgeModule.this.getCurrentActivity(), "b_pli1vz2y", "paotui_c_orddtl_sw", hashMap);
                    }
                }
            }

            @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8c00599df6399c3c260643a636f1cddc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8c00599df6399c3c260643a636f1cddc");
                    return;
                }
                CommonBridgeModule.this.mPayTypePresenter.a();
                x.c("CommonBridgeModule.fetchPayResult()", "桥fetchPayResult失败，onPayTypeDismiss");
                promise.reject("", "");
            }

            @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1cc2cba804d4ead0c4cf8ef9dd7b4d48", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1cc2cba804d4ead0c4cf8ef9dd7b4d48");
                    return;
                }
                x.c("CommonBridgeModule.fetchPayResult()", "桥fetchPayResult成功，余额支付成功");
                promise.resolve(Boolean.TRUE);
                CommonBridgeModule.this.mPayTypePresenter.a();
            }

            @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
            public final void a(int i4, String str2) {
                Object[] objArr2 = {Integer.valueOf(i4), str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "db6d21d96964ee8f7f45ea58591463c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "db6d21d96964ee8f7f45ea58591463c0");
                } else if (i4 == 4) {
                    CommonBridgeModule.this.mPayTypePresenter.a(str, 16002);
                } else {
                    x.c("CommonBridgeModule.fetchPayResult()", "桥fetchPayResult失败，errorCode:" + i4 + ",message:" + str2);
                    Promise promise2 = promise;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i4);
                    promise2.reject(sb.toString(), str2);
                    CommonBridgeModule.this.mPayTypePresenter.a();
                }
            }

            @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2a685b0330b3f337931449a07adaccea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2a685b0330b3f337931449a07adaccea");
                } else {
                    CommonBridgeModule.this.showProgressDialog();
                }
            }

            @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cb05e9b29d2d3dcba86cc248623d01f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cb05e9b29d2d3dcba86cc248623d01f4");
                } else {
                    CommonBridgeModule.this.dismissProgressDialog();
                }
            }

            @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
            public final void a(boolean z2, String str2, Map<String, Object> map) {
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, map};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b45d966bf0906e00ff2abffae446783d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b45d966bf0906e00ff2abffae446783d");
                    return;
                }
                map.put("businessType", Integer.valueOf(i3));
                CommonBridgeModule.this.fragmentReport(z2, str2, map, z);
            }
        };
        this.mPayTypePresenter.a(i, i2);
        this.mPayTypePresenter.a((com.meituan.android.legwork.mvp.presenter.e) this.mPayTypeView);
        this.mPayTypePresenter.a(str, 0);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.mrn.bridge.CommonBridgeModule$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements PayTypeContract.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ double d;
        public final /* synthetic */ int e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ Promise g;
        public final /* synthetic */ int h;

        public AnonymousClass2(String str, String str2, double d, int i, boolean z, Promise promise, int i2) {
            this.b = str;
            this.c = str2;
            this.d = d;
            this.e = i;
            this.f = z;
            this.g = promise;
            this.h = i2;
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final FragmentManager a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4389add28ab16f56b50da762345592d", RobustBitConfig.DEFAULT_VALUE) ? (FragmentManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4389add28ab16f56b50da762345592d") : CommonBridgeModule.this.getFragmentManager();
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void a(final int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c5a48b50108d471b5e2f3296fe3c37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c5a48b50108d471b5e2f3296fe3c37");
            } else {
                rx.d.a(new com.meituan.android.legwork.net.subscriber.a<TipSubmitBean>() { // from class: com.meituan.android.legwork.mrn.bridge.CommonBridgeModule.2.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.legwork.net.subscriber.a
                    public final /* synthetic */ void a(TipSubmitBean tipSubmitBean) {
                        TipSubmitBean tipSubmitBean2 = tipSubmitBean;
                        Object[] objArr2 = {tipSubmitBean2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d4cde48705e5e8f1bf513a6bedae9ed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d4cde48705e5e8f1bf513a6bedae9ed");
                            return;
                        }
                        HashMap hashMap = new HashMap(4);
                        hashMap.put("businessType", String.valueOf(AnonymousClass2.this.e));
                        hashMap.put("from", AnonymousClass2.this.f ? "orderDetail" : "orderList");
                        q.a("legwork_add_tip_submit", 1, hashMap);
                        if (tipSubmitBean2 == null) {
                            a(false, -1, "");
                            return;
                        }
                        if (i == 3) {
                            CommonBridgeModule.this.mPayTypePresenter.a(tipSubmitBean2.orderViewId);
                        } else {
                            CommonBridgeModule.this.gotoOnlinePay(tipSubmitBean2.payTradeNo, tipSubmitBean2.payToken, AnonymousClass2.this.g, 2);
                        }
                        CommonBridgeModule.this.reportTipClick(tipSubmitBean2.orderViewId, "", AnonymousClass2.this.e, AnonymousClass2.this.h, AnonymousClass2.this.f);
                    }

                    @Override // com.meituan.android.legwork.net.subscriber.a
                    public final void a(boolean z, int i2, String str) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e247d9b6108272d39f6f5d7db49c4666", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e247d9b6108272d39f6f5d7db49c4666");
                        } else if (i2 != 16003) {
                            ab.a(CommonBridgeModule.this.getCurrentActivity(), str);
                            CommonBridgeModule.this.mPayTypePresenter.a();
                            CommonBridgeModule.this.reportTipClick(AnonymousClass2.this.b, String.valueOf(i2), AnonymousClass2.this.e, AnonymousClass2.this.h, AnonymousClass2.this.f);
                            x.c("CommonBridgeModule.fetchTipFeeResult()", "桥fetchTipFeeResult失败，errorCode:" + i2 + ",msg:" + str);
                            Promise promise = AnonymousClass2.this.g;
                            StringBuilder sb = new StringBuilder();
                            sb.append(i2);
                            promise.reject(sb.toString(), str);
                        } else {
                            AnonymousClass2.this.a(1);
                        }
                    }
                }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).submitTip(this.b, this.c, com.meituan.android.legwork.common.hostInfo.b.e().b(), this.d, i).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
            }
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f4e2e96c4fbc28324ac4f656189dc44", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f4e2e96c4fbc28324ac4f656189dc44");
                return;
            }
            x.c("CommonBridgeModule.fetchTipFeeResult()", "桥fetchTipFeeResult失败，用户取消支付");
            this.g.reject("", "");
            CommonBridgeModule.this.mPayTypePresenter.a();
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100dc99814aa45732b4c89b2b3ad867f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100dc99814aa45732b4c89b2b3ad867f");
                return;
            }
            ab.a((int) R.string.legwork_add_tip_success);
            x.c("CommonBridgeModule.fetchTipFeeResult()", "桥fetchTipFeeResult成功，小费支付成功");
            this.g.resolve(Boolean.TRUE);
            CommonBridgeModule.this.mPayTypePresenter.a();
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c898b677659c7936d41091cae66bc241", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c898b677659c7936d41091cae66bc241");
            } else if (i == 4) {
                CommonBridgeModule.this.mPayTypePresenter.a(this.d, 3, 16002);
            } else {
                x.c("CommonBridgeModule.fetchTipFeeResult()", "桥fetchTipFeeResult失败，errorCode:" + i + ",msg:" + str);
                Promise promise = this.g;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                promise.reject(sb.toString(), str);
                CommonBridgeModule.this.mPayTypePresenter.a();
            }
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e6cf8f14341fdd3c57200dab858ecb1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e6cf8f14341fdd3c57200dab858ecb1");
            } else {
                CommonBridgeModule.this.showProgressDialog();
            }
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3769f2590a76dbdc4250ff78419989", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3769f2590a76dbdc4250ff78419989");
            } else {
                CommonBridgeModule.this.dismissProgressDialog();
            }
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void a(boolean z, String str, Map<String, Object> map) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "221ba9c16f3d96556350fee74577115c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "221ba9c16f3d96556350fee74577115c");
                return;
            }
            map.put("businessType", Integer.valueOf(this.e));
            CommonBridgeModule.this.fragmentReport(z, str, map, this.f);
        }
    }

    @ReactMethod
    public void fetchTipFeeResult(String str, String str2, double d, int i, int i2, int i3, int i4, int i5, boolean z, Promise promise) {
        Object[] objArr = {str, str2, Double.valueOf(d), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a55789705778746ee955c2ca8841135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a55789705778746ee955c2ca8841135");
            return;
        }
        x.c("CommonBridgeModule.fetchTipFeeResult()", "调用桥fetchTipFeeResult, 参数：orderViewId:" + str + ",orderToken:" + str2 + ",tipFee:" + d + "，businessType：" + i + ",orderStatus:" + i2 + ",longitude:" + i3 + ",latitude:" + i4 + "，isDetail：" + z);
        this.mPayTypeView = new AnonymousClass2(str, str2, d, i, z, promise, i2);
        this.mPayTypePresenter.a(i3, i4);
        this.mPayTypePresenter.a((com.meituan.android.legwork.mvp.presenter.e) this.mPayTypeView);
        this.mPayTypePresenter.d = 2;
        this.mPayTypePresenter.a(d, i5, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FragmentManager getFragmentManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e2823b50d78c552c60dc343c93788ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (FragmentManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e2823b50d78c552c60dc343c93788ea");
        }
        if (getCurrentActivity() instanceof FragmentActivity) {
            return ((FragmentActivity) getCurrentActivity()).getSupportFragmentManager();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showProgressDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72f42857b95eff69890fc5fc881aa0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72f42857b95eff69890fc5fc881aa0bb");
        } else if (getCurrentActivity() instanceof FragmentActivity) {
            getCurrentActivity().runOnUiThread(a.a(this));
        }
    }

    public static /* synthetic */ void lambda$showProgressDialog$8(CommonBridgeModule commonBridgeModule) {
        Object[] objArr = {commonBridgeModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1be48affa172a2dd9616df3d56fcd720", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1be48affa172a2dd9616df3d56fcd720");
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) commonBridgeModule.getCurrentActivity();
        if (commonBridgeModule.progressDialog == null) {
            commonBridgeModule.progressDialog = new Dialog(fragmentActivity, R.style.legwork_loading_progress);
            commonBridgeModule.progressDialog.setContentView(R.layout.legwork_loading_flower);
            commonBridgeModule.progressDialog.setCancelable(false);
        }
        try {
            if (fragmentActivity.isFinishing() || commonBridgeModule.progressDialog.isShowing()) {
                return;
            }
            commonBridgeModule.progressDialog.show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissProgressDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52f71dcc77b6005f831875b551f127a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52f71dcc77b6005f831875b551f127a4");
        } else if (getCurrentActivity() == null) {
        } else {
            getCurrentActivity().runOnUiThread(b.a(this));
        }
    }

    public static /* synthetic */ void lambda$dismissProgressDialog$9(CommonBridgeModule commonBridgeModule) {
        Object[] objArr = {commonBridgeModule};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c43fd28b0594f428610b318101e5df8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c43fd28b0594f428610b318101e5df8f");
        } else if (commonBridgeModule.progressDialog == null || !commonBridgeModule.progressDialog.isShowing()) {
        } else {
            try {
                commonBridgeModule.progressDialog.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fragmentReport(boolean z, String str, Map<String, Object> map, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, map, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10fd84a1aeae46e06d56bbbab2a9fc88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10fd84a1aeae46e06d56bbbab2a9fc88");
        } else if (z) {
            com.meituan.android.legwork.statistics.a.a(getCurrentActivity(), str, z2 ? "paotui_c_orddtl_sw" : "paotui_c_ordlst_sw", map);
        } else {
            com.meituan.android.legwork.statistics.a.a(getCurrentActivity(), str, map, z2 ? "paotui_c_orddtl_sw" : "paotui_c_ordlst_sw");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotoOnlinePay(String str, String str2, final Promise promise, int i) {
        Object[] objArr = {str, str2, promise, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "530d764b73b8fe077a12c652838d40c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "530d764b73b8fe077a12c652838d40c4");
        } else if (getReactApplicationContext() == null || !this.mPayTypePresenter.c() || promise == null) {
        } else {
            getReactApplicationContext().addActivityEventListener(new ActivityEventListener() { // from class: com.meituan.android.legwork.mrn.bridge.CommonBridgeModule.3
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.bridge.ActivityEventListener
                public final void onNewIntent(Intent intent) {
                }

                @Override // com.facebook.react.bridge.ActivityEventListener
                public final void onActivityResult(Activity activity, int i2, int i3, Intent intent) {
                    Object[] objArr2 = {activity, Integer.valueOf(i2), Integer.valueOf(i3), intent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "378db0dabcbe3ee9f74bfdcd057d9c41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "378db0dabcbe3ee9f74bfdcd057d9c41");
                    } else if (CommonBridgeModule.this.getReactApplicationContext() == null || !CommonBridgeModule.this.mPayTypePresenter.c() || promise == null) {
                    } else {
                        CommonBridgeModule.this.getReactApplicationContext().removeActivityEventListener(this);
                        if ((i2 == 2 || i2 == 1 || i2 == 3) && i3 == -1) {
                            if (i2 == 2) {
                                ab.a((int) R.string.legwork_add_tip_success);
                                x.c("CommonBridgeModule.gotoOnlinePay()", "小费在线支付成功");
                            } else {
                                x.c("CommonBridgeModule.gotoOnlinePay()", "订单在线支付成功");
                            }
                            HashMap hashMap = new HashMap(2);
                            hashMap.put("status", "success");
                            q.a("legwork_pay", 1, hashMap);
                            promise.resolve(Boolean.TRUE);
                            return;
                        }
                        x.c("CommonBridgeModule.gotoOnlinePay()", "在线支付失败");
                        promise.reject("", "在线支付失败");
                    }
                }
            });
            v.a(getCurrentActivity(), i, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportTipClick(String str, String str2, int i, int i2, boolean z) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "714171672d5e15fb298c4cca431bdaf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "714171672d5e15fb298c4cca431bdaf8");
            return;
        }
        HashMap<String, Object> reportCustom = getReportCustom(str, i, i2);
        reportCustom.put("tip_exception", str2);
        if (z) {
            com.meituan.android.legwork.statistics.a.a(getCurrentActivity(), "b_a38na9ch", "paotui_c_orddtl_sw", reportCustom);
        } else {
            com.meituan.android.legwork.statistics.a.a(getCurrentActivity(), "b_2u6n9160", "paotui_c_ordlst_sw", reportCustom);
        }
    }

    private HashMap<String, Object> getReportCustom(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81cee1b458a6aaef1780c2e9878e7dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81cee1b458a6aaef1780c2e9878e7dcf");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("order_id", str);
        hashMap.put("businessType", Integer.valueOf(i));
        hashMap.put("order_status", Integer.valueOf(i2));
        return hashMap;
    }

    @ReactMethod
    public void chooseTime(int i, int i2, int i3, int i4, Promise promise) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de57b613f2b8d4eb80c9c60f816b5545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de57b613f2b8d4eb80c9c60f816b5545");
            return;
        }
        x.c("CommonBridgeModule.chooseTime()", "调用桥fetchTipFeeResult, 参数：businessType:" + i + ",time:" + i2 + ",startTime:" + i3 + "，endTime：" + i4);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        initChangeOrderInfoView(promise);
        this.mChangeOrderInfoView.a(currentActivity, i, i2, i3, i4, promise);
    }

    @ReactMethod
    public void submitModifyOrder(String str, Promise promise) {
        int i;
        int i2;
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ce05586e5aebdc06e303af55632595f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ce05586e5aebdc06e303af55632595f");
        } else if (str == null) {
        } else {
            try {
                ChangeOrderInfoSubmitBean changeOrderInfoSubmitBean = (ChangeOrderInfoSubmitBean) com.meituan.android.legwork.net.util.b.a().fromJson(str, (Class<Object>) ChangeOrderInfoSubmitBean.class);
                initChangeOrderInfoView(promise);
                this.mChangeOrderInfoPresenter.a();
                this.mChangeOrderInfoPresenter.a((com.meituan.android.legwork.mvp.presenter.c) this.mChangeOrderInfoView);
                com.meituan.android.legwork.mvp.presenter.c cVar = this.mChangeOrderInfoPresenter;
                FragmentManager fragmentManager = getFragmentManager();
                Activity currentActivity = getCurrentActivity();
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                Object[] objArr2 = {fragmentManager, currentActivity, reactApplicationContext, promise, changeOrderInfoSubmitBean};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.mvp.presenter.c.c;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "c040669529d51aaf325efcce88e6f566", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "c040669529d51aaf325efcce88e6f566");
                } else if (changeOrderInfoSubmitBean != null) {
                    if (cVar.d.c()) {
                        cVar.d.a();
                    }
                    cVar.e = new c.AnonymousClass1(fragmentManager, changeOrderInfoSubmitBean, currentActivity, reactApplicationContext, promise);
                    cVar.d.a((com.meituan.android.legwork.mvp.presenter.e) cVar.e);
                    int i3 = changeOrderInfoSubmitBean.payType == 3 ? 3 : 1;
                    cVar.d.d = 5;
                    Object[] objArr3 = {changeOrderInfoSubmitBean};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.legwork.mvp.presenter.c.c;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect4, false, "7e0f6f86524d364b1fde8acd566405e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect4, false, "7e0f6f86524d364b1fde8acd566405e7");
                    } else if (changeOrderInfoSubmitBean != null) {
                        if (changeOrderInfoSubmitBean.businessType == 2 && changeOrderInfoSubmitBean.businessTypeTag == 1) {
                            i = changeOrderInfoSubmitBean.recipientLng;
                            i2 = changeOrderInfoSubmitBean.recipientLat;
                        } else {
                            i = changeOrderInfoSubmitBean.fetchLng;
                            i2 = changeOrderInfoSubmitBean.fetchLat;
                        }
                        cVar.d.a(i, i2);
                    }
                    cVar.d.a(changeOrderInfoSubmitBean.total, i3, 0);
                }
            } catch (Exception e) {
                x.a(e);
                x.e("CommonBridgeModule.submitModifyOrder()", "修改信息信息异常, exception msg: ", e);
            }
        }
    }

    private void initChangeOrderInfoView(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e096c30e394987ca73031a41e6f781d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e096c30e394987ca73031a41e6f781d6");
        } else {
            this.mChangeOrderInfoView = new b.a() { // from class: com.meituan.android.legwork.mrn.bridge.CommonBridgeModule.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.mvp.contract.b.a
                public final void a(Activity activity, int i, int i2, int i3, int i4, Promise promise2) {
                    Object[] objArr2 = {activity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), promise2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5daa87ab577caf8d2b02e0f01c9e7bf8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5daa87ab577caf8d2b02e0f01c9e7bf8");
                        return;
                    }
                    CommonBridgeModule.this.businessType = i;
                    CommonBridgeModule.this.time = i2;
                    long j = i3;
                    CommonBridgeModule.this.startTime = j;
                    CommonBridgeModule.this.endTime = j;
                    CommonBridgeModule.this.initTimerPickerView(promise2);
                }

                @Override // com.meituan.android.legwork.mvp.contract.b.a
                public final void a(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "810c64e8036af6583c0a1a6c1cd8a55a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "810c64e8036af6583c0a1a6c1cd8a55a");
                        return;
                    }
                    if (z) {
                        x.c("EnvironmentBridgeModule.submitModifyOrder()", "桥submitModifyOrder返回结果：用户支付成功，tips:" + str);
                        Promise promise2 = promise;
                        if (TextUtils.isEmpty(str)) {
                            str = "";
                        }
                        promise2.resolve(str);
                    } else {
                        x.c("EnvironmentBridgeModule.submitModifyOrder()", "桥submitModifyOrder返回结果：用户支付失败，tips:" + str);
                        Promise promise3 = promise;
                        if (TextUtils.isEmpty(str)) {
                            str = "在线支付失败";
                        }
                        promise3.reject(str);
                    }
                    CommonBridgeModule.this.mChangeOrderInfoPresenter.a();
                }
            };
        }
    }

    private void initPickTimeViewData() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51745c4bbd63501964c208eb193e0023", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51745c4bbd63501964c208eb193e0023");
            return;
        }
        this.dayItems.clear();
        this.hourItems.clear();
        this.minuteItems.clear();
        initCalendar();
        this.startTime = ((this.startTime + 599) / 600) * 600;
        long j = this.startTime * 1000;
        this.mCurrentTimeMillis = com.meituan.android.time.c.b();
        this.calendar.setTimeInMillis(j);
        int i2 = this.calendar.get(11);
        int i3 = this.calendar.get(12);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        calendar.setTimeInMillis(this.time * 1000);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        if (com.meituan.android.legwork.utils.g.a(j)) {
            this.dayItems.add("今天");
            this.dayItems.add("明天");
            ArrayList<String> arrayList = new ArrayList<>();
            while (i2 < 24) {
                arrayList.add(String.format(Locale.getDefault(), "%02d", Integer.valueOf(i2)));
                i2++;
            }
            ArrayList<String> arrayList2 = new ArrayList<>();
            for (int i6 = 0; i6 < 24; i6++) {
                arrayList2.add(String.format(Locale.getDefault(), "%02d", Integer.valueOf(i6)));
            }
            this.hourItems.add(arrayList);
            this.hourItems.add(arrayList2);
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (int i7 = i3 / 10; i7 < 6; i7++) {
                arrayList3.add(String.format(Locale.getDefault(), "%02d", Integer.valueOf(i7 * 10)));
            }
            ArrayList<String> arrayList4 = new ArrayList<>();
            int i8 = 0;
            for (int i9 = 6; i8 < i9; i9 = 6) {
                arrayList4.add(String.format(Locale.getDefault(), "%02d", Integer.valueOf(i8 * 10)));
                i8++;
            }
            ArrayList<ArrayList<String>> arrayList5 = new ArrayList<>();
            if (arrayList.size() > 0) {
                arrayList5.add(arrayList3);
            }
            for (int i10 = 0; i10 < arrayList.size() - 1; i10++) {
                arrayList5.add(arrayList4);
            }
            ArrayList<ArrayList<String>> arrayList6 = new ArrayList<>();
            for (int i11 = 0; i11 < 24; i11++) {
                arrayList6.add(arrayList4);
            }
            this.minuteItems.add(arrayList5);
            this.minuteItems.add(arrayList6);
            if (this.time <= this.startTime) {
                this.selectedDayPosition = 0;
                this.selectedHourPosition = 0;
                this.selectedMinutePosition = 0;
                return;
            }
            if (com.meituan.android.legwork.utils.g.a(this.time * 1000)) {
                this.selectedDayPosition = 0;
            } else {
                this.selectedDayPosition = 1;
                arrayList = arrayList2;
                arrayList5 = arrayList6;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                } else if (i4 == Integer.parseInt(arrayList.get(i12))) {
                    this.selectedHourPosition = i12;
                    break;
                } else {
                    i12++;
                }
            }
            while (i < arrayList5.get(this.selectedHourPosition).size()) {
                if (i5 == Integer.parseInt(arrayList5.get(this.selectedHourPosition).get(i))) {
                    this.selectedMinutePosition = i;
                    return;
                }
                i++;
            }
            return;
        }
        this.dayItems.add("明天");
        ArrayList<String> arrayList7 = new ArrayList<>();
        while (i2 < 24) {
            arrayList7.add(String.format(Locale.getDefault(), "%02d", Integer.valueOf(i2)));
            i2++;
        }
        this.hourItems.add(arrayList7);
        ArrayList<String> arrayList8 = new ArrayList<>();
        for (int i13 = i3 / 10; i13 < 6; i13++) {
            arrayList8.add(String.format(Locale.getDefault(), "%02d", Integer.valueOf(i13 * 10)));
        }
        ArrayList<String> arrayList9 = new ArrayList<>();
        for (int i14 = 0; i14 < 6; i14++) {
            arrayList9.add(String.format(Locale.getDefault(), "%02d", Integer.valueOf(i14 * 10)));
        }
        ArrayList<ArrayList<String>> arrayList10 = new ArrayList<>();
        if (arrayList7.size() > 0) {
            arrayList10.add(arrayList8);
        }
        for (int i15 = 0; i15 < arrayList7.size() - 1; i15++) {
            arrayList10.add(arrayList9);
        }
        this.minuteItems.add(arrayList10);
        if (this.time <= this.startTime) {
            this.selectedDayPosition = 0;
            this.selectedHourPosition = 0;
            this.selectedMinutePosition = 0;
            return;
        }
        this.selectedDayPosition = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= arrayList7.size()) {
                break;
            } else if (i4 == Integer.parseInt(arrayList7.get(i16))) {
                this.selectedHourPosition = i16;
                break;
            } else {
                i16++;
            }
        }
        while (i < arrayList10.get(this.selectedHourPosition).size()) {
            if (i5 == Integer.parseInt(arrayList10.get(this.selectedHourPosition).get(i))) {
                this.selectedMinutePosition = i;
                return;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initTimerPickerView(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "080db86970c3ab285597b41b2108d10c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "080db86970c3ab285597b41b2108d10c");
            return;
        }
        initPickTimeViewData();
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        a.C0273a c0273a = new a.C0273a(currentActivity, new a.b() { // from class: com.meituan.android.legwork.mrn.bridge.CommonBridgeModule.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.ui.component.pickerview.a.b
            public final void a(int i, int i2, int i3, View view) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "be1573019a9ee0733e780fd1cebec5d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "be1573019a9ee0733e780fd1cebec5d4");
                    return;
                }
                CommonBridgeModule.this.selectedDayPosition = i;
                CommonBridgeModule.this.selectedHourPosition = i2;
                CommonBridgeModule.this.selectedMinutePosition = i3;
                CommonBridgeModule.this.updatePickTimeView(promise);
            }

            @Override // com.meituan.android.legwork.ui.component.pickerview.a.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ad5db53a518c4d5ff178f5a96e0793be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ad5db53a518c4d5ff178f5a96e0793be");
                    return;
                }
                CommonBridgeModule.this.timerPickerView = null;
                x.c("EnvironmentBridgeModule.chooseTime()", "桥chooseTime返回结果：修改订单，用户未选中时间");
            }
        });
        c0273a.f = currentActivity.getString(this.businessType == 2 ? R.string.legwork_detail_buy_deliver_time : R.string.legwork_recipient_pick_time);
        c0273a.t = currentActivity.getResources().getColor(R.color.legwork_divider_line_bg);
        c0273a.F = 0;
        c0273a.G = 0;
        c0273a.H = 0;
        c0273a.j = currentActivity.getResources().getColor(R.color.white);
        c0273a.k = currentActivity.getResources().getColor(R.color.legwork_common_bg_color_transparent);
        c0273a.i = currentActivity.getResources().getColor(R.color.legwork_common_text_color_FF333333);
        c0273a.h = currentActivity.getResources().getColor(R.color.legwork_common_text_color_FF333333);
        c0273a.g = currentActivity.getResources().getColor(R.color.legwork_common_text_color_FF333333);
        c0273a.s = currentActivity.getResources().getColor(R.color.legwork_common_text_color_FF333333);
        c0273a.r = currentActivity.getResources().getColor(R.color.legwork_common_text_color_FF999999);
        c0273a.q = false;
        c0273a.u = 0;
        c0273a.x = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.C0273a.a;
        this.timerPickerView = PatchProxy.isSupport(objArr2, c0273a, changeQuickRedirect3, false, "a7326a86a0da75aa8dae739a4782356a", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.legwork.ui.component.pickerview.a) PatchProxy.accessDispatch(objArr2, c0273a, changeQuickRedirect3, false, "a7326a86a0da75aa8dae739a4782356a") : new com.meituan.android.legwork.ui.component.pickerview.a(c0273a);
        com.meituan.android.legwork.ui.component.pickerview.a aVar = this.timerPickerView;
        int i = this.selectedDayPosition;
        int i2 = this.selectedHourPosition;
        int i3 = this.selectedMinutePosition;
        Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.legwork.ui.component.pickerview.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect4, false, "e737256505ee00909b3d6722bca0c1ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect4, false, "e737256505ee00909b3d6722bca0c1ca");
        } else {
            aVar.c = i;
            aVar.d = i2;
            aVar.e = i3;
            aVar.a();
        }
        com.meituan.android.legwork.ui.component.pickerview.a aVar2 = this.timerPickerView;
        ArrayList<String> arrayList = this.dayItems;
        ArrayList<ArrayList<String>> arrayList2 = this.hourItems;
        ArrayList<ArrayList<ArrayList<String>>> arrayList3 = this.minuteItems;
        Object[] objArr4 = {arrayList, arrayList2, arrayList3};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.legwork.ui.component.pickerview.a.a;
        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect5, false, "c2c3967c9074d269edcc69629faa8bd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect5, false, "c2c3967c9074d269edcc69629faa8bd2");
        } else {
            final com.meituan.android.legwork.ui.component.pickerview.view.b<T> bVar = aVar2.b;
            Object[] objArr5 = {arrayList, arrayList2, arrayList3};
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.legwork.ui.component.pickerview.view.b.a;
            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect6, false, "5aef81614c065e276ff893a29df5a451", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect6, false, "5aef81614c065e276ff893a29df5a451");
            } else {
                bVar.e = arrayList;
                bVar.f = arrayList2;
                bVar.g = arrayList3;
                int i4 = bVar.g == null ? 8 : 4;
                if (bVar.f == null) {
                    i4 = 12;
                }
                bVar.b.setAdapter(new com.meituan.android.legwork.ui.component.pickerview.adapter.a(bVar.e, i4));
                bVar.b.setCurrentItem(0);
                if (bVar.f != null) {
                    bVar.c.setAdapter(new com.meituan.android.legwork.ui.component.pickerview.adapter.a((List) bVar.f.get(0)));
                }
                bVar.c.setCurrentItem(bVar.b.getCurrentItem());
                if (bVar.g != null) {
                    bVar.d.setAdapter(new com.meituan.android.legwork.ui.component.pickerview.adapter.a((List) ((List) bVar.g.get(0)).get(0)));
                }
                bVar.d.setCurrentItem(bVar.d.getCurrentItem());
                bVar.b.setIsOptions(true);
                bVar.c.setIsOptions(true);
                bVar.d.setIsOptions(true);
                if (bVar.f == null) {
                    bVar.c.setVisibility(8);
                } else {
                    bVar.c.setVisibility(0);
                }
                if (bVar.g == null) {
                    bVar.d.setVisibility(8);
                } else {
                    bVar.d.setVisibility(0);
                }
                bVar.i = new com.meituan.android.legwork.ui.component.pickerview.listener.c() { // from class: com.meituan.android.legwork.ui.component.pickerview.view.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.legwork.ui.component.pickerview.listener.c
                    public final void a(int i5) {
                        Object[] objArr6 = {Integer.valueOf(i5)};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "c42c715486dfef4a1a7bee27b1208fea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "c42c715486dfef4a1a7bee27b1208fea");
                            return;
                        }
                        if (bVar.f != null) {
                            bVar.c.setAdapter(new com.meituan.android.legwork.ui.component.pickerview.adapter.a(bVar.f.get(i5)));
                            bVar.c.setCurrentItem(0);
                        }
                        if (bVar.g != null) {
                            bVar.j.a(0);
                        }
                    }
                };
                bVar.j = new com.meituan.android.legwork.ui.component.pickerview.listener.c() { // from class: com.meituan.android.legwork.ui.component.pickerview.view.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.legwork.ui.component.pickerview.listener.c
                    public final void a(int i5) {
                        Object[] objArr6 = {Integer.valueOf(i5)};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect7, false, "72030cec52a4fde1e4581847dad12447", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect7, false, "72030cec52a4fde1e4581847dad12447");
                        } else if (bVar.g != null) {
                            int currentItem = bVar.b.getCurrentItem();
                            if (currentItem >= bVar.g.size() - 1) {
                                currentItem = bVar.g.size() - 1;
                            }
                            if (i5 >= bVar.f.get(currentItem).size() - 1) {
                                i5 = bVar.f.get(currentItem).size() - 1;
                            }
                            bVar.d.setAdapter(new com.meituan.android.legwork.ui.component.pickerview.adapter.a(bVar.g.get(bVar.b.getCurrentItem()).get(i5)));
                            bVar.d.setCurrentItem(0);
                        }
                    }
                };
                if (arrayList2 != null && bVar.h) {
                    bVar.b.setOnItemSelectedListener(bVar.i);
                }
                if (arrayList3 != null && bVar.h) {
                    bVar.c.setOnItemSelectedListener(bVar.j);
                }
            }
            aVar2.a();
        }
        com.meituan.android.legwork.ui.component.pickerview.a aVar3 = this.timerPickerView;
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.legwork.ui.component.pickerview.view.a.f;
        if (PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect7, false, "2d829e78ccb96a23314346b73c14f7f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect7, false, "2d829e78ccb96a23314346b73c14f7f5");
        } else if (aVar3.b()) {
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = com.meituan.android.legwork.ui.component.pickerview.view.a.f;
            if (PatchProxy.isSupport(objArr7, aVar3, changeQuickRedirect8, false, "85e3d8480cda680aa18ddd4f2d9f2c4e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, aVar3, changeQuickRedirect8, false, "85e3d8480cda680aa18ddd4f2d9f2c4e");
            } else if (aVar3.p != null) {
                aVar3.p.show();
            }
        } else if (aVar3.c()) {
        } else {
            aVar3.a(aVar3.i);
            aVar3.o = true;
            aVar3.i.requestFocus();
        }
    }

    private void initCalendar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fae5371f1490db29cf5b170fd1528b2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fae5371f1490db29cf5b170fd1528b2c");
        } else {
            this.calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePickTimeView(Promise promise) {
        int i;
        int i2;
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de1c4c281d8c0eb73276e437c7b4ac9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de1c4c281d8c0eb73276e437c7b4ac9f");
            return;
        }
        initCalendar();
        this.calendar.setTimeInMillis(this.mCurrentTimeMillis);
        if (TextUtils.equals("明天", this.dayItems.get(this.selectedDayPosition))) {
            this.calendar.set(5, this.calendar.get(5) + 1);
        }
        try {
            i = Integer.parseInt(this.hourItems.get(this.selectedDayPosition).get(this.selectedHourPosition));
        } catch (Exception e) {
            x.a(e);
            i = 0;
        }
        try {
            i2 = Integer.parseInt(this.minuteItems.get(this.selectedDayPosition).get(this.selectedHourPosition).get(this.selectedMinutePosition));
        } catch (Exception e2) {
            x.a(e2);
            i2 = 0;
        }
        this.calendar.set(11, i);
        this.calendar.set(12, i2);
        this.calendar.set(13, 0);
        int timeInMillis = (int) (this.calendar.getTimeInMillis() / 1000);
        x.c("EnvironmentBridgeModule.chooseTime()", "桥chooseTime返回结果：修改订单，用户选择时间：" + timeInMillis);
        promise.resolve(Integer.valueOf(timeInMillis));
        this.mChangeOrderInfoView = null;
    }

    @ReactMethod
    public void loadStorage(String str, boolean z, Promise promise) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0b3504d468d3ceb91f7767a1cd9ef46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0b3504d468d3ceb91f7767a1cd9ef46");
            return;
        }
        if (!z) {
            str = com.meituan.android.legwork.common.user.a.a().d() + CommonConstant.Symbol.UNDERLINE + str;
        }
        String b = z.b(com.meituan.android.legwork.a.a(), str, "");
        x.c("CommonBridgeModule.loadStorage()", "调用桥loadStorage, 参数：key:" + str + ",shared:" + z + ",value:" + b);
        if (promise != null) {
            promise.resolve(b);
        }
    }

    @ReactMethod
    public void storeStorage(String str, boolean z, String str2, Promise promise) {
        String str3 = str;
        Object[] objArr = {str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c25b29c0fb097c4d3cd4df390a0534a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c25b29c0fb097c4d3cd4df390a0534a9");
            return;
        }
        x.c("CommonBridgeModule.storeStorage()", "调用桥storeStorage, 参数：key:" + str3 + ",shared:" + z + ",value:" + str2);
        if (!z) {
            str3 = com.meituan.android.legwork.common.user.a.a().d() + CommonConstant.Symbol.UNDERLINE + str3;
        }
        boolean a = z.a(com.meituan.android.legwork.a.a(), str3, str2);
        if (promise != null) {
            promise.resolve(Boolean.valueOf(a));
        }
    }

    @ReactMethod
    public void removeStorage(String str, boolean z, Promise promise) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec1134d9267c82a17dc420b855063890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec1134d9267c82a17dc420b855063890");
            return;
        }
        x.c("CommonBridgeModule.removeStorage()", "调用桥removeStorage, 参数：key:" + str + ",shared:" + z);
        if (!z) {
            str = com.meituan.android.legwork.common.user.a.a().d() + CommonConstant.Symbol.UNDERLINE + str;
        }
        boolean a = z.a(com.meituan.android.legwork.a.a(), str);
        if (promise != null) {
            promise.resolve(Integer.valueOf(a ? 1 : 0));
        }
    }

    @ReactMethod
    public void isPageDegrade(@Nonnull ReadableMap readableMap, @Nonnull Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "534648cbf7e00885dd1338f69ce54af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "534648cbf7e00885dd1338f69ce54af1");
            return;
        }
        try {
            x.c("CommonBridgeModule.isPageDegrade()", "调用桥storeStorage, 参数：param:" + readableMap.toString());
            HashMap<String, Object> hashMap = readableMap.toHashMap();
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                hashMap2.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            Pair<Boolean, String> a = com.meituan.android.legwork.mrn.b.a().a(hashMap2);
            if (((Boolean) a.first).booleanValue()) {
                WritableMap createMap = Arguments.createMap();
                if (!TextUtils.isEmpty((CharSequence) a.second)) {
                    createMap.putString("degradeText", (String) a.second);
                }
                x.c("CommonBridgeModule.isPageDegrade()", "调用桥storeStorage成功，返回结果：arg:" + createMap.toString());
                promise.resolve(createMap);
                return;
            }
            x.c("CommonBridgeModule.isPageDegrade()", "调用桥storeStorage成功，返回结果：未降级");
            promise.reject("0", "not degrade");
        } catch (Exception e) {
            x.a(e);
            x.e("CommonBridgeModule.isPageDegrade()", "isPageDegrade error, exception msg:", e);
            promise.reject(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f  */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void shareOperation(int r31, java.lang.String r32, java.lang.String r33, final com.facebook.react.bridge.Promise r34) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.mrn.bridge.CommonBridgeModule.shareOperation(int, java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    public static /* synthetic */ void lambda$shareOperation$10(Promise promise, int i, int i2) {
        Object[] objArr = {promise, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2117002576e518a8013e37f534de537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2117002576e518a8013e37f534de537");
            return;
        }
        x.a(TAG, String.format("only share to friend %d %d", Integer.valueOf(i), Integer.valueOf(i2)));
        promise.resolve(i2 == 1 ? SHARE_SUCCESS : SHARE_CANCEL);
    }

    @ReactMethod
    public void addABTestParam(String str, String str2, Promise promise) {
        String str3;
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d81655d4020ae1d379ccfed224168d23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d81655d4020ae1d379ccfed224168d23");
            return;
        }
        x.c("CommonBridgeModule.addABTestParam()", "调用桥addABTestParam，参数：key：" + str + "，value：" + str2);
        com.meituan.android.legwork.utils.b a = com.meituan.android.legwork.utils.b.a();
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.utils.b.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "c45030f955ecd1f3d3fb38b1e44f1824", RobustBitConfig.DEFAULT_VALUE)) {
            str3 = (String) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "c45030f955ecd1f3d3fb38b1e44f1824");
        } else if (TextUtils.isEmpty(str) || a.d == null) {
            str3 = "0";
        } else {
            a.d.put(str, str2);
            str3 = "1";
        }
        if (promise == null) {
            return;
        }
        x.c("CommonBridgeModule.addABTestParam()", "调用桥addABTestParam成功，返回结果：result：" + str3);
        promise.resolve(str3);
    }

    @ReactMethod
    public void preloadBundle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bee4986eea836ba2c8ef4ee0997d05e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bee4986eea836ba2c8ef4ee0997d05e");
            return;
        }
        com.meituan.android.legwork.mrn.b a = com.meituan.android.legwork.mrn.b.a();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.mrn.b.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "700ce58a5a91e4cd43373f674c2ab8a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "700ce58a5a91e4cd43373f674c2ab8a2");
        } else if (PmUtil.a() == 1 || TextUtils.isEmpty(str)) {
        } else {
            if (!a.b("legwork-preload-bundle-switch")) {
                x.a("mrn", "预加载开关没有打开");
            } else if (a.b.contains(str)) {
                x.a("mrn", "已经预加载过了");
            } else {
                x.b("MRNUtils.preloadBundle()", "预加载:" + str);
                a.b.add(str);
                Context a2 = com.meituan.android.legwork.a.a();
                u.a(a2, "rn_banma_" + str);
            }
        }
    }

    @ReactMethod
    public void computeTextHeight(float f, float f2, float f3, @NonNull ReadableArray readableArray, Promise promise) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), readableArray, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a4417d32734bdf30b3b88b97a5ce0e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a4417d32734bdf30b3b88b97a5ce0e2");
            return;
        }
        if (f > 0.0f && f2 > 0.0f && f3 > 0.0f && readableArray != null) {
            try {
                if (readableArray.size() > 0) {
                    TextPaint textPaint = new TextPaint();
                    textPaint.setTextSize(com.meituan.android.legwork.utils.h.a(f));
                    WritableNativeArray writableNativeArray = new WritableNativeArray();
                    if (Build.VERSION.SDK_INT >= 23) {
                        int size = readableArray.size();
                        for (int i = 0; i < size; i++) {
                            String string = readableArray.getString(i);
                            writableNativeArray.pushDouble(StaticLayout.Builder.obtain(string, 0, string.length(), textPaint, com.meituan.android.legwork.utils.h.a(f2)).build().getLineCount() * f3);
                        }
                    } else {
                        int size2 = readableArray.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            writableNativeArray.pushDouble(new StaticLayout(readableArray.getString(i2), textPaint, com.meituan.android.legwork.utils.h.a(f2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() * f3);
                        }
                    }
                    if (promise != null) {
                        promise.resolve(writableNativeArray);
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                x.a(e);
                if (promise != null) {
                    promise.reject("computeTextHeightError", e.getMessage());
                    return;
                }
                return;
            }
        }
        promise.reject("computeTextHeight param error", " fontSize or textWidth or lineHeight or textArray.size is 0");
    }

    @ReactMethod
    public void reportLogan() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3b87aa44558b33ea54c95a5524d8fbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3b87aa44558b33ea54c95a5524d8fbd");
        } else {
            x.b("clickService");
        }
    }

    @ReactMethod
    public void getBaseInfo(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "818f6a3233ac731164527c5e54fe554e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "818f6a3233ac731164527c5e54fe554e");
            return;
        }
        x.c("BMLWMRNBridge.getBaseInfo()", "getBaseInfo");
        Map<String, String> b = com.meituan.android.legwork.net.util.a.b();
        HashMap hashMap = new HashMap(b.size());
        for (Map.Entry<String, String> entry : b.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        com.meituan.android.legwork.common.hostInfo.b.e();
        hashMap.put("wm_did", "");
        hashMap.put("chosen_longitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().h())));
        hashMap.put("chosen_latitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().i())));
        hashMap.put("chosen_city", com.meituan.android.legwork.common.location.c.l().g());
        hashMap.put("chosen_city_id", com.meituan.android.legwork.common.location.c.l().j());
        hashMap.put("locate_longitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().b())));
        hashMap.put("locate_latitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().c())));
        hashMap.put("locate_city", com.meituan.android.legwork.common.location.c.l().d());
        hashMap.put("locate_accuracy", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().f())));
        hashMap.put("default_longitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().b)));
        hashMap.put("default_latitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().c)));
        hashMap.put("default_city", com.meituan.android.legwork.common.location.c.l().d);
        hashMap.put("default_city_id", com.meituan.android.legwork.common.location.c.l().g);
        hashMap.put("default_city_type", String.valueOf(com.meituan.android.legwork.common.location.c.l().h));
        com.meituan.android.legwork.statistics.a.a(hashMap);
        com.meituan.android.legwork.statistics.a.b(hashMap);
        com.meituan.android.legwork.common.hostInfo.b.e();
        hashMap.put("ctype", com.meituan.android.legwork.common.hostInfo.b.h());
        hashMap.put("customPushtoken", com.meituan.android.legwork.common.hostInfo.b.e().b());
        hashMap.put("token", com.meituan.android.legwork.common.user.a.a().f());
        hashMap.put("apiHost", com.meituan.android.legwork.net.b.a().a(com.meituan.android.legwork.a.b));
        try {
            JSONObject jSONObject = new JSONObject();
            com.meituan.android.legwork.utils.b.a().a(jSONObject);
            hashMap.put("abtestinfo", jSONObject.toString());
        } catch (Exception e) {
            x.e("BMLWMRNBridge.getBaseInfo()", "exception msg:", e);
            x.a(e);
        }
        x.c("BMLWMRNBridge.getBaseInfo()", "桥返回结果：" + hashMap.toString());
        promise.resolve(Arguments.makeNativeMap(hashMap));
    }

    @ReactMethod
    public void getClientConfig(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e581b844849eced47b9fa63a05d4a9b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e581b844849eced47b9fa63a05d4a9b7");
            return;
        }
        String str = com.meituan.android.legwork.common.util.a.a().c;
        x.c("MRNBridge", "getClientConfig:result:" + str);
        if (promise == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            promise.reject("0", "getClientConfig 本地内容是空");
        } else {
            promise.resolve(str);
        }
    }

    @ReactMethod
    public void setGlobalTempStorage(String str, String str2, Promise promise) {
        boolean z = false;
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "022d127d7cdb2353dd27a77bef771758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "022d127d7cdb2353dd27a77bef771758");
            return;
        }
        r rVar = r.a.a;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect3 = r.a;
        if (PatchProxy.isSupport(objArr2, rVar, changeQuickRedirect3, false, "c0ebfe622d059ebce64a33e6fdc48238", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, rVar, changeQuickRedirect3, false, "c0ebfe622d059ebce64a33e6fdc48238")).booleanValue();
        } else if (str != null && str2 != null) {
            rVar.b.put(str, str2);
            z = true;
        }
        if (z) {
            promise.resolve(Boolean.valueOf(z));
        } else {
            promise.reject("", "存储mrnGlobleMap失败");
        }
    }

    @ReactMethod
    public void getGlobalTempStorage(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16294cdff4ba9c3450dcbe1be47947bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16294cdff4ba9c3450dcbe1be47947bc");
        } else if (str == null) {
            promise.reject("", "读取mrnGlobleMap失败");
        } else {
            r rVar = r.a.a;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = r.a;
            promise.resolve(PatchProxy.isSupport(objArr2, rVar, changeQuickRedirect3, false, "4e88d78c22c9d78908e6cdcea2321c1e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, rVar, changeQuickRedirect3, false, "4e88d78c22c9d78908e6cdcea2321c1e") : rVar.b.get(str));
        }
    }

    @ReactMethod
    public void clearAllGlobalTempStorage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66fb8fbb921bf4dbe668693c45c41737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66fb8fbb921bf4dbe668693c45c41737");
        } else {
            r.a.a.a();
        }
    }

    @ReactMethod
    public void clearGlobalTempStorage(String str, Promise promise) {
        boolean z = false;
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bea7f1ededb9692172e2dfdae1cd9bcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bea7f1ededb9692172e2dfdae1cd9bcd");
            return;
        }
        r rVar = r.a.a;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = r.a;
        if (PatchProxy.isSupport(objArr2, rVar, changeQuickRedirect3, false, "52b8cf41c05d67a8a058c5e046394e59", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, rVar, changeQuickRedirect3, false, "52b8cf41c05d67a8a058c5e046394e59")).booleanValue();
        } else if (str != null) {
            rVar.b.remove(str);
            z = true;
        }
        if (z) {
            promise.resolve(Boolean.valueOf(z));
        } else {
            promise.reject("", "移除mrnGlobleMap失败");
        }
    }
}
