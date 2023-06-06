package com.meituan.dio.easy;

import com.meituan.dio.e;
import com.meituan.dio.utils.d;
import com.meituan.dio.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final b b = new b();
    private boolean c;
    private int d;
    private final d<String, a> e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public e a;
        public long b;

        public a(e eVar, long j) {
            this.b = -1L;
            this.a = eVar;
            this.b = j;
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc09bbb16a2538038bf51c637f139858", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc09bbb16a2538038bf51c637f139858");
            return;
        }
        this.c = true;
        this.d = 5;
        this.e = new d<>(this.d);
    }

    public final e a(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f896ad459c99db2ef5cea68640d568bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f896ad459c99db2ef5cea68640d568bd");
        }
        e eVar = null;
        if (f.a(str)) {
            return null;
        }
        File file = new File(str);
        if (this.c) {
            try {
                str = file.getCanonicalPath();
            } catch (IOException unused) {
            }
            a a2 = this.e.a((d<String, a>) str);
            if (a2 != null) {
                e eVar2 = a2.a;
                if (file.exists() && file.lastModified() == a2.b) {
                    z = false;
                }
                if (z) {
                    this.e.b(str);
                } else {
                    eVar = eVar2;
                }
            }
            if (eVar == null) {
                e eVar3 = new e(file);
                if (e.a(eVar3, false)) {
                    this.e.a(str, new a(eVar3, file.lastModified()));
                    return eVar3;
                }
                return eVar3;
            }
            return eVar;
        }
        return new e(file);
    }
}
