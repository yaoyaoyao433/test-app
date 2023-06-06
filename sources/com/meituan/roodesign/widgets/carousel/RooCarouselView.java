package com.meituan.roodesign.widgets.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooCarouselView extends RelativeLayout {
    public static ChangeQuickRedirect a = null;
    @StyleRes
    private static final int b = 2131559109;
    @AttrRes
    private static final int c = 2130772160;
    private boolean d;
    private int e;
    private boolean f;
    private float g;
    private int h;
    private float i;
    private float j;
    private float k;
    private float l;
    private boolean m;
    private a n;
    private int o;
    private ViewPager p;
    private CarouselPageAdapter q;
    private RooIndicatorView r;
    private RelativeLayout.LayoutParams s;
    private int t;
    private float u;
    private float v;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface IndicatorPosition {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
    }

    public static /* synthetic */ int b(RooCarouselView rooCarouselView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, rooCarouselView, changeQuickRedirect, false, "cf6b248fbeef4f39d248cb964d5fb503", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, rooCarouselView, changeQuickRedirect, false, "cf6b248fbeef4f39d248cb964d5fb503")).intValue();
        }
        if (rooCarouselView.f) {
            int a2 = rooCarouselView.q.a();
            if (i == 0) {
                return a2 - 1;
            }
            if (i == a2 + 1) {
                return 0;
            }
            return i - 1;
        }
        return i;
    }

    public RooCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a1ae8352e877fbdb2046d9f7be69c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a1ae8352e877fbdb2046d9f7be69c0");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.indicatorBackground, R.attr.indicatorCount, R.attr.indicatorHeight, R.attr.indicatorOrientation, R.attr.indicatorSelected, R.attr.indicatorSelectedBackground, R.attr.indicatorSelectedHeight, R.attr.indicatorSelectedWidth, R.attr.indicatorSpace, R.attr.indicatorWidth, R.attr.carouselAutoLoop, R.attr.carouselLoopIntervalTime, R.attr.carouselInfiniteLoop, R.attr.carouselRoundCorner, R.attr.indicatorAttachToCarousel, R.attr.indicatorPosition, R.attr.indicatorMarginTop, R.attr.indicatorMarginBottom, R.attr.indicatorMarginLeft, R.attr.indicatorMarginRight}, i, b);
        this.d = obtainStyledAttributes.getBoolean(10, false);
        this.e = obtainStyledAttributes.getInt(11, 2000);
        this.e = Math.max(this.e, 500);
        this.f = obtainStyledAttributes.getBoolean(12, false);
        this.g = obtainStyledAttributes.getFloat(13, 0.0f);
        this.h = obtainStyledAttributes.getInt(15, 4);
        this.i = obtainStyledAttributes.getDimension(16, 0.0f);
        this.j = obtainStyledAttributes.getDimension(17, 0.0f);
        this.k = obtainStyledAttributes.getDimension(18, 0.0f);
        this.l = obtainStyledAttributes.getDimension(19, 0.0f);
        this.m = obtainStyledAttributes.getBoolean(14, true);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "207bde34ca3e544a287728501ff0d6e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "207bde34ca3e544a287728501ff0d6e9");
        } else {
            this.t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            this.n = new a(this);
        }
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31a93b635773310576d887dfc0eb14c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31a93b635773310576d887dfc0eb14c1");
            i4 = 1;
            i2 = 9;
            i3 = 4;
        } else {
            this.p = new ViewPager(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (!this.m) {
                layoutParams.addRule(2, 256);
            }
            addView(this.p, layoutParams);
            this.p.addOnPageChangeListener(new CarouselOnPageChangeCallback());
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            i2 = 9;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e3805c02284278583abc2785d896ed8d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e3805c02284278583abc2785d896ed8d");
                i3 = 4;
            } else {
                this.s = new RelativeLayout.LayoutParams(-2, -2);
                if ((this.h & 0) == 0) {
                    this.s.addRule(14);
                }
                if ((this.h & 1) == 1) {
                    this.s.addRule(9);
                }
                if ((this.h & 2) == 2) {
                    this.s.addRule(11);
                }
                if ((this.h & 3) == 3) {
                    this.s.addRule(10);
                }
                i3 = 4;
                if ((this.h & 4) == 4) {
                    this.s.addRule(12);
                }
                this.s.leftMargin = (int) this.k;
                this.s.rightMargin = (int) this.l;
                this.s.topMargin = (int) this.i;
                this.s.bottomMargin = (int) this.j;
            }
            this.r = new RooIndicatorView(getContext());
            this.r.setId(256);
            addView(this.r, this.s);
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a3a5b657f14b6953957ae8d108d89664", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a3a5b657f14b6953957ae8d108d89664");
            } else if (this.g > 0.0f) {
                this.p.setOutlineProvider(new ViewOutlineProvider() { // from class: com.meituan.roodesign.widgets.carousel.RooCarouselView.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        Object[] objArr6 = {view, outline};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "838d2aa72a557b31d01dc5ec0fc01bd6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "838d2aa72a557b31d01dc5ec0fc01bd6");
                        } else {
                            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), RooCarouselView.this.g);
                        }
                    }
                });
                i4 = 1;
                this.p.setClipToOutline(true);
            }
            i4 = 1;
        }
        Object[] objArr6 = new Object[i4];
        objArr6[0] = obtainStyledAttributes;
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a0072da947b5b92ccc7c4d6f0907c323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a0072da947b5b92ccc7c4d6f0907c323");
        } else {
            float dimension = obtainStyledAttributes.getDimension(i2, 4.0f);
            float dimension2 = obtainStyledAttributes.getDimension(2, 4.0f);
            float dimension3 = obtainStyledAttributes.getDimension(7, dimension);
            float dimension4 = obtainStyledAttributes.getDimension(6, dimension2);
            float dimension5 = obtainStyledAttributes.getDimension(8, 4.0f);
            int i5 = obtainStyledAttributes.getInt(3, 0);
            int i6 = obtainStyledAttributes.getInt(1, 1);
            int i7 = obtainStyledAttributes.getInt(i3, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            this.r.setIndicatorWidth(dimension);
            this.r.setIndicatorHeight(dimension2);
            this.r.setIndicatorSelectedWidth(dimension3);
            this.r.setIndicatorSelectedHeight(dimension4);
            this.r.setIndicatorSpace(dimension5);
            this.r.setIndicatorOrientation(i5);
            this.r.a(i6, false);
            this.r.b(i7, false);
            this.r.setIndicatorBg(drawable);
            this.r.setIndicatorSelectedBg(drawable2);
        }
        obtainStyledAttributes.recycle();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class CarouselOnPageChangeCallback implements ViewPager.OnPageChangeListener {
        public static ChangeQuickRedirect a;

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public CarouselOnPageChangeCallback() {
            Object[] objArr = {RooCarouselView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae097b8a005e97c29f31b2379f6575f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae097b8a005e97c29f31b2379f6575f");
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            int itemCount;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779b7485c16b787343e4ff174e8b77be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779b7485c16b787343e4ff174e8b77be");
                return;
            }
            RooCarouselView.this.o = i;
            RooCarouselView.this.r.setIndicatorSelected(RooCarouselView.b(RooCarouselView.this, i));
            if (!RooCarouselView.this.f || (itemCount = RooCarouselView.this.getItemCount()) < 2) {
                return;
            }
            if (i == 0) {
                RooCarouselView.this.o = itemCount - 2;
            } else if (i == itemCount - 1) {
                RooCarouselView.this.o = 1;
            } else {
                RooCarouselView.this.o = i;
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06b26ef3f5014e45272761b597513af4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06b26ef3f5014e45272761b597513af4");
            } else if (i == 0 && RooCarouselView.this.f) {
                RooCarouselView.this.setCurrentItem(RooCarouselView.this.o);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8119ceaf876347a2021a08458abdc1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8119ceaf876347a2021a08458abdc1f")).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            b();
        } else if (actionMasked == 1 || actionMasked == 3 || actionMasked == 4) {
            a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5200ffa6c8b5de031c8b3e3633173f0c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5200ffa6c8b5de031c8b3e3633173f0c")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.u = motionEvent.getX();
                this.v = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
            case 1:
            case 3:
                getParent().requestDisallowInterceptTouchEvent(false);
                break;
            case 2:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float abs = Math.abs(x - this.u);
                getParent().requestDisallowInterceptTouchEvent((abs <= ((float) this.t) || abs <= Math.abs(y - this.v)) ? false : false);
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setAdapter(@NonNull CarouselPageAdapter carouselPageAdapter) {
        int i = 1;
        Object[] objArr = {carouselPageAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1fe924c36f741e40d8cc3fdd34035f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1fe924c36f741e40d8cc3fdd34035f0");
        } else if (carouselPageAdapter == null) {
            throw new NullPointerException("RooCarouselView adapter is null");
        } else {
            this.q = carouselPageAdapter;
            int count = carouselPageAdapter.getCount();
            if (this.f) {
                this.q.b();
                count = carouselPageAdapter.a();
            } else {
                i = 0;
            }
            this.r.setIndicatorCount(count);
            this.p.setAdapter(carouselPageAdapter);
            this.p.setCurrentItem(i);
            a();
        }
    }

    public CarouselPageAdapter getAdapter() {
        return this.q;
    }

    public void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fce4e7318fc608735d2467d1f6cdca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fce4e7318fc608735d2467d1f6cdca");
        } else {
            a(i, false);
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c6404df0297da6a4d6ea387ea488ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c6404df0297da6a4d6ea387ea488ea");
        } else {
            this.p.setCurrentItem(i, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89bad0934ec6fcd5e64396711a875f0f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89bad0934ec6fcd5e64396711a875f0f")).intValue() : this.p.getCurrentItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf65c564d070e6ff00c4c27212fcb9bc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf65c564d070e6ff00c4c27212fcb9bc")).intValue();
        }
        CarouselPageAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getCount();
    }

    public void setOffscreenPageLimit(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d81a22ea62c199f4798adf7c3516a617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d81a22ea62c199f4798adf7c3516a617");
        } else {
            this.p.setOffscreenPageLimit(i);
        }
    }

    public ViewPager getViewPager() {
        return this.p;
    }

    public RooIndicatorView getIndicatorView() {
        return this.r;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e66883c9761f56723f1e8154b1f1b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e66883c9761f56723f1e8154b1f1b6");
        } else if (!this.d || getItemCount() <= 1) {
        } else {
            b();
            postDelayed(this.n, this.e);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb7120d613724c66797da60c5ac826e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb7120d613724c66797da60c5ac826e3");
        } else if (this.d) {
            removeCallbacks(this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        private final WeakReference<RooCarouselView> b;

        public a(RooCarouselView rooCarouselView) {
            Object[] objArr = {rooCarouselView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3a95ce6a74933ebb071ed77941336c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3a95ce6a74933ebb071ed77941336c");
            } else {
                this.b = new WeakReference<>(rooCarouselView);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int itemCount;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5dcde61444a8e1c24f376a8cfbd6a38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5dcde61444a8e1c24f376a8cfbd6a38");
                return;
            }
            RooCarouselView rooCarouselView = this.b.get();
            if (rooCarouselView == null || !rooCarouselView.d || (itemCount = rooCarouselView.getItemCount()) == 0) {
                return;
            }
            rooCarouselView.a((rooCarouselView.getCurrentItem() + 1) % itemCount, true);
            rooCarouselView.postDelayed(rooCarouselView.n, rooCarouselView.e);
        }
    }
}
