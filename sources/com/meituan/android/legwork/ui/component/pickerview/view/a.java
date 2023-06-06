package com.meituan.android.legwork.ui.component.pickerview.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.support.constraint.R;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    public static ChangeQuickRedirect f;
    private final FrameLayout.LayoutParams a;
    private Activity b;
    private ViewGroup c;
    private int d;
    private boolean e;
    protected ViewGroup g;
    public ViewGroup h;
    public ViewGroup i;
    protected int j;
    protected int k;
    protected int l;
    protected com.meituan.android.legwork.ui.component.pickerview.listener.b m;
    boolean n;
    public boolean o;
    public Dialog p;
    protected boolean q;
    protected View r;
    protected final View.OnTouchListener s;
    private View.OnKeyListener t;

    public boolean b() {
        return false;
    }

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b6b8e7e2354e1e2086ec86d6f3501a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b6b8e7e2354e1e2086ec86d6f3501a9");
            return;
        }
        this.a = new FrameLayout.LayoutParams(-1, -2, 80);
        this.j = -16417281;
        this.k = -4007179;
        this.l = -16777216;
        this.d = 80;
        this.e = false;
        this.t = new View.OnKeyListener() { // from class: com.meituan.android.legwork.ui.component.pickerview.view.a.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {view, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d846e61e84c5a2fb54083f0c4d9bb4b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d846e61e84c5a2fb54083f0c4d9bb4b")).booleanValue();
                }
                if (i == 4 && keyEvent.getAction() == 0 && a.this.c()) {
                    a.this.d();
                    return true;
                }
                return false;
            }
        };
        this.s = new View.OnTouchListener() { // from class: com.meituan.android.legwork.ui.component.pickerview.view.a.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "394a179f5b0a572102b8df7531c4037c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "394a179f5b0a572102b8df7531c4037c")).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    a.this.d();
                }
                return false;
            }
        };
        this.b = activity;
    }

    public final void a(int i) {
        ViewGroup viewGroup;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79f6942e73506e501e147cfbe766eed6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79f6942e73506e501e147cfbe766eed6");
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.b);
        if (b()) {
            this.c = (ViewGroup) from.inflate(R.layout.legwork_send_picker_layout_basepickerview, (ViewGroup) null, false);
            this.c.setBackgroundColor(0);
            this.g = (ViewGroup) this.c.findViewById(R.id.legwork_send_picker_content_container);
            this.g.setLayoutParams(this.a);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94a54cd149348433ae35f9ad23be2d74", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94a54cd149348433ae35f9ad23be2d74");
            } else if (this.c != null) {
                this.p = new Dialog(this.b, R.style.LegworkBottomDialog);
                this.p.setCancelable(this.q);
                this.p.setContentView(this.c);
                ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
                layoutParams.width = this.b.getResources().getDisplayMetrics().widthPixels;
                this.c.setLayoutParams(layoutParams);
                this.p.getWindow().setGravity(80);
                this.p.getWindow().setWindowAnimations(R.style.legwork_dialogAnim);
                this.p.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.meituan.android.legwork.ui.component.pickerview.view.a.6
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object[] objArr3 = {dialogInterface};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2bb141c837704dee9583b48122843350", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2bb141c837704dee9583b48122843350");
                        } else if (a.this.m != null) {
                            a.this.m.a();
                        }
                    }
                });
            }
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.legwork.ui.component.pickerview.view.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "96f95fcbd3c73687fe610c6502a2fa7c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "96f95fcbd3c73687fe610c6502a2fa7c");
                    } else {
                        a.this.d();
                    }
                }
            });
        } else {
            if (this.h == null) {
                this.h = (ViewGroup) this.b.getWindow().getDecorView().findViewById(16908290);
            }
            this.i = (ViewGroup) from.inflate(R.layout.legwork_send_picker_layout_basepickerview, this.h, false);
            this.i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (i != 0) {
                this.i.setBackgroundColor(i);
            }
            this.g = (ViewGroup) this.i.findViewById(R.id.legwork_send_picker_content_container);
            this.g.setLayoutParams(this.a);
        }
        Object[] objArr3 = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = f;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c3e991b31cca919a2df89dbf643c9153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c3e991b31cca919a2df89dbf643c9153");
            return;
        }
        if (b()) {
            viewGroup = this.c;
        } else {
            viewGroup = this.i;
        }
        viewGroup.setFocusable(true);
        viewGroup.setFocusableInTouchMode(true);
        viewGroup.setOnKeyListener(this.t);
    }

    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f925eaf3243d463e4aea2dd19d82b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f925eaf3243d463e4aea2dd19d82b75");
            return;
        }
        this.g.setVisibility(8);
        this.h.addView(view);
        a(this.b, this.g, true, 300L);
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f08c468b2d075a5d3acd0edbebd9f14", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f08c468b2d075a5d3acd0edbebd9f14")).booleanValue();
        }
        if (b()) {
            return false;
        }
        return this.i.getParent() != null || this.o;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c0133b135327d3c0ac28663784eded9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c0133b135327d3c0ac28663784eded9");
        } else if (b()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8102ab3df47739ed2429040745c010e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8102ab3df47739ed2429040745c010e");
            } else if (this.p == null || !this.p.isShowing()) {
            } else {
                this.p.dismiss();
            }
        } else if (this.n) {
        } else {
            a(this.b, this.g, false, 300L);
            this.g.postDelayed(new Runnable() { // from class: com.meituan.android.legwork.ui.component.pickerview.view.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3d42f219e3c2ffc7537828e3f17fd333", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3d42f219e3c2ffc7537828e3f17fd333");
                        return;
                    }
                    final a aVar = a.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.f;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "d061069baa24e12ff4d9208108d255b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "d061069baa24e12ff4d9208108d255b7");
                    } else {
                        aVar.h.post(new Runnable() { // from class: com.meituan.android.legwork.ui.component.pickerview.view.a.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "13b93e3f861fe877c20965b8b7493718", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "13b93e3f861fe877c20965b8b7493718");
                                    return;
                                }
                                a.this.h.removeView(a.this.i);
                                a.this.o = false;
                                a.this.n = false;
                                if (a.this.m != null) {
                                    a.this.m.a();
                                }
                            }
                        });
                    }
                    a.this.n = true;
                }
            }, 300L);
        }
    }

    public final View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64aa4ee7fb173db9ea2c01bf28a20180", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64aa4ee7fb173db9ea2c01bf28a20180") : this.g.findViewById(i);
    }

    private void a(final View view, final int i, final int i2, final boolean z, long j) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0b62fc800820b00469c34b4fddc1c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0b62fc800820b00469c34b4fddc1c1");
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.android.legwork.ui.component.pickerview.view.a.7
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58bd30f101c5bf31d98215bb8a306df0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58bd30f101c5bf31d98215bb8a306df0");
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                layoutParams.height = intValue;
                view.setLayoutParams(layoutParams);
                if (z) {
                    if (i2 == 0) {
                        a.this.i.getBackground().mutate().setAlpha(128);
                    } else {
                        a.this.i.getBackground().mutate().setAlpha((intValue * 128) / i2);
                    }
                } else if (i == 0) {
                    a.this.i.getBackground().mutate().setAlpha(0);
                } else {
                    a.this.i.getBackground().mutate().setAlpha((intValue * 128) / i);
                }
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.meituan.android.legwork.ui.component.pickerview.view.a.8
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc707992b1d4b6f5c85fbcb3fd4b874d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc707992b1d4b6f5c85fbcb3fd4b874d");
                    return;
                }
                if (z) {
                    view.setVisibility(0);
                }
                super.onAnimationStart(animator);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2096a47deb83f3fbe3abb5cd9edb580", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2096a47deb83f3fbe3abb5cd9edb580");
                    return;
                }
                super.onAnimationEnd(animator);
                if (z) {
                    return;
                }
                view.setVisibility(8);
            }
        });
        ofInt.setDuration(j);
        ofInt.start();
    }

    private void a(Activity activity, View view, boolean z, long j) {
        Object[] objArr = {activity, view, Byte.valueOf(z ? (byte) 1 : (byte) 0), 300L};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dd1e53cf3960714c8a19e6b5cdf9187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dd1e53cf3960714c8a19e6b5cdf9187");
        } else if (z) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            view.measure(point.x, point.y);
            a(view, 0, view.getMeasuredHeight(), z, 300L);
        } else {
            a(view, view.getLayoutParams().height, 0, z, 300L);
        }
    }
}
