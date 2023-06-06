package com.meituan.android.common.statistics.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SharedPreferencesHelper {
    private static final String ACTIVITY_COUNTER = "activity_counter";
    public static final String BID = "b_techportal_z1pau38n_sc";
    private static final String CACHED_COUNT = "cached_count";
    private static final String CACHED_GESTURE_COUNT = "cached_gesture_count";
    public static final String DATA_PREFERENCE = "report_sdk_store";
    private static final String FILE_CHANNEL_NAME = "file_channel_lx";
    private static final String GESTURE_REPORT_SECTION = "gesture_report_section";
    private static final String GLOBAL_SEQ_COUNTER = "global_seq_counter";
    private static final String GLOBAL_SEQ_ID = "global_seq_id";
    private static final String LAST_PAGE_CID = "last_page_cid";
    private static final String LAST_SYNC_COUNT_TIME = "last_sync_count_time";
    private static final String LAST_SYNC_GESTURE_SC_COUNT_DATE = "last_sync_gesture_sc_count_date";
    public static final String LXSDK_CIPSTORAGE_CHANNEL = "lxsdk_";
    public static final String QUIT_TIME = "quit_time";
    private static final String SEQUENCE_COUNTER = "sequence_counter";
    private static final String SEQUENCE_COUNTER_DATE = "sequence_counter_date";
    private static final String SESSION_UUID = "session_uuid_encrypt";
    private static final String SP_FILE_NAME = "shared_preference_lx";
    private static final String SP_IMPORT_STATUS = "sp_import_status";
    private static final String UUID_CIPSTORAGE_NAME = "oneid_shared_oneid";
    private static final String XLSDK_SHARED_CIPSTORAGE_NAME = "lxsdk_shared_process_sp";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile SharedPreferencesHelper instance;
    private String fileChannelName;
    private q mCipStorageCenter;
    private boolean mImportFinished;
    private q mMultiProcessCipStorageCenter;
    private q mUUIDCipStorageCenter;

    public String getLxFileChannel() {
        return this.fileChannelName;
    }

    public SharedPreferencesHelper(Context context) {
        String currentProcessName;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "911651217bb04fd83d266984092980c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "911651217bb04fd83d266984092980c8");
            return;
        }
        this.mCipStorageCenter = null;
        this.mUUIDCipStorageCenter = null;
        this.mMultiProcessCipStorageCenter = null;
        this.mImportFinished = false;
        this.fileChannelName = "lxsdk_file_channel_lx";
        String str = "lxsdk_shared_preference_lx";
        if (!ProcessUtils.isMainProcess(context)) {
            if (!TextUtils.isEmpty(ProcessUtils.getCurrentProcessName(context))) {
                str = "lxsdk_shared_preference_lx#" + currentProcessName.replace(CommonConstant.Symbol.DOT, CommonConstant.Symbol.UNDERLINE);
            } else {
                str = "lxsdk_shared_preference_lx#default";
            }
        }
        this.mCipStorageCenter = q.a(context, str, 2);
        this.mImportFinished = this.mCipStorageCenter.b(SP_IMPORT_STATUS, false);
        if (!this.mImportFinished) {
            x.a(this.mCipStorageCenter, u.f, SP_FILE_NAME, DATA_PREFERENCE);
            this.mCipStorageCenter.a(SP_IMPORT_STATUS, true);
        }
        this.mMultiProcessCipStorageCenter = q.a(context, XLSDK_SHARED_CIPSTORAGE_NAME, 2);
        this.mUUIDCipStorageCenter = q.a(context, "oneid_shared_oneid", 2);
    }

    public static SharedPreferencesHelper getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "65dcfd99373af6872e4727577c9ccc9d", 6917529027641081856L)) {
            return (SharedPreferencesHelper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "65dcfd99373af6872e4727577c9ccc9d");
        }
        if (instance == null) {
            synchronized (SharedPreferencesHelper.class) {
                if (instance == null) {
                    if (context != null) {
                        instance = new SharedPreferencesHelper(context.getApplicationContext());
                    } else {
                        instance = new SharedPreferencesHelper(Statistics.getContext());
                    }
                }
            }
        }
        return instance;
    }

    public void saveSessionUuid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77b16712d21465704214edb4bdf2fe03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77b16712d21465704214edb4bdf2fe03");
        } else {
            this.mCipStorageCenter.a(SESSION_UUID, DESHelper.encrypt(str));
        }
    }

    public String getSessionUuid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c33415ebafa61c10fc046952cc864c29", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c33415ebafa61c10fc046952cc864c29");
        }
        this.mCipStorageCenter.b("session_uuid");
        return DESHelper.decrypt(this.mCipStorageCenter.b(SESSION_UUID, ""));
    }

    public void saveSequenceCounter(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "392a17899b5268204e67fcb773a31dd5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "392a17899b5268204e67fcb773a31dd5");
        } else {
            this.mCipStorageCenter.a(SEQUENCE_COUNTER, j);
        }
    }

    public long getSequenceCounter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db42f61a7bef6c53ee2773e8a8d3a27f", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db42f61a7bef6c53ee2773e8a8d3a27f")).longValue() : this.mCipStorageCenter.b(SEQUENCE_COUNTER, 0L);
    }

    public void saveSequenceTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0e336d5e90b0d0ba08a2bdee6f6ba2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0e336d5e90b0d0ba08a2bdee6f6ba2b");
        } else {
            this.mCipStorageCenter.a(SEQUENCE_COUNTER_DATE, j);
        }
    }

    public long getSequenceTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f118a2603b4ca25700f7270cd06bc76a", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f118a2603b4ca25700f7270cd06bc76a")).longValue() : this.mCipStorageCenter.b(SEQUENCE_COUNTER_DATE, 0L);
    }

    public void resetQuitTime(Long l) {
        Object[] objArr = {l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "069e9130c85da07df235cc24ba744cfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "069e9130c85da07df235cc24ba744cfc");
        } else {
            this.mCipStorageCenter.a(QUIT_TIME, l.longValue());
        }
    }

    public Long getQuitTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b775afcc5534bb443d20e9f9f6bf949", 6917529027641081856L) ? (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b775afcc5534bb443d20e9f9f6bf949") : Long.valueOf(this.mCipStorageCenter.b(QUIT_TIME, 0L));
    }

    public void setCounterPref(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cf1fcf2f29b71032f2f533d6a76b403", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cf1fcf2f29b71032f2f533d6a76b403");
        } else if (this.mCipStorageCenter.a(CACHED_COUNT, i)) {
        } else {
            LogUtil.reportErrorImmediateSC("setCounterPref", "count=" + i);
        }
    }

    public int getCounterPref() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37bbc8975a345dec2c9ff4742433cd5a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37bbc8975a345dec2c9ff4742433cd5a")).intValue() : this.mCipStorageCenter.b(CACHED_COUNT, 0);
    }

    public long getLastSyncCountTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d07fbfc4f254f9b3965cea25fdad4a2", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d07fbfc4f254f9b3965cea25fdad4a2")).longValue() : this.mCipStorageCenter.b(LAST_SYNC_COUNT_TIME, 0L);
    }

    public void setLastSyncCountTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e60c736e372855834d95bacf1f1b8dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e60c736e372855834d95bacf1f1b8dd");
        } else {
            this.mCipStorageCenter.a(LAST_SYNC_COUNT_TIME, j);
        }
    }

    public String getLastSyncGestureScCountDate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4fad33ba96c8dee3a4731de05c6c646", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4fad33ba96c8dee3a4731de05c6c646") : this.mCipStorageCenter.b(LAST_SYNC_GESTURE_SC_COUNT_DATE, "");
    }

    public void setLastSyncGestureScCountDate(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85dd6a6effa17db102c29e3a08224754", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85dd6a6effa17db102c29e3a08224754");
        } else {
            this.mCipStorageCenter.a(LAST_SYNC_GESTURE_SC_COUNT_DATE, str);
        }
    }

    public int getCachedGestureScCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3125795a918d743497188ba81c634836", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3125795a918d743497188ba81c634836")).intValue() : this.mCipStorageCenter.b(CACHED_GESTURE_COUNT, 0);
    }

    public void setCachedGestureCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16eabd535aeec61c18750c464872de35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16eabd535aeec61c18750c464872de35");
        } else {
            this.mCipStorageCenter.a(CACHED_GESTURE_COUNT, i);
        }
    }

    public String getUUID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f2c4b0fee1ca98d760011bec0b0d462", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f2c4b0fee1ca98d760011bec0b0d462") : this.mUUIDCipStorageCenter.b("uuid", "");
    }

    public void saveGlobalSeqCounter(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "271d6e497b8a61802c6cde7fba19871e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "271d6e497b8a61802c6cde7fba19871e");
        } else {
            this.mCipStorageCenter.a(GLOBAL_SEQ_COUNTER, j);
        }
    }

    public long getGlobalSeqCounter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e39f08207a395abaaf90b7b04dc585b4", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e39f08207a395abaaf90b7b04dc585b4")).longValue() : this.mCipStorageCenter.b(GLOBAL_SEQ_COUNTER, -1L);
    }

    public void saveGlobalSeqID(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6cd3d7c125f4ff8aaada3c52090d5f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6cd3d7c125f4ff8aaada3c52090d5f3");
        } else {
            this.mCipStorageCenter.a(GLOBAL_SEQ_ID, str);
        }
    }

    public String getGlobalSeqID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20be654c4831a4369ff90730bc3f1cb6", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20be654c4831a4369ff90730bc3f1cb6") : this.mCipStorageCenter.b(GLOBAL_SEQ_ID, "");
    }

    public synchronized boolean retsetActivityActiveCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71c95fff9b5a0900a2570f417090ef71", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71c95fff9b5a0900a2570f417090ef71")).booleanValue();
        }
        return this.mMultiProcessCipStorageCenter.a(ACTIVITY_COUNTER, 0);
    }

    public synchronized int getActivityActiveCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a069d08cc460893cb135b9fcf5e36285", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a069d08cc460893cb135b9fcf5e36285")).intValue();
        }
        return this.mMultiProcessCipStorageCenter.b(ACTIVITY_COUNTER, 0);
    }

    public synchronized int incActivityActiveCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfafaed169dd900133ad41961152212f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfafaed169dd900133ad41961152212f")).intValue();
        }
        int activityActiveCount = getActivityActiveCount() + 1;
        if (!this.mMultiProcessCipStorageCenter.a(ACTIVITY_COUNTER, activityActiveCount)) {
            HashMap hashMap = new HashMap();
            hashMap.put("incActivityActiveCount-save", Boolean.FALSE);
            hashMap.put("incActivityActiveCount-target", Integer.valueOf(activityActiveCount));
            hashMap.put("incActivityActiveCount-targetFromStore", Integer.valueOf(getActivityActiveCount()));
            Statistics.getChannel("techportal").writeSystemCheck(PageInfoManager.getInstance().getCurrentPageInfoKey(), BID, hashMap);
        }
        LogUtil.log("lxsdk12", "incActivityActiveCount:an:" + getActivityActiveCount());
        return activityActiveCount;
    }

    public synchronized int decActivityActiveCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ce6be9aa9f8def1dd71d0fe6c6fe5f7", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ce6be9aa9f8def1dd71d0fe6c6fe5f7")).intValue();
        }
        int activityActiveCount = getActivityActiveCount() - 1;
        if (!this.mMultiProcessCipStorageCenter.a(ACTIVITY_COUNTER, activityActiveCount)) {
            HashMap hashMap = new HashMap();
            hashMap.put("decActivityActiveCount-save", Boolean.FALSE);
            hashMap.put("decActivityActiveCount-target", Integer.valueOf(activityActiveCount));
            hashMap.put("decActivityActiveCount-targetFromStore", Integer.valueOf(getActivityActiveCount()));
            Statistics.getChannel("techportal").writeSystemCheck(PageInfoManager.getInstance().getCurrentPageInfoKey(), BID, hashMap);
        }
        LogUtil.log("lxsdk12", "decActivityActiveCount:an:" + getActivityActiveCount());
        return activityActiveCount;
    }

    public synchronized void setLastPageCid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cf71386ac3aca469820f6a62a7345af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cf71386ac3aca469820f6a62a7345af");
        } else {
            this.mMultiProcessCipStorageCenter.a(LAST_PAGE_CID, str);
        }
    }
}
