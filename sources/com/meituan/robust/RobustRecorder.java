package com.meituan.robust;

import com.meituan.robust.common.CommonConstant;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustRecorder {
    public static final String RegisteredFieldNameStr = "registered";
    static boolean registered;
    public static final String NameStr = "com.meituan.robust.RobustRecorder";
    public static final String InternalNameStr = NameStr.replace(CommonConstant.Symbol.DOT, "/");
    private static Map<String, RobustMethodLifeCallBack> callBackMap = new ConcurrentHashMap();
    private static Map<String, List<RobustRecord>> recordMap = new ConcurrentHashMap();

    static {
        registered = false;
        registered = false;
    }

    public static void start(String str) {
        if (!registered || str == null || str.trim().isEmpty()) {
            return;
        }
        RobustMethodLifeCallBackImpl robustMethodLifeCallBackImpl = new RobustMethodLifeCallBackImpl(str);
        recordMap.put(str, Collections.synchronizedList(new LinkedList()));
        callBackMap.put(str, robustMethodLifeCallBackImpl);
        RobustMethodLifeCallBackManager.addRobustMethodLifeCallBack(robustMethodLifeCallBackImpl);
    }

    public static void end(String str) {
        RobustMethodLifeCallBack robustMethodLifeCallBack;
        if (!registered || str == null || str.trim().isEmpty() || (robustMethodLifeCallBack = callBackMap.get(str)) == null) {
            return;
        }
        RobustMethodLifeCallBackManager.removeRobustMethodLifeCallBack(robustMethodLifeCallBack);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean addRecord(String str, RobustRecord robustRecord) {
        if (str == null || str.trim().isEmpty() || recordMap.get(str) == null) {
            return false;
        }
        return recordMap.get(str).add(robustRecord);
    }

    public static Collection<RobustRecord> getRecord(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        return recordMap.get(str);
    }

    public static Collection<RobustRecord> getAndRemoveRecord(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        return recordMap.remove(str);
    }
}
