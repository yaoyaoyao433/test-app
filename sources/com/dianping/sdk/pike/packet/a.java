package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends k {
    @SerializedName("s")
    @Expose
    public int a;
    @SerializedName("al")
    @Expose
    public Collection<String> b;
    @SerializedName("b")
    @Expose
    public String c;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 8;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final boolean b() {
        return this.a == 1;
    }
}
