package com.facebook.react.modules.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.f;
import com.meituan.android.mrn.privacy.a;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
@ReactModule(name = PermissionsModule.NAME)
/* loaded from: classes.dex */
public class PermissionsModule extends ReactContextBaseJavaModule implements f {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> mCallbacks;
    private int mRequestCode;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRequestCode = 0;
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
        this.mCallbacks = new SparseArray<>();
    }

    @ReactMethod
    public void checkPermission(String str, Promise promise) {
        com.meituan.android.mrn.horn.f.a().a(getReactApplicationContext(), "PermissionsAndroid.checkPermission");
        checkPermissionForPrivacy(str, "", promise);
    }

    @ReactMethod
    public void checkPermissionForPrivacy(String str, String str2, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve(Boolean.valueOf(a.b(baseContext, str, str2)));
        } else {
            promise.resolve(Boolean.valueOf(a.b(baseContext, str, str2)));
        }
    }

    @ReactMethod
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        com.meituan.android.mrn.horn.f.a().a(getReactApplicationContext(), "PermissionsAndroid.shouldShowRequestPermissionRationale");
        shouldShowRequestPermissionRationaleForPrivacy(str, "", promise);
    }

    @ReactMethod
    public void shouldShowRequestPermissionRationaleForPrivacy(String str, String str2, Promise promise) {
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        try {
            Activity currentActivity = getCurrentActivity();
            boolean z = false;
            Object[] objArr = {currentActivity, str, str2};
            ChangeQuickRedirect changeQuickRedirect = a.a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93e7d216e857b951e02b7f681ce1052c", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93e7d216e857b951e02b7f681ce1052c")).booleanValue();
            } else if (a.a(currentActivity, str, str2) == -7) {
                z = true;
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, e);
        }
    }

    @ReactMethod
    public void requestPermission(String str, Promise promise) {
        com.meituan.android.mrn.horn.f.a().a(getReactApplicationContext(), "PermissionsAndroid.requestPermission");
        requestPermissionForPrivacy(str, "", promise);
    }

    @ReactMethod
    public void requestPermissionForPrivacy(final String str, final String str2, final Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve(getCheckHasPermissionStr(baseContext, str, str2));
        } else if (a.b(baseContext, str, str2)) {
            promise.resolve("granted");
        } else {
            try {
                final int i = this.mRequestCode;
                this.mCallbacks.put(i, new Callback() { // from class: com.facebook.react.modules.permissions.PermissionsModule.1
                    @Override // com.facebook.react.bridge.Callback
                    public final void invoke(Object... objArr) {
                        int[] iArr = (int[]) objArr[0];
                        if (iArr.length <= 0 || !a.a(iArr[0])) {
                            promise.resolve(a.a(PermissionsModule.this.getCurrentActivity(), str, str2, "denied", "never_ask_again"));
                            return;
                        }
                        promise.resolve("granted");
                    }
                });
                a.a(getCurrentActivity(), str, str2, new d() { // from class: com.facebook.react.modules.permissions.PermissionsModule.2
                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str3, int i2) {
                        PermissionsModule.this.onRequestPermissionsResult(i, new String[]{str}, new int[]{i2});
                    }
                });
                this.mRequestCode++;
            } catch (IllegalStateException e) {
                promise.reject(ERROR_INVALID_ACTIVITY, e);
            }
        }
    }

    private String getCheckHasPermissionStr(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a.a;
        int intValue = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3756f5bfb59f5a4e744e2df256266123", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3756f5bfb59f5a4e744e2df256266123")).intValue() : a.a(context, str, str2);
        if (a.a(intValue)) {
            return "granted";
        }
        com.facebook.common.logging.a.b("[PermissionsModule@checkHasPermission]", "check permission denied: ", str + ",code: " + intValue);
        return "denied";
    }

    @ReactMethod
    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        com.meituan.android.mrn.horn.f.a().a(getReactApplicationContext(), "PermissionsAndroid.requestMultiplePermissions");
        requestMultiplePermissionsForPrivacy(readableArray, "", promise);
    }

    @ReactMethod
    public void requestMultiplePermissionsForPrivacy(ReadableArray readableArray, final String str, final Promise promise) {
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            if (Build.VERSION.SDK_INT < 23) {
                writableNativeMap.putString(string, getCheckHasPermissionStr(baseContext, string, str));
                i++;
            } else if (a.b(baseContext, string, str)) {
                writableNativeMap.putString(string, "granted");
                i++;
            } else {
                arrayList.add(string);
            }
        }
        if (readableArray.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            final int i3 = this.mRequestCode;
            this.mCallbacks.put(i3, new Callback() { // from class: com.facebook.react.modules.permissions.PermissionsModule.3
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object... objArr) {
                    int[] iArr = (int[]) objArr[0];
                    String[] strArr = (String[]) objArr[2];
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        String str2 = strArr[i4];
                        if (iArr.length > 0 && a.a(iArr[i4])) {
                            writableNativeMap.putString(str2, "granted");
                        } else {
                            writableNativeMap.putString(str2, a.a(PermissionsModule.this.getCurrentActivity(), str2, str, "denied", "never_ask_again"));
                        }
                    }
                    promise.resolve(writableNativeMap);
                }
            });
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            int i4 = 0;
            while (i4 < arrayList.size()) {
                final ArrayList arrayList4 = arrayList;
                a.a(getCurrentActivity(), (String) arrayList.get(i4), str, new d() { // from class: com.facebook.react.modules.permissions.PermissionsModule.4
                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str2, int i5) {
                        arrayList2.add(str2);
                        arrayList3.add(Integer.valueOf(i5));
                        if (arrayList2.size() == arrayList4.size()) {
                            int[] iArr = new int[arrayList3.size()];
                            for (int i6 = 0; i6 < iArr.length; i6++) {
                                iArr[i6] = ((Integer) arrayList3.get(i6)).intValue();
                            }
                            PermissionsModule.this.onRequestPermissionsResult(i3, (String[]) arrayList2.toArray(new String[0]), iArr);
                        }
                    }
                });
                i4++;
                arrayList = arrayList;
            }
            this.mRequestCode++;
        } catch (IllegalStateException e) {
            promise.reject(ERROR_INVALID_ACTIVITY, e);
        }
    }

    @Override // com.facebook.react.modules.core.f
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mCallbacks.get(i).invoke(iArr, getCurrentActivity(), strArr);
        this.mCallbacks.remove(i);
        return this.mCallbacks.size() == 0;
    }
}
