package com.sankuai.waimai.alita.platform.debug;

import android.os.Handler;
import android.os.MessageQueue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static MessageQueue b;

    public static MessageQueue a(Handler handler) {
        Object[] objArr = {handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75981da8c158844be4f21b89ea6bb26f", RobustBitConfig.DEFAULT_VALUE)) {
            return (MessageQueue) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75981da8c158844be4f21b89ea6bb26f");
        }
        if (handler == null) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = Class.forName("android.os.Handler").getDeclaredField("mQueue");
                declaredField.setAccessible(true);
                MessageQueue messageQueue = (MessageQueue) declaredField.get(handler);
                b = messageQueue;
                return messageQueue;
            } catch (Exception unused) {
                return null;
            }
        }
        return b;
    }
}
