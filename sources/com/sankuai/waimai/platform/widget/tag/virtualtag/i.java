package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class i<T> extends com.sankuai.waimai.platform.widget.tag.b {
    public static ChangeQuickRedirect f;
    public Map<String, Object> g;
    public long h;
    @NonNull
    public com.sankuai.waimai.platform.widget.tag.virtualview.render.f i;
    @NonNull
    public com.sankuai.waimai.platform.widget.tag.virtualview.render.g j;
    @Nullable
    public T k;
    public int l;
    public int m;

    public i(@NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.f fVar, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar, @Nullable T t) {
        Object[] objArr = {fVar, gVar, t};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cd6cc5c482330cecafdc5e07d74c20e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cd6cc5c482330cecafdc5e07d74c20e");
            return;
        }
        this.i = fVar;
        this.j = gVar;
        this.k = t;
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c357b6e6b860b390cdf3635115f877eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c357b6e6b860b390cdf3635115f877eb");
            return;
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        this.g.put(str, obj);
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b54db77c8bebf3c9ed12ff617f800548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b54db77c8bebf3c9ed12ff617f800548");
            return;
        }
        if (this.g != null) {
            this.g.clear();
        }
        this.i.c();
        this.i = com.sankuai.waimai.platform.widget.tag.virtualview.render.f.d;
        this.j.c();
        this.j = com.sankuai.waimai.platform.widget.tag.virtualview.render.g.d;
        e();
        this.l = 0;
        this.m = 0;
        this.h = -1L;
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a290f6022354bda6e92381c74a3388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a290f6022354bda6e92381c74a3388");
        } else if (this.k instanceof com.sankuai.waimai.platform.widget.tag.b) {
            ((com.sankuai.waimai.platform.widget.tag.b) this.k).c();
        }
    }
}
