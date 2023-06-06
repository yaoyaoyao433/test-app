package com.meituan.android.mrn.module;

import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.component.utils.YellowBox;
import com.meituan.android.mrn.module.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.ui.widget.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = "Toast")
/* loaded from: classes2.dex */
public class MRNToastModule extends ReactContextBaseJavaModule {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    private static final int HUNDRED = 100;
    private static final int THOUSAND = 1000;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Toast";
    }

    public MRNToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "468e9b8e0490fa279abd6e956e3d2eaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "468e9b8e0490fa279abd6e956e3d2eaf");
        }
    }

    @ReactMethod
    public void showTop(final String str, final int i, final int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fcd7b6a44fb2bd188e2805ee1a25e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fcd7b6a44fb2bd188e2805ee1a25e76");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.module.MRNToastModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "569390ab53f4f8e6e2f1ed9647c53c1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "569390ab53f4f8e6e2f1ed9647c53c1e");
                        return;
                    }
                    Activity currentActivity = MRNToastModule.this.getCurrentActivity();
                    String str2 = str;
                    int i3 = i;
                    int i4 = i2;
                    Object[] objArr3 = {currentActivity, str2, Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect4 = f.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "cd77fd01684aecc1fd237f0697db5422", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "cd77fd01684aecc1fd237f0697db5422");
                    } else if (currentActivity != null) {
                        int a2 = f.a(i3);
                        View a3 = f.a(currentActivity, i4);
                        if (a3 != null) {
                            new a(a3, str2, a2).e(17).a();
                        }
                    }
                }
            });
        }
    }

    @ReactMethod
    public void show(final String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f28d5eb1518d90d75a323b4da1a7562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f28d5eb1518d90d75a323b4da1a7562");
            return;
        }
        YellowBox.a(getReactApplicationContext(), "MRNComponents 组件库的 Toast 组件已被废弃不再维护，请尽快使用 MTD 中的 Toast 替代");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.module.MRNToastModule.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "49d22b605398d7a99963f12940de1416", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "49d22b605398d7a99963f12940de1416");
                    return;
                }
                Activity currentActivity = MRNToastModule.this.getCurrentActivity();
                String str2 = str;
                int i2 = i;
                Object[] objArr3 = {currentActivity, str2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "2c4eecf535a8b4ce2ba12f681eb2afe0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "2c4eecf535a8b4ce2ba12f681eb2afe0");
                } else if (currentActivity != null) {
                    new a(currentActivity, str2, f.a(i2)).e(17).a();
                }
            }
        });
    }

    @ReactMethod
    public void showTopWithGravity(final String str, final int i, final int i2, final int i3) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb4e702ed538cda650d6e613bf872d71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb4e702ed538cda650d6e613bf872d71");
            return;
        }
        YellowBox.a(getReactApplicationContext(), "MRNComponents 组件库的 Toast 组件已被废弃不再维护，请尽快使用 MTD 中的 Toast 替代");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.module.MRNToastModule.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7683447a49719ad893f908dfbb9cf6d2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7683447a49719ad893f908dfbb9cf6d2");
                    return;
                }
                Activity currentActivity = MRNToastModule.this.getCurrentActivity();
                String str2 = str;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                Object[] objArr3 = {currentActivity, str2, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "79e76f5d1fd1090b57734b52482778af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "79e76f5d1fd1090b57734b52482778af");
                } else if (currentActivity != null) {
                    new a(f.a(currentActivity, i6), str2, f.a(i4)).e(i5).a();
                }
            }
        });
    }

    @ReactMethod
    public void showWithGravity(final String str, final int i, final int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e2754d6efac7ceaa14fbb9af0694e87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e2754d6efac7ceaa14fbb9af0694e87");
            return;
        }
        YellowBox.a(getReactApplicationContext(), "MRNComponents 组件库的 Toast 组件已被废弃不再维护，请尽快使用 MTD 中的 Toast 替代");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.module.MRNToastModule.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "202e88b7b6fb86eff2d427e29ec3a27a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "202e88b7b6fb86eff2d427e29ec3a27a");
                    return;
                }
                Activity currentActivity = MRNToastModule.this.getCurrentActivity();
                String str2 = str;
                int i3 = i;
                int i4 = i2;
                Object[] objArr3 = {currentActivity, str2, Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "f45eb41d2c21a38c790fd8c2825fcc3e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "f45eb41d2c21a38c790fd8c2825fcc3e");
                } else if (currentActivity != null) {
                    new a(currentActivity, str2, f.a(i3)).e(i4).a();
                }
            }
        });
    }

    @ReactMethod
    public void showTopWithGravityAndMargin(final String str, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b6cf874caea77fbf548e41156a0dae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b6cf874caea77fbf548e41156a0dae0");
            return;
        }
        YellowBox.a(getReactApplicationContext(), "MRNComponents 组件库的 Toast 组件已被废弃不再维护，请尽快使用 MTD 中的 Toast 替代");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.module.MRNToastModule.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "84c196f2cc0f7f932b3b6566cff415f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "84c196f2cc0f7f932b3b6566cff415f5");
                    return;
                }
                Activity currentActivity = MRNToastModule.this.getCurrentActivity();
                String str2 = str;
                int i8 = i;
                int i9 = i2;
                int i10 = i3;
                int i11 = i4;
                int i12 = i5;
                int i13 = i6;
                int i14 = i7;
                Object[] objArr3 = {currentActivity, str2, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "bc5398bc8ee38214d2d158463bb6e1ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "bc5398bc8ee38214d2d158463bb6e1ed");
                } else if (currentActivity != null) {
                    new a(f.a(currentActivity, i14), str2, f.a(i8)).e(i9).a(i10, i11, i12, i13).a();
                }
            }
        });
    }

    @ReactMethod
    public void showWithGravityAndMargin(final String str, final int i, final int i2, final int i3, final int i4, final int i5, final int i6) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "562fa3a0a2e790472834cfb8f6188376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "562fa3a0a2e790472834cfb8f6188376");
            return;
        }
        YellowBox.a(getReactApplicationContext(), "MRNComponents 组件库的 Toast 组件已被废弃不再维护，请尽快使用 MTD 中的 Toast 替代");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.android.mrn.module.MRNToastModule.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "46d74fb14a0ae8b0f83ab3e88c9f9240", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "46d74fb14a0ae8b0f83ab3e88c9f9240");
                    return;
                }
                Activity currentActivity = MRNToastModule.this.getCurrentActivity();
                String str2 = str;
                int i7 = i;
                int i8 = i2;
                int i9 = i3;
                int i10 = i4;
                int i11 = i5;
                int i12 = i6;
                Object[] objArr3 = {currentActivity, str2, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "86d05ab61bdd92f9bdf2c9b2de7f6bc0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "86d05ab61bdd92f9bdf2c9b2de7f6bc0");
                } else if (currentActivity != null) {
                    new a(currentActivity, str2, f.a(i7)).e(i8).a(i9, i10, i11, i12).a();
                }
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b0b08ed36aa312c7f267a9d4ca3954a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b0b08ed36aa312c7f267a9d4ca3954a");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DURATION_SHORT_KEY, -1);
        hashMap.put(DURATION_LONG_KEY, 0);
        hashMap.put(GRAVITY_TOP_KEY, 49);
        hashMap.put(GRAVITY_BOTTOM_KEY, 81);
        hashMap.put(GRAVITY_CENTER, 17);
        return hashMap;
    }
}
