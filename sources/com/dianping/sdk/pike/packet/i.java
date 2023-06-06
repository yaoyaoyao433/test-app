package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends aa {
    public static ChangeQuickRedirect a;
    @SerializedName(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)
    @Expose
    public String b;
    @SerializedName(com.huawei.hms.opendevice.c.a)
    @Expose
    public String c;
    @SerializedName("p")
    @Expose
    public byte d;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 27;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        return "pike_agg_msg_send";
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d91f7abfb9b52476c0a7377c6f767f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d91f7abfb9b52476c0a7377c6f767f");
            return;
        }
        super.a(j);
        com.dianping.sdk.pike.i.a("SendBean", String.format("send agg message success, requestId: %s, messageId: %s.", this.i, this.f));
        com.dianping.sdk.pike.util.f.a(com.dianping.sdk.pike.util.f.a(com.dianping.sdk.pike.metrics.c.UpLinkMessage, this.e, h()));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a28c04b616a54edc0c5e92dc9d1fa89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a28c04b616a54edc0c5e92dc9d1fa89");
            return;
        }
        super.a(i, j);
        com.dianping.sdk.pike.i.a("SendBean", String.format("send agg message failed, requestId: %s, messageId: %s, errCode %s.", this.i, this.f, Integer.valueOf(i)));
    }
}
