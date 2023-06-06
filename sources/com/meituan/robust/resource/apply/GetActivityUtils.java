package com.meituan.robust.resource.apply;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class GetActivityUtils {
    private GetActivityUtils() {
    }

    public static Activity getForegroundActivity(Context context) {
        List<Activity> activities = getActivities(context, true);
        if (activities.isEmpty()) {
            return null;
        }
        return activities.get(0);
    }

    public static List<Activity> getAllCurrentActivities(Context context) {
        return getActivities(context, false);
    }

    public static List<Activity> getActivities(Context context, boolean z) {
        Collection values;
        ArrayList arrayList = new ArrayList();
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object currentActivityThread = RobustResourceReflect.getCurrentActivityThread(context);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(currentActivityThread);
            if (obj instanceof HashMap) {
                values = ((HashMap) obj).values();
            } else if (Build.VERSION.SDK_INT < 19 || !(obj instanceof ArrayMap)) {
                return arrayList;
            } else {
                values = ((ArrayMap) obj).values();
            }
            for (Object obj2 : values) {
                Class<?> cls2 = obj2.getClass();
                if (z) {
                    Field declaredField2 = cls2.getDeclaredField("paused");
                    declaredField2.setAccessible(true);
                    if (!declaredField2.getBoolean(obj2)) {
                    }
                }
                Field declaredField3 = cls2.getDeclaredField(PushConstants.INTENT_ACTIVITY_NAME);
                declaredField3.setAccessible(true);
                Activity activity = (Activity) declaredField3.get(obj2);
                if (activity != null) {
                    arrayList.add(activity);
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }
}
