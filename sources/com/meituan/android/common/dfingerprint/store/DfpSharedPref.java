package com.meituan.android.common.dfingerprint.store;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.bean.Xid;
import com.meituan.android.common.dfingerprint.collection.utils.StringUtils;
import com.meituan.android.common.dfingerprint.interfaces.IDFPManager;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public class DfpSharedPref extends BaseSharedPref {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static DfpSharedPref instance;
    private IDFPManager mManager;

    public DfpSharedPref(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0af5f17b377b8e8a6bf7d0e17b401426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0af5f17b377b8e8a6bf7d0e17b401426");
        } else {
            this.mManager = null;
        }
    }

    public DfpSharedPref(IDFPManager iDFPManager) {
        super(iDFPManager.getContext());
        Object[] objArr = {iDFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32f8cdb8889fdc7238d57f83e29fd448", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32f8cdb8889fdc7238d57f83e29fd448");
            return;
        }
        this.mManager = null;
        this.mManager = iDFPManager;
    }

    public static DfpSharedPref getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61a6416625899659ce83064408408e08", RobustBitConfig.DEFAULT_VALUE) ? (DfpSharedPref) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61a6416625899659ce83064408408e08") : instance != null ? instance : new DfpSharedPref(context);
    }

    public static DfpSharedPref getInstance(IDFPManager iDFPManager) {
        Object[] objArr = {iDFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9fbd77d2fc6d5e2cbc9247f53e2b2f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (DfpSharedPref) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9fbd77d2fc6d5e2cbc9247f53e2b2f2");
        }
        if (instance == null) {
            synchronized (BaseSharedPref.class) {
                if (instance == null) {
                    instance = new DfpSharedPref(iDFPManager);
                }
            }
        }
        return instance;
    }

    public long getFirstLaunchTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1530cddcf65988ca5ee3ba501f9f8b6", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1530cddcf65988ca5ee3ba501f9f8b6")).longValue() : readLong(DFPConfigs.KEY_FIRST_LAUNCHTIME);
    }

    public long getInterval() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dc89737cd875bf02d14a4673f421211", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dc89737cd875bf02d14a4673f421211")).longValue();
        }
        if (this.mContext == null) {
            return -1L;
        }
        long readLong = readLong(DFPConfigs.KEY_INTERVAL_TIME);
        if (readLong == -1) {
            return -1L;
        }
        return readLong;
    }

    public long getLastBattery() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebbfef447c4248149a84663fd0d64205", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebbfef447c4248149a84663fd0d64205")).longValue() : readLong(DFPConfigs.KEY_LAST_BATTERY);
    }

    public long getLastUpdateTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "672da3bbbdeb2077792ed8ae7f91004f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "672da3bbbdeb2077792ed8ae7f91004f")).longValue();
        }
        if (this.mContext == null) {
            return -1L;
        }
        long readLong = readLong(DFPConfigs.KEY_LAST_UPDATE_TIME);
        if (readLong == -1) {
            return -1L;
        }
        return readLong;
    }

    public String getLocalDFPId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5bd450d08a0e9d0f3f48d3ca2ccbe55", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5bd450d08a0e9d0f3f48d3ca2ccbe55") : getValue(DFPConfigs.KEY_DFPID);
    }

    public String getLocalID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d66406d9b64c3e1a84150a09ac4ac86", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d66406d9b64c3e1a84150a09ac4ac86") : getValue(DFPConfigs.KEY_LOCAL_ID);
    }

    public String getValue(String str) {
        String readString;
        byte[] decode;
        byte[] decrypt;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "817179d7da91934ac2c860960e5d236d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "817179d7da91934ac2c860960e5d236d");
        }
        try {
            if (this.mManager != null && this.mContext != null && (readString = readString(str)) != null && (decode = Base64.decode(readString, 0)) != null && (decrypt = this.mManager.getCypher().decrypt(decode)) != null && decrypt.length != 0) {
                String str2 = new String(decrypt, Charset.forName("UTF-8"));
                if (!str2.contains("@")) {
                    clear(str);
                    return null;
                }
                String[] split = str2.split("@");
                if (split.length != 2) {
                    clear(str);
                    return null;
                }
                String str3 = split[0];
                String str4 = split[1];
                if (!StringUtils.isMatch(str3, "[0-9a-fA-F]{32}")) {
                    clear(str);
                    return null;
                }
                String md5 = StringUtils.md5(str4);
                if (md5.isEmpty()) {
                    clear(str);
                    return null;
                } else if (md5.equalsIgnoreCase(str3)) {
                    return str4;
                } else {
                    clear(str);
                    return null;
                }
            }
            return null;
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return null;
        }
    }

    public Xid getXid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9e3e9f57680da09a790abaf3f5dd4b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Xid) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9e3e9f57680da09a790abaf3f5dd4b8");
        }
        if (this.mContext == null) {
            return null;
        }
        String value = getValue(DFPConfigs.KEY_XID_ID);
        String value2 = getValue(DFPConfigs.KEY_XID_EXPIRED_TIME);
        return new Xid(value, TextUtils.isEmpty(value2) ? 0L : Long.parseLong(value2));
    }

    public int getXidReportInterval() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08842b75a26054ddc950ea5ab949ab44", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08842b75a26054ddc950ea5ab949ab44")).intValue();
        }
        if (this.mContext == null) {
            return 0;
        }
        String value = getValue(DFPConfigs.KEY_XID_REPORT_INTERVAL);
        if (TextUtils.isEmpty(value)) {
            return 0;
        }
        return Integer.parseInt(value);
    }

    public long loadDeviceInfoLastReportTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e07bf5f1cfc6425ec2fa8d8a1453312b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e07bf5f1cfc6425ec2fa8d8a1453312b")).longValue() : readLong("dfp_last_report_v2");
    }

    public int loadDeviceInfoReportInterval() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68d64a5cd1606b212d35622659aa77f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68d64a5cd1606b212d35622659aa77f6")).intValue();
        }
        String value = getValue(DFPConfigs.KEY_DEVICE_INFO_REPORT_INTERVAL);
        if (TextUtils.isEmpty(value)) {
            return -1;
        }
        return Integer.parseInt(value);
    }

    public boolean saveDeviceInfoLastReportTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "666d13cc341745dd2ab5e0090f1fb473", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "666d13cc341745dd2ab5e0090f1fb473")).booleanValue() : writeLong("dfp_last_report_v2", Long.valueOf(j));
    }

    public boolean saveDeviceInfoReportInterval(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60419b1163fa4ecc6da3e11912129b07", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60419b1163fa4ecc6da3e11912129b07")).booleanValue() : saveKeyValue(DFPConfigs.KEY_DEVICE_INFO_REPORT_INTERVAL, Integer.toString(i));
    }

    public boolean saveKeyValue(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e624815f0fb436daa19d355c51d0f15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e624815f0fb436daa19d355c51d0f15")).booleanValue();
        }
        try {
            if (this.mManager != null && this.mContext != null && str2 != null && !str2.isEmpty()) {
                String md5 = StringUtils.md5(str2);
                if (md5.isEmpty()) {
                    return false;
                }
                byte[] encrypt = this.mManager.getCypher().encrypt((md5 + "@" + str2).getBytes());
                if (encrypt != null && encrypt.length != 0) {
                    return writeString(str, Base64.encodeToString(encrypt, 0));
                }
            }
            return false;
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return false;
        }
    }

    public void setFirstLaunchTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29509bc96783f8d54b14080e77b41f3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29509bc96783f8d54b14080e77b41f3b");
        } else if (j <= 0) {
        } else {
            writeLong(DFPConfigs.KEY_FIRST_LAUNCHTIME, Long.valueOf(j));
        }
    }

    public void setLastBattery(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "843e891f0c5ad12f861183126107a9ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "843e891f0c5ad12f861183126107a9ff");
        } else if (j <= 0) {
        } else {
            writeLong(DFPConfigs.KEY_LAST_BATTERY, Long.valueOf(j));
        }
    }
}
