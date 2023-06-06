package com.meituan.android.common.unionid.oneid.monitor;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.log.LogManager;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MonitorManager {
    public static final String CONTEXT_IS_NULL_MSG = "context is null";
    public static final String ERR_MSG = "err_msg";
    public static final String ID = "id";
    public static final String INCREMENTID = "incremental_id";
    public static final String MARKKEY = "mark_key";
    public static final String MARK_VALUE = "mark_value";
    public static final String MSG = "msg";
    public static final String OAIDERRMSG = "oaiderrmsg";
    public static final String OPNAME = "op_name";
    public static final String PROCESSNAME = "process_name";
    public static final String REQS = "reqs";
    public static final String RETRYCOUNT = "retry_count";
    public static final String SESSIONID = "session_id";
    public static final String THREADNAME = "thread_name";
    public static final String TIMESTAMP = "tm";
    public static final String UPTIMEMILLS = "up_tm";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static LogManager logManager;

    public static void initLogManager(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7098c0079eb5f5534a7e7c9e3edba7ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7098c0079eb5f5534a7e7c9e3edba7ed");
        } else if (logManager == null) {
            logManager = LogManager.getInstance(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r21.equals("unionId") != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.android.common.unionid.oneid.monitor.MonitorLog createNewMonitor(com.meituan.android.common.unionid.oneid.statstics.StatUtil r17, android.content.Context r18, long r19, java.lang.String r21) {
        /*
            r0 = r17
            r1 = r21
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r10 = 0
            r2[r10] = r0
            r11 = 1
            r2[r11] = r18
            java.lang.Long r3 = new java.lang.Long
            r12 = r19
            r3.<init>(r12)
            r14 = 2
            r2[r14] = r3
            r3 = 3
            r2[r3] = r1
            com.meituan.robust.ChangeQuickRedirect r8 = com.meituan.android.common.unionid.oneid.monitor.MonitorManager.changeQuickRedirect
            java.lang.String r9 = "3877256b411548bba975ed6880ebfe64"
            r4 = 0
            r6 = 1
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r2
            r5 = r8
            r7 = r9
            r10 = r8
            r14 = r9
            r8 = r15
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L36
            r0 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r0, r10, r11, r14)
            com.meituan.android.common.unionid.oneid.monitor.MonitorLog r0 = (com.meituan.android.common.unionid.oneid.monitor.MonitorLog) r0
            return r0
        L36:
            com.meituan.android.common.unionid.oneid.monitor.MonitorLog r7 = new com.meituan.android.common.unionid.oneid.monitor.MonitorLog
            r7.<init>()
            long r2 = android.os.SystemClock.uptimeMillis()
            r7.startTime = r2
            if (r0 == 0) goto L45
            r0.monitorLog = r7
        L45:
            com.meituan.android.common.unionid.oneid.log.LogManager r2 = com.meituan.android.common.unionid.oneid.monitor.MonitorManager.logManager
            if (r2 != 0) goto L4f
            com.meituan.android.common.unionid.oneid.log.LogManager r2 = com.meituan.android.common.unionid.oneid.log.LogManager.getInstance(r18)
            com.meituan.android.common.unionid.oneid.monitor.MonitorManager.logManager = r2
        L4f:
            r10 = -1
            int r2 = r21.hashCode()
            r3 = -286660534(0xffffffffeee9e84a, float:-3.6195414E28)
            if (r2 == r3) goto L79
            r3 = 3090087(0x2f26a7, float:4.330134E-39)
            if (r2 == r3) goto L6f
            r3 = 3601339(0x36f3bb, float:5.046551E-39)
            if (r2 == r3) goto L64
            goto L83
        L64:
            java.lang.String r2 = "uuid"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L83
            r11 = 0
            goto L84
        L6f:
            java.lang.String r2 = "dpid"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L83
            r11 = 2
            goto L84
        L79:
            java.lang.String r2 = "unionId"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L83
            goto L84
        L83:
            r11 = -1
        L84:
            switch(r11) {
                case 0: goto La5;
                case 1: goto L96;
                case 2: goto L88;
                default: goto L87;
            }
        L87:
            goto Lb3
        L88:
            java.lang.String r1 = "dpid"
            r2 = 121(0x79, float:1.7E-43)
            r3 = 1
            r4 = 0
            r0 = r17
            r5 = r19
            addEvent(r0, r1, r2, r3, r4, r5)
            goto Lb3
        L96:
            java.lang.String r1 = "unionId"
            r2 = 121(0x79, float:1.7E-43)
            r3 = 1
            r4 = 0
            r0 = r17
            r5 = r19
            addEvent(r0, r1, r2, r3, r4, r5)
            goto Lb3
        La5:
            java.lang.String r1 = "uuid"
            r2 = 121(0x79, float:1.7E-43)
            r3 = 1
            r4 = 0
            r0 = r17
            r5 = r19
            addEvent(r0, r1, r2, r3, r4, r5)
        Lb3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.monitor.MonitorManager.createNewMonitor(com.meituan.android.common.unionid.oneid.statstics.StatUtil, android.content.Context, long, java.lang.String):com.meituan.android.common.unionid.oneid.monitor.MonitorLog");
    }

    public static Pair<Integer, JSONObject> addEvent(StatUtil statUtil, String str, int i, boolean z) {
        Object[] objArr = {statUtil, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "738b5660a044ec7d4e62049e951035d6", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "738b5660a044ec7d4e62049e951035d6") : addEvent(statUtil, str, i, z, null);
    }

    public static Pair<Integer, JSONObject> addEvent(StatUtil statUtil, String str, int i, boolean z, JSONObject jSONObject, long j) {
        long j2 = j;
        Object[] objArr = {statUtil, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f37e7d7771417d33595dac8ca45d37a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f37e7d7771417d33595dac8ca45d37a");
        }
        if (statUtil == null || statUtil.monitorLog == null || statUtil.monitorLog.events == null) {
            return null;
        }
        JSONObject eventJSONObject = getEventJSONObject(str, i, z, jSONObject);
        if (j2 == -1) {
            try {
                j2 = System.currentTimeMillis();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        eventJSONObject.put("tm", j2);
        statUtil.monitorLog.events.put(eventJSONObject);
        if (logManager != null) {
            logManager.produceLog(eventJSONObject);
        }
        if (statUtil.monitorLog == null || statUtil.monitorLog.events.length() <= 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(statUtil.monitorLog.events.length() - 1), eventJSONObject);
    }

    public static void addEvent(String str, int i, boolean z, JSONObject jSONObject) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2edd20c8309ad0326c8436a109ef54a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2edd20c8309ad0326c8436a109ef54a");
        } else if (logManager != null) {
            logManager.produceLog(getEventJSONObject(str, i, z, jSONObject));
        }
    }

    private static JSONObject getEventJSONObject(String str, int i, boolean z, JSONObject jSONObject) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a9f7c8348d7995ebd6e3aaf9f00a7dd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a9f7c8348d7995ebd6e3aaf9f00a7dd1");
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            if ("unionId".equals(str)) {
                jSONObject2.put(MARKKEY, Constants.Environment.KEY_UNION_ID);
            } else if ("oaid".equals(str)) {
                jSONObject2.put(MARKKEY, "tokeno");
            } else {
                jSONObject2.put(MARKKEY, str);
            }
            jSONObject2.put(MARK_VALUE, i);
            jSONObject2.put(INCREMENTID, MonitorLog.incementalid.getAndIncrement());
            jSONObject2.put(OPNAME, !z ? 1 : 0);
            jSONObject2.put("thread_name", Thread.currentThread().getName());
            jSONObject2.put("tm", System.currentTimeMillis());
            jSONObject2.put(UPTIMEMILLS, SystemClock.uptimeMillis());
            jSONObject2.put(PROCESSNAME, MonitorLog.processName);
            if (jSONObject != null) {
                jSONObject2.put("msg", jSONObject);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject2;
    }

    public static Pair<Integer, JSONObject> addEvent(StatUtil statUtil, String str, int i, boolean z, JSONObject jSONObject) {
        Object[] objArr = {statUtil, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc8ef0e883641caab22ff0db22b5a802", RobustBitConfig.DEFAULT_VALUE) ? (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc8ef0e883641caab22ff0db22b5a802") : addEvent(statUtil, str, i, z, jSONObject, -1L);
    }

    public static void addRtt(String str, StatUtil statUtil, String str2) {
        Object[] objArr = {str, statUtil, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8ad0f168c06951fce53e142ba3d6270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8ad0f168c06951fce53e142ba3d6270");
        } else if (statUtil == null || statUtil.monitorLog == null || statUtil.monitorLog.events == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(REQS, new JSONArray(str));
                }
                jSONObject.put("session_id", str2);
                statUtil.monitorLog.rtt = jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static JSONObject getMsg(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e5f50769ed0dd6d065dde1cb3d546d1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e5f50769ed0dd6d065dde1cb3d546d1c");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MARK_VALUE, i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("id", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("errMsg", str2);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject getMsg(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95199516f5ab27abc0fa55de28d82d00", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95199516f5ab27abc0fa55de28d82d00");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject getMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "967f5de8ae02e8c9b58c1193092703b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "967f5de8ae02e8c9b58c1193092703b7");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject getExceptionMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45917faa6057e41faaca9442c65a638e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45917faa6057e41faaca9442c65a638e");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("errMsg", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject getRetryMsg(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "298b1b3e2f15dcfdfd44f66dea88ed15", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "298b1b3e2f15dcfdfd44f66dea88ed15");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RETRYCOUNT, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject getOaidErrMsg(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95c54eeb6a55b7f98e7daa3d11386cd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95c54eeb6a55b7f98e7daa3d11386cd8");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(OAIDERRMSG, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static JSONObject getAppIdMsg(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf46420b85a0f0be125a11b0498097aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf46420b85a0f0be125a11b0498097aa");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("newAppId", str);
            jSONObject.put("localAppId", str2);
            jSONObject.put("sharedAppId", str3);
            jSONObject.put("checkHardWare", z);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject getAppIdMsg(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "083af58876f3dc0888aa7118e3cf59d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "083af58876f3dc0888aa7118e3cf59d0");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("newAppId", str);
            jSONObject.put("localAppId", str2);
            jSONObject.put("sharedAppId", str3);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
