package com.sankuai.xm.video;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.k;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static f f;
    public c b;
    public b c;
    public String d;
    int e;
    private a g;
    private String h;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a246ba35d5eac3f73fade534ae88c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a246ba35d5eac3f73fade534ae88c3");
        } else {
            this.g = new g();
        }
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e67c1a52d1ce2ed67814c6495e3a51b", 6917529027641081856L)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e67c1a52d1ce2ed67814c6495e3a51b");
        }
        if (f == null) {
            synchronized (f.class) {
                if (f == null) {
                    f = new f();
                }
            }
        }
        return f;
    }

    private boolean a(String str, @NonNull String str2) {
        boolean mkdirs;
        Object[] objArr = {null, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e5b9c8361bcbb1d34d26d90f879cf14", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e5b9c8361bcbb1d34d26d90f879cf14")).booleanValue();
        }
        this.h = null;
        com.sankuai.xm.recorder.b.b("VideoAgent::init %s, %s", null, str2);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (!k.o(str2) && !(mkdirs = new File(str2).mkdirs())) {
            com.sankuai.xm.recorder.b.c("VideoAgent::init mkdirs: %s", Boolean.valueOf(mkdirs));
        }
        if (k.d(str2)) {
            this.d = str2;
            if (!this.d.endsWith(k.d)) {
                this.d += k.d;
            }
            return true;
        }
        return false;
    }

    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c3b03ac227055fafa297762fd21da6", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c3b03ac227055fafa297762fd21da6")).booleanValue() : a(null, str);
    }
}
