package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends l {
    public static ChangeQuickRedirect a;
    @SerializedName("b")
    @Expose
    public String b;
    @SerializedName("al")
    @Expose
    public String c;
    @SerializedName("o")
    @Expose
    public int d;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 7;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2094c7c371490b0dfabb8bc96b0bf2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2094c7c371490b0dfabb8bc96b0bf2") : this.d == 0 ? "pike_add_alias" : this.d == 1 ? "pike_remove_alias" : super.b();
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84f237f3e875719afe4f3cd50df8962f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84f237f3e875719afe4f3cd50df8962f");
            return;
        }
        super.a(j);
        Object[] objArr2 = new Object[4];
        objArr2[0] = this.d == 0 ? "add" : "remove";
        objArr2[1] = this.i;
        objArr2[2] = this.b;
        objArr2[3] = com.dianping.sdk.pike.f.g() ? this.c : "hide";
        com.dianping.sdk.pike.i.a("SendBean", String.format("%s alias success, requestId: %s, bizId: %s, alias: %s.", objArr2));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34d94f292f6e8417bfaaccebd11f46c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34d94f292f6e8417bfaaccebd11f46c7");
            return;
        }
        super.a(i, j);
        Object[] objArr2 = new Object[4];
        objArr2[0] = this.i;
        objArr2[1] = this.b;
        objArr2[2] = com.dianping.sdk.pike.f.g() ? this.c : "hide";
        objArr2[3] = Integer.valueOf(i);
        com.dianping.sdk.pike.i.a("SendBean", String.format("add alias failed, requestId: %s, bizId: %s, alias: %s, errCode: %s.", objArr2));
    }
}
