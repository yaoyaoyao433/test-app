package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class t extends k {
    @SerializedName("s")
    @Expose
    public int a;
    @SerializedName("u")
    @Expose
    public String b;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 26;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final boolean b() {
        return this.a == 1;
    }
}
