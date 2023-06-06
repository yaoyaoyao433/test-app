package com.meituan.msc.modules.update.packageattachment;

import android.text.TextUtils;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public e b;
    public PackageInfoWrapper c;

    public d(e eVar, PackageInfoWrapper packageInfoWrapper) {
        Object[] objArr = {eVar, packageInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bfffac1584f01f5de77cf271a295386", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bfffac1584f01f5de77cf271a295386");
            return;
        }
        this.b = eVar;
        this.c = packageInfoWrapper;
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7f9af1000775f2a64d245b462fc07c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7f9af1000775f2a64d245b462fc07c");
        }
        String md5 = this.c.getMd5();
        return TextUtils.isEmpty(md5) ? String.valueOf(this.c.getLocalPath().hashCode()) : md5;
    }

    public final File a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4f39599fe0a113cbea711e8bd1ab852", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4f39599fe0a113cbea711e8bd1ab852") : new File(a(), str);
    }

    public final File a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97f99e2e9df0069380db8a6e193cebdf", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97f99e2e9df0069380db8a6e193cebdf") : new File(this.b.b(), b());
    }
}
