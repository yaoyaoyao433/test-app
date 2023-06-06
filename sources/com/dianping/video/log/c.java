package com.dianping.video.log;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c implements a {
    public static ChangeQuickRedirect a;
    private static c b;
    private a c;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9b9500a88dd983682539ec863821108", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9b9500a88dd983682539ec863821108");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    @Override // com.dianping.video.log.a
    public final void a(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "823d3d76de0a79905af63333ef922c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "823d3d76de0a79905af63333ef922c98");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            if (this.c == null) {
                this.c = new b();
            }
            this.c.a(cls, str, str2);
        }
    }

    @Override // com.dianping.video.log.a
    public final void a(Class cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69b1e5866ea85137cf5c68e94cba3ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69b1e5866ea85137cf5c68e94cba3ac");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.c == null) {
                this.c = new b();
            }
            this.c.a(cls, str);
        }
    }

    @Override // com.dianping.video.log.a
    public final void b(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f7ad99c8c71bed1a5cb00f951e7c829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f7ad99c8c71bed1a5cb00f951e7c829");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            if (this.c == null) {
                this.c = new b();
            }
            this.c.b(cls, str, str2);
        }
    }

    @Override // com.dianping.video.log.a
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df09af292099036b6f5dada15a33e92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df09af292099036b6f5dada15a33e92");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            if (this.c == null) {
                this.c = new b();
            }
            this.c.a(str, str2);
        }
    }
}
