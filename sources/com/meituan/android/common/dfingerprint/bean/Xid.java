package com.meituan.android.common.dfingerprint.bean;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.dfingerprint.store.SyncStoreManager;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class Xid {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long expiredTimeInMillisecond;
    public String id;
    public boolean isLocal;

    public Xid(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1795952fff7daeb00d767ff1dca96d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1795952fff7daeb00d767ff1dca96d9");
            return;
        }
        this.id = "";
        this.expiredTimeInMillisecond = 0L;
        this.isLocal = false;
        this.id = str;
        this.expiredTimeInMillisecond = j;
    }

    @Nullable
    public static Xid buildLocalXid(SyncStoreManager syncStoreManager) {
        Object[] objArr = {syncStoreManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d08c130e086f5c582d43afc91e6133c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Xid) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d08c130e086f5c582d43afc91e6133c4");
        }
        try {
            String main1 = NBridge.main1(48, new Object[0]);
            long xidReportInterval = getXidReportInterval(syncStoreManager);
            MTGuardLog.setLogan("build local xid: ".concat(String.valueOf(main1)));
            Xid xid = new Xid(main1, System.currentTimeMillis() + (xidReportInterval * 60 * 1000));
            xid.isLocal = true;
            return xid;
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return null;
        }
    }

    public static Xid deserialization(SyncStoreManager syncStoreManager) {
        Object[] objArr = {syncStoreManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40c0a493285994b5d2d8d1ac24e00dde", RobustBitConfig.DEFAULT_VALUE)) {
            return (Xid) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40c0a493285994b5d2d8d1ac24e00dde");
        }
        String main1 = NBridge.main1(57, new Object[]{DFPConfigs.KEY_XID_ID});
        String main12 = NBridge.main1(57, new Object[]{DFPConfigs.KEY_XID_EXPIRED_TIME});
        if (TextUtils.isEmpty(main1) || TextUtils.isEmpty(main12)) {
            Xid xid = syncStoreManager.getXid();
            if (xid != null && xid.isValid() && !xid.isLocal) {
                NBridge.main1(58, new Object[]{DFPConfigs.KEY_XID_ID, xid.id});
                NBridge.main1(58, new Object[]{DFPConfigs.KEY_XID_EXPIRED_TIME, String.valueOf(xid.expiredTimeInMillisecond)});
            }
            return xid;
        }
        return new Xid(main1, Long.parseLong(main12));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long getXidReportInterval(com.meituan.android.common.dfingerprint.store.SyncStoreManager r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.dfingerprint.bean.Xid.changeQuickRedirect
            java.lang.String r11 = "45474f04bf8bcbbc4a6e4c02ce9e57c7"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.Long r12 = (java.lang.Long) r12
            long r0 = r12.longValue()
            return r0
        L23:
            r1 = 57
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "xid_report_interval"
            r0[r9] = r2
            java.lang.String r0 = com.meituan.android.common.mtguard.NBridge.main1(r1, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L41
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L3d
            goto L42
        L3d:
            r0 = move-exception
            com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog.setErrorLogan(r0)
        L41:
            r0 = r2
        L42:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L4b
            int r12 = r12.getXidReportInterval()
            long r0 = (long) r12
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.dfingerprint.bean.Xid.getXidReportInterval(com.meituan.android.common.dfingerprint.store.SyncStoreManager):long");
    }

    public boolean isEmpty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28c6ab914507db6b7b1ef0ea43476825", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28c6ab914507db6b7b1ef0ea43476825")).booleanValue() : TextUtils.isEmpty(this.id) || this.expiredTimeInMillisecond == 0;
    }

    public boolean isExpired() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3f294711dc4b9e9d29ec264aa08d97b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3f294711dc4b9e9d29ec264aa08d97b")).booleanValue() : System.currentTimeMillis() > this.expiredTimeInMillisecond;
    }

    public boolean isSame(Xid xid) {
        Object[] objArr = {xid};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "999bb60a0765e373445695ffb94e908b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "999bb60a0765e373445695ffb94e908b")).booleanValue() : xid != null && !xid.isEmpty() && xid.id.equals(this.id) && xid.expiredTimeInMillisecond == this.expiredTimeInMillisecond;
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3550bb93227806cc692e4878609cf44", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3550bb93227806cc692e4878609cf44")).booleanValue() : !isEmpty() && System.currentTimeMillis() <= this.expiredTimeInMillisecond;
    }
}
