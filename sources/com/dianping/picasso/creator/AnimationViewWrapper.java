package com.dianping.picasso.creator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.JSONBuilder;
import com.dianping.picasso.PicassoRenderEngine;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.AnimationModel;
import com.dianping.picasso.model.AnimationTransformModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.view.AnimationView;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.dianping.picasso.view.command.BaseViewCommandModel;
import com.dianping.picasso.view.command.CommandViewInterface;
import com.dianping.picasso.view.gesturehandler.PicassoGestureHandlerManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AnimationViewWrapper extends BaseViewWrapper<AnimationView, AnimationModel> implements CommandViewInterface {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public boolean bindAction(AnimationView animationView, AnimationModel animationModel, String str) {
        return true;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public AnimationView createView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba700b70f0502574a2910c13f06ac456", RobustBitConfig.DEFAULT_VALUE) ? (AnimationView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba700b70f0502574a2910c13f06ac456") : new AnimationView(context);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void updateView(AnimationView animationView, PicassoView picassoView, AnimationModel animationModel, AnimationModel animationModel2) {
        Object[] objArr = {animationView, picassoView, animationModel, animationModel2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "071224c37a593de90f7b62ab2ad2bb91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "071224c37a593de90f7b62ab2ad2bb91");
            return;
        }
        PicassoRenderEngine.updateViewTree(picassoView, animationModel, animationView);
        animationView.handlePicassoAnim(animationModel);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void bindActions(AnimationView animationView, AnimationModel animationModel) {
        Object[] objArr = {animationView, animationModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e0d273b70503347ecd8ca69db9f4615", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e0d273b70503347ecd8ca69db9f4615");
            return;
        }
        super.bindActions((AnimationViewWrapper) animationView, (AnimationView) animationModel);
        bindAnimActions(animationView, animationModel);
        if (animationModel.actions != null) {
            PicassoGestureHandlerManager.attachGestureHandlerToViewByAction(animationModel.hostId, animationView, animationModel.viewId, animationModel.actions);
        }
    }

    private void bindAnimActions(final AnimationView animationView, final AnimationModel animationModel) {
        Object[] objArr = {animationView, animationModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69de06c2558d60b7569d5d59a5aaddea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69de06c2558d60b7569d5d59a5aaddea");
        } else if (animationModel.actions == null || animationModel.actions.length == 0) {
        } else {
            final List asList = Arrays.asList(animationModel.actions);
            animationView.setAnimatorListener(new AnimatorListenerAdapter() { // from class: com.dianping.picasso.creator.AnimationViewWrapper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2f8bef96b37f135d7ccac7620836a10d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2f8bef96b37f135d7ccac7620836a10d");
                    } else if (asList.contains("onCompletion")) {
                        String[] strArr = {"height", "width", "corner"};
                        JSONBuilder jSONBuilder = new JSONBuilder();
                        for (int i = 0; i < 3; i++) {
                            String str = strArr[i];
                            jSONBuilder.put(str, Float.valueOf(AnimationViewWrapper.this.px2dp(animationView, str)));
                        }
                        AnimationViewWrapper.this.callAction(animationModel, "onCompletion", jSONBuilder.toJSONObject());
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
                public void onAnimationPause(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d74034fd29ab626a9a52330a6d54727c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d74034fd29ab626a9a52330a6d54727c");
                    } else if (asList.contains("onPause")) {
                        String[] strArr = {"height", "width", "corner"};
                        JSONBuilder jSONBuilder = new JSONBuilder();
                        for (int i = 0; i < 3; i++) {
                            String str = strArr[i];
                            jSONBuilder.put(str, Float.valueOf(AnimationViewWrapper.this.px2dp(animationView, str)));
                        }
                        AnimationViewWrapper.this.callAction(animationModel, "onPause", jSONBuilder.toJSONObject());
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
                public void onAnimationResume(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ce92a6a4125c6deda0eec77cf71b8ae9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ce92a6a4125c6deda0eec77cf71b8ae9");
                    } else if (asList.contains("onResume")) {
                        AnimationViewWrapper.this.callAction(animationModel, "onResume", null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r15.equals("corner") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float px2dp(com.dianping.picasso.view.AnimationView r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            r10 = 1
            r8[r10] = r15
            com.meituan.robust.ChangeQuickRedirect r11 = com.dianping.picasso.creator.AnimationViewWrapper.changeQuickRedirect
            java.lang.String r12 = "a63b0a8d4d41e626f14f9fd96ce11727"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            return r14
        L25:
            r1 = -1
            int r2 = r15.hashCode()
            r3 = -1354665387(0xffffffffaf417255, float:-1.7593867E-10)
            if (r2 == r3) goto L4f
            r0 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
            if (r2 == r0) goto L45
            r0 = 113126854(0x6be2dc6, float:7.1537315E-35)
            if (r2 == r0) goto L3a
            goto L58
        L3a:
            java.lang.String r0 = "width"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L58
            r0 = 1
            goto L59
        L45:
            java.lang.String r0 = "height"
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L58
            r0 = 0
            goto L59
        L4f:
            java.lang.String r2 = "corner"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L58
            goto L59
        L58:
            r0 = -1
        L59:
            switch(r0) {
                case 0: goto L79;
                case 1: goto L6b;
                case 2: goto L5e;
                default: goto L5c;
            }
        L5c:
            r14 = 0
            return r14
        L5e:
            android.content.Context r15 = r14.getContext()
            float r14 = r14.getCorner()
            float r14 = com.dianping.picasso.PicassoUtils.px2dp(r15, r14)
            return r14
        L6b:
            android.content.Context r15 = r14.getContext()
            int r14 = r14.getMeasuredWidth()
            float r14 = (float) r14
            float r14 = com.dianping.picasso.PicassoUtils.px2dp(r15, r14)
            return r14
        L79:
            android.content.Context r15 = r14.getContext()
            int r14 = r14.getMeasuredHeight()
            float r14 = (float) r14
            float r14 = com.dianping.picasso.PicassoUtils.px2dp(r15, r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.picasso.creator.AnimationViewWrapper.px2dp(com.dianping.picasso.view.AnimationView, java.lang.String):float");
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public void unbindActions(AnimationView animationView, AnimationModel animationModel) {
        Object[] objArr = {animationView, animationModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "828d9d5e35deef59e3e411bce37758c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "828d9d5e35deef59e3e411bce37758c1");
            return;
        }
        animationView.setAnimatorListener(null);
        PicassoGestureHandlerManager.detachViewGestureHandler(animationView);
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public DecodingFactory<AnimationModel> getDecodingFactory() {
        return AnimationModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper
    public PicassoModel[] getSubModels(AnimationModel animationModel) {
        return animationModel.subviews;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public DecodingFactory getCommandViewDecodingFactory() {
        return AnimationViewCommandModel.PICASSO_DECODER;
    }

    @Override // com.dianping.picasso.creator.BaseViewWrapper, com.dianping.picasso.view.command.CommandViewInterface
    public void handleCommandView(View view, @NonNull BaseViewCommandModel baseViewCommandModel, @NonNull PicassoModel picassoModel) {
        Object[] objArr = {view, baseViewCommandModel, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c55e161018cd02b690b33266f13a2941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c55e161018cd02b690b33266f13a2941");
            return;
        }
        super.handleCommandView(view, baseViewCommandModel, picassoModel);
        if ((baseViewCommandModel instanceof AnimationViewCommandModel) && (view instanceof AnimationView)) {
            AnimationViewCommandModel animationViewCommandModel = (AnimationViewCommandModel) baseViewCommandModel;
            AnimationView animationView = (AnimationView) view;
            float f = animationViewCommandModel.pivotX;
            float f2 = animationViewCommandModel.pivotY;
            String str = animationViewCommandModel.rotateDirection;
            Float f3 = animationViewCommandModel.rotateValue;
            float f4 = animationViewCommandModel.scaleX;
            float f5 = animationViewCommandModel.scaleY;
            if (animationViewCommandModel.resetAnimation) {
                resetAnimation(view, picassoModel);
            }
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i >= 0 && picassoModel != null) {
                animationView.setPivotX(picassoModel.getViewParams().width * f);
            }
            int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i2 >= 0 && picassoModel != null) {
                animationView.setPivotY(picassoModel.getViewParams().height * f2);
            }
            int i3 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i3 >= 0) {
                animationView.setScaleX(f4);
            }
            int i4 = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
            if (i4 >= 0) {
                animationView.setScaleY(f5);
            }
            animationView.setAnimationViewRotation(f3, str);
            animationView.setAnimationAction(animationViewCommandModel.action);
            if (picassoModel != null) {
                AnimationModel animationModel = (AnimationModel) picassoModel;
                if (i >= 0) {
                    animationModel.anchorPointX = f;
                }
                if (i2 >= 0) {
                    animationModel.anchorPointY = f2;
                }
                AnimationTransformModel animationTransformModel = animationModel.transformModel;
                if (animationTransformModel != null) {
                    if (i3 >= 0) {
                        animationTransformModel.scaleX = f4;
                    }
                    if (i4 >= 0) {
                        animationTransformModel.scaleY = f5;
                    }
                    if (f3 != null) {
                        animationTransformModel.rotateDirection = str;
                        animationTransformModel.rotateValue = f3;
                    }
                }
            }
        }
    }

    private void resetAnimation(View view, PicassoModel picassoModel) {
        Object[] objArr = {view, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbf519db2f73d7012bcf98c54bcea38f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbf519db2f73d7012bcf98c54bcea38f");
            return;
        }
        if (picassoModel != null) {
            view.setPivotX(picassoModel.getViewParams().width / 2);
            view.setPivotY(picassoModel.getViewParams().height / 2);
        }
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }
}
