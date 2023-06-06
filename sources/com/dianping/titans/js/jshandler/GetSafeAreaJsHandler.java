package com.dianping.titans.js.jshandler;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.UIUtil;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetSafeAreaJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50b2c37aa6d89a50c835b4bd6b797dca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50b2c37aa6d89a50c835b4bd6b797dca");
            return;
        }
        if (jsHost() == null || jsHost().getActivity() == null) {
            jsCallbackErrorMsg("no host");
        }
        getSafeArea(jsHost().getActivity().getWindow().getDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void successCallback(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da6c9533b691b3b342fde4f3f7460dbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da6c9533b691b3b342fde4f3f7460dbc");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("left", i3);
            jSONObject.put("top", i);
            jSONObject.put("right", i4);
            jSONObject.put("bottom", i2);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }

    private void getSafeArea(final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "099aaa873e86d65c32b7f4c16b56ea47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "099aaa873e86d65c32b7f4c16b56ea47");
        } else if (Build.VERSION.SDK_INT >= 23) {
            view.post(new Runnable() { // from class: com.dianping.titans.js.jshandler.GetSafeAreaJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b6e34c248b12d4071cb9b0288f612180", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b6e34c248b12d4071cb9b0288f612180");
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
                            } else {
                                List<Rect> boundingRects = displayCutout.getBoundingRects();
                                if (boundingRects != null && boundingRects.size() != 0) {
                                    systemWindowInsetLeft = displayCutout.getSafeInsetLeft();
                                    systemWindowInsetTop = displayCutout.getSafeInsetTop();
                                    systemWindowInsetRight = displayCutout.getSafeInsetRight();
                                    systemWindowInsetBottom = displayCutout.getSafeInsetBottom();
                                }
                                Log.e("SafeAreaView", "rects==null || rects.size()==0, is not notch screen");
                            }
                        }
                        GetSafeAreaJsHandler.this.successCallback(GetSafeAreaJsHandler.this.px2dip(context, systemWindowInsetTop), GetSafeAreaJsHandler.this.px2dip(context, systemWindowInsetBottom), GetSafeAreaJsHandler.this.px2dip(context, systemWindowInsetLeft), GetSafeAreaJsHandler.this.px2dip(context, systemWindowInsetRight));
                    } catch (Throwable th) {
                        GetSafeAreaJsHandler getSafeAreaJsHandler = GetSafeAreaJsHandler.this;
                        getSafeAreaJsHandler.jsCallbackError(8, "system api error: " + th.getMessage());
                    }
                }
            });
        } else {
            Context context = view.getContext();
            successCallback(px2dip(context, UIUtil.getStatusBarHeight(context)), 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int px2dip(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cef0685b0913fff85f7b8dbcdc1c832", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cef0685b0913fff85f7b8dbcdc1c832")).intValue() : (int) ((i / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
