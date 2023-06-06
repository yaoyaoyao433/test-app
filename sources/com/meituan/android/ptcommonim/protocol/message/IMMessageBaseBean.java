package com.meituan.android.ptcommonim.protocol.message;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public abstract class IMMessageBaseBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Map<String, Object> originMap;

    public abstract Map<String, Object> getSubMessageBeanMap();

    public IMMessageBaseBean(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbf54b69403494ee5a4df9a5977c5398", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbf54b69403494ee5a4df9a5977c5398");
        } else {
            this.originMap = map;
        }
    }

    public final Map<String, Object> getMessageBeanMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bc3f467f378968732606e938352c402", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bc3f467f378968732606e938352c402");
        }
        if (this.originMap != null && !this.originMap.isEmpty()) {
            return this.originMap;
        }
        return getSubMessageBeanMap();
    }
}
