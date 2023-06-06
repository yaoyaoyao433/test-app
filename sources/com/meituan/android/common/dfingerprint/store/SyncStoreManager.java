package com.meituan.android.common.dfingerprint.store;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.bean.Xid;
import com.meituan.android.common.dfingerprint.interfaces.IDFPManager;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public class SyncStoreManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static volatile Xid sXid;
    private static volatile int sXidReportIntervalInMin;
    private List<DfpIdHandler> handlers;
    private IDFPManager mDfpManager;

    /* loaded from: classes2.dex */
    public static abstract class DfpIdHandler implements Comparable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String imei;
        public long interval;
        public long lastUpdateTime;
        public String localdfpid;
        public String localid;
        public String name;
        public int priority;

        public DfpIdHandler() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9217509ad3df953e795074b98b5c0e80", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9217509ad3df953e795074b98b5c0e80");
                return;
            }
            this.localdfpid = "";
            this.localid = "";
            this.imei = "";
            this.lastUpdateTime = -1L;
            this.interval = -1L;
            this.priority = 0;
            this.name = "";
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            if (obj instanceof DfpIdHandler) {
                return ((DfpIdHandler) obj).priority - this.priority;
            }
            return 0;
        }

        public abstract long loadDeviceInfoLastReportTime();

        public abstract int loadDeviceInfoReportInterval();

        public abstract long loadInterval();

        public abstract long loadLastUpdateTime();

        public abstract String loadLocalDFPId();

        public abstract String loadLocalId();

        public abstract String loadValue(String str);

        public abstract Xid loadXid();

        public abstract int loadXidReportInterval();

        public abstract boolean saveDeviceInfoLastReportTime(long j);

        public abstract boolean saveDeviceInfoReportInterval(int i);
    }

    /* loaded from: classes2.dex */
    public static class SharedPrefSaveIdHandler extends DfpIdHandler {
        public static ChangeQuickRedirect changeQuickRedirect;
        private IDFPManager mDfpManager;

        public SharedPrefSaveIdHandler(IDFPManager iDFPManager) {
            Object[] objArr = {iDFPManager};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bdd84eacbbacdf3e290ca2c8b78756a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bdd84eacbbacdf3e290ca2c8b78756a");
                return;
            }
            this.mDfpManager = iDFPManager;
            this.priority = 4;
            this.name = "sharedpref";
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public long loadDeviceInfoLastReportTime() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a5e8697ad46a11fcabbcc8791389c53", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a5e8697ad46a11fcabbcc8791389c53")).longValue();
            }
            try {
                if (this.mDfpManager == null) {
                    return -1L;
                }
                return DfpSharedPref.getInstance(this.mDfpManager).loadDeviceInfoLastReportTime();
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
                return -1L;
            }
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public int loadDeviceInfoReportInterval() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad77a596e8e9dc5c0f6fb3549e58e7e1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad77a596e8e9dc5c0f6fb3549e58e7e1")).intValue();
            }
            try {
                if (this.mDfpManager == null) {
                    return -1;
                }
                return DfpSharedPref.getInstance(this.mDfpManager).loadDeviceInfoReportInterval();
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
                return 0;
            }
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public long loadInterval() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36b4f97d582d4045aa5ae756cfaf3b88", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36b4f97d582d4045aa5ae756cfaf3b88")).longValue();
            }
            try {
                if (this.mDfpManager != null) {
                    this.interval = DfpSharedPref.getInstance(this.mDfpManager).getInterval();
                }
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
            return this.interval;
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public long loadLastUpdateTime() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3878f1c1d34301cd73c801105d688a7e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3878f1c1d34301cd73c801105d688a7e")).longValue();
            }
            try {
                if (this.mDfpManager != null) {
                    this.lastUpdateTime = DfpSharedPref.getInstance(this.mDfpManager).getLastUpdateTime();
                }
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
            return this.lastUpdateTime;
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public String loadLocalDFPId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51b5f12284f6c99a634b70a49c9a8fd7", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51b5f12284f6c99a634b70a49c9a8fd7");
            }
            try {
                if (this.mDfpManager == null) {
                    return "";
                }
                DfpSharedPref dfpSharedPref = DfpSharedPref.getInstance(this.mDfpManager);
                if (TextUtils.isEmpty(this.localdfpid)) {
                    this.localdfpid = dfpSharedPref.getLocalDFPId();
                    if (this.localdfpid == null) {
                        this.localdfpid = "";
                    }
                    return this.localdfpid;
                }
                return this.localdfpid;
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
                return "";
            }
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public String loadLocalId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "345a7193458b20696d87257cc5f29275", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "345a7193458b20696d87257cc5f29275");
            }
            try {
                if (this.mDfpManager == null) {
                    return "";
                }
                this.localid = DfpSharedPref.getInstance(this.mDfpManager).getLocalID();
                if (this.localid == null) {
                    this.localid = "";
                }
                return this.localid;
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
                return "";
            }
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public String loadValue(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45a37f1888bb886a934956a68c94ed30", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45a37f1888bb886a934956a68c94ed30");
            }
            try {
                if (this.mDfpManager == null) {
                    return "";
                }
                String readString = DfpSharedPref.getInstance(this.mDfpManager).readString(str);
                return TextUtils.isEmpty(readString) ? "" : readString;
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
                return "";
            }
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public Xid loadXid() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7ff34b214834b5d35b05b5f58928bae", RobustBitConfig.DEFAULT_VALUE)) {
                return (Xid) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7ff34b214834b5d35b05b5f58928bae");
            }
            try {
                if (this.mDfpManager == null) {
                    return null;
                }
                return DfpSharedPref.getInstance(this.mDfpManager).getXid();
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
                return null;
            }
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public int loadXidReportInterval() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3f45049bdaf29c2f1d9b203c5a25c15", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3f45049bdaf29c2f1d9b203c5a25c15")).intValue();
            }
            try {
                if (this.mDfpManager == null) {
                    return 0;
                }
                return DfpSharedPref.getInstance(this.mDfpManager).getXidReportInterval();
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
                return 0;
            }
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public boolean saveDeviceInfoLastReportTime(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0b576c0d68aaefe3297569c89f3c6b6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0b576c0d68aaefe3297569c89f3c6b6")).booleanValue();
            }
            if (j != 0) {
                try {
                    if (this.mDfpManager != null) {
                        return DfpSharedPref.getInstance(this.mDfpManager).saveDeviceInfoLastReportTime(j);
                    }
                } catch (Throwable th) {
                    MTGuardLog.setErrorLogan(th);
                }
            }
            return false;
        }

        @Override // com.meituan.android.common.dfingerprint.store.SyncStoreManager.DfpIdHandler
        public boolean saveDeviceInfoReportInterval(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01bb8bdd9928efa4c2d294f6dd3fe81f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01bb8bdd9928efa4c2d294f6dd3fe81f")).booleanValue();
            }
            try {
                if (this.mDfpManager == null) {
                    return false;
                }
                return DfpSharedPref.getInstance(this.mDfpManager).saveDeviceInfoReportInterval(i);
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
                return false;
            }
        }
    }

    public SyncStoreManager(IDFPManager iDFPManager) {
        Object[] objArr = {iDFPManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86f3b413baaea8fd94b54118e5082a84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86f3b413baaea8fd94b54118e5082a84");
            return;
        }
        this.handlers = new LinkedList();
        this.mDfpManager = null;
        if (iDFPManager != null) {
            this.mDfpManager = iDFPManager;
        }
    }

    public synchronized void addIdHandler(DfpIdHandler dfpIdHandler) {
        Object[] objArr = {dfpIdHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c60b1fd919bd8891b34b1e1b282bd0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c60b1fd919bd8891b34b1e1b282bd0a");
        } else {
            this.handlers.add(dfpIdHandler);
        }
    }

    public synchronized long getDeviceInfoLastReportTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b95280029d0e5ff76c7fae2e7a418c33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b95280029d0e5ff76c7fae2e7a418c33")).longValue();
        }
        long j = 0;
        Iterator<DfpIdHandler> it = this.handlers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            long loadDeviceInfoLastReportTime = it.next().loadDeviceInfoLastReportTime();
            if (loadDeviceInfoLastReportTime != -1) {
                j = loadDeviceInfoLastReportTime;
                break;
            }
        }
        return j;
    }

    public synchronized int getDeviceInfoReportInterval() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4fb63a8cb48750caddfae9cb984e394", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4fb63a8cb48750caddfae9cb984e394")).intValue();
        }
        Iterator<DfpIdHandler> it = this.handlers.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            i = it.next().loadDeviceInfoReportInterval();
            if (i != -1) {
                break;
            }
        }
        if (i == -1) {
            i = 24;
        }
        return i;
    }

    public synchronized Long getInterval() {
        long loadInterval;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e39e05a15459a4a8e8d8ddd287a5658", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e39e05a15459a4a8e8d8ddd287a5658");
        }
        for (DfpIdHandler dfpIdHandler : this.handlers) {
            try {
                loadInterval = dfpIdHandler.loadInterval();
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
            if (loadInterval != -1) {
                return Long.valueOf(loadInterval);
            }
        }
        return 24L;
    }

    public synchronized Long getLastUpdateTime() {
        long loadLastUpdateTime;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfd5219fd2da6f0c0c9c40872f6f321e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfd5219fd2da6f0c0c9c40872f6f321e");
        }
        for (DfpIdHandler dfpIdHandler : this.handlers) {
            try {
                loadLastUpdateTime = dfpIdHandler.loadLastUpdateTime();
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
            if (loadLastUpdateTime != -1) {
                return Long.valueOf(loadLastUpdateTime);
            }
        }
        return 0L;
    }

    public synchronized String getLocalDFPId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef4842f9e35a597c28c4c7dceeff9163", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef4842f9e35a597c28c4c7dceeff9163");
        }
        for (DfpIdHandler dfpIdHandler : this.handlers) {
            try {
                String loadLocalDFPId = dfpIdHandler.loadLocalDFPId();
                MTGuardLog.setLogan("getLocalDFPId " + dfpIdHandler.getClass().getSimpleName() + ", id > " + loadLocalDFPId);
                if (!TextUtils.isEmpty(loadLocalDFPId) && loadLocalDFPId.length() == 56) {
                    return loadLocalDFPId;
                }
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
        }
        return "";
    }

    public synchronized String getLocalId() {
        String loadLocalId;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d204f49930dc167b7d55d82aeefd6a31", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d204f49930dc167b7d55d82aeefd6a31");
        }
        for (DfpIdHandler dfpIdHandler : this.handlers) {
            try {
                loadLocalId = dfpIdHandler.loadLocalId();
                MTGuardLog.setLogan("getLocalId " + dfpIdHandler.getClass().getSimpleName() + ", id > " + loadLocalId);
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
            if (!TextUtils.isEmpty(loadLocalId)) {
                return loadLocalId;
            }
        }
        return "";
    }

    public synchronized String getValue(String str) {
        String loadValue;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bd2b2c25cf8cddd61c02f5ca999b9b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bd2b2c25cf8cddd61c02f5ca999b9b2");
        }
        for (DfpIdHandler dfpIdHandler : this.handlers) {
            try {
                loadValue = dfpIdHandler.loadValue(str);
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
            if (!TextUtils.isEmpty(loadValue)) {
                return loadValue;
            }
        }
        return "";
    }

    @Nullable
    public synchronized Xid getXid() {
        Xid buildLocalXid;
        String str;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3352476cb0b0ec92fc7b1eb996243fed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Xid) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3352476cb0b0ec92fc7b1eb996243fed");
        }
        Xid xid = null;
        if (sXid == null || !sXid.isValid()) {
            Iterator<DfpIdHandler> it = this.handlers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Xid loadXid = it.next().loadXid();
                if (c != 2 && (loadXid == null || loadXid.isEmpty())) {
                    c = 1;
                } else if (loadXid != null && loadXid.isExpired()) {
                    c = 2;
                } else if (loadXid != null && loadXid.isValid()) {
                    xid = loadXid;
                    break;
                }
            }
            buildLocalXid = xid == null ? Xid.buildLocalXid(this) : xid;
            sXid = buildLocalXid;
        } else {
            buildLocalXid = sXid;
        }
        StringBuilder sb = new StringBuilder("sXid ");
        if (sXid == null) {
            str = StringUtil.NULL;
        } else {
            str = "id:" + sXid.id + ",expired time:" + sXid.expiredTimeInMillisecond;
        }
        sb.append(str);
        MTGuardLog.setLogan(sb.toString());
        return buildLocalXid;
    }

    public synchronized int getXidReportInterval() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d47df37d0e45b7a2d2842723a484ce1f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d47df37d0e45b7a2d2842723a484ce1f")).intValue();
        }
        if (sXidReportIntervalInMin != 0) {
            i = sXidReportIntervalInMin;
        } else {
            Iterator<DfpIdHandler> it = this.handlers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int loadXidReportInterval = it.next().loadXidReportInterval();
                if (loadXidReportInterval != 0) {
                    i = loadXidReportInterval;
                    break;
                }
            }
            if (i == 0) {
                i = 30;
            }
            sXidReportIntervalInMin = i;
        }
        return i;
    }

    public synchronized void saveDeviceInfoLastReportTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58256d58a5776c0999c11aaf0b5854dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58256d58a5776c0999c11aaf0b5854dc");
            return;
        }
        for (DfpIdHandler dfpIdHandler : this.handlers) {
            try {
                dfpIdHandler.saveDeviceInfoLastReportTime(j);
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
        }
    }

    public synchronized void saveDeviceInfoReportInterval(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e4fc1939bc72f2d452f30eb81cbd9e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e4fc1939bc72f2d452f30eb81cbd9e0");
            return;
        }
        for (DfpIdHandler dfpIdHandler : this.handlers) {
            try {
                dfpIdHandler.saveDeviceInfoReportInterval(i);
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
        }
    }
}
