package com.sankuai.meituan.arbiter.hook;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LogCollector {
    public static final String LOCAL_KEY_ERROR = "error";
    public static final String LOCAL_KEY_LOG_EVENT = "log_event";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static LogCollector sInstance = new LogCollector();
    private ThreadLocal<Map<String, Object>> local;
    private LogListener mLogListener;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface LogListener {
        void onExecStartActivityFinish(Map<String, Object> map);
    }

    public LogCollector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2e58d5027f74d54bd84768621dfc712", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2e58d5027f74d54bd84768621dfc712");
        } else {
            this.local = new ThreadLocal<>();
        }
    }

    public static LogCollector instance() {
        return sInstance;
    }

    public void addLogForExecStartActivity(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4289904f66dd18dfde4894cf7515819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4289904f66dd18dfde4894cf7515819");
            return;
        }
        Map<String, Object> map = this.local.get();
        if (map == null) {
            map = new HashMap<>();
            this.local.set(map);
        }
        map.put(str, obj);
    }

    public void endForExecStartActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6ee04a238cb3dcdc4f827bb9ee06b1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6ee04a238cb3dcdc4f827bb9ee06b1b");
            return;
        }
        Map<String, Object> map = this.local.get();
        if (map == null || map.size() <= 0) {
            return;
        }
        if (this.mLogListener != null) {
            this.mLogListener.onExecStartActivityFinish(map);
        }
        map.clear();
    }

    public void setLogListener(LogListener logListener) {
        this.mLogListener = logListener;
    }
}
