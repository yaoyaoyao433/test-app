package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends l {
    public static ChangeQuickRedirect a;
    @SerializedName("b")
    @Expose
    public String b;
    @SerializedName(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)
    @Expose
    public String c;
    @SerializedName("t")
    @Expose
    public int d;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 31;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c68356a2f13d37e33aa18841772a40e7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c68356a2f13d37e33aa18841772a40e7") : c() ? "pike_join_agg" : "pike_leave_agg";
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef960641c9c63764dca4b83526c22a13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef960641c9c63764dca4b83526c22a13");
            return;
        }
        super.a(j);
        com.dianping.sdk.pike.i.a("SendBean", String.format("agg join opt succeed, requestId: %s, bizId: %s, aggId: %s, type: %s.", this.i, this.b, this.c, Integer.valueOf(this.d)));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6fca85cee9aec74dc84218bf0f55983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6fca85cee9aec74dc84218bf0f55983");
            return;
        }
        super.a(i, j);
        com.dianping.sdk.pike.i.a("SendBean", String.format("agg join opt failed, requestId: %s, bizId: %s, aggId: %s, type: %s.", this.i, this.b, this.c, Integer.valueOf(this.d)));
    }

    public final boolean c() {
        return this.d == 1;
    }
}
