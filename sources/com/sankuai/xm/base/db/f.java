package com.sankuai.xm.base.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.sql.SQLException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f extends RuntimeException {
    public static ChangeQuickRedirect a;
    private int b;
    private String c;

    public f(Exception exc) {
        super(exc);
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cacaee7f4ffc7a1fb8ebfc9cb1c7c64b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cacaee7f4ffc7a1fb8ebfc9cb1c7c64b");
        } else if (exc instanceof SQLException) {
            this.b = 10;
        } else {
            this.b = -1;
        }
    }

    public f(int i, String str) {
        super(str);
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f61b011d5dbac8d8fc006becbc6aa3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f61b011d5dbac8d8fc006becbc6aa3");
            return;
        }
        this.b = i;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Throwable
    /* renamed from: a */
    public Exception getCause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78292f292bc6cca16c6bd622cd823952", 6917529027641081856L) ? (Exception) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78292f292bc6cca16c6bd622cd823952") : (Exception) super.getCause();
    }

    @Override // java.lang.Throwable
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80175ca9e714198cb10fae9463112999", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80175ca9e714198cb10fae9463112999");
        }
        if (getCause() != null) {
            return "DBException, err code = " + this.b + ", error msg:" + getCause().toString();
        }
        return "DBException, err code = " + this.b + ", error msg:" + this.c;
    }
}
