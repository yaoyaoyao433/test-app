package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class aj extends ae {
    public static ChangeQuickRedirect c;
    @SerializedName("rm")
    @Expose
    public String d;

    @Override // com.dianping.sdk.pike.packet.ae, com.dianping.sdk.pike.packet.j
    public final int a() {
        return 39;
    }

    @Override // com.dianping.sdk.pike.packet.ae, com.dianping.sdk.pike.packet.l
    public final String b() {
        return "pike_rrpc_reply";
    }

    @Override // com.dianping.sdk.pike.packet.ae, com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11149105551b71d5e9f8ce98bdb9d6d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11149105551b71d5e9f8ce98bdb9d6d8");
            return;
        }
        com.dianping.sdk.pike.i.a("SendBean", String.format("send rrpc reply message success, requestId: %s, messageId: %s.", this.i, this.f));
        com.dianping.sdk.pike.util.f.a(com.dianping.sdk.pike.util.f.a(com.dianping.sdk.pike.metrics.c.UpLinkMessage, this.e, h()));
    }

    @Override // com.dianping.sdk.pike.packet.ae, com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecadd4f161a995fd4916e1c9e45ced52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecadd4f161a995fd4916e1c9e45ced52");
        } else {
            com.dianping.sdk.pike.i.a("SendBean", String.format("send rrpc reply message failed, requestId: %s, messageId: %s, errCode %s.", this.i, this.f, Integer.valueOf(i)));
        }
    }
}
