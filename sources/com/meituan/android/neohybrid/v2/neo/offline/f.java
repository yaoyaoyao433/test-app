package com.meituan.android.neohybrid.v2.neo.offline;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public final String b;
    public final Map<String, String> c;
    public String d;
    public String e;
    public int f;
    public byte[] g;

    public f(String str, Map<String, String> map, byte[] bArr) {
        Object[] objArr = {str, map, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f21759a50f4830551f5ea5aa90c073", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f21759a50f4830551f5ea5aa90c073");
            return;
        }
        this.d = "UTF-8";
        this.e = "OK";
        this.f = 200;
        this.b = str;
        this.c = map;
        this.g = bArr;
    }

    public f(String str, String str2, int i, @NonNull String str3, Map<String, String> map, byte[] bArr) {
        Object[] objArr = {str, str2, 200, str3, map, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0034ac4e53fc6654b24a2056a5162db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0034ac4e53fc6654b24a2056a5162db");
            return;
        }
        this.d = "UTF-8";
        this.e = "OK";
        this.f = 200;
        this.b = str;
        this.d = str2;
        this.f = 200;
        this.e = str3;
        this.c = map;
        this.g = bArr;
    }
}
