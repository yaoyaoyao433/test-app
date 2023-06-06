package com.dianping.picasso;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoInput;
import com.dianping.picasso.PicassoManager;
import com.dianping.picasso.PicassoNotificationCenter;
import com.dianping.picasso.creator.ViewProcessor;
import com.dianping.picasso.model.GroupModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.rx.PicassoSubscriber;
import com.dianping.picasso.view.PicassoGroupView;
import com.dianping.picassocontroller.debug.c;
import com.dianping.picassocontroller.debug.f;
import com.dianping.picassocontroller.debug.h;
import com.dianping.picassocontroller.vc.PicassoVCInput;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.ui.widget.a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import rx.functions.b;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoView extends PicassoGroupView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean allowResize;
    private boolean autoAdjust;
    public b<JSONObject> debugAction;
    private boolean isChildVCPicassoView;
    private View mFocusedView;
    private String mJsName;
    public PicassoNotificationCenter mNotificationCenter;
    private PicassoInput picassoInput;
    private PicassoModel picassoModel;
    private WeakReference<g> picassoVCHost;
    private k subscription;
    private ViewProcessor viewProcessor;

    public PicassoView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30a60b817e6f5f559e15e3a96dfe76dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30a60b817e6f5f559e15e3a96dfe76dd");
        }
    }

    public PicassoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1159a52036b06cac2e4bb3df398d17a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1159a52036b06cac2e4bb3df398d17a0");
        }
    }

    public PicassoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec5206ee1b7462d62ed43d503279a0d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec5206ee1b7462d62ed43d503279a0d6");
            return;
        }
        this.debugAction = new b<JSONObject>() { // from class: com.dianping.picasso.PicassoView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.b
            public void call(JSONObject jSONObject) {
                String optString;
                String optString2;
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "82dcbf1faa53d0dc758527ae7c7993c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "82dcbf1faa53d0dc758527ae7c7993c6");
                    return;
                }
                final PicassoView picassoView = PicassoView.this;
                final PicassoInput picassoInput = PicassoView.this.picassoInput;
                Object[] objArr3 = {picassoView, jSONObject, picassoInput};
                ChangeQuickRedirect changeQuickRedirect4 = h.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "475753e5b9f1045554025e16dcbbd04a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "475753e5b9f1045554025e16dcbbd04a");
                } else if (!PicassoManager.isDebugMode() || jSONObject == null || picassoInput == null || (optString = jSONObject.optString("layoutFileName")) == null || (optString2 = jSONObject.optString("content")) == null) {
                } else {
                    Context context2 = picassoView.getContext();
                    final boolean equals = "picasso_playground".equals(picassoInput.name);
                    if (!optString.equals(picassoInput.name + ".js")) {
                        if (!optString.equals(picassoInput.name + ".jsData") && !equals) {
                            return;
                        }
                    }
                    picassoInput.layoutString = optString2;
                    if (equals) {
                        picassoInput.name = optString.substring(0, optString.indexOf(CommonConstant.Symbol.DOT));
                    }
                    picassoInput.computePicassoInput(context2).subscribe(new PicassoSubscriber<PicassoInput>() { // from class: com.dianping.picassocontroller.debug.h.1
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.picasso.rx.PicassoSubscriber
                        public final void onCompleted() {
                        }

                        @Override // com.dianping.picasso.rx.PicassoSubscriber
                        public final /* synthetic */ void onNext(PicassoInput picassoInput2) {
                            PicassoInput picassoInput3 = picassoInput2;
                            Object[] objArr4 = {picassoInput3};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "34c099744a3bed63df2235f2dab20054", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "34c099744a3bed63df2235f2dab20054");
                                return;
                            }
                            picassoView.setPicassoInput(picassoInput3);
                            PicassoManager.isDebugMode();
                            if (equals) {
                                picassoInput.name = "picasso_playground";
                            }
                        }

                        @Override // com.dianping.picasso.rx.PicassoSubscriber
                        public final void onError(Throwable th) {
                            Object[] objArr4 = {th};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "10a6460c5bfcce7b670985a0f36c7b01", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "10a6460c5bfcce7b670985a0f36c7b01");
                                return;
                            }
                            if (PicassoManager.isDebugMode()) {
                                c.a().a(th.toString(), 0);
                            }
                            if (equals) {
                                picassoInput.name = "picasso_playground";
                            }
                        }
                    });
                }
            }
        };
        this.mJsName = null;
        this.allowResize = true;
        this.autoAdjust = false;
        this.isChildVCPicassoView = false;
        this.viewProcessor = null;
        this.mNotificationCenter = new PicassoNotificationCenter(getContext());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95f7775a33f97bd6520317959222a628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95f7775a33f97bd6520317959222a628");
            return;
        }
        super.onAttachedToWindow();
        if (PicassoManager.isDebugMode()) {
            this.subscription = c.a().h.a(this.debugAction, new b<Throwable>() { // from class: com.dianping.picasso.PicassoView.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.b
                public void call(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "710c18175d8b33bc090611dbb889ac65", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "710c18175d8b33bc090611dbb889ac65");
                    } else {
                        new a(PicassoView.this, th.getMessage(), 0).a();
                    }
                }
            });
        }
        if (PicassoEnvironment.getPicassoEnvironment(getContext()).isDebug && f.a().b) {
            f a = f.a();
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "dc2055013ed22e7e03941445c4919868", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "dc2055013ed22e7e03941445c4919868");
                return;
            }
            Object tag = getTag(R.id.id_picasso_model);
            if (tag instanceof PicassoModel) {
                a.c.put(this, (PicassoModel) tag);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7994cc3ba5edd9cede226779819c21e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7994cc3ba5edd9cede226779819c21e");
            return;
        }
        if (this.subscription != null && !this.subscription.isUnsubscribed()) {
            this.subscription.unsubscribe();
        }
        super.onDetachedFromWindow();
        if (PicassoEnvironment.getPicassoEnvironment(getContext()).isDebug) {
            f a = f.a();
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "2ec2cb27fd6bdbe6f5f7da00402d515d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "2ec2cb27fd6bdbe6f5f7da00402d515d");
            } else {
                a.c.remove(this);
            }
        }
    }

    public PicassoModel getCurrentPicassoModel() {
        return this.picassoModel;
    }

    public void setPicassoInput(PicassoInput picassoInput) {
        Object[] objArr = {picassoInput};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3140258a11598b9194da086075cfb34f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3140258a11598b9194da086075cfb34f");
        } else if (picassoInput == null) {
        } else {
            this.picassoInput = picassoInput;
            this.picassoModel = picassoInput.viewModel;
            this.mJsName = picassoInput.name;
            if (this.picassoModel instanceof GroupModel) {
                modelPainting(this.picassoModel);
            }
        }
    }

    public void setObserver(PicassoNotificationCenter.NotificationListener notificationListener) {
        Object[] objArr = {notificationListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93862f6a2ebfd4d77c011b7b98b6e75c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93862f6a2ebfd4d77c011b7b98b6e75c");
        } else {
            this.mNotificationCenter.setObserver(notificationListener);
        }
    }

    public JSONObject getGaUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a5def792b858eea95efc95b9e000224", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a5def792b858eea95efc95b9e000224");
        }
        if (this.picassoModel != null) {
            return this.picassoModel.getViewParams().gaUserInfoObject;
        }
        return null;
    }

    public View getFocusedView() {
        return this.mFocusedView;
    }

    public void setFocusedView(View view) {
        this.mFocusedView = view;
    }

    public String getJsName() {
        return this.mJsName;
    }

    public void setAllowResize(boolean z) {
        this.allowResize = z;
    }

    public boolean getAllowResize() {
        return this.allowResize;
    }

    public void setAutoAdjust(boolean z) {
        this.autoAdjust = z;
    }

    public boolean getAutoAdjust() {
        return this.autoAdjust;
    }

    public void paintPicassoInput(PicassoVCInput picassoVCInput) {
        Object[] objArr = {picassoVCInput};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b75f16d48b1baf0f2ec28a531e883895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b75f16d48b1baf0f2ec28a531e883895");
            return;
        }
        if (picassoVCInput != null) {
            if (picassoVCInput.g != null) {
                picassoVCInput.g.a(this);
                this.mJsName = picassoVCInput.b;
                return;
            }
            PicassoModel picassoModel = picassoVCInput.j;
            if (picassoModel != null) {
                modelPainting(picassoModel);
                return;
            }
        }
        Log.e("PicassoVCView", "没有进行computer或没有缓存");
    }

    public void modelPainting(PicassoModel picassoModel) {
        Object[] objArr = {picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e4e4cf3e58271eaa760ae4a8a4c11b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e4e4cf3e58271eaa760ae4a8a4c11b4");
            return;
        }
        this.picassoModel = picassoModel;
        PicassoRenderEngine.render(this, picassoModel);
    }

    public void setVCHost(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b24083904ec3d0cff99c59e166aae0b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b24083904ec3d0cff99c59e166aae0b7");
            return;
        }
        if (this.picassoVCHost != null) {
            this.picassoVCHost.clear();
        }
        this.picassoVCHost = new WeakReference<>(gVar);
    }

    public g getVCHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9907703dca8d8329748e4410322b3895", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9907703dca8d8329748e4410322b3895");
        }
        if (this.picassoVCHost != null) {
            return this.picassoVCHost.get();
        }
        return null;
    }

    public void setChildVCPicassoView(boolean z) {
        this.isChildVCPicassoView = z;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "847af73d843bcd9e483b948bb8430659", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "847af73d843bcd9e483b948bb8430659");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.isChildVCPicassoView) {
            return;
        }
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        g vCHost = getVCHost();
        if (vCHost != null) {
            float px2dip = PicassoTextUtils.px2dip(getContext(), paddingLeft);
            float px2dip2 = PicassoTextUtils.px2dip(getContext(), paddingTop);
            float px2dip3 = PicassoTextUtils.px2dip(getContext(), i3);
            float px2dip4 = PicassoTextUtils.px2dip(getContext(), i4);
            Object[] objArr2 = {Float.valueOf(px2dip), Float.valueOf(px2dip2), Float.valueOf(px2dip3), Float.valueOf(px2dip4)};
            ChangeQuickRedirect changeQuickRedirect3 = g.m;
            if (PatchProxy.isSupport(objArr2, vCHost, changeQuickRedirect3, false, "57d8f21585c164f08e1364a45ffe1962", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, vCHost, changeQuickRedirect3, false, "57d8f21585c164f08e1364a45ffe1962");
                return;
            }
            if (px2dip4 != 0.0f && px2dip3 != 0.0f) {
                vCHost.v = true;
            }
            if (vCHost.s != null) {
                Object tag = vCHost.s.getTag(R.id.id_picasso_model);
                if ((tag instanceof PicassoModel) && !vCHost.v) {
                    PicassoModel picassoModel = (PicassoModel) tag;
                    if (picassoModel.width == px2dip && picassoModel.height == px2dip2) {
                        return;
                    }
                }
                if (vCHost.s.getAutoAdjust() || vCHost.u == null) {
                    vCHost.a("dispatchOnFrameChanged", new JSONBuilder().put("width", Float.valueOf(px2dip)).put("height", Float.valueOf(px2dip2)).toJSONObject());
                }
            }
        }
    }

    public View viewWithTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f36e44880adcf4160bf1321acc48459", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f36e44880adcf4160bf1321acc48459") : findViewWithTag(str);
    }

    public void setViewProcessor(ViewProcessor viewProcessor) {
        this.viewProcessor = viewProcessor;
    }

    public ViewProcessor getViewProcessor() {
        return this.viewProcessor;
    }
}
