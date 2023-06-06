package com.meituan.robust.assistant;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.RobustApkHashUtils;
import com.meituan.robust.RobustCallBack;
import com.meituan.robust.resource.util.ProcessUtil;
import java.io.PrintStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PatchUtils {
    static final String TAG = "robust";
    public static final int USE_LAST_RESULT = 1002;
    public static final int USE_LOCAL_PATCH_LIST = 1003;
    public static final int USE_NONE = 1001;
    private static long WAITING_MILLI_SECONDS = 1200;
    private static long WAITING_MILLI_SECONDS_OTHER_PROCESS = 2000;

    private static long getWaitingMilliSeconds(Context context) {
        if (ProcessUtil.isMainProcess(context)) {
            return WAITING_MILLI_SECONDS;
        }
        return WAITING_MILLI_SECONDS_OTHER_PROCESS;
    }

    public static void applyPatch(Context context, String str, String str2, String str3, long j, String str4, ApplyCallback applyCallback) {
        applyPatch(context, str, str2, str3, j, str4, 1001, new DefaultCallBack(applyCallback));
    }

    public static void applyPatchInLocal(Context context, String str, String str2, String str3, long j, String str4, ApplyCallback applyCallback) {
        applyPatch(context, str, str2, str3, j, str4, 1003, new DefaultCallBack(applyCallback));
    }

    public static void applyPatch(Context context, String str, String str2, String str3, long j, String str4, RobustCallBack robustCallBack) {
        applyPatch(context, str, str2, str3, j, str4, 1001, robustCallBack);
    }

    public static void applyPatchInLocal(Context context, String str, String str2, String str3, long j, String str4, RobustCallBack robustCallBack) {
        applyPatch(context, str, str2, str3, j, str4, 1003, robustCallBack);
    }

    public static void applyPatch(Context context, String str, String str2, String str3, long j, String str4) {
        applyPatch(context, str, str2, str3, j, str4, 1001, new DefaultCallBack());
    }

    public static void applyPatchInLocal(Context context, String str, String str2, String str3, long j, String str4) {
        applyPatch(context, str, str2, str3, j, str4, 1003, new DefaultCallBack());
    }

    private static void applyPatch(Context context, String str, String str2, String str3, long j, String str4, int i, RobustCallBack robustCallBack) {
        if (context == null) {
            return;
        }
        String readRobustApkHash = RobustApkHashUtils.readRobustApkHash(context);
        if (TextUtils.isEmpty(readRobustApkHash) && robustCallBack != null) {
            robustCallBack.logNotify("apkHash  is isEmpty", "class:PatchUtils method:applyPatch line:133");
        }
        if (1003 == i) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            PatchExecutorStartEndCallBack patchExecutorStartEndCallBack = new PatchExecutorStartEndCallBack() { // from class: com.meituan.robust.assistant.PatchUtils.1
                @Override // com.meituan.robust.assistant.PatchExecutorStartEndCallBack
                public final void start() {
                    PrintStream printStream = System.err;
                    printStream.println("ROBUST START AT " + System.currentTimeMillis());
                }

                @Override // com.meituan.robust.assistant.PatchExecutorStartEndCallBack
                public final void end() {
                    PrintStream printStream = System.err;
                    printStream.println("ROBUST END   AT " + System.currentTimeMillis());
                    countDownLatch.countDown();
                }
            };
            PatchManipulateImpl patchManipulateImpl = new PatchManipulateImpl(str2, str3, j, readRobustApkHash, str4, i, robustCallBack);
            long currentTimeMillis = System.currentTimeMillis();
            PatchHelper.getInstance(context).execute(patchManipulateImpl, patchManipulateImpl, patchExecutorStartEndCallBack);
            try {
                countDownLatch.await(getWaitingMilliSeconds(context), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
                patchManipulateImpl.exceptionNotify(e, "class:PatchUtils method:applyPatch line:178");
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            PrintStream printStream = System.err;
            printStream.println("ROBUST Main Thread waiting for " + currentTimeMillis2 + " Millis ");
            return;
        }
        PatchManipulateImpl patchManipulateImpl2 = new PatchManipulateImpl(str2, str3, j, readRobustApkHash, str4, i, robustCallBack);
        PatchHelper.getInstance(context).execute(patchManipulateImpl2, patchManipulateImpl2);
    }
}
