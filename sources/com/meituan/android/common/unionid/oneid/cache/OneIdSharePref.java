package com.meituan.android.common.unionid.oneid.cache;

import android.content.Context;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneIdSharePref {
    private static final String DEVICE_FINGER_PRINT = "finger_print";
    private static final String DPID_LAST_SYNC_TIME = "dpid_lastTime";
    private static final String FROM_PRIVATEMODE_FLAG = "fromPrivateModeFlag";
    private static final String IS_FIRST_RUN = "is_first_run";
    private static final String IS_NEW_USER = "new_user";
    private static final String IS_RESET_FRESH_TIME = "reset_refresh_time";
    private static final String LAST_LOG_REPORT_TIME = "last_report_time";
    private static final String LAST_SESSIONID = "last_session_id";
    private static final String LAST_SYNC_TIME = "lastTime";
    private static final String LOCALSESSIONID = "localSessionId";
    private static final String LOCAL_APPID = "local_appId";
    private static final String LOCAL_DPID = "dpid";
    private static final String LOCAL_DPID_TRANSFER_INFO = "local_dpid_transfer_info";
    private static final String LOCAL_OAID = "local_oaid";
    private static final String LOCAL_OAID_STATUS = "local_oaid_status";
    private static final String LOCAL_ONEID = "oneid";
    private static final String LOCAL_SIMULATED_ONEID = "local_id";
    private static final String LOCAL_UNIONID_TRANSFER_INFO = "local_unionid_transfer_info";
    private static final String LOCAL_UUID_TRANSFER_INFO = "local_uuid_transfer_info";
    public static final String LOCAL_UUID_TRNSFER_INFO_V2 = "local_uuid_transfer_info_v2";
    public static final String LOCAL_UUID_TRNSFER_INFO_V3 = "local_uuid_transfer_info_v3";
    private static final String LOG_REPORT_COUNT = "log_report_count";
    private static final String OLD_DPID_KEY = "oldDpid";
    private static final String OLD_UNIONID_KEY = "oldUnionid";
    private static final String OLD_UUID_KEY = "oldUuid";
    private static final String PRIVATE_DPID_CHANGED = "privateDpidChanged";
    private static final String PRIVATE_LAST_SYNC_TIME = "privateLastTime";
    private static final String PRIVATE_UNIONID = "privateUnionid";
    private static final String PRIVATE_UUID_CHANGED = "privateUuidChanged";
    private static final String REQUEST_DURATION_FILE_NAME = "request_duration";
    private static final String SESSIONID = "sessionId";
    private static final String SHARED_FILE_NAME = "shared_oneid";
    private static final String SHARE_FILE_NAME = "share_uuid";
    private static final String SHARE_KEY = "uuid";
    private static final String SIMULATED_DEVICE_ID = "simulated_device_id";
    private static final String UUID_LAST_SYNC_TIME = "uuid_lastTime";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static x sCIPStorageSPAdapter;
    private static OneIdSharePref sOneIdSharePref;

    public OneIdSharePref(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bab0e8b7c1b9e564496af687f85a53a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bab0e8b7c1b9e564496af687f85a53a");
        } else {
            sCIPStorageSPAdapter = CIPStorageManager.getApdater(context);
        }
    }

    public static synchronized OneIdSharePref getInstance(Context context) {
        synchronized (OneIdSharePref.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88b5c2d3dd8939f9bedfe78f0ce1891d", RobustBitConfig.DEFAULT_VALUE)) {
                return (OneIdSharePref) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88b5c2d3dd8939f9bedfe78f0ce1891d");
            } else if (sOneIdSharePref == null) {
                OneIdSharePref oneIdSharePref = new OneIdSharePref(context);
                sOneIdSharePref = oneIdSharePref;
                return oneIdSharePref;
            } else {
                return sOneIdSharePref;
            }
        }
    }

    public boolean hasUnionIdKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9991d0336b5b973bad53b7edd946443", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9991d0336b5b973bad53b7edd946443")).booleanValue() : sCIPStorageSPAdapter.a("oneid", SHARED_FILE_NAME);
    }

    public String getOneId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fa78a277a56dee4984d3abbeb09b1b4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fa78a277a56dee4984d3abbeb09b1b4") : sCIPStorageSPAdapter.b("oneid", "", SHARED_FILE_NAME);
    }

    public void setOneId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14d4d560c7a62f48eb705990c2ba2c9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14d4d560c7a62f48eb705990c2ba2c9a");
        } else {
            sCIPStorageSPAdapter.a("oneid", str, SHARED_FILE_NAME);
        }
    }

    public boolean setDpid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dd7950d54ce33b354be80bb1f19a9b5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dd7950d54ce33b354be80bb1f19a9b5")).booleanValue() : sCIPStorageSPAdapter.a("dpid", str, SHARED_FILE_NAME);
    }

    public String getDpid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8e406712fbb38734e09e5e68544f6fa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8e406712fbb38734e09e5e68544f6fa") : sCIPStorageSPAdapter.b("dpid", "", SHARED_FILE_NAME);
    }

    public long getLastSyncTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "958f3d32e8c865db23fa2f92815d48c9", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "958f3d32e8c865db23fa2f92815d48c9")).longValue() : sCIPStorageSPAdapter.b(LAST_SYNC_TIME, -1L, SHARED_FILE_NAME);
    }

    public void setLastSyncTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50743c07456788a601eebeb60c969b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50743c07456788a601eebeb60c969b80");
        } else {
            sCIPStorageSPAdapter.a(LAST_SYNC_TIME, j, SHARED_FILE_NAME);
        }
    }

    public boolean setLastSyncTime(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "372c593bef2c7e3982be78cf3c10697d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "372c593bef2c7e3982be78cf3c10697d")).booleanValue();
        }
        boolean a = sCIPStorageSPAdapter.a(LAST_SYNC_TIME, j, SHARED_FILE_NAME);
        if (z) {
            sCIPStorageSPAdapter.b.j();
        }
        return a;
    }

    public void setPrivateLastSyncTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6ed77c022debf91d90a89da830e4321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6ed77c022debf91d90a89da830e4321");
        } else {
            sCIPStorageSPAdapter.a(PRIVATE_LAST_SYNC_TIME, j, SHARED_FILE_NAME);
        }
    }

    public long getPrivateLastSyncTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cea5d76678642873a6d7e00171923981", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cea5d76678642873a6d7e00171923981")).longValue() : sCIPStorageSPAdapter.b(PRIVATE_LAST_SYNC_TIME, -1L, SHARED_FILE_NAME);
    }

    public long getDpidLastSyncTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6db96e283abc2cd88492bee4d8a6be16", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6db96e283abc2cd88492bee4d8a6be16")).longValue() : sCIPStorageSPAdapter.b(DPID_LAST_SYNC_TIME, -1L, SHARED_FILE_NAME);
    }

    public void setDpidLastSyncTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ba17ab6390a3de64d3a50a2eca33138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ba17ab6390a3de64d3a50a2eca33138");
        } else {
            sCIPStorageSPAdapter.a(DPID_LAST_SYNC_TIME, j, SHARED_FILE_NAME);
        }
    }

    public void setUuidLastSyncTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "426d32cf8b8fbd957998535eb7ae9112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "426d32cf8b8fbd957998535eb7ae9112");
        } else {
            sCIPStorageSPAdapter.a(UUID_LAST_SYNC_TIME, j, SHARED_FILE_NAME);
        }
    }

    public long getUuidLastSyncTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e8c56902d1ca213454859781bd15b47", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e8c56902d1ca213454859781bd15b47")).longValue() : sCIPStorageSPAdapter.b(UUID_LAST_SYNC_TIME, -1L, SHARED_FILE_NAME);
    }

    public void deleteOneId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fdfe088663fa09a208c8ed62aa178ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fdfe088663fa09a208c8ed62aa178ea");
        } else {
            sCIPStorageSPAdapter.b("oneid", SHARED_FILE_NAME);
        }
    }

    public void setLocalSimulatedOneid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf829b8fb15c378a1ce518cbdd5d937d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf829b8fb15c378a1ce518cbdd5d937d");
        } else {
            sCIPStorageSPAdapter.a(LOCAL_SIMULATED_ONEID, str, SHARED_FILE_NAME);
        }
    }

    public String getLocalSimulatedOneid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "691bfb359cf04ecca08b872fef2ea8e3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "691bfb359cf04ecca08b872fef2ea8e3") : sCIPStorageSPAdapter.b(LOCAL_SIMULATED_ONEID, "", SHARED_FILE_NAME);
    }

    public void setIsNewUser(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "feeae612c6c423cc9e9be32453469b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "feeae612c6c423cc9e9be32453469b84");
        } else {
            sCIPStorageSPAdapter.a(IS_NEW_USER, z, SHARED_FILE_NAME);
        }
    }

    public void getIsNewUser() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40cd35f3d75f08c72d663512ad47213d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40cd35f3d75f08c72d663512ad47213d");
        } else {
            sCIPStorageSPAdapter.b(IS_NEW_USER, true, SHARED_FILE_NAME);
        }
    }

    public void setSimulatedDeviceId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "740a1d6c832a8b33c9c3a7aa200a0d2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "740a1d6c832a8b33c9c3a7aa200a0d2a");
        } else {
            sCIPStorageSPAdapter.a(SIMULATED_DEVICE_ID, str, SHARED_FILE_NAME);
        }
    }

    public String getSimulatedDeviceId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "501fc355c738d6c8c3ea9e368e6bfe01", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "501fc355c738d6c8c3ea9e368e6bfe01") : sCIPStorageSPAdapter.b(SIMULATED_DEVICE_ID, "", SHARED_FILE_NAME);
    }

    public void setLocalAppid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd8d3670cec85eb626eb78d15778aa3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd8d3670cec85eb626eb78d15778aa3e");
        } else {
            sCIPStorageSPAdapter.a(LOCAL_APPID, str, SHARED_FILE_NAME);
        }
    }

    public String getLocalAppid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6394fb9c44e7ac1eb887a818685379a6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6394fb9c44e7ac1eb887a818685379a6") : sCIPStorageSPAdapter.b(LOCAL_APPID, "", SHARED_FILE_NAME);
    }

    public void setLocalOaid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "706018734878d057df3aefc3130ae4b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "706018734878d057df3aefc3130ae4b7");
        } else {
            sCIPStorageSPAdapter.a(LOCAL_OAID, str, SHARED_FILE_NAME);
        }
    }

    public String getLocalOaid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a54c54d71a1c3d18869bfc777adc9af", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a54c54d71a1c3d18869bfc777adc9af") : sCIPStorageSPAdapter.b(LOCAL_OAID, "", SHARED_FILE_NAME);
    }

    public void setLocalOaidStatus(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39b06a3c21dd7bca51ceaa5573bb497f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39b06a3c21dd7bca51ceaa5573bb497f");
        } else {
            sCIPStorageSPAdapter.a(LOCAL_OAID_STATUS, i, SHARED_FILE_NAME);
        }
    }

    public int getLocalOaidStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71aaa0b5af4a46d9939028b2ce842d25", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71aaa0b5af4a46d9939028b2ce842d25")).intValue() : sCIPStorageSPAdapter.b(LOCAL_OAID_STATUS, 0, SHARED_FILE_NAME);
    }

    public boolean setLocalUuidTransferInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeb9a61bfdb79a7ef248cd7b1d9f4c97", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeb9a61bfdb79a7ef248cd7b1d9f4c97")).booleanValue() : sCIPStorageSPAdapter.a(LOCAL_UUID_TRANSFER_INFO, str, SHARED_FILE_NAME);
    }

    public String getLocalUuidTransferInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5a14bf1e4ae434c863ad468ecde2374", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5a14bf1e4ae434c863ad468ecde2374") : sCIPStorageSPAdapter.b(LOCAL_UUID_TRANSFER_INFO, "", SHARED_FILE_NAME);
    }

    public boolean setLocalUnionidTransferInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1efc9df72a0200e48111b8e0097e38be", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1efc9df72a0200e48111b8e0097e38be")).booleanValue() : sCIPStorageSPAdapter.a(LOCAL_UNIONID_TRANSFER_INFO, str, SHARED_FILE_NAME);
    }

    public String getUuidTransfer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbcbf9dd53e50fe5c1ac32b8e3caa6d6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbcbf9dd53e50fe5c1ac32b8e3caa6d6") : sCIPStorageSPAdapter.b(str, "", SHARED_FILE_NAME);
    }

    public boolean setUuidTransfer(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86723121da7b948d2c1728cbbecb3a28", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86723121da7b948d2c1728cbbecb3a28")).booleanValue() : sCIPStorageSPAdapter.a(str, str2, SHARED_FILE_NAME);
    }

    public String getLocalUnionidTransferInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "483869461131a5c96e7ce606ec03f6af", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "483869461131a5c96e7ce606ec03f6af") : sCIPStorageSPAdapter.b(LOCAL_UNIONID_TRANSFER_INFO, "", SHARED_FILE_NAME);
    }

    public boolean setLocalDpidTransferInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43477e3b032268f99f265f8b6636aca0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43477e3b032268f99f265f8b6636aca0")).booleanValue() : sCIPStorageSPAdapter.a(LOCAL_DPID_TRANSFER_INFO, str, SHARED_FILE_NAME);
    }

    public String getLocalDpidTransferInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a90da564f3dfa7685300d553c3395d7c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a90da564f3dfa7685300d553c3395d7c") : sCIPStorageSPAdapter.b(LOCAL_DPID_TRANSFER_INFO, "", SHARED_FILE_NAME);
    }

    public void setDeviceFingerPrint(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79088531bf676d080b5d3c62d7c125e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79088531bf676d080b5d3c62d7c125e3");
        } else {
            sCIPStorageSPAdapter.a(DEVICE_FINGER_PRINT, str, SHARED_FILE_NAME);
        }
    }

    public String getDeviceFingerPrint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40d45b7eb79d6437deb6cad7c6e63165", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40d45b7eb79d6437deb6cad7c6e63165") : sCIPStorageSPAdapter.b(DEVICE_FINGER_PRINT, "", SHARED_FILE_NAME);
    }

    public String getUUIDFromCP(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d5f8e827528b1f01f2783fbe488706f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d5f8e827528b1f01f2783fbe488706f") : sCIPStorageSPAdapter.b("uuid", "", "share_uuid");
    }

    public boolean isRefreshLastSyncTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3f3eb18f5141f9caab2e052649bf0e4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3f3eb18f5141f9caab2e052649bf0e4")).booleanValue() : sCIPStorageSPAdapter.b(IS_RESET_FRESH_TIME, false, "share_uuid");
    }

    public void setRefreshLastSyncTime(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "556ed23fb7f7ef58dd2932497781a058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "556ed23fb7f7ef58dd2932497781a058");
        } else {
            sCIPStorageSPAdapter.a(IS_RESET_FRESH_TIME, z, "share_uuid");
        }
    }

    public void saveRequestDuration(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d18584d1c5b8c9adc62a616eb1cf3279", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d18584d1c5b8c9adc62a616eb1cf3279");
        } else {
            sCIPStorageSPAdapter.a(str, str2, REQUEST_DURATION_FILE_NAME);
        }
    }

    public String getReuestDuration(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7d933871997ae16004626b155d19422", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7d933871997ae16004626b155d19422") : sCIPStorageSPAdapter.b(str, "", REQUEST_DURATION_FILE_NAME);
    }

    public void saveLastSessionId(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6451fdd82ce17785140c71b77639334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6451fdd82ce17785140c71b77639334");
            return;
        }
        x xVar = sCIPStorageSPAdapter;
        xVar.a(LAST_SESSIONID + str, str2, REQUEST_DURATION_FILE_NAME);
    }

    public String getLastSessionid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e68ad6cc26705b6742768c826545c69f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e68ad6cc26705b6742768c826545c69f");
        }
        x xVar = sCIPStorageSPAdapter;
        return xVar.b(LAST_SESSIONID + str, "", REQUEST_DURATION_FILE_NAME);
    }

    public void saveLogReportCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "050f0c2e663d367df288e257aef15254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "050f0c2e663d367df288e257aef15254");
        } else {
            sCIPStorageSPAdapter.a(LOG_REPORT_COUNT, i, REQUEST_DURATION_FILE_NAME);
        }
    }

    public int getLogReportCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2de558728ff364a8ae08affb82d2f48b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2de558728ff364a8ae08affb82d2f48b")).intValue() : sCIPStorageSPAdapter.b(LOG_REPORT_COUNT, 0, REQUEST_DURATION_FILE_NAME);
    }

    public void saveLastReportTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c9ba79395f11f6e1febc35ef0886b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c9ba79395f11f6e1febc35ef0886b9d");
        } else {
            sCIPStorageSPAdapter.a(LAST_LOG_REPORT_TIME, j, REQUEST_DURATION_FILE_NAME);
        }
    }

    public long getLastReportTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b883686f93d234faec4f1ebc5045e6b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b883686f93d234faec4f1ebc5045e6b")).longValue() : sCIPStorageSPAdapter.b(LAST_LOG_REPORT_TIME, 0L, REQUEST_DURATION_FILE_NAME);
    }

    public boolean isFirstRun() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07cb0a019b191d7bbf5c14c8e1ccf007", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07cb0a019b191d7bbf5c14c8e1ccf007")).booleanValue() : sCIPStorageSPAdapter.b(IS_FIRST_RUN, true, "share_uuid");
    }

    public boolean reverseFirstRun() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b267018d1c2a807f75cab8246aaa995b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b267018d1c2a807f75cab8246aaa995b")).booleanValue() : sCIPStorageSPAdapter.a(IS_FIRST_RUN, false, "share_uuid");
    }

    public long getLastCollectIdTime(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d53cbcde6fadf23608fb6378e56d8b34", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d53cbcde6fadf23608fb6378e56d8b34")).longValue() : sCIPStorageSPAdapter.b(str, -1L, REQUEST_DURATION_FILE_NAME);
    }

    public void saveCollectIdTime(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a62d1b1610ce6d98d02bf97bb1d6d28a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a62d1b1610ce6d98d02bf97bb1d6d28a");
        } else {
            sCIPStorageSPAdapter.a(str, j, REQUEST_DURATION_FILE_NAME);
        }
    }

    public void setIdCache(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3602a3bc8260b44324567e53e96de521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3602a3bc8260b44324567e53e96de521");
        } else {
            sCIPStorageSPAdapter.a(str, str2, REQUEST_DURATION_FILE_NAME);
        }
    }

    public String getIdCache(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96d6b372f2b23d882758f4da3903c9a8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96d6b372f2b23d882758f4da3903c9a8") : sCIPStorageSPAdapter.b(str, str2, REQUEST_DURATION_FILE_NAME);
    }

    public int getCurrentDeviceInfoApiIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe337fa7209ddb1f9a51272a714da6f9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe337fa7209ddb1f9a51272a714da6f9")).intValue() : sCIPStorageSPAdapter.b("currentApiIndex", -1, REQUEST_DURATION_FILE_NAME);
    }

    public boolean setCurrentDeviceInfoApiIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56e3a150254e95274f1e05841f4d8b15", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56e3a150254e95274f1e05841f4d8b15")).booleanValue() : sCIPStorageSPAdapter.a("currentApiIndex", i, REQUEST_DURATION_FILE_NAME);
    }

    public long getLastCollectDeviceInfoApiTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca02902ffe7bbe8bd8c03ce591f7e898", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca02902ffe7bbe8bd8c03ce591f7e898")).longValue() : sCIPStorageSPAdapter.b("lastCollectTime", -1L, REQUEST_DURATION_FILE_NAME);
    }

    public boolean setLastCollectDeviceInfoApiTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15b2f7666f843e188e036a50735a6ed6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15b2f7666f843e188e036a50735a6ed6")).booleanValue() : sCIPStorageSPAdapter.a("lastCollectTime", j, REQUEST_DURATION_FILE_NAME);
    }

    public boolean setOldUnionId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c52d9f19e0d55aa6b3c7939b4c0510fb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c52d9f19e0d55aa6b3c7939b4c0510fb")).booleanValue() : sCIPStorageSPAdapter.a(OLD_UNIONID_KEY, str, SHARED_FILE_NAME);
    }

    public boolean setOldDpid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff7c175bcea8590e1116194575d25a54", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff7c175bcea8590e1116194575d25a54")).booleanValue() : sCIPStorageSPAdapter.a(OLD_DPID_KEY, str, SHARED_FILE_NAME);
    }

    public boolean setOldUuid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b5a7d532fcf314e748d56b919c08855", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b5a7d532fcf314e748d56b919c08855")).booleanValue() : sCIPStorageSPAdapter.a(OLD_UUID_KEY, str, SHARED_FILE_NAME);
    }

    public String getOldUnionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8e5762e3e659b281d36abec4a41892f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8e5762e3e659b281d36abec4a41892f") : sCIPStorageSPAdapter.b(OLD_UNIONID_KEY, "", SHARED_FILE_NAME);
    }

    public String getOldDpid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d5d89debf3d18a146e5a7b9d801fc5d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d5d89debf3d18a146e5a7b9d801fc5d") : sCIPStorageSPAdapter.b(OLD_DPID_KEY, "", SHARED_FILE_NAME);
    }

    public String getOldUuid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f8a34aeb23d938c9a303002642dde61", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f8a34aeb23d938c9a303002642dde61") : sCIPStorageSPAdapter.b(OLD_UUID_KEY, "", SHARED_FILE_NAME);
    }

    public boolean setSessionId(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b92ffcf72c5bd421f6c2782ffadf0e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b92ffcf72c5bd421f6c2782ffadf0e4")).booleanValue();
        }
        boolean a = sCIPStorageSPAdapter.a(SESSIONID, str, "share_uuid");
        if (z && sCIPStorageSPAdapter.b != null) {
            sCIPStorageSPAdapter.b.j();
        }
        return a;
    }

    public String getSessionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2459463410ba49f83213270859c9b0e7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2459463410ba49f83213270859c9b0e7") : sCIPStorageSPAdapter.b(SESSIONID, "", "share_uuid");
    }

    public boolean setLocalSessionId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b90ed382d097a602fa3f98918f7f597", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b90ed382d097a602fa3f98918f7f597")).booleanValue() : sCIPStorageSPAdapter.a(LOCALSESSIONID, str, "share_uuid");
    }

    public String getLocalSessionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "978e898d2f22327cf40eab5b5075b82b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "978e898d2f22327cf40eab5b5075b82b") : sCIPStorageSPAdapter.b(LOCALSESSIONID, "", "share_uuid");
    }

    public boolean setPrivateUnionid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "000de181594c41210941d677c4744d90", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "000de181594c41210941d677c4744d90")).booleanValue() : sCIPStorageSPAdapter.a(PRIVATE_UNIONID, str, "share_uuid");
    }

    public String getPrivateUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29b86f0b1328964c6d440aae3df07e46", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29b86f0b1328964c6d440aae3df07e46") : sCIPStorageSPAdapter.b(PRIVATE_UNIONID, "", "share_uuid");
    }

    public boolean setPrivateUuidChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "263c6b92809779aee02bc9d35c8bcb8b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "263c6b92809779aee02bc9d35c8bcb8b")).booleanValue() : sCIPStorageSPAdapter.a(PRIVATE_UUID_CHANGED, true, "share_uuid");
    }

    public boolean getPrivateUuidChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d42b40134523fbb6a711e1cc9436b2c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d42b40134523fbb6a711e1cc9436b2c")).booleanValue() : sCIPStorageSPAdapter.b(PRIVATE_UUID_CHANGED, false, "share_uuid");
    }

    public boolean setPrivateDpidChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "133c761b943113d8e432b841ec538d2c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "133c761b943113d8e432b841ec538d2c")).booleanValue() : sCIPStorageSPAdapter.a(PRIVATE_DPID_CHANGED, true, "share_uuid");
    }

    public boolean getPrivateDpidChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34d5db161fe93837f29ffea4e728a956", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34d5db161fe93837f29ffea4e728a956")).booleanValue() : sCIPStorageSPAdapter.b(PRIVATE_DPID_CHANGED, false, "share_uuid");
    }

    public boolean setFromPrivateModeFlag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c9ee2c21895629cd8bc20e421f962b1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c9ee2c21895629cd8bc20e421f962b1")).booleanValue() : sCIPStorageSPAdapter.a(FROM_PRIVATEMODE_FLAG, "1", "share_uuid");
    }

    public String getFromPrivatemodeFlag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "311549e1b5be58077845864c0beeff46", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "311549e1b5be58077845864c0beeff46") : sCIPStorageSPAdapter.b(FROM_PRIVATEMODE_FLAG, "-1", "share_uuid");
    }

    public int getDeviceInfoCallTimes(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ada96e0006418e4fba50166169a4ff74", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ada96e0006418e4fba50166169a4ff74")).intValue() : sCIPStorageSPAdapter.b(str, 0, REQUEST_DURATION_FILE_NAME);
    }

    public boolean saveDeviceInfoCallTimes(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e0ad6bfcefe3ea6ec835db4f7658dcf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e0ad6bfcefe3ea6ec835db4f7658dcf")).booleanValue() : sCIPStorageSPAdapter.a(str, i, REQUEST_DURATION_FILE_NAME);
    }

    public boolean saveTokenEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f8b6a96b237abc4e199c30a35033fbe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f8b6a96b237abc4e199c30a35033fbe")).booleanValue() : sCIPStorageSPAdapter.a("tokenEnable", z, REQUEST_DURATION_FILE_NAME);
    }

    public boolean isTokenEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56f670a2207ff7deb27df56861a52578", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56f670a2207ff7deb27df56861a52578")).booleanValue() : sCIPStorageSPAdapter.b("tokenEnable", true, REQUEST_DURATION_FILE_NAME);
    }
}
