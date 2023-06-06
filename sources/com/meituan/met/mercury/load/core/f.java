package com.meituan.met.mercury.load.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f extends RuntimeException {
    public static ChangeQuickRedirect b;
    private String a;
    public final int c;
    public String d;
    public String e;

    public f(short s, String str) {
        this(s, str, (Throwable) null);
        Object[] objArr = {Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec61688f260688198d7505fe66aca7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec61688f260688198d7505fe66aca7c");
        }
    }

    public f(short s, String str, String str2) {
        this(s, str, str2, "", null);
        Object[] objArr = {Short.valueOf(s), str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "307feb367d6a10350cd65c5163ea1aa4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "307feb367d6a10350cd65c5163ea1aa4");
        }
    }

    public f(short s, String str, String str2, String str3) {
        this(s, str, str2, str3, null);
        Object[] objArr = {Short.valueOf(s), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1175914180c6c943df46989a03d0761", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1175914180c6c943df46989a03d0761");
        }
    }

    public f(short s, String str, Throwable th) {
        this(s, str, "", "", th);
        Object[] objArr = {Short.valueOf(s), str, th};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74d0555aff4fead85f1ad25ffaeaebef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74d0555aff4fead85f1ad25ffaeaebef");
        }
    }

    public f(short s, String str, String str2, String str3, Throwable th) {
        super(th);
        Object[] objArr = {Short.valueOf(s), str, str2, str3, th};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "905b313459f2ad684dff603b5b8feb55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "905b313459f2ad684dff603b5b8feb55");
            return;
        }
        this.c = s;
        this.d = str2;
        this.e = str3;
        this.a = str;
    }

    public final int a() {
        return this.c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa410072d29dbf3c45661ceee61ebc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa410072d29dbf3c45661ceee61ebc8");
        }
        return "customMsg=" + this.a + "; superMsg=" + super.getMessage();
    }

    @Override // java.lang.Throwable
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9ca9e6e5b3580154bf000a09df583f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9ca9e6e5b3580154bf000a09df583f");
        }
        return "DDLoaderException{errCode=" + this.c + ", resourceName='" + this.d + "', version='" + this.e + "', message='" + getMessage() + "'}";
    }
}
