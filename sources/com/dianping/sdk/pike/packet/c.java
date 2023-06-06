package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c extends k {
    @SerializedName("b")
    @Expose
    public String a;
    @SerializedName(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)
    @Expose
    public String b;
    @SerializedName("ms")
    @Expose
    public Collection<g> c;
    @SerializedName("lt")
    @Expose
    public long d;
    @SerializedName("lm")
    @Expose
    public String e;
    @SerializedName(AdvertisementOption.PRIORITY_VALID_TIME)
    @Expose
    public long f;
    @SerializedName("ri")
    @Expose
    public int g;
    public int h;
    public int i;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 30;
    }
}
