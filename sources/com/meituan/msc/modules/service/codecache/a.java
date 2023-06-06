package com.meituan.msc.modules.service.codecache;

import android.text.TextUtils;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends CodeCacheKey {
    public static ChangeQuickRedirect a;
    final DioFile b;
    final String c;
    private final PackageInfoWrapper d;
    private String e;
    private String f;
    private com.meituan.msc.modules.update.packageattachment.d g;

    public a(String str, String str2, PackageInfoWrapper packageInfoWrapper, DioFile dioFile, String str3) {
        super(str, str2 == null ? packageInfoWrapper.getVersion() : str2, packageInfoWrapper.getDDResourceName(), dioFile.a());
        Object[] objArr = {str, str2, packageInfoWrapper, dioFile, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1b3cd1191ccc4dd1fbabcaea53f078", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1b3cd1191ccc4dd1fbabcaea53f078");
            return;
        }
        this.d = packageInfoWrapper;
        this.b = dioFile;
        this.c = str3;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "369c14ab3b57f11401caf684944e6e64", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "369c14ab3b57f11401caf684944e6e64") : this.b.a();
    }

    public final String b() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27083dd021c816d792580c202f034808", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27083dd021c816d792580c202f034808");
        }
        if (this.f == null) {
            StringBuilder sb = new StringBuilder("cc_");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba31b6c0a0e47110cbf046a76e5e9e6e", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba31b6c0a0e47110cbf046a76e5e9e6e");
            } else {
                if (this.e == null) {
                    String md5 = this.d.getMd5();
                    if (TextUtils.isEmpty(md5)) {
                        md5 = String.valueOf(this.d.getLocalPath().hashCode());
                    }
                    this.e = md5;
                }
                str = this.e;
            }
            sb.append(str);
            sb.append(a());
            this.f = sb.toString();
        }
        return this.f;
    }

    public final com.meituan.msc.modules.update.packageattachment.d c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44dd2b78a1d14b3a9d76de4052b87c47", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.update.packageattachment.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44dd2b78a1d14b3a9d76de4052b87c47");
        }
        if (this.g == null) {
            com.meituan.msc.modules.update.packageattachment.e a2 = com.meituan.msc.modules.update.packageattachment.e.a();
            PackageInfoWrapper packageInfoWrapper = this.d;
            Object[] objArr2 = {packageInfoWrapper};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.update.packageattachment.e.a;
            this.g = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "6b915be62c53836473202318556f1887", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.update.packageattachment.d) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "6b915be62c53836473202318556f1887") : new com.meituan.msc.modules.update.packageattachment.d(a2, packageInfoWrapper);
        }
        return this.g;
    }
}
