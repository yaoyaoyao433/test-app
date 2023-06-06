package com.meituan.robust;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.CopyOnWriteArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PatchProxy {
    private static CopyOnWriteArrayList<RobustExtension> registerExtensionList = new CopyOnWriteArrayList<>();
    private static ThreadLocal<RobustExtension> robustExtensionThreadLocal = new ThreadLocal<>();

    public static boolean isSupport(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, String str, long j) {
        if (changeQuickRedirect == null) {
            if (RobustRecorder.registered) {
                RobustMethodLifeCallBackManager.methodStart(objArr, obj, changeQuickRedirect, z, str, j);
            }
            if (registerExtensionList == null || registerExtensionList.isEmpty()) {
                return false;
            }
            Iterator<RobustExtension> it = registerExtensionList.iterator();
            while (it.hasNext()) {
                RobustExtension next = it.next();
                if (next != null && next.isSupport(new RobustArguments(objArr, obj, z, str, j))) {
                    robustExtensionThreadLocal.set(next);
                    return true;
                }
            }
            return false;
        } else if (changeQuickRedirect instanceof ChangeQuickRedirect) {
            String classMethod = getClassMethod(z, str);
            if (isEmpty(classMethod)) {
                return false;
            }
            try {
                return changeQuickRedirect.isSupport(classMethod, getObjects(objArr, obj, z));
            } catch (Throwable unused) {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isSupportConstructor(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, String str) {
        if (changeQuickRedirect != null && (changeQuickRedirect instanceof ChangeQuickRedirect)) {
            String classMethod = getClassMethod(z, str);
            if (isEmpty(classMethod)) {
                return false;
            }
            try {
                return changeQuickRedirect.isSupport(classMethod, getObjects(objArr, obj, z));
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static void methodEnd(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, String str, long j) {
        if (changeQuickRedirect == null && RobustRecorder.registered) {
            RobustMethodLifeCallBackManager.methodEnd(objArr, obj, changeQuickRedirect, z, str, j);
        }
    }

    public static void methodEnd(String str) {
        RobustMethodLifeCallBackManager.methodEnd(null, null, null, false, str, 0L);
    }

    public static Object accessDispatch(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, String str) {
        if (changeQuickRedirect == null) {
            RobustExtension robustExtension = robustExtensionThreadLocal.get();
            robustExtensionThreadLocal.remove();
            if (robustExtension != null) {
                notify(robustExtension.describeSelfFunction());
                return robustExtension.accessDispatch(new RobustArguments(objArr, obj, z, str, 0L));
            }
            return null;
        } else if (changeQuickRedirect instanceof ChangeQuickRedirect) {
            String classMethod = getClassMethod(z, str);
            if (isEmpty(classMethod)) {
                return null;
            }
            notify(Constants.PATCH_EXECUTE);
            return changeQuickRedirect.accessDispatch(classMethod, getObjects(objArr, obj, z));
        } else {
            return null;
        }
    }

    public static void accessDispatchVoid(Object[] objArr, Object obj, ChangeQuickRedirect changeQuickRedirect, boolean z, String str) {
        if (changeQuickRedirect == null) {
            RobustExtension robustExtension = robustExtensionThreadLocal.get();
            robustExtensionThreadLocal.remove();
            if (robustExtension != null) {
                notify(robustExtension.describeSelfFunction());
                robustExtension.accessDispatch(new RobustArguments(objArr, obj, z, str, 0L));
            }
        } else if (changeQuickRedirect instanceof ChangeQuickRedirect) {
            notify(Constants.PATCH_EXECUTE);
            String classMethod = getClassMethod(z, str);
            if (isEmpty(classMethod)) {
                return;
            }
            changeQuickRedirect.accessDispatch(classMethod, getObjects(objArr, obj, z));
        }
    }

    private static Object[] getObjects(Object[] objArr, Object obj, boolean z) {
        Object[] objArr2;
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        if (z) {
            objArr2 = new Object[length];
        } else {
            objArr2 = new Object[length + 1];
        }
        int i = 0;
        while (i < length) {
            objArr2[i] = objArr[i];
            i++;
        }
        if (!z) {
            objArr2[i] = obj;
        }
        return objArr2;
    }

    private static String getClassMethod(boolean z, String str) {
        try {
            StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
            String methodName = stackTraceElement.getMethodName();
            String className = stackTraceElement.getClassName();
            return className + CommonConstant.Symbol.COLON + methodName + CommonConstant.Symbol.COLON + z + CommonConstant.Symbol.COLON + str;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String[] getClassMethodName() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return new String[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName()};
    }

    public static synchronized boolean register(RobustExtension robustExtension) {
        boolean addIfAbsent;
        synchronized (PatchProxy.class) {
            if (registerExtensionList == null) {
                registerExtensionList = new CopyOnWriteArrayList<>();
            }
            addIfAbsent = registerExtensionList.addIfAbsent(robustExtension);
        }
        return addIfAbsent;
    }

    public static synchronized boolean unregister(RobustExtension robustExtension) {
        synchronized (PatchProxy.class) {
            if (registerExtensionList == null) {
                return false;
            }
            return registerExtensionList.remove(robustExtension);
        }
    }

    public static void reset() {
        registerExtensionList = new CopyOnWriteArrayList<>();
        robustExtensionThreadLocal = new ThreadLocal<>();
    }

    private static void notify(String str) {
        if (registerExtensionList == null) {
            return;
        }
        Iterator<RobustExtension> it = registerExtensionList.iterator();
        while (it.hasNext()) {
            it.next().notifyListner(str);
        }
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
