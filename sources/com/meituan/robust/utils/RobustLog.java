package com.meituan.robust.utils;

import com.meituan.robust.common.CommonConstant;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustLog {
    private static String logPath;
    private static List<String> logCacheList = new ArrayList();
    private static int count = 0;

    public static void logDiffInfo(String str) {
    }

    public static void log(String str, Throwable th) {
        logPatching();
        String stackTraceString = getStackTraceString(th);
        PrintStream printStream = System.err;
        printStream.println("robust log -> " + (str + CommonConstant.Symbol.COLON));
        System.err.println(stackTraceString);
    }

    public static void log(String str) {
        logPatching();
        PrintStream printStream = System.err;
        printStream.println("robust log -> " + (str));
    }

    public static void setRobustLogFilePath(String str) {
        logPath = str;
    }

    public static synchronized void write2FileLineByLine(String str) {
        synchronized (RobustLog.class) {
            System.err.println(str);
        }
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static void logPatching() {
        if (count < 2) {
            System.err.println("robust ...");
            count++;
        }
    }
}
