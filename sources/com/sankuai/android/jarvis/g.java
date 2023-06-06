package com.sankuai.android.jarvis;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final Random b = new Random();

    public static /* synthetic */ String a(StackTraceElement[] stackTraceElementArr) {
        Object[] objArr = {stackTraceElementArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0d038518f0be0c53e2316466ecd2101", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0d038518f0be0c53e2316466ecd2101");
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("    at ");
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7eae758afc0b1edb223c6db43aa94195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7eae758afc0b1edb223c6db43aa94195");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("jtype", 4);
        hashMap.put("butn", str);
        hashMap.put("buitc", Integer.valueOf(i));
        f.a().c.a(hashMap);
    }

    public static void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de2a6381d54828bba2636d400e28ed22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de2a6381d54828bba2636d400e28ed22");
            return;
        }
        f.a().c.a("瞬时任务过多\n业务线程池名称: " + str + "\n瞬时任务数量: " + i + "\n");
    }

    public static void a(String str, long j, int i) {
        Object[] objArr = {str, new Long(j), 3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be0450a19fd782e31808a3a60314d4d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be0450a19fd782e31808a3a60314d4d9");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("jtype", 3);
        hashMap.put("butn", str);
        hashMap.put("butst", Long.valueOf(j));
        f.a().c.a(hashMap);
    }

    public static void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4aa4bf1e3f7a9c46dcf2f7ebf6874d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4aa4bf1e3f7a9c46dcf2f7ebf6874d37");
            return;
        }
        f.a().c.a("业务任务耗时异常\n业务线程池名称: " + str + "\n业务任务耗时: " + j + "\n");
    }

    public static void c(String str, int i) {
        int i2 = 0;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02d453131ba722ba3f0bede848d0d252", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02d453131ba722ba3f0bede848d0d252");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("jtype", 5);
        hashMap.put("butn", str);
        hashMap.put("buqs", Integer.valueOf(i));
        f a2 = f.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c909494bd1ca8ebea64edd1b9788f920", RobustBitConfig.DEFAULT_VALUE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c909494bd1ca8ebea64edd1b9788f920")).intValue();
        } else if (a2.d instanceof l) {
            i2 = ((l) a2.d).a();
        }
        hashMap.put("jtps", Integer.valueOf(i2));
        f.a().c.a(hashMap);
    }

    public static void d(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62cd7708641a48e12dcfa1803d06bab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62cd7708641a48e12dcfa1803d06bab5");
            return;
        }
        f.a().c.a("业务线程队列堆积任务过多\n业务线程池名称: " + str + "\n业务队列堆积的任务数: " + i + "\n");
    }

    public static ScheduledFuture<?> a(int i) {
        Object[] objArr = {60};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb7e6bd88c9a8f615f23f5e526b4df6d", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledFuture) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb7e6bd88c9a8f615f23f5e526b4df6d") : f.a().h().schedule(new Runnable() { // from class: com.sankuai.android.jarvis.g.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f392478ac40cf120c4208a17587f3f2d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f392478ac40cf120c4208a17587f3f2d");
                    return;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    Field declaredField = ThreadGroup.class.getDeclaredField("systemThreadGroup");
                    declaredField.setAccessible(true);
                    ThreadGroup threadGroup = (ThreadGroup) declaredField.get(null);
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount + (activeCount / 2)];
                    int enumerate = threadGroup.enumerate(threadArr);
                    for (int i2 = 0; i2 < enumerate; i2++) {
                        Thread thread = threadArr[i2];
                        if (thread != null && thread.getName().contains("parallel")) {
                            sb.append(thread.getName());
                            sb.append(StringUtil.SPACE);
                            sb.append(thread.getId());
                            sb.append("\n");
                            sb.append(g.a(thread.getStackTrace()));
                            sb.append("\n");
                        }
                    }
                    if (sb.length() == 0) {
                        return;
                    }
                    f a2 = f.a();
                    if (a2.f && a2.c != null) {
                        z = true;
                    }
                    if (z) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("jtype", 7);
                        hashMap.put("trace", sb.toString());
                        f.a().c.a(hashMap);
                    }
                    b bVar = f.a().c;
                    bVar.a("Jarvis线程池长期不执行任务trace: " + sb.toString());
                } catch (Exception unused) {
                }
            }
        }, 60L, TimeUnit.SECONDS);
    }

    public static ScheduledFuture<?> a(int i, final String str) {
        Object[] objArr = {120, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a0ccb89c8a3923d5069f2dea0aed99b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledFuture) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a0ccb89c8a3923d5069f2dea0aed99b");
        }
        if (b.nextInt(100) > 10) {
            return null;
        }
        return f.a().h().schedule(new Runnable() { // from class: com.sankuai.android.jarvis.g.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33be2032cb586dd354a4fee90fbf49cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33be2032cb586dd354a4fee90fbf49cf");
                    return;
                }
                if (f.a().c()) {
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("jtype", 1);
                    hashMap.put("butn", str);
                    f.a().c.a(hashMap);
                }
                b bVar = f.a().c;
                bVar.a("检测到死循环，线程名称为: " + str);
            }
        }, 120L, TimeUnit.SECONDS);
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba3eb5dfcf896dd2f3de608e0a20d391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba3eb5dfcf896dd2f3de608e0a20d391");
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("jtype", 6);
        hashMap.put("jqs", Integer.valueOf(i));
        f.a().c.a(hashMap);
    }

    public static void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f961fcdc177096d3e3cbf50718af5e4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f961fcdc177096d3e3cbf50718af5e4d");
            return;
        }
        b bVar = f.a().c;
        bVar.a("Jarvis任务队列堆积任务过多,任务数为: " + i);
    }
}
