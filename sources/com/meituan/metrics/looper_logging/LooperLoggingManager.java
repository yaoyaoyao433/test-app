package com.meituan.metrics.looper_logging;

import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Printer;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LooperLoggingManager implements MessageQueue.IdleHandler {
    private static final long CHECK_TIME = 60000;
    private static final String TAG = "LooperLoggingManager";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean isReflectLoggingError = false;
    private static volatile LooperLoggingManager loggingManager;
    private long lastCheckPrinterTime;
    private Map<Looper, InnerPrinter> looperLoggingMap;

    public LooperLoggingManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b98c1a069ffcf3a8fedf3e5587b12cca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b98c1a069ffcf3a8fedf3e5587b12cca");
            return;
        }
        this.lastCheckPrinterTime = 0L;
        this.looperLoggingMap = new ConcurrentHashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            Looper.getMainLooper().getQueue().addIdleHandler(this);
            return;
        }
        MessageQueue messageQueue = null;
        try {
            messageQueue = (MessageQueue) reflectObject(Looper.getMainLooper(), "mQueue");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (messageQueue != null) {
            messageQueue.addIdleHandler(this);
        }
    }

    public static LooperLoggingManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8dc47844c957882277cbebf6f06b14db", RobustBitConfig.DEFAULT_VALUE)) {
            return (LooperLoggingManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8dc47844c957882277cbebf6f06b14db");
        }
        if (loggingManager == null) {
            synchronized (LooperLoggingManager.class) {
                if (loggingManager == null) {
                    loggingManager = new LooperLoggingManager();
                }
            }
        }
        return loggingManager;
    }

    public void registerMainLooperLogging(Printer printer) {
        Object[] objArr = {printer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "badd08e7bc3a93e7d26d2dbd746330df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "badd08e7bc3a93e7d26d2dbd746330df");
        } else {
            registerLogging(Looper.getMainLooper(), printer);
        }
    }

    public void unRegisterMainLooperLogging(Printer printer) {
        Object[] objArr = {printer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a258d9dbfdc2c3a6ce0ec48d048ea85d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a258d9dbfdc2c3a6ce0ec48d048ea85d");
        } else {
            unRegisterLogging(Looper.getMainLooper(), printer);
        }
    }

    public void registerLogging(Looper looper, Printer printer) {
        Object[] objArr = {looper, printer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f64e3053f92d962b53463764198657e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f64e3053f92d962b53463764198657e3");
        } else if (looper == null || printer == null) {
        } else {
            InnerPrinter innerPrinter = this.looperLoggingMap.get(looper);
            if (innerPrinter == null) {
                innerPrinter = new InnerPrinter();
                looper.setMessageLogging(innerPrinter);
                this.looperLoggingMap.put(looper, innerPrinter);
            }
            innerPrinter.addPrinter(printer);
        }
    }

    public void forceMainLooperSetMessageLogging() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2667119fcb5159cb6c0be0155c08c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2667119fcb5159cb6c0be0155c08c57");
        } else {
            forceSetMessageLogging(Looper.getMainLooper());
        }
    }

    public void forceSetMessageLogging(Looper looper) {
        InnerPrinter innerPrinter;
        Object[] objArr = {looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "342676ac23bfae27938c115e8f72c8a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "342676ac23bfae27938c115e8f72c8a4");
        } else if (looper == null || (innerPrinter = this.looperLoggingMap.get(looper)) == null) {
        } else {
            looper.setMessageLogging(innerPrinter);
        }
    }

    public void unRegisterLogging(Looper looper, Printer printer) {
        InnerPrinter innerPrinter;
        Object[] objArr = {looper, printer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ba22e2c9c1000e30a3c3790bcc2adad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ba22e2c9c1000e30a3c3790bcc2adad");
        } else if (looper == null || printer == null || (innerPrinter = this.looperLoggingMap.get(looper)) == null) {
        } else {
            innerPrinter.removePrinter(printer);
            if (innerPrinter.getPrinterSize() <= 0) {
                looper.setMessageLogging(null);
                this.looperLoggingMap.remove(looper);
            }
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "033dfc3d5e8f6ae4e9f1af7507fe105b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "033dfc3d5e8f6ae4e9f1af7507fe105b")).booleanValue();
        }
        resetPrinter();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.util.Printer] */
    private void resetPrinter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "228c047d2992b009d53848206e0a025f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "228c047d2992b009d53848206e0a025f");
        } else if (!isReflectLoggingError && TimeUtil.elapsedTimeMillis() - this.lastCheckPrinterTime >= 60000) {
            this.lastCheckPrinterTime = TimeUtil.elapsedTimeMillis();
            for (Map.Entry<Looper, InnerPrinter> entry : this.looperLoggingMap.entrySet()) {
                Looper key = entry.getKey();
                InnerPrinter value = entry.getValue();
                if (key != null && value != null) {
                    InnerPrinter innerPrinter = null;
                    try {
                        innerPrinter = (Printer) reflectObject(key, "mLogging");
                    } catch (Exception unused) {
                        Logger.getMetricxLogger().e("LooperLoggingManager reflectObject mLogging error");
                        isReflectLoggingError = true;
                    }
                    if (innerPrinter != null && !(innerPrinter instanceof InnerPrinter) && innerPrinter != value) {
                        Logger.getMetricsLogger().d(TAG, "[resetPrinter] maybe looper printer was replaced by others!");
                        value.addPrinter(innerPrinter);
                        key.setMessageLogging(value);
                    }
                }
            }
        }
    }

    private static <T> T reflectObject(Object obj, String str) throws Exception {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3967e568dfb39518297ae5a8fa97ed66", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3967e568dfb39518297ae5a8fa97ed66");
        }
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return (T) declaredField.get(obj);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class InnerPrinter implements Printer {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final Set<Printer> realPrinters;

        public void addPrinter(Printer printer) {
            Object[] objArr = {printer};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56b64664abc824ac7b71b6a5ccb7660d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56b64664abc824ac7b71b6a5ccb7660d");
            } else {
                this.realPrinters.add(printer);
            }
        }

        public void removePrinter(Printer printer) {
            Object[] objArr = {printer};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc39c7e385e4785afe760518a215d1ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc39c7e385e4785afe760518a215d1ee");
            } else {
                this.realPrinters.remove(printer);
            }
        }

        public InnerPrinter() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "209db43de1b7ff0c272be237232faeb3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "209db43de1b7ff0c272be237232faeb3");
            } else {
                this.realPrinters = new CopyOnWriteArraySet();
            }
        }

        public int getPrinterSize() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9913a18668ee033109a6c276ae16caf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9913a18668ee033109a6c276ae16caf")).intValue() : this.realPrinters.size();
        }

        @Override // android.util.Printer
        public void println(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b878aaee80ab53ddfb26dbf9d22d9a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b878aaee80ab53ddfb26dbf9d22d9a1");
                return;
            }
            for (Printer printer : this.realPrinters) {
                if (printer != null && !(printer instanceof InnerPrinter)) {
                    printer.println(str);
                }
            }
        }
    }
}
