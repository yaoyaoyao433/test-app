package com.dianping.sdk.pike.packet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class af {
    public static ChangeQuickRedirect a;
    @SerializedName("v")
    @Expose
    public final int b;
    @SerializedName(com.huawei.hms.opendevice.c.a)
    @Expose
    public final int c;
    @SerializedName("d")
    @Expose
    public final String d;
    @SerializedName(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o)
    @Expose
    public final String e;
    public j f;
    public boolean g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    public af(String str, j jVar, boolean z) {
        String d;
        Object[] objArr = {str, jVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55c8325c0b6ea46ad6cae26ea3e7705d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55c8325c0b6ea46ad6cae26ea3e7705d");
            return;
        }
        this.b = 1;
        this.e = str;
        this.f = jVar;
        this.g = z;
        this.c = jVar != null ? jVar.a() : 0;
        if (z) {
            this.i = jVar != null ? jVar.e() : null;
            this.h = jVar != null ? jVar.d().getBytes() : null;
        } else if (jVar != null) {
            d = jVar.d();
            this.d = d;
        }
        d = "";
        this.d = d;
    }

    public af(int i, int i2, byte[] bArr, byte[] bArr2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b7238dd460743245fa2c5669aeb95e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b7238dd460743245fa2c5669aeb95e8");
            return;
        }
        this.b = 1;
        this.e = i > 0 ? String.valueOf(i) : "";
        this.c = i2;
        this.i = bArr2;
        this.h = bArr;
        this.d = new String(bArr);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d7dd2351ad14bd61ada9ca284c51d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d7dd2351ad14bd61ada9ca284c51d8");
        }
        return "Packet{version=" + this.b + ", command=" + this.c + ", data='" + this.d + "', requestId='" + this.e + "'}";
    }
}
