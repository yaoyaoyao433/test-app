package com.sankuai.meituan.takeoutnew.handler;

import android.os.Build;
import android.os.DeadObjectException;
import android.os.DeadSystemException;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.takeoutnew.handler.b
    public final boolean a(Handler handler, Handler.Callback callback, Message message) {
        Object[] objArr = {handler, callback, message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4f2e46f9e79f364141eb425c6c92c7d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4f2e46f9e79f364141eb425c6c92c7d")).booleanValue();
        }
        if (a(message)) {
            try {
                handler.handleMessage(message);
            } catch (Throwable th) {
                PrintStream printStream = System.out;
                printStream.println("handleScheduleCrash " + Log.getStackTraceString(th));
            }
            return true;
        } else if (d(message) || b(message)) {
            try {
                handler.handleMessage(message);
            } catch (Throwable th2) {
                if (th2.getMessage() != null && th2.getMessage().contains("ClassNotFoundException when unmarshalling: android.support.v4.app.FragmentManagerState")) {
                    PrintStream printStream2 = System.out;
                    printStream2.println("handleBadParcelableException " + Log.getStackTraceString(th2));
                } else if (th2.getMessage() != null && th2.getMessage().contains("Activity top position already set to onTop=")) {
                    PrintStream printStream3 = System.out;
                    printStream3.println("handleActivityTopResumeCrash " + Log.getStackTraceString(th2));
                } else {
                    throw th2;
                }
            }
            return true;
        } else if (e(message)) {
            try {
                handler.handleMessage(message);
            } catch (Throwable th3) {
                if ((th3 instanceof NullPointerException) && th3.getMessage() != null && th3.getMessage().contains("ActivityClientRecord.profilerInfo")) {
                    com.sankuai.waimai.foundation.utils.log.a.b(th3);
                } else {
                    throw th3;
                }
            }
            return true;
        } else if (c(message)) {
            try {
                handler.handleMessage(message);
            } catch (Throwable th4) {
                if (Build.VERSION.SDK_INT >= 24) {
                    if ((th4 instanceof RuntimeException) || (th4 instanceof DeadSystemException) || (th4 instanceof DeadObjectException)) {
                        PrintStream printStream4 = System.out;
                        printStream4.println("handleMessageSleepingCrash" + Log.getStackTraceString(th4));
                    } else {
                        throw th4;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean a(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6a023040491c407c4adf8c8940a80d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6a023040491c407c4adf8c8940a80d8")).booleanValue();
        }
        try {
            return (Build.VERSION.SDK_INT == 33 && message.what == 134) ? message.arg1 == 2 : Build.VERSION.SDK_INT >= 28 && message.what == 134 && ((String) message.obj).contains("broadcast");
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean b(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4499a7f42e3b1f3dfd6f8e48eaeeca82", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4499a7f42e3b1f3dfd6f8e48eaeeca82")).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 29 && message.what == 159) {
                if (!"OnePlus".equalsIgnoreCase(Build.BRAND) && !"vivo".equalsIgnoreCase(Build.BRAND)) {
                    if ("meizu".equalsIgnoreCase(Build.BRAND)) {
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean c(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f874c7af1454232ebafee5d7d3f6c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f874c7af1454232ebafee5d7d3f6c2")).booleanValue();
        }
        try {
            if (message.what == 137) {
                if (Build.VERSION.SDK_INT != 28) {
                    if (Build.VERSION.SDK_INT == 29) {
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean d(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb0fbceb67033b324620a37a2b4196a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb0fbceb67033b324620a37a2b4196a0")).booleanValue();
        }
        try {
            if (message.what == 159) {
                if (Build.VERSION.SDK_INT == 29) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean e(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e117a5fb9d41f5cf440391969895562", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e117a5fb9d41f5cf440391969895562")).booleanValue();
        }
        try {
            if (message.what == 159) {
                if (Build.VERSION.SDK_INT == 31) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
