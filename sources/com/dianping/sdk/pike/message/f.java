package com.dianping.sdk.pike.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends d {
    public static ChangeQuickRedirect a;
    public String b;
    public byte[] c;

    public f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57a66c8dd2cfc6467fa1b29f4d34ddfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57a66c8dd2cfc6467fa1b29f4d34ddfd");
            return;
        }
        super.a(a.a().b());
        if (com.dianping.sdk.pike.f.d() && com.dianping.nvtunnelkit.utils.f.a(str)) {
            throw new IllegalArgumentException("rrpcId must not be empty");
        }
        this.b = str;
    }

    @Override // com.dianping.sdk.pike.message.d
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1862e18c2800a97b37858f494752c097", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1862e18c2800a97b37858f494752c097");
        } else if (com.dianping.sdk.pike.f.d()) {
            throw new IllegalArgumentException("message id not support to set by biz.");
        }
    }
}
