package com.meituan.android.pay.model.bean;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.paybase.config.a;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class QuickBankDetail implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2697104023483622287L;
    @SerializedName("appList")
    private List<HashMap<String, Object>> appList;
    private HashMap<String, Object> firstBankDetailExtra;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    private String icon;
    @SerializedName("name")
    private String name;
    private boolean onApp;
    private ProtocolSign protocolSign;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public List<HashMap<String, Object>> getAppList() {
        return this.appList;
    }

    public void setAppList(List<HashMap<String, Object>> list) {
        this.appList = list;
    }

    public HashMap<String, Object> getQuickBankExtra() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56a2d860704b158622bc508b305f9abc", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56a2d860704b158622bc508b305f9abc");
        }
        if (i.a((Collection) this.appList)) {
            return null;
        }
        for (HashMap<String, Object> hashMap : this.appList) {
            if (hashMap != null && (isAppAvailable(hashMap) || isH5Available(hashMap))) {
                return hashMap;
            }
        }
        return null;
    }

    public boolean isAppAvailable(HashMap<String, Object> hashMap) {
        boolean z = true;
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de8b53122c7574ef0a0332504f221587", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de8b53122c7574ef0a0332504f221587")).booleanValue();
        }
        if (hashMap.get("packageName") == null) {
            return false;
        }
        PackageInfo installedAppInfo = getInstalledAppInfo(String.valueOf(hashMap.get("packageName")), 0);
        z = (installedAppInfo == null || hashMap.get("version") == null || installedAppInfo.versionCode < ((Integer) hashMap.get("version")).intValue() || hashMap.get("url") == null) ? false : false;
        setOnApp(z);
        return z;
    }

    public boolean isH5Available(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f23ddfb3ea5c2118beea53eed27afee", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f23ddfb3ea5c2118beea53eed27afee")).booleanValue() : (hashMap.get("h5Url") == null || TextUtils.isEmpty(hashMap.get("h5Url").toString())) ? false : true;
    }

    private static PackageManager getPackageManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "424ae3c1fcb6009bc92fcc47e581e533", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "424ae3c1fcb6009bc92fcc47e581e533");
        }
        Context a = a.d().a();
        if (a != null) {
            return a.getPackageManager();
        }
        throw new RuntimeException("ApplicationContext is null");
    }

    private static PackageInfo getInstalledAppInfo(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30787de8e578ec99af70b4b7bdba7b3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30787de8e578ec99af70b4b7bdba7b3b");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return getPackageManager().getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "PackageUtils_getInstalledAppInfo", (Map<String, Object>) null);
            return null;
        }
    }

    public boolean isOnApp() {
        return this.onApp;
    }

    public void setOnApp(boolean z) {
        this.onApp = z;
    }

    public boolean isAvailableToShow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ef88bdbf52bd3336486446e488c6010", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ef88bdbf52bd3336486446e488c6010")).booleanValue();
        }
        HashMap<String, Object> quickBankExtra = getQuickBankExtra();
        setFirstBankDetailExtra(quickBankExtra);
        return ag.a(this.name, this.icon) && quickBankExtra != null;
    }

    public HashMap<String, Object> getFirstBankDetailExtra() {
        return this.firstBankDetailExtra;
    }

    public void setFirstBankDetailExtra(HashMap<String, Object> hashMap) {
        this.firstBankDetailExtra = hashMap;
    }

    public ProtocolSign getProtocolSign() {
        return this.protocolSign;
    }

    public void setProtocolSign(ProtocolSign protocolSign) {
        this.protocolSign = protocolSign;
    }
}
