package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMCrashMockModule extends ReactContextBaseJavaModule {
    private static final List<a> SOURCE_DATA;
    private static final String SP_KEY_CRASH_CONFIG = "sp_key_crash_config";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMMockCrashNativeModule";
    }

    public WMCrashMockModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba587ba182fd1238a0b27124296f846f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba587ba182fd1238a0b27124296f846f");
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        SOURCE_DATA = arrayList;
        arrayList.add(new a(1, "空指针：NullPointerException"));
        SOURCE_DATA.add(new a(2, "数组越界：ArrayIndexOutOfBoundsException"));
        SOURCE_DATA.add(new a(3, "参数不合法：IllegalArgumentException"));
        SOURCE_DATA.add(new a(4, "查无此类：ClassNotFoundException"));
        SOURCE_DATA.add(new a(5, "数值类型转换错误：NumberFormatException"));
        SOURCE_DATA.add(new a(6, "类强转错误：ClassCastException"));
        SOURCE_DATA.add(new a(7, "并发错误：ConcurrentModificationException"));
    }

    @ReactMethod
    public void triggerCrash(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4988d659c3293acfc19ce5ea48fc68a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4988d659c3293acfc19ce5ea48fc68a");
        } else if (isCurrentActivityValid()) {
            runUIThread(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMCrashMockModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4f0e10df5cdf5952921691a40c794473", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4f0e10df5cdf5952921691a40c794473");
                        return;
                    }
                    if (readableMap.hasKey("errorNo") && !readableMap.isNull("errorNo")) {
                        i = readableMap.getInt("errorNo");
                    }
                    switch (i) {
                        case 1:
                            throw new NullPointerException();
                        case 2:
                            throw new ArrayIndexOutOfBoundsException();
                        case 3:
                            throw new IllegalArgumentException();
                        case 4:
                            throw new ActivityNotFoundException();
                        case 5:
                            throw new NumberFormatException();
                        case 6:
                            throw new ClassCastException();
                        case 7:
                            throw new ConcurrentModificationException();
                        default:
                            return;
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getCrashList(Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f6e1ba5a06e8aa659537f84dbd6444e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f6e1ba5a06e8aa659537f84dbd6444e");
        } else if (isCurrentActivityValid()) {
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (int i = 0; i < SOURCE_DATA.size(); i++) {
                a aVar = SOURCE_DATA.get(i);
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("errorNo", aVar.a);
                writableNativeMap.putString(GearsLocator.DETAIL, aVar.b);
                writableNativeArray.pushMap((WritableMap) writableNativeMap);
            }
            if (callback != null) {
                callback.invoke(writableNativeArray);
            }
        }
    }

    @ReactMethod
    public void getMockCrashEnabled(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f1b1c77a2fa555d1b8ce21035044b2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f1b1c77a2fa555d1b8ce21035044b2e");
        } else if (isCurrentActivityValid()) {
            runUIThread(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMCrashMockModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fc3c75490d3de9f51151bfefbc5a7b3b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fc3c75490d3de9f51151bfefbc5a7b3b");
                        return;
                    }
                    String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, WMCrashMockModule.SP_KEY_CRASH_CONFIG, "");
                    if (TextUtils.isEmpty(b)) {
                        promise.reject("101", "horn cache string is empty");
                    } else {
                        promise.resolve(b);
                    }
                    Horn.debug(com.meituan.android.singleton.b.a, com.sankuai.waimai.foundation.core.a.b());
                    Horn.register("crash_mock_configs", new HornCallback() { // from class: com.sankuai.waimai.reactnative.modules.WMCrashMockModule.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.common.horn.HornCallback
                        public final void onChanged(boolean z, String str) {
                            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1bb75b93f01ae8eb548551fbe6dd1287", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1bb75b93f01ae8eb548551fbe6dd1287");
                            } else if (!z || TextUtils.isEmpty(str)) {
                            } else {
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, WMCrashMockModule.SP_KEY_CRASH_CONFIG, str);
                            }
                        }
                    });
                }
            });
        }
    }

    private void runUIThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af0aa4067007a79c83cb37ac5e0c8bb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af0aa4067007a79c83cb37ac5e0c8bb5");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        currentActivity.runOnUiThread(runnable);
    }

    private boolean isCurrentActivityValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3636feb13d52693867cf209ca6a40f36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3636feb13d52693867cf209ca6a40f36")).booleanValue();
        }
        Activity currentActivity = getCurrentActivity();
        return (currentActivity == null || currentActivity.isFinishing()) ? false : true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        @SerializedName("errorNo")
        public int a;
        @SerializedName(GearsLocator.DETAIL)
        public String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }
}
