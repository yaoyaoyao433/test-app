package com.meituan.robust.assistant.report;

import android.content.Context;
import android.os.AsyncTask;
import com.meituan.robust.Patch;
import com.meituan.robust.RobustApkHashUtils;
import com.meituan.robust.assistant.HostConfig;
import com.meituan.robust.assistant.PatchManipulateImpl;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.PrintStream;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DevOperate {
    DevOperate() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void openTest(Context context) {
        if (HostConfig.isTestEnvironment(context)) {
            System.err.println("robust interact is already in test environment");
        } else {
            b.a(new FetchPatchServerTask(context, true, false), AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void closeTest(Context context) {
        if (HostConfig.isTestEnvironment(context)) {
            HostConfig.switchTestEnvironment(context, false);
            System.err.println("robust interact close test environment success");
            return;
        }
        System.err.println("robust interact is already in normal environment");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void displayState(Context context) {
        b.a(new FetchPatchServerTask(context, false, true), AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class FetchPatchServerTask extends AsyncTask<Void, Void, Boolean> {
        private Context context;
        private boolean isDisplayState;
        private boolean isOpenTest;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
        }

        FetchPatchServerTask(Context context, boolean z, boolean z2) {
            this.context = context;
            this.isOpenTest = z;
            this.isDisplayState = z2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            boolean canConnectPatchTestServer = DevTools.canConnectPatchTestServer();
            if (!canConnectPatchTestServer) {
                System.err.println("robust interact can not access test environment, please check your network");
                return Boolean.valueOf(canConnectPatchTestServer);
            }
            if (this.isOpenTest) {
                HostConfig.switchTestEnvironment(this.context, true);
                System.err.println("robust interact open test success");
            }
            if (this.isDisplayState) {
                if (HostConfig.isTestEnvironment(this.context)) {
                    System.err.println("robust interact is in test environment");
                } else {
                    System.err.println("robust interact is in normal environment");
                }
                String currentPatchesState = DevOperate.getCurrentPatchesState(this.context);
                PrintStream printStream = System.err;
                printStream.println("robust interact " + currentPatchesState);
            }
            return Boolean.valueOf(canConnectPatchTestServer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getCurrentPatchesState(Context context) {
        List<Patch> sortedPatches = PatchManipulateImpl.getSortedPatches();
        StringBuilder sb = new StringBuilder();
        sb.append("apkhash: " + RobustApkHashUtils.readRobustApkHash(context));
        sb.append(", patch list is ");
        if (sortedPatches == null || sortedPatches.isEmpty()) {
            sb.append("empty");
        } else {
            for (Patch patch : sortedPatches) {
                sb.append("id: " + patch.getName());
                sb.append(StringUtil.SPACE);
                sb.append("md5:" + patch.getMd5());
                sb.append(StringUtil.SPACE);
                StringBuilder sb2 = new StringBuilder("state:");
                sb2.append(patch.isAppliedSuccess() ? "true" : "false");
                sb.append(sb2.toString());
                sb.append(CommonConstant.Symbol.COMMA);
            }
        }
        sb.append(" .");
        return sb.toString();
    }
}
