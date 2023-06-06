package com.sankuai.titans.jsbridges.base.device;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.jsbridges.base.util.UIUtils;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.jsbridge.RespResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetSafeAreaJsHandler extends DeprecatedJsBridge {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d9131923139659930af5d3ad1a9b0d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d9131923139659930af5d3ad1a9b0d4");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
            jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_UNKNOWN.code(), "no host").create());
        } else {
            getSafeArea(jsHost().getActivity().getWindow().getDecorView());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void successCallback(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f3c3063fdecbaab5455e283718e5e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f3c3063fdecbaab5455e283718e5e96");
        } else {
            jsCallback(new RespResult.Builder().append("left", Integer.valueOf(i3)).append("top", Integer.valueOf(i)).append("right", Integer.valueOf(i4)).append("bottom", Integer.valueOf(i2)).create());
        }
    }

    private void getSafeArea(final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9826037afba66308ae942663bd355eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9826037afba66308ae942663bd355eb");
        } else if (Build.VERSION.SDK_INT >= 23) {
            jsHost().getTitansContext().getServiceManager().getThreadPoolService().executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.jsbridges.base.device.GetSafeAreaJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a04a1f76c1292353b31f7387323c5e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a04a1f76c1292353b31f7387323c5e4");
                        return;
                    }
                    try {
                        WindowInsets rootWindowInsets = view.getRootWindowInsets();
                        int systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                        int systemWindowInsetTop = rootWindowInsets.getSystemWindowInsetTop();
                        int systemWindowInsetRight = rootWindowInsets.getSystemWindowInsetRight();
                        int systemWindowInsetBottom = rootWindowInsets.getSystemWindowInsetBottom();
                        Context context = view.getContext();
                        if (Build.VERSION.SDK_INT >= 28) {
                            DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                            if (displayCutout == null) {
                                Log.e("SafeAreaView", "cutout==null, is not notch screen");
                            } else if (displayCutout.getBoundingRects().size() == 0) {
                                Log.e("SafeAreaView", "rects==null || rects.size()==0, is not notch screen");
                            } else {
                                systemWindowInsetLeft = displayCutout.getSafeInsetLeft();
                                systemWindowInsetTop = displayCutout.getSafeInsetTop();
                                systemWindowInsetRight = displayCutout.getSafeInsetRight();
                                systemWindowInsetBottom = displayCutout.getSafeInsetBottom();
                            }
                        }
                        GetSafeAreaJsHandler.this.successCallback(GetSafeAreaJsHandler.this.px2dip(context, systemWindowInsetTop), GetSafeAreaJsHandler.this.px2dip(context, systemWindowInsetBottom), GetSafeAreaJsHandler.this.px2dip(context, systemWindowInsetLeft), GetSafeAreaJsHandler.this.px2dip(context, systemWindowInsetRight));
                    } catch (Throwable th) {
                        GetSafeAreaJsHandler getSafeAreaJsHandler = GetSafeAreaJsHandler.this;
                        RespResult.Builder builder = new RespResult.Builder();
                        int code = JsHandlerResultInfo.Error_8_SystemApiError.code();
                        getSafeAreaJsHandler.jsCallback(builder.setResultInfo(code, "system api error: " + th.getMessage()).create());
                    }
                }
            });
        } else {
            Context context = view.getContext();
            successCallback(px2dip(context, UIUtils.getStatusBarHeight(context)), 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int px2dip(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf05d73b50aa2e7427659c3753192e8b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf05d73b50aa2e7427659c3753192e8b")).intValue() : (int) ((i / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
