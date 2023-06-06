package com.dianping.sdk.pike.packet;

import com.dianping.sdk.pike.util.GsonUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class j {
    public static ChangeQuickRedirect j;
    public String k;
    byte[] l;

    public abstract int a();

    public void a(byte[] bArr) {
    }

    public byte[] e() {
        return null;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "922d3c2eeb41a3d1c7a96d03dd7fd0a6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "922d3c2eeb41a3d1c7a96d03dd7fd0a6") : GsonUtils.a(this);
    }

    public final String f() {
        return this.k != null ? this.k : "";
    }

    public final byte[] g() {
        return this.l != null ? this.l : new byte[0];
    }

    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775c01ada77a2620d186a8c67161a73c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775c01ada77a2620d186a8c67161a73c")).intValue() : f().getBytes().length + g().length;
    }
}
