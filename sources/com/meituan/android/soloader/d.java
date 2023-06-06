package com.meituan.android.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends m {
    public static ChangeQuickRedirect a;
    private Context b;
    private int c;
    private e d;

    public d(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03fd913ba91b39607dc8a2f6a0b7f5c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03fd913ba91b39607dc8a2f6a0b7f5c1");
            return;
        }
        this.b = context.getApplicationContext();
        if (this.b == null) {
            this.b = context;
        }
        this.c = i;
        this.d = new e(new File(this.b.getApplicationInfo().nativeLibraryDir), i);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5294e3c0d2160f363b472f48fc770b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5294e3c0d2160f363b472f48fc770b8")).booleanValue();
        }
        try {
            File file = this.d.e;
            File file2 = new File(this.b.createPackageContext(this.b.getPackageName(), 0).getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            StringBuilder sb = new StringBuilder("Native library directory updated from ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean b() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b86002064131a16cded0ffd907a2242", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b86002064131a16cded0ffd907a2242")).booleanValue();
        }
        try {
            File file = this.d.e;
            Context createPackageContext = this.b.createPackageContext(this.b.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            StringBuilder sb = new StringBuilder("Native library directory updated from ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            this.c |= 1;
            this.d = new e(file2, this.c);
            this.d.a(this.c);
            this.b = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.meituan.android.soloader.m
    public final int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        Object[] objArr = {str, Integer.valueOf(i), threadPolicy};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "738428706699b2c31f71e7abae39bd2e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "738428706699b2c31f71e7abae39bd2e")).intValue() : this.d.a(str, i, threadPolicy);
    }

    @Override // com.meituan.android.soloader.m
    @Nullable
    public final File a(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262f1454a55d3ed199f6f1565e498d92", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262f1454a55d3ed199f6f1565e498d92") : this.d.a(str);
    }

    @Override // com.meituan.android.soloader.m
    public final void a(int i) throws IOException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cffde4b47289d8c3320294dbdc712031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cffde4b47289d8c3320294dbdc712031");
        } else {
            this.d.a(i);
        }
    }

    @Override // com.meituan.android.soloader.m
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ba2f21ebe1b1f9d0c29adaa4840ba0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ba2f21ebe1b1f9d0c29adaa4840ba0") : this.d.toString();
    }
}
