package com.sankuai.waimai.alita.bundle.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a extends RuntimeException {
    public static ChangeQuickRedirect c;
    public int d;

    public abstract String a(int i);

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8077d1f9df4f93848c928d16d1e076cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8077d1f9df4f93848c928d16d1e076cb");
        } else {
            this.d = i;
        }
    }

    public a(Throwable th, int i) {
        super(th);
        Object[] objArr = {th, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d6ce3e2d47cc48ad900015f78a1ecd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d6ce3e2d47cc48ad900015f78a1ecd");
        } else {
            this.d = i;
        }
    }
}
