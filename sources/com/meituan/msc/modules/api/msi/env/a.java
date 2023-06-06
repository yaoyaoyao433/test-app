package com.meituan.msc.modules.api.msi.env;

import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.modules.engine.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.meituan.msi.provider.a {
    public static ChangeQuickRedirect a;
    public h b;

    public a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5177147f0a717cd725d46649af439431", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5177147f0a717cd725d46649af439431");
        } else {
            this.b = hVar;
        }
    }

    @Override // com.meituan.msi.provider.a
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73149a84ed19973d643d3151481f69d5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73149a84ed19973d643d3151481f69d5") : ((IFileModule) this.b.c(IFileModule.class)).a(str);
    }

    @Override // com.meituan.msi.provider.a
    public final File a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c1cb481b9a4d8815c5cca153f409c35", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c1cb481b9a4d8815c5cca153f409c35") : ((IFileModule) this.b.c(IFileModule.class)).d();
    }

    @Override // com.meituan.msi.provider.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8955a5e32632c03f917ba790656365c6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8955a5e32632c03f917ba790656365c6") : ((IFileModule) this.b.c(IFileModule.class)).c();
    }

    @Override // com.meituan.msi.provider.a
    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52583e2e2571fe6b171e26469e24c217", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52583e2e2571fe6b171e26469e24c217");
        }
        return ((IFileModule) this.b.c(IFileModule.class)).e() + str;
    }

    @Override // com.meituan.msi.provider.a
    public final String a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6a36900ba3cdbd10ca5d0c1beb2b06", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6a36900ba3cdbd10ca5d0c1beb2b06");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d7b1a12c957fedaf52e6260328935fb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d7b1a12c957fedaf52e6260328935fb") : ((IFileModule) this.b.c(IFileModule.class)).M_();
    }
}
