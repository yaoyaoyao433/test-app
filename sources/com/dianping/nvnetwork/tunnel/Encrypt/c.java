package com.dianping.nvnetwork.tunnel.Encrypt;

import android.text.TextUtils;
import com.dianping.nvnetwork.tunnel.tool.SecureTools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    boolean b;
    private String[] c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811f46b1fda7722a700372b952b50c20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811f46b1fda7722a700372b952b50c20");
        } else {
            this.b = false;
        }
    }

    public final synchronized String[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53cb4249e79ff19232017edfd4ce484", 6917529027641081856L)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53cb4249e79ff19232017edfd4ce484");
        } else if (b()) {
            return this.c;
        } else {
            try {
                this.c = SecureTools.getRSAKeys();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b2abbeabc1ba8f47596c24c8470916f", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b2abbeabc1ba8f47596c24c8470916f")).booleanValue() : (this.c == null || this.c.length != 2 || TextUtils.isEmpty(this.c[0]) || TextUtils.isEmpty(this.c[1])) ? false : true;
    }
}
