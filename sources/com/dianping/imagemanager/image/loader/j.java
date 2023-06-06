package com.dianping.imagemanager.image.loader;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j extends a<com.dianping.imagemanager.utils.downloadphoto.h> {
    public static ChangeQuickRedirect c;
    boolean d;
    public boolean e;
    public com.dianping.imagemanager.utils.downloadphoto.httpservice.h<com.dianping.imagemanager.utils.downloadphoto.httpservice.i, com.dianping.imagemanager.utils.downloadphoto.httpservice.j> f;
    public Object g;
    public long h;
    public boolean i;
    private String j;
    private Stack<String> k;
    private com.dianping.imagemanager.utils.downloadphoto.httpservice.a l;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b30f513f1544a684cc11381792c41715", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b30f513f1544a684cc11381792c41715");
            return;
        }
        this.d = false;
        this.i = false;
    }

    @Override // com.dianping.imagemanager.image.loader.a
    public final synchronized boolean a(l<com.dianping.imagemanager.utils.downloadphoto.h> lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcf812e27091c9467ed5c2bc218b159f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcf812e27091c9467ed5c2bc218b159f")).booleanValue();
        } else if (super.a(lVar)) {
            com.dianping.imagemanager.utils.downloadphoto.h hVar = lVar.a;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.imagemanager.utils.downloadphoto.a.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "f6661da6a1fb58f175d866b029bd7f4c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "f6661da6a1fb58f175d866b029bd7f4c")).booleanValue() : hVar.d(128)) {
                this.d = true;
            }
            if (lVar.a.r()) {
                this.i = true;
            }
            return true;
        } else {
            return false;
        }
    }

    public final com.dianping.imagemanager.utils.downloadphoto.httpservice.a r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46020b46a5b4a940d63b3ca38450e8cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.imagemanager.utils.downloadphoto.httpservice.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46020b46a5b4a940d63b3ca38450e8cf");
        }
        if (this.l == null) {
            a(m());
        }
        return this.l;
    }

    public final String s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf4590a502050028aa4e3ab500215ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf4590a502050028aa4e3ab500215ab");
        }
        if (this.j == null) {
            a(m());
        }
        return this.j;
    }

    public final void a(com.dianping.imagemanager.utils.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e801e3907eac56c977e9c70f39209f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e801e3907eac56c977e9c70f39209f");
            return;
        }
        String a = com.dianping.imagemanager.utils.downloadphoto.urlcompleter.b.a(jVar, h(), i());
        if (!TextUtils.isEmpty(a) && !a.equals(jVar.b)) {
            if (this.k == null) {
                this.k = new Stack<>();
            }
            this.k.push(jVar.b);
        }
        a(a);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ee0857f4db12d0ed9f4e743d39c2ccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ee0857f4db12d0ed9f4e743d39c2ccc");
            return;
        }
        this.j = str;
        this.l = new com.dianping.imagemanager.utils.downloadphoto.httpservice.a(this.j, "GET", null, null, 10000L);
    }

    public final String t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fd9f3a932b12fc6ee835c70a8b52567", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fd9f3a932b12fc6ee835c70a8b52567");
        }
        if (this.k == null || this.k.size() <= 0) {
            return null;
        }
        return this.k.pop();
    }
}
