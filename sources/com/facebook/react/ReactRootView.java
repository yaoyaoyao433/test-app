package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ad;
import com.facebook.react.uimanager.aj;
import com.facebook.react.uimanager.au;
import com.facebook.react.uimanager.w;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactRootView extends FrameLayout implements ad, aj {
    private static final String TAG = "ReactRootView";
    private com.facebook.react.log.a fmpListener;
    private com.facebook.react.log.b jsTouchProcessedListener;
    private final d mAndroidHWInputDeviceHelper;
    @Nullable
    private Bundle mAppProperties;
    @Nullable
    private a mCustomGlobalLayoutListener;
    private com.facebook.react.log.c mFsTimeLogger;
    private int mHeightMeasureSpec;
    @Nullable
    private String mInitialUITemplate;
    private boolean mIsAttachedToInstance;
    @Nullable
    private String mJSModuleName;
    @Nullable
    private com.facebook.react.uimanager.j mJSTouchDispatcher;
    private int mLastHeight;
    private int mLastWidth;
    @Nullable
    protected ReactInstanceManager mReactInstanceManager;
    @Nullable
    private b mRootViewEventListener;
    private int mRootViewTag;
    private boolean mShouldLogContentAppeared;
    private int mUIManagerType;
    private final boolean mUseSurface;
    private boolean mWasMeasured;
    private int mWidthMeasureSpec;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void a(ReactRootView reactRootView);
    }

    @Override // com.facebook.react.uimanager.ad
    public ViewGroup getRootViewGroup() {
        return this;
    }

    public ReactRootView(Context context) {
        super(context);
        this.mAndroidHWInputDeviceHelper = new d(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.mUIManagerType = 1;
        this.mUseSurface = false;
        init();
    }

    public ReactRootView(Context context, boolean z) {
        super(context);
        this.mAndroidHWInputDeviceHelper = new d(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.mUIManagerType = 1;
        this.mUseSurface = z;
        init();
    }

    public ReactRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAndroidHWInputDeviceHelper = new d(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.mUIManagerType = 1;
        this.mUseSurface = false;
        init();
    }

    public ReactRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAndroidHWInputDeviceHelper = new d(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.mUIManagerType = 1;
        this.mUseSurface = false;
        init();
    }

    private void init() {
        setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039 A[Catch: all -> 0x00b5, LOOP:1: B:20:0x0033->B:22:0x0039, LOOP_END, TryCatch #0 {all -> 0x00b5, blocks: (B:7:0x000f, B:9:0x0015, B:14:0x001d, B:18:0x002c, B:24:0x0058, B:28:0x0061, B:33:0x008b, B:35:0x0094, B:37:0x0098, B:44:0x00ad, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:30:0x0067, B:32:0x006d, B:20:0x0033, B:22:0x0039), top: B:50:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[Catch: all -> 0x00b5, LOOP:0: B:30:0x0067->B:32:0x006d, LOOP_END, TryCatch #0 {all -> 0x00b5, blocks: (B:7:0x000f, B:9:0x0015, B:14:0x001d, B:18:0x002c, B:24:0x0058, B:28:0x0061, B:33:0x008b, B:35:0x0094, B:37:0x0098, B:44:0x00ad, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:30:0x0067, B:32:0x006d, B:20:0x0033, B:22:0x0039), top: B:50:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:7:0x000f, B:9:0x0015, B:14:0x001d, B:18:0x002c, B:24:0x0058, B:28:0x0061, B:33:0x008b, B:35:0x0094, B:37:0x0098, B:44:0x00ad, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:30:0x0067, B:32:0x006d, B:20:0x0033, B:22:0x0039), top: B:50:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:7:0x000f, B:9:0x0015, B:14:0x001d, B:18:0x002c, B:24:0x0058, B:28:0x0061, B:33:0x008b, B:35:0x0094, B:37:0x0098, B:44:0x00ad, B:39:0x009e, B:41:0x00a2, B:43:0x00a6, B:30:0x0067, B:32:0x006d, B:20:0x0033, B:22:0x0039), top: B:50:0x000f }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            boolean r0 = r10.mUseSurface
            if (r0 == 0) goto L8
            super.onMeasure(r11, r12)
            return
        L8:
            java.lang.String r0 = "ReactRootView.onMeasure"
            r1 = 0
            com.facebook.systrace.a.a(r1, r0)
            int r0 = r10.mWidthMeasureSpec     // Catch: java.lang.Throwable -> Lb5
            r3 = 1
            r4 = 0
            if (r11 != r0) goto L1c
            int r0 = r10.mHeightMeasureSpec     // Catch: java.lang.Throwable -> Lb5
            if (r12 == r0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            r10.mWidthMeasureSpec = r11     // Catch: java.lang.Throwable -> Lb5
            r10.mHeightMeasureSpec = r12     // Catch: java.lang.Throwable -> Lb5
            int r5 = android.view.View.MeasureSpec.getMode(r11)     // Catch: java.lang.Throwable -> Lb5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L31
            if (r5 != 0) goto L2c
            goto L31
        L2c:
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch: java.lang.Throwable -> Lb5
            goto L58
        L31:
            r11 = 0
            r5 = 0
        L33:
            int r7 = r10.getChildCount()     // Catch: java.lang.Throwable -> Lb5
            if (r11 >= r7) goto L57
            android.view.View r7 = r10.getChildAt(r11)     // Catch: java.lang.Throwable -> Lb5
            int r8 = r7.getLeft()     // Catch: java.lang.Throwable -> Lb5
            int r9 = r7.getMeasuredWidth()     // Catch: java.lang.Throwable -> Lb5
            int r8 = r8 + r9
            int r9 = r7.getPaddingLeft()     // Catch: java.lang.Throwable -> Lb5
            int r8 = r8 + r9
            int r7 = r7.getPaddingRight()     // Catch: java.lang.Throwable -> Lb5
            int r8 = r8 + r7
            int r5 = java.lang.Math.max(r5, r8)     // Catch: java.lang.Throwable -> Lb5
            int r11 = r11 + 1
            goto L33
        L57:
            r11 = r5
        L58:
            int r5 = android.view.View.MeasureSpec.getMode(r12)     // Catch: java.lang.Throwable -> Lb5
            if (r5 == r6) goto L66
            if (r5 != 0) goto L61
            goto L66
        L61:
            int r12 = android.view.View.MeasureSpec.getSize(r12)     // Catch: java.lang.Throwable -> Lb5
            goto L8b
        L66:
            r12 = 0
        L67:
            int r5 = r10.getChildCount()     // Catch: java.lang.Throwable -> Lb5
            if (r4 >= r5) goto L8b
            android.view.View r5 = r10.getChildAt(r4)     // Catch: java.lang.Throwable -> Lb5
            int r6 = r5.getTop()     // Catch: java.lang.Throwable -> Lb5
            int r7 = r5.getMeasuredHeight()     // Catch: java.lang.Throwable -> Lb5
            int r6 = r6 + r7
            int r7 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> Lb5
            int r6 = r6 + r7
            int r5 = r5.getPaddingBottom()     // Catch: java.lang.Throwable -> Lb5
            int r6 = r6 + r5
            int r12 = java.lang.Math.max(r12, r6)     // Catch: java.lang.Throwable -> Lb5
            int r4 = r4 + 1
            goto L67
        L8b:
            r10.setMeasuredDimension(r11, r12)     // Catch: java.lang.Throwable -> Lb5
            r10.mWasMeasured = r3     // Catch: java.lang.Throwable -> Lb5
            com.facebook.react.ReactInstanceManager r3 = r10.mReactInstanceManager     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto L9c
            boolean r3 = r10.mIsAttachedToInstance     // Catch: java.lang.Throwable -> Lb5
            if (r3 != 0) goto L9c
            r10.attachToReactInstanceManager()     // Catch: java.lang.Throwable -> Lb5
            goto Lad
        L9c:
            if (r0 != 0) goto La6
            int r0 = r10.mLastWidth     // Catch: java.lang.Throwable -> Lb5
            if (r0 != r11) goto La6
            int r0 = r10.mLastHeight     // Catch: java.lang.Throwable -> Lb5
            if (r0 == r12) goto Lad
        La6:
            int r0 = r10.mWidthMeasureSpec     // Catch: java.lang.Throwable -> Lb5
            int r3 = r10.mHeightMeasureSpec     // Catch: java.lang.Throwable -> Lb5
            r10.updateRootLayoutSpecs(r0, r3)     // Catch: java.lang.Throwable -> Lb5
        Lad:
            r10.mLastWidth = r11     // Catch: java.lang.Throwable -> Lb5
            r10.mLastHeight = r12     // Catch: java.lang.Throwable -> Lb5
            com.facebook.systrace.a.a(r1)
            return
        Lb5:
            r11 = move-exception
            com.facebook.systrace.a.a(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactRootView.onMeasure(int, int):void");
    }

    @Override // com.facebook.react.uimanager.aj
    public void onChildStartedNativeGesture(MotionEvent motionEvent) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            com.facebook.common.logging.a.c(TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.mJSTouchDispatcher == null) {
            com.facebook.common.logging.a.c(TAG, "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.mJSTouchDispatcher.a(motionEvent, ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        dispatchJSTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        dispatchJSTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            handleException(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            com.facebook.common.logging.a.c(TAG, "Unable to handle key event as the catalyst instance has not been attached");
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.mAndroidHWInputDeviceHelper;
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if ((action == 1 || action == 0) && d.a.containsKey(Integer.valueOf(keyCode))) {
            dVar.a(d.a.get(Integer.valueOf(keyCode)), dVar.b, action);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            com.facebook.common.logging.a.c(TAG, "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z, i, rect);
            return;
        }
        d dVar = this.mAndroidHWInputDeviceHelper;
        if (dVar.b != -1) {
            dVar.a("blur", dVar.b, -1);
        }
        dVar.b = -1;
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            com.facebook.common.logging.a.c(TAG, "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
            return;
        }
        d dVar = this.mAndroidHWInputDeviceHelper;
        if (dVar.b != view2.getId()) {
            if (dVar.b != -1) {
                dVar.a("blur", dVar.b, -1);
            }
            dVar.b = view2.getId();
            dVar.a("focus", view2.getId(), -1);
        }
        super.requestChildFocus(view, view2);
    }

    private void dispatchJSTouchEvent(MotionEvent motionEvent) {
        if (this.mReactInstanceManager == null || !this.mIsAttachedToInstance || this.mReactInstanceManager.getCurrentReactContext() == null) {
            com.facebook.common.logging.a.c(TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.mJSTouchDispatcher == null) {
            com.facebook.common.logging.a.c(TAG, "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.mJSTouchDispatcher.b(motionEvent, ((UIManagerModule) this.mReactInstanceManager.getCurrentReactContext().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mUseSurface) {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mIsAttachedToInstance) {
            removeOnGlobalLayoutListener();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mIsAttachedToInstance) {
            removeOnGlobalLayoutListener();
        }
    }

    private void removeOnGlobalLayoutListener() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.mShouldLogContentAppeared) {
            this.mShouldLogContentAppeared = false;
            if (this.mJSModuleName != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, this.mJSModuleName, this.mRootViewTag);
            }
        }
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str) {
        startReactApplication(reactInstanceManager, str, null);
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str, @Nullable Bundle bundle) {
        startReactApplication(reactInstanceManager, str, bundle, null);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str, @Nullable Bundle bundle, @Nullable String str2) {
        com.facebook.systrace.a.a(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            com.facebook.infer.annotation.a.a(this.mReactInstanceManager == null, "This root view has already been attached to a catalyst instance manager");
            this.mReactInstanceManager = reactInstanceManager;
            this.mJSModuleName = str;
            this.mAppProperties = bundle;
            this.mInitialUITemplate = str2;
            attachToReactInstanceManager();
        } finally {
            com.facebook.systrace.a.a(0L);
        }
    }

    @Override // com.facebook.react.uimanager.ad
    public int getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ad
    public int getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ad
    public void setShouldLogContentAppeared(boolean z) {
        this.mShouldLogContentAppeared = z;
    }

    @Override // com.facebook.react.uimanager.ad
    @Nullable
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    private void updateRootLayoutSpecs(int i, int i2) {
        UIManager a2;
        if (this.mReactInstanceManager == null) {
            com.facebook.common.logging.a.c(TAG, "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext currentReactContext = this.mReactInstanceManager.getCurrentReactContext();
        if (currentReactContext == null || (a2 = au.a(currentReactContext, getUIManagerType(), true)) == null) {
            return;
        }
        a2.updateRootLayoutSpecs(getRootViewTag(), i, i2);
    }

    @ThreadConfined(ThreadConfined.UI)
    public void unmountReactApplication() {
        UiThreadUtil.assertOnUiThread();
        if (this.mReactInstanceManager != null && this.mIsAttachedToInstance) {
            this.mReactInstanceManager.detachRootView(this);
            this.mIsAttachedToInstance = false;
        }
        this.mReactInstanceManager = null;
        this.mShouldLogContentAppeared = false;
    }

    @Override // com.facebook.react.uimanager.ad
    public void onStage(int i) {
        if (i != 101) {
            return;
        }
        onAttachedToReactInstance();
    }

    public void onAttachedToReactInstance() {
        this.mJSTouchDispatcher = new com.facebook.react.uimanager.j(this);
        if (this.mRootViewEventListener != null) {
            this.mRootViewEventListener.a(this);
        }
    }

    public void setEventListener(b bVar) {
        this.mRootViewEventListener = bVar;
    }

    public String getJSModuleName() {
        return (String) com.facebook.infer.annotation.a.a(this.mJSModuleName);
    }

    @Nullable
    public Bundle getAppProperties() {
        return this.mAppProperties;
    }

    @Override // com.facebook.react.uimanager.ad
    @Nullable
    public String getInitialUITemplate() {
        return this.mInitialUITemplate;
    }

    @ThreadConfined(ThreadConfined.UI)
    public void setAppProperties(@Nullable Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.mAppProperties = bundle;
        if (getRootViewTag() != 0) {
            runApplication();
        }
    }

    public void runApplication() {
        com.facebook.systrace.a.a(0L, "ReactRootView.runApplication");
        try {
            if (this.mReactInstanceManager != null && this.mIsAttachedToInstance) {
                ReactContext currentReactContext = this.mReactInstanceManager.getCurrentReactContext();
                if (currentReactContext == null) {
                    return;
                }
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (!this.mUseSurface) {
                    if (this.mWasMeasured) {
                        updateRootLayoutSpecs(this.mWidthMeasureSpec, this.mHeightMeasureSpec);
                    }
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("rootTag", getRootViewTag());
                    Bundle appProperties = getAppProperties();
                    if (appProperties != null) {
                        writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                    }
                    this.mShouldLogContentAppeared = true;
                    com.facebook.common.logging.a.d(TAG, "runApplication: call AppRegistry.runApplication");
                    ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
                }
            }
        } finally {
            com.facebook.systrace.a.a(0L);
        }
    }

    @VisibleForTesting
    void simulateAttachForTesting() {
        this.mIsAttachedToInstance = true;
        this.mJSTouchDispatcher = new com.facebook.react.uimanager.j(this);
    }

    private a getCustomGlobalLayoutListener() {
        if (this.mCustomGlobalLayoutListener == null) {
            this.mCustomGlobalLayoutListener = new a();
        }
        return this.mCustomGlobalLayoutListener;
    }

    private void attachToReactInstanceManager() {
        com.facebook.systrace.a.a(0L, "attachToReactInstanceManager");
        if (this.mIsAttachedToInstance) {
            return;
        }
        try {
            this.mIsAttachedToInstance = true;
            ((ReactInstanceManager) com.facebook.infer.annotation.a.a(this.mReactInstanceManager)).attachRootView(this);
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            com.facebook.systrace.a.a(0L);
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        com.facebook.infer.annotation.a.a(!this.mIsAttachedToInstance, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    @Override // com.facebook.react.uimanager.ad
    public int getRootViewTag() {
        return this.mRootViewTag;
    }

    @Override // com.facebook.react.uimanager.ad
    public void setRootViewTag(int i) {
        this.mRootViewTag = i;
    }

    @Override // com.facebook.react.uimanager.aj
    public void handleException(Throwable th) {
        if (this.mReactInstanceManager == null || this.mReactInstanceManager.getCurrentReactContext() == null) {
            throw new RuntimeException(th);
        }
        this.mReactInstanceManager.getCurrentReactContext().handleException(new com.facebook.react.uimanager.i(th.getMessage(), this, th));
    }

    public void setIsFabric(boolean z) {
        this.mUIManagerType = z ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.ad
    public int getUIManagerType() {
        return this.mUIManagerType;
    }

    @Nullable
    public ReactInstanceManager getReactInstanceManager() {
        return this.mReactInstanceManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendEvent(String str, @Nullable WritableMap writableMap) {
        if (this.mReactInstanceManager != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactInstanceManager.getCurrentReactContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        private final Rect b;
        private final int c;
        private int d = 0;
        private int e = 0;

        a() {
            com.facebook.react.uimanager.d.a(ReactRootView.this.getContext().getApplicationContext());
            this.b = new Rect();
            this.c = (int) w.a(60.0f);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            String str;
            double d;
            double d2;
            if (ReactRootView.this.mReactInstanceManager == null || !ReactRootView.this.mIsAttachedToInstance || ReactRootView.this.mReactInstanceManager.getCurrentReactContext() == null) {
                return;
            }
            ReactRootView.this.getRootView().getWindowVisibleDisplayFrame(this.b);
            int i = com.facebook.react.uimanager.d.a.heightPixels - this.b.bottom;
            boolean z = false;
            if (this.d != i && i > this.c) {
                this.d = i;
                ReactRootView.this.sendEvent("keyboardDidShow", a(w.c(this.b.bottom), w.c(this.b.left), w.c(this.b.width()), w.c(this.d)));
            } else {
                if (this.d != 0 && i <= this.c) {
                    this.d = 0;
                    ReactRootView.this.sendEvent("keyboardDidHide", a(w.c(ReactRootView.this.mLastHeight), 0.0d, w.c(this.b.width()), 0.0d));
                }
            }
            int rotation = ((WindowManager) ReactRootView.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.e != rotation) {
                this.e = rotation;
                switch (rotation) {
                    case 0:
                        str = "portrait-primary";
                        d = 0.0d;
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("name", str);
                        createMap.putDouble("rotationDegrees", d);
                        createMap.putBoolean("isLandscape", z);
                        ReactRootView.this.sendEvent("namedOrientationDidChange", createMap);
                        break;
                    case 1:
                        str = "landscape-primary";
                        d2 = -90.0d;
                        d = d2;
                        z = true;
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putString("name", str);
                        createMap2.putDouble("rotationDegrees", d);
                        createMap2.putBoolean("isLandscape", z);
                        ReactRootView.this.sendEvent("namedOrientationDidChange", createMap2);
                        break;
                    case 2:
                        str = "portrait-secondary";
                        d = 180.0d;
                        WritableMap createMap22 = Arguments.createMap();
                        createMap22.putString("name", str);
                        createMap22.putDouble("rotationDegrees", d);
                        createMap22.putBoolean("isLandscape", z);
                        ReactRootView.this.sendEvent("namedOrientationDidChange", createMap22);
                        break;
                    case 3:
                        str = "landscape-secondary";
                        d2 = 90.0d;
                        d = d2;
                        z = true;
                        WritableMap createMap222 = Arguments.createMap();
                        createMap222.putString("name", str);
                        createMap222.putDouble("rotationDegrees", d);
                        createMap222.putBoolean("isLandscape", z);
                        ReactRootView.this.sendEvent("namedOrientationDidChange", createMap222);
                        break;
                }
            }
            if (ReactRootView.this.mReactInstanceManager != null) {
                ((DeviceInfoModule) ReactRootView.this.mReactInstanceManager.getCurrentReactContext().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
            }
        }

        private static WritableMap a(double d, double d2, double d3, double d4) {
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

    public com.facebook.react.log.c getFsTimeLogger() {
        return this.mFsTimeLogger;
    }

    public void setFsTimeLogger(com.facebook.react.log.c cVar) {
        this.mFsTimeLogger = cVar;
    }

    public com.facebook.react.log.a getFmpListener() {
        return this.fmpListener;
    }

    public void setFmpListener(com.facebook.react.log.a aVar) {
        this.fmpListener = aVar;
    }

    public void setJsTouchProcessedListener(com.facebook.react.log.b bVar) {
        this.jsTouchProcessedListener = bVar;
    }

    public com.facebook.react.log.b getJsTouchProcessedListener() {
        return this.jsTouchProcessedListener;
    }
}
