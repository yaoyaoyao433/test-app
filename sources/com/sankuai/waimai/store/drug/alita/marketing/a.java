package com.sankuai.waimai.store.drug.alita.marketing;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.container.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.drug.goods.list.DrugPoiActivity;
import com.sankuai.waimai.store.drug.home.DrugHomeActivity;
import com.sankuai.waimai.store.manager.sequence.c;
import com.sankuai.waimai.store.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.manager.marketing.d {
    public static ChangeQuickRedirect a;
    Activity b;
    String c;
    final c d;
    com.sankuai.waimai.store.manager.sequence.c e;
    com.sankuai.waimai.store.manager.sequence.b f;
    View g;
    com.sankuai.waimai.store.manager.marketing.action.b h;
    long i;
    boolean j;
    String k;
    private com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c l;
    private final Map<String, com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c> m;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.alita.marketing.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1145a {
        void a(Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map);
    }

    public a(Activity activity, View view) {
        Object[] objArr = {activity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7512f93343340eaa19a9f5538943da5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7512f93343340eaa19a9f5538943da5");
            return;
        }
        this.m = new HashMap();
        this.j = false;
        this.g = view;
        this.b = activity;
        this.d = new c();
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5aee92971e0724fa2788459bce2cf378", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5aee92971e0724fa2788459bce2cf378")).booleanValue();
        }
        if (com.sankuai.waimai.store.util.b.a(activity)) {
            return false;
        }
        if ((activity instanceof DrugPoiActivity) || (activity instanceof DrugHomeActivity) || (activity instanceof GlobalSearchActivity) || (activity instanceof BaseMemberActivity)) {
            return true;
        }
        if (activity instanceof MRNBaseActivity) {
            MRNBaseActivity mRNBaseActivity = (MRNBaseActivity) activity;
            g k = mRNBaseActivity.k();
            if (k != null && k.p() != null) {
                com.meituan.android.mrn.router.d p = k.p();
                String str = p.b() + CommonConstant.Symbol.UNDERLINE + p.c();
                List list = (List) com.sankuai.waimai.store.config.d.h().a("marketing/mrn_page_white_list_android", new TypeToken<ArrayList<String>>() { // from class: com.sankuai.waimai.store.drug.alita.marketing.a.1
                }.getType());
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list) && list.contains(str)) {
                    return list.contains(str);
                }
            }
            return !TextUtils.isEmpty(com.sankuai.waimai.store.mrn.shopcartbridge.b.a().a(mRNBaseActivity.l().l));
        }
        List list2 = (List) com.sankuai.waimai.store.config.d.h().a("marketing/android_page_white_list_android", new TypeToken<ArrayList<String>>() { // from class: com.sankuai.waimai.store.drug.alita.marketing.a.2
        }.getType());
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list2)) {
            return list2.contains(activity.getClass().getName());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.sankuai.waimai.store.manager.sequence.c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3b6bb34437ed43a3d00155a5e887676", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.manager.sequence.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3b6bb34437ed43a3d00155a5e887676");
        }
        if (this.e == null) {
            this.e = new com.sankuai.waimai.store.manager.sequence.c(false);
            this.e.e = new c.a() { // from class: com.sankuai.waimai.store.drug.alita.marketing.a.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.manager.sequence.c.a
                public final boolean b() {
                    return false;
                }

                @Override // com.sankuai.waimai.store.manager.sequence.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b56cf760c0fcd23f3d6780eabe3a663", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b56cf760c0fcd23f3d6780eabe3a663");
                        return;
                    }
                    if (!a.this.j) {
                        a.this.j = true;
                        a aVar = a.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "18eee0e3d79459faf69413a51a11d9e4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "18eee0e3d79459faf69413a51a11d9e4");
                        } else {
                            aVar.i = System.currentTimeMillis();
                        }
                    }
                    a.this.b().b(true);
                }
            };
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.sankuai.waimai.store.manager.sequence.b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27cfb69d4c7ced0628a1e2d699e8b001", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.manager.sequence.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27cfb69d4c7ced0628a1e2d699e8b001");
        }
        if (this.f == null) {
            this.f = new com.sankuai.waimai.store.manager.sequence.b(false);
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.sankuai.waimai.store.manager.sequence.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ad65b5a805b8713900b88bdb1ff452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ad65b5a805b8713900b88bdb1ff452");
        } else if (cVar != null) {
            cVar.f();
        }
    }

    @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, @NonNull Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efe2ae2a876c5a4ad9534832d410d463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efe2ae2a876c5a4ad9534832d410d463");
            return;
        }
        com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c cVar = this.m.get(str);
        if (cVar != null) {
            cVar.a(aVar, str, map);
        } else if (this.l != null) {
            this.l.a(aVar, str, map);
        }
    }

    @Override // com.sankuai.waimai.store.manager.marketing.d
    public final long c() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.manager.marketing.d
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798ea2bc9a4702b5aac1b40605a60454", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798ea2bc9a4702b5aac1b40605a60454") : TextUtils.isEmpty(this.k) ? com.sankuai.waimai.store.manager.judas.b.b(this.b) : this.k;
    }

    @Override // com.sankuai.waimai.store.manager.marketing.action.b
    public final void a(final String str, final com.sankuai.waimai.store.manager.marketing.action.d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cce3c0f04be401f99926a0bcc5fa0c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cce3c0f04be401f99926a0bcc5fa0c6");
        } else if (this.h == null) {
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.alita.marketing.a.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad0929eb414d5173ec060ace5ae8dd6d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad0929eb414d5173ec060ace5ae8dd6d");
                    } else if (a.this.h == null) {
                    } else {
                        a.this.h.a(str, dVar);
                    }
                }
            }, this.c);
        }
    }
}
