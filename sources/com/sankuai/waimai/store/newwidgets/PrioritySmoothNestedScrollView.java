package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.waimai.store.util.ap;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PrioritySmoothNestedScrollView extends SmoothNestedScrollView implements e {
    public static ChangeQuickRedirect d;
    private String a;
    private final ap<View> b;
    private final int[] c;
    public boolean e;
    public boolean f;
    private final ap<View> k;
    private int l;
    private final List<a> m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void c_(int i);
    }

    public void setNestedScrollEnabled(boolean z) {
        this.p = z;
    }

    public PrioritySmoothNestedScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d85dd9acc23b1519b7446a2deea991c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d85dd9acc23b1519b7446a2deea991c3");
            return;
        }
        this.a = "FlingScrollView";
        this.b = new ap<>();
        this.c = new int[2];
        this.k = new ap<>();
        this.m = new ArrayList();
        this.n = false;
        this.o = false;
        this.p = true;
        this.q = false;
    }

    public PrioritySmoothNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed9da3c9d849f4536b2fa439e3d43478", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed9da3c9d849f4536b2fa439e3d43478");
            return;
        }
        this.a = "FlingScrollView";
        this.b = new ap<>();
        this.c = new int[2];
        this.k = new ap<>();
        this.m = new ArrayList();
        this.n = false;
        this.o = false;
        this.p = true;
        this.q = false;
    }

    public PrioritySmoothNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38e2bf8de412f7765b54a08ea1a87c13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38e2bf8de412f7765b54a08ea1a87c13");
            return;
        }
        this.a = "FlingScrollView";
        this.b = new ap<>();
        this.c = new int[2];
        this.k = new ap<>();
        this.m = new ArrayList();
        this.n = false;
        this.o = false;
        this.p = true;
        this.q = false;
    }

    public void setIsVertical(boolean z) {
        this.n = z;
    }

    public void setIsFlowerType(boolean z) {
        this.q = z;
    }

    public void setSubCategoryHeight(int i) {
        this.r = i;
    }

    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae567b02e3802eaf1f25749c3861d192", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae567b02e3802eaf1f25749c3861d192");
            return;
        }
        this.b.a(view);
        this.l = i;
    }

    public void setMatchSizeChild(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0b32b28494e33fad340b2b39b147999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0b32b28494e33fad340b2b39b147999");
        } else {
            a(view, 0);
        }
    }

    public int getChildSizeOffset() {
        return this.l;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1874a58c0c8f85abe8a8f0ae75434a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1874a58c0c8f85abe8a8f0ae75434a1");
            return;
        }
        View a2 = this.b.a();
        if (a2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = getDefaultSize(getSuggestedMinimumHeight(), i2);
        int childSizeOffset = defaultSize2 - getChildSizeOffset();
        Object[] objArr2 = {a2, Integer.valueOf(defaultSize), Integer.valueOf(childSizeOffset)};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4cfc0a7f30bf1962d359ea6eb8ad561c", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4cfc0a7f30bf1962d359ea6eb8ad561c")).booleanValue();
        } else {
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            if (layoutParams != null) {
                if (defaultSize != 0) {
                    layoutParams.width = defaultSize;
                }
                if (childSizeOffset != 0) {
                    layoutParams.height = childSizeOffset;
                }
                a2.setLayoutParams(layoutParams);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), View.MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824));
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47a1a8d7cf56f66fdecc754ee46e3691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47a1a8d7cf56f66fdecc754ee46e3691");
        } else if (this.p) {
            super.onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e62d3c7adc1b3ccdad4cb6115a104e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e62d3c7adc1b3ccdad4cb6115a104e0")).booleanValue();
        }
        this.h.a();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "defe139d1a1d23a72fa9b8531ff2d0bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "defe139d1a1d23a72fa9b8531ff2d0bd")).booleanValue();
        }
        if (this.n && (i & 2) == 0) {
            return false;
        }
        View a2 = this.k.a();
        if (a2 == null || a2 == view2) {
            this.k.a(view2);
            return super.onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb9d7658ff46a2f6e32c1550afc5e74d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb9d7658ff46a2f6e32c1550afc5e74d");
            return;
        }
        super.onStopNestedScroll(view);
        this.k.a(null);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d08aa630da90bd1a5f35c890c5388aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d08aa630da90bd1a5f35c890c5388aa");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.a(this.a, "onNestedPreScroll, dx = %d, dy = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == 0) {
            super.onNestedPreScroll(view, i, i2, iArr);
            return;
        }
        if (i2 > 0) {
            a(view, i, i2, iArr, true);
        } else if (this.q && this.r > 0) {
            a(view, i, i2, iArr, false);
        } else {
            super.onNestedPreScroll(view, i, i2, iArr);
        }
    }

    private void a(View view, int i, int i2, int[] iArr, boolean z) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d94eb735f03b96f59aa9f0ed7ed3064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d94eb735f03b96f59aa9f0ed7ed3064");
            return;
        }
        a(view, i, i2, iArr);
        int i3 = i2 - iArr[1];
        if (i3 != 0) {
            iArr[1] = iArr[1] + (z ? a(i3, 0) : a(i3));
        }
    }

    private void a(View view, int i, int i2, int[] iArr) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8539c94dc2d84e5e9d8e03b0ee883717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8539c94dc2d84e5e9d8e03b0ee883717");
            return;
        }
        this.c[0] = 0;
        this.c[1] = 0;
        super.onNestedPreScroll(view, i, i2, this.c);
        iArr[0] = iArr[0] + this.c[0];
        iArr[1] = iArr[1] + this.c[1];
    }

    private int a(int i, int i2) {
        int b;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f50a75dd7ea4ba4787eddca80079f149", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f50a75dd7ea4ba4787eddca80079f149")).intValue();
        }
        if (i == 0) {
            return 0;
        }
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        if (computeVerticalScrollRange == 0 || (b = n.b(computeVerticalScrollOffset + i, i2, computeVerticalScrollRange)) == computeVerticalScrollOffset) {
            return 0;
        }
        scrollTo(0, b);
        int i3 = b - computeVerticalScrollOffset;
        a(computeVerticalScrollOffset, i, i3);
        return i3;
    }

    private int a(int i) {
        int computeVerticalScrollRange;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51b9eecd031814349e94f23996f6ba46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51b9eecd031814349e94f23996f6ba46")).intValue();
        }
        if (i == 0 || !this.e || (computeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent()) == 0) {
            return 0;
        }
        return a(i, computeVerticalScrollRange - this.r);
    }

    private void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b254e380325260647b84aa3c6ba63e35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b254e380325260647b84aa3c6ba63e35");
        } else {
            com.sankuai.shangou.stone.util.log.a.a(this.a, "onConsumeScrollBy, dy = %d, consumed = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e
    public final void a(View view, int i, int i2, int i3, int i4, final c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b066971412500864d4c0ec29a11721c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b066971412500864d4c0ec29a11721c");
            return;
        }
        boolean z = i4 > 0;
        com.sankuai.shangou.stone.util.log.a.a(this.a, "onSmoothPreFling, scrollUp = %s, vy = %d", Boolean.valueOf(z), Integer.valueOf(i4));
        if (z) {
            b(view, i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c
                public final void a(View view2, int i5, int i6, int i7, int i8) {
                    Object[] objArr2 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a723f1a605f39546fee1ef940f6f4cfa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a723f1a605f39546fee1ef940f6f4cfa");
                        return;
                    }
                    com.sankuai.shangou.stone.util.log.a.a(PrioritySmoothNestedScrollView.this.a, "onSmoothPreFling dispatch complete, scrollUp = %s, remain vy = %d", Boolean.TRUE, Integer.valueOf(i8));
                    PrioritySmoothNestedScrollView.this.h.a(i5, i6, i7, i8, cVar);
                }
            });
        } else {
            b(view, i, i2, i3, i4, cVar);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e
    public final void a_(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bc8866fc8b7e8383c7891e5de6feee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bc8866fc8b7e8383c7891e5de6feee5");
        } else if (this.p) {
            boolean z = i4 < 0;
            com.sankuai.shangou.stone.util.log.a.a(this.a, "onSmoothFling, scrollDown = %s, vy = %d", Boolean.valueOf(z), Integer.valueOf(i4));
            if (z) {
                if (i3 == 0 && i4 == 0) {
                    setSmoothNestedScrollState(0);
                } else {
                    setSmoothNestedScrollState(2);
                }
                this.h.a(i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c
                    public final void a(View view2, int i5, int i6, int i7, int i8) {
                        Object[] objArr2 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f173ff7174ad4591e2d9b7a3092221c6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f173ff7174ad4591e2d9b7a3092221c6");
                            return;
                        }
                        com.sankuai.shangou.stone.util.log.a.a(PrioritySmoothNestedScrollView.this.a, "onSmoothFling self complete, scrollDown = %s, remain vy = %d", Boolean.TRUE, Integer.valueOf(i8));
                        PrioritySmoothNestedScrollView.this.b(PrioritySmoothNestedScrollView.this, i5, i6, i7, i8);
                        PrioritySmoothNestedScrollView.this.setSmoothNestedScrollState(0);
                    }
                });
                return;
            }
            b(view, i, i2, i3, i4);
            setSmoothNestedScrollState(0);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, android.support.v4.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c80fafa1758be6d454c6f624019626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c80fafa1758be6d454c6f624019626");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        for (a aVar : this.m) {
            if (aVar != null) {
                aVar.c_(i2);
            }
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e185086598ff150acc3a60cd63da977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e185086598ff150acc3a60cd63da977");
        } else if (aVar == null || this.m.contains(aVar)) {
        } else {
            this.m.add(aVar);
        }
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82b17a9e8d786c430aee7bf65be363da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82b17a9e8d786c430aee7bf65be363da");
        } else if (this.m.contains(aVar)) {
            this.m.remove(aVar);
        }
    }

    @Override // android.view.View
    @NotNull
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b2176c0ab9b40d23dfdc060bac5444b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b2176c0ab9b40d23dfdc060bac5444b");
        }
        return this.a + " @ " + hashCode();
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc511ef779792c081e8ee5e518bad7bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc511ef779792c081e8ee5e518bad7bb")).booleanValue();
        }
        if (this.o) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052fd3b33705ad3297b71685931663dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052fd3b33705ad3297b71685931663dd")).booleanValue();
        }
        if (this.o) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setForbidScroll(boolean z) {
        this.o = z;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200bf0369bc73026dc60dc1da9665270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200bf0369bc73026dc60dc1da9665270");
        } else {
            a((Runnable) null);
        }
    }

    public final void a(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c0385bb424118278bb568ead07bfa95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c0385bb424118278bb568ead07bfa95");
        } else {
            post(new Runnable() { // from class: com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a993a49281713dd390ab479525f9b66", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a993a49281713dd390ab479525f9b66");
                        return;
                    }
                    PrioritySmoothNestedScrollView.this.scrollTo(0, UserCenter.TYPE_LOGOUT_NEGATIVE);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f79162edae71ee65b6d77c05937b3b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f79162edae71ee65b6d77c05937b3b6");
        } else {
            post(new Runnable() { // from class: com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9152d682d6c62ead948259f6eaecb86", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9152d682d6c62ead948259f6eaecb86");
                    } else {
                        PrioritySmoothNestedScrollView.this.scrollTo(0, -20000);
                    }
                }
            });
        }
    }
}
