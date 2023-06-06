package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends l {
    @SerializedName("b")
    @Expose
    public String a;
    @SerializedName(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)
    @Expose
    public String b;
    @SerializedName("lt")
    @Expose
    public long c;
    @SerializedName("lm")
    @Expose
    public String d;
    @SerializedName(com.huawei.hms.opendevice.c.a)
    @Expose
    public int e;
    @SerializedName("l")
    @Expose
    public String f;
    @SerializedName("lc")
    @Expose
    public int g;
    @SerializedName("lvc")
    @Expose
    public int h;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 29;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        return "pike_agg_pull";
    }
}
