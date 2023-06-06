package com.sankuai.waimai.store.widgets.windows;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.constraint.R;
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
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.k;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.aq;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect b;
    @NonNull
    private final WindowManager.LayoutParams a;
    @NonNull
    protected final Activity c;
    @NonNull
    final WindowManager d;
    @NonNull
    protected final View e;
    @NonNull
    final Handler f;
    @NonNull
    final Runnable g;
    public b h;
    public c i;
    public int j;
    int k;
    private C1347a l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(a aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a(a aVar);
    }

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "038ec49aff455e0394f9deb3df30c3bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "038ec49aff455e0394f9deb3df30c3bd");
            return;
        }
        if (i > 0) {
            i = 0;
        }
        if (aVar.a.y != i) {
            aVar.a.y = i;
            try {
                aVar.d.updateViewLayout(aVar.e, aVar.a);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    @SuppressLint({"InflateParams"})
    public a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "318ace9cd27b3f6c2f15938c9af07f9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "318ace9cd27b3f6c2f15938c9af07f9a");
            return;
        }
        this.f = new Handler(Looper.getMainLooper());
        this.g = new Runnable() { // from class: com.sankuai.waimai.store.widgets.windows.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38c752e380fb084bed16cf660b46f8a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38c752e380fb084bed16cf660b46f8a6");
                } else {
                    a.this.b();
                }
            }
        };
        this.k = 0;
        this.c = activity;
        this.d = (WindowManager) this.c.getSystemService("window");
        this.e = LayoutInflater.from(this.c).inflate(R.layout.wm_sc_goods_list_layout_notification_window, (ViewGroup) null);
        if (k.b(this.c) && (Build.VERSION.SDK_INT >= 19)) {
            u.a(this.e, 0, u.a() + h.a(this.c, 6.0f), 0, 0);
        }
        this.e.setOnTouchListener(new d());
        this.a = new WindowManager.LayoutParams();
        this.a.width = -2;
        this.a.height = -2;
        WindowManager.LayoutParams layoutParams = this.a;
        Object[] objArr2 = {layoutParams, 1000};
        ChangeQuickRedirect changeQuickRedirect2 = aq.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4d6ad892c0ed29012ea13d0387fa79b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4d6ad892c0ed29012ea13d0387fa79b7");
        } else {
            int i = Build.VERSION.SDK_INT;
            layoutParams.type = 1000;
        }
        this.a.flags = 520;
        this.a.format = -3;
        this.a.token = activity.getWindow().getDecorView().getWindowToken();
        this.a.gravity = 49;
        this.a.x = 0;
        this.a.y = 0;
    }

    public final a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e11c3fa10ccf9c8aa31df3ee6aa2bb75", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e11c3fa10ccf9c8aa31df3ee6aa2bb75");
        }
        a("show, state = %d", Integer.valueOf(this.k));
        int i = this.k;
        if (i != 5) {
            switch (i) {
                case 0:
                    try {
                        this.d.addView(this.e, this.a);
                        break;
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a("NotificationWindow", e);
                        break;
                    }
                case 1:
                case 2:
                    return this;
                case 3:
                    e();
                    break;
            }
        }
        this.k = 2;
        this.l = new C1347a(this.a.y, this.e.getMeasuredHeight());
        this.l.start();
        return this;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "001e487ca47dbf0ce377b034665c47d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "001e487ca47dbf0ce377b034665c47d8");
            return;
        }
        a("dismiss, state = %d", Integer.valueOf(this.k));
        int i = this.k;
        if (i != 0) {
            switch (i) {
                case 3:
                    return;
                case 2:
                    e();
                    break;
            }
            this.k = 3;
            d();
            this.l = new C1347a(this.a.y, -this.e.getMeasuredHeight());
            this.l.start();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c5298554e66163b3d5101c3c94021d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c5298554e66163b3d5101c3c94021d");
            return;
        }
        a("dismissImmidiately, state = %d", Integer.valueOf(this.k));
        int i = this.k;
        if (i != 0) {
            switch (i) {
                case 2:
                case 3:
                    e();
                    break;
            }
            this.k = 0;
            try {
                if (this.e.getWindowToken() != null) {
                    this.d.removeViewImmediate(this.e);
                }
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a90bc8cf67b05471f76acb40aad954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a90bc8cf67b05471f76acb40aad954");
        } else {
            this.f.removeCallbacks(this.g);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c81d779602a89d263546540a1295d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c81d779602a89d263546540a1295d55");
        } else if (this.l != null) {
            this.l.cancel();
        }
    }

    void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "402c68428eb9ed6b5955517cee4a3e8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "402c68428eb9ed6b5955517cee4a3e8a");
        } else {
            com.sankuai.shangou.stone.util.log.a.a(getClass().getSimpleName(), String.format(str, objArr), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.widgets.windows.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1347a extends ValueAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
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

        public C1347a(int i, int i2) {
            Object[] objArr = {a.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d93c73ccf5ebb1f9054334e5fb9478", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d93c73ccf5ebb1f9054334e5fb9478");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76fb5b0e4a115d11a17a2b599b873dc1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76fb5b0e4a115d11a17a2b599b873dc1");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "567a530adab35d71bd2261b54caf6a0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "567a530adab35d71bd2261b54caf6a0f");
                return;
            }
            a.this.a("onAnimationEnd", new Object[0]);
            switch (a.this.k) {
                case 2:
                    a.this.k = 1;
                    a aVar = a.this;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a.b;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4c3b9ecf94780485685d01e0f630e967", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4c3b9ecf94780485685d01e0f630e967");
                        return;
                    }
                    aVar.d();
                    aVar.f.postDelayed(aVar.g, aVar.j > 0 ? aVar.j : PayTask.j);
                    return;
                case 3:
                    a.this.k = 0;
                    try {
                        if (a.this.e.getWindowToken() != null) {
                            a.this.d.removeView(a.this.e);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class d implements View.OnClickListener, View.OnTouchListener {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472d715fa219b1bf618542d9a155e019", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472d715fa219b1bf618542d9a155e019");
                return;
            }
            this.c = VelocityTracker.obtain();
            ViewConfiguration viewConfiguration = ViewConfiguration.get(a.this.c);
            this.d = viewConfiguration.getScaledTouchSlop();
            this.f = viewConfiguration.getScaledMinimumFlingVelocity();
            this.e = (int) (a.this.c.getResources().getDisplayMetrics().density * 10.0f);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            float f;
            Object[] objArr = {view, motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "649cca12dc8529910dff6ff4d0a9f1bd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "649cca12dc8529910dff6ff4d0a9f1bd")).booleanValue();
            }
            if (a.this.k == 1 || a.this.k == 5) {
                switch (motionEvent.getAction()) {
                    case 0:
                        a.this.a("Action Down", new Object[0]);
                        a(motionEvent);
                        break;
                    case 1:
                        int rawX = this.h - ((int) motionEvent.getRawX());
                        int rawY = this.i - ((int) motionEvent.getRawY());
                        if (Math.abs(rawX) >= this.d || Math.abs(rawY) >= this.d) {
                            if ((-a.a(a.this)) <= a.this.e.getMeasuredHeight() / 2) {
                                if (rawY > this.e) {
                                    Object[] objArr2 = {motionEvent};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7f3db073e0e1c961420ce49d7296a2d", RobustBitConfig.DEFAULT_VALUE)) {
                                        f = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7f3db073e0e1c961420ce49d7296a2d")).floatValue();
                                    } else {
                                        this.c.addMovement(motionEvent);
                                        this.c.computeCurrentVelocity(1000);
                                        f = -this.c.getYVelocity(0);
                                        a.this.a("computeVy = %5.1f", Float.valueOf(f));
                                    }
                                    if (f > this.f) {
                                        a.this.a("ActionUp fling, distanceX,Y = %d, %d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                                        a();
                                        a.this.b();
                                    }
                                }
                                a.this.a("ActionUp cancel, distanceX,Y = %d, %d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                                a.this.a();
                            } else {
                                a.this.a("ActionUp move, distanceX,Y = %d, %d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                                a();
                                a.this.b();
                            }
                        } else {
                            a.this.a("ActionUp click, distanceX,Y = %d, %d", Integer.valueOf(rawX), Integer.valueOf(rawY));
                            a.this.a();
                            onClick(view);
                        }
                        this.c.clear();
                        break;
                    case 2:
                        if (a.this.k == 5) {
                            int rawY2 = (int) motionEvent.getRawY();
                            int a2 = a.a(a.this) + (rawY2 - this.g);
                            a.this.a("Action Move, top = %d", Integer.valueOf(a2));
                            a.a(a.this, a2);
                            this.g = rawY2;
                            this.c.addMovement(motionEvent);
                            break;
                        } else {
                            a.this.a("Action Move, call onActionDown", new Object[0]);
                            motionEvent.setAction(0);
                            a(motionEvent);
                            break;
                        }
                    case 3:
                        this.c.clear();
                        a.this.a();
                        break;
                }
                return false;
            }
            return false;
        }

        private void a(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58e727a4a5b07c90c1ac8772dcb76f0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58e727a4a5b07c90c1ac8772dcb76f0f");
                return;
            }
            a.this.k = 5;
            a.this.d();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1d935eb0b3e5ffbb147d9ae4ad8db8", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1d935eb0b3e5ffbb147d9ae4ad8db8");
            } else if (a.this.h != null) {
                a.this.h.a(a.this);
            }
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5652f61d8770f082930a3b4cc0e09986", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5652f61d8770f082930a3b4cc0e09986");
            } else if (a.this.i != null) {
                a.this.i.a(a.this);
            }
        }
    }

    public static /* synthetic */ int a(a aVar) {
        return aVar.a.y;
    }
}
