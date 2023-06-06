package com.meituan.msc.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.infer.annotation.ThreadConfined;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.jse.modules.core.JSDeviceEventEmitter;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.ad;
import com.meituan.msc.uimanager.an;
import com.meituan.msc.uimanager.h;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReactRootView extends FrameLayout implements ad {
    private static final String TAG = "ReactRootView";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<b> changedCallbackList;
    private final com.meituan.msc.a mAndroidHWInputDeviceHelper;
    @Nullable
    private a mCustomGlobalLayoutListener;
    private int mHeightMeasureSpec;
    private boolean mIsAttachedToInstance;
    @Nullable
    private h mJSTouchDispatcher;
    private int mLastHeight;
    private int mLastWidth;
    private WeakReference<ReactContext> mReactContext;
    @Nullable
    private c mRootViewEventListener;
    private int mRootViewTag;
    private final boolean mUseSurface;
    private boolean mWasMeasured;
    private int mWidthMeasureSpec;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i, int i2, int i3, int i4);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
    }

    public ViewGroup getRootViewGroup() {
        return this;
    }

    public ReactRootView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b89b92e62919a8b1638842acfa28786", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b89b92e62919a8b1638842acfa28786");
            return;
        }
        this.mAndroidHWInputDeviceHelper = new com.meituan.msc.a(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.changedCallbackList = new ArrayList();
        this.mUseSurface = false;
        init();
    }

    public ReactRootView(Context context, boolean z) {
        super(context);
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "971d63ada5df1a24ef3693c18f11011e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "971d63ada5df1a24ef3693c18f11011e");
            return;
        }
        this.mAndroidHWInputDeviceHelper = new com.meituan.msc.a(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.changedCallbackList = new ArrayList();
        this.mUseSurface = z;
        init();
    }

    public ReactRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "956322e87cfee1203a0f23d2230d539c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "956322e87cfee1203a0f23d2230d539c");
            return;
        }
        this.mAndroidHWInputDeviceHelper = new com.meituan.msc.a(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.changedCallbackList = new ArrayList();
        this.mUseSurface = false;
        init();
    }

    public ReactRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03a4e4151e683aec43e410a7346ad9fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03a4e4151e683aec43e410a7346ad9fa");
            return;
        }
        this.mAndroidHWInputDeviceHelper = new com.meituan.msc.a(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.changedCallbackList = new ArrayList();
        this.mUseSurface = false;
        init();
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ad19392a49059b16198c5dcc2147d3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ad19392a49059b16198c5dcc2147d3d");
            return;
        }
        setClipChildren(false);
        if (this.mRootViewTag == 0) {
            this.mRootViewTag = 1;
        }
    }

    public void setReactContext(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "542d6570d531d36bf576db56f733006f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "542d6570d531d36bf576db56f733006f");
        } else {
            this.mReactContext = new WeakReference<>(reactContext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[Catch: all -> 0x00cd, LOOP:1: B:24:0x0057->B:26:0x005d, LOOP_END, TryCatch #0 {all -> 0x00cd, blocks: (B:11:0x0035, B:13:0x0039, B:18:0x0041, B:22:0x0050, B:28:0x007c, B:32:0x0085, B:37:0x00af, B:39:0x00b6, B:41:0x00ba, B:44:0x00c5, B:43:0x00be, B:34:0x008b, B:36:0x0091, B:24:0x0057, B:26:0x005d), top: B:50:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[Catch: all -> 0x00cd, LOOP:0: B:34:0x008b->B:36:0x0091, LOOP_END, TryCatch #0 {all -> 0x00cd, blocks: (B:11:0x0035, B:13:0x0039, B:18:0x0041, B:22:0x0050, B:28:0x007c, B:32:0x0085, B:37:0x00af, B:39:0x00b6, B:41:0x00ba, B:44:0x00c5, B:43:0x00be, B:34:0x008b, B:36:0x0091, B:24:0x0057, B:26:0x005d), top: B:50:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:11:0x0035, B:13:0x0039, B:18:0x0041, B:22:0x0050, B:28:0x007c, B:32:0x0085, B:37:0x00af, B:39:0x00b6, B:41:0x00ba, B:44:0x00c5, B:43:0x00be, B:34:0x008b, B:36:0x0091, B:24:0x0057, B:26:0x005d), top: B:50:0x0035 }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.views.ReactRootView.changeQuickRedirect
            java.lang.String r11 = "d9745a79c80adedeae0d0b2cc82d1f0c"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            return
        L26:
            boolean r0 = r12.mUseSurface
            if (r0 == 0) goto L2e
            super.onMeasure(r13, r14)
            return
        L2e:
            java.lang.String r0 = "ReactRootView.onMeasure"
            r1 = 0
            com.meituan.msc.systrace.a.a(r1, r0)
            int r0 = r12.mWidthMeasureSpec     // Catch: java.lang.Throwable -> Lcd
            if (r13 != r0) goto L40
            int r0 = r12.mHeightMeasureSpec     // Catch: java.lang.Throwable -> Lcd
            if (r14 == r0) goto L3e
            goto L40
        L3e:
            r0 = 0
            goto L41
        L40:
            r0 = 1
        L41:
            r12.mWidthMeasureSpec = r13     // Catch: java.lang.Throwable -> Lcd
            r12.mHeightMeasureSpec = r14     // Catch: java.lang.Throwable -> Lcd
            int r3 = android.view.View.MeasureSpec.getMode(r13)     // Catch: java.lang.Throwable -> Lcd
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L55
            if (r3 != 0) goto L50
            goto L55
        L50:
            int r13 = android.view.View.MeasureSpec.getSize(r13)     // Catch: java.lang.Throwable -> Lcd
            goto L7c
        L55:
            r13 = 0
            r3 = 0
        L57:
            int r5 = r12.getChildCount()     // Catch: java.lang.Throwable -> Lcd
            if (r13 >= r5) goto L7b
            android.view.View r5 = r12.getChildAt(r13)     // Catch: java.lang.Throwable -> Lcd
            int r6 = r5.getLeft()     // Catch: java.lang.Throwable -> Lcd
            int r7 = r5.getMeasuredWidth()     // Catch: java.lang.Throwable -> Lcd
            int r6 = r6 + r7
            int r7 = r5.getPaddingLeft()     // Catch: java.lang.Throwable -> Lcd
            int r6 = r6 + r7
            int r5 = r5.getPaddingRight()     // Catch: java.lang.Throwable -> Lcd
            int r6 = r6 + r5
            int r3 = java.lang.Math.max(r3, r6)     // Catch: java.lang.Throwable -> Lcd
            int r13 = r13 + 1
            goto L57
        L7b:
            r13 = r3
        L7c:
            int r3 = android.view.View.MeasureSpec.getMode(r14)     // Catch: java.lang.Throwable -> Lcd
            if (r3 == r4) goto L8a
            if (r3 != 0) goto L85
            goto L8a
        L85:
            int r14 = android.view.View.MeasureSpec.getSize(r14)     // Catch: java.lang.Throwable -> Lcd
            goto Laf
        L8a:
            r14 = 0
        L8b:
            int r3 = r12.getChildCount()     // Catch: java.lang.Throwable -> Lcd
            if (r8 >= r3) goto Laf
            android.view.View r3 = r12.getChildAt(r8)     // Catch: java.lang.Throwable -> Lcd
            int r4 = r3.getTop()     // Catch: java.lang.Throwable -> Lcd
            int r5 = r3.getMeasuredHeight()     // Catch: java.lang.Throwable -> Lcd
            int r4 = r4 + r5
            int r5 = r3.getPaddingTop()     // Catch: java.lang.Throwable -> Lcd
            int r4 = r4 + r5
            int r3 = r3.getPaddingBottom()     // Catch: java.lang.Throwable -> Lcd
            int r4 = r4 + r3
            int r14 = java.lang.Math.max(r14, r4)     // Catch: java.lang.Throwable -> Lcd
            int r8 = r8 + 1
            goto L8b
        Laf:
            r12.setMeasuredDimension(r13, r14)     // Catch: java.lang.Throwable -> Lcd
            r12.mWasMeasured = r9     // Catch: java.lang.Throwable -> Lcd
            if (r0 != 0) goto Lbe
            int r0 = r12.mLastWidth     // Catch: java.lang.Throwable -> Lcd
            if (r0 != r13) goto Lbe
            int r0 = r12.mLastHeight     // Catch: java.lang.Throwable -> Lcd
            if (r0 == r14) goto Lc5
        Lbe:
            int r0 = r12.mWidthMeasureSpec     // Catch: java.lang.Throwable -> Lcd
            int r3 = r12.mHeightMeasureSpec     // Catch: java.lang.Throwable -> Lcd
            r12.updateRootLayoutSpecs(r0, r3)     // Catch: java.lang.Throwable -> Lcd
        Lc5:
            r12.mLastWidth = r13     // Catch: java.lang.Throwable -> Lcd
            r12.mLastHeight = r14     // Catch: java.lang.Throwable -> Lcd
            com.meituan.msc.systrace.a.a(r1)
            return
        Lcd:
            r13 = move-exception
            com.meituan.msc.systrace.a.a(r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.views.ReactRootView.onMeasure(int, int):void");
    }

    @Override // com.meituan.msc.uimanager.ad
    public void onChildStartedNativeGesture(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fba095e2d4dd216770fe6aff039d636f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fba095e2d4dd216770fe6aff039d636f");
        } else if (!this.mIsAttachedToInstance || getCurrentReactContext() == null) {
            g.e(TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.mJSTouchDispatcher == null) {
            g.e(TAG, "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.mJSTouchDispatcher.b(motionEvent, getCurrentReactContext().getUIManagerModule().a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReactContext getCurrentReactContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13ba1561bd70f1f816b45cca5e02c57d", RobustBitConfig.DEFAULT_VALUE) ? (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13ba1561bd70f1f816b45cca5e02c57d") : this.mReactContext.get();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4ae5ee295a2cf8cbd466e11a85f2e5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4ae5ee295a2cf8cbd466e11a85f2e5b")).booleanValue();
        }
        dispatchJSTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "302c314a144415c5c40883bc90ebd5ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "302c314a144415c5c40883bc90ebd5ae")).booleanValue();
        }
        dispatchJSTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f040c3e961fa9dd9d592c2e069f8b8b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f040c3e961fa9dd9d592c2e069f8b8b3");
            return;
        }
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            handleException(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ab2d3645767d5c7ec7d4080b2c28d3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ab2d3645767d5c7ec7d4080b2c28d3d")).booleanValue();
        }
        if (getCurrentReactContext() == null) {
            g.e(TAG, "Unable to handle key event as the catalyst instance has not been attached");
            return super.dispatchKeyEvent(keyEvent);
        }
        com.meituan.msc.a aVar = this.mAndroidHWInputDeviceHelper;
        Object[] objArr2 = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "312680f98ea2456ac2efbbfcaa571396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "312680f98ea2456ac2efbbfcaa571396");
        } else {
            int keyCode = keyEvent.getKeyCode();
            int action = keyEvent.getAction();
            if ((action == 1 || action == 0) && com.meituan.msc.a.b.containsKey(Integer.valueOf(keyCode))) {
                aVar.a(com.meituan.msc.a.b.get(Integer.valueOf(keyCode)), aVar.c, action);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3a157f2c7b4f13755748c9db0c54d2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3a157f2c7b4f13755748c9db0c54d2c");
        } else if (!this.mIsAttachedToInstance || getCurrentReactContext() == null) {
            g.e(TAG, "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z, i, rect);
        } else {
            com.meituan.msc.a aVar = this.mAndroidHWInputDeviceHelper;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "582b21149d6157fc64a8f20d3718e216", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "582b21149d6157fc64a8f20d3718e216");
            } else {
                if (aVar.c != -1) {
                    aVar.a("blur", aVar.c);
                }
                aVar.c = -1;
            }
            super.onFocusChanged(z, i, rect);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1baea69f4cc10320c316006dbc44eeb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1baea69f4cc10320c316006dbc44eeb0");
        } else if (!this.mIsAttachedToInstance || getCurrentReactContext() == null) {
            g.e(TAG, "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
        } else {
            com.meituan.msc.a aVar = this.mAndroidHWInputDeviceHelper;
            Object[] objArr2 = {view2};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "33e8b4f0cd528a5ca4120985bd59e42c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "33e8b4f0cd528a5ca4120985bd59e42c");
            } else if (aVar.c != view2.getId()) {
                if (aVar.c != -1) {
                    aVar.a("blur", aVar.c);
                }
                aVar.c = view2.getId();
                aVar.a("focus", view2.getId());
            }
            super.requestChildFocus(view, view2);
        }
    }

    private void dispatchJSTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4effb6c159bad0dcb94a2729c67270d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4effb6c159bad0dcb94a2729c67270d3");
        } else if (!this.mIsAttachedToInstance || getCurrentReactContext() == null) {
            g.e(TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.mJSTouchDispatcher == null) {
            g.e(TAG, "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.mJSTouchDispatcher.a(motionEvent, getCurrentReactContext().getUIManagerModule().a());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abc1ced2c46217463d8f0d920f00aa59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abc1ced2c46217463d8f0d920f00aa59");
        } else if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fae71a1940c7e43c10b85e61d2ee4298", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fae71a1940c7e43c10b85e61d2ee4298");
        } else if (this.mUseSurface) {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "859a6452540074538fb8b00b0fa7a6a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "859a6452540074538fb8b00b0fa7a6a5");
            return;
        }
        super.onAttachedToWindow();
        if (this.mIsAttachedToInstance) {
            removeOnGlobalLayoutListener();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47a16b810785f639b80aa3233d14f0a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47a16b810785f639b80aa3233d14f0a6");
            return;
        }
        super.onDetachedFromWindow();
        if (this.mIsAttachedToInstance) {
            removeOnGlobalLayoutListener();
        }
    }

    private void removeOnGlobalLayoutListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0cc5c19a65b862f98f2166223f6044e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0cc5c19a65b862f98f2166223f6044e");
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b23f65ab2f32c2ab53cc88bbacd6af0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b23f65ab2f32c2ab53cc88bbacd6af0");
        } else {
            super.onViewAdded(view);
        }
    }

    public void startReactApplication(String str, @Nullable Bundle bundle) {
        Object[] objArr = {str, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "733812fa15250a844bd5d23757fea4d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "733812fa15250a844bd5d23757fea4d2");
        } else {
            startReactApplication(str, bundle, null);
        }
    }

    @ThreadConfined(ThreadConfined.UI)
    public void startReactApplication(String str, @Nullable Bundle bundle, @Nullable String str2) {
        Object[] objArr = {str, bundle, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b4ff6c88ae8e49fe61196d222eee226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b4ff6c88ae8e49fe61196d222eee226");
            return;
        }
        com.meituan.msc.systrace.a.a(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            attachToReactInstanceManager();
        } finally {
            com.meituan.msc.systrace.a.a(0L);
        }
    }

    public int getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    public int getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    private void updateRootLayoutSpecs(int i, int i2) {
        com.meituan.msc.c a2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "821f13e783a1e89719814c2b7bea0383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "821f13e783a1e89719814c2b7bea0383");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null || (a2 = an.a(currentReactContext)) == null) {
            return;
        }
        a2.a(getRootViewTag(), i, i2);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void unmountReactApplication() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dde87b338c6da8ca20d2035d6e9f7f44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dde87b338c6da8ca20d2035d6e9f7f44");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (this.mIsAttachedToInstance) {
            this.mIsAttachedToInstance = false;
        }
    }

    public void onStage(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a1f9bae368c6de2aac30ff54150f911", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a1f9bae368c6de2aac30ff54150f911");
        } else if (i != 101) {
        } else {
            onAttachedToReactInstance();
        }
    }

    public void onAttachedToReactInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbbaf73ac97d0308ce141f46ca6cb4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbbaf73ac97d0308ce141f46ca6cb4e7");
        } else {
            this.mJSTouchDispatcher = new h(this);
        }
    }

    public void setEventListener(c cVar) {
        this.mRootViewEventListener = cVar;
    }

    @VisibleForTesting
    public void simulateAttachForTesting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b93d189251c4c75d77f883c70159d09f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b93d189251c4c75d77f883c70159d09f");
            return;
        }
        this.mIsAttachedToInstance = true;
        this.mJSTouchDispatcher = new h(this);
    }

    private a getCustomGlobalLayoutListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "317f15b174f49c2fcbe737c95b3d3d5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "317f15b174f49c2fcbe737c95b3d3d5e");
        }
        if (this.mCustomGlobalLayoutListener == null) {
            this.mCustomGlobalLayoutListener = new a();
        }
        return this.mCustomGlobalLayoutListener;
    }

    private void attachToReactInstanceManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1a4fb7e4b86ac8396a02f520910b4d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1a4fb7e4b86ac8396a02f520910b4d8");
            return;
        }
        com.meituan.msc.systrace.a.a(0L, "attachToReactInstanceManager");
        if (this.mIsAttachedToInstance) {
            return;
        }
        try {
            this.mIsAttachedToInstance = true;
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            com.meituan.msc.systrace.a.a(0L);
        }
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e96248c420cec121acca46c6c24e67a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e96248c420cec121acca46c6c24e67a");
            return;
        }
        super.finalize();
        com.facebook.infer.annotation.a.a(!this.mIsAttachedToInstance, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public int getRootViewTag() {
        return this.mRootViewTag;
    }

    public void setRootViewTag(int i) {
        this.mRootViewTag = i;
    }

    @Override // com.meituan.msc.uimanager.ad
    public void handleException(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a24f0a2b88d7377fdf9601e2981354d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a24f0a2b88d7377fdf9601e2981354d");
        } else if (getCurrentReactContext() == null) {
            throw new RuntimeException(th);
        } else {
            getCurrentReactContext().handleException(new com.meituan.msc.uimanager.g(th.getMessage(), this, th));
        }
    }

    public void sendEvent(String str, @Nullable WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27485059f3ccc925859340fa79ae2787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27485059f3ccc925859340fa79ae2787");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            ((JSDeviceEventEmitter) currentReactContext.getJSModule(JSDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static ChangeQuickRedirect a;
        private final Rect c;
        private final int d;
        private int e;
        private int f;

        public a() {
            Object[] objArr = {ReactRootView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfaf5b381fb89dedb99170129c3b9810", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfaf5b381fb89dedb99170129c3b9810");
                return;
            }
            this.e = 0;
            this.f = 0;
            com.meituan.msc.uimanager.c.a(ReactRootView.this.getContext().getApplicationContext());
            this.c = new Rect();
            this.d = (int) s.a(60.0f);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            String str;
            double d;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b6b711fd01151d138ec3d77fc8977b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b6b711fd01151d138ec3d77fc8977b4");
            } else if (!ReactRootView.this.mIsAttachedToInstance || ReactRootView.this.getCurrentReactContext() == null) {
            } else {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                boolean z = true;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4809e953f29629c99bdfa6214b082f78", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4809e953f29629c99bdfa6214b082f78");
                } else {
                    ReactRootView.this.getRootView().getWindowVisibleDisplayFrame(this.c);
                    int i = com.meituan.msc.uimanager.c.b.heightPixels - this.c.bottom;
                    if (this.e != i && i > this.d) {
                        this.e = i;
                        ReactRootView.this.sendEvent("keyboardDidShow", a(s.c(this.c.bottom), s.c(this.c.left), s.c(this.c.width()), s.c(this.e)));
                    } else {
                        if (this.e != 0 && i <= this.d) {
                            this.e = 0;
                            ReactRootView.this.sendEvent("keyboardDidHide", a(s.c(ReactRootView.this.mLastHeight), 0.0d, s.c(this.c.width()), 0.0d));
                        }
                    }
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b66daaa292a3c6d93f6198d2903b01dd", RobustBitConfig.DEFAULT_VALUE)) {
                    int rotation = ((WindowManager) ReactRootView.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
                    if (this.f != rotation) {
                        this.f = rotation;
                        Object[] objArr4 = {Integer.valueOf(rotation)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c96f9e2c3e8dd51fda104ad6c491d6d7", RobustBitConfig.DEFAULT_VALUE)) {
                            switch (rotation) {
                                case 0:
                                    str = "portrait-primary";
                                    d = 0.0d;
                                    z = false;
                                    WritableMap createMap = Arguments.createMap();
                                    createMap.putString("name", str);
                                    createMap.putDouble("rotationDegrees", d);
                                    createMap.putBoolean("isLandscape", z);
                                    ReactRootView.this.sendEvent("namedOrientationDidChange", createMap);
                                    break;
                                case 1:
                                    str = "landscape-primary";
                                    d = -90.0d;
                                    WritableMap createMap2 = Arguments.createMap();
                                    createMap2.putString("name", str);
                                    createMap2.putDouble("rotationDegrees", d);
                                    createMap2.putBoolean("isLandscape", z);
                                    ReactRootView.this.sendEvent("namedOrientationDidChange", createMap2);
                                    break;
                                case 2:
                                    str = "portrait-secondary";
                                    d = 180.0d;
                                    z = false;
                                    WritableMap createMap22 = Arguments.createMap();
                                    createMap22.putString("name", str);
                                    createMap22.putDouble("rotationDegrees", d);
                                    createMap22.putBoolean("isLandscape", z);
                                    ReactRootView.this.sendEvent("namedOrientationDidChange", createMap22);
                                    break;
                                case 3:
                                    str = "landscape-secondary";
                                    d = 90.0d;
                                    WritableMap createMap222 = Arguments.createMap();
                                    createMap222.putString("name", str);
                                    createMap222.putDouble("rotationDegrees", d);
                                    createMap222.putBoolean("isLandscape", z);
                                    ReactRootView.this.sendEvent("namedOrientationDidChange", createMap222);
                                    break;
                            }
                        } else {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c96f9e2c3e8dd51fda104ad6c491d6d7");
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b66daaa292a3c6d93f6198d2903b01dd");
                }
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6113ec33e35df2f7195c92a8181997cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6113ec33e35df2f7195c92a8181997cd");
                }
            }
        }

        private WritableMap a(double d, double d2, double d3, double d4) {
            Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9cbd4fb5b8b10a187c2858565c4f52", RobustBitConfig.DEFAULT_VALUE)) {
                return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9cbd4fb5b8b10a187c2858565c4f52");
            }
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble("height", d4);
            createMap2.putDouble("screenX", d2);
            createMap2.putDouble("width", d3);
            createMap2.putDouble("screenY", d);
            createMap.putMap("endCoordinates", createMap2);
            createMap.putString("easing", "keyboard");
            createMap.putDouble("duration", 0.0d);
            return createMap;
        }
    }

    public void addSizeChangeCallback(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "393149d742fd86fb5a173039684c57bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "393149d742fd86fb5a173039684c57bd");
        } else if (bVar != null) {
            this.changedCallbackList.add(bVar);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c72ce9eb893467709e914881398c3e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c72ce9eb893467709e914881398c3e7");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.changedCallbackList != null) {
            for (b bVar : this.changedCallbackList) {
                bVar.a(i, i2, i3, i4);
            }
        }
    }
}
