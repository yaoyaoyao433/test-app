package com.dianping.shield.dynamic.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleMargin;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMSizeUtils;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.dynamic.views.DMMarginView;
import com.dianping.shield.dynamic.views.DMWrapperView;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.titans.js.JsHandlerFactory;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMDialog extends Dialog {
    public static ChangeQuickRedirect changeQuickRedirect;
    public DMMarginView dialogMarginView;
    private ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private boolean isKeyboardVisible;
    private int keyboardHeight;
    private Context mContext;
    private Animation popInAnimation;
    private Animation popOutAnimation;
    private boolean tapMask;
    public TapMaskListener tapMaskListener;
    private DynamicModuleViewItemData viewItemData;
    private ViewTreeObserver viewTreeObserver;
    public DMWrapperView wrapperView;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface TapMaskListener {
        void onClick();
    }

    public DMDialog(@NonNull Context context) {
        super(context, 16973840);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aab7261a5df1a28742c5829a127269e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aab7261a5df1a28742c5829a127269e4");
            return;
        }
        this.isKeyboardVisible = false;
        this.keyboardHeight = 0;
        this.mContext = context;
        init();
    }

    @Nullable
    public static DynamicModuleMargin getMarginInfo(@Nullable MarginInfo marginInfo) {
        Object[] objArr = {marginInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb87116ce9204d60bc368fb11114d59e", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicModuleMargin) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb87116ce9204d60bc368fb11114d59e");
        }
        if (marginInfo == null) {
            return null;
        }
        DynamicModuleMargin dynamicModuleMargin = new DynamicModuleMargin();
        if (marginInfo.getLeftMargin() != null) {
            dynamicModuleMargin.left = marginInfo.getLeftMargin().intValue();
        }
        if (marginInfo.getRightMargin() != null) {
            dynamicModuleMargin.right = marginInfo.getRightMargin().intValue();
        }
        if (marginInfo.getTopMargin() != null) {
            dynamicModuleMargin.top = marginInfo.getTopMargin().intValue();
        }
        if (marginInfo.getBottomMargin() != null) {
            dynamicModuleMargin.bottom = marginInfo.getBottomMargin().intValue();
        }
        return dynamicModuleMargin;
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "def0b7bd8256960d3974dbf809bfa867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "def0b7bd8256960d3974dbf809bfa867");
            return;
        }
        getWindow().setBackgroundDrawableResource(R.color.pm_dialog_background);
        setContentView(R.layout.pm_dialog);
        this.wrapperView = (DMWrapperView) findViewById(R.id.wrapper_picasso_view);
        this.dialogMarginView = (DMMarginView) findViewById(R.id.dialog_view);
        View findViewById = findViewById(16908290);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.dynamic.widget.DMDialog.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "58e73aaa5677fb12796dc533c7168564", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "58e73aaa5677fb12796dc533c7168564");
                } else if (DMDialog.this.tapMask) {
                    DMDialog.this.tapMaskListener.onClick();
                }
            }
        });
        findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: com.dianping.shield.dynamic.widget.DMDialog.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3af049881165372a93c5cc738b70fc8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3af049881165372a93c5cc738b70fc8")).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    DMDialog.this.tapMask = false;
                    if (DMDialog.this.viewItemData != null && DMDialog.this.wrapperView != null) {
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        int width = DMDialog.this.wrapperView.getWidth();
                        int height = DMDialog.this.wrapperView.getHeight();
                        int left = DMDialog.this.wrapperView.getLeft();
                        int top = DMDialog.this.wrapperView.getTop();
                        if (rawX < left || rawX > left + width || rawY < top || rawY > top + height) {
                            DMDialog.this.tapMask = true;
                        }
                    }
                }
                return false;
            }
        });
    }

    public void paintPicassoViewInput(DynamicAgent dynamicAgent, DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {dynamicAgent, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "480861fe49a1d4e3f92a5f3270123567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "480861fe49a1d4e3f92a5f3270123567");
        } else {
            this.wrapperView.paintInput(dynamicAgent, dynamicModuleViewItemData);
        }
    }

    public void setMarginByMarginInfo(@Nullable MarginInfo marginInfo) {
        Object[] objArr = {marginInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ec459162b068d5e153d5351e21974ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ec459162b068d5e153d5351e21974ef");
        } else {
            this.dialogMarginView.setMargin(getMarginInfo(marginInfo));
        }
    }

    public void setViewItemData(DynamicModuleViewItemData dynamicModuleViewItemData) {
        this.viewItemData = dynamicModuleViewItemData;
    }

    public void setPicassoViewClickCallback(DynamicModuleViewItemData dynamicModuleViewItemData, final ViewItem viewItem) {
        Object[] objArr = {dynamicModuleViewItemData, viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32b8e9e1b692aa7bf07695492db16292", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32b8e9e1b692aa7bf07695492db16292");
        } else if (this.wrapperView.dynamicInnerView(dynamicModuleViewItemData) != null) {
            this.wrapperView.dynamicInnerView(dynamicModuleViewItemData).setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.dynamic.widget.DMDialog.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b2254db1729d84d4220bf2a76b5be02", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b2254db1729d84d4220bf2a76b5be02");
                    } else if (viewItem.clickCallback != null) {
                        viewItem.clickCallback.onViewClicked(view, viewItem.data, null);
                    }
                }
            });
        }
    }

    public void setPopInAnimationType(DMConstant.PopAnimationType popAnimationType) {
        Object[] objArr = {popAnimationType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f35a2883b6aeea2996ecb768f8b10466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f35a2883b6aeea2996ecb768f8b10466");
            return;
        }
        this.popInAnimation = DMViewUtils.crateTransitionAnimation(true, popAnimationType);
        if (this.popInAnimation != null) {
            this.popInAnimation.setDuration(300L);
        }
    }

    public void setPopOutAnimationType(DMConstant.PopAnimationType popAnimationType) {
        Object[] objArr = {popAnimationType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "257882048acf0f730bf315fea672b3e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "257882048acf0f730bf315fea672b3e5");
            return;
        }
        this.popOutAnimation = DMViewUtils.crateTransitionAnimation(false, popAnimationType);
        if (this.popOutAnimation != null) {
            this.popOutAnimation.setDuration(300L);
            this.popOutAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.dianping.shield.dynamic.widget.DMDialog.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    Object[] objArr2 = {animation};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0a5cd41b2f70ea407a784f153690156b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0a5cd41b2f70ea407a784f153690156b");
                    } else if (DMDialog.this.popOutAnimation == animation) {
                        DMDialog.super.dismiss();
                    }
                }
            });
        }
    }

    public void setView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ddca6c8fc55bf31631cc23e5c3013e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ddca6c8fc55bf31631cc23e5c3013e4");
        } else {
            setContentView(i);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e41436df7b7e5a72c7bb0dda790b33f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e41436df7b7e5a72c7bb0dda790b33f");
            return;
        }
        registerKeyboardListener();
        super.show();
        if (this.popInAnimation != null) {
            this.wrapperView.startAnimation(this.popInAnimation);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab060da166846ce8424899f6d2bb7683", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab060da166846ce8424899f6d2bb7683");
            return;
        }
        unregisterGlobalLayoutListener();
        if (this.popOutAnimation != null) {
            this.wrapperView.startAnimation(this.popOutAnimation);
        } else {
            super.dismiss();
        }
    }

    public void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "532a56b90176ccc3c36d2b464384c2e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "532a56b90176ccc3c36d2b464384c2e1");
        } else {
            super.dismiss();
        }
    }

    public void setTapMaskListener(TapMaskListener tapMaskListener) {
        this.tapMaskListener = tapMaskListener;
    }

    private void registerKeyboardListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab15dd65311bde5e6bca5ea7ddb7094f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab15dd65311bde5e6bca5ea7ddb7094f");
        } else if (getWindow() == null) {
        } else {
            this.viewTreeObserver = getWindow().getDecorView().getViewTreeObserver();
            this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.dianping.shield.dynamic.widget.DMDialog.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "05a56943061110394fd5cc9724e0af98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "05a56943061110394fd5cc9724e0af98");
                        return;
                    }
                    Rect rect = new Rect();
                    if (DMDialog.this.wrapperView == null) {
                        return;
                    }
                    int[] iArr = new int[2];
                    DMDialog.this.wrapperView.getLocationInWindow(iArr);
                    DMDialog.this.wrapperView.getWindowVisibleDisplayFrame(rect);
                    int i = rect.bottom - iArr[1];
                    int height = (iArr[1] + DMDialog.this.wrapperView.getHeight()) - rect.bottom;
                    boolean z = ((double) (((float) i) / ((float) DMDialog.this.wrapperView.getHeight()))) < 0.8d;
                    if (z == DMDialog.this.isKeyboardVisible || height == DMDialog.this.keyboardHeight) {
                        return;
                    }
                    if ((!z || height <= 0) && (z || height > 0)) {
                        return;
                    }
                    DMDialog.this.sendData(DMDialog.this.mContext, z, Math.max(0, height));
                    DMDialog.this.keyboardHeight = Math.max(0, height);
                    DMDialog.this.isKeyboardVisible = z;
                    DMDialog.this.unregisterGlobalLayoutListener();
                }
            };
            this.viewTreeObserver.addOnGlobalLayoutListener(this.globalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterGlobalLayoutListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "112eee36a631d0c0eadfbb07ffb1059d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "112eee36a631d0c0eadfbb07ffb1059d");
        } else if (this.viewTreeObserver == null || !this.viewTreeObserver.isAlive()) {
        } else {
            this.viewTreeObserver.removeOnGlobalLayoutListener(this.globalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendData(Context context, boolean z, int i) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a97af8d45826b19ea120003de0b0a72f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a97af8d45826b19ea120003de0b0a72f");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", "resize");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            if (z) {
                jSONObject2.put("width", DMSizeUtils.px2dip(context, DMSizeUtils.getScreenWidthPixels(context)));
                jSONObject2.put("height", 0);
                jSONObject3.put("width", DMSizeUtils.px2dip(context, DMSizeUtils.getScreenWidthPixels(context)));
                jSONObject3.put("height", DMSizeUtils.px2dip(context, i));
            } else {
                jSONObject2.put("width", DMSizeUtils.px2dip(context, DMSizeUtils.getScreenWidthPixels(context)));
                jSONObject2.put("height", DMSizeUtils.px2dip(context, this.keyboardHeight));
                jSONObject3.put("width", DMSizeUtils.px2dip(context, DMSizeUtils.getScreenWidthPixels(context)));
                jSONObject3.put("height", 0);
            }
            jSONObject.put("from", jSONObject2.toString());
            jSONObject.put(RemoteMessageConst.TO, jSONObject3.toString());
            JsHandlerFactory.publish(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
