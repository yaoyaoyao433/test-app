package com.meituan.android.legwork.common.hostInfo;

import com.meituan.android.common.dfingerprint.DFPInfoProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements DFPInfoProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String business() {
        return "DP";
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String dpid() {
        return "DP";
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String optional() {
        return null;
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String source() {
        return "DP";
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getMagicNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8b52f7d52a61e768ad55c883be0634e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8b52f7d52a61e768ad55c883be0634e");
        }
        b.e();
        return b.j();
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getPushToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec78757cbc87757101f8c4cd6fbff77b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec78757cbc87757101f8c4cd6fbff77b") : b.e().b();
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71158eb67ca657b93f9e3466125bff9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71158eb67ca657b93f9e3466125bff9f");
        }
        b e = b.e();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        return PatchProxy.isSupport(objArr2, e, changeQuickRedirect2, false, "254d7997da1c48eaf4095d1bb85dad20", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, e, changeQuickRedirect2, false, "254d7997da1c48eaf4095d1bb85dad20") : com.sankuai.waimai.kit.a.a().c();
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getUUID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b073955336b61ee5e62158b9da69f317", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b073955336b61ee5e62158b9da69f317") : b.e().f();
    }
}
