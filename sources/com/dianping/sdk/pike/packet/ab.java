package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ab extends k {
    public static ChangeQuickRedirect a;
    @SerializedName("m")
    @Expose
    public String b;
    @SerializedName("b")
    @Expose
    public String c;
    @SerializedName("t")
    @Expose
    public long d;
    @SerializedName(com.huawei.hms.opendevice.c.a)
    @Expose
    public byte[] e;
    @SerializedName("o")
    @Expose
    public long f;
    @SerializedName("s")
    @Expose
    public String g;

    @Override // com.dianping.sdk.pike.packet.j
    public int a() {
        return 14;
    }

    @Override // com.dianping.sdk.pike.packet.j
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0391b37604fe4e940ccd478836a13730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0391b37604fe4e940ccd478836a13730");
        } else if (bArr != null) {
            this.e = bArr;
            this.l = bArr;
        }
    }
}
