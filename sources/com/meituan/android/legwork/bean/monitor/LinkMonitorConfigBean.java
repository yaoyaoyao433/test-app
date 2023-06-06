package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class LinkMonitorConfigBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, Object> config;
    public boolean supportHookActivity;
    public boolean uploadSuccess;
}
