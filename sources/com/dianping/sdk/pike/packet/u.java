package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class u extends l {
    public static ChangeQuickRedirect a;
    @SerializedName("u")
    @Expose
    public String b;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 25;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        return "pike_user_id_login";
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b5888bbb19a7836a86f369d4df563dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b5888bbb19a7836a86f369d4df563dd");
            return;
        }
        super.a(j);
        Object[] objArr2 = new Object[2];
        objArr2[0] = this.i;
        objArr2[1] = com.dianping.sdk.pike.f.g() ? this.b : "hide";
        com.dianping.sdk.pike.i.a("SendBean", String.format("login user id success, requestId: %s, userId: %s.", objArr2));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "019decaef472fff278ff60e5e6c19ba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "019decaef472fff278ff60e5e6c19ba9");
            return;
        }
        super.a(i, j);
        Object[] objArr2 = new Object[3];
        objArr2[0] = this.i;
        objArr2[1] = com.dianping.sdk.pike.f.g() ? this.b : "hide";
        objArr2[2] = Integer.valueOf(i);
        com.dianping.sdk.pike.i.a("SendBean", String.format("login user id failed, requestId: %s, userId: %s, errCode %s.", objArr2));
    }
}
