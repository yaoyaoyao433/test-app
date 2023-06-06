package com.meituan.msc.extern;

import android.content.Intent;
import com.meituan.msc.common.lib.b;
import com.meituan.msc.common.process.ipc.IPCInvoke;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class i extends b.a {
    public static ChangeQuickRedirect b;
    private static volatile i c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str, Intent intent);
    }

    public static i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d0c8560974d147951f898bc91896ff5", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d0c8560974d147951f898bc91896ff5");
        }
        if (c == null) {
            synchronized (i.class) {
                if (c == null) {
                    c = new i();
                }
            }
        }
        return c;
    }

    @Override // com.meituan.msc.common.lib.b.a
    public final void a(String str, Intent intent) {
        Object[] objArr = {str, intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3356639c5e344abe35aef852e4fe7f79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3356639c5e344abe35aef852e4fe7f79");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("MSCLifecycleCallback", com.meituan.msc.common.process.a.d(), "onMPBackPressedByUser", str);
        if (!com.meituan.msc.common.process.a.f()) {
            ((a) IPCInvoke.a(b.class, com.meituan.msc.common.process.a.MAIN)).a(str, intent);
        } else {
            super.a(str, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.msc.extern.i.a
        public final void a(String str, Intent intent) {
            Object[] objArr = {str, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a5d8c87f376dff1d301e631a865ff0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a5d8c87f376dff1d301e631a865ff0");
            } else {
                i.a().a(str, intent);
            }
        }
    }
}
