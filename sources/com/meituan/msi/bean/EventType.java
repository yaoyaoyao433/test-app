package com.meituan.msi.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public enum EventType {
    COMMON_EVENT,
    VIEW_EVENT,
    CONTAINER_EVENT;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static EventType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fdc4e124f06098a099b77111fcb763c8", RobustBitConfig.DEFAULT_VALUE) ? (EventType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fdc4e124f06098a099b77111fcb763c8") : (EventType) Enum.valueOf(EventType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EventType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ba9a020b00a1b668938fe1c524174fa", RobustBitConfig.DEFAULT_VALUE) ? (EventType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ba9a020b00a1b668938fe1c524174fa") : (EventType[]) values().clone();
    }

    EventType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e01b8d90d2f8d0a3700299f2d6da6c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e01b8d90d2f8d0a3700299f2d6da6c0");
        }
    }
}
