package com.sankuai.waimai.machpro.animator;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends d {
    public static ChangeQuickRedirect k;

    public f(com.facebook.yoga.d dVar, Map<String, Object> map, Map<String, Object> map2) {
        super(dVar, map);
        Object[] objArr = {dVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb7cd0260449b2a24d4e53942ddeca1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb7cd0260449b2a24d4e53942ddeca1f");
            return;
        }
        b(null);
        ArrayList<Animator> a = a(map2);
        if (a == null || a.size() <= 0) {
            return;
        }
        this.h.playTogether(a);
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void a(com.facebook.yoga.d dVar, Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {dVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2977ef92840ccf29ac28840380e817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2977ef92840ccf29ac28840380e817");
            return;
        }
        super.a(dVar, map, map2);
        cancel();
        this.h = new AnimatorSet();
        a(this.h, map);
        b(null);
        ArrayList<Animator> a = a(map2);
        if (a.size() > 0) {
            this.h.playTogether(a);
        }
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969b4ae13348c011213d59c809fa0992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969b4ae13348c011213d59c809fa0992");
        } else {
            super.b();
        }
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void a(Animator.AnimatorListener animatorListener) {
        Object[] objArr = {animatorListener};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad98cbfa54031722667ac8f7dbec80a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad98cbfa54031722667ac8f7dbec80a");
        } else {
            super.a(animatorListener);
        }
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7af6894d09024e1761e46cb1dba98e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7af6894d09024e1761e46cb1dba98e7");
        } else {
            super.c();
        }
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af5349d43543fd00652c97b044a3878a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af5349d43543fd00652c97b044a3878a");
        } else {
            super.cancel();
        }
    }
}
