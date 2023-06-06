package com.sankuai.meituan.riverrunplayer.util;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.meituan.xp.core.XPlayer;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"beauty-tx-flv.meituan.net", "beauty-tx-rtmp.meituan.net"};
    private static volatile boolean c = false;

    public static /* synthetic */ boolean a(boolean z) {
        c = false;
        return false;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7316b66c5ff44ca509d93eca7117b82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7316b66c5ff44ca509d93eca7117b82");
        } else if (c) {
        } else {
            c = true;
            c.a("DnsPreInit", new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.util.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc63d38eb25b19ebc7f93a0efae9460d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc63d38eb25b19ebc7f93a0efae9460d");
                        return;
                    }
                    try {
                        for (String str : a.b) {
                            XPlayer.native_preDns(str);
                        }
                        a.a(false);
                    } catch (Throwable unused) {
                        a.a(false);
                    }
                }
            }).start();
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf8eeb0871fb4e28c69d27d78b50b59e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf8eeb0871fb4e28c69d27d78b50b59e");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            final String host = Uri.parse(str).getHost();
            if (TextUtils.isEmpty(host)) {
                return;
            }
            c.a("DnsPreload", new Runnable() { // from class: com.sankuai.meituan.riverrunplayer.util.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b869fd4d114e7191d581400257d9478", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b869fd4d114e7191d581400257d9478");
                        return;
                    }
                    try {
                        XPlayer.native_preDns(host);
                    } catch (Throwable unused) {
                    }
                }
            }).start();
        }
    }
}
