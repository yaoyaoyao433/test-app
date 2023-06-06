package com.sankuai.waimai.store.poi.subscribe;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.y;
import com.sankuai.waimai.store.poi.subscribe.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends a.c {
    public static ChangeQuickRedirect d;
    @NonNull
    private Activity a;
    private long b;
    private String h;
    private int i;
    private Dialog j;
    private String k;

    public c(@NonNull Activity activity, long j, String str, int i, String str2) {
        super(j, str);
        Object[] objArr = {activity, new Long(j), str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28c382298bbc1958a5b0b9daa2b8c22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28c382298bbc1958a5b0b9daa2b8c22");
            return;
        }
        this.j = null;
        this.a = activity;
        this.b = j;
        this.h = str;
        this.i = i;
        this.k = str2;
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.a.c
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f094c67850e01fa9067dfb41982c3aa8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f094c67850e01fa9067dfb41982c3aa8")).booleanValue() : com.sankuai.waimai.store.util.b.a(this.a);
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.a.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2364458dd1726c168925649544229d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2364458dd1726c168925649544229d47");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.k).a(this.b, this.i, this);
        }
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.a.c
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "938eb291ddb95f534957f25b17dc5bd7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "938eb291ddb95f534957f25b17dc5bd7") : this.a.getString(R.string.wm_sg_poi_subscribe_error);
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.a.c
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05de99f9fc7129c9c0431f3ee48fa2c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05de99f9fc7129c9c0431f3ee48fa2c4");
            return;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.j);
        this.j = com.sankuai.waimai.foundation.core.utils.d.a(this.a);
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.a.c
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "426c52b4d3f182c962322799c079164a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "426c52b4d3f182c962322799c079164a");
            return;
        }
        com.sankuai.waimai.foundation.core.utils.d.a(this.j);
        this.j = null;
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.a.c
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5309b4812dc98beeaec9d3ddd7d754d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5309b4812dc98beeaec9d3ddd7d754d3");
            return;
        }
        Activity activity = this.a;
        Object[] objArr2 = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = y.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "788b4b84dcf410e723ce807120e80843", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "788b4b84dcf410e723ce807120e80843");
        } else {
            y.a((Context) activity, str, true, false);
        }
    }
}
