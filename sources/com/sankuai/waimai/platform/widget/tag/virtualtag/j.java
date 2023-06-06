package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class j extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect c;
    public int d;
    public int e;
    public int f;
    public int g;
    private List<d> h;

    public abstract int[] a(Context context);

    public j(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3bd67f222f858d825e1cad9f5112c81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3bd67f222f858d825e1cad9f5112c81");
        } else {
            a(i);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baae24dcd3ab4a6359c4b6d1637f87b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baae24dcd3ab4a6359c4b6d1637f87b7");
        } else if (i < 0) {
            throw new IllegalArgumentException("行号不能小于零");
        } else {
            this.d = i;
        }
    }

    @NonNull
    public final List<d> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2aadc044caea33777c46852f779d31b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2aadc044caea33777c46852f779d31b");
        }
        if (this.h == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.h);
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c653165c906953ae774c9f63f590b690", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c653165c906953ae774c9f63f590b690");
        } else if (dVar == null) {
        } else {
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(dVar);
        }
    }

    public final void b(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a40834ca9610829f5b6c47762b2b9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a40834ca9610829f5b6c47762b2b9b");
        } else {
            this.e = Math.max(0, 0);
        }
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "047a911e4b13da576f78857d54520b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "047a911e4b13da576f78857d54520b81");
        } else {
            this.f = Math.max(i, 0);
        }
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f60c4d3a8729ba42ecc191d63f9e46f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f60c4d3a8729ba42ecc191d63f9e46f2")).booleanValue() : this.h == null || this.h.isEmpty();
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d6176059e49bcb304f90a86a3b31fc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d6176059e49bcb304f90a86a3b31fc2");
            return;
        }
        this.d = 0;
        if (this.h != null) {
            for (d dVar : this.h) {
                if (dVar != null) {
                    dVar.c();
                }
            }
            this.h.clear();
        }
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }
}
