package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class r extends k {
    public static ChangeQuickRedirect a;
    @SerializedName("s")
    @Expose
    public int b;
    @SerializedName("t")
    @Expose
    public long c;
    @SerializedName("tk")
    @Expose
    public String d;
    @SerializedName("si")
    @Expose
    public String e;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 6;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final boolean b() {
        return this.b == 1;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93dacbd39074d4a95d84532b2364bad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93dacbd39074d4a95d84532b2364bad");
            return;
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = com.dianping.sdk.pike.f.g() ? f() : "hide";
        com.dianping.sdk.pike.i.a("ReplyBean", String.format("inner login replay, data: %s.", objArr2));
    }
}
