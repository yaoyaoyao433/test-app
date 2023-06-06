package com.meituan.mmp.main;

import android.content.Intent;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class y extends g {
    public static ChangeQuickRedirect a;
    private static y b;
    private static final List<g> c = new CopyOnWriteArrayList();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str, Intent intent);
    }

    public static y a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee341eac555927c1e0a0e1c26f174f5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (y) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee341eac555927c1e0a0e1c26f174f5d");
        }
        if (b == null) {
            synchronized (y.class) {
                if (b == null) {
                    b = new y();
                }
            }
        }
        return b;
    }

    @Override // com.meituan.mmp.main.g
    public final void a(String str, Intent intent) {
        Object[] objArr = {str, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a58b834824bd6fa4f26168f7b529203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a58b834824bd6fa4f26168f7b529203");
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            ((a) IPCInvoke.a(b.class, com.meituan.mmp.lib.mp.a.MAIN)).a(str, intent);
        } else {
            for (g gVar : c) {
                if (gVar != null) {
                    gVar.a(str, intent);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.main.y.a
        public final void a(String str, Intent intent) {
            Object[] objArr = {str, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e50af08a6e7eda799653b9572127e833", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e50af08a6e7eda799653b9572127e833");
            } else {
                y.a().a(str, intent);
            }
        }
    }
}
