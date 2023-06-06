package com.meituan.android.aurora;

import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AuroraReporter {
    private static final String FIELD_EXECUTE_COUNT = "executeCount";
    private static final String FIELD_EXECUTE_OPPORTUNITY = "executeOpportunity";
    private static final String FIELD_GUID = "guid";
    private static final String FIELD_PROCESS_ID = "processId";
    private static final String FIELD_PROCESS_NAME = "processName";
    private static final String FIELD_STARTUP_STAGE = "stage";
    private static final String FIELD_TASK_ISANCHORS = "isAnchors";
    private static final String FIELD_TASK_NAME = "taskName";
    private static final String FIELD_TASK_OFFSET = "taskOffset";
    private static final String FIELD_THREAD_COST = "threadCost";
    private static final String FIELD_THREAD_NAME = "tn";
    private static final String LOG_TAG = "aurora_launcher";
    private static final String SNIFFER_CHANNEL = "Aurora";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Gson gson;
    private static String mBabelToken;
    public static volatile boolean sAbandon;
    public static String sGuid;
    private static int sProcessId;
    private static BlockingQueue<LogCache> sNeedReportLogQueue = new LinkedBlockingQueue();
    private static boolean isT2End = false;
    @Keep
    private static ArrayList<Map<String, Object>> lifeCycleList = new ArrayList<>();

    public static void collectLifeCycleData(String str, long j, long j2, String str2, int i) {
        Object[] objArr = {str, new Long(j), new Long(j2), str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5683c82fd8670482a0af28cc1e84434", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5683c82fd8670482a0af28cc1e84434");
        } else if (sAbandon) {
            clearLogQueue();
        } else if (Aurora.getInstance().isHomeCacheLoaded()) {
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            addLifeCycleList("lifeCycle:", str, str2, elapsedRealtime, SystemClock.currentThreadTimeMillis() - j2, i);
            if (elapsedRealtime <= 0) {
                return;
            }
            ensureId();
            sNeedReportLogQueue.offer(new LogCache(str, AuroraAnchorsRuntime.getOffsetTime(j), SystemClock.currentThreadTimeMillis() - j2, str2, elapsedRealtime, i));
        }
    }

    public static void abandon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a12d2eeeb44032999f63dcbcdc51e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a12d2eeeb44032999f63dcbcdc51e13");
            return;
        }
        sAbandon = true;
        clearLogQueue();
    }

    public static void setBabelToken(String str) {
        mBabelToken = str;
    }

    public static void smell(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e101bc7b4d89795e3344accef78b35a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e101bc7b4d89795e3344accef78b35a6");
        } else {
            smell(str, str2, th.getMessage(), getExceptionStr(th));
        }
    }

    public static void smell(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae9e4dfdc635a52226167cc285f94e83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae9e4dfdc635a52226167cc285f94e83");
        } else {
            Sniffer.smell(SNIFFER_CHANNEL, str, str2, str3, str4);
        }
    }

    private static String getExceptionStr(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70d5e9878fd2f29c61a0b671cf57992a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70d5e9878fd2f29c61a0b671cf57992a");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            return byteArrayOutputStream.toString();
        } catch (Throwable unused) {
            return "00^_^00";
        }
    }

    public static void collectTaskData(AuroraTask auroraTask) {
        Object[] objArr = {auroraTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f08fd9f6271d0343547d38dd35e04cf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f08fd9f6271d0343547d38dd35e04cf2");
        } else if (auroraTask == null) {
        } else {
            if (sAbandon) {
                clearLogQueue();
            } else if (!auroraTask.isVirtualNode() && ProcessUtils.isMainProcess(Aurora.getApplication()) && auroraTask.getTaskCostTime() > 0) {
                ensureId();
                sNeedReportLogQueue.offer(new LogCache(auroraTask));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class LogCache {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int executeCount;
        public String guid;
        public boolean isAnchors;
        public long offsetTime;
        public String opportunityName;
        public int processId;
        public String processName;
        public int stage;
        public long taskCostTime;
        public String taskName;
        public long threadCostTime;
        public String threadName;

        public LogCache(AuroraTask auroraTask) {
            String opportunityName;
            Object[] objArr = {auroraTask};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57ba4c655eea61999618755b7508463e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57ba4c655eea61999618755b7508463e");
                return;
            }
            this.processName = ProcessUtils.getCurrentProcessName();
            this.processId = AuroraReporter.sProcessId;
            this.guid = AuroraReporter.sGuid;
            this.executeCount = -1;
            this.stage = -1;
            this.taskName = auroraTask.getId();
            this.taskCostTime = auroraTask.getTaskCostTime();
            int opportunity = auroraTask.getOpportunity();
            if (opportunity != -10) {
                opportunityName = String.valueOf(opportunity);
            } else {
                opportunityName = auroraTask.getOpportunityName() != null ? auroraTask.getOpportunityName() : "Unknown";
            }
            this.opportunityName = opportunityName;
            this.offsetTime = auroraTask.getTaskOffsetTime();
            this.threadCostTime = auroraTask.getThreadCostTime();
            this.threadName = auroraTask.getThreadName();
            this.isAnchors = auroraTask.isAnchors();
            this.stage = auroraTask.getSection();
        }

        public LogCache(String str, long j, long j2, String str2, long j3, int i) {
            Object[] objArr = {str, new Long(j), new Long(j2), str2, new Long(j3), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbd8195be4f7aac5ea5cf77abe24ba20", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbd8195be4f7aac5ea5cf77abe24ba20");
                return;
            }
            this.processName = ProcessUtils.getCurrentProcessName();
            this.processId = AuroraReporter.sProcessId;
            this.guid = AuroraReporter.sGuid;
            this.executeCount = -1;
            this.stage = -1;
            this.taskName = str;
            this.threadName = Thread.currentThread().getName();
            this.offsetTime = j;
            this.threadCostTime = j2;
            this.opportunityName = str2;
            this.taskCostTime = j3;
            this.stage = i;
        }

        public LogCache(AuroraMainLooperRecord auroraMainLooperRecord) {
            Object[] objArr = {auroraMainLooperRecord};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2805157d18f53ce7549ca81e16ce6999", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2805157d18f53ce7549ca81e16ce6999");
                return;
            }
            this.processName = ProcessUtils.getCurrentProcessName();
            this.processId = AuroraReporter.sProcessId;
            this.guid = AuroraReporter.sGuid;
            this.executeCount = -1;
            this.stage = -1;
            this.taskName = auroraMainLooperRecord.key;
            this.threadCostTime = auroraMainLooperRecord.time;
            this.offsetTime = AuroraAnchorsRuntime.getOffsetTime(auroraMainLooperRecord.startTime);
            this.threadName = Thread.currentThread().getName();
            this.opportunityName = "main_looper";
            this.executeCount = auroraMainLooperRecord.count;
            this.taskCostTime = auroraMainLooperRecord.time;
            this.stage = auroraMainLooperRecord.section;
        }

        public Log toLog() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf454a592fc71eed0777d599d4a97252", RobustBitConfig.DEFAULT_VALUE) ? (Log) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf454a592fc71eed0777d599d4a97252") : AuroraReporter.buildLog(this.taskCostTime, toHashMap());
        }

        public HashMap<String, Object> toHashMap() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e252a8a9b2abfba4e01a2fec6c26605", RobustBitConfig.DEFAULT_VALUE)) {
                return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e252a8a9b2abfba4e01a2fec6c26605");
            }
            HashMap<String, Object> hashMap = new HashMap<>(16);
            hashMap.put(AuroraReporter.FIELD_TASK_NAME, this.taskName);
            hashMap.put(AuroraReporter.FIELD_TASK_OFFSET, Long.valueOf(this.offsetTime));
            hashMap.put(AuroraReporter.FIELD_THREAD_COST, Long.valueOf(this.threadCostTime));
            hashMap.put("tn", this.threadName);
            hashMap.put(AuroraReporter.FIELD_EXECUTE_OPPORTUNITY, this.opportunityName);
            hashMap.put("processName", this.processName);
            hashMap.put(AuroraReporter.FIELD_PROCESS_ID, Integer.valueOf(this.processId));
            hashMap.put(AuroraReporter.FIELD_GUID, this.guid);
            hashMap.put(AuroraReporter.FIELD_TASK_ISANCHORS, Boolean.valueOf(this.isAnchors));
            if (this.stage != -1) {
                hashMap.put(AuroraReporter.FIELD_STARTUP_STAGE, Integer.valueOf(this.stage));
            }
            if (this.executeCount >= 0) {
                hashMap.put(AuroraReporter.FIELD_EXECUTE_COUNT, Integer.valueOf(this.executeCount));
            }
            return hashMap;
        }
    }

    public static void collectMainLooperData(AuroraMainLooperRecord auroraMainLooperRecord) {
        Object[] objArr = {auroraMainLooperRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d88cd496a9d59ddd04495cbfd6c78f84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d88cd496a9d59ddd04495cbfd6c78f84");
        } else if (sAbandon) {
            clearLogQueue();
        } else if (auroraMainLooperRecord == null) {
        } else {
            long j = auroraMainLooperRecord.time;
            printMainLooperLog("mainLooper:", auroraMainLooperRecord.key, "main_looper", j, auroraMainLooperRecord.time, auroraMainLooperRecord.section);
            if (j <= 0) {
                return;
            }
            ensureId();
            sNeedReportLogQueue.offer(new LogCache(auroraMainLooperRecord));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Log buildLog(long j, Map<String, Object> map) {
        Object[] objArr = {new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b245900a5e7879a3e95b67472c8a41f8", RobustBitConfig.DEFAULT_VALUE) ? (Log) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b245900a5e7879a3e95b67472c8a41f8") : new Log.Builder(null).value(j).tag(LOG_TAG).token(mBabelToken).optional(map).build();
    }

    private static void clearLogQueue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a98c30a7b0fbcc02cb910e5552ce32cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a98c30a7b0fbcc02cb910e5552ce32cf");
        } else if (sNeedReportLogQueue.isEmpty()) {
        } else {
            sNeedReportLogQueue.clear();
        }
    }

    private static void ensureId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b71d44f0cd81ac57a9fdb31d5a6ed83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b71d44f0cd81ac57a9fdb31d5a6ed83");
            return;
        }
        if (sProcessId == 0) {
            sProcessId = Process.myPid();
        }
        if (TextUtils.isEmpty(sGuid)) {
            sGuid = UUID.randomUUID().toString();
        }
    }

    public static void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50072140d8dd0b410e6056aaaa12a4f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50072140d8dd0b410e6056aaaa12a4f2");
        } else {
            upload();
        }
    }

    public static void upload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4aa6d2bc1632e1bb4e6990634b0b39fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4aa6d2bc1632e1bb4e6990634b0b39fb");
        } else if (sAbandon || sNeedReportLogQueue.isEmpty()) {
        } else {
            isT2End = true;
            b.a(AuroraAnchorsRuntime.getSingleThreadPool(), new Runnable() { // from class: com.meituan.android.aurora.AuroraReporter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Log log;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "57bb42b96b4e46eb8b5bbd26f5cacc00", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "57bb42b96b4e46eb8b5bbd26f5cacc00");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    do {
                        LogCache logCache = (LogCache) AuroraReporter.sNeedReportLogQueue.poll();
                        if (logCache != null && (log = logCache.toLog()) != null) {
                            arrayList.add(log);
                        }
                    } while (!AuroraReporter.sNeedReportLogQueue.isEmpty());
                    Babel.logRT(arrayList);
                    AuroraReporter.printLifeCycleLog();
                }
            });
        }
    }

    public static String getUnReportTaskInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c1ddafa770390aabcca86f59e2fdde93", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c1ddafa770390aabcca86f59e2fdde93");
        }
        if (sNeedReportLogQueue.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (LogCache logCache : sNeedReportLogQueue) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(logCache.threadName);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    jSONObject.put(logCache.threadName, optJSONArray);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("t", logCache.taskCostTime);
                jSONObject2.put("o", logCache.offsetTime);
                jSONObject2.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, logCache.threadCostTime);
                jSONObject2.put("n", logCache.taskName);
                optJSONArray.put(jSONObject2);
            } catch (JSONException unused) {
            }
        }
        return jSONObject.toString();
    }

    @Keep
    public static void printMainLooperLog(String str, String str2, String str3, long j, long j2, int i) {
        Object[] objArr = {str, str2, str3, new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b23488141c3f62112b13c84e9b88e24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b23488141c3f62112b13c84e9b88e24");
        } else if (AuroraAnchorsRuntime.debuggable()) {
            String buildLogJson = buildLogJson(str2, str3, j, j2, i);
            PrintStream printStream = System.out;
            printStream.println(str + buildLogJson);
        }
    }

    @Keep
    public static void addLifeCycleList(String str, String str2, String str3, long j, long j2, int i) {
        Object[] objArr = {str, str2, str3, new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b03185f10a97a0a9d1fbaa2c59faa78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b03185f10a97a0a9d1fbaa2c59faa78");
        } else if (!AuroraAnchorsRuntime.debuggable() || isT2End) {
        } else {
            lifeCycleList.add(buildLogObject(str2, str3, j, j2, i));
        }
    }

    @Keep
    private static Map<String, Object> buildLogObject(String str, String str2, long j, long j2, int i) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d88cdbc737889b3e14c41849b2dea84", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d88cdbc737889b3e14c41849b2dea84");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(FIELD_TASK_NAME, str);
        hashMap.put("opportunityName", str2);
        hashMap.put("taskCostTime", Long.valueOf(j));
        hashMap.put("threadCostTime", Long.valueOf(j2));
        hashMap.put(FIELD_GUID, sGuid);
        hashMap.put(FIELD_STARTUP_STAGE, Integer.valueOf(i));
        hashMap.put("threadName", Thread.currentThread().getName());
        return hashMap;
    }

    @Keep
    private static String buildLogJson(String str, String str2, long j, long j2, int i) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "335584a2443cb267ff63e12817821ad4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "335584a2443cb267ff63e12817821ad4");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(FIELD_TASK_NAME, str);
        hashMap.put("opportunityName", str2);
        hashMap.put("taskCostTime", Long.valueOf(j));
        hashMap.put("threadCostTime", Long.valueOf(j2));
        hashMap.put(FIELD_GUID, sGuid);
        hashMap.put(FIELD_STARTUP_STAGE, Integer.valueOf(i));
        hashMap.put("threadName", Thread.currentThread().getName());
        if (gson == null) {
            gson = new Gson();
        }
        return gson.toJson(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void printLifeCycleLog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6664b100789fe725bf4d6f248ad85487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6664b100789fe725bf4d6f248ad85487");
        } else if (!AuroraAnchorsRuntime.debuggable() || lifeCycleList.size() == 0) {
        } else {
            if (gson == null) {
                gson = new Gson();
            }
            Iterator<Map<String, Object>> it = lifeCycleList.iterator();
            while (it.hasNext()) {
                PrintStream printStream = System.out;
                printStream.println("lifeCycle:" + gson.toJson(it.next()));
            }
        }
    }
}
