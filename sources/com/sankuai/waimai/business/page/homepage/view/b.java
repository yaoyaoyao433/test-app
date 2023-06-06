package com.sankuai.waimai.business.page.homepage.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.widget.RoundImageView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b<T> {
    public static ChangeQuickRedirect a;
    protected RoundImageView b;
    protected ImageView c;
    protected TextView d;
    protected TextView e;
    protected ImageView f;
    protected ViewGroup g;
    protected TextView h;
    protected Context i;
    protected T j;
    a k;
    protected View l;
    private boolean m;
    private ValueAnimator n;
    private ValueAnimator o;
    private int p;
    private int q;
    private Runnable r;
    private boolean s;

    public abstract void a();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        OPEN,
        CLOSE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc81f3928ae6643b26e7d159794f40c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc81f3928ae6643b26e7d159794f40c4");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2f2f1d6032c05799520e1bcec6e8972", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2f2f1d6032c05799520e1bcec6e8972") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b16342c9a52259e5fd377a176999e7e", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b16342c9a52259e5fd377a176999e7e") : (a[]) values().clone();
        }
    }

    public void a(a aVar) {
        this.k = aVar;
    }

    public b(Context context, View view) {
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0f0eebec198b9a5b7a4e157b30a8d1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0f0eebec198b9a5b7a4e157b30a8d1e");
            return;
        }
        this.m = false;
        this.r = new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.view.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b3dd12aaa078c543c6f0329dc27416a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b3dd12aaa078c543c6f0329dc27416a");
                } else if (b.this.l != null) {
                    b.this.l.setVisibility(0);
                    b.this.a(true, false);
                }
            }
        };
        this.s = true;
        this.i = context;
        this.l = view;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd5db8f844d7b0661b11ac492940ed4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd5db8f844d7b0661b11ac492940ed4f");
            return;
        }
        this.b = (RoundImageView) this.l.findViewById(R.id.img_order_status);
        this.c = (ImageView) this.l.findViewById(R.id.img_weather_status);
        this.d = (TextView) this.l.findViewById(R.id.txt_bottom_status_main);
        this.e = (TextView) this.l.findViewById(R.id.txt_bottom_status_second);
        this.f = (ImageView) this.l.findViewById(R.id.img_bottom_status_close);
        this.g = (ViewGroup) this.l.findViewById(R.id.layout_container);
        this.h = (TextView) this.l.findViewById(R.id.txt_im_message_count);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab6a462a1adee2cf22ec54b4782f6e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab6a462a1adee2cf22ec54b4782f6e51");
            return;
        }
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.homepage.view.b.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9b5973dac61ecb1a8c6763e4d04c1b5a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9b5973dac61ecb1a8c6763e4d04c1b5a");
                } else if (b.this.k == a.OPEN) {
                    b.this.a(true);
                }
            }
        });
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.homepage.view.b.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8159aeb8ef84c9087ab047af2d9e8d0a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8159aeb8ef84c9087ab047af2d9e8d0a");
                } else if (b.this.k == a.CLOSE) {
                    b.this.a(true, true);
                } else if (b.this.k == a.OPEN) {
                    b.this.a();
                }
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.homepage.view.b.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2e820f8f0ae89e17b920523f7aa807cd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2e820f8f0ae89e17b920523f7aa807cd");
                } else if (b.this.k == a.CLOSE) {
                    b.this.a(true, true);
                } else if (b.this.k == a.OPEN) {
                    b.this.a();
                }
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.homepage.view.b.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr4 = {view2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fc59b5d8c9f789b622b4b69ae53c883d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fc59b5d8c9f789b622b4b69ae53c883d");
                } else if (b.this.k == a.OPEN) {
                    b.this.a();
                }
            }
        });
        this.q = g.a(this.i, 10.0f);
    }

    private int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcd2c665eb937bbdda73ba459f72d1ae", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcd2c665eb937bbdda73ba459f72d1ae")).intValue() : ((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()).rightMargin;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "559c88e39dcc5e8841d22349a87f1afc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "559c88e39dcc5e8841d22349a87f1afc");
        } else if (this.k == a.CLOSE) {
        } else {
            if (this.g.getMeasuredWidth() == 0) {
                this.g.measure(0, 0);
            }
            this.p = this.g.getMeasuredWidth();
            int i = i();
            int a2 = (g.a(this.i, 35.0f) + g.a(this.i, 8.0f)) - this.p;
            if (z) {
                if (this.n == null || !this.n.isRunning()) {
                    this.n = ValueAnimator.ofInt(i, a2);
                    this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.page.homepage.view.b.7
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Object[] objArr2 = {valueAnimator};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75db545dc64b60bd63ca7db4acb314a4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75db545dc64b60bd63ca7db4acb314a4");
                            } else {
                                b.this.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            }
                        }
                    });
                    this.n.addListener(new com.sankuai.waimai.business.page.homepage.listener.a() { // from class: com.sankuai.waimai.business.page.homepage.view.b.8
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            Object[] objArr2 = {animator};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2068b3e362bbde9a9cfb2e6965af721", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2068b3e362bbde9a9cfb2e6965af721");
                            }
                        }
                    });
                    this.n.setDuration(300L);
                    this.n.start();
                    a(a.CLOSE);
                    return;
                }
                return;
            }
            a(a2);
            a(a.CLOSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "659d44989cfb63221303f0ba9503098a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "659d44989cfb63221303f0ba9503098a");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
        marginLayoutParams.rightMargin = i;
        this.g.setLayoutParams(marginLayoutParams);
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61dc330778330ac9685a6d2a3a2247cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61dc330778330ac9685a6d2a3a2247cc");
        } else if (this.k == a.OPEN) {
        } else {
            if (this.g.getMeasuredWidth() == 0) {
                this.g.measure(0, 0);
            }
            this.p = this.g.getMeasuredWidth();
            int i = z2 ? i() : -this.p;
            int i2 = this.q;
            if (z) {
                if (this.n == null || !this.n.isRunning()) {
                    this.n = ValueAnimator.ofInt(i, i2);
                    this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.page.homepage.view.b.9
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Object[] objArr2 = {valueAnimator};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "783170503a67483956297ee1f939b041", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "783170503a67483956297ee1f939b041");
                            } else {
                                b.this.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            }
                        }
                    });
                    this.n.addListener(new com.sankuai.waimai.business.page.homepage.listener.a() { // from class: com.sankuai.waimai.business.page.homepage.view.b.10
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            Object[] objArr2 = {animator};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d951d777f85072d7bc6650f22b805ff", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d951d777f85072d7bc6650f22b805ff");
                            }
                        }
                    });
                    this.n.setDuration(300L);
                    if (this.k == null) {
                        this.n.setInterpolator(new OvershootInterpolator());
                    }
                    this.n.start();
                    a(a.OPEN);
                    return;
                }
                return;
            }
            a(i2);
            a(a.OPEN);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbea056b83926b8dad2c243767a34a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbea056b83926b8dad2c243767a34a04");
        } else if (this.l != null) {
            if (!this.m) {
                this.l.setVisibility(8);
                this.l.postDelayed(this.r, this.s ? 300L : 0L);
                this.s = false;
            } else {
                this.l.setVisibility(0);
            }
            this.m = true;
            com.sankuai.waimai.business.page.home.list.future.modulelistheader.e.a(false);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a05f47799da32ece48cf8a92e6a0d1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a05f47799da32ece48cf8a92e6a0d1d");
            return;
        }
        if (this.l != null) {
            this.l.setVisibility(0);
        }
        this.m = true;
        com.sankuai.waimai.business.page.home.list.future.modulelistheader.e.a(false);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f85a475d02b22a99a30f3c735d71f17d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f85a475d02b22a99a30f3c735d71f17d");
        } else if (this.l != null) {
            this.l.setVisibility(8);
            this.l.removeCallbacks(this.r);
            com.sankuai.waimai.business.page.home.list.future.modulelistheader.e.a(true);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b448da8d86509b8d1d22cd5b9217b3c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b448da8d86509b8d1d22cd5b9217b3c7");
            return;
        }
        d();
        this.m = false;
        a((a) null);
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca3d13e4922a821906b609d2cf04ae6d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca3d13e4922a821906b609d2cf04ae6d")).booleanValue() : this.l != null && this.l.getVisibility() == 0;
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7473737c9f7c6d62eb8a25560d2c755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7473737c9f7c6d62eb8a25560d2c755");
        } else {
            a(g.a(this.i, 10.0f), g.a(this.i, 44.0f));
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c7bbff6cd3eb34a8b5672d0700ba049", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c7bbff6cd3eb34a8b5672d0700ba049");
        } else {
            a(g.a(this.i, 44.0f), g.a(this.i, 10.0f));
        }
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f578f1af300e64974648f383908c1b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f578f1af300e64974648f383908c1b4");
        } else if (this.o == null || !this.o.isRunning()) {
            this.o = ValueAnimator.ofInt(i, i2);
            this.o.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.page.homepage.view.b.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr2 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "547942c92755d6e7b3b90a6141cb5832", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "547942c92755d6e7b3b90a6141cb5832");
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b.this.g.getLayoutParams();
                    marginLayoutParams.bottomMargin = intValue;
                    b.this.g.setLayoutParams(marginLayoutParams);
                }
            });
            this.o.setDuration(300L);
            this.o.start();
        }
    }
}
