package com.dianping.picassomodule.widget.scroll;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.AttachStatusCollection;
import com.dianping.shield.node.adapter.ViewLocationChangeProcessor;
import com.dianping.shield.node.adapter.hotzone.HotZoneLocation;
import com.dianping.shield.node.adapter.status.IElementContainerExpose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PagerView extends FrameLayout implements ComponentScrollEventHelper.IScrollRange, IElementContainerExpose {
    public static ChangeQuickRedirect a;
    private DirectionalViewPager b;
    private com.dianping.picassomodule.widget.scroll.b c;
    private c d;
    private d e;
    private ArrayList<Integer> f;
    private boolean g;
    private ComponentScrollEventHelper h;
    private int i;
    private int j;
    private PMPagerAdapter k;
    private int l;
    private boolean m;
    private AttachStatusCollection n;
    private SparseArray<LinearLayout> o;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public View e;
        public View f;
        public int g;
        public boolean h;
        public int i;
        int j;
        int k;
        int l;
        int m;
        int n;
        int o;
        int p;
        int q;
        int r;
        public f s;
        public e t;
        public ComponentScrollEventHelper.IEventDispatcherProvider u;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface d {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface e {
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getContainerSpanCount() {
        return 1;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getElementChildLayoutPosition(@NotNull View view) {
        return -1;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    public int getElementChildCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "985cc0de732bfc8546c66980320091ce", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "985cc0de732bfc8546c66980320091ce")).intValue() : this.k.e;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public View getElementChildView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db6380148375f616add579c443030161", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db6380148375f616add579c443030161");
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c34e81e3c6b7ff55d7816a0edc195c87", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c34e81e3c6b7ff55d7816a0edc195c87");
        }
        int i2 = i / this.k.f;
        int i3 = (i - (this.k.f * i2)) / this.k.c;
        int i4 = (i - (this.k.f * i2)) / this.k.d;
        View childAt = getChildAt(0);
        View view = null;
        if (childAt instanceof WrapContentViewPager) {
            WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) childAt;
            if (i2 == wrapContentViewPager.getCurrentItem()) {
                view = a(a(findViewWithTag("page" + wrapContentViewPager.getCurrentItem()), i3), i4);
            }
        }
        return view == null ? new View(getContext()) : view;
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerCommonInterface
    @NotNull
    public Rect getContainerEdgeRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c2c211c052049f0e4d3f79607b573d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c2c211c052049f0e4d3f79607b573d");
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

    private View a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1ca73feb205a391019a9a4455288fff", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1ca73feb205a391019a9a4455288fff");
        }
        if (view instanceof ViewGroup) {
            return ((ViewGroup) view).getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull ScrollDirection scrollDirection, @Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b8d8de4ebbf5c4631d05b5b61013a0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b8d8de4ebbf5c4631d05b5b61013a0c");
        } else {
            com.dianping.picassomodule.utils.a.a(this.n, scrollDirection, this.m ? HotZoneLocation.ScrollOrientation.VERTICAL : HotZoneLocation.ScrollOrientation.HORIZONTAL);
        }
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerStatusInterface
    public void onAppear(@NotNull final ScrollDirection scrollDirection, @Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "580a2f895372e26a467e3d333e8bdb54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "580a2f895372e26a467e3d333e8bdb54");
        } else {
            post(new Runnable() { // from class: com.dianping.picassomodule.widget.scroll.PagerView.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26b5b579a70147497b9689d76c050f40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26b5b579a70147497b9689d76c050f40");
                    } else {
                        com.dianping.picassomodule.utils.a.b(PagerView.this.n, scrollDirection);
                    }
                }
            });
        }
    }

    @Override // com.dianping.shield.node.adapter.status.ElementContainerStatusInterface
    public void onDisappear(@NotNull ScrollDirection scrollDirection, @Nullable Object obj) {
        Object[] objArr = {scrollDirection, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c3163f58d182c2043e3723b7306f85f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c3163f58d182c2043e3723b7306f85f");
        } else {
            com.dianping.picassomodule.utils.a.c(this.n, scrollDirection);
        }
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d733b5151667f015029a7112e69c8e6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d733b5151667f015029a7112e69c8e6b")).intValue();
        }
        int height = this.b.getHeight();
        return this.m ? height * getPageCount() : height;
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalHorizontalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56d9624a9305f1d3f191c07c7434249a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56d9624a9305f1d3f191c07c7434249a")).intValue();
        }
        int width = this.b.getWidth();
        return !this.m ? width * getPageCount() : width;
    }

    public PagerView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ded88278bcb2bf0c26d427d20a87afeb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ded88278bcb2bf0c26d427d20a87afeb");
        }
    }

    private PagerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8520c5f81962f58839399962080a1b6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8520c5f81962f58839399962080a1b6d");
        }
    }

    public PagerView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885e0f0b0c1d62d9d9751aa07e37dca4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885e0f0b0c1d62d9d9751aa07e37dca4");
            return;
        }
        this.f = new ArrayList<>();
        this.l = -1;
        this.o = new SparseArray<>();
        setClipChildren(false);
        this.h = new ComponentScrollEventHelper(context, this, this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4752998fa7e83f188cfea1ae0047a02d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4752998fa7e83f188cfea1ae0047a02d");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        a(ScrollDirection.STATIC, (Object) null);
    }

    public void setBuilder(@NonNull a aVar) {
        final int i;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd520e49a43256bd043620ee6d16898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd520e49a43256bd043620ee6d16898");
            return;
        }
        int i2 = aVar.a;
        int i3 = aVar.b;
        f fVar = aVar.s;
        e eVar = aVar.t;
        boolean z = aVar.c;
        View view = aVar.e;
        View view2 = aVar.f;
        int i4 = aVar.g;
        boolean z2 = aVar.d;
        this.m = z2;
        ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider = aVar.u;
        int i5 = i2 <= 0 ? 1 : i2;
        int i6 = i3 <= 0 ? 1 : i3;
        if (fVar == null) {
            throw new IllegalArgumentException("ViewProvider cannot be null");
        }
        if (z && fVar.a() > i5 * i6) {
            this.b = new LoopViewPager(getContext());
        } else if (view != null) {
            this.b = new BouncyViewPager(getContext());
            BouncyViewPager bouncyViewPager = (BouncyViewPager) this.b;
            Object[] objArr2 = {view, view2, Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = BouncyViewPager.a;
            if (PatchProxy.isSupport(objArr2, bouncyViewPager, changeQuickRedirect2, false, "e9233cdec7d68609c576ee139817a411", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bouncyViewPager, changeQuickRedirect2, false, "e9233cdec7d68609c576ee139817a411");
            } else {
                bouncyViewPager.c = view;
                bouncyViewPager.d = view2;
                bouncyViewPager.e = i4;
                bouncyViewPager.b = new LinearLayout(bouncyViewPager.getContext());
                if (bouncyViewPager.c != null) {
                    if (bouncyViewPager.c.getParent() != null) {
                        ((ViewGroup) bouncyViewPager.c.getParent()).removeView(bouncyViewPager.c);
                    }
                    bouncyViewPager.b.addView(bouncyViewPager.c);
                }
            }
            ((BouncyViewPager) this.b).setOnTriggerStatusChangeListener(eVar);
        } else {
            this.b = new WrapContentViewPager(getContext());
        }
        this.b.setVertical(z2);
        this.h.setEventDispatcher(iEventDispatcherProvider);
        this.b.setScrollEventHandler(this.h);
        removeAllViews();
        addView(this.b);
        setMargin(aVar.j, aVar.k, aVar.l, aVar.m);
        int i7 = aVar.o;
        int i8 = aVar.p;
        int i9 = aVar.q;
        int i10 = aVar.r;
        Object[] objArr3 = {Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        int i11 = i5;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "041fa643faf55a1b78a72470e28703ff", RobustBitConfig.DEFAULT_VALUE)) {
            i = 0;
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "041fa643faf55a1b78a72470e28703ff");
        } else {
            i = 0;
            if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) getLayoutParams()).setMargins(i7, i8, i9, i10);
            }
        }
        if (aVar.h) {
            this.b.setPageMargin(aVar.i);
        } else {
            this.b.setPageMargin(aVar.j + aVar.j);
        }
        this.k = new PMPagerAdapter(i11, i6, fVar);
        this.b.setAdapter(this.k);
        if (aVar.n < fVar.a()) {
            i = aVar.n;
        }
        this.b.setCurrentItem(i);
        this.n = new AttachStatusCollection();
        this.n.setElementContainerCommonFeature(this);
        post(new Runnable() { // from class: com.dianping.picassomodule.widget.scroll.PagerView.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2a4c05dd495300210bb5b59965db977a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2a4c05dd495300210bb5b59965db977a");
                    return;
                }
                if (PagerView.this.l == -1 && PagerView.this.d != null) {
                    c unused = PagerView.this.d;
                    PagerView.this.l = 0;
                }
                if (!PagerView.this.g || PagerView.this.f == null || PagerView.this.f.get(i) == null) {
                    return;
                }
                PagerView.this.setPagerHeight(((Integer) PagerView.this.f.get(i)).intValue());
            }
        });
    }

    private void setMargin(int... iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e61654969907f98c5f0e387966e98c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e61654969907f98c5f0e387966e98c07");
        } else if (iArr == null || iArr.length != 4) {
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            marginLayoutParams.leftMargin = iArr[0];
            marginLayoutParams.topMargin = iArr[1];
            marginLayoutParams.rightMargin = iArr[2];
            marginLayoutParams.bottomMargin = iArr[3];
            this.b.setLayoutParams(marginLayoutParams);
            this.b.setClipChildren(false);
            this.b.setOffscreenPageLimit(2);
        }
    }

    public void setPagerAutoHeight(boolean z) {
        this.g = z;
    }

    public void setUserScrollEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f61a341fa49aa30156d4973b0497793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f61a341fa49aa30156d4973b0497793");
        } else if (this.b instanceof WrapContentViewPager) {
            ((WrapContentViewPager) this.b).setUserScrollEnabled(z);
        }
    }

    public int getPageCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ec5f9d3366a93ae00e6fcfaafeec1b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ec5f9d3366a93ae00e6fcfaafeec1b1")).intValue();
        }
        if (this.k == null) {
            return 0;
        }
        return this.k.h;
    }

    public void setOnItemClickListener(com.dianping.picassomodule.widget.scroll.b bVar) {
        this.c = bVar;
    }

    public void setOnBouncyBackListener(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd10527580799f9715f74bf52006268", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd10527580799f9715f74bf52006268");
        } else if (this.b instanceof BouncyViewPager) {
            ((BouncyViewPager) this.b).setOnBouncyBackListener(bVar);
        }
    }

    public void setHeightList(@NonNull List<Integer> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e76923cae95b4f80849e2335c3c97aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e76923cae95b4f80849e2335c3c97aa6");
        } else if (this.f != null) {
            this.f.clear();
            this.f.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPagerHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf91e79f62636db63d79ae81a4b5a22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf91e79f62636db63d79ae81a4b5a22");
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.height = i;
            requestLayout();
        }
    }

    public void setOnPagerHeightChangListener(d dVar) {
        this.e = dVar;
    }

    public void setOnPageSelectedListener(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f1e6d1249a3de5f145654cad6a3054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f1e6d1249a3de5f145654cad6a3054");
            return;
        }
        this.d = cVar;
        this.b.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.dianping.picassomodule.widget.scroll.PagerView.3
            public static ChangeQuickRedirect a;
            private int c = -1;
            private int d = -1;
            private boolean e = true;

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                this.c = i;
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69974bb9f2cf5aa3cf12c2f836b3f9eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69974bb9f2cf5aa3cf12c2f836b3f9eb");
                    return;
                }
                if (f != 0.0f) {
                    this.e = this.d < i2;
                }
                this.d = i2;
                super.onPageScrolled(i, f, i2);
                if (PagerView.this.h != null && PagerView.this.h.needScrollEvent()) {
                    PagerView.this.h.handleScrollEvent(PagerView.this.m ? 0 : PagerView.this.b.getScrollX(), PagerView.this.m ? PagerView.this.b.getScrollX() : 0);
                }
                if (!PagerView.this.g || i == PagerView.this.f.size() - 1 || PagerView.this.f.size() == 0) {
                    return;
                }
                float intValue = ((Integer) (((Integer) PagerView.this.f.get(i)).intValue() == 0 ? PagerView.this.f.get(0) : PagerView.this.f.get(i))).intValue() * (1.0f - f);
                int i3 = i + 1;
                PagerView.this.setPagerHeight((int) (intValue + (((Integer) (((Integer) PagerView.this.f.get(i3)).intValue() == 0 ? PagerView.this.f.get(0) : PagerView.this.f.get(i3))).intValue() * f)));
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9a72cd9535940c22b01f78b911f2135", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9a72cd9535940c22b01f78b911f2135");
                    return;
                }
                if (i == 0 && this.c >= 0) {
                    if (PagerView.this.d != null && PagerView.this.k != null && this.c < PagerView.this.k.h) {
                        c unused = PagerView.this.d;
                    }
                    PagerView.this.a(this.e ? PagerView.this.m ? ScrollDirection.UP : ScrollDirection.LEFT : PagerView.this.m ? ScrollDirection.DOWN : ScrollDirection.RIGHT, (Object) null);
                    PagerView.this.l = this.c;
                    this.c = -1;
                }
                if (i == 1 && PagerView.this.h != null && PagerView.this.h.needDragEvent()) {
                    PagerView.this.h.handleBeginDrag();
                }
            }
        });
    }

    @Override // com.dianping.shield.node.adapter.status.IElementContainerExpose
    public void setViewLocationProcessors(@NonNull ArrayList<ViewLocationChangeProcessor<?>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5712ebed47d51a8e2e95c965c7c65b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5712ebed47d51a8e2e95c965c7c65b45");
        } else if (this.n != null) {
            this.n.removeAllViewLocationProcessors();
            Iterator<ViewLocationChangeProcessor<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                this.n.addAttStatusManager(it.next());
            }
        }
    }

    public void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02faa6b0d461a3bcf8e2884924480803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02faa6b0d461a3bcf8e2884924480803");
        } else {
            this.b.setCurrentItem(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class PMPagerAdapter extends PagerAdapter {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;
        private int e;
        private int f;
        private f g;
        private int h;

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public PMPagerAdapter(int i, int i2, f fVar) {
            Object[] objArr = {PagerView.this, Integer.valueOf(i), Integer.valueOf(i2), fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d049a66a1cc9eeb7b340defc569921a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d049a66a1cc9eeb7b340defc569921a");
                return;
            }
            this.d = i;
            this.c = i2;
            this.f = i * i2;
            this.e = fVar.a();
            this.g = fVar;
            this.h = this.e % this.f == 0 ? this.e / this.f : (this.e / this.f) + 1;
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            return this.h;
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8df56c2d91fded9604aeb3e2e6cdbc3", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8df56c2d91fded9604aeb3e2e6cdbc3");
            }
            LinearLayout linearLayout = (LinearLayout) PagerView.this.o.get(i);
            PagerView.this.o.remove(i);
            if (linearLayout == null) {
                linearLayout = new LinearLayout(PagerView.this.getContext());
                linearLayout.setClipChildren(false);
                linearLayout.setClipToPadding(false);
                linearLayout.setOrientation(1);
                int i2 = this.f * i;
                for (int i3 = 0; i3 < this.d; i3++) {
                    LinearLayout linearLayout2 = new LinearLayout(PagerView.this.getContext());
                    linearLayout2.setClipChildren(false);
                    linearLayout2.setClipToPadding(false);
                    linearLayout2.setOrientation(0);
                    for (int i4 = 0; i4 < this.c; i4++) {
                        int i5 = (this.c * i3) + i2 + i4;
                        if (i5 < this.e) {
                            View a2 = this.g.a(i5);
                            a2.setTag(Integer.valueOf(i5));
                            a2.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassomodule.widget.scroll.PagerView.PMPagerAdapter.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr2 = {view};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8601b0d9aeb56e1983ee3f94d705a3a", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8601b0d9aeb56e1983ee3f94d705a3a");
                                    } else if (PagerView.this.c != null) {
                                        PagerView.this.c.onItemClick(view, ((Integer) view.getTag()).intValue());
                                    }
                                }
                            });
                            linearLayout2.addView(a2);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a2.getLayoutParams();
                            if (i4 < this.c - 1) {
                                marginLayoutParams.rightMargin = PagerView.this.i;
                            }
                            if (i3 < this.d - 1) {
                                marginLayoutParams.bottomMargin = PagerView.this.j;
                            }
                            a2.setLayoutParams(marginLayoutParams);
                        }
                    }
                    linearLayout.addView(linearLayout2);
                }
            }
            linearLayout.setTag("page" + i);
            viewGroup.addView(linearLayout);
            return linearLayout;
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81df5bb03920678043a662e720b1c4ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81df5bb03920678043a662e720b1c4ef");
                return;
            }
            viewGroup.removeView((View) obj);
            PagerView.this.o.put(i, (LinearLayout) obj);
        }
    }
}
