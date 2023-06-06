package com.meituan.msc.modules.page.widget;

import android.content.Context;
import android.os.Handler;
import android.support.constraint.R;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.msc.common.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e extends LinearLayout {
    private static final int a = n.b(65);
    private static final int b = n.b(21);
    private static final int c = n.b(18);
    private static final int d = n.b(3);
    public static ChangeQuickRedirect e;
    public boolean f;
    protected ImageView g;
    c h;
    protected int i;
    private boolean j;
    private a k;
    private boolean l;
    private float m;
    private float n;
    private float o;
    private b p;
    private int q;
    private int r;
    private Handler s;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
        boolean a(MotionEvent motionEvent);
    }

    public boolean a() {
        return true;
    }

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8304b79f8c8367be276015abc8c7d31a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8304b79f8c8367be276015abc8c7d31a");
            return;
        }
        this.j = false;
        this.f = false;
        this.l = true;
        this.q = R.drawable.msc_page_refresh_loading_1;
        this.r = R.drawable.msc_page_refresh_loading_0;
        this.s = new Handler();
        this.i = 0;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e756d90bcaea6a488736844398d929e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e756d90bcaea6a488736844398d929e8");
            return;
        }
        setOrientation(1);
        setGravity(1);
        this.g = new ImageView(getContext());
        this.g.setImageDrawable(getResources().getDrawable(this.r));
        int i = a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, ((i - d) - c) - b);
        layoutParams.topMargin = b;
        layoutParams.bottomMargin = d + c;
        addView(this.g, layoutParams);
        setPadding(0, -a, 0, 0);
    }

    public void setContentView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb64e0e9634f9b252a882da1ca09da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb64e0e9634f9b252a882da1ca09da2");
        } else {
            addView(view, new LinearLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0f0f457843807331f58bd2203141a9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0f0f457843807331f58bd2203141a9d")).booleanValue();
        }
        if (this.l && !this.h.a(motionEvent)) {
            switch (motionEvent.getAction()) {
                case 0:
                    float y = motionEvent.getY();
                    this.o = y;
                    this.n = y;
                    this.m = motionEvent.getX();
                case 1:
                case 3:
                    this.j = false;
                    break;
                case 2:
                    float y2 = motionEvent.getY();
                    float f = y2 - this.n;
                    float abs = Math.abs(f);
                    float abs2 = Math.abs(motionEvent.getX() - this.m);
                    if (abs > d && f >= 1.0f && !a() && abs > abs2) {
                        if (!this.j) {
                            this.o = y2;
                        }
                        this.n = y2;
                        this.j = true;
                        break;
                    }
                    break;
            }
            return this.j || this.f;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17746ee132f00d0ece40e00912b48da6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17746ee132f00d0ece40e00912b48da6")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                float y = motionEvent.getY();
                this.o = y;
                this.n = y;
                return true;
            case 1:
            case 3:
                this.j = false;
                float scrollY = getScrollY();
                if (a + scrollY < 0.0f) {
                    a(Math.round(-a));
                    if (!this.f) {
                        b();
                    }
                    this.f = true;
                } else if (scrollY < 0.0f) {
                    a(0);
                    if (this.f) {
                        c();
                    }
                    this.f = false;
                } else {
                    if (this.f) {
                        c();
                    }
                    this.f = false;
                }
                return true;
            case 2:
                if (this.j || this.f) {
                    this.n = motionEvent.getY();
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = e;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c3446bb7e7eabaa1787946df50a54a4", RobustBitConfig.DEFAULT_VALUE)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c3446bb7e7eabaa1787946df50a54a4")).booleanValue();
                    } else {
                        getScrollY();
                        int round = Math.round((this.o - this.n) / 2.0f);
                        if (this.f) {
                            round -= a;
                        }
                        if (round <= 0) {
                            scrollTo(0, round);
                        } else {
                            scrollTo(0, 0);
                        }
                    }
                    return true;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b3a92c3657590eea9f2978a3b2c012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b3a92c3657590eea9f2978a3b2c012");
            return;
        }
        if (this.p != null) {
            this.p.a();
        }
        if (getScrollY() != i) {
            this.p = new b(getScrollY(), i);
            post(this.p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public final class b implements Runnable {
        public static ChangeQuickRedirect a;
        private final Interpolator c;
        private final int d;
        private final int e;
        private boolean f;
        private long g;
        private int h;

        public b(int i, int i2) {
            Object[] objArr = {e.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a81a8bee8ceb7a6bb08d4f58a6d9e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a81a8bee8ceb7a6bb08d4f58a6d9e8");
                return;
            }
            this.f = true;
            this.g = -1L;
            this.h = -1;
            this.e = i;
            this.d = i2;
            this.c = new OvershootInterpolator(2.0f);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55752030e943dc865a25ceafe86d6d78", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55752030e943dc865a25ceafe86d6d78");
                return;
            }
            if (this.g == -1) {
                this.g = System.currentTimeMillis();
            } else {
                this.h = this.e - Math.round((this.e - this.d) * this.c.getInterpolation(((float) Math.max(Math.min(((System.currentTimeMillis() - this.g) * 1000) / 300, 1000L), 0L)) / 1000.0f));
                e.this.scrollTo(0, this.h);
            }
            if (!this.f || this.d == this.h) {
                return;
            }
            e.this.postDelayed(this, 10L);
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a68fd58f8138d97706d18b34563031f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a68fd58f8138d97706d18b34563031f4");
                return;
            }
            this.f = false;
            e.this.removeCallbacks(this);
        }
    }

    public void setOnRefreshListener(a aVar) {
        this.k = aVar;
    }

    public void setRefreshing(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b25ffe2cb342ac8c7c145f481e56414e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b25ffe2cb342ac8c7c145f481e56414e");
        } else if (z) {
            a(Math.round(-a));
            if (!this.f) {
                b();
            }
            this.f = true;
        } else {
            a(0);
            if (this.f) {
                c();
            }
            this.f = false;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36756a4c39d012dd7ca12eb650f582f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36756a4c39d012dd7ca12eb650f582f4");
            return;
        }
        this.l = z;
        if (!this.l) {
            setRefreshing(false);
        }
        super.setEnabled(z);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3be1d734844ff42a6a4a0c8ad224776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3be1d734844ff42a6a4a0c8ad224776");
            return;
        }
        if (this.k != null) {
            this.k.a();
        }
        this.g.setImageDrawable(getResources().getDrawable(this.q));
        this.s.postDelayed(new Runnable() { // from class: com.meituan.msc.modules.page.widget.e.1
            public static ChangeQuickRedirect a;
            public int b = 1;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e42ec52e3a9aab8c68c76c054289f58b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e42ec52e3a9aab8c68c76c054289f58b");
                    return;
                }
                e.this.g.setRotation(this.b * 30);
                this.b++;
                e.this.s.postDelayed(this, 60L);
            }
        }, 60L);
        this.i = a;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7ea8e32bd90b4157fb795bca31b8612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7ea8e32bd90b4157fb795bca31b8612");
            return;
        }
        this.s.removeCallbacksAndMessages(null);
        this.g.setImageDrawable(getResources().getDrawable(this.r));
        this.i = 0;
    }

    public void setBackgroundTextStyle(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b35f11c81de1050354aa537ee74709a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b35f11c81de1050354aa537ee74709a");
            return;
        }
        int i = this.q;
        int i2 = this.r;
        this.q = z ? R.drawable.msc_page_refresh_loading_1 : R.drawable.msc_page_refresh_loading_1_white;
        this.r = z ? R.drawable.msc_page_refresh_loading_0 : R.drawable.msc_page_refresh_loading_0_white;
        if (this.f && i != this.q) {
            this.g.setImageDrawable(getResources().getDrawable(this.q));
        }
        if (this.f || i2 == this.r) {
            return;
        }
        this.g.setImageDrawable(getResources().getDrawable(this.r));
    }
}
