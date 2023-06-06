package com.meituan.android.common.locate.platform.logs;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import java.util.List;
/* loaded from: classes2.dex */
public class b {
    private static volatile b c = new b();
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.dianping.monitor.impl.m a;
    private com.dianping.monitor.impl.a b;
    private String d;
    private SharedPreferences e;
    private boolean f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3ecdd80e591d8806f9795084bfa3e06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3ecdd80e591d8806f9795084bfa3e06");
            return;
        }
        this.a = null;
        this.b = null;
        this.d = null;
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6fd50fa244b1b419e4743944462ef4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6fd50fa244b1b419e4743944462ef4a");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce02228171d8511bb5e694418f82b2a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce02228171d8511bb5e694418f82b2a6");
            return;
        }
        String[] split = "2.34.1".split("\\.");
        StringBuilder sb = new StringBuilder(16);
        int i = 0;
        while (true) {
            if (!(i < 3) || !(i < split.length)) {
                this.d = sb.toString();
                return;
            }
            if (i != 0) {
                sb.append(CommonConstant.Symbol.DOT);
            }
            sb.append(split[i]);
            i++;
        }
    }

    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a322c214deeb8368c4fe3e06a1942cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a322c214deeb8368c4fe3e06a1942cc");
            return;
        }
        this.a = new com.dianping.monitor.impl.m(XPlayerConstants.FFP_MSG_VIDEO_RENDERING_BEFORE, context);
        f();
        this.e = com.meituan.android.common.locate.reporter.f.b();
        if (this.e != null) {
            this.f = this.e.getBoolean("open_raptor_data", false);
        }
    }

    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10e33a805cf3addffd1bca0f5f4a932a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10e33a805cf3addffd1bca0f5f4a932a");
        } else if (this.f && this.a != null) {
            this.a.a(str, str2);
        }
    }

    public void a(String str, List<Float> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "021f13c9e687bcb53dafef5aaca7a437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "021f13c9e687bcb53dafef5aaca7a437");
        } else if (this.f && this.a != null) {
            this.a.a(str, list);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dfcf5817fe28a91110db2b03a72b480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dfcf5817fe28a91110db2b03a72b480");
        } else if (this.f) {
            a("sdkver", this.d);
            a("app", com.meituan.android.common.locate.provider.a.a);
            this.a.a();
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0269f1c275fc941592fd6e70e4601f08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0269f1c275fc941592fd6e70e4601f08");
        } else if (this.f) {
            a("sdkver", this.d);
            a("app", com.meituan.android.common.locate.provider.a.a);
            this.a.a();
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d38fa31a97f0f345884c6455a0f2ef1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d38fa31a97f0f345884c6455a0f2ef1c");
        } else if (this.f) {
            a("sdkver", this.d);
            a("app", com.meituan.android.common.locate.provider.a.a);
            this.a.a();
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6243ae0b55bb26bfe2d978713838fcca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6243ae0b55bb26bfe2d978713838fcca");
        } else if (this.f) {
            a("sdkver", this.d);
            a("app", com.meituan.android.common.locate.provider.a.a);
            if (this.a == null) {
                return;
            }
            this.a.a();
        }
    }
}
