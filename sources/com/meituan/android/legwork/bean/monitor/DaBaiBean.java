package com.meituan.android.legwork.bean.monitor;

import android.os.Build;
import android.support.annotation.Keep;
import com.meituan.android.legwork.a;
import com.meituan.android.legwork.common.hostInfo.b;
import com.meituan.android.legwork.monitor.MonitorCallbackManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class DaBaiBean implements Serializable {
    public static final int DABAI_DATA_EXPIRE_TIME = 3600;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int counter;
    public int expireTime;
    public long id;
    public String key;
    public Map<String, Object> tags;
    public int time;

    public DaBaiBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "402b3da954d653c714af22ec2a2de01c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "402b3da954d653c714af22ec2a2de01c");
        } else {
            this.tags = new HashMap();
        }
    }

    public void addTag(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e478946eb76d0197275a4a309880bb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e478946eb76d0197275a4a309880bb0");
        } else {
            this.tags.put(str, obj);
        }
    }

    public void addCommonTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bac3b5a429acf5c924f1b1ef17f7239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bac3b5a429acf5c924f1b1ef17f7239");
            return;
        }
        addTag("osType", 1);
        addTag("osVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        addTag("appVersion", MonitorCallbackManager.getInstance().appVersion());
        addTag("appType", Integer.valueOf(MonitorCallbackManager.getInstance().appType()));
        addTag("env", a.b ? "test" : "prod");
        addTag("channel", b.e().a());
    }
}
