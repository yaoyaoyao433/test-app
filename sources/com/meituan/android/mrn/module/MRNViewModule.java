package com.meituan.android.mrn.module;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = MRNViewModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNViewModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNViewModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abe882f15c9f7a3ac1e593330fbbedb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abe882f15c9f7a3ac1e593330fbbedb3");
        }
    }

    @ReactMethod
    public void setViewSize(final int i, final int i2, final int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44a56416699384c4b252ead488e354e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44a56416699384c4b252ead488e354e5");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.MRNViewModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "237b3a3a37eaa7560d5519f38750e09a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "237b3a3a37eaa7560d5519f38750e09a");
                        return;
                    }
                    Activity currentActivity = MRNViewModule.this.getCurrentActivity();
                    if (currentActivity == null) {
                        return;
                    }
                    View mRNBaseView = MRNViewModule.this.getMRNBaseView(currentActivity.findViewById(i));
                    if (mRNBaseView == null || !(mRNBaseView.getLayoutParams() instanceof ViewGroup.LayoutParams)) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = mRNBaseView.getLayoutParams();
                    layoutParams.width = i2;
                    layoutParams.height = i3;
                    mRNBaseView.setLayoutParams(layoutParams);
                }
            });
        }
    }

    @ReactMethod
    public void setViewVisible(final int i, final int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be8fbae3069ad06bf503b5a8f779dde0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be8fbae3069ad06bf503b5a8f779dde0");
        } else {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.MRNViewModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3862319a1bdba1f76ff7b91e81674893", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3862319a1bdba1f76ff7b91e81674893");
                        return;
                    }
                    Activity currentActivity = MRNViewModule.this.getCurrentActivity();
                    if (currentActivity == null) {
                        return;
                    }
                    View mRNBaseView = MRNViewModule.this.getMRNBaseView(currentActivity.findViewById(i));
                    if (mRNBaseView != null) {
                        int visibility = mRNBaseView.getVisibility();
                        if (i2 == -1 && visibility != 8) {
                            mRNBaseView.setVisibility(8);
                        } else if (i2 == 0 && visibility != 4) {
                            mRNBaseView.setVisibility(4);
                        } else if (i2 != 1 || visibility == 0) {
                        } else {
                            mRNBaseView.setVisibility(0);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getMRNBaseView(View view) {
        while (true) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9081a7152d880bb413e8e7da69b90a27", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9081a7152d880bb413e8e7da69b90a27");
            }
            if (view == null || !(view.getParent() instanceof View)) {
                return null;
            }
            view = (View) view.getParent();
        }
    }
}
