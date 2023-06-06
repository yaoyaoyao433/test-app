package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class al extends l {
    public static ChangeQuickRedirect a;
    @SerializedName("b")
    @Expose
    public String b;
    @SerializedName("t")
    @Expose
    public List<am> c;
    @SerializedName("o")
    @Expose
    public int d;
    public List<String> e;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 35;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505a0f795b46be8569c8861844829273", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505a0f795b46be8569c8861844829273") : this.d == 0 ? "pike_begin_sync" : (this.d == 1 || this.d == 2) ? "pike_end_sync" : super.b();
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44d28edd07e7a37a5741ed6d47b94bcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44d28edd07e7a37a5741ed6d47b94bcd");
            return;
        }
        super.a(j);
        com.dianping.sdk.pike.i.a("SendBean", String.format("%s sync success, requestId: %s, bizId: %s.", c(), this.i, this.b));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d0a4f827feab9b3649164014e94422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d0a4f827feab9b3649164014e94422");
            return;
        }
        super.a(i, j);
        com.dianping.sdk.pike.i.a("SendBean", String.format("%s sync failed, requestId: %s, bizId: %s, errCode: %s.", c(), this.i, this.b, Integer.valueOf(i)));
    }

    private String c() {
        return this.d == 0 ? "begin" : "end";
    }
}
