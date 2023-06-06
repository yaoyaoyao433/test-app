package com.sankuai.waimai.store.newwidgets.pullrefresh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public class SCNestedPullRefreshView extends SCAbsScrollPullRefresh implements NestedScrollingChild, NestedScrollingParent {
    public static ChangeQuickRedirect a;
    private final int[] g;
    private NestedScrollingChildHelper h;
    private NestedScrollingParentHelper i;

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return false;
    }

    public SCNestedPullRefreshView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2caded974e778b5732d119cc7082945c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2caded974e778b5732d119cc7082945c");
            return;
        }
        this.g = new int[2];
        a(context);
    }

    public SCNestedPullRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "048a26332f3510e94278242040aa48b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "048a26332f3510e94278242040aa48b4");
            return;
        }
        this.g = new int[2];
        a(context);
    }

    public SCNestedPullRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24c9daf10a384c35ec5a8b4f1c6ae29e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24c9daf10a384c35ec5a8b4f1c6ae29e");
            return;
        }
        this.g = new int[2];
        a(context);
    }

    public SCNestedPullRefreshView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ce031f7301896d4afa8d5877b5e177", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ce031f7301896d4afa8d5877b5e177");
            return;
        }
        this.g = new int[2];
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c5f6644718639f757bb3705c01999da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c5f6644718639f757bb3705c01999da");
            return;
        }
        this.h = new NestedScrollingChildHelper(this);
        this.i = new NestedScrollingParentHelper(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a97ea1556ea84d5de109a45e94c8aec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a97ea1556ea84d5de109a45e94c8aec9");
        } else {
            this.h.setNestedScrollingEnabled(z);
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1aeab0899961802a5f61866f8a657b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1aeab0899961802a5f61866f8a657b")).booleanValue() : this.h.isNestedScrollingEnabled();
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cd156ccb4697ece6dcbff4427904f60", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cd156ccb4697ece6dcbff4427904f60")).booleanValue() : this.h.startNestedScroll(i);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void stopNestedScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d61089c2f787cc95c16c3dce7683d97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d61089c2f787cc95c16c3dce7683d97");
        } else {
            this.h.stopNestedScroll();
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4cc005cf7329feaa15b78ef96059b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4cc005cf7329feaa15b78ef96059b0")).booleanValue() : this.h.hasNestedScrollingParent();
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f93224940348e4f4abbaa755eb7d5901", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f93224940348e4f4abbaa755eb7d5901")).booleanValue() : this.h.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4996fe5cd03cd5ba6e93f7c8ba42acc1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4996fe5cd03cd5ba6e93f7c8ba42acc1")).booleanValue() : this.h.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acecc6492a4912a2069aeea0fdc80f96", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acecc6492a4912a2069aeea0fdc80f96")).booleanValue() : this.h.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63b5775fb0fd466e059cb3656824f1a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63b5775fb0fd466e059cb3656824f1a")).booleanValue() : this.h.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0dcf16778a9491b9c970db1398fb2ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0dcf16778a9491b9c970db1398fb2ee");
            return;
        }
        this.i.onNestedScrollAccepted(view, view2, i);
        startNestedScroll(2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779efc05e7a3a3c03313b1c3c61fd2f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779efc05e7a3a3c03313b1c3c61fd2f2");
            return;
        }
        this.i.onStopNestedScroll(view);
        stopNestedScroll();
        if (e()) {
            this.c.d();
        } else if (f()) {
            this.d.d();
        }
        setPullTarget(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088e6ec06a168147e1bf8432f6057917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088e6ec06a168147e1bf8432f6057917");
            return;
        }
        switch (getPullTarget()) {
            case 0:
                dispatchNestedPreScroll(i, i2, iArr, null);
                return;
            case 1:
                if (i2 <= 0 || this.c.b(-i2) == 0) {
                    return;
                }
                iArr[1] = iArr[1] + i2;
                return;
            case 2:
                if (i2 >= 0 || this.d.b(i2) == 0) {
                    return;
                }
                iArr[1] = iArr[1] + i2;
                return;
            default:
                return;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        int i5;
        int b;
        boolean z = false;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be22232b4bc11e736793f707d44b7557", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be22232b4bc11e736793f707d44b7557");
            return;
        }
        switch (getPullTarget()) {
            case 0:
                int[] iArr = this.g;
                this.g[1] = 0;
                iArr[0] = 0;
                dispatchNestedScroll(0, i2, 0, i4, this.g);
                if ((this.g[0] == 0 && this.g[1] == 0) ? true : true) {
                    return;
                }
                if (i4 < 0) {
                    if (this.e) {
                        setPullTarget(1);
                        this.c.b(-i4);
                        return;
                    }
                    return;
                } else if (i4 <= 0 || !this.f) {
                    return;
                } else {
                    setPullTarget(2);
                    this.d.b(i4);
                    return;
                }
            case 1:
            case 2:
                if (e()) {
                    b = this.c.b(-i4);
                } else if (f()) {
                    b = this.d.b(i4);
                } else {
                    i5 = 0;
                    dispatchNestedScroll(0, i5, 0, i4 - i5, null);
                    return;
                }
                i5 = b;
                dispatchNestedScroll(0, i5, 0, i4 - i5, null);
                return;
            default:
                return;
        }
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "081d19247da9715288a4e2830eee5e8f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "081d19247da9715288a4e2830eee5e8f")).intValue() : this.i.getNestedScrollAxes();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c52da60f92142bf799293021c900597d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c52da60f92142bf799293021c900597d")).booleanValue() : (this.e || this.f) && (i & 2) != 0;
    }
}
