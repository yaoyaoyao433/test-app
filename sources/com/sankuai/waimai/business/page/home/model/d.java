package com.sankuai.waimai.business.page.home.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public final int b;
    public final int c;
    public final BaseResponse<f> d;
    public final Throwable e;
    private final String f;

    public d(int i, int i2, BaseResponse<f> baseResponse) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b80647b3348f0a9edf01ff7dbeb53754", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b80647b3348f0a9edf01ff7dbeb53754");
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = baseResponse;
        this.f = null;
        this.e = null;
    }

    public d(int i, int i2, Throwable th) {
        Object[] objArr = {2, Integer.valueOf(i2), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1acf434e84ae548cae017f67ce6fc0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1acf434e84ae548cae017f67ce6fc0c");
            return;
        }
        this.b = 2;
        this.c = i2;
        this.e = th;
        this.d = null;
        this.f = null;
    }

    public d(int i, int i2) {
        Object[] objArr = {0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbcbadd0f36162c62bd35c4e8b2ad2c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbcbadd0f36162c62bd35c4e8b2ad2c3");
            return;
        }
        this.b = 0;
        this.c = i2;
        this.e = null;
        this.d = null;
        this.f = null;
    }
}
