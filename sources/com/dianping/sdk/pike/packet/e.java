package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e extends k {
    @SerializedName("b")
    @Expose
    public String a;
    @SerializedName(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)
    @Expose
    public String b;
    @SerializedName("t")
    @Expose
    public int c;
    @SerializedName("s")
    @Expose
    public int d;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 32;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final boolean b() {
        return this.d == 0;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final boolean c() {
        return this.d == -1;
    }
}
