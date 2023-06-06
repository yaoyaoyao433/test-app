package com.meituan.msc.modules.core;

import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.page.e;
import com.meituan.msc.modules.page.o;
import com.meituan.msc.modules.viewmanager.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ModuleName(name = "InteractionMonitor")
/* loaded from: classes3.dex */
public class d extends k {
    public static ChangeQuickRedirect a;

    @MSCMethod(isSync = true)
    public boolean ackTouchEvent(String str, int i, boolean z, String str2) {
        com.meituan.msc.uimanager.interaction.a aVar;
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca305077b883f62f5659b3e8fdb6837d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca305077b883f62f5659b3e8fdb6837d")).booleanValue();
        }
        e g = g(i);
        if (g instanceof o) {
            k f = ((o) g).f(UIManagerModule.NAME);
            if ((f instanceof h) && (aVar = ((h) f).c.c) != null && aVar.e) {
                aVar.a(2, z, str2);
                return true;
            }
            return false;
        }
        return false;
    }
}
