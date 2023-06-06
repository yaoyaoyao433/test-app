package com.meituan.msi.api.file;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class StatsData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String path;
    public Stats stats;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class Stats {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean isDirectory;
        public boolean isFile;
        public long lastAccessedTime;
        public long lastModifiedTime;
        public int mode;
        public long size;
    }
}
