package com.meituan.android.soloader.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        File[] listFiles;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffdb6adb3bdfe57a06d03b05db77d1fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffdb6adb3bdfe57a06d03b05db77d1fb");
        } else if (str != null && !"".equals(str)) {
            ArrayList arrayList = new ArrayList();
            File file = new File(str);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            concurrentLinkedQueue.add(file);
            while (!concurrentLinkedQueue.isEmpty()) {
                File file2 = (File) concurrentLinkedQueue.poll();
                if (file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                    concurrentLinkedQueue.addAll(Arrays.asList(listFiles));
                }
                arrayList.add(file2);
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((File) arrayList.get(size)).delete();
            }
        }
    }
}
