package com.sankuai.waimai.store.search.ui.result.nestedheader;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.NestedScrollingChild2;
import android.support.v4.view.NestedScrollingChildHelper;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NestedCoordinatorLayout extends CoordinatorLayout implements NestedScrollingChild2 {
    public static ChangeQuickRedirect i;
    private NestedScrollingChildHelper j;

    public NestedCoordinatorLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e559018b459153f21f21f4a151ab36d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e559018b459153f21f21f4a151ab36d");
        }
    }

    public NestedCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0deda0cab7b804d6d1ebd4b7f147247a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0deda0cab7b804d6d1ebd4b7f147247a");
        }
    }

    public NestedCoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b8a2364febccdc9c81a3a98d798bdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b8a2364febccdc9c81a3a98d798bdc");
            return;
        }
        this.j = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        Object[] objArr = {view, view2, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b08e877e098bb950ffb58d63c7fca3cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b08e877e098bb950ffb58d63c7fca3cb")).booleanValue();
        }
        return startNestedScroll(i2, i3) || super.onStartNestedScroll(view, view2, i2, i3);
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {view, Integer.valueOf(i2), Integer.valueOf(i3), iArr, Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05541fb36fd3e49b6ce94568f259afc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05541fb36fd3e49b6ce94568f259afc6");
        } else if (i3 > 0) {
            Object[] objArr2 = {view, Integer.valueOf(i2), Integer.valueOf(i3), iArr, Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6a62df317e808861b0642d9157a02aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6a62df317e808861b0642d9157a02aa");
                return;
            }
            int[] iArr2 = new int[2];
            dispatchNestedPreScroll(i2, i3, iArr2, null, i4);
            super.onNestedPreScroll(view, i2 - iArr2[0], i3 - iArr2[1], iArr, i4);
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        } else {
            Object[] objArr3 = {view, Integer.valueOf(i2), Integer.valueOf(i3), iArr, Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect3 = i;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "72335603412a712c8711d475d6ccaf8e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "72335603412a712c8711d475d6ccaf8e");
                return;
            }
            int[] iArr3 = new int[2];
            super.onNestedPreScroll(view, i2, i3, iArr, i4);
            dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr3, null, i4);
            iArr[0] = iArr[0] + iArr3[0];
            iArr[1] = iArr[1] + iArr3[1];
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77dcfa9ee51a700bdf624fc864dfd713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77dcfa9ee51a700bdf624fc864dfd713");
            return;
        }
        super.onNestedScroll(view, i2, i3, i4, i5, i6);
        dispatchNestedScroll(i2, i3, i4, i5, null, i6);
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i2) {
        Object[] objArr = {view, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d586156f7eedd0549e3a98eb6521467", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d586156f7eedd0549e3a98eb6521467");
            return;
        }
        super.onStopNestedScroll(view, i2);
        stopNestedScroll(i2);
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4f85a499a6d2ab139fbeadb3d745f36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4f85a499a6d2ab139fbeadb3d745f36")).booleanValue();
        }
        return dispatchNestedPreFling(f, f2) || super.onNestedPreFling(view, f, f2);
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95e976e7ed2db30740165b99b1ff9330", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95e976e7ed2db30740165b99b1ff9330")).booleanValue();
        }
        return dispatchNestedFling(f, f2, z) || super.onNestedFling(view, f, f2, z);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9622e6d66b59925b32f20966de6daaee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9622e6d66b59925b32f20966de6daaee")).booleanValue() : this.j.isNestedScrollingEnabled();
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2289b839c235abce4535284bb458ee26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2289b839c235abce4535284bb458ee26");
        } else {
            this.j.setNestedScrollingEnabled(z);
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a11286649833b09d29d0a7c8ec17987", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a11286649833b09d29d0a7c8ec17987")).booleanValue() : this.j.hasNestedScrollingParent();
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b79adf0b0de6fa9b23e05d693a34346f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b79adf0b0de6fa9b23e05d693a34346f")).booleanValue() : this.j.hasNestedScrollingParent(i2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean startNestedScroll(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d431f244e6eba33a9c83fa44e15fc84", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d431f244e6eba33a9c83fa44e15fc84")).booleanValue() : this.j.startNestedScroll(i2);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean startNestedScroll(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b05d23ba2fff2a08ce33984ef071d9a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b05d23ba2fff2a08ce33984ef071d9a")).booleanValue() : this.j.startNestedScroll(i2, i3);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4fda3dd8fd81c1fdfed079acd9852d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4fda3dd8fd81c1fdfed079acd9852d8")).booleanValue() : this.j.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), iArr, iArr2, Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86afe397611ec2c04c6cc6f5676d367d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86afe397611ec2c04c6cc6f5676d367d")).booleanValue() : this.j.dispatchNestedPreScroll(i2, i3, iArr, iArr2, i4);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf6af390dc4e5437ecbcaf4fc66d6ba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf6af390dc4e5437ecbcaf4fc66d6ba")).booleanValue() : this.j.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iArr, Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e92b90a8e23a8428fc2f92618a053a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e92b90a8e23a8428fc2f92618a053a")).booleanValue() : this.j.dispatchNestedScroll(i2, i3, i4, i5, iArr, i6);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void stopNestedScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d5e767cd8a440ca29e14fb1f48face8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d5e767cd8a440ca29e14fb1f48face8");
        } else {
            this.j.stopNestedScroll();
        }
    }

    @Override // android.support.v4.view.NestedScrollingChild2
    public void stopNestedScroll(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00efbfe0491cd3aee6dd771a8ef992cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00efbfe0491cd3aee6dd771a8ef992cc");
        } else {
            this.j.stopNestedScroll(i2);
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a02c76bd1084f2341198d8202afd776", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a02c76bd1084f2341198d8202afd776")).booleanValue() : this.j.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab7dae937fcc6e396f34a0534ac34973", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab7dae937fcc6e396f34a0534ac34973")).booleanValue() : this.j.dispatchNestedFling(f, f2, z);
    }
}
