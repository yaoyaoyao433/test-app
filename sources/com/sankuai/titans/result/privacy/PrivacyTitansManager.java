package com.sankuai.titans.result.privacy;

import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PrivacyTitansManager {
    private static volatile PrivacyTitansManager INSTANCE;
    private static Object cacheLock = new Object();
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile boolean burstLogSwitch;
    private volatile boolean cookiePrivacySwitch;
    private ILogger logger;
    private volatile boolean queryPrivacySwitch;

    public static PrivacyTitansManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c97ef41297a7d5ca17d6663d810caa61", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrivacyTitansManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c97ef41297a7d5ca17d6663d810caa61");
        }
        if (INSTANCE == null) {
            synchronized (PrivacyTitansManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PrivacyTitansManager();
                }
            }
        }
        return INSTANCE;
    }

    public void setConfig(TitansConfig titansConfig) {
        Object[] objArr = {titansConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00ac7af8f58761d094bc56fbb2ae83d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00ac7af8f58761d094bc56fbb2ae83d3");
            return;
        }
        synchronized (cacheLock) {
            try {
                if (titansConfig == null) {
                    this.queryPrivacySwitch = false;
                    this.cookiePrivacySwitch = false;
                    this.burstLogSwitch = false;
                    return;
                }
                this.queryPrivacySwitch = titansConfig.queryPrivacySwitch;
                this.cookiePrivacySwitch = titansConfig.cookiePrivacySwitch;
                this.burstLogSwitch = titansConfig.burstLogSwitch;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setILogger(ILogger iLogger) {
        this.logger = iLogger;
    }

    public boolean isQueryPrivacySwitch() {
        return this.queryPrivacySwitch;
    }

    public boolean isCookiePrivacySwitch() {
        return this.cookiePrivacySwitch;
    }

    public boolean isBurstLogSwitch() {
        return this.burstLogSwitch;
    }

    public boolean privacyRegisteredLocation(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8ceb98a1b4698ac9af0ec1cc5d31047", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8ceb98a1b4698ac9af0ec1cc5d31047")).booleanValue();
        }
        try {
            long a = Privacy.createNetFilter().a(str);
            if (this.logger != null) {
                ILogger iLogger = this.logger;
                iLogger.log("KNBWebCompatDelegateV2Impl.privacyRegistered supportedPrivacyTypesForURL value is " + a + " ;---url is " + str, "privacy_query");
            }
            return (a & 1) != 0;
        } catch (Exception e) {
            if (this.logger != null) {
                ILogger iLogger2 = this.logger;
                iLogger2.log("KNBWebCompatDelegateV2Impl.privacyRegistered error info is " + e.getMessage() + " ;---url is " + str, "privacy_query");
            }
            return true;
        }
    }
}
