package com.meituan.msc.modules.engine;

import android.support.annotation.Nullable;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j extends com.meituan.msc.modules.reporter.f {
    public static ChangeQuickRedirect d;
    public final WeakReference<h> e;
    public int f;
    public com.meituan.msc.modules.service.codecache.b g;
    long h;
    public long i;
    String j;

    public j(com.meituan.msc.modules.reporter.a aVar, h hVar) {
        super(aVar);
        Object[] objArr = {aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c19aed534a44316ad01ddacaaa8c310", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c19aed534a44316ad01ddacaaa8c310");
            return;
        }
        this.f = 0;
        this.g = new com.meituan.msc.modules.service.codecache.b();
        this.h = 0L;
        this.i = 0L;
        this.j = "unknown";
        this.e = new WeakReference<>(hVar);
    }

    @Override // com.meituan.msc.modules.reporter.f
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8744730f85e3ada801bdd96aec0e4afc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8744730f85e3ada801bdd96aec0e4afc");
            return;
        }
        h hVar = this.e.get();
        if (hVar == null) {
            super.a(jSONObject);
            return;
        }
        com.meituan.msc.modules.page.render.a b = b(hVar);
        if (b != null) {
            b.a(jSONObject);
        } else {
            super.a(jSONObject);
        }
    }

    @Override // com.meituan.msc.modules.reporter.f
    public final void b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32082478bec9e203ef5b1de171d7468a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32082478bec9e203ef5b1de171d7468a");
            return;
        }
        h hVar = this.e.get();
        if (hVar == null) {
            super.b(jSONObject);
            return;
        }
        com.meituan.msc.modules.page.render.a b = b(hVar);
        if (b != null) {
            b.b(jSONObject);
        } else {
            super.b(jSONObject);
        }
    }

    @Nullable
    public h b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e24dd6bc4da5faab8aeec055f213e90d", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e24dd6bc4da5faab8aeec055f213e90d");
        }
        if (this.e == null) {
            return null;
        }
        return this.e.get();
    }

    public final j a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c584f5d799cb78af3df6dafbf2099783", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c584f5d799cb78af3df6dafbf2099783");
        }
        this.h = j;
        return this;
    }

    public final j b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45fd79fc9ae659c7d29f9ad26970bc60", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45fd79fc9ae659c7d29f9ad26970bc60");
        }
        this.i = j;
        return this;
    }

    public final j f(String str) {
        if (str == null) {
            str = PackageInfoWrapper.PACKAGE_TYPE_STR_BASE;
        }
        this.j = str;
        return this;
    }

    public static j a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b91071041bed01b55f0e26f46f237842", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b91071041bed01b55f0e26f46f237842");
        }
        if (hVar != null) {
            return hVar.p;
        }
        return null;
    }
}
