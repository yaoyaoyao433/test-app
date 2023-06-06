package com.sankuai.titans.protocol.webcompat.jshost;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.utils.ReflectUtils;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes4.dex */
public abstract class AbsMsgCenter {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract <T> void publish(String str, T t);

    public abstract <T> void registerListener(String str, OnMsgReceivedListener<T> onMsgReceivedListener);

    public abstract <T> void unregisterListener(String str, OnMsgReceivedListener<T> onMsgReceivedListener);

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class OnMsgReceivedListener<T> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract void onReceiveMsg(String str, T t);

        public final Type getTClass() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a7d1cc59f59071ada4ac51d86c685c1", RobustBitConfig.DEFAULT_VALUE) ? (Type) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a7d1cc59f59071ada4ac51d86c685c1") : ReflectUtils.getActualTypeArguments(getClass(), 0);
        }
    }
}
