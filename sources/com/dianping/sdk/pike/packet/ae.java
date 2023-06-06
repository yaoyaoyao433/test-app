package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ae extends aa {
    public static ChangeQuickRedirect a;
    @SerializedName(com.huawei.hms.opendevice.c.a)
    @Expose
    public byte[] b;

    @Override // com.dianping.sdk.pike.packet.j
    public int a() {
        return 15;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public String b() {
        return "pike_message_send";
    }

    @Override // com.dianping.sdk.pike.packet.j
    public final byte[] e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d6fdb6dc411e2b18257a52925c69f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d6fdb6dc411e2b18257a52925c69f0");
        }
        if (this.b != null) {
            byte[] bArr = this.b;
            this.l = bArr;
            this.b = null;
            return bArr;
        }
        return g();
    }

    @Override // com.dianping.sdk.pike.packet.l
    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e885936358929183c78d0994360b827b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e885936358929183c78d0994360b827b");
            return;
        }
        super.a(j);
        com.dianping.sdk.pike.i.a("SendBean", String.format("send message success, requestId: %s, messageId: %s.", this.i, this.f));
        com.dianping.sdk.pike.util.f.a(com.dianping.sdk.pike.util.f.a(com.dianping.sdk.pike.metrics.c.UpLinkMessage, this.e, h()));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4409b6616edaae7fa1bc36a33573194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4409b6616edaae7fa1bc36a33573194");
            return;
        }
        super.a(i, j);
        com.dianping.sdk.pike.i.a("SendBean", String.format("send message failed, requestId: %s, messageId: %s, errCode %s.", this.i, this.f, Integer.valueOf(i)));
    }
}
