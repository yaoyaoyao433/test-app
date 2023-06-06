package com.sankuai.waimai.pouch.plugin.protocol;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.pouch.plugin.params.b;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public abstract class AbsWMPouchPlugin<T extends b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected String capabilityID;
    protected Map<String, Object> mExtraParams;
    public T pluginParams;

    public void onDetachedFromContainer() {
    }

    public abstract void onReceiveJSEvent(String str, Map<String, Object> map);

    public abstract void onRenderFailed();

    public abstract void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar);

    public abstract void reset();

    public AbsWMPouchPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "944f3f149db0fa0308b41c8761bb78c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "944f3f149db0fa0308b41c8761bb78c1");
        } else {
            this.capabilityID = null;
        }
    }

    public void setPluginParams(T t) {
        this.pluginParams = t;
    }

    public void setExtraParams(@NonNull Map<String, Object> map) {
        this.mExtraParams = map;
    }
}
