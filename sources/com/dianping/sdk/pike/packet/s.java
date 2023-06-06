package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class s extends l {
    public static ChangeQuickRedirect a;
    @SerializedName("a")
    @Expose
    public int b;
    @SerializedName("f")
    @Expose
    public int c;
    @SerializedName(com.huawei.hms.opendevice.c.a)
    @Expose
    public String d;
    @SerializedName("v")
    @Expose
    public String e;
    @SerializedName("p")
    @Expose
    public final int f;
    @SerializedName("lo")
    @Expose
    public String g;
    @SerializedName("la")
    @Expose
    public String h;
    @SerializedName("ts")
    @Expose
    public Map<String, List<String>> m;
    @SerializedName("al")
    @Expose
    public Map<String, List<String>> n;
    @SerializedName("ms")
    @Expose
    public Map<String, Long> o;
    @SerializedName("l")
    @Expose
    public Map<String, String> p;
    @SerializedName("st")
    @Expose
    public Map<String, List<am>> q;
    @SerializedName("u")
    @Expose
    public String r;
    @SerializedName("si")
    @Expose
    public String s;

    @Override // com.dianping.sdk.pike.packet.j
    public final int a() {
        return 5;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final String b() {
        return "pike_inner_login";
    }

    public s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e624ac9ef135bd01aab9794708283ffa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e624ac9ef135bd01aab9794708283ffa");
            return;
        }
        this.c = 1;
        this.f = 10;
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd75fbb21d94d91b59670ecebaf76360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd75fbb21d94d91b59670ecebaf76360");
            return;
        }
        super.a(j);
        Object[] objArr2 = new Object[2];
        objArr2[0] = this.i;
        objArr2[1] = com.dianping.sdk.pike.f.g() ? f() : "hide";
        com.dianping.sdk.pike.i.a("SendBean", String.format("inner login success, requestId: %s, data: %s.", objArr2));
    }

    @Override // com.dianping.sdk.pike.packet.l
    public final void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "619993d0f1e71d2f20d28fe6db5aca65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "619993d0f1e71d2f20d28fe6db5aca65");
            return;
        }
        super.a(i, j);
        Object[] objArr2 = new Object[3];
        objArr2[0] = this.i;
        objArr2[1] = com.dianping.sdk.pike.f.g() ? f() : "hide";
        objArr2[2] = Integer.valueOf(i);
        com.dianping.sdk.pike.i.a("SendBean", String.format("inner login failed, requestId: %s, data: %s, errCode %s.", objArr2));
    }
}
