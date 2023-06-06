package com.meituan.mmp.lib.api.coverview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AnimateCoverViewApi extends NativeViewApi<View> {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "viewId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final View b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad26b38fc6b4940aae5bb343516449e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad26b38fc6b4940aae5bb343516449e3");
        }
        throw new UnsupportedOperationException("");
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26399fd0acef4375c0111ee0255d201e", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26399fd0acef4375c0111ee0255d201e") : new String[]{"animateCoverView"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0766cbed99443c1145a739a459cf6973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0766cbed99443c1145a739a459cf6973");
        } else if ("animateCoverView".equals(str)) {
            Object[] objArr2 = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect2 = h;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "469f34fc95152adedc6bfc1524447e18", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "469f34fc95152adedc6bfc1524447e18");
                return;
            }
            d(jSONObject);
            CoverViewWrapper c = c(jSONObject, iApiCallback);
            if (c != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("finalStyle");
                if (optJSONObject == null) {
                    iApiCallback.onFail();
                } else if (c.b(ImageView.class) == null && c.b(TextView.class) == null && c.b(a.class) == null) {
                    iApiCallback.onFail(a("view not found!", new Object[0]));
                } else {
                    float a = p.a(optJSONObject, "left", p.b(c.getX()));
                    float a2 = p.a(optJSONObject, "top", p.b(c.getY()));
                    float optDouble = (float) optJSONObject.optDouble(RecceAnimUtils.SCALE_X, c.getScaleX());
                    int optInt = jSONObject.optInt("duration", 300);
                    String optString = jSONObject.optString("easing", CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c, Constants.GestureMoveEvent.KEY_X, c.getX(), a);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c, Constants.GestureMoveEvent.KEY_Y, c.getY(), a2);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c, "alpha", c.getAlpha(), (float) optJSONObject.optDouble("opacity", c.getAlpha()));
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c, RecceAnimUtils.ROTATION, c.getRotation(), (float) optJSONObject.optDouble(AnimationViewCommandModel.Rotation, c.getRotation()));
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(c, RecceAnimUtils.SCALE_X, c.getScaleX(), optDouble);
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(c, RecceAnimUtils.SCALE_Y, c.getScaleY(), (float) optJSONObject.optDouble(RecceAnimUtils.SCALE_Y, c.getScaleY()));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(optInt);
                    TimeInterpolator timeInterpolator = null;
                    if (optString != null) {
                        if (optString.equals(CoverViewAnimateUtil.MSCAnimatedParams.EASING_EASE)) {
                            timeInterpolator = new AccelerateDecelerateInterpolator();
                        } else if (optString.equals("ease-in")) {
                            timeInterpolator = new AccelerateInterpolator();
                        } else if (optString.equals("ease-out")) {
                            timeInterpolator = new DecelerateInterpolator();
                        }
                    }
                    if (timeInterpolator == null) {
                        timeInterpolator = new LinearInterpolator();
                    }
                    animatorSet.setInterpolator(timeInterpolator);
                    animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.meituan.mmp.lib.api.coverview.AnimateCoverViewApi.1
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            Object[] objArr3 = {animator};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4f47620a8de7c451bb447f9ed3b5eac7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4f47620a8de7c451bb447f9ed3b5eac7");
                            } else {
                                iApiCallback.onSuccess(null);
                            }
                        }
                    });
                    animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
                    animatorSet.start();
                }
            }
        }
    }
}
