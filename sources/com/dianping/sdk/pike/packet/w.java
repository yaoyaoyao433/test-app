package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class w extends l {
    public static ChangeQuickRedirect a;
    @SerializedName("b")
    @Expose
    public String b;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 23;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        return "pike_biz_id_logout";
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7750fe69f3d689b76c245a6b75d43cdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7750fe69f3d689b76c245a6b75d43cdb");
            return;
        }
        super.a(j);
        com.dianping.sdk.pike.i.a("SendBean", String.format("logout bizId success, requestId: %s, bizId: %s.", this.i, this.b));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f7599319f1c22c2389e21b0de04daa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f7599319f1c22c2389e21b0de04daa7");
            return;
        }
        super.a(i, j);
        com.dianping.sdk.pike.i.a("SendBean", String.format("logout bizId failed, requestId: %s, bizId: %s, errCode: %s.", this.i, this.b, Integer.valueOf(i)));
    }
}
