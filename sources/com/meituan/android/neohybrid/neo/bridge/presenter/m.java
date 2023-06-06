package com.meituan.android.neohybrid.neo.bridge.presenter;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.android.neohybrid.neo.ssr.a;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class m extends a implements a.InterfaceC0309a {
    public static ChangeQuickRedirect n = null;
    public static final String o = "m";

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String k() {
        return "ssr";
    }

    public m(com.meituan.android.neohybrid.core.a aVar, String str, String str2, String str3) {
        super(aVar, str, str2, str3);
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1549c49bc7f5b355d91f3d9a1927501a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1549c49bc7f5b355d91f3d9a1927501a");
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.a, com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96cf71f87fef45252fd94e1be407531", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96cf71f87fef45252fd94e1be407531");
        }
        if (this.c.equals(PackageLoadReporter.Source.PREFETCH)) {
            return super.b();
        }
        return d();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.a
    public final void a(NeoBridgeBean neoBridgeBean) {
        Object[] objArr = {neoBridgeBean};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c622426a26ec9ba4f69937d4ebe07f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c622426a26ec9ba4f69937d4ebe07f");
        } else {
            this.g.a(this);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.a
    public final String b(NeoBridgeBean neoBridgeBean) {
        Object[] objArr = {neoBridgeBean};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885a783bc6c92f7387f05e98ee0aac8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885a783bc6c92f7387f05e98ee0aac8f");
        }
        JsonObject d = d(this.g.a(this));
        if (d == null) {
            return null;
        }
        return new NeoBridgeBean(0, "", d, a(false)).toString();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String j() {
        return o;
    }

    private JsonObject d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dde06925dd0305da7a4b4fe59ebdafca", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dde06925dd0305da7a4b4fe59ebdafca");
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

    @Override // com.meituan.android.neohybrid.neo.ssr.a.InterfaceC0309a
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9cd514740d8a662378bc527c215336b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9cd514740d8a662378bc527c215336b");
            return;
        }
        JsonObject d = d(str);
        if (d == null) {
            a(new IllegalStateException("ssr request content illegal"));
        } else {
            a(this.f, d);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.ssr.a.InterfaceC0309a
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab8f3047d76849dfd2b2b2197519a64e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab8f3047d76849dfd2b2b2197519a64e");
            return;
        }
        StringBuilder sb = new StringBuilder("SSRBridgeManager.onCallbackFail: errCode=-1 and errMsg=");
        sb.append(exc != null ? exc.getMessage() : "");
        a(sb.toString());
    }
}
