package com.sankuai.meituan.shortvideocore.mrn.cache;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static a b;
    private static volatile b c;
    private static final Gson d = new Gson();

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77c434ec36cc2ae8d6255e55292d583b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77c434ec36cc2ae8d6255e55292d583b");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                    int i = com.sankuai.meituan.shortvideocore.config.a.a(com.sankuai.meituan.shortvideocore.config.b.a).f;
                    if (i > 0 && b == null) {
                        b = new a(i);
                    }
                }
            }
        }
        return c;
    }

    public final synchronized void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b63bd387e813ffcc725c82278436b9c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b63bd387e813ffcc725c82278436b9c5");
        } else {
            b(str);
        }
    }

    public final synchronized MTVideoPlayerView a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16857582f41916d832f657ed673417fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTVideoPlayerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16857582f41916d832f657ed673417fe");
        }
        MTVideoPlayerView mTVideoPlayerView = null;
        try {
            int i = com.sankuai.meituan.shortvideocore.config.a.a(com.sankuai.meituan.shortvideocore.config.b.a).f;
            if (b != null && i > 0) {
                new StringBuilder("preplayPoolget = ").append(b.toString());
                MTVideoPlayerView mTVideoPlayerView2 = b.get(str);
                try {
                    new StringBuilder("preplayPoolget = ").append(mTVideoPlayerView2);
                    b.a(str);
                } catch (Exception unused) {
                }
                mTVideoPlayerView = mTVideoPlayerView2;
            }
        } catch (Exception unused2) {
        }
        return mTVideoPlayerView;
    }

    public final synchronized void a(MTVideoPlayerView mTVideoPlayerView, String str) {
        Object[] objArr = {mTVideoPlayerView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d56594ba95f4d566f571367b229da4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d56594ba95f4d566f571367b229da4");
            return;
        }
        try {
            int i = com.sankuai.meituan.shortvideocore.config.a.a(com.sankuai.meituan.shortvideocore.config.b.a).f;
            if (b != null && i > 0 && mTVideoPlayerView != null && !TextUtils.isEmpty(str)) {
                b.put(str, mTVideoPlayerView);
                new StringBuilder("preplayPoolSize = ").append(b.size());
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7511b00f0a6b1f780396ce818c513b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7511b00f0a6b1f780396ce818c513b9");
            return;
        }
        try {
            int i = com.sankuai.meituan.shortvideocore.config.a.a(com.sankuai.meituan.shortvideocore.config.b.a).f;
            if (b != null && i > 0 && !TextUtils.isEmpty(str)) {
                MTVideoPlayerView mTVideoPlayerView = b.get(str);
                if (mTVideoPlayerView != null) {
                    mTVideoPlayerView.g();
                }
                b.a(str);
                new StringBuilder("preplayPoolSize = ").append(b.size());
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caa862bf10de1ffab75046173f0486d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caa862bf10de1ffab75046173f0486d9");
            return;
        }
        try {
            int i = com.sankuai.meituan.shortvideocore.config.a.a(com.sankuai.meituan.shortvideocore.config.b.a).f;
            if (b != null && i > 0) {
                for (MTVideoPlayerView mTVideoPlayerView : b.values()) {
                    mTVideoPlayerView.g();
                }
                b.clear();
                new StringBuilder("preplayPoolSize = ").append(b.size());
            }
        } catch (Exception unused) {
        }
    }
}
