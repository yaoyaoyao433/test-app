package com.sankuai.waimai.foundation.utils;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewManager;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class ag<T extends View> {
    public static ChangeQuickRedirect a;
    public final String b;
    private LinkedList<T> c;

    @NonNull
    public abstract T a();

    public ag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47fe20e8c5cdc19a0e36bdf3907d65c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47fe20e8c5cdc19a0e36bdf3907d65c");
            return;
        }
        this.b = getClass().getSimpleName();
        this.c = new LinkedList<>();
    }

    @NonNull
    public final T b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d462bec6bf46551b626bdcbf1390708b", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d462bec6bf46551b626bdcbf1390708b");
        }
        if (this.c.isEmpty()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45fa7e75be53a13cdc84799068717b83", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45fa7e75be53a13cdc84799068717b83");
            }
            T a2 = a();
            if (a2 != null) {
                return a2;
            }
            throw new RuntimeException("ViewPool.onCreate不应返回null");
        }
        return this.c.removeFirst();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Collection<? extends View> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a45bd1a392cfff868e58da8c3d2d415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a45bd1a392cfff868e58da8c3d2d415");
            return;
        }
        for (View view : collection) {
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6e604fb9f937d8168e67fed4e97b061", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6e604fb9f937d8168e67fed4e97b061");
            } else if (view != null) {
                try {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ffba992f4e9e7e10eac0fcf7ea68d44b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ffba992f4e9e7e10eac0fcf7ea68d44b");
                    } else if (view != null) {
                        ViewParent parent = view.getParent();
                        if (parent instanceof ViewManager) {
                            ((ViewManager) parent).removeView(view);
                        }
                    }
                    this.c.add(view);
                } catch (ClassCastException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
            }
        }
    }
}
