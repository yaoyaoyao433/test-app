package com.sankuai.titans.protocol.adaptor;

import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IAppTitansInfo {
    Set<String> CDNDomain();

    String appName();

    String appUa();

    boolean geolocationEnable();

    IFileAccess getFileAccess();

    Set<String> getSchemeWhiteSet();

    boolean isDebugMode();

    String titansAppId();

    boolean usingSlowDraw();
}
