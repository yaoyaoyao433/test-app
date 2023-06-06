package com.sankuai.waimai.store.drug.newwidgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.log.a;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.waimai.store.util.ap;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PrioritySmoothNestedScrollView extends SmoothNestedScrollView implements e {
    public static ChangeQuickRedirect a;
    private String b;
    private final ap<View> c;
    private final int[] d;
    private final ap<View> e;
    private int f;
    private final List<Object> k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;

    public void setNestedScrollEnabled(boolean z) {
        this.n = z;
    }

    public PrioritySmoothNestedScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5e04622c1ae53fe1b81416924bff2dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5e04622c1ae53fe1b81416924bff2dd");
            return;
        }
        this.b = "FlingScrollView";
        this.c = new ap<>();
        this.d = new int[2];
        this.e = new ap<>();
        this.k = new ArrayList();
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = false;
    }

    public PrioritySmoothNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a9ace5451bad47df2ede234a53ba2e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a9ace5451bad47df2ede234a53ba2e7");
            return;
        }
        this.b = "FlingScrollView";
        this.c = new ap<>();
        this.d = new int[2];
        this.e = new ap<>();
        this.k = new ArrayList();
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = false;
    }

    public PrioritySmoothNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4949ea72262cf631f91b00b32bf07e2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4949ea72262cf631f91b00b32bf07e2f");
            return;
        }
        this.b = "FlingScrollView";
        this.c = new ap<>();
        this.d = new int[2];
        this.e = new ap<>();
        this.k = new ArrayList();
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = false;
    }

    public void setIsVertical(boolean z) {
        this.l = z;
    }

    public void setIsFlowerType(boolean z) {
        this.o = z;
    }

    public void setSubCategoryHeight(int i) {
        this.p = i;
    }

    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ba8351c7c7fc1bd6d89ae71956209f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ba8351c7c7fc1bd6d89ae71956209f");
            return;
        }
        this.c.a(view);
        this.f = i;
    }

    public void setMatchSizeChild(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be13c5a470876cf3fcfd010d39a4bfa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be13c5a470876cf3fcfd010d39a4bfa8");
        } else {
            a(view, 0);
        }
    }

    public int getChildSizeOffset() {
        return this.f;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84bc50c7bf4b3a1309e87d784f58dcf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84bc50c7bf4b3a1309e87d784f58dcf1");
            return;
        }
        View a2 = this.c.a();
        if (a2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i4 = marginLayoutParams.leftMargin;
            i3 = marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
            i4 = 0;
        }
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = getDefaultSize(getSuggestedMinimumHeight(), i2);
        int i5 = (defaultSize - i4) - i3;
        int childSizeOffset = defaultSize2 - getChildSizeOffset();
        Object[] objArr2 = {a2, Integer.valueOf(i5), Integer.valueOf(childSizeOffset)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7bd48eff762e04ad3a07941244132264", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7bd48eff762e04ad3a07941244132264")).booleanValue();
        } else {
            ViewGroup.LayoutParams layoutParams2 = a2.getLayoutParams();
            if (layoutParams2 != null) {
                if (i5 != 0) {
                    layoutParams2.width = i5;
                }
                if (childSizeOffset != 0) {
                    layoutParams2.height = childSizeOffset;
                }
                a2.setLayoutParams(layoutParams2);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), View.MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824));
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a624c28f1f9f2186db79f4328c316401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a624c28f1f9f2186db79f4328c316401");
        } else if (this.n) {
            super.onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7547056f9c6a5046f8321946030e959", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7547056f9c6a5046f8321946030e959")).booleanValue();
        }
        this.h.a();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1f410d8ed28355b7dc1f8b32eae10aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1f410d8ed28355b7dc1f8b32eae10aa")).booleanValue();
        }
        if (this.l && (i & 2) == 0) {
            return false;
        }
        View a2 = this.e.a();
        if (a2 == null || a2 == view2) {
            this.e.a(view2);
            return super.onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121d6dce201d508b30070e51e6053325", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121d6dce201d508b30070e51e6053325");
            return;
        }
        super.onStopNestedScroll(view);
        this.e.a(null);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f5f86b4d8dd42cea827b83ff5004b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f5f86b4d8dd42cea827b83ff5004b3c");
            return;
        }
        a.a(this.b, "onNestedPreScroll, dx = %d, dy = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == 0) {
            super.onNestedPreScroll(view, i, i2, iArr);
            return;
        }
        if (i2 > 0) {
            a(view, i, i2, iArr, true);
        } else if (this.o && this.p > 0) {
            a(view, i, i2, iArr, false);
        } else {
            super.onNestedPreScroll(view, i, i2, iArr);
        }
    }

    private void a(View view, int i, int i2, int[] iArr, boolean z) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28676aea6b4f1e8658e4fb7454eb3911", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28676aea6b4f1e8658e4fb7454eb3911");
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90b36de5de7b27a2195c539bc5dafc6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90b36de5de7b27a2195c539bc5dafc6d");
            return;
        }
        this.d[0] = 0;
        this.d[1] = 0;
        super.onNestedPreScroll(view, i, i2, this.d);
        iArr[0] = iArr[0] + this.d[0];
        iArr[1] = iArr[1] + this.d[1];
    }

    private int a(int i, int i2) {
        int b;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6839d151770155f851934c06ac7b374b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6839d151770155f851934c06ac7b374b")).intValue();
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd29ba02fdf23be355b8fa66ae6e362d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd29ba02fdf23be355b8fa66ae6e362d")).intValue();
        }
        if (i == 0 || !this.q || (computeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent()) == 0) {
            return 0;
        }
        return a(i, computeVerticalScrollRange - this.p);
    }

    private void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01a70b0bb0290b2dd981c5873e2fdc3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01a70b0bb0290b2dd981c5873e2fdc3f");
        } else {
            a.a(this.b, "onConsumeScrollBy, dy = %d, consumed = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, com.sankuai.waimai.store.widgets.smoothnestedscroll.core.e
    public final void a(View view, int i, int i2, int i3, int i4, final c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b8a4943239878917cd3e9f49e83758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b8a4943239878917cd3e9f49e83758");
            return;
        }
        boolean z = i4 > 0;
        a.a(this.b, "onSmoothPreFling, scrollUp = %s, vy = %d", Boolean.valueOf(z), Integer.valueOf(i4));
        if (z) {
            b(view, i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.store.drug.newwidgets.PrioritySmoothNestedScrollView.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c
                public final void a(View view2, int i5, int i6, int i7, int i8) {
                    Object[] objArr2 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e70f0c5aa811976f7be6c86c2e3df91", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e70f0c5aa811976f7be6c86c2e3df91");
                        return;
                    }
                    a.a(PrioritySmoothNestedScrollView.this.b, "onSmoothPreFling dispatch complete, scrollUp = %s, remain vy = %d", Boolean.TRUE, Integer.valueOf(i8));
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eda590f71ec0b9c6b24cf8348dec1be9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eda590f71ec0b9c6b24cf8348dec1be9");
        } else if (this.n) {
            boolean z = i4 < 0;
            a.a(this.b, "onSmoothFling, scrollDown = %s, vy = %d", Boolean.valueOf(z), Integer.valueOf(i4));
            if (z) {
                if (i3 == 0 && i4 == 0) {
                    setSmoothNestedScrollState(0);
                } else {
                    setSmoothNestedScrollState(2);
                }
                this.h.a(i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.store.drug.newwidgets.PrioritySmoothNestedScrollView.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.c
                    public final void a(View view2, int i5, int i6, int i7, int i8) {
                        Object[] objArr2 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3d9f3f071013fe064e016887c102430", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3d9f3f071013fe064e016887c102430");
                            return;
                        }
                        a.a(PrioritySmoothNestedScrollView.this.b, "onSmoothFling self complete, scrollDown = %s, remain vy = %d", Boolean.TRUE, Integer.valueOf(i8));
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891c47ad424e48b67e76d4346c68ec9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891c47ad424e48b67e76d4346c68ec9d");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        Iterator<Object> it = this.k.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.view.View
    @NotNull
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99c6bc8e74a86925bbcd39ed979d3e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99c6bc8e74a86925bbcd39ed979d3e7");
        }
        return this.b + " @ " + hashCode();
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "552a3731274097f24fce44d7c161ccb6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "552a3731274097f24fce44d7c161ccb6")).booleanValue();
        }
        if (this.m) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd2eb55c263ab7b82891f826a08e5e08", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd2eb55c263ab7b82891f826a08e5e08")).booleanValue();
        }
        if (this.m) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setForbidScroll(boolean z) {
        this.m = z;
    }
}
