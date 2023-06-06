package com.dianping.picassomodule.widget.tab;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.extensions.common.ContainerDataSource;
import com.dianping.shield.component.extensions.tabs.TabShieldRow;
import com.dianping.shield.component.interfaces.OnDidInterceptTouchListener;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.components.AbstractTabInterface;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.layoutcontrol.ZFrameLayout;
import com.dianping.shield.node.adapter.AttachStatusCollection;
import com.dianping.shield.node.adapter.ViewLocationChangeProcessor;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TabView extends HorizontalScrollView implements ComponentScrollEventHelper.IScrollRange, AbstractTabInterface, IElementContainerExpose {
    public static ChangeQuickRedirect a;
    private AttachStatusCollection A;
    private List<Integer> B;
    private SparseArray<View> C;
    private LinearLayout b;
    private ZFrameLayout c;
    private View d;
    private f e;
    private i f;
    private ContainerDataSource g;
    private c h;
    private b i;
    private AbstractTabInterface.OnTabClickedListener j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private double p;
    private String q;
    private GradientDrawable r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private ComponentScrollEventHelper w;
    private OnDidInterceptTouchListener x;
    private boolean y;
    private int z;

    private String getDefaultSlideBarColor() {
        return "#FF6633";
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getContainerSpanCount() {
        return 1;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getElementChildLayoutPosition(@NotNull View view) {
        return -1;
    }

    public static /* synthetic */ void a(TabView tabView, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tabView, changeQuickRedirect, false, "2ea16abb15e5e5dde3aa0384a9fc03a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, tabView, changeQuickRedirect, false, "2ea16abb15e5e5dde3aa0384a9fc03a8");
        } else if (tabView.b()) {
            ViewGroup.LayoutParams layoutParams = tabView.d.getLayoutParams();
            layoutParams.width = tabView.getSlideBarWidth();
            tabView.d.setLayoutParams(layoutParams);
            if (i == 0) {
                tabView.d.setTranslationX(tabView.getTranslateX());
            } else {
                Animation animation = new Animation() { // from class: com.dianping.picassomodule.widget.tab.TabView.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.animation.Animation
                    public final void applyTransformation(float f, Transformation transformation) {
                        Object[] objArr2 = {Float.valueOf(f), transformation};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc0186e5903c3352843d0671e67c671c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc0186e5903c3352843d0671e67c671c");
                            return;
                        }
                        float translationX = TabView.this.d.getTranslationX();
                        TabView.this.d.setTranslationX(translationX + ((TabView.this.getTranslateX() - translationX) * f));
                    }
                };
                animation.setDuration(i);
                animation.setInterpolator(new AccelerateDecelerateInterpolator());
                tabView.d.clearAnimation();
                tabView.d.startAnimation(animation);
            }
            tabView.invalidate();
        }
    }

    public TabView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2975a3f3f77d9aa767a98ce4d5da8464", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2975a3f3f77d9aa767a98ce4d5da8464");
        }
    }

    private TabView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a163bea814958504609cf0b36dcf5ef6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a163bea814958504609cf0b36dcf5ef6");
        }
    }

    public TabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "389c9595d44853ad228003881de4d6d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "389c9595d44853ad228003881de4d6d8");
            return;
        }
        this.k = -1;
        this.m = -1;
        this.n = -1;
        this.o = true;
        this.p = -1.0d;
        this.x = null;
        this.y = false;
        this.z = 0;
        this.B = new ArrayList();
        this.C = new SparseArray<>();
        inflate(getContext(), R.layout.dm_layout_tab_view, this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45bcdb12387f8bde0184bbd77bf38122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45bcdb12387f8bde0184bbd77bf38122");
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.b = (LinearLayout) findViewById(R.id.scrollable);
            this.b.setClipChildren(false);
            this.b.setClipToPadding(false);
            this.c = (ZFrameLayout) findViewById(R.id.tab_container);
            this.c.setClipChildren(false);
            this.c.setClipToPadding(false);
            this.c.setEnabled(true);
            this.d = findViewById(R.id.indicator);
            this.A = new AttachStatusCollection();
            this.A.setElementContainerCommonFeature(this);
        }
        this.v = aq.a(getContext());
        this.w = new ComponentScrollEventHelper(getContext(), this, this);
    }

    public void setSlideBarView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1a5bde33960f36ab46dfb66736da5de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1a5bde33960f36ab46dfb66736da5de");
        } else if (this.c == null || view == null) {
        } else {
            this.y = true;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            this.c.removeView(this.d);
            this.c.addView(view, layoutParams);
            this.d = view;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422bc813b11e96d68b9fbf2acc16eabe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422bc813b11e96d68b9fbf2acc16eabe");
            return;
        }
        super.onMeasure(i, i2);
        this.d.getLayoutParams().width = getSlideBarWidth();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "782d3f99f08787133b87befecc77de16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "782d3f99f08787133b87befecc77de16");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.e != null) {
            a(false);
        }
        getHeight();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7000b1bbbc3543f347e14f1a34feec57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7000b1bbbc3543f347e14f1a34feec57");
            return;
        }
        super.onDraw(canvas);
        if (b()) {
            this.d.setTranslationX(getTranslateX());
        }
    }

    public void setSlideBarStyle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7317b8aec6f750f664c0fd2c1f4f4fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7317b8aec6f750f664c0fd2c1f4f4fd");
            return;
        }
        Object[] objArr2 = {str, -1, -1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9c535b865f68fbce71de7336528c9b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9c535b865f68fbce71de7336528c9b0");
        } else {
            a(str, -1, -1, null, false);
        }
    }

    public final void a(String str, int i, int i2, GradientDrawable gradientDrawable, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), gradientDrawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "774a8dafc1c66a0984e437ef54fdee31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "774a8dafc1c66a0984e437ef54fdee31");
        } else if (b()) {
            if (TextUtils.isEmpty(str)) {
                this.q = getDefaultSlideBarColor();
            } else {
                this.q = str;
            }
            this.m = i;
            this.n = i2;
            this.r = gradientDrawable;
            this.s = z;
            a();
        }
    }

    public void setSlideBarWrapTitle(boolean z) {
        this.o = z;
    }

    public void setRatioForSlideBarWidth(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e2464d4d2f1ed4a7abde27ea5650db1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e2464d4d2f1ed4a7abde27ea5650db1");
        } else {
            this.p = d;
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a6214439dd587c4233eca12f381a6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a6214439dd587c4233eca12f381a6d");
        } else if (this.g == null || !(this.g.getShieldRow() instanceof TabShieldRow) || ((TabShieldRow) this.g.getShieldRow()).slideBarViewItem == null) {
            if (this.y) {
                this.c.removeView(this.d);
                this.d = new View(getContext());
                this.c.addView(this.d, new FrameLayout.LayoutParams(-2, aq.a(getContext(), 2.0f)));
                this.y = false;
            }
            if (TextUtils.isEmpty(this.q)) {
                this.q = "#FF6633";
            }
            if (this.m == -1) {
                this.d.getLayoutParams().width = a(this.k);
            } else {
                this.d.getLayoutParams().width = this.m;
            }
            if (this.n == -1) {
                this.d.getLayoutParams().height = aq.a(getContext(), 2.0f);
            } else {
                this.d.getLayoutParams().height = this.n;
            }
            if (this.r != null) {
                this.d.setBackground(this.r);
            } else {
                this.d.setBackgroundColor(Color.parseColor(this.q));
            }
            setSlideBarRounded(this.s);
            invalidate();
        }
    }

    @TargetApi(21)
    public void setSlideBarRounded(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4136e3e154febbdd2eadba4617d59ed7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4136e3e154febbdd2eadba4617d59ed7");
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            this.d.setOutlineProvider(new ViewOutlineProvider() { // from class: com.dianping.picassomodule.widget.tab.TabView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    Object[] objArr2 = {view, outline};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62f7fcfe8db0a90cb3f88d38daa8f007", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62f7fcfe8db0a90cb3f88d38daa8f007");
                    } else {
                        outline.setRoundRect(0, 0, TabView.this.d.getWidth(), TabView.this.d.getHeight(), TabView.this.d.getHeight() / 2);
                    }
                }
            });
            this.d.setClipToOutline(z);
        }
    }

    private int getSlideBarWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "427d5430173634e88dcb85b534cdc4a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "427d5430173634e88dcb85b534cdc4a7")).intValue();
        }
        if (this.y) {
            return this.d.getMeasuredWidth();
        }
        if (this.m != -1) {
            return this.m;
        }
        if (this.o) {
            View view = this.C.get(this.k);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() > 0) {
                    return viewGroup.getChildAt(0).getMeasuredWidth();
                }
            }
        }
        int a2 = a(this.k);
        return this.p != -1.0d ? (int) (a2 * this.p) : a2;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9eda2e92e0e279a6882507db4b89a61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9eda2e92e0e279a6882507db4b89a61");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        this.t = i;
        this.u = i2;
        this.b.setPadding(i, 0, i2, 0);
    }

    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f830f365a35f53c9629d1ebb694bd53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f830f365a35f53c9629d1ebb694bd53");
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i, 0, i3, 0);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dff6e25e2053a9f6f3a0dea34cebcfd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dff6e25e2053a9f6f3a0dea34cebcfd4");
            return;
        }
        super.onOverScrolled(i, i2, z, z2);
        ScrollDirection scrollDirection = this.z > i ? ScrollDirection.RIGHT : ScrollDirection.LEFT;
        Object[] objArr2 = {scrollDirection, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a8cc3fb597204fbb6386a14b7310f19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a8cc3fb597204fbb6386a14b7310f19");
        } else {
            com.dianping.picassomodule.utils.a.a(this.A, scrollDirection);
        }
        this.z = i;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c001b0600e570dc80520491fa6d120", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c001b0600e570dc80520491fa6d120");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.w == null || !this.w.needScrollEvent()) {
            return;
        }
        this.w.handleScrollEvent(i, i2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dfc7f88c695f19a8af16b166bd7ab53", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dfc7f88c695f19a8af16b166bd7ab53")).booleanValue();
        }
        if (this.w != null) {
            if (this.w.needDragEvent()) {
                this.w.handleEndDragByTouchEvent(motionEvent);
            }
            if (this.w.needMomentumEvent()) {
                this.w.handleMomentumScrollAndDragEndByEvent(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setScrollEventDispatcher(ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider) {
        Object[] objArr = {iEventDispatcherProvider};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92b5777792745e9231ffd7995ccd5174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92b5777792745e9231ffd7995ccd5174");
        } else {
            this.w.setEventDispatcher(iEventDispatcherProvider);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "240e15ff854b8bf14ac68b4b61726aba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "240e15ff854b8bf14ac68b4b61726aba")).booleanValue();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent && this.w != null) {
            if (this.x != null) {
                this.x.onViewDidIntercept(this, motionEvent);
            }
            this.w.handleBeginDrag();
        }
        return onInterceptTouchEvent;
    }

    public final void a(int i, g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6973cb90d798d897388f723167bff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6973cb90d798d897388f723167bff4");
        } else if (i < 0 || this.e == null || i >= this.e.a()) {
        } else {
            int i2 = this.k;
            a(i, 200, gVar);
            if (this.h != null) {
                if ((gVar != g.USER_SCROLL && gVar != g.USER_CLICK) || i == i2 || this.C.get(i) == null) {
                    return;
                }
                this.h.onTabClick(i, this.C.get(i), gVar);
            }
        }
    }

    public final void a(int i, final int i2, g gVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1289733e6209ef110ebad93a19679fe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1289733e6209ef110ebad93a19679fe4");
        } else if (this.e == null || i >= this.e.a()) {
        } else {
            this.e.a(i, gVar);
            this.k = i;
            post(new Runnable() { // from class: com.dianping.picassomodule.widget.tab.TabView.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43ca6cf6dce98965963df930746ad9ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43ca6cf6dce98965963df930746ad9ed");
                        return;
                    }
                    TabView.a(TabView.this, i2);
                    TabView.this.a(i2 != 0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "675f6b0566b2977e38cdd563f4e8ff04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "675f6b0566b2977e38cdd563f4e8ff04");
            return;
        }
        View view = this.C.get(this.k);
        View view2 = this.C.get(this.e.a() - 1);
        if (view2 == null || view == null) {
            return;
        }
        if (view2.getX() + ((float) view.getWidth()) > ((float) (this.v - this.u))) {
            int x = ((int) view.getX()) - getScrollX();
            int width = view.getWidth() + x;
            if (x == 0 && width == 0) {
                return;
            }
            int i = (x + width) / 2;
            int i2 = this.v / 2;
            if (z) {
                smoothScrollBy(i - i2, 0);
            } else {
                scrollBy(i - i2, 0);
            }
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99eb843bdb59e33c2cc60f7126ff9003", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99eb843bdb59e33c2cc60f7126ff9003")).intValue();
        }
        if (i < 0 || this.C.get(i) == null) {
            return -1;
        }
        if (this.e instanceof i) {
            return this.C.get(i).getLayoutParams().width;
        }
        return this.C.get(i).getMeasuredWidth();
    }

    private int b(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa5d57ea3d519d528df8538af8d0251", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa5d57ea3d519d528df8538af8d0251")).intValue();
        }
        for (Integer num : this.B) {
            int intValue = num.intValue();
            if (intValue < i) {
                i2 += a(intValue);
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTranslateX() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d90bc641f2a4aa47d09d0b4c0cbd20f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d90bc641f2a4aa47d09d0b4c0cbd20f6")).intValue();
        }
        int i2 = this.t;
        int i3 = this.l;
        int i4 = this.k;
        Object[] objArr2 = {Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73496515db78f1de893d8e686f2da460", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73496515db78f1de893d8e686f2da460")).intValue();
        } else {
            for (Integer num : this.B) {
                if (num.intValue() < i4) {
                    i++;
                }
            }
        }
        int b = i2 + (i3 * i) + b(this.k);
        return getSlideBarWidth() != -1 ? b + ((a(this.k) - getSlideBarWidth()) / 2) : b;
    }

    public void setTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d2fbf1ae24a53a7393f67e397dd81e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d2fbf1ae24a53a7393f67e397dd81e");
            return;
        }
        if (this.e instanceof i) {
            ((i) this.e).b(i);
        }
        invalidate();
    }

    public void setTabHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d419da45975cf814f7de26d707d8cd1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d419da45975cf814f7de26d707d8cd1f");
        } else {
            this.b.getLayoutParams().height = i;
        }
    }

    public void setTabShieldRow(TabShieldRow tabShieldRow) {
        Object[] objArr = {tabShieldRow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67a2418e7a5678bc842b95c703093db3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67a2418e7a5678bc842b95c703093db3");
            return;
        }
        setTabPosition(tabShieldRow);
        this.x = tabShieldRow.onDidInterceptTouchListener;
        this.w.setEventDispatcher(tabShieldRow.scrollEventDispatcherProvider);
        if (this.g == null) {
            this.g = new ContainerDataSource();
        }
        this.B = tabShieldRow.displayIndexList;
        this.g.setShieldRow(tabShieldRow);
        if (tabShieldRow.viewItems.size() > 0) {
            if (this.e == null || !(this.e instanceof j)) {
                this.e = new j(null, getContext());
            }
            this.g.setContext(getContext());
            this.g.setParentView(this);
            ((j) this.e).d = this.g;
            a(this.e, tabShieldRow.xGap);
            return;
        }
        setTabTitles(tabShieldRow.tabTitleInfo);
    }

    private void a(f fVar, int i) {
        Object[] objArr = {fVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2dfd1750d99922a5b1e47da57f80fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2dfd1750d99922a5b1e47da57f80fa");
            return;
        }
        this.l = i;
        this.e = fVar;
        this.b.removeAllViews();
        this.C = new SparseArray<>();
        for (int i2 = 0; i2 < fVar.a(); i2++) {
            View a2 = fVar.a(i2);
            if (this.B.contains(Integer.valueOf(i2))) {
                if (a2.getVisibility() == 8) {
                    a2.setVisibility(0);
                }
            } else if (a2.getVisibility() == 0) {
                a2.setVisibility(8);
            }
            this.b.addView(a2);
            this.C.put(i2, a2);
            if (i2 < fVar.a() - 1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a2.getLayoutParams();
                marginLayoutParams.rightMargin = i;
                a2.setLayoutParams(marginLayoutParams);
            }
            a2.setTag(Integer.valueOf(i2));
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassomodule.widget.tab.TabView.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86aed1e43e5a6004de41fffdcb9d274f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86aed1e43e5a6004de41fffdcb9d274f");
                    } else {
                        TabView.this.a(((Integer) view.getTag()).intValue(), g.USER_CLICK);
                    }
                }
            });
        }
        a();
    }

    public void setTabVisibility(List<Integer> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f10dff4585bfb464800c90bc9ac4cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f10dff4585bfb464800c90bc9ac4cd");
        } else if (this.e != null) {
            boolean z = (this.B == null || list.size() == this.B.size()) ? false : true;
            this.B = list;
            for (int i = 0; i < this.e.a(); i++) {
                if (this.B.contains(Integer.valueOf(i))) {
                    this.b.getChildAt(i).setVisibility(0);
                } else {
                    this.b.getChildAt(i).setVisibility(8);
                }
            }
            if (this.e instanceof i) {
                i iVar = (i) this.e;
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = i.c;
                if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "dec0857f7ce6a8afdf948f9fc0bf0d35", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "dec0857f7ce6a8afdf948f9fc0bf0d35");
                } else if (iVar.h && list.size() > 0) {
                    int a2 = (((com.dianping.util.j.a(iVar.d) - ((list.size() - 1) * iVar.e)) - iVar.f) - iVar.g) / list.size();
                    for (Integer num : list) {
                        int intValue = num.intValue();
                        if (iVar.q.size() > intValue) {
                            LinearLayout linearLayout = iVar.q.get(intValue).b;
                            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                            if (layoutParams.width != a2) {
                                layoutParams.width = a2;
                                linearLayout.setLayoutParams(layoutParams);
                            }
                        }
                    }
                }
            }
            if (this.k != -1 && this.B.contains(Integer.valueOf(this.k)) && !z) {
                a(this.k, g.AUTO);
            } else {
                a(((Integer) Collections.min(this.B)).intValue(), 0, g.AUTO);
            }
        }
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "057d869836d9bd5a02ae99d643c28975", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "057d869836d9bd5a02ae99d643c28975")).booleanValue() : this.d.getVisibility() == 0;
    }

    public void setOnTabClickListener(c cVar) {
        this.h = cVar;
    }

    @Override // com.dianping.shield.node.adapter.status.IElementContainerExpose
    public void setViewLocationProcessors(@NonNull ArrayList<ViewLocationChangeProcessor<?>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17039db96b0a8314f87ae86a848c9994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17039db96b0a8314f87ae86a848c9994");
        } else if (this.A != null) {
            this.A.removeAllViewLocationProcessors();
            Iterator<ViewLocationChangeProcessor<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                this.A.addAttStatusManager(it.next());
            }
        }
    }

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setTabs(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f18beada59a2d50cf626a294a6c64a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f18beada59a2d50cf626a294a6c64a9");
            return;
        }
        h hVar = new h();
        hVar.e = Arrays.asList(strArr);
        hVar.c = aq.b(getContext(), this.t);
        hVar.d = aq.b(getContext(), this.u);
        hVar.b = 0;
        setTabTitles(hVar);
    }

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setSelected(int i, g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1390b7b96311095337b29a0f20c13be3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1390b7b96311095337b29a0f20c13be3");
        } else {
            a(i, gVar);
        }
    }

    @Override // com.dianping.shield.components.AbstractTabInterface
    public void setOnTabClickedListener(AbstractTabInterface.OnTabClickedListener onTabClickedListener) {
        Object[] objArr = {onTabClickedListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbfdf2474c1ae72656d4011b5aeb67fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbfdf2474c1ae72656d4011b5aeb67fe");
            return;
        }
        this.j = onTabClickedListener;
        setOnTabClickListener(new c() { // from class: com.dianping.picassomodule.widget.tab.TabView.5
            public static ChangeQuickRedirect a;

            @Override // com.dianping.picassomodule.widget.tab.c
            public final void onTabClick(int i, View view, g gVar) {
                Object[] objArr2 = {Integer.valueOf(i), view, gVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bc6aeb955e1ff06a81e2d13fbca989f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bc6aeb955e1ff06a81e2d13fbca989f");
                } else if (TabView.this.j != null) {
                    TabView.this.j.onTabClicked(i, view);
                }
            }
        });
    }

    public void setOnLayoutListener(b bVar) {
        if (bVar != null) {
            this.i = bVar;
        }
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getElementChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60e541054a3ad17b52d062848e8af70c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60e541054a3ad17b52d062848e8af70c")).intValue() : this.b.getChildCount();
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public View getElementChildView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f08ae1e512a6ddf64a62388dee67f98", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f08ae1e512a6ddf64a62388dee67f98") : this.b.getChildAt(i);
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public Rect getContainerEdgeRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad9d4e671b168b48d1a8aaaaeeb336aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad9d4e671b168b48d1a8aaaaeeb336aa");
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = iArr[0] + getWidth();
        rect.bottom = iArr[1] + getHeight();
        return rect;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerStatusInterface
    public void onAppear(@NotNull final ScrollDirection scrollDirection, @Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c87dbd95e75a4985acaad1cacdbafb09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c87dbd95e75a4985acaad1cacdbafb09");
        } else {
            post(new Runnable() { // from class: com.dianping.picassomodule.widget.tab.TabView.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01881e13b158607a9893f156625752e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01881e13b158607a9893f156625752e3");
                    } else {
                        com.dianping.picassomodule.utils.a.b(TabView.this.A, scrollDirection);
                    }
                }
            });
        }
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerStatusInterface
    public void onDisappear(@NotNull ScrollDirection scrollDirection, @Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4adf4d40423eed02b41780ee8f52f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4adf4d40423eed02b41780ee8f52f2f");
        } else {
            com.dianping.picassomodule.utils.a.c(this.A, scrollDirection);
        }
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e67bbc6870f4c9676e751672d255e173", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e67bbc6870f4c9676e751672d255e173")).intValue() : getHeight();
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalHorizontalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25704cbc65cd257751524b53f812be4a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25704cbc65cd257751524b53f812be4a")).intValue();
        }
        if (this.c != null) {
            return this.c.getWidth();
        }
        return 0;
    }

    private void setTabPosition(TabShieldRow tabShieldRow) {
        Object[] objArr = {tabShieldRow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c9e592c6d4f4db1d12eab5be0be96e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c9e592c6d4f4db1d12eab5be0be96e0");
            return;
        }
        int i = tabShieldRow.marginTop + tabShieldRow.extraMarginTop;
        int i2 = tabShieldRow.marginBottom + tabShieldRow.extraMarginBottom;
        this.c.getLayoutParams().height = tabShieldRow.tabTotalHeight;
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = i2;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        if (tabShieldRow.slideBarTheme != null) {
            layoutParams2.bottomMargin = i2 - tabShieldRow.slideBarTheme.h;
        } else {
            layoutParams2.bottomMargin = i2;
        }
        this.d.setLayoutParams(layoutParams2);
        if (tabShieldRow.slideBarTheme != null && !tabShieldRow.slideBarTheme.g) {
            this.c.updateView(this.d, -100);
        } else {
            this.c.updateView(this.d, 100);
        }
    }

    public void setTabTitles(h hVar) {
        int i;
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65522c341e419c050f555bf0ad65575c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65522c341e419c050f555bf0ad65575c");
        } else if (hVar.e == null || hVar.e.size() == 0) {
        } else {
            this.o = hVar.h;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            this.p = PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "3e74076b631a08b7f60481d6dd28be3c", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "3e74076b631a08b7f60481d6dd28be3c")).doubleValue() : hVar.i.doubleValue();
            if (this.f == null) {
                this.f = new i(getContext(), hVar);
            }
            i iVar = this.f;
            Object[] objArr3 = {hVar};
            ChangeQuickRedirect changeQuickRedirect3 = i.c;
            if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "41071dc1f3fcc2ebc7816aa4f172cd94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "41071dc1f3fcc2ebc7816aa4f172cd94");
            } else if (hVar != null) {
                iVar.a(hVar.e);
                iVar.r.addAll(iVar.q);
                iVar.q.clear();
                iVar.e = com.dianping.util.j.a(iVar.d, hVar.b);
                iVar.g = com.dianping.util.j.a(iVar.d, hVar.d);
                iVar.f = com.dianping.util.j.a(iVar.d, hVar.c);
                if (hVar.n != null && hVar.n.startsWith("#")) {
                    iVar.m = hVar.n;
                } else {
                    iVar.m = "#333333";
                }
                if (hVar.o != null && hVar.o.startsWith("#")) {
                    iVar.n = hVar.o;
                } else {
                    iVar.n = "#FF6633";
                }
                iVar.i = hVar.j == 0 ? 14 : hVar.j;
                if (hVar.k == 0) {
                    i = iVar.i;
                } else {
                    i = hVar.k;
                }
                iVar.j = i;
                iVar.k = hVar.l == 0 ? 0 : hVar.l;
                iVar.l = hVar.m == 0 ? 0 : hVar.m;
                iVar.o = com.dianping.util.j.a(iVar.d, hVar.f == 0 ? 45.0f : hVar.f);
                iVar.p = com.dianping.util.j.a(iVar.d, hVar.g);
                if (iVar.p == 0) {
                    iVar.h = true;
                    int a2 = iVar.a();
                    if (hVar.p != null) {
                        a2 = hVar.p.size();
                    }
                    if (a2 > 0) {
                        iVar.p = (((com.dianping.util.j.a(iVar.d) - ((a2 - 1) * iVar.e)) - iVar.f) - iVar.g) / a2;
                    }
                } else {
                    iVar.h = false;
                }
            }
            a(this.f, aq.a(getContext(), hVar.b));
        }
    }
}
