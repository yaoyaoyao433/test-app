package com.sankuai.waimai.imbase.window;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.alipay.sdk.app.PayTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect d;
    @NonNull
    private final WindowManager a;
    @NonNull
    private final WindowManager.LayoutParams b;
    @NonNull
    private final Handler c;
    @NonNull
    protected final Activity e;
    @NonNull
    protected final View f;
    public b g;
    @NonNull
    private final Runnable h;
    private c i;
    private int j;
    private C0968a k;
    private int l;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(a aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
    }

    @LayoutRes
    public abstract int a();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d34948ad9b6e31a0f470a9be5f5f0d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d34948ad9b6e31a0f470a9be5f5f0d0");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ff743cc4f802a03a14e20bca243a2620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ff743cc4f802a03a14e20bca243a2620");
            return;
        }
        if (i > 0) {
            i = 0;
        }
        if (aVar.b.y != i) {
            aVar.b.y = i;
            try {
                aVar.a.updateViewLayout(aVar.f, aVar.b);
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void b(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "fc0d8ce786af59cb143ee27c50a67819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "fc0d8ce786af59cb143ee27c50a67819");
            return;
        }
        aVar.f();
        aVar.c.postDelayed(aVar.h, aVar.j > 0 ? aVar.j : PayTask.j);
    }

    @SuppressLint({"InflateParams"})
    public a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be33098ab93daa194093e2c6be651607", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be33098ab93daa194093e2c6be651607");
            return;
        }
        this.c = new Handler(Looper.getMainLooper());
        this.h = new Runnable() { // from class: com.sankuai.waimai.imbase.window.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf35ad72cfa56f27efec4bac0501a0b7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf35ad72cfa56f27efec4bac0501a0b7");
                } else {
                    a.this.d();
                }
            }
        };
        this.l = 0;
        this.e = activity;
        this.a = (WindowManager) this.e.getSystemService("window");
        this.f = LayoutInflater.from(this.e).inflate(a(), (ViewGroup) null);
        this.f.setOnTouchListener(new d());
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.imbase.utils.b.a;
        this.f.measure(View.MeasureSpec.makeMeasureSpec(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e1e5db11ad6720c05c5c98fdb46207a5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e1e5db11ad6720c05c5c98fdb46207a5")).intValue() : activity.getResources().getDisplayMetrics().widthPixels, 1073741824), 0);
        this.b = new WindowManager.LayoutParams();
        this.b.width = -1;
        this.b.height = -2;
        WindowManager.LayoutParams layoutParams = this.b;
        Object[] objArr3 = {layoutParams, 1000};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.imbase.utils.d.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "76aed69a00d4237d5419be9aba2174b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "76aed69a00d4237d5419be9aba2174b5");
        } else {
            int i = Build.VERSION.SDK_INT;
            if (layoutParams != null) {
                layoutParams.type = 1000;
            }
        }
        this.b.flags = 520;
        this.b.format = -3;
        this.b.token = activity.getWindow().getDecorView().getWindowToken();
        this.b.gravity = 49;
        this.b.x = 0;
        this.b.y = 0;
        Context applicationContext = activity.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c0c64e4a56b895c27253e59c4f089fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c0c64e4a56b895c27253e59c4f089fa");
        } else if (activity == this.e) {
            Context applicationContext = this.e.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            }
            e();
        }
    }

    public final a a(int i) {
        this.j = 4000;
        return this;
    }

    public final boolean b() {
        return this.l == 2 || this.l == 1 || this.l == 5;
    }

    public final a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac0e7032bb87306fbf53b7c53141cb7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac0e7032bb87306fbf53b7c53141cb7a");
        }
        a("show, state = %d", Integer.valueOf(this.l));
        if (this.e.isFinishing() || this.e.isDestroyed()) {
            return this;
        }
        int i = this.l;
        if (i != 5) {
            switch (i) {
                case 0:
                    try {
                        if (this.b.token != null) {
                            this.a.addView(this.f, this.b);
                            break;
                        }
                    } catch (Exception unused) {
                        break;
                    }
                    break;
                case 1:
                case 2:
                    return this;
                case 3:
                    g();
                    break;
            }
        }
        this.l = 2;
        this.k = new C0968a(this.b.y, this.f.getMeasuredHeight());
        this.k.start();
        return this;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01948e3efb79f0ec4db5bd9ba356e07e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01948e3efb79f0ec4db5bd9ba356e07e");
            return;
        }
        a("dismiss, state = %d", Integer.valueOf(this.l));
        int i = this.l;
        if (i != 0) {
            switch (i) {
                case 3:
                    return;
                case 2:
                    g();
                    break;
            }
            this.l = 3;
            f();
            this.k = new C0968a(this.b.y, -this.f.getMeasuredHeight());
            this.k.start();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58244a4908666afdfb54ba0b8fa5b313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58244a4908666afdfb54ba0b8fa5b313");
            return;
        }
        a("dismissImmidiately, state = %d", Integer.valueOf(this.l));
        int i = this.l;
        if (i != 0) {
            switch (i) {
                case 2:
                case 3:
                    g();
                    break;
            }
            this.l = 0;
            try {
                if (this.f.getWindowToken() != null) {
                    this.a.removeViewImmediate(this.f);
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fc1d9d105e76157a04d727afe8e7d0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fc1d9d105e76157a04d727afe8e7d0d");
        } else {
            this.c.removeCallbacks(this.h);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2beb30fed27ea3e9efb6fab5f6107451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2beb30fed27ea3e9efb6fab5f6107451");
        } else if (this.k != null) {
            this.k.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "a8d1ff3c0bd2b9d78ea4fb6010b79b11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "a8d1ff3c0bd2b9d78ea4fb6010b79b11");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b(getClass().getSimpleName(), String.format(str, objArr), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.imbase.window.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0968a extends ValueAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        public C0968a(int i, int i2) {
            Object[] objArr = {a.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb049d792ef8b107cc0f178920cdb74", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb049d792ef8b107cc0f178920cdb74");
                return;
            }
            setIntValues(i, i2);
            setDuration(300L);
            addListener(this);
            addUpdateListener(this);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "993bada02d1e88db7c108209848baeb2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "993bada02d1e88db7c108209848baeb2");
                return;
            }
            a.this.a("onAnimationUpdate", new Object[0]);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null || !(animatedValue instanceof Integer)) {
                return;
            }
            a.a(a.this, ((Integer) animatedValue).intValue());
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea9a43489ec42cea830ba60992d01889", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea9a43489ec42cea830ba60992d01889");
                return;
            }
            a.this.a("onAnimationEnd", new Object[0]);
            switch (a.this.l) {
                case 2:
                    a.this.l = 1;
                    a.b(a.this);
                    return;
                case 3:
                    a.this.l = 0;
                    try {
                        if (a.this.f.getWindowToken() != null) {
                            a.this.a.removeView(a.this.f);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener, View.OnTouchListener {
        public static ChangeQuickRedirect a;
        @NonNull
        private VelocityTracker c;
        private final int d;
        private final int e;
        private final int f;
        private int g;
        private int h;
        private int i;

        public d() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83379f66638a7e556896f67886905e3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83379f66638a7e556896f67886905e3");
                return;
            }
            this.c = VelocityTracker.obtain();
            ViewConfiguration viewConfiguration = ViewConfiguration.get(a.this.e);
            this.d = viewConfiguration.getScaledTouchSlop();
            this.f = viewConfiguration.getScaledMinimumFlingVelocity();
            this.e = (int) (a.this.e.getResources().getDisplayMetrics().density * 10.0f);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            float f;
            Object[] objArr = {view, motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d41d11cd22adcd5371732984b941e527", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d41d11cd22adcd5371732984b941e527")).booleanValue();
            }
            if (a.this.l == 1 || a.this.l == 5) {
                switch (motionEvent.getAction()) {
                    case 0:
                        a.this.a("Action Down", new Object[0]);
                        a(motionEvent);
                        break;
                    case 1:
                        int rawX = this.h - ((int) motionEvent.getRawX());
                        int rawY = this.i - ((int) motionEvent.getRawY());
                        if (Math.abs(rawX) < this.d && Math.abs(rawY) < this.d) {
                            a.this.a("ActionUp click, distanceX,Y = %d, %d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                            a.this.c();
                            onClick(view);
                        } else if ((-a.d(a.this)) > a.this.f.getMeasuredHeight() / 2) {
                            a.this.a("ActionUp move, distanceX,Y = %d, %d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                            a();
                            a.this.d();
                        } else {
                            if (rawY > this.e) {
                                Object[] objArr2 = {motionEvent};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b27737d7b347b1d81b491127373e331", RobustBitConfig.DEFAULT_VALUE)) {
                                    f = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b27737d7b347b1d81b491127373e331")).floatValue();
                                } else {
                                    this.c.addMovement(motionEvent);
                                    this.c.computeCurrentVelocity(1000);
                                    f = -this.c.getYVelocity(0);
                                    a.this.a("computeVy = %5.1f", Float.valueOf(f));
                                }
                                if (f > this.f) {
                                    a.this.a("ActionUp fling, distanceX,Y = %d, %d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                                    a();
                                    a.this.d();
                                }
                            }
                            a.this.a("ActionUp cancel, distanceX,Y = %d, %d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                            a.this.c();
                        }
                        this.c.clear();
                        break;
                    case 2:
                        if (a.this.l != 5) {
                            a.this.a("Action Move, call onActionDown", new Object[0]);
                            motionEvent.setAction(0);
                            a(motionEvent);
                            break;
                        } else {
                            int rawY2 = (int) motionEvent.getRawY();
                            int d = a.d(a.this) + (rawY2 - this.g);
                            a.this.a("Action Move, top = %d", Integer.valueOf(d));
                            a.a(a.this, d);
                            this.g = rawY2;
                            this.c.addMovement(motionEvent);
                            break;
                        }
                    case 3:
                        this.c.clear();
                        a.this.c();
                        break;
                }
                return false;
            }
            return false;
        }

        private void a(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83119823e14407b7741cd0a7a5c29fa7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83119823e14407b7741cd0a7a5c29fa7");
                return;
            }
            a.this.l = 5;
            a.this.f();
            this.h = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            this.g = rawY;
            this.i = rawY;
            this.c.addMovement(motionEvent);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd5f0a8e02c313f1a8852b41a6d8222", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd5f0a8e02c313f1a8852b41a6d8222");
            } else if (a.this.g != null) {
                a.this.g.a(a.this);
            }
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd26e75d45d405149584797c0a9077b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd26e75d45d405149584797c0a9077b2");
            } else if (a.this.i != null) {
                c unused = a.this.i;
            }
        }
    }

    public static /* synthetic */ int d(a aVar) {
        return aVar.b.y;
    }
}
