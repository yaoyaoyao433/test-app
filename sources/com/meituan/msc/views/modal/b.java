package com.meituan.msc.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.annotation.VisibleForTesting;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.GuardedRunnable;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.ad;
import com.meituan.msc.uimanager.ai;
import com.meituan.msc.uimanager.h;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends ViewGroup implements LifecycleEventListener {
    public static ChangeQuickRedirect a;
    a b;
    @Nullable
    private Dialog c;
    private boolean d;
    private boolean e;
    private String f;
    private boolean g;
    private boolean h;
    @Nullable
    private DialogInterface.OnShowListener i;
    @Nullable
    private InterfaceC0491b j;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.views.modal.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0491b {
        void a(DialogInterface dialogInterface);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746f9b14be1dbd788f3c5eaa416f8819", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746f9b14be1dbd788f3c5eaa416f8819");
            return;
        }
        ((ReactContext) context).addLifecycleEventListener(this);
        this.b = new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        Object[] objArr = {viewStructure};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a7cb5511b6767306347776aca77d9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a7cb5511b6767306347776aca77d9d");
        } else {
            this.b.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1290b6f65e72bb82dfe0a98b73240cb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1290b6f65e72bb82dfe0a98b73240cb5");
            return;
        }
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75611ca7b3563e8a5ed572b8222365d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75611ca7b3563e8a5ed572b8222365d0");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.b.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final int getChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e31abb37e54cf8bc664ed856906366a1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e31abb37e54cf8bc664ed856906366a1")).intValue() : this.b.getChildCount();
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41b097a19d385ce8158ea9e39d31544a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41b097a19d385ce8158ea9e39d31544a") : this.b.getChildAt(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d308518361b5c2f9f07ab65e4b34b1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d308518361b5c2f9f07ab65e4b34b1a");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.b.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f564bda0dcbdb3a3b15e4a9e1e806e9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f564bda0dcbdb3a3b15e4a9e1e806e9d");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.b.removeView(getChildAt(i));
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d0f8d9f07aa96e7530dd5b29404ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d0f8d9f07aa96e7530dd5b29404ef0");
            return;
        }
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        c();
    }

    private void c() {
        Activity activity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf1bd48b07d4e04c8710fea6ca67db9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf1bd48b07d4e04c8710fea6ca67db9c");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (this.c != null) {
            if (this.c.isShowing() && ((activity = (Activity) com.meituan.msc.views.common.a.a(this.c.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.c.dismiss();
            }
            this.c = null;
            ((ViewGroup) this.b.getParent()).removeViewAt(0);
        }
    }

    public final void setOnRequestCloseListener(InterfaceC0491b interfaceC0491b) {
        this.j = interfaceC0491b;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.i = onShowListener;
    }

    public final void setTransparent(boolean z) {
        this.d = z;
    }

    public final void setStatusBarTranslucent(boolean z) {
        this.e = z;
        this.h = true;
    }

    public final void setAnimationType(String str) {
        this.f = str;
        this.h = true;
    }

    public final void setHardwareAccelerated(boolean z) {
        this.g = z;
        this.h = true;
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e163e86b6334ecf980e446ebb02e5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e163e86b6334ecf980e446ebb02e5c");
        } else {
            b();
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9672ce4d1287b163234f6fc2eef1fbd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9672ce4d1287b163234f6fc2eef1fbd8");
        } else {
            a();
        }
    }

    @VisibleForTesting
    @Nullable
    public final Dialog getDialog() {
        return this.c;
    }

    @Nullable
    private Activity getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "497ba51ea78b24b4f472271a17021d2c", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "497ba51ea78b24b4f472271a17021d2c") : ((ReactContext) getContext()).getCurrentActivity();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a97d459d31ed73f97440148320e8e4dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a97d459d31ed73f97440148320e8e4dd");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        if (this.c != null) {
            if (this.h) {
                c();
            } else {
                d();
                return;
            }
        }
        this.h = false;
        int i = 2131558727;
        if (MarketingModel.DIALOG_SHOW_TYPE_FADE.equals(this.f)) {
            i = 2131558728;
        } else if (Constants.EventType.SLIDE.equals(this.f)) {
            i = 2131558729;
        }
        Activity currentActivity = getCurrentActivity();
        Context context = currentActivity == null ? getContext() : currentActivity;
        this.c = new Dialog(context, i);
        this.c.getWindow().setFlags(8, 8);
        this.c.setContentView(getContentView());
        d();
        this.c.setOnShowListener(this.i);
        this.c.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.meituan.msc.views.modal.b.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i2), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86a53770cb55fa82c352969232697ca2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86a53770cb55fa82c352969232697ca2")).booleanValue();
                }
                if (keyEvent.getAction() == 1) {
                    if (i2 == 4) {
                        com.facebook.infer.annotation.a.a(b.this.j, "setOnRequestCloseListener must be called by the manager");
                        b.this.j.a(dialogInterface);
                        return true;
                    }
                    Activity currentActivity2 = ((ReactContext) b.this.getContext()).getCurrentActivity();
                    if (currentActivity2 != null) {
                        return currentActivity2.onKeyUp(i2, keyEvent);
                    }
                }
                return false;
            }
        });
        this.c.getWindow().setSoftInputMode(16);
        if (this.g) {
            this.c.getWindow().addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        this.c.show();
        if (context instanceof Activity) {
            this.c.getWindow().getDecorView().setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
        }
        this.c.getWindow().clearFlags(8);
    }

    private View getContentView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06bed6b898adca240cb281ed1db84f0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06bed6b898adca240cb281ed1db84f0a");
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.b);
        if (this.e) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626ee3373787388bae8dfcc7ebfa5f1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626ee3373787388bae8dfcc7ebfa5f1b");
            return;
        }
        com.facebook.infer.annotation.a.a(this.c, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                this.c.getWindow().addFlags(1024);
            } else {
                this.c.getWindow().clearFlags(1024);
            }
        }
        if (this.d) {
            this.c.getWindow().clearFlags(2);
            return;
        }
        this.c.getWindow().setDimAmount(0.5f);
        this.c.getWindow().setFlags(2, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.msc.views.view.b implements ad {
        public static ChangeQuickRedirect a;
        private boolean h;
        private int i;
        private int j;
        @Nullable
        private ai k;
        private final h l;

        @Override // android.view.ViewGroup, android.view.ViewParent
        public final void requestDisallowInterceptTouchEvent(boolean z) {
        }

        public a(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "660391902c03a2b1563ceaf4b2533696", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "660391902c03a2b1563ceaf4b2533696");
                return;
            }
            this.h = false;
            this.l = new h(this);
        }

        @Override // com.meituan.msc.views.view.b, android.view.View
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810af3612e109dea9b9702be0f1a20d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810af3612e109dea9b9702be0f1a20d6");
                return;
            }
            super.onSizeChanged(i, i2, i3, i4);
            this.i = i;
            this.j = i2;
            d();
        }

        private void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ce86edb0af9e5dfad7b2adcbbaf5db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ce86edb0af9e5dfad7b2adcbbaf5db");
            } else if (getChildCount() > 0) {
                this.h = false;
                final int id = getChildAt(0).getId();
                if (this.k != null) {
                    a(this.k, this.i, this.j);
                    return;
                }
                ReactContext e = e();
                e.runOnNativeModulesQueueThread(new GuardedRunnable(e) { // from class: com.meituan.msc.views.modal.b.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.jse.bridge.GuardedRunnable
                    public final void runGuarded() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "146a2b49219a1d3894a02a5ad1718dc1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "146a2b49219a1d3894a02a5ad1718dc1");
                        } else {
                            a.this.e().getUIManagerModule().b(id, a.this.i, a.this.j);
                        }
                    }
                });
            } else {
                this.h = true;
            }
        }

        @UiThread
        public final void a(ai aiVar, int i, int i2) {
            Object[] objArr = {aiVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4c51494e4a88c3c6640e1744adc85e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4c51494e4a88c3c6640e1744adc85e7");
                return;
            }
            this.k = aiVar;
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("screenWidth", s.c(i));
            createMap.putDouble("screenHeight", s.c(i2));
        }

        @Override // com.meituan.msc.views.view.b, android.view.ViewGroup
        public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            Object[] objArr = {view, Integer.valueOf(i), layoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dddd18def9019e1b8b2326accdbc8bb5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dddd18def9019e1b8b2326accdbc8bb5");
                return;
            }
            super.addView(view, i, layoutParams);
            if (this.h) {
                d();
            }
        }

        @Override // com.meituan.msc.uimanager.ad
        public final void handleException(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a75fc178ffec46d4954e55b68915c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a75fc178ffec46d4954e55b68915c6");
            } else {
                e().handleException(new RuntimeException(th));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ReactContext e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950ca2688f58b33b55fe29eb25be6efc", RobustBitConfig.DEFAULT_VALUE) ? (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950ca2688f58b33b55fe29eb25be6efc") : (ReactContext) getContext();
        }

        @Override // com.meituan.msc.views.view.b, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7534ca584a6b0fb86783f93159cc0acb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7534ca584a6b0fb86783f93159cc0acb")).booleanValue();
            }
            this.l.a(motionEvent, f());
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // com.meituan.msc.views.view.b, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5612b78a9d9accb02e2d84d9feaffd0d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5612b78a9d9accb02e2d84d9feaffd0d")).booleanValue();
            }
            this.l.a(motionEvent, f());
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // com.meituan.msc.uimanager.ad
        public final void onChildStartedNativeGesture(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "565b92726d641180e9001b00874d2488", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "565b92726d641180e9001b00874d2488");
            } else {
                this.l.b(motionEvent, f());
            }
        }

        private com.meituan.msc.uimanager.events.b f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "348b31c68285cc170d5a6da9cd4f2e6f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.uimanager.events.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "348b31c68285cc170d5a6da9cd4f2e6f") : e().getUIManagerModule().a();
        }
    }
}
