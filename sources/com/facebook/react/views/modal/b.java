package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.aj;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.view.f;
import com.meituan.android.common.statistics.Constants;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends ViewGroup implements LifecycleEventListener {
    a a;
    @Nullable
    private Dialog b;
    private boolean c;
    private boolean d;
    private String e;
    private boolean f;
    private boolean g;
    @Nullable
    private DialogInterface.OnShowListener h;
    @Nullable
    private InterfaceC0152b i;

    /* compiled from: ProGuard */
    /* renamed from: com.facebook.react.views.modal.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0152b {
        void a(DialogInterface dialogInterface);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public b(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.a = new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        this.a.dispatchProvideStructure(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        UiThreadUtil.assertOnUiThread();
        this.a.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final int getChildCount() {
        return this.a.getChildCount();
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        return this.a.getChildAt(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.a.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        this.a.removeView(getChildAt(i));
    }

    public final void a() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        c();
    }

    private void c() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        if (this.b != null) {
            if (this.b.isShowing() && ((activity = (Activity) com.facebook.react.views.common.a.a(this.b.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.b.dismiss();
            }
            this.b = null;
            ((ViewGroup) this.a.getParent()).removeViewAt(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setOnRequestCloseListener(InterfaceC0152b interfaceC0152b) {
        this.i = interfaceC0152b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.h = onShowListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setTransparent(boolean z) {
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setStatusBarTranslucent(boolean z) {
        this.d = z;
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setAnimationType(String str) {
        this.e = str;
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setHardwareAccelerated(boolean z) {
        this.f = z;
        this.g = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        a();
    }

    @Nullable
    @VisibleForTesting
    public final Dialog getDialog() {
        return this.b;
    }

    @Nullable
    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        UiThreadUtil.assertOnUiThread();
        if (this.b != null) {
            if (this.g) {
                c();
            } else {
                d();
                return;
            }
        }
        this.g = false;
        int i = 2131558942;
        if (MarketingModel.DIALOG_SHOW_TYPE_FADE.equals(this.e)) {
            i = 2131558943;
        } else if (Constants.EventType.SLIDE.equals(this.e)) {
            i = 2131558944;
        }
        Activity currentActivity = getCurrentActivity();
        Context context = currentActivity == null ? getContext() : currentActivity;
        this.b = new Dialog(context, i);
        this.b.getWindow().setFlags(8, 8);
        this.b.setContentView(getContentView());
        d();
        this.b.setOnShowListener(this.h);
        this.b.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.facebook.react.views.modal.b.1
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 1) {
                    if (i2 == 4) {
                        com.facebook.infer.annotation.a.a(b.this.i, "setOnRequestCloseListener must be called by the manager");
                        b.this.i.a(dialogInterface);
                        return true;
                    }
                    Activity currentActivity2 = ((ReactContext) b.this.getContext()).getCurrentActivity();
                    if (currentActivity2 != null) {
                        return currentActivity2.onKeyUp(i2, keyEvent);
                    }
                    return false;
                }
                return false;
            }
        });
        this.b.getWindow().setSoftInputMode(16);
        if (this.f) {
            this.b.getWindow().addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        this.b.show();
        if (context instanceof Activity) {
            this.b.getWindow().getDecorView().setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
        }
        this.b.getWindow().clearFlags(8);
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.a);
        if (this.d) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private void d() {
        com.facebook.infer.annotation.a.a(this.b, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                this.b.getWindow().addFlags(1024);
            } else {
                this.b.getWindow().clearFlags(1024);
            }
        }
        if (this.c) {
            this.b.getWindow().clearFlags(2);
            return;
        }
        this.b.getWindow().setDimAmount(0.5f);
        this.b.getWindow().setFlags(2, 2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends f implements aj {
        private boolean a;
        private int b;
        private int c;
        @Nullable
        private an d;
        private final j e;

        @Override // android.view.ViewGroup, android.view.ViewParent
        public final void requestDisallowInterceptTouchEvent(boolean z) {
        }

        public a(Context context) {
            super(context);
            this.a = false;
            this.e = new j(this);
        }

        @Override // com.facebook.react.views.view.f, android.view.View
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.b = i;
            this.c = i2;
            a();
        }

        private void a() {
            if (getChildCount() > 0) {
                this.a = false;
                final int id = getChildAt(0).getId();
                if (this.d != null) {
                    a(this.d, this.b, this.c);
                    return;
                }
                ReactContext reactContext = getReactContext();
                reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext) { // from class: com.facebook.react.views.modal.b.a.1
                    @Override // com.facebook.react.bridge.GuardedRunnable
                    public final void runGuarded() {
                        ((UIManagerModule) a.this.getReactContext().getNativeModule(UIManagerModule.class)).updateNodeSize(id, a.this.b, a.this.c);
                    }
                });
                return;
            }
            this.a = true;
        }

        @UiThread
        public final void a(an anVar, int i, int i2) {
            this.d = anVar;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("screenWidth", w.c(i));
            writableNativeMap.putDouble("screenHeight", w.c(i2));
        }

        @Override // com.facebook.react.views.view.f, android.view.ViewGroup
        public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            if (this.a) {
                a();
            }
        }

        @Override // com.facebook.react.uimanager.aj
        public final void handleException(Throwable th) {
            getReactContext().handleException(new RuntimeException(th));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ReactContext getReactContext() {
            return (ReactContext) getContext();
        }

        @Override // com.facebook.react.views.view.f, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.e.b(motionEvent, getEventDispatcher());
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // com.facebook.react.views.view.f, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            this.e.b(motionEvent, getEventDispatcher());
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // com.facebook.react.uimanager.aj
        public final void onChildStartedNativeGesture(MotionEvent motionEvent) {
            this.e.a(motionEvent, getEventDispatcher());
        }

        private com.facebook.react.uimanager.events.c getEventDispatcher() {
            return ((UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }
    }
}
