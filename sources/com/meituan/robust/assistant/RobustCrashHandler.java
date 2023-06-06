package com.meituan.robust.assistant;

import android.content.Context;
import java.lang.Thread;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustCrashHandler implements Thread.UncaughtExceptionHandler {
    private static final long LIMTIT_TIME = 60000;
    private static long closingTime = 0;
    private static boolean startCheckCrash = false;
    private Context context;
    private Thread.UncaughtExceptionHandler oldHandler;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setClosingTime() {
        startCheckCrash = true;
        closingTime = System.currentTimeMillis() + 60000;
    }

    private boolean timeValid() {
        return startCheckCrash && closingTime - System.currentTimeMillis() > 0;
    }

    public RobustCrashHandler(Context context) {
        this.context = context;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (th != null) {
            try {
                if (timeValid()) {
                    PatchHelper.getInstance(this.context).deleteLocalPatchList();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.oldHandler != null) {
            this.oldHandler.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDefaultUncaughtExceptionHandlerSelf() {
        if (this.oldHandler == null) {
            this.oldHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }
}
