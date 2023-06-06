package com.dianping.picassomodule.widget.scroll;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LoopViewPager extends WrapContentViewPager {
    public static ChangeQuickRedirect a;
    private LoopPagerAdapterWrapper b;
    private boolean c;
    private int d;
    private ViewPager.OnPageChangeListener e;
    private Runnable j;
    private ViewPager.OnPageChangeListener k;

    public LoopViewPager(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b374881c34aa9713549dd880d943862", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b374881c34aa9713549dd880d943862");
        }
    }

    private LoopViewPager(Context context, AttributeSet attributeSet) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65cfb58d509c7e4db5ca249714aceb58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65cfb58d509c7e4db5ca249714aceb58");
            return;
        }
        this.j = new Runnable() { // from class: com.dianping.picassomodule.widget.scroll.LoopViewPager.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b40eb4070359fc0554d29205ae722701", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b40eb4070359fc0554d29205ae722701");
                } else if (LoopViewPager.this.c) {
                    LoopViewPager.this.setCurrentItem(LoopViewPager.this.getCurrentItem() + 1, true);
                    LoopViewPager.this.a();
                }
            }
        };
        this.k = new ViewPager.SimpleOnPageChangeListener() { // from class: com.dianping.picassomodule.widget.scroll.LoopViewPager.2
            public static ChangeQuickRedirect a;
            private float c = -1.0f;
            private float d = -1.0f;

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46a98e512161e2bd3576717addda0e26", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46a98e512161e2bd3576717addda0e26");
                    return;
                }
                int b = LoopViewPager.this.b.b(i);
                float f = b;
                if (this.d != f) {
                    this.d = f;
                    if (LoopViewPager.this.e != null) {
                        LoopViewPager.this.e.onPageSelected(b);
                    }
                }
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c8b6553d8b50e2df3b0a33ceaf29ae2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c8b6553d8b50e2df3b0a33ceaf29ae2");
                    return;
                }
                if (LoopViewPager.this.b != null) {
                    int b = LoopViewPager.this.b.b(i);
                    if (f == 0.0f && this.c == 0.0f && (i == 0 || i == LoopViewPager.this.b.getCount() - 1)) {
                        LoopViewPager.this.setCurrentItem(b, false);
                    }
                    i = b;
                }
                this.c = f;
                if (LoopViewPager.this.e != null) {
                    if (i != LoopViewPager.this.b.a() - 1) {
                        LoopViewPager.this.e.onPageScrolled(i, f, i2);
                    } else if (f > 0.5d) {
                        LoopViewPager.this.e.onPageScrolled(0, 0.0f, 0);
                    } else {
                        LoopViewPager.this.e.onPageScrolled(i, 0.0f, 0);
                    }
                }
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "920363a131cd62b162762432ad3bf3e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "920363a131cd62b162762432ad3bf3e2");
                    return;
                }
                if (LoopViewPager.this.b != null) {
                    int currentItem = LoopViewPager.super.getCurrentItem();
                    int b = LoopViewPager.this.b.b(currentItem);
                    if (i == 0 && (currentItem == 0 || currentItem == LoopViewPager.this.b.getCount() - 1)) {
                        LoopViewPager.this.setCurrentItem(b, false);
                    }
                }
                if (LoopViewPager.this.e != null) {
                    LoopViewPager.this.e.onPageScrollStateChanged(i);
                }
            }
        };
        super.addOnPageChangeListener(this.k);
    }

    @Override // android.support.v4.view.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        Object[] objArr = {pagerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a7506694d96707b721e167a0bb5419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a7506694d96707b721e167a0bb5419");
            return;
        }
        this.b = new LoopPagerAdapterWrapper(pagerAdapter);
        super.setAdapter(this.b);
        setCurrentItem(0);
    }

    @Override // android.support.v4.view.ViewPager
    public int getCurrentItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a96d697d22cab6d66716a913fccd1b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a96d697d22cab6d66716a913fccd1b3")).intValue();
        }
        if (this.b != null) {
            return this.b.b(super.getCurrentItem());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73aba77094eb08210637030821a8b03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73aba77094eb08210637030821a8b03");
        } else if (this.c) {
            b();
            postDelayed(this.j, this.d);
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28132d2771bd8b3d00a66d6c913d28ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28132d2771bd8b3d00a66d6c913d28ce");
            return;
        }
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6105d3766b8c0ca5b7384879299eeb1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6105d3766b8c0ca5b7384879299eeb1e");
            return;
        }
        super.onAttachedToWindow();
        a();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "354f96f003fb116f222ea700ed1af090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "354f96f003fb116f222ea700ed1af090");
        } else {
            removeCallbacks(this.j);
        }
    }

    @Override // android.support.v4.view.ViewPager
    public void addOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.e = onPageChangeListener;
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "077a4cad2afb14377f361cee5d162fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "077a4cad2afb14377f361cee5d162fe5");
        } else if (getCurrentItem() != i) {
            setCurrentItem(i, true);
        }
    }

    @Override // android.support.v4.view.ViewPager
    public void setCurrentItem(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "563fb4debd9d25faafc8475b96aef6fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "563fb4debd9d25faafc8475b96aef6fd");
            return;
        }
        int a2 = LoopPagerAdapterWrapper.a(i);
        Object[] objArr2 = {Integer.valueOf(a2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0160038de4c30766873fb187a865d4f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0160038de4c30766873fb187a865d4f2");
        } else {
            super.setCurrentItem(a2, z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30dffec0643fc44ccf5de6302099aac0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30dffec0643fc44ccf5de6302099aac0")).booleanValue();
        }
        if (this.i) {
            int action = motionEvent.getAction();
            if (action != 3) {
                if (action != 7) {
                    switch (action) {
                    }
                }
                b();
            }
            a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class LoopPagerAdapterWrapper extends PagerAdapter {
        public static ChangeQuickRedirect a;
        private PagerAdapter b;

        public static int a(int i) {
            return i + 1;
        }

        public LoopPagerAdapterWrapper(PagerAdapter pagerAdapter) {
            Object[] objArr = {pagerAdapter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "841109b9a3249df3d7b56a61e1876112", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "841109b9a3249df3d7b56a61e1876112");
            } else {
                this.b = pagerAdapter;
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58feab7fc38c529e16805fdc86ccc322", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58feab7fc38c529e16805fdc86ccc322")).intValue() : this.b.getCount() + 2;
        }

        public final int b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06f5ec07808a324450d2c87d714783e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06f5ec07808a324450d2c87d714783e")).intValue();
            }
            int a2 = a();
            if (a2 == 0) {
                return 0;
            }
            int i2 = (i - 1) % a2;
            return i2 < 0 ? i2 + a2 : i2;
        }

        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "374f4ee287acc426b98b536de67051d6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "374f4ee287acc426b98b536de67051d6")).intValue() : this.b.getCount();
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e1ac128311f2423d783bd9b705c0a19", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e1ac128311f2423d783bd9b705c0a19") : this.b.instantiateItem(viewGroup, b(i));
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e12d9024cd5d2f7509233ced782370b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e12d9024cd5d2f7509233ced782370b7");
            } else {
                this.b.destroyItem(viewGroup, b(i), obj);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public void finishUpdate(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76730d74390340dc8c90d6ec227864f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76730d74390340dc8c90d6ec227864f8");
            } else {
                this.b.finishUpdate(viewGroup);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            Object[] objArr = {view, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3911b9767d1fe6c7ca13a56ed2dc8d39", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3911b9767d1fe6c7ca13a56ed2dc8d39")).booleanValue() : this.b.isViewFromObject(view, obj);
        }

        @Override // android.support.v4.view.PagerAdapter
        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            Object[] objArr = {parcelable, classLoader};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4772c02da23faa718909b3019150d5c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4772c02da23faa718909b3019150d5c2");
            } else {
                this.b.restoreState(parcelable, classLoader);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public Parcelable saveState() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd1a1bdb24e2367f5346fe7424b744f", RobustBitConfig.DEFAULT_VALUE) ? (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd1a1bdb24e2367f5346fe7424b744f") : this.b.saveState();
        }

        @Override // android.support.v4.view.PagerAdapter
        public void startUpdate(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb4802716aeacc008d9cfe97dcbac65", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb4802716aeacc008d9cfe97dcbac65");
            } else {
                this.b.startUpdate(viewGroup);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "578a1970ad47e29cc0f450c77354ea8f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "578a1970ad47e29cc0f450c77354ea8f");
            } else {
                this.b.setPrimaryItem(viewGroup, i, obj);
            }
        }
    }
}
