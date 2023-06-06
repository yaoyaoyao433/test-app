package com.meituan.mmp.lib.resume;

import com.meituan.mmp.lib.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final c c = new c();
    protected HashMap<String, Stack<a>> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5371bddd6454c89ab59b99984990b7fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5371bddd6454c89ab59b99984990b7fb");
        } else {
            this.b = new HashMap<>();
        }
    }

    public static c a() {
        return c;
    }

    public final void a(d dVar, ab abVar, String str) {
        Stack<a> stack;
        Object[] objArr = {dVar, abVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b191bb02ffa5b9c63aaccc18dc94d790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b191bb02ffa5b9c63aaccc18dc94d790");
            return;
        }
        Stack<a> h = abVar.h();
        if (dVar != null) {
            Object[] objArr2 = {h};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "61364fda4d5b0aea2602fcc7c3b2d559", RobustBitConfig.DEFAULT_VALUE)) {
                stack = (Stack) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "61364fda4d5b0aea2602fcc7c3b2d559");
            } else if (dVar.b != null && !dVar.b.empty()) {
                if (h == null || h.empty()) {
                    stack = dVar.b;
                } else {
                    dVar.b.addAll(h);
                    stack = dVar.b;
                }
            }
            h = stack;
        }
        c.b.put(str, h);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c21237f1e7169780ae2ffb321546b2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c21237f1e7169780ae2ffb321546b2d");
        } else {
            c.b.remove(str);
        }
    }
}
