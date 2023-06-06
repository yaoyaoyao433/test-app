package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.kitefly.KiteFlyConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class o extends k {
    public static ChangeQuickRedirect a;
    @SerializedName("b")
    @Expose
    public String b;
    @SerializedName("al")
    @Expose
    public String c;
    @SerializedName("s")
    @Expose
    public boolean d;
    @SerializedName("e")
    @Expose
    public Map<String, String> e;
    @SerializedName(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)
    @Expose
    public boolean f;
    @SerializedName("mw")
    @Expose
    public int g;
    @SerializedName("mr")
    @Expose
    public int h;
    @SerializedName("mi")
    @Expose
    public int i;
    @SerializedName(KiteFlyConstants.RT_NAME)
    @Expose
    public String m;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 34;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final boolean b() {
        return this.d;
    }

    @Override // com.dianping.sdk.pike.packet.k
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51050ba2c93a8712a222b096477d677e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51050ba2c93a8712a222b096477d677e");
            return;
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = com.dianping.sdk.pike.f.g() ? f() : "hide";
        com.dianping.sdk.pike.i.a("ReplyBean", String.format("biz login replay, data: %s.", objArr2));
    }
}
