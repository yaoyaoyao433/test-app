package com.dianping.titans.js.jshandler;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.widget.SearchTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetNavigationBarHiddenJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4841257b4c306b973fdd30c25f9a8f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4841257b4c306b973fdd30c25f9a8f0");
            return;
        }
        int optInt = jsBean().argsJson.optInt("flag");
        if (jsHost().getTitleBarHost() == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", "fail");
                jSONObject.put("errMsg", "TitleBar is null");
            } catch (JSONException unused) {
            }
            jsCallback(jSONObject);
        } else if (optInt == 1) {
            doAnimation(false);
        } else if (optInt == 0) {
            doAnimation(true);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("status", "fail");
                jSONObject2.put("errMsg", "UNIMPLEMENTED PARAMETERS");
            } catch (JSONException unused2) {
            }
            jsCallback(jSONObject2);
        }
    }

    private void doAnimation(final boolean z) {
        final int height;
        int i = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6318b36955ec8637efd877a0d156283f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6318b36955ec8637efd877a0d156283f");
            return;
        }
        ITitleBar titleBarHost = jsHost().getTitleBarHost();
        final LinearLayout layWeb = jsHost().getLayWeb();
        if (layWeb != null && (titleBarHost instanceof View)) {
            final View view = (View) titleBarHost;
            if ((z && view.getVisibility() == 0) || (!z && view.getVisibility() != 0)) {
                jsCallback();
                return;
            }
            final int height2 = view.getHeight();
            if (z) {
                ViewGroup.LayoutParams layoutParams = layWeb.getLayoutParams();
                int height3 = layWeb.getHeight() + height2;
                layoutParams.height = height3;
                layWeb.setLayoutParams(layoutParams);
                layWeb.setY(-height2);
                setTitleBarVisibility(view, 0);
                height = height3;
            } else {
                i = -height2;
                height = layWeb.getHeight();
            }
            layWeb.animate().setDuration(250L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.dianping.titans.js.jshandler.SetNavigationBarHiddenJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb8a7af782bf25317ed12b78e1c49752", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb8a7af782bf25317ed12b78e1c49752");
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = layWeb.getLayoutParams();
                    int round = Math.round(valueAnimator.getAnimatedFraction() * height2);
                    if (z) {
                        layoutParams2.height = height - round;
                    } else {
                        layoutParams2.height = height + round;
                    }
                    if (valueAnimator.getAnimatedFraction() == 1.0f) {
                        layoutParams2.height = -1;
                        if (!z) {
                            SetNavigationBarHiddenJsHandler.this.setTitleBarVisibility(view, 8);
                        }
                        layWeb.setY(0.0f);
                        SetNavigationBarHiddenJsHandler.this.jsCallback();
                    }
                    layWeb.setLayoutParams(layoutParams2);
                }
            }).translationY(i).start();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errMsg", "layout is null or baseTitleBar is not a view");
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBarVisibility(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b2e54db5a017fbc1f3a61ce8bac9d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b2e54db5a017fbc1f3a61ce8bac9d01");
        } else if (view instanceof SearchTitleBar) {
            ((SearchTitleBar) view).setTitleBarVisibility(i);
        } else {
            view.setVisibility(i);
        }
    }
}
