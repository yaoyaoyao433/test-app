package com.sankuai.waimai.business.page.homepage.knb;

import android.content.Context;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.api.IVIPCardFragmentDelegate;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a b;
    private IVIPCardFragmentDelegate c;

    private a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2b318ec5bb383c6d0e3688c16ca1f5d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2b318ec5bb383c6d0e3688c16ca1f5d");
        } else {
            this.c = (IVIPCardFragmentDelegate) com.sankuai.waimai.router.a.a(IVIPCardFragmentDelegate.class, str);
        }
    }

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9752f757e9fea802cee39aef015d1f9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9752f757e9fea802cee39aef015d1f9f");
        }
        if (b == null) {
            b = new a(str);
        }
        return b;
    }

    public final Class a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19bb9d026368adf3be0c626de78a5d7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19bb9d026368adf3be0c626de78a5d7f");
        }
        if (this.c != null) {
            return this.c.getKNBFragmentClass();
        }
        return null;
    }

    public final void a(Fragment fragment, String str) {
        Object[] objArr = {fragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb977aa5fbe2ad6f34a82ab11527edc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb977aa5fbe2ad6f34a82ab11527edc9");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("VIPCardFragmentDelegate", "url: " + str, new Object[0]);
        if (this.c != null) {
            this.c.loadUrl(fragment, str);
        }
    }

    public final void b(Fragment fragment, String str) {
        Object[] objArr = {fragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f606c3c176ef3f5459af51820a465fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f606c3c176ef3f5459af51820a465fc");
        } else if (this.c != null) {
            this.c.setTitle(fragment, str);
        }
    }

    public final String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f63326aa0f81cf700564100dcb6c59d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f63326aa0f81cf700564100dcb6c59d3");
        }
        if (this.c != null) {
            return this.c.addCommonParam(context, str);
        }
        return null;
    }

    public final boolean b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3061a774c927ee78bbb0963c4b52fc81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3061a774c927ee78bbb0963c4b52fc81")).booleanValue();
        }
        if (this.c != null) {
            return this.c.supportPreload(context, str);
        }
        return false;
    }
}
