package com.sankuai.meituan.shortvideocore.statistics;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.mtplayer.video.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.meituan.mtliveqos.common.c;
import com.sankuai.meituan.mtliveqos.utils.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final Executor b = c.a("short_video_stat");
    public static boolean g;
    public static String h;
    public long c;
    public boolean d;
    public long e;
    public String f;
    private Context i;
    private volatile String j;
    private volatile String k;

    public static /* synthetic */ Map a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "af02aefe1429e06813cba011610a89ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "af02aefe1429e06813cba011610a89ae");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_CPU_APP", Float.valueOf(b.b()));
        hashMap.put("MTLIVE_CPU_SYS", Float.valueOf(b.a()));
        return hashMap;
    }

    public static /* synthetic */ com.sankuai.meituan.mtliveqos.statistic.b c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc6b5fa5ca541c98f8bdaeb14db303f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtliveqos.statistic.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc6b5fa5ca541c98f8bdaeb14db303f7");
        }
        com.sankuai.meituan.mtliveqos.statistic.b bVar = new com.sankuai.meituan.mtliveqos.statistic.b();
        bVar.d = c.f.VOD;
        bVar.e = c.g.COIN_PLAYER;
        bVar.p = System.currentTimeMillis();
        bVar.i = str;
        return bVar;
    }

    public static /* synthetic */ Map c(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "8c961d56481e6513b2d16ffde4ab309d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "8c961d56481e6513b2d16ffde4ab309d");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_BUSINESS_PAGE", aVar.f);
        hashMap.put("MTLIVE_VIDEO_PLAYER_TYPE", aVar.j);
        hashMap.put("MTLIVE_VIDEO_FORM", aVar.k);
        return hashMap;
    }

    public a(Context context) {
        Activity activity;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fede288182725d9af59b01be0392f15d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fede288182725d9af59b01be0392f15d");
            return;
        }
        this.i = context;
        this.c = System.currentTimeMillis();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f23a53f77c8162557bab52570fcf6b7", RobustBitConfig.DEFAULT_VALUE)) {
            activity = (Activity) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f23a53f77c8162557bab52570fcf6b7");
        } else {
            if (context != null) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                } else if (context instanceof ContextWrapper) {
                    Context baseContext = ((ContextWrapper) context).getBaseContext();
                    if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                    }
                }
            }
            activity = null;
        }
        this.f = activity != null ? activity.getClass().getName() : "";
    }

    public final void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3abc4074051ffb370cd6b16803554cef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3abc4074051ffb370cd6b16803554cef");
            return;
        }
        final String str = null;
        if (lVar == l.TYPE_XPLAYER) {
            str = "TYPE_XPLAYER";
        } else if (lVar == l.TYPE_ANDROID) {
            str = "TYPE_ANDROID";
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.j)) {
            return;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "078d4466d9265670c25df62ba01c3c4a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "078d4466d9265670c25df62ba01c3c4a");
                    return;
                }
                a.this.j = str;
            }
        });
    }

    public final void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b64dad5886936e28b26088a7ec1e465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b64dad5886936e28b26088a7ec1e465");
            return;
        }
        new StringBuilder("setCurrentContainerType: ").append(str);
        if (TextUtils.equals(str, this.k)) {
            return;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.9
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f064d0f7e48ec18cae80dfaff73ada5d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f064d0f7e48ec18cae80dfaff73ada5d");
                    return;
                }
                a.this.k = str;
            }
        });
    }

    public static void a(final Context context, final String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe595a527f05d6e2bbc40f2ee58045f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe595a527f05d6e2bbc40f2ee58045f0");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87565f404aa38dd0630eeb7ded97202a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87565f404aa38dd0630eeb7ded97202a");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(SnifferDBHelper.COLUMN_LOG, str);
                    com.sankuai.meituan.mtliveqos.a.a(context, hashMap, "short_video_coin_player");
                }
            });
        }
    }

    public final void a(final boolean z, final String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1c62a1e42e7957e1f0cfdecabe06e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1c62a1e42e7957e1f0cfdecabe06e9");
            return;
        }
        new StringBuilder("reportHashPlayCache: ").append(z);
        com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.12
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b7386294b270f76fda0237bab5aee18", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b7386294b270f76fda0237bab5aee18");
                    return;
                }
                Map a2 = a.a(a.this);
                a2.put("MTLIVE_VIDEO_PLAY_SOURCE", Float.valueOf(z ? 2.0f : 1.0f));
                com.sankuai.meituan.mtliveqos.a.a(a.this.i, a.c(str), a2, a.c(a.this));
            }
        });
    }

    public final void b(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40b49def36c0016b643c213260fde8d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40b49def36c0016b643c213260fde8d0");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "088b9ba6211587c9aeff5f99266e671a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "088b9ba6211587c9aeff5f99266e671a");
                        return;
                    }
                    Map a2 = a.a(a.this);
                    a2.put("MTLIVE_VIDEO_PLAY_TOTAL_COUNT", Float.valueOf(1.0f));
                    com.sankuai.meituan.mtliveqos.a.a(a.this.i, a.c(str), a2, a.c(a.this));
                }
            });
        }
    }

    public final void a(final int i, final String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12d126cd2200cf15668142d8d1288b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12d126cd2200cf15668142d8d1288b71");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc5358f57090b0cac952d0653c78c4d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc5358f57090b0cac952d0653c78c4d2");
                        return;
                    }
                    Map a2 = a.a(a.this);
                    a2.put("MTLIVE_VIDEO_PLAY_FAILED_COUNT", Float.valueOf(1.0f));
                    a2.put("MTLIVE_VIDEO_PLAY_FAILED_ERROR_CODE", Float.valueOf(i));
                    com.sankuai.meituan.mtliveqos.a.a(a.this.i, a.c(str), a2, a.c(a.this));
                }
            });
        }
    }

    public final void b(final int i, final String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b21be09b86fa14b648f3000ca27994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b21be09b86fa14b648f3000ca27994");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b7e1459342f9a0a10239979f38db388", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b7e1459342f9a0a10239979f38db388");
                        return;
                    }
                    Map a2 = a.a(a.this);
                    a2.put("MTLIVE_VIDEO_PLAY_FROZEN_COUNT", Float.valueOf(i));
                    com.sankuai.meituan.mtliveqos.a.a(a.this.i, a.c(str), a2, a.c(a.this));
                }
            });
        }
    }

    public final void a(final float f, final String str) {
        Object[] objArr = {Float.valueOf(f), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35442c48a4db8fce4b2595dea581830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35442c48a4db8fce4b2595dea581830");
            return;
        }
        new StringBuilder("reportVideoFrozenDuration: ").append(f);
        com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.shortvideocore.statistics.a.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3b2da44488ac3fb9bd0167e0dfb8027", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3b2da44488ac3fb9bd0167e0dfb8027");
                    return;
                }
                Map a2 = a.a(a.this);
                a2.put("MTLIVE_VIDEO_PLAY_FROZEN_DURATION", Float.valueOf(f));
                com.sankuai.meituan.mtliveqos.a.a(a.this.i, a.c(str), a2, a.c(a.this));
            }
        });
    }
}
