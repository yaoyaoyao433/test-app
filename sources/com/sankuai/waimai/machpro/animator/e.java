package com.sankuai.waimai.machpro.animator;

import android.animation.Animator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends d {
    public static ChangeQuickRedirect k;

    public e(com.facebook.yoga.d dVar, Map<String, Object> map, Map<String, Object> map2) {
        super(dVar, map);
        Object[] objArr = {dVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "629216aea9948092e4825034c1f9962d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "629216aea9948092e4825034c1f9962d");
            return;
        }
        String str = "@keyframes " + map.get("animation-name");
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            if (obj instanceof Map) {
                b(null);
                ArrayList<Animator> a = a((Map) obj);
                if (a.size() <= 0 || this.h == null) {
                    return;
                }
                this.h.playTogether(a);
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9acca01058c4a06b14d6121ef29442e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9acca01058c4a06b14d6121ef29442e");
        } else {
            super.b();
        }
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void a(Animator.AnimatorListener animatorListener) {
        Object[] objArr = {animatorListener};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83eba1b4515435220422ebf5b46b8b43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83eba1b4515435220422ebf5b46b8b43");
        } else {
            super.a(animatorListener);
        }
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4649b0ea216103588bf79dc19c110410", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4649b0ea216103588bf79dc19c110410");
        } else {
            super.c();
        }
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1ff435762ea12e56466fc22507b0377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1ff435762ea12e56466fc22507b0377");
        } else {
            super.cancel();
        }
    }
}
