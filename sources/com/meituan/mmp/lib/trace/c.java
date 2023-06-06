package com.meituan.mmp.lib.trace;

import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.msc.modules.update.PackageLoadReporter;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static final HashSet<String> a = new HashSet<>(Arrays.asList("service.load", PackageLoadReporter.Source.LAUNCH, LaunchMode.LAUNCH_MODE_PRELOAD));
    public static final HashSet<String> b = new HashSet<>(Arrays.asList("page.webview.init", "page.load.to.first.script", "page.load.to.page.ready", "page.load.to.dom.ready", "page.load.to.first.render"));
    public static final HashSet<String> c = new HashSet<>(Arrays.asList("service.engine.init", "service.load"));
}
