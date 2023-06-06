package com.dianping.picasso.creator;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.picasso.PicassoAction;
import com.dianping.picasso.PicassoCanvasClipper;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.GroupModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.model.params.PicassoModelParams;
import com.dianping.picasso.view.PicassoButton;
import com.dianping.picasso.view.command.BaseViewCommandModel;
import com.dianping.picasso.view.command.CommandViewInterface;
import com.dianping.picasso.view.command.CornerRadiusModel;
import com.dianping.picasso.view.command.GradientBackgroundModel;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class BaseViewWrapper<T extends View, M extends PicassoModel> implements CommandViewInterface {
    public static JSONObject DEFAULT_SIZE = null;
    private static final String TAG = "BaseViewWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean bindAction(T t, M m, String str) {
        return false;
    }

    public abstract T createView(Context context);

    public abstract DecodingFactory<M> getDecodingFactory();

    public PicassoModel[] getSubModels(M m) {
        return null;
    }

    public void unbindActions(T t, M m) {
    }

    public abstract void updateView(T t, PicassoView picassoView, M m, M m2);

    static {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", 0);
            jSONObject.put("height", 0);
            DEFAULT_SIZE = jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public T initView(Context context, M m, PicassoView picassoView) {
        Object[] objArr = {context, m, picassoView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e9ef308cb97ac7b1c1db367075a9a12", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e9ef308cb97ac7b1c1db367075a9a12");
        }
        T createView = createView(context);
        if (picassoView.getViewProcessor() != null) {
            picassoView.getViewProcessor().onInitView(createView, m);
        }
        if (picassoView != null && (createView instanceof PicassoButton)) {
            ((PicassoButton) createView).setNotificationCenter(picassoView.mNotificationCenter);
        }
        return createView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (r27.key == r0.key) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void refreshView(T r26, M r27, com.dianping.picasso.PicassoView r28) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.picasso.creator.BaseViewWrapper.refreshView(android.view.View, com.dianping.picasso.model.PicassoModel, com.dianping.picasso.PicassoView):void");
    }

    public void bindActions(T t, M m) {
        String[] strArr;
        Object[] objArr = {t, m};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4d982543e9aacdd2bb65123ff97ae31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4d982543e9aacdd2bb65123ff97ae31");
        } else if (m.actions != null && m.actions.length != 0) {
            for (String str : m.actions) {
                if (!bindAction(t, m, str)) {
                    Log.e(TAG, "Cannot bind action for:" + str);
                }
            }
        }
    }

    public boolean hasAction(PicassoModel picassoModel, String str) {
        Object[] objArr = {picassoModel, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5db370bec7339f532d14943147e4ebef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5db370bec7339f532d14943147e4ebef")).booleanValue() : PicassoAction.hasAction(picassoModel, str);
    }

    public boolean bindClickAction(T t, final M m, final String str) {
        Object[] objArr = {t, m, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "274c3ed278dabae3bce7afe9c7dad304", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "274c3ed278dabae3bce7afe9c7dad304")).booleanValue();
        }
        if (!"click".equals(str) || m.alpha == 0.0f) {
            return false;
        }
        t.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picasso.creator.BaseViewWrapper.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0469ba3b7e52ebb950f17644f7bb8ec4", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0469ba3b7e52ebb950f17644f7bb8ec4");
                } else {
                    BaseViewWrapper.this.callAction(m, str, null);
                }
            }
        });
        t.setClickable(true);
        return true;
    }

    public void callAction(PicassoModel picassoModel, String str, JSONObject jSONObject) {
        Object[] objArr = {picassoModel, str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d03d98d7dde4effe962df6a85b33d48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d03d98d7dde4effe962df6a85b33d48");
        } else {
            PicassoAction.callAction(picassoModel, str, jSONObject);
        }
    }

    private void setViewInfo(View view, M m, M m2) {
        Object[] objArr = {view, m, m2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1158205512e2e1f3595b6a6006ef89e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1158205512e2e1f3595b6a6006ef89e5");
            return;
        }
        if (!(view instanceof PicassoView) || ((PicassoView) view).getAllowResize()) {
            updateFrame(view, m);
        }
        PicassoModelParams viewParams = m2 == null ? null : m2.getViewParams();
        if (viewParams == null || viewParams.backgroundDrawable != m.getViewParams().backgroundDrawable) {
            view.setBackground(m.getViewParams().backgroundDrawable);
        }
        view.setTransitionName(m.getViewParams().extraObject != null ? m.getViewParams().extraObject.optString("transitionName") : "");
        view.setAlpha(m.alpha);
    }

    public void updateFrame(View view, PicassoModel picassoModel) {
        Object[] objArr = {view, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a86c8256d12489ab4bf9beee529c58e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a86c8256d12489ab4bf9beee529c58e");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            if (!(view instanceof PicassoView)) {
                layoutParams = new FrameLayout.LayoutParams(picassoModel.getViewParams().width, picassoModel.getViewParams().height);
            }
        } else {
            layoutParams.width = picassoModel.getViewParams().width;
            layoutParams.height = picassoModel.getViewParams().height;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = picassoModel.getViewParams().x;
            marginLayoutParams.topMargin = picassoModel.getViewParams().y;
        }
        if (layoutParams != null) {
            view.setLayoutParams(layoutParams);
        }
        if (view instanceof PicassoCanvasClipper.Clippable) {
            ((PicassoCanvasClipper.Clippable) view).getClipper().setViewParam(view, picassoModel.getViewParams());
        }
        if ((picassoModel instanceof GroupModel) && (view.getParent() instanceof ViewGroup)) {
            GroupModel groupModel = (GroupModel) picassoModel;
            if (groupModel.clipToBounds) {
                return;
            }
            ((ViewGroup) view.getParent()).setClipChildren(groupModel.clipToBounds);
        }
    }

    @Override // com.dianping.picasso.view.command.CommandViewInterface
    public DecodingFactory getCommandViewDecodingFactory() {
        return BaseViewCommandModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.view.command.CommandViewInterface
    public void handleCommandView(View view, @NonNull BaseViewCommandModel baseViewCommandModel, @NonNull PicassoModel picassoModel) {
        Object[] objArr = {view, baseViewCommandModel, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aae1f41f8b9ddf073484b8ed6126c3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aae1f41f8b9ddf073484b8ed6126c3a");
        } else if (baseViewCommandModel == null || picassoModel == null) {
        } else {
            Context context = view != null ? view.getContext() : PicassoEnvironment.globalContext;
            PicassoModelParams viewParams = picassoModel.getViewParams();
            if (baseViewCommandModel.width != null) {
                picassoModel.width = baseViewCommandModel.width.floatValue();
                viewParams.width = PicassoUtils.dp2px(context, baseViewCommandModel.width.floatValue());
            }
            if (baseViewCommandModel.height != null) {
                picassoModel.height = baseViewCommandModel.height.floatValue();
                viewParams.height = PicassoUtils.dp2px(context, baseViewCommandModel.height.floatValue());
            }
            if (baseViewCommandModel.x != null) {
                picassoModel.x = baseViewCommandModel.x.floatValue();
                viewParams.x = PicassoUtils.dp2px(context, baseViewCommandModel.x.floatValue());
            }
            if (baseViewCommandModel.y != null) {
                picassoModel.y = baseViewCommandModel.y.floatValue();
                viewParams.y = PicassoUtils.dp2px(context, baseViewCommandModel.y.floatValue());
            }
            if (baseViewCommandModel.hidden != null) {
                picassoModel.hidden = baseViewCommandModel.hidden.booleanValue();
            }
            if (baseViewCommandModel.alpha != null) {
                picassoModel.alpha = baseViewCommandModel.alpha.floatValue();
            }
            if (view == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (baseViewCommandModel.width != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = viewParams.width;
                }
                if (baseViewCommandModel.height != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = viewParams.height;
                }
                if (baseViewCommandModel.x != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = viewParams.x;
                }
                if (baseViewCommandModel.y != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = viewParams.y;
                }
                view.setLayoutParams(layoutParams);
            }
            if (baseViewCommandModel.alpha != null) {
                view.setAlpha(baseViewCommandModel.alpha.floatValue());
            }
            if (updateBackgroundDrawable(baseViewCommandModel, picassoModel)) {
                viewParams.backgroundDrawable = viewParams.getGradientBackground(picassoModel);
                view.setBackground(viewParams.backgroundDrawable);
            }
            if (baseViewCommandModel.hidden != null) {
                if (baseViewCommandModel.hidden.booleanValue()) {
                    view.setVisibility(8);
                } else {
                    view.setVisibility(0);
                }
            }
        }
    }

    private boolean updateBackgroundDrawable(@NonNull BaseViewCommandModel baseViewCommandModel, @NonNull PicassoModel picassoModel) {
        boolean z;
        Object[] objArr = {baseViewCommandModel, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f54ecd3ca50b66573d2406ebb8629b95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f54ecd3ca50b66573d2406ebb8629b95")).booleanValue();
        }
        CornerRadiusModel cornerRadiusModel = baseViewCommandModel.cornerRaduisModel;
        GradientBackgroundModel gradientBackgroundModel = baseViewCommandModel.gradientBackgroundModel;
        if (cornerRadiusModel != null) {
            picassoModel.cornerRadius = cornerRadiusModel.cornerRadius;
            picassoModel.cornerRadiusLB = cornerRadiusModel.cornerRadiusLB != null ? cornerRadiusModel.cornerRadiusLB.booleanValue() : picassoModel.cornerRadiusLB;
            picassoModel.cornerRadiusRB = cornerRadiusModel.cornerRadiusRB != null ? cornerRadiusModel.cornerRadiusRB.booleanValue() : picassoModel.cornerRadiusRB;
            picassoModel.cornerRadiusLT = cornerRadiusModel.cornerRadiusLT != null ? cornerRadiusModel.cornerRadiusLT.booleanValue() : picassoModel.cornerRadiusLT;
            picassoModel.cornerRadiusRT = cornerRadiusModel.cornerRadiusRT != null ? cornerRadiusModel.cornerRadiusRT.booleanValue() : picassoModel.cornerRadiusRT;
            z = true;
        } else {
            z = false;
        }
        if (PicassoUtils.isValidColor(baseViewCommandModel.backgroundColor)) {
            picassoModel.backgroundColor = baseViewCommandModel.backgroundColor;
            picassoModel.startColor = null;
            picassoModel.endColor = null;
            picassoModel.orientation = 0;
            return true;
        } else if (gradientBackgroundModel != null && PicassoUtils.isValidColor(gradientBackgroundModel.startColor) && PicassoUtils.isValidColor(gradientBackgroundModel.endColor)) {
            picassoModel.backgroundColor = null;
            picassoModel.startColor = gradientBackgroundModel.startColor;
            picassoModel.endColor = gradientBackgroundModel.endColor;
            picassoModel.orientation = gradientBackgroundModel.orientation;
            return true;
        } else {
            return z;
        }
    }

    public void recordEvent(T t, M m, g gVar) {
        boolean z = true;
        Object[] objArr = {t, m, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccf11b0ff6b72f824cb01b1ea995b19a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccf11b0ff6b72f824cb01b1ea995b19a");
        } else if (gVar.t != null) {
            if ((TextUtils.isEmpty(m.statisticsInfo) || m.statisticsInfo.length() <= 2) ? false : false) {
                return;
            }
            Object tag = t.getTag(R.id.picasso_statistics);
            if (tag instanceof Boolean) {
                ((Boolean) tag).booleanValue();
            }
        }
    }
}
