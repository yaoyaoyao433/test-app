package com.meituan.android.common.statistics.sensor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Random;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SensorUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String generateCollectId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1637a7995358d65f26d9ffa2b4f4ed3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1637a7995358d65f26d9ffa2b4f4ed3");
        }
        long currentTimeMillis = System.currentTimeMillis();
        String uuid = UUID.randomUUID().toString();
        Random random = new Random();
        return uuid + currentTimeMillis + random.nextInt(1000);
    }
}
