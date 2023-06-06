package com.meituan.android.recce.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.common.a;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.recce.views.view.RecceViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceModalView extends ViewGroup {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mAnimationType;
    @Nullable
    private Dialog mDialog;
    private boolean mHardwareAccelerated;
    private DialogRootViewGroup mHostView;
    @Nullable
    private OnRequestCloseListener mOnRequestCloseListener;
    @Nullable
    private DialogInterface.OnShowListener mOnShowListener;
    private boolean mPropertyRequiresNewDialog;
    private boolean mStatusBarTranslucent;
    private boolean mTransparent;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface OnRequestCloseListener {
        void onRequestClose(DialogInterface dialogInterface);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public RecceModalView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f69c98acc7562421bd4b42713962c85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f69c98acc7562421bd4b42713962c85");
        } else {
            this.mHostView = new DialogRootViewGroup(context);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        Object[] objArr = {viewStructure};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbbad4cd90eac1b9c78261aca6a8a7ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbbad4cd90eac1b9c78261aca6a8a7ab");
        } else {
            this.mHostView.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29d3e6b8577b78c8f502612927827763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29d3e6b8577b78c8f502612927827763");
            return;
        }
        super.onDetachedFromWindow();
        dismiss();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ebc8184f3ff47e77456a5975f9def0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ebc8184f3ff47e77456a5975f9def0c");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.mHostView.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf543e59b1aa054fc4fac0a8836aa9c2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf543e59b1aa054fc4fac0a8836aa9c2")).intValue() : this.mHostView.getChildCount();
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66a39fb9833f006a229d88fee0c0c1ab", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66a39fb9833f006a229d88fee0c0c1ab") : this.mHostView.getChildAt(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cff0dd1ed35fc8544a74040e426d6704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cff0dd1ed35fc8544a74040e426d6704");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.mHostView.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80f1d68fa8778eff97a25e3a6b93a4a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80f1d68fa8778eff97a25e3a6b93a4a2");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.mHostView.removeView(getChildAt(i));
    }

    private void dismiss() {
        Activity activity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa342dca9ad8bff95db4ad9d4756f5eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa342dca9ad8bff95db4ad9d4756f5eb");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (this.mDialog != null) {
            if (this.mDialog.isShowing() && ((activity = (Activity) a.a(this.mDialog.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.mDialog.dismiss();
            }
            this.mDialog = null;
            ((ViewGroup) this.mHostView.getParent()).removeViewAt(0);
        }
    }

    public void setOnRequestCloseListener(OnRequestCloseListener onRequestCloseListener) {
        this.mOnRequestCloseListener = onRequestCloseListener;
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.mOnShowListener = onShowListener;
    }

    public void setTransparent(boolean z) {
        this.mTransparent = z;
    }

    public void setStatusBarTranslucent(boolean z) {
        this.mStatusBarTranslucent = z;
        this.mPropertyRequiresNewDialog = true;
    }

    public void setAnimationType(String str) {
        this.mAnimationType = str;
        this.mPropertyRequiresNewDialog = true;
    }

    public void setHardwareAccelerated(boolean z) {
        this.mHardwareAccelerated = z;
        this.mPropertyRequiresNewDialog = true;
    }

    public void onDropInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e52ee6782c0c6d73405951c4b7837260", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e52ee6782c0c6d73405951c4b7837260");
        } else {
            dismiss();
        }
    }

    @Nullable
    @VisibleForTesting
    public Dialog getDialog() {
        return this.mDialog;
    }

    @Nullable
    private Activity getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9f22be29163cfd16fa43e351ed28bf5", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9f22be29163cfd16fa43e351ed28bf5") : ((ReactContext) getContext()).getCurrentActivity();
    }

    public void showOrUpdate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c57ee0ce43de78c17c84794c6c930971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c57ee0ce43de78c17c84794c6c930971");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (this.mDialog != null) {
            if (this.mPropertyRequiresNewDialog) {
                dismiss();
            } else {
                updateProperties();
                return;
            }
        }
        this.mPropertyRequiresNewDialog = false;
        int i = 2131558942;
        if (MarketingModel.DIALOG_SHOW_TYPE_FADE.equals(this.mAnimationType)) {
            i = 2131558943;
        } else if (Constants.EventType.SLIDE.equals(this.mAnimationType)) {
            i = 2131558944;
        }
        Activity currentActivity = getCurrentActivity();
        Context context = currentActivity == null ? getContext() : currentActivity;
        this.mDialog = new Dialog(context, i);
        this.mDialog.getWindow().setFlags(8, 8);
        this.mDialog.setContentView(getContentView());
        updateProperties();
        this.mDialog.setOnShowListener(this.mOnShowListener);
        this.mDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.meituan.android.recce.views.modal.RecceModalView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i2), keyEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ced6cf74f6695266a3fad0f7feb77b52", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ced6cf74f6695266a3fad0f7feb77b52")).booleanValue();
                }
                if (keyEvent.getAction() == 1) {
                    if (i2 == 4) {
                        try {
                            RecceModalView.this.mOnRequestCloseListener.onRequestClose(dialogInterface);
                        } catch (Exception unused) {
                        }
                        return true;
                    }
                    Activity currentActivity2 = ((ReactContext) RecceModalView.this.getContext()).getCurrentActivity();
                    if (currentActivity2 != null) {
                        return currentActivity2.onKeyUp(i2, keyEvent);
                    }
                }
                return false;
            }
        });
        this.mDialog.getWindow().setSoftInputMode(16);
        if (this.mHardwareAccelerated) {
            this.mDialog.getWindow().addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        this.mDialog.show();
        if (context instanceof Activity) {
            this.mDialog.getWindow().getDecorView().setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
        }
        this.mDialog.getWindow().clearFlags(8);
    }

    @UiThread
    public void updateState(an anVar, int i, int i2) {
        Object[] objArr = {anVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acc4c2b0aaffb757b3dc7302be529bf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acc4c2b0aaffb757b3dc7302be529bf5");
        } else {
            this.mHostView.updateState(anVar, i, i2);
        }
    }

    private View getContentView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e51e03f195a99ba57ea905cb0358797b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e51e03f195a99ba57ea905cb0358797b");
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.mHostView);
        if (this.mStatusBarTranslucent) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private void updateProperties() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6f0ca1355eee1cfc1ed6bfe972ce491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6f0ca1355eee1cfc1ed6bfe972ce491");
            return;
        }
        com.facebook.infer.annotation.a.a(this.mDialog, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                this.mDialog.getWindow().addFlags(1024);
            } else {
                this.mDialog.getWindow().clearFlags(1024);
            }
        }
        if (this.mTransparent) {
            this.mDialog.getWindow().clearFlags(2);
            return;
        }
        this.mDialog.getWindow().setDimAmount(0.5f);
        this.mDialog.getWindow().setFlags(2, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class DialogRootViewGroup extends RecceViewGroup {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean hasAdjustedSize;
        private final j mJSTouchDispatcher;
        @Nullable
        private an mStateWrapper;
        private int viewHeight;
        private int viewWidth;

        public DialogRootViewGroup(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "429005602987c566b72cf2f402c4f22b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "429005602987c566b72cf2f402c4f22b");
                return;
            }
            this.hasAdjustedSize = false;
            this.mJSTouchDispatcher = new j(this);
        }

        @Override // com.meituan.android.recce.views.view.RecceViewGroup, android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01253c949748831339ad4115987479b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01253c949748831339ad4115987479b9");
                return;
            }
            super.onSizeChanged(i, i2, i3, i4);
            this.viewWidth = i;
            this.viewHeight = i2;
            updateFirstChildView();
        }

        private void updateFirstChildView() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aed07f7ec17fc62db4da03e9bfc16737", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aed07f7ec17fc62db4da03e9bfc16737");
            } else if (getChildCount() > 0) {
                this.hasAdjustedSize = false;
                final int id = getChildAt(0).getId();
                if (this.mStateWrapper != null) {
                    updateState(this.mStateWrapper, this.viewWidth, this.viewHeight);
                    return;
                }
                ReactContext reactContext = getReactContext();
                reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext) { // from class: com.meituan.android.recce.views.modal.RecceModalView.DialogRootViewGroup.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.facebook.react.bridge.GuardedRunnable
                    public void runGuarded() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a1e104e93213ee2532ec02fa980ee462", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a1e104e93213ee2532ec02fa980ee462");
                        } else {
                            ((UIManagerModule) DialogRootViewGroup.this.getReactContext().getNativeModule(UIManagerModule.class)).updateNodeSize(id, DialogRootViewGroup.this.viewWidth, DialogRootViewGroup.this.viewHeight);
                        }
                    }
                });
            } else {
                this.hasAdjustedSize = true;
            }
        }

        @UiThread
        public void updateState(an anVar, int i, int i2) {
            Object[] objArr = {anVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78a920ebf529ac2281ac7532e89505cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78a920ebf529ac2281ac7532e89505cd");
                return;
            }
            this.mStateWrapper = anVar;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("screenWidth", w.c(i));
            writableNativeMap.putDouble("screenHeight", w.c(i2));
        }

        @Override // com.meituan.android.recce.views.view.RecceViewGroup, android.view.ViewGroup
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            Object[] objArr = {view, Integer.valueOf(i), layoutParams};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea23aed26ded403b446af606f3508ba9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea23aed26ded403b446af606f3508ba9");
                return;
            }
            super.addView(view, i, layoutParams);
            if (this.hasAdjustedSize) {
                updateFirstChildView();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ReactContext getReactContext() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c2aa3ad2951a1e824a3b00193b5534f", RobustBitConfig.DEFAULT_VALUE) ? (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c2aa3ad2951a1e824a3b00193b5534f") : (ReactContext) getContext();
        }
    }
}
