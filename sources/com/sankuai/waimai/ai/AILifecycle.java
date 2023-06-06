package com.sankuai.waimai.ai;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.b;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.foundation.core.lifecycle.a;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AILifecycle extends Lifecycle implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToForeground(Activity activity) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "AILifecycle";
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80e8a68bbf23ef4a393feebcd02ff87e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80e8a68bbf23ef4a393feebcd02ff87e");
            return;
        }
        b a = b.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "54771a577d44d066f0cf8bae93a6bdb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "54771a577d44d066f0cf8bae93a6bdb4");
            return;
        }
        try {
            com.sankuai.waimai.ai.base.b bVar = a.b;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.ai.base.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "5b7fe2a0783970f17156c22d852efb0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "5b7fe2a0783970f17156c22d852efb0f");
                return;
            }
            Iterator<com.sankuai.waimai.alita.a> a2 = bVar.b.a();
            while (a2.hasNext()) {
                com.sankuai.waimai.alita.a next = a2.next();
                if (next != null) {
                    next.d();
                }
            }
        } catch (Exception unused) {
        }
    }
}
