package com.meituan.android.common.dfingerprint.bean;

import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.store.SyncStoreManager;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class DFPID {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getDFPID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2623851e2c98e483f23c18dba5287186", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2623851e2c98e483f23c18dba5287186") : NBridge.main1(57, new Object[]{DFPConfigs.KEY_DFPID});
    }

    public static long getDFPIDExpireTime(SyncStoreManager syncStoreManager) {
        long parseLong;
        Object[] objArr = {syncStoreManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d5721e0aea075182f92f84b9201fb51", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d5721e0aea075182f92f84b9201fb51")).longValue();
        }
        String main1 = NBridge.main1(57, new Object[]{DFPConfigs.KEY_DFPID_EXPIRE_TIME});
        if (!TextUtils.isEmpty(main1)) {
            try {
                parseLong = Long.parseLong(main1);
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
            return (parseLong != 0 || syncStoreManager == null) ? parseLong : syncStoreManager.getLastUpdateTime().longValue() + (syncStoreManager.getInterval().longValue() * DFPConfigs.ONE_HOUR);
        }
        parseLong = 0;
        if (parseLong != 0) {
            return parseLong;
        }
    }
}
