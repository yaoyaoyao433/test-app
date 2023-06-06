package com.meituan.mtwebkit.internal.update.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class VersionInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appHttpsUrl;
    public String appurl;
    public String changeLog;
    public int currentVersion;
    public int forceupdate;
    public boolean isUpdated;
    public String md5;
    public String versionname;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class VersionInfoWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public VersionInfo versioninfo;
    }
}
