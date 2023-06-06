package com.meituan.msc.modules.core;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.ag;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.update.e;
import com.meituan.msc.modules.update.f;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
@ModuleName(name = "FileModule")
/* loaded from: classes3.dex */
public class c extends k implements IFileModule {
    public static ChangeQuickRedirect a;
    private String b;
    private volatile String c;
    private volatile boolean d;

    @Override // com.meituan.msc.lib.interfaces.IFileModule
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baaf108f14abcee2dd89865203d49c84", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baaf108f14abcee2dd89865203d49c84")).booleanValue() : TextUtils.equals(str, "mscfile") || TextUtils.equals(str, "wdfile");
    }

    @Override // com.meituan.msc.lib.interfaces.IFileModule
    public final String a(String str) {
        DioFile dioFile;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f04220c91e1bd768616d97a4b76fe7a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f04220c91e1bd768616d97a4b76fe7a2");
        }
        if (str == null) {
            return null;
        }
        if (!str.startsWith("mscfile://msc_")) {
            return r.b(str, this);
        }
        f fVar = U_().r;
        String substring = str.substring(("mscfile://msc_" + U_().a()).length());
        Object[] objArr2 = {substring};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "552025893ae3d84d54d79e5af8b7a804", RobustBitConfig.DEFAULT_VALUE)) {
            dioFile = (DioFile) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "552025893ae3d84d54d79e5af8b7a804");
        } else {
            e s = fVar.s(substring);
            dioFile = s == null ? null : s.b;
        }
        if (dioFile != null && dioFile.c()) {
            return dioFile.h();
        }
        g.e(J_(), "file not exists", str);
        return null;
    }

    @Override // com.meituan.msc.lib.interfaces.IFileModule
    @Nullable
    public final DioFile b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0f8203e38da869e3b7b45187bede031", RobustBitConfig.DEFAULT_VALUE)) {
            return (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0f8203e38da869e3b7b45187bede031");
        }
        e s = U_().r.s(str);
        if (s == null) {
            return null;
        }
        return s.b;
    }

    @Override // com.meituan.msc.lib.interfaces.IFileModule
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9c1309d3bf7dc71be31ff12f4332dcb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9c1309d3bf7dc71be31ff12f4332dcb");
        }
        return ag.a(d()).getAbsolutePath() + ag.b;
    }

    @Override // com.meituan.msc.lib.interfaces.IFileModule
    public final String M_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c04aa47f865d227fff26470d9a3f2229", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c04aa47f865d227fff26470d9a3f2229");
        }
        return ag.c(d()).getAbsolutePath() + ag.b;
    }

    @Override // com.meituan.msc.lib.interfaces.IFileModule
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e03302c812d92fce01cc89448810746", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e03302c812d92fce01cc89448810746");
        }
        return ag.b(d()).getAbsolutePath() + ag.b;
    }

    @Override // com.meituan.msc.lib.interfaces.IFileModule
    public final File d() {
        String a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52d954a5fe7de001d5484ea17f50623b", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52d954a5fe7de001d5484ea17f50623b");
        }
        if (this.d) {
            a2 = ag.b(MSCEnvHelper.getContext());
        } else {
            a2 = ag.a(MSCEnvHelper.getContext());
        }
        return ag.a(a2, g());
    }

    @Override // com.meituan.msc.lib.interfaces.IFileModule
    public final String e() {
        return this.d ? "wdfile://" : "mscfile://";
    }

    @Override // com.meituan.msc.lib.interfaces.IFileModule
    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593ed53d3520cdce0e965a0081724831", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593ed53d3520cdce0e965a0081724831");
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = this.d ? ContainerInfo.ENV_MMP : ContainerInfo.ENV_MSC;
        objArr2[1] = g();
        objArr2[2] = !TextUtils.isEmpty(MSCEnvHelper.getEnvInfo().getUserID()) ? MSCEnvHelper.getEnvInfo().getUserID() : "";
        return String.format("%s_%s%s", objArr2);
    }

    @Override // com.meituan.msc.lib.interfaces.IFileModule
    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6765c8610def51ad242251f542c6931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6765c8610def51ad242251f542c6931");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.c = null;
            this.d = false;
        } else {
            this.c = str;
            this.d = true;
        }
        g.d("FileModule", "setCompatMMPAppId，mscAppID: ", h(), " mmpId:", str);
    }

    private String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48f3383bd299f6e0ecda3ec84c41fa4d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48f3383bd299f6e0ecda3ec84c41fa4d") : this.d ? this.c : h();
    }

    private String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "126b21c73a2f42bc4634763c129151e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "126b21c73a2f42bc4634763c129151e8");
        }
        if (this.b == null) {
            this.b = U_().a();
        }
        return this.b;
    }

    @Override // com.meituan.msc.modules.manager.k, com.meituan.msc.modules.manager.c
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce22caa2dd03c213d23df708cc22d07a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce22caa2dd03c213d23df708cc22d07a");
            return;
        }
        super.o();
        com.meituan.msc.common.executor.a.a(new Runnable() { // from class: com.meituan.msc.modules.core.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aebfa16e864ac07eff203c720e9265f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aebfa16e864ac07eff203c720e9265f3");
                    return;
                }
                r.a(c.this.c());
                ag.a(c.this.b, ag.c(c.this.d()));
            }
        });
    }
}
