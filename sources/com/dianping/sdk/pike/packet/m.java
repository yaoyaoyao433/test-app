package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class m extends k {
    @SerializedName("s")
    @Expose
    public int a;
    @SerializedName("b")
    @Expose
    public String b;
    @SerializedName("t")
    @Expose
    public Collection<String> c;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 12;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final boolean b() {
        return this.a == 1;
    }
}
