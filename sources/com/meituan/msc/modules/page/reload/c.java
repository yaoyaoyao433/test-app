package com.meituan.msc.modules.page.reload;

import android.text.TextUtils;
import android.util.Pair;
import com.meituan.msc.common.utils.ad;
import com.meituan.msc.modules.page.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final c c = new c();
    protected final ad<String, Pair<String, Stack<a>>> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36034d5a8be80e4961c0180a63ecb08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36034d5a8be80e4961c0180a63ecb08");
        } else {
            this.b = new ad<>();
        }
    }

    public static c a() {
        return c;
    }

    public final void a(d dVar, String str, m mVar, String str2) {
        Stack<a> stack;
        Object[] objArr = {dVar, str, mVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb54d7f37892f5b82d8b7b643606fe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb54d7f37892f5b82d8b7b643606fe6");
        } else if (mVar == null || str2 == null) {
        } else {
            Stack<a> l = mVar.l();
            if (dVar != null) {
                Object[] objArr2 = {l};
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "41a233af42f75a6a3e1ba0052556a69d", RobustBitConfig.DEFAULT_VALUE)) {
                    stack = (Stack) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "41a233af42f75a6a3e1ba0052556a69d");
                } else if (dVar.b != null && !dVar.b.empty()) {
                    if (l == null || l.empty()) {
                        stack = dVar.b;
                    } else {
                        dVar.b.addAll(l);
                        stack = dVar.b;
                    }
                }
                l = stack;
            }
            c.b.put(str2, new Pair<>(str, l));
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c90232d8fb6fd9f88ac055ee0b6ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c90232d8fb6fd9f88ac055ee0b6ad0");
        } else if (str != null) {
            c.b.remove(str);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb984759a70e34d052c9ec260c5edcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb984759a70e34d052c9ec260c5edcd");
            return;
        }
        Iterator<Map.Entry<String, Pair<String, Stack<a>>>> it = c.b.entrySet().iterator();
        while (it.hasNext()) {
            if (TextUtils.equals((CharSequence) it.next().getValue().first, str)) {
                it.remove();
            }
        }
    }
}
