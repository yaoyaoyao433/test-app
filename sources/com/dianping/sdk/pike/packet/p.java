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
public final class p extends l {
    public static ChangeQuickRedirect a;
    @SerializedName("b")
    @Expose
    public String b;
    @SerializedName("al")
    @Expose
    public String c;
    @SerializedName("t")
    @Expose
    public int d;
    @SerializedName("e")
    @Expose
    public Map<String, String> e;
    @SerializedName(KiteFlyConstants.RT_NAME)
    @Expose
    public String f;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 33;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        return "pike_biz_id_login";
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf69ed4ba613d1f5d0e35e3a76733362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf69ed4ba613d1f5d0e35e3a76733362");
            return;
        }
        super.a(j);
        Object[] objArr2 = new Object[2];
        objArr2[0] = this.i;
        objArr2[1] = com.dianping.sdk.pike.f.g() ? f() : "hide";
        com.dianping.sdk.pike.i.a("SendBean", String.format("biz login success, requestId: %s, data: %s.", objArr2));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77d73e6887f3488bcf2f91841d77ae17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77d73e6887f3488bcf2f91841d77ae17");
            return;
        }
        super.a(i, j);
        Object[] objArr2 = new Object[3];
        objArr2[0] = this.i;
        objArr2[1] = com.dianping.sdk.pike.f.g() ? f() : "hide";
        objArr2[2] = Integer.valueOf(i);
        com.dianping.sdk.pike.i.a("SendBean", String.format("biz login failed, requestId: %s, data: %s, errCode %s.", objArr2));
    }
}
