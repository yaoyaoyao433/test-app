package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class y extends l {
    public static ChangeQuickRedirect a;
    @SerializedName("a")
    @Expose
    public int b;
    @SerializedName("u")
    @Expose
    public String c;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 9;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        return "pike_user_id_logout";
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2bff85cf360ab2ceb3c1db6eb85c22c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2bff85cf360ab2ceb3c1db6eb85c22c");
            return;
        }
        super.a(j);
        Object[] objArr2 = new Object[2];
        objArr2[0] = this.i;
        objArr2[1] = com.dianping.sdk.pike.f.g() ? this.c : "hide";
        com.dianping.sdk.pike.i.a("SendBean", String.format("logout user id success, requestId: %s, userId: %s.", objArr2));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5165aa4a482e92b9032ddd4fc804b50e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5165aa4a482e92b9032ddd4fc804b50e");
            return;
        }
        super.a(i, j);
        Object[] objArr2 = new Object[3];
        objArr2[0] = this.i;
        objArr2[1] = com.dianping.sdk.pike.f.g() ? this.c : "hide";
        objArr2[2] = Integer.valueOf(i);
        com.dianping.sdk.pike.i.a("SendBean", String.format("logout user id failed, requestId: %s, userId: %s, errCode %s.", objArr2));
    }
}
