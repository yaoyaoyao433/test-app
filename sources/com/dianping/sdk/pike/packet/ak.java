package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ak extends k {
    @SerializedName("s")
    @Expose
    public int a;
    @SerializedName("t")
    @Expose
    public List<am> b;
    @SerializedName("b")
    @Expose
    public String c;
    @SerializedName("o")
    @Expose
    public int d;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 36;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final boolean b() {
        return this.a == 1;
    }
}
