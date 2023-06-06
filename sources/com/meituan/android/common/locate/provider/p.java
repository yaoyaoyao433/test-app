package com.meituan.android.common.locate.provider;

import com.meituan.android.common.locate.offline.IOfflineDataDownloader;
import com.meituan.android.common.locate.offline.IOfflineSeek;
import com.meituan.android.common.locate.offline.IOfflineUserDataDownloader;
import com.meituan.robust.ChangeQuickRedirect;
/* loaded from: classes2.dex */
public class p {
    private static IOfflineSeek a;
    private static IOfflineDataDownloader b;
    private static IOfflineUserDataDownloader c;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static IOfflineSeek a() {
        return a;
    }

    public static void a(IOfflineDataDownloader iOfflineDataDownloader) {
        b = iOfflineDataDownloader;
    }

    public static void a(IOfflineSeek iOfflineSeek) {
        a = iOfflineSeek;
    }

    public static void a(IOfflineUserDataDownloader iOfflineUserDataDownloader) {
        c = iOfflineUserDataDownloader;
    }
}
