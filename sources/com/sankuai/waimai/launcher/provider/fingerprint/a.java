package com.sankuai.waimai.launcher.provider.fingerprint;

import com.meituan.android.common.fingerprint.info.AccelerometerInfo;
import com.meituan.android.common.fingerprint.info.LocationInfo;
import com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider;
import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.platform.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements FingerprintInfoProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final String business() {
        return "DP";
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final String dpid() {
        return "DP";
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final String key() {
        return "kwBq8snI";
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final String source() {
        return "DP";
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final long serverCurrentTimeMillions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d51e957f75b7f9504c4bf02d77361d", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d51e957f75b7f9504c4bf02d77361d")).longValue() : c.b();
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final String getPushToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53d2fdee2d18da7848f87f40c552bf0b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53d2fdee2d18da7848f87f40c552bf0b") : b.A().D();
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final String getChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560943d1d468b471161f1af3965059d3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560943d1d468b471161f1af3965059d3") : b.A().d();
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final String getUUID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80ea24fd963fc3d65d4da468a1a5c5f4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80ea24fd963fc3d65d4da468a1a5c5f4") : b.A().c();
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final List<AccelerometerInfo> getAccelerometerInfoList() {
        return com.sankuai.waimai.kit.fingerPrint.a.c;
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final LocationInfo getCachedLocation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b37ef2f2fa028e081b460f18e34cea7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (LocationInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b37ef2f2fa028e081b460f18e34cea7e");
        }
        WMLocation j = g.j();
        if (j != null) {
            return new LocationInfo(j.getLatitude(), j.getLongitude());
        }
        return null;
    }

    @Override // com.meituan.android.common.fingerprint.provider.FingerprintInfoProvider
    public final String getMagicNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85e8cbaca9122eaa5a19d6bdcbb2da1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85e8cbaca9122eaa5a19d6bdcbb2da1") : com.sankuai.waimai.config.a.a().b();
    }
}
