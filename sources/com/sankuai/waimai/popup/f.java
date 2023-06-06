package com.sankuai.waimai.popup;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.actinfo.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static f f;
    GetInfoResponse b;
    public boolean c;
    boolean d;
    public boolean e;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad1dcc099151712e8a430293f7acf5d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad1dcc099151712e8a430293f7acf5d4");
            return;
        }
        this.c = false;
        this.d = false;
        this.e = false;
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a52102216238ada929024daffd2cca41", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a52102216238ada929024daffd2cca41");
        }
        if (f == null) {
            f = new f();
        }
        return f;
    }

    public final void a(GetInfoResponse getInfoResponse) {
        Object[] objArr = {getInfoResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c596064f532f76a89e07cf9ad69e6be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c596064f532f76a89e07cf9ad69e6be");
        } else if (getInfoResponse == null || getInfoResponse.nativeData == null || getInfoResponse.nativeData.positionCount <= 0) {
        } else {
            this.b = getInfoResponse;
            this.c = true;
            this.d = true;
            com.sankuai.waimai.business.page.home.actinfo.b.a(getInfoResponse.nativeData.positionCount, b.a.FailureTypeNotHomePage);
        }
    }

    public final int b() {
        return this.d ? 1 : 0;
    }
}
