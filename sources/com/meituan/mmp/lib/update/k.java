package com.meituan.mmp.lib.update;

import android.text.TextUtils;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class k implements b {
    public static ChangeQuickRedirect a;
    private static final k b = new k();
    private static volatile b c;

    public static k a() {
        return b;
    }

    private static b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21840786efa2ca52f592eec58bd906d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21840786efa2ca52f592eec58bd906d9");
        }
        if (c == null) {
            synchronized (k.class) {
                if (c == null) {
                    c = (b) IPCInvoke.a(k.class, com.meituan.mmp.lib.mp.a.MAIN);
                }
            }
        }
        return c;
    }

    @Override // com.meituan.mmp.lib.update.b
    public final void a(MMPUpdateConfig mMPUpdateConfig, i iVar, m mVar) {
        Object[] objArr = {mMPUpdateConfig, iVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "372be3bc1ff09361c2ea86eb7c95c7db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "372be3bc1ff09361c2ea86eb7c95c7db");
        } else if (mMPUpdateConfig == null || TextUtils.isEmpty(mMPUpdateConfig.d)) {
        } else {
            if (!com.meituan.mmp.lib.mp.a.f()) {
                b().a(mMPUpdateConfig, new j(iVar), mVar);
            } else {
                l.a().post(new d(MMPEnvHelper.getContext(), mMPUpdateConfig, iVar, mVar));
            }
        }
    }

    @Override // com.meituan.mmp.lib.update.b
    public final void a(boolean z, boolean z2, MMPUpdateConfig mMPUpdateConfig, i iVar, i iVar2, m mVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), mMPUpdateConfig, iVar, iVar2, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be10229b0ef379cef3068db27aa4c94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be10229b0ef379cef3068db27aa4c94");
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            b().a(z, z2, mMPUpdateConfig, new j(iVar), new j(iVar2), mVar);
        } else {
            if (z2) {
                mMPUpdateConfig.h = 7;
            } else {
                mMPUpdateConfig.h = 1;
            }
            if (z) {
                l.a().post(new e(MMPEnvHelper.getContext(), mMPUpdateConfig, iVar, mVar, iVar2, new a(new com.meituan.mmp.lib.trace.h(MMPEnvHelper.getContext(), mMPUpdateConfig.b))));
            } else {
                l.a().a(mMPUpdateConfig, iVar, mVar);
            }
        }
    }

    public final boolean a(MMPAppProp mMPAppProp, String str, i iVar, m mVar) {
        Object[] objArr = {mMPAppProp, str, iVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "240dc4ff3a4e455bfe59afa40f854826", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "240dc4ff3a4e455bfe59afa40f854826")).booleanValue();
        }
        if (mMPAppProp == null) {
            return false;
        }
        MMPPackageInfo subPackageByPath = mMPAppProp.getSubPackageByPath(MMPEnvHelper.getContext(), str);
        if (subPackageByPath == null || subPackageByPath.u) {
            iVar.a(mMPAppProp, (ArrayList) com.meituan.mmp.lib.utils.h.a(subPackageByPath));
            return true;
        }
        a(mMPAppProp, str, subPackageByPath, iVar, mVar);
        return false;
    }

    @Override // com.meituan.mmp.lib.update.b
    public final void a(MMPAppProp mMPAppProp, String str, MMPPackageInfo mMPPackageInfo, i iVar, m mVar) {
        Object[] objArr = {mMPAppProp, str, mMPPackageInfo, iVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2deded88024b4eb26ae804a614821ba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2deded88024b4eb26ae804a614821ba4");
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            b().a(mMPAppProp, str, mMPPackageInfo, new j(iVar), mVar);
        } else {
            MMPUpdateConfig mMPUpdateConfig = new MMPUpdateConfig();
            mMPUpdateConfig.b = mMPAppProp.appid;
            mMPUpdateConfig.l = str;
            mMPUpdateConfig.m = com.meituan.mmp.lib.utils.h.a(mMPPackageInfo);
            mMPUpdateConfig.h = 1;
            l.a().a(mMPUpdateConfig, mMPAppProp, iVar, mVar);
        }
    }

    @Override // com.meituan.mmp.lib.update.b
    public final void a(MMPAppProp mMPAppProp, String str, List<MMPPackageInfo> list, i iVar, m mVar) {
        Object[] objArr = {mMPAppProp, str, list, iVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c75d6a68d718af86b1c249eb7f79226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c75d6a68d718af86b1c249eb7f79226");
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            b().a(mMPAppProp, str, list, new j(iVar), mVar);
        } else {
            MMPUpdateConfig mMPUpdateConfig = new MMPUpdateConfig();
            mMPUpdateConfig.b = mMPAppProp.appid;
            mMPUpdateConfig.m = list;
            mMPUpdateConfig.l = str;
            mMPUpdateConfig.h = 4;
            l.a().a(mMPUpdateConfig, mMPAppProp, iVar, mVar);
        }
    }

    @Override // com.meituan.mmp.lib.update.b
    public final void b(MMPUpdateConfig mMPUpdateConfig, i iVar, m mVar) {
        Object[] objArr = {mMPUpdateConfig, iVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f9ce65e2215ec7452af5e650437fae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f9ce65e2215ec7452af5e650437fae6");
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            b().b(mMPUpdateConfig, new j(iVar), mVar);
        } else {
            if (mMPUpdateConfig.h == 0) {
                mMPUpdateConfig.h = 3;
            }
            l.a().a(mMPUpdateConfig, iVar, mVar);
        }
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e75d11dc5c39801a86752534ee787d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e75d11dc5c39801a86752534ee787d2");
        } else {
            l.a().post(runnable);
        }
    }
}
