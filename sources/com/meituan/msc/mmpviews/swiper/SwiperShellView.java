package com.meituan.msc.mmpviews.swiper;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Scroller;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.mmpviews.swiper.event.c;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.l;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SwiperShellView extends com.meituan.msc.mmpviews.shell.nest.a<ViewPager> implements LifecycleEventListener {
    public static ChangeQuickRedirect d;
    MSCViewPager e;
    boolean f;
    int g;
    volatile boolean h;
    int i;
    String j;
    private com.meituan.msc.uimanager.events.b k;
    private com.meituan.msc.mmpviews.swiper.a l;
    private Boolean m;
    private boolean n;
    private int o;
    private boolean p;
    private boolean q;
    private SwiperOnPageChangeCallback r;
    private boolean s;
    private ReactContext t;
    private volatile boolean u;

    public void setCircular(boolean z) {
    }

    public static /* synthetic */ boolean a(SwiperShellView swiperShellView, boolean z) {
        swiperShellView.q = true;
        return true;
    }

    public SwiperShellView(ReactContext reactContext) {
        super(reactContext);
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea067d2825f9baa2641d2917ae6a972d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea067d2825f9baa2641d2917ae6a972d");
            return;
        }
        this.g = 5000;
        this.o = 500;
        this.h = false;
        this.p = true;
        this.i = -1;
        this.q = false;
        this.s = false;
        this.u = false;
        this.t = reactContext;
        this.r = new SwiperOnPageChangeCallback();
        setDuration(this.o);
        this.e = new MSCViewPager(getContext());
        setInnerView(this.e);
        addView(getInnerView());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
        if (com.meituan.msc.mmpviews.util.b.a(r13) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setInitialProps(com.meituan.msc.uimanager.ab r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.mmpviews.swiper.SwiperShellView.d
            java.lang.String r11 = "4ef1fa5cd7a5e6c9a44c1975e117037e"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            com.meituan.msc.jse.bridge.ReactContext r1 = r12.t
            com.meituan.msc.uimanager.UIManagerModule r1 = r1.getUIManagerModule()
            com.meituan.msc.uimanager.events.b r1 = r1.a()
            r12.k = r1
            com.meituan.msc.jse.bridge.ReactContext r1 = r12.t
            r1.addLifecycleEventListener(r12)
            java.lang.String r1 = "vertical"
            boolean r1 = r13.a(r1)
            if (r1 == 0) goto L49
            java.lang.String r1 = "vertical"
            com.meituan.msc.jse.bridge.Dynamic r1 = r13.c(r1)
            r1.getClass()
            com.meituan.msc.jse.bridge.Dynamic r1 = (com.meituan.msc.jse.bridge.Dynamic) r1
            boolean r1 = com.meituan.msc.mmpviews.util.b.a(r1)
            if (r1 == 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            r12.n = r1
            java.lang.String r1 = "circular"
            boolean r1 = r13.a(r1)
            if (r1 == 0) goto L66
            java.lang.String r1 = "circular"
            com.meituan.msc.jse.bridge.Dynamic r13 = r13.c(r1)
            r13.getClass()
            com.meituan.msc.jse.bridge.Dynamic r13 = (com.meituan.msc.jse.bridge.Dynamic) r13
            boolean r13 = com.meituan.msc.mmpviews.util.b.a(r13)
            if (r13 == 0) goto L66
            goto L67
        L66:
            r0 = 0
        L67:
            r12.f = r0
            com.meituan.msc.mmpviews.swiper.MSCViewPager r13 = r12.e
            boolean r0 = r12.n
            r13.setOrientation(r0)
            boolean r13 = r12.f
            if (r13 == 0) goto L7a
            com.meituan.msc.mmpviews.swiper.CyclePageAdapter r13 = new com.meituan.msc.mmpviews.swiper.CyclePageAdapter
            r13.<init>()
            goto L7f
        L7a:
            com.meituan.msc.mmpviews.swiper.ViewPagerAdapter r13 = new com.meituan.msc.mmpviews.swiper.ViewPagerAdapter
            r13.<init>()
        L7f:
            com.meituan.msc.mmpviews.swiper.MSCViewPager r0 = r12.e
            r0.setAdapter(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.swiper.SwiperShellView.setInitialProps(com.meituan.msc.uimanager.ab):void");
    }

    @Override // com.meituan.msc.mmpviews.shell.d, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "595ebe9cd17f55ae211e6796661114bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "595ebe9cd17f55ae211e6796661114bb");
            return;
        }
        l.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (getChildAt(0) != null) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewPagerAdapter getAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45fc57f5a2f77936ee94ff81678c63d", RobustBitConfig.DEFAULT_VALUE) ? (ViewPagerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45fc57f5a2f77936ee94ff81678c63d") : (ViewPagerAdapter) this.e.getAdapter();
    }

    public void setCurrent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d05e328e62f2082fe30229880518bbe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d05e328e62f2082fe30229880518bbe3");
            return;
        }
        if (this.e.getAdapter() instanceof CyclePageAdapter) {
            CyclePageAdapter cyclePageAdapter = (CyclePageAdapter) this.e.getAdapter();
            i++;
        }
        if (this.e.getAdapter().getCount() > i) {
            this.j = "";
            this.e.setCurrentItem(i, true);
            return;
        }
        this.i = i;
    }

    public int getViewCountInAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c16944091d2aa87e153472b9ea0e8415", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c16944091d2aa87e153472b9ea0e8415")).intValue();
        }
        ViewPagerAdapter adapter = getAdapter();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = ViewPagerAdapter.b;
        return PatchProxy.isSupport(objArr2, adapter, changeQuickRedirect2, false, "2c1a12cf6be57d634f208c563e9d2036", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, adapter, changeQuickRedirect2, false, "2c1a12cf6be57d634f208c563e9d2036")).intValue() : adapter.c.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getSource() {
        return this.j;
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3195636e2ab639649eaafcd085421fce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3195636e2ab639649eaafcd085421fce");
            return;
        }
        this.e.addOnPageChangeListener(this.r);
        b(this.g);
        g.d("[SwiperShellView@onHostResume]", this.r);
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2d1406370d7344d05fc14f348fa852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2d1406370d7344d05fc14f348fa852");
            return;
        }
        this.e.removeOnPageChangeListener(this.r);
        c();
        g.d("[SwiperShellView@onHostPause] ", this.r);
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e1531e47476ccb04429db179e8f9218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e1531e47476ccb04429db179e8f9218");
            return;
        }
        this.e.removeOnPageChangeListener(this.r);
        c();
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        g.d("[SwiperShellView@onHostDestroy] ", this.r);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class SwiperOnPageChangeCallback implements ViewPager.OnPageChangeListener {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;
        private boolean e;
        private int f;

        private SwiperOnPageChangeCallback() {
            Object[] objArr = {SwiperShellView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b235e6fae6874681bfd384cded1f3f73", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b235e6fae6874681bfd384cded1f3f73");
            } else {
                this.f = -1;
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80804a082b995af3ecda3f7ea36bf5d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80804a082b995af3ecda3f7ea36bf5d2");
                return;
            }
            SwiperShellView.a(SwiperShellView.this, true);
            if (this.d == 1) {
                if (i == SwiperShellView.this.e.getCurrentItem()) {
                    this.e = true;
                } else {
                    i2 -= SwiperShellView.this.getWidth();
                    this.e = false;
                }
                int c = (int) s.c(i2);
                com.meituan.msc.uimanager.events.b bVar = SwiperShellView.this.k;
                int l = SwiperShellView.this.getDelegate().l();
                int i3 = SwiperShellView.this.n ? 0 : c;
                if (!SwiperShellView.this.n) {
                    c = 0;
                }
                bVar.a(new com.meituan.msc.mmpviews.swiper.event.b(l, i3, c, SwiperShellView.this.getDelegate().m()));
            } else if (this.d == 2) {
                if (i == this.f || this.f < 0) {
                    if (!this.e) {
                        i2 -= SwiperShellView.this.getWidth();
                    }
                } else if (this.e) {
                    i2 = SwiperShellView.this.getWidth();
                }
                int c2 = (int) s.c(i2);
                com.meituan.msc.uimanager.events.b bVar2 = SwiperShellView.this.k;
                int l2 = SwiperShellView.this.getDelegate().l();
                int i4 = SwiperShellView.this.n ? 0 : c2;
                if (!SwiperShellView.this.n) {
                    c2 = 0;
                }
                bVar2.a(new com.meituan.msc.mmpviews.swiper.event.b(l2, i4, c2, SwiperShellView.this.getDelegate().m()));
            }
            this.f = i;
            if (SwiperShellView.this.s) {
                return;
            }
            SwiperShellView.this.t.getUIManagerModule().c.a(8, "triggered by Swiper scroll");
            SwiperShellView.this.s = true;
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a1437a2835235c8ddfcbe81d78d2a78", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a1437a2835235c8ddfcbe81d78d2a78");
                return;
            }
            int a2 = SwiperShellView.this.e.getAdapter() instanceof CyclePageAdapter ? ((CyclePageAdapter) SwiperShellView.this.e.getAdapter()).a(i) : i;
            if (SwiperShellView.this.q || i > 0) {
                SwiperShellView.this.k.a(new c(SwiperShellView.this.getDelegate().l(), a2, SwiperShellView.this.getSource(), SwiperShellView.this.getDelegate().m()));
            }
            this.c = a2;
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            int i2;
            int i3 = 1;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4b790ac3b256602e2b61ec6e4b35f19", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4b790ac3b256602e2b61ec6e4b35f19");
                return;
            }
            this.d = i;
            if (i == 0) {
                SwiperShellView.this.k.a(new com.meituan.msc.mmpviews.swiper.event.a(SwiperShellView.this.getDelegate().l(), this.c, SwiperShellView.this.getSource(), SwiperShellView.this.getDelegate().m()));
                SwiperShellView.this.s = false;
                SwiperShellView.this.p = true;
            } else if (i == 1) {
                SwiperShellView.this.j = "touch";
                SwiperShellView.this.s = false;
                SwiperShellView.this.p = false;
            } else if (i == 2) {
                SwiperShellView.this.p = true;
            }
            if (SwiperShellView.this.f && i == 0) {
                int currentItem = SwiperShellView.this.e.getCurrentItem();
                Object[] objArr2 = {Integer.valueOf(currentItem)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d8a652930e9da45809a80b931466c62", RobustBitConfig.DEFAULT_VALUE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d8a652930e9da45809a80b931466c62")).intValue();
                } else if (currentItem == -1) {
                    i2 = -1;
                } else {
                    PagerAdapter adapter = SwiperShellView.this.e.getAdapter();
                    adapter.getClass();
                    int count = adapter.getCount() - 1;
                    if (currentItem == 0) {
                        i3 = count == 0 ? 0 : count - 1;
                    } else if (currentItem != count) {
                        i3 = -1;
                    }
                    i2 = i3;
                }
                if (i2 == -1 || i2 == SwiperShellView.this.e.getCurrentItem()) {
                    return;
                }
                SwiperShellView.this.e.setCurrentItem(i2, false);
                SwiperShellView.this.e.a();
            }
        }
    }

    public void setAutoPlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ddfc87d7fe1e3a427f8f298a95e8933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ddfc87d7fe1e3a427f8f298a95e8933");
            return;
        }
        if (this.m == null || z != this.m.booleanValue()) {
            if (z) {
                b(this.g);
            } else {
                c();
            }
        }
        this.m = Boolean.valueOf(z);
    }

    public void setDuration(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff91b17e71d7999542ebe73e88949cf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff91b17e71d7999542ebe73e88949cf2");
        } else if (i == this.o) {
        } else {
            this.o = i;
            try {
                Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                declaredField.setAccessible(true);
                declaredField.set(this.e, new Scroller(getContext()) { // from class: com.meituan.msc.mmpviews.swiper.SwiperShellView.1
                    public static ChangeQuickRedirect a;

                    @Override // android.widget.Scroller
                    public final void startScroll(int i2, int i3, int i4, int i5) {
                        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23823ebd7a897ebd186104647ae44c84", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23823ebd7a897ebd186104647ae44c84");
                        } else {
                            super.startScroll(i2, i3, i4, i5, SwiperShellView.this.o);
                        }
                    }

                    @Override // android.widget.Scroller
                    public final void startScroll(int i2, int i3, int i4, int i5, int i6) {
                        Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d942b907e76691c06bda5abcc68986d0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d942b907e76691c06bda5abcc68986d0");
                        } else {
                            super.startScroll(i2, i3, i4, i5, SwiperShellView.this.o);
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setInterval(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7afd266c617b0f6f726f1ceb7d15add", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7afd266c617b0f6f726f1ceb7d15add");
            return;
        }
        if (i != this.g) {
            c();
            b(i);
        }
        this.g = i;
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f54b92c79015b87491fe693ab86a3491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f54b92c79015b87491fe693ab86a3491");
        } else if (this.u && this.m != null && this.m.booleanValue() && this.l == null && getViewCountInAdapter() > 1) {
            this.l = d();
            this.l.a(i);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e28a74ddada7dcb23d7746ed9d4257e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e28a74ddada7dcb23d7746ed9d4257e2");
        } else if (this.l != null) {
            this.l.a();
            this.l = null;
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.d, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38e1f6177a60dbe81f5b886908259571", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38e1f6177a60dbe81f5b886908259571");
            return;
        }
        super.onAttachedToWindow();
        this.u = true;
        b(this.g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92ba3ff9d85b0ab90aae13067d83c653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92ba3ff9d85b0ab90aae13067d83c653");
            return;
        }
        super.onDetachedFromWindow();
        this.u = false;
        c();
    }

    private com.meituan.msc.mmpviews.swiper.a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "165b7693bea431bda8dc0a954f951cc0", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.mmpviews.swiper.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "165b7693bea431bda8dc0a954f951cc0") : new com.meituan.msc.mmpviews.swiper.a(new a(this));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        private WeakReference<SwiperShellView> b;

        public a(SwiperShellView swiperShellView) {
            Object[] objArr = {swiperShellView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bd725f2b7beda7d9d788f6a9d8efb5d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bd725f2b7beda7d9d788f6a9d8efb5d");
            } else {
                this.b = new WeakReference<>(swiperShellView);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            SwiperShellView swiperShellView;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70bdd9aa0291e32373126a46d6a0fa4f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70bdd9aa0291e32373126a46d6a0fa4f");
            } else if (this.b == null || (swiperShellView = this.b.get()) == null || swiperShellView.getAdapter() == null || swiperShellView.getAdapter().getCount() <= 0 || !swiperShellView.p) {
            } else {
                swiperShellView.j = "autoplay";
                swiperShellView.e.setCurrentItem((swiperShellView.e.getCurrentItem() + 1) % swiperShellView.getAdapter().getCount(), true);
            }
        }
    }
}
