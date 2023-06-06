package com.dianping.sdk.pike.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends d {
    public static ChangeQuickRedirect a;
    public String b;
    public byte[] c;
    public long d;
    public boolean e;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ae2ffcc3142f9c0f56cf956786b1c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ae2ffcc3142f9c0f56cf956786b1c3");
        } else {
            super.a(a.a().b());
        }
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void a(byte[] bArr) {
        this.c = bArr;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15112d2dc689d94edcf2ef57c6ccafc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15112d2dc689d94edcf2ef57c6ccafc5");
        } else {
            this.d = j;
        }
    }

    @Override // com.dianping.sdk.pike.message.d
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b559c7eaeaf8f993d6b860b6ddbcf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b559c7eaeaf8f993d6b860b6ddbcf8");
        } else if (com.dianping.sdk.pike.f.d()) {
            throw new IllegalArgumentException("message id not support to set by biz.");
        }
    }
}
