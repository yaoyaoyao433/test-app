package com.sankuai.waimai.business.search.ui.result.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.a<V> {
    public static ChangeQuickRedirect d;
    private a a;
    private int b;
    private int c;

    public ViewOffsetBehavior() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f46039e69202ceb3ddf16dd904072fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f46039e69202ceb3ddf16dd904072fc");
            return;
        }
        this.b = 0;
        this.c = 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44fc4cda8e51cd2ed606a7a42c3f48a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44fc4cda8e51cd2ed606a7a42c3f48a1");
            return;
        }
        this.b = 0;
        this.c = 0;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        Object[] objArr = {coordinatorLayout, v, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99e5961367a3766a1d2dc82f1729f979", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99e5961367a3766a1d2dc82f1729f979")).booleanValue();
        }
        Object[] objArr2 = {coordinatorLayout, v, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d313cf92b97bb762ade72d04ab5bbbd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d313cf92b97bb762ade72d04ab5bbbd6");
        } else {
            coordinatorLayout.a(v, i);
        }
        if (this.a == null) {
            this.a = new a(v);
        }
        a aVar = this.a;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "05ae7897c93eb067e00ef472d9814596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "05ae7897c93eb067e00ef472d9814596");
        } else {
            aVar.c = aVar.b.getTop();
            aVar.d = aVar.b.getLeft();
            aVar.a();
        }
        if (this.b != 0) {
            this.a.a(this.b);
            this.b = 0;
        }
        if (this.c != 0) {
            a aVar2 = this.a;
            int i2 = this.c;
            Object[] objArr4 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect4 = a.a;
            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "f67beca053030be8238db142846cf05e", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "f67beca053030be8238db142846cf05e")).booleanValue();
            } else if (aVar2.f != i2) {
                aVar2.f = i2;
                aVar2.a();
            }
            this.c = 0;
        }
        return true;
    }

    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94e1cf97ca7983f9b85c0a55be733786", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94e1cf97ca7983f9b85c0a55be733786")).booleanValue();
        }
        if (this.a != null) {
            return this.a.a(i);
        }
        this.b = i;
        return false;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0d4e5b30ac5cfe246a144caaa301b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0d4e5b30ac5cfe246a144caaa301b8")).intValue();
        }
        if (this.a != null) {
            return this.a.e;
        }
        return 0;
    }
}
