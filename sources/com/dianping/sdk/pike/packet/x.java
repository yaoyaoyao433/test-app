package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class x extends k {
    @SerializedName("s")
    @Expose
    public int a;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 10;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final boolean b() {
        return this.a == 1;
    }
}
