package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class m0 implements b {
    public l0 a;

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.a = new l0(context);
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public String d() {
        return null;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        return "1".equals(a("persist.sys.identifierid.supported", "0"));
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void j() {
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean k() {
        return true;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void l() {
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public String a() {
        return this.a.a(0, "");
    }

    public static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
