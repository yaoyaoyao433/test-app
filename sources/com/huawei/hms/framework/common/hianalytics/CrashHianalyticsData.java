package com.huawei.hms.framework.common.hianalytics;

import android.os.Process;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CrashHianalyticsData extends HianalyticsBaseData {
    public static final String EXCEPTION_NAME = "exception_name";
    public static final String MESSAGE = "message";
    public static final String PROCESS_ID = "process_id";
    public static final String STACK_TRACE = "stack_trace";
    public static final String THREAD_ID = "thread_id";
    public static final String THREAD_NAME = "thread_name";
    public static final String TIME = "time";

    public CrashHianalyticsData() {
        put("sdk_name", "Restclient_Crash");
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        put("time", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Process.myPid());
        put(PROCESS_ID, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Process.myTid());
        put(THREAD_ID, sb3.toString());
    }
}
