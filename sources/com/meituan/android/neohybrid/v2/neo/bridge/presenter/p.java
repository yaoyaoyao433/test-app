package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.android.neohybrid.v2.neo.ssr.a;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class p extends a implements a.InterfaceC0317a {
    public static ChangeQuickRedirect o = null;
    public static final String p = "p";

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String k() {
        return "ssr";
    }

    public p(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3) {
        super(aVar, str, str2, str3);
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbedb7851f4e37778d4fe9936bae1ad0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbedb7851f4e37778d4fe9936bae1ad0");
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.a, com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86622a32834978a1fced79ddc2a22335", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86622a32834978a1fced79ddc2a22335");
        }
        if (this.c.equals(PackageLoadReporter.Source.PREFETCH)) {
            return super.b();
        }
        return d();
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.a
    public final void a(NeoBridgeBean neoBridgeBean) {
        Object[] objArr = {neoBridgeBean};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390776b7c9fb0003bc34aa740ee6f632", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390776b7c9fb0003bc34aa740ee6f632");
        } else {
            this.h.a(this);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.a
    public final String b(NeoBridgeBean neoBridgeBean) {
        Object[] objArr = {neoBridgeBean};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ca501d7d23281b2bcdf554059f1704", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ca501d7d23281b2bcdf554059f1704");
        }
        JsonObject d = d(this.h.a(this));
        if (d == null) {
            return null;
        }
        return new NeoBridgeBean(0, "", d, a(false)).toString();
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String j() {
        return p;
    }

    private JsonObject d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97c137795ecafd7167e863608dbc8c26", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97c137795ecafd7167e863608dbc8c26");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (JsonObject) com.meituan.android.neohybrid.util.gson.b.a().fromJson(str, (Class<Object>) JsonObject.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.ssr.a.InterfaceC0317a
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cac87b566c30451d42d71ae1318d4ae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cac87b566c30451d42d71ae1318d4ae0");
            return;
        }
        JsonObject d = d(str);
        if (d == null) {
            a(new IllegalStateException("ssr request content illegal"));
        } else {
            a(this.f, d);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.ssr.a.InterfaceC0317a
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f24a4d0373a3b7e0d7ff6428e40f55b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f24a4d0373a3b7e0d7ff6428e40f55b");
            return;
        }
        StringBuilder sb = new StringBuilder("SSRBridgeManager.onCallbackFail: errCode=-1 and errMsg=");
        sb.append(exc != null ? exc.getMessage() : "");
        a(sb.toString());
    }
}
