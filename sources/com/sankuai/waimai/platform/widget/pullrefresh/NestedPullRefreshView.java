package com.sankuai.waimai.platform.widget.pullrefresh;

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
public class NestedPullRefreshView extends AbsScrollPullRefresh implements NestedScrollingChild, NestedScrollingParent {
    public static ChangeQuickRedirect h;
    private final int[] a;
    private NestedScrollingChildHelper b;
    private NestedScrollingParentHelper i;

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return false;
    }

    public NestedPullRefreshView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0238fa9e3212c62244f48fba481a51b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0238fa9e3212c62244f48fba481a51b7");
            return;
        }
        this.a = new int[2];
        a(context);
    }

    public NestedPullRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23b4becb405fc877a5abe6bf810266b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23b4becb405fc877a5abe6bf810266b");
            return;
        }
        this.a = new int[2];
        a(context);
    }

    public NestedPullRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21451eca90cc66bf1076d265b2ddfa95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21451eca90cc66bf1076d265b2ddfa95");
            return;
        }
        this.a = new int[2];
        a(context);
    }

    public NestedPullRefreshView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f504250b1e7b9b3a338bd4b565307f67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f504250b1e7b9b3a338bd4b565307f67");
            return;
        }
        this.a = new int[2];
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b093e46601243fc00aa62410f4f3b38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b093e46601243fc00aa62410f4f3b38");
            return;
        }
        this.b = new NestedScrollingChildHelper(this);
        this.i = new NestedScrollingParentHelper(this);
        setNestedScrollingEnabled(true);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dbeab9787d8d08ac9056735db59e08d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dbeab9787d8d08ac9056735db59e08d");
        } else {
            this.b.setNestedScrollingEnabled(z);
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f36b33ee291dba4cd4cebaf1697ee406", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f36b33ee291dba4cd4cebaf1697ee406")).booleanValue() : this.b.isNestedScrollingEnabled();
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb2224e27cd62829458b73a4c7e7c5e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb2224e27cd62829458b73a4c7e7c5e")).booleanValue() : this.b.startNestedScroll(i);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public void stopNestedScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "697f2740f919e46f77fcd8dd74d281ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "697f2740f919e46f77fcd8dd74d281ba");
        } else {
            this.b.stopNestedScroll();
        }
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9ba6f30ad85f1ad17fdb84a4c9bfabd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9ba6f30ad85f1ad17fdb84a4c9bfabd")).booleanValue() : this.b.hasNestedScrollingParent();
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), iArr};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a003ab39ac76ff06d3cc6ccedd47cb45", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a003ab39ac76ff06d3cc6ccedd47cb45")).booleanValue() : this.b.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df25d73bb3bf35241511ee045aede51", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df25d73bb3bf35241511ee045aede51")).booleanValue() : this.b.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c367c188fff9bf208eb94ac33d3d14e5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c367c188fff9bf208eb94ac33d3d14e5")).booleanValue() : this.b.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eab740288160bab68b4a25c335a889e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eab740288160bab68b4a25c335a889e")).booleanValue() : this.b.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd71c77e7e4bc7e28288c3f2dac44e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd71c77e7e4bc7e28288c3f2dac44e5");
            return;
        }
        this.i.onNestedScrollAccepted(view, view2, i);
        startNestedScroll(2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92cd692de61f4aace31d9fb05d4d6a6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92cd692de61f4aace31d9fb05d4d6a6d");
            return;
        }
        this.i.onStopNestedScroll(view);
        stopNestedScroll();
        if (b()) {
            this.d.d();
        } else if (c()) {
            this.e.d();
        }
        setPullTarget(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5ed13af84e21cd20f6d81d3c6c4ead5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5ed13af84e21cd20f6d81d3c6c4ead5");
            return;
        }
        switch (getPullTarget()) {
            case 0:
                dispatchNestedPreScroll(i, i2, iArr, null);
                return;
            case 1:
                if (i2 <= 0 || this.d.b(-i2) == 0) {
                    return;
                }
                iArr[1] = iArr[1] + i2;
                return;
            case 2:
                if (i2 >= 0 || this.e.b(i2) == 0) {
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
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ce04eb32a310f883df883f31cce38c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ce04eb32a310f883df883f31cce38c8");
            return;
        }
        switch (getPullTarget()) {
            case 0:
                int[] iArr = this.a;
                this.a[1] = 0;
                iArr[0] = 0;
                dispatchNestedScroll(0, i2, 0, i4, this.a);
                if ((this.a[0] == 0 && this.a[1] == 0) ? true : true) {
                    return;
                }
                if (i4 < 0) {
                    if (this.f) {
                        setPullTarget(1);
                        this.d.b(-i4);
                        return;
                    }
                    return;
                } else if (i4 <= 0 || !this.g) {
                    return;
                } else {
                    setPullTarget(2);
                    this.e.b(i4);
                    return;
                }
            case 1:
            case 2:
                if (b()) {
                    b = this.d.b(-i4);
                } else if (c()) {
                    b = this.e.b(i4);
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
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a7ddfa0473ee233dd148cde8e6a598", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a7ddfa0473ee233dd148cde8e6a598")).intValue() : this.i.getNestedScrollAxes();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a76ec8315e881b8bc9db43ac85ff808", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a76ec8315e881b8bc9db43ac85ff808")).booleanValue() : (this.f || this.g) && (i & 2) != 0;
    }
}
