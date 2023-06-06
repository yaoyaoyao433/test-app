package com.sankuai.waimai.platform.fingerprint;

import com.meituan.android.common.dfingerprint.DFPInfoProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements DFPInfoProvider {
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9ecf686614c676f28d7f55b84576b6e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9ecf686614c676f28d7f55b84576b6e") : com.sankuai.waimai.config.a.a().b();
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getPushToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d077178ac282bbe0f2973efc2a4bfd70", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d077178ac282bbe0f2973efc2a4bfd70") : b.A().D();
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47aa829cdcdd8157fa9c9c4067bc6faa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47aa829cdcdd8157fa9c9c4067bc6faa") : b.A().d();
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getUUID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458601638dd1bd8910ee17352db7a45c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458601638dd1bd8910ee17352db7a45c") : b.A().c();
    }
}
