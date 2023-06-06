package com.sankuai.waimai.machpro.animator;

import android.animation.Animator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends d {
    public static ChangeQuickRedirect k;
    public ArrayList<Animator> l;

    @Deprecated
    public i() {
    }

    public i(com.facebook.yoga.d dVar) {
        super(dVar, null);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "529e7cf9e78acaf80656fcce504847d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "529e7cf9e78acaf80656fcce504847d3");
        }
    }

    public final void a(Map<String, Object> map, Map<String, Object> map2, ArrayList<Map<String, Object>> arrayList) {
        Object[] objArr = {map, map2, arrayList};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e8b51fb34b2f0b91f331472a6c2a0c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e8b51fb34b2f0b91f331472a6c2a0c3");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (arrayList != null) {
            c.a(map, map2, arrayList, hashMap2, hashMap);
            b(hashMap2);
            this.l = a(hashMap);
        }
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b09e3092505d64a5cc7eae7d2eacb2c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b09e3092505d64a5cc7eae7d2eacb2c3");
        } else if (this.l == null || this.l.size() <= 0) {
        } else {
            Iterator<Animator> it = this.l.iterator();
            while (it.hasNext()) {
                it.next().start();
            }
        }
    }

    @Override // com.sankuai.waimai.machpro.animator.d
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b2330511aa4d6d99b3efe08d778d416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b2330511aa4d6d99b3efe08d778d416");
        } else if (this.l == null || this.l.size() <= 0) {
        } else {
            Iterator<Animator> it = this.l.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            b(null);
        }
    }
}
