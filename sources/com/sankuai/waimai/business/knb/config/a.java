package com.sankuai.waimai.business.knb.config;

import android.text.TextUtils;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.common.channel.ChannelReader;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.waimai.business.knb.webview.c;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements KNBWebManager.IEnvironment {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.titans.TitansBaseWebManager.IEnvironment
    public final String getCityId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0214dd1f156d7f45e28b7870edf4fbb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0214dd1f156d7f45e28b7870edf4fbb1");
        }
        City o = g.a().o();
        return o == null ? "" : o.getCityCode();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getCityName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5b5d358f55cd04adce47ead9b4eb07", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5b5d358f55cd04adce47ead9b4eb07");
        }
        City o = g.a().o();
        return o == null ? "" : o.getCityName();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getLocateCityId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "069a2df736e054b9ee8dbf17a158fa57", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "069a2df736e054b9ee8dbf17a158fa57");
        }
        City l = g.a().l();
        return l == null ? "" : l.getCityCode();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getLocateCityName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fd74ed9734f0eb2def08626cfc4414c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fd74ed9734f0eb2def08626cfc4414c");
        }
        City l = g.a().l();
        return l == null ? "" : l.getCityName();
    }

    @Override // com.dianping.titans.TitansBaseWebManager.IEnvironment
    public final String getLat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1f05f6e65e12b46db9a596cd7808684", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1f05f6e65e12b46db9a596cd7808684");
        }
        WMLocation i = g.a().i();
        if (i != null) {
            return String.valueOf(i.getLatitude());
        }
        return null;
    }

    @Override // com.dianping.titans.TitansBaseWebManager.IEnvironment
    public final String getLng() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d795c9f97a8c7f5b88b024eb35c0d8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d795c9f97a8c7f5b88b024eb35c0d8a");
        }
        WMLocation i = g.a().i();
        if (i != null) {
            return String.valueOf(i.getLongitude());
        }
        return null;
    }

    @Override // com.dianping.titans.TitansBaseWebManager.IEnvironment
    public final String getUUID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e023be41a682c1bceadedb13dfb8a5e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e023be41a682c1bceadedb13dfb8a5e") : com.sankuai.waimai.business.knb.services.a.a();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getFingerprint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "079b85c4f0c048885fdfa9fe78a9b2dc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "079b85c4f0c048885fdfa9fe78a9b2dc") : com.sankuai.waimai.kit.fingerPrint.a.a().b.fingerprint();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getDeviceId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33aae207548047402152c947b6d857e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33aae207548047402152c947b6d857e9");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.knb.services.a.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aaa8c0daed1b715ca7f0ccf6f6b95b89", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aaa8c0daed1b715ca7f0ccf6f6b95b89") : com.sankuai.waimai.platform.b.A().b();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getWebviewUri() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f292cf7fc707216d3a1b7d214ce0bc1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f292cf7fc707216d3a1b7d214ce0bc1c");
        }
        return com.sankuai.waimai.foundation.router.interfaces.b.c + "/browser";
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getKNBAppId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b26c4ec9b60b3f95d0ad3eda5f44e18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b26c4ec9b60b3f95d0ad3eda5f44e18");
        }
        com.sankuai.waimai.config.a a2 = com.sankuai.waimai.config.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.config.a.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "742e9dc5710bbfd5bc5266dcf0675c61", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "742e9dc5710bbfd5bc5266dcf0675c61") : a2.b.f();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final Map<String, String> getAppInfoExtras() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfd04f38703089653d71958d4a18e005", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfd04f38703089653d71958d4a18e005");
        }
        HashMap hashMap = new HashMap();
        if (com.sankuai.waimai.foundation.core.a.c()) {
            hashMap.put(GetAppInfoJsHandler.EXTRA_PACKAGE_TYPE, "prod");
        } else if (com.sankuai.waimai.foundation.core.a.a()) {
            hashMap.put(GetAppInfoJsHandler.EXTRA_PACKAGE_TYPE, GetAppInfoJsHandler.PACKAGE_TYPE_DEV);
        } else if (com.sankuai.waimai.foundation.core.a.b()) {
            hashMap.put(GetAppInfoJsHandler.EXTRA_PACKAGE_TYPE, "test");
        }
        String channel = ChannelReader.getChannel(com.meituan.android.singleton.b.a);
        if (TextUtils.isEmpty(channel)) {
            hashMap.put(GetAppInfoJsHandler.EXTRA_DOWNLOAD_CHANNEL, "unknown");
        } else {
            hashMap.put(GetAppInfoJsHandler.EXTRA_DOWNLOAD_CHANNEL, channel);
        }
        return hashMap;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final boolean geolocationEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae07832c9750bf2016e1df3ebb4f1c73", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae07832c9750bf2016e1df3ebb4f1c73")).booleanValue() : KNBConfig.getBooleanConfig(KNBConfig.CONFIG_SWITCH_ALLOW_GEOLOCATION, false);
    }

    @Override // com.dianping.titans.TitansBaseWebManager.IEnvironment
    public final String getUserToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a60db474b26ee376fe6c90d8ef8b3aff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a60db474b26ee376fe6c90d8ef8b3aff");
        }
        User a2 = com.sankuai.waimai.business.knb.util.b.a(com.meituan.android.singleton.b.a);
        return (a2 == null || c.c) ? "" : a2.token;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getUserId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96330eabb0039b16009402f2a1adff7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96330eabb0039b16009402f2a1adff7c");
        }
        User a2 = com.sankuai.waimai.business.knb.util.b.a(com.meituan.android.singleton.b.a);
        return a2 == null ? "" : String.valueOf(a2.id);
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getIMEI() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fefdd854a3a38377f6e596859cb38b77", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fefdd854a3a38377f6e596859cb38b77") : AppUtil.getIMEI1(com.meituan.android.singleton.b.a);
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getMac() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5522d2fedb2c34d556edf0141e11fa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5522d2fedb2c34d556edf0141e11fa") : AppUtil.getWifiMac(com.meituan.android.singleton.b.a);
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e3a7fd7846ccdee70d9ba507d4feb3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e3a7fd7846ccdee70d9ba507d4feb3") : ChannelReader.getChannel(com.meituan.android.singleton.b.a);
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IEnvironment
    public final String getDeviceLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7736dc1ebfcc8f93f898104deb42194", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7736dc1ebfcc8f93f898104deb42194");
        }
        DeviceUtil.LEVEL deviceLevel = DeviceUtil.getDeviceLevel(com.meituan.android.singleton.b.a);
        return deviceLevel == null ? DeviceUtil.LEVEL.UN_KNOW.name() : deviceLevel.name();
    }
}
