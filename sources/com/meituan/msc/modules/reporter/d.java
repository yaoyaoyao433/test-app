package com.meituan.msc.modules.reporter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public Stack<l> b;
    public List<String> c;
    private LinkedList<String> d;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24a3ad89842535f42d78150b3588eb59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24a3ad89842535f42d78150b3588eb59");
            return;
        }
        this.b = new Stack<>();
        this.d = new LinkedList<>();
        this.c = new CopyOnWriteArrayList();
    }

    public final d a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca9b445c3f38edab65ff012672f72b6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca9b445c3f38edab65ff012672f72b6d");
        }
        if (this.b.size() >= 20) {
            this.b.remove(0);
        }
        this.b.push(new l(str2, str));
        if (this.d.size() >= 10) {
            this.d.remove(0);
            g.d("JSErrorRecorder", "pushPage remove first");
        }
        LinkedList<String> linkedList = this.d;
        linkedList.add("push id=" + str2 + ",path=" + str + "\\n");
        StringBuilder sb = new StringBuilder("push id=");
        sb.append(str2);
        sb.append(",path=");
        sb.append(str);
        g.d("JSErrorRecorder", "pushPage", sb.toString());
        return this;
    }

    public final d b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d56557f218d5833b4ed7bd389686ca41", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d56557f218d5833b4ed7bd389686ca41");
        }
        a(this.b.search(new l(str2, str)));
        return this;
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975c09c2be94b2e49afb5c222bf8a9a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975c09c2be94b2e49afb5c222bf8a9a9");
            return;
        }
        for (int i2 = 1; i2 <= i; i2++) {
            l pop = this.b.pop();
            if (this.d.size() >= 10) {
                g.d("JSErrorRecorder", "pushPage remove first");
                this.d.remove(0);
            }
            LinkedList<String> linkedList = this.d;
            linkedList.add("pop id=" + pop.c + ",path=" + pop.b + "\\n");
            StringBuilder sb = new StringBuilder("pop id=");
            sb.append(pop.c);
            sb.append(",path=");
            sb.append(pop.b);
            g.d("JSErrorRecorder", "popPages", sb.toString());
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f267f9f65259348e94ede3b331d5a9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f267f9f65259348e94ede3b331d5a9d");
        }
        StringBuilder sb = new StringBuilder();
        for (int size = this.b.size() - 1; size >= 0; size--) {
            l elementAt = this.b.elementAt(size);
            if (elementAt != null) {
                sb.append(a(elementAt.toString()));
            }
        }
        return sb.toString();
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ed09b6dda095912b0a100122304e055", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ed09b6dda095912b0a100122304e055");
        }
        StringBuilder sb = new StringBuilder();
        try {
            for (int size = this.d.size() - 1; size >= 0; size--) {
                sb.append(a(this.d.get(size)));
            }
            return sb.toString();
        } catch (NullPointerException e) {
            g.b("JSErrorRecorder", e, "getPageNavigationHistory");
            return "unknow";
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c0f492f0ac1852e42a46d4b2ea58241", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c0f492f0ac1852e42a46d4b2ea58241") : TextUtils.isEmpty(str) ? "" : str.length() > 128 ? str.substring(0, 128) : str;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d1bc72a51d731bc9539f747556fe1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d1bc72a51d731bc9539f747556fe1e");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.c) {
            if (str != null) {
                sb.append(a(str) + "\\n");
            }
        }
        return sb.toString();
    }
}
