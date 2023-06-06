package com.meituan.robust;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustMethodLifeCallBackManager {
    private static CopyOnWriteArrayList<RobustMethodLifeCallBack> methodLifeCallBacks = new CopyOnWriteArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void addRobustMethodLifeCallBack(RobustMethodLifeCallBack robustMethodLifeCallBack) {
        if (methodLifeCallBacks.contains(robustMethodLifeCallBack)) {
            return;
        }
        methodLifeCallBacks.add(robustMethodLifeCallBack);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void removeRobustMethodLifeCallBack(RobustMethodLifeCallBack robustMethodLifeCallBack) {
        if (methodLifeCallBacks.contains(robustMethodLifeCallBack)) {
            methodLifeCallBacks.remove(robustMethodLifeCallBack);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean methodStart(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, String str, long j) {
        if (methodLifeCallBacks.size() == 0) {
            return false;
        }
        RobustMethodLifeArgs robustMethodLifeArgs = new RobustMethodLifeArgs(objArr, obj, z, str, j);
        Iterator<RobustMethodLifeCallBack> it = methodLifeCallBacks.iterator();
        while (it.hasNext()) {
            it.next().start(robustMethodLifeArgs);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean methodEnd(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, String str, long j) {
        if (methodLifeCallBacks.size() == 0) {
            return false;
        }
        RobustMethodLifeArgs robustMethodLifeArgs = new RobustMethodLifeArgs(objArr, obj, z, str, j);
        Iterator<RobustMethodLifeCallBack> it = methodLifeCallBacks.iterator();
        while (it.hasNext()) {
            it.next().end(robustMethodLifeArgs);
        }
        return false;
    }
}
