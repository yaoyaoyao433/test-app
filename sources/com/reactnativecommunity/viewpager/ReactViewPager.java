package com.reactnativecommunity.viewpager;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReactViewPager extends VerticalViewPager {
    private final com.facebook.react.uimanager.events.c a;
    private boolean b;
    private boolean c;
    private final Runnable d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends PagerAdapter {
        final List<View> a;
        boolean b;

        @Override // android.support.v4.view.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        private a() {
            this.a = new ArrayList();
            this.b = false;
        }

        @Override // android.support.v4.view.PagerAdapter
        public final int getCount() {
            return this.a.size();
        }

        @Override // android.support.v4.view.PagerAdapter
        public final int getItemPosition(Object obj) {
            if (this.b || !this.a.contains(obj)) {
                return -2;
            }
            return this.a.indexOf(obj);
        }

        @Override // android.support.v4.view.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = this.a.get(i);
            viewGroup.addView(view, 0, ReactViewPager.this.generateDefaultLayoutParams());
            ReactViewPager.this.post(ReactViewPager.this.d);
            return view;
        }

        @Override // android.support.v4.view.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class b implements ViewPager.OnPageChangeListener {
        private b() {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i, float f, int i2) {
            ReactViewPager.this.a.a(new com.reactnativecommunity.viewpager.a(ReactViewPager.this.getId(), i, f));
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i) {
            if (ReactViewPager.this.b) {
                return;
            }
            ReactViewPager.this.a.a(new c(ReactViewPager.this.getId(), i));
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i) {
            String str;
            switch (i) {
                case 0:
                    str = "idle";
                    break;
                case 1:
                    str = "dragging";
                    break;
                case 2:
                    str = "settling";
                    break;
                default:
                    throw new IllegalStateException("Unsupported pageScrollState");
            }
            ReactViewPager.this.a.a(new com.reactnativecommunity.viewpager.b(ReactViewPager.this.getId(), str));
        }
    }

    public ReactViewPager(ReactContext reactContext) {
        super(reactContext);
        this.c = true;
        this.d = new Runnable() { // from class: com.reactnativecommunity.viewpager.ReactViewPager.1
            @Override // java.lang.Runnable
            public final void run() {
                ReactViewPager.this.measure(View.MeasureSpec.makeMeasureSpec(ReactViewPager.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ReactViewPager.this.getHeight(), 1073741824));
                ReactViewPager.this.layout(ReactViewPager.this.getLeft(), ReactViewPager.this.getTop(), ReactViewPager.this.getRight(), ReactViewPager.this.getBottom());
            }
        };
        this.a = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.b = false;
        setOnPageChangeListener(new b());
        setAdapter(new a());
    }

    @Override // android.support.v4.view.ViewPager
    public a getAdapter() {
        return (a) super.getAdapter();
    }

    @Override // com.reactnativecommunity.viewpager.VerticalViewPager, android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.c) {
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    e.a(this, motionEvent);
                    return true;
                }
            } catch (IllegalArgumentException e) {
                com.facebook.common.logging.a.c("ReactNative", "Error intercepting touch event.", e);
            }
            return false;
        }
        return false;
    }

    @Override // com.reactnativecommunity.viewpager.VerticalViewPager, android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.c) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                com.facebook.common.logging.a.c("ReactNative", "Error handling touch event.", e);
                return false;
            }
        }
        return false;
    }

    public final void a(int i, boolean z) {
        this.b = true;
        setCurrentItem(i, z);
        this.a.a(new c(getId(), i));
        this.b = false;
    }

    public void setScrollEnabled(boolean z) {
        this.c = z;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
        post(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getViewCountInAdapter() {
        return getAdapter().getCount();
    }

    public void setViews(List<View> list) {
        a adapter = getAdapter();
        adapter.a.clear();
        adapter.a.addAll(list);
        adapter.notifyDataSetChanged();
        adapter.b = false;
    }
}
