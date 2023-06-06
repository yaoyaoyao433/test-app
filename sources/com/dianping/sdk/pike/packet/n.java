package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n extends l {
    public static ChangeQuickRedirect a;
    @SerializedName("b")
    @Expose
    public String b;
    @SerializedName("o")
    @Expose
    public int c;
    @SerializedName("t")
    @Expose
    public String d;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 11;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af0efb1ce0bae4b503984be44ec2f7a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af0efb1ce0bae4b503984be44ec2f7a") : this.c == 0 ? "pike_unbind_tag" : this.c == 1 ? "pike_bind_tag" : super.b();
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0694a2971eaf03cd587fcfe6cab036fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0694a2971eaf03cd587fcfe6cab036fa");
            return;
        }
        super.a(j);
        Object[] objArr2 = new Object[4];
        objArr2[0] = c();
        objArr2[1] = this.i;
        objArr2[2] = this.b;
        objArr2[3] = com.dianping.sdk.pike.f.g() ? this.d : "hide";
        com.dianping.sdk.pike.i.a("SendBean", String.format("%s tag success, requestId: %s, bizId: %s, tag: %s.", objArr2));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e127b906184cbc16cde54e0427a1fc13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e127b906184cbc16cde54e0427a1fc13");
            return;
        }
        super.a(i, j);
        Object[] objArr2 = new Object[5];
        objArr2[0] = c();
        objArr2[1] = this.i;
        objArr2[2] = this.b;
        objArr2[3] = com.dianping.sdk.pike.f.g() ? this.d : "hide";
        objArr2[4] = Integer.valueOf(i);
        com.dianping.sdk.pike.i.a("SendBean", String.format("%s tag failed, requestId: %s, bizId: %s, tag: %s, errCode: %s.", objArr2));
    }

    private String c() {
        return this.c == 0 ? "unbind" : "bind";
    }
}
