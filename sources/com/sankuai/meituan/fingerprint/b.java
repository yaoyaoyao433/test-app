package com.sankuai.meituan.fingerprint;

import com.meituan.android.common.dfingerprint.DFPInfoProvider;
import com.meituan.android.common.fingerprint.info.AccelerometerInfo;
import com.meituan.android.common.fingerprint.info.LocationInfo;
import com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.privacy.locate.f;
import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements DFPInfoProvider, FingerprintInfoProvider {
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
    public final String getMagicNumber() {
        return "428410883";
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final String key() {
        return "kwBq8snI";
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String optional() {
        return null;
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String source() {
        return "DP";
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final long serverCurrentTimeMillions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "176dbea6de56c917c4f66a8fe3480551", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "176dbea6de56c917c4f66a8fe3480551")).longValue() : c.b();
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getUUID() {
        return com.meituan.android.base.a.h;
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getPushToken() {
        return com.meituan.android.base.a.i;
    }

    @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
    public final String getChannel() {
        return com.meituan.android.base.a.f;
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final LocationInfo getCachedLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d96b7478a5fe3306bfcd1749b5fdbe6", RobustBitConfig.DEFAULT_VALUE)) {
            return (LocationInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d96b7478a5fe3306bfcd1749b5fdbe6");
        }
        MtLocation a2 = f.a().a("pylon:basemodule");
        if (a2 == null) {
            return null;
        }
        return new LocationInfo(a2.getLatitude(), a2.getLongitude());
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final List<AccelerometerInfo> getAccelerometerInfoList() {
        return a.a;
    }
}
