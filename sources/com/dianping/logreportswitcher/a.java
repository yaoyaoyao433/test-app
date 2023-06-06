package com.dianping.logreportswitcher;

import com.meituan.android.common.metricx.koom.KoomDebugger;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static final List<String> a = Collections.unmodifiableList(new ArrayList(Arrays.asList(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, KoomDebugger.CRASH, "codelog", "anr", "jni", "mobileapi", "appspeed", "metric", "push", "logan", "dpid", "stream_monitor", "luban", "sharkuseluban")));
}
