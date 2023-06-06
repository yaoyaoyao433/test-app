package com.meituan.mmp.lib.msi;

import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f implements com.meituan.msi.provider.a {
    public static ChangeQuickRedirect a;
    public com.meituan.mmp.lib.config.a b;

    public f(com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b940fead355c54b339f95d64f867ad6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b940fead355c54b339f95d64f867ad6b");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.meituan.msi.provider.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98b7a6593c7de249e805095d0c8e89fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98b7a6593c7de249e805095d0c8e89fd");
        }
        if (str.equals("wdfile://usr") || str.equals("wdfile://usr/")) {
            return s.e(c());
        }
        if (str.equals("wdfile://store") || str.equals("wdfile://store/")) {
            return s.e(a() + File.separator + "store/");
        } else if (str.equals("wdfile://temp") || str.equals("wdfile://temp/")) {
            return s.e(b());
        } else {
            return s.a(MMPEnvHelper.getContext(), str, this.b);
        }
    }

    @Override // com.meituan.msi.provider.a
    public final File a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58879e6e1687e47e9227924904093690", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58879e6e1687e47e9227924904093690") : this.b.e(MMPEnvHelper.getContext());
    }

    @Override // com.meituan.msi.provider.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf31e0a73c8002674d59100d61e6ae9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf31e0a73c8002674d59100d61e6ae9") : this.b.c(MMPEnvHelper.getContext());
    }

    @Override // com.meituan.msi.provider.a
    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2072f78d387e4b5ecd46b4737ab92637", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2072f78d387e4b5ecd46b4737ab92637");
        }
        return "wdfile://" + str;
    }

    @Override // com.meituan.msi.provider.a
    public final String a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f88a90df15f12e629d097d894eb875f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f88a90df15f12e629d097d894eb875f2");
        }
        if (i == 0) {
            return "tmp_" + str;
        }
        return str;
    }

    @Override // com.meituan.msi.provider.a
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1735fb41ecc215a7e4c9d79cb13fbe78", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1735fb41ecc215a7e4c9d79cb13fbe78") : this.b.b(MMPEnvHelper.getContext());
    }
}
