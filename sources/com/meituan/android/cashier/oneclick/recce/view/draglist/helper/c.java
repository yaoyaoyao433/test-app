package com.meituan.android.cashier.oneclick.recce.view.draglist.helper;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.a;
import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends a.AbstractC0012a {
    public static ChangeQuickRedirect a;
    private static final Interpolator c = new Interpolator() { // from class: com.meituan.android.cashier.oneclick.recce.view.draglist.helper.c.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2) + 1.0f;
        }
    };
    private static final Interpolator d = new Interpolator() { // from class: com.meituan.android.cashier.oneclick.recce.view.draglist.helper.c.2
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return f * f * f;
        }
    };
    private final a b;

    @Override // android.support.v7.widget.helper.a.AbstractC0012a
    public final boolean a() {
        return false;
    }

    public c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f1728739c5bcea86e992bc1998d2e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f1728739c5bcea86e992bc1998d2e5");
        } else {
            this.b = aVar;
        }
    }

    @Override // android.support.v7.widget.helper.a.AbstractC0012a
    public final int a(RecyclerView recyclerView, RecyclerView.s sVar) {
        Object[] objArr = {recyclerView, sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5386ba8877a377032dee980d80439c67", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5386ba8877a377032dee980d80439c67")).intValue() : b(3, 0);
    }

    @Override // android.support.v7.widget.helper.a.AbstractC0012a
    public final boolean a(RecyclerView recyclerView, RecyclerView.s sVar, RecyclerView.s sVar2) {
        Object[] objArr = {recyclerView, sVar, sVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79aed39f906967870a757096b36f8b17", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79aed39f906967870a757096b36f8b17")).booleanValue();
        }
        if (sVar.getItemViewType() != sVar2.getItemViewType()) {
            return false;
        }
        this.b.a(sVar.getAdapterPosition(), sVar2.getAdapterPosition());
        return true;
    }

    @Override // android.support.v7.widget.helper.a.AbstractC0012a
    public final void a(RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cd9633607a6c5cd78e1984255ad934e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cd9633607a6c5cd78e1984255ad934e");
        } else {
            this.b.a(sVar.getAdapterPosition());
        }
    }

    @Override // android.support.v7.widget.helper.a.AbstractC0012a
    public final void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar, float f, float f2, int i, boolean z) {
        Object[] objArr = {canvas, recyclerView, sVar, Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79224af5eab9053bb866c7e164f62a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79224af5eab9053bb866c7e164f62a83");
        } else if (i == 1) {
            sVar.itemView.setAlpha(1.0f - (Math.abs(f) / sVar.itemView.getWidth()));
            sVar.itemView.setTranslationX(f);
        } else if (i == 2) {
            int layoutPosition = sVar.getLayoutPosition();
            super.a(canvas, recyclerView, sVar, f, ((layoutPosition != 0 || f2 >= 0.0f) && (layoutPosition != recyclerView.getAdapter().getItemCount() - 1 || f2 <= 0.0f)) ? f2 : 0.0f, i, z);
        }
    }

    private int a(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d16f6fff90879c43e7f6969505c2b7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d16f6fff90879c43e7f6969505c2b7a")).intValue();
        }
        try {
            Method declaredMethod = Class.forName("android.support.v7.widget.helper.a$a").getDeclaredMethod("getMaxDragScroll", RecyclerView.class);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(this, recyclerView)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // android.support.v7.widget.helper.a.AbstractC0012a
    public final int a(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "badb619faafffe2ea02a7b7a673acf02", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "badb619faafffe2ea02a7b7a673acf02")).intValue();
        }
        int signum = (int) (((int) (((int) Math.signum(i2)) * a(recyclerView) * c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * d.getInterpolation(j <= 500 ? ((float) j) / 500.0f : 1.0f));
        return signum == 0 ? i2 > 0 ? 1 : -1 : signum;
    }

    @Override // android.support.v7.widget.helper.a.AbstractC0012a
    public final void b(RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d9f0ed5e9c33ae907aedf272f718e30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d9f0ed5e9c33ae907aedf272f718e30");
            return;
        }
        if (i != 0 && (sVar instanceof b)) {
            ((b) sVar).a();
        }
        super.b(sVar, i);
    }

    @Override // android.support.v7.widget.helper.a.AbstractC0012a
    public final void c(RecyclerView recyclerView, RecyclerView.s sVar) {
        Object[] objArr = {recyclerView, sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ce5175d71c6515aa332caea65b9f43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ce5175d71c6515aa332caea65b9f43");
            return;
        }
        super.c(recyclerView, sVar);
        sVar.itemView.setAlpha(1.0f);
        if (sVar instanceof b) {
            ((b) sVar).b();
        }
    }
}
