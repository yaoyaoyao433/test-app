package com.sankuai.meituan.mapsdk.core.render.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.annotations.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class h implements q {
    public static ChangeQuickRedirect c;
    public com.sankuai.meituan.mapsdk.core.render.a d;
    public long e;
    public String f;
    public List<b> g;
    public int h;

    public abstract void a();

    public abstract boolean a(boolean z);

    public h(com.sankuai.meituan.mapsdk.core.render.a aVar, String str) {
        String str2;
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "863baae45a4cc1948b5627b6c13ffce2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "863baae45a4cc1948b5627b6c13ffce2");
            return;
        }
        this.h = 0;
        this.d = aVar;
        if (str != null) {
            str2 = str;
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8681303493eb6ba64d6f8c69a3939c56", RobustBitConfig.DEFAULT_VALUE)) {
                str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8681303493eb6ba64d6f8c69a3939c56");
            } else {
                str2 = "msa-source-" + System.nanoTime();
            }
        }
        this.f = str2;
        this.g = new ArrayList();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.q
    public final String b() {
        return this.f;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.q
    public final void a(Collection<String> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7cb3042b37cbeb10e4f2d7f1e37d9cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7cb3042b37cbeb10e4f2d7f1e37d9cf");
        } else if (this.d != null) {
            this.d.refImages(this.e, new ArrayList(collection));
        }
    }

    public final b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9ea0db3517e8507dbc60dd4de974419", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9ea0db3517e8507dbc60dd4de974419");
        }
        com.sankuai.meituan.mapsdk.core.render.a aVar = this.d;
        int i = this.h;
        this.h = i + 1;
        b bVar = new b(aVar, this, i);
        this.g.add(bVar);
        e();
        return bVar;
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60874587643f057bb463c016b94667a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60874587643f057bb463c016b94667a5");
        } else if (this.d != null) {
            this.d.removeFeature(this.e, bVar.d);
            this.g.remove(bVar);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb25a2025401ab70a9b042bdcb77854f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb25a2025401ab70a9b042bdcb77854f");
            return;
        }
        this.g.clear();
        this.h = 0;
        e();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43ac44891d62d8ab49a06127f468f15e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43ac44891d62d8ab49a06127f468f15e");
        } else if (this.d != null) {
            this.d.setFeatureNum(this.e, this.h);
        }
    }
}
