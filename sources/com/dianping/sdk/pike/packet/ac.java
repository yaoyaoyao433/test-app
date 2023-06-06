package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ac extends l {
    @SerializedName("m")
    @Expose
    public String a;
    @SerializedName("s")
    @Expose
    public int b;
    @SerializedName("b")
    @Expose
    public String c;

    @Override // com.dianping.sdk.pike.packet.j
    public int a() {
        return 13;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public String b() {
        return "pike_ack_send";
    }
}
