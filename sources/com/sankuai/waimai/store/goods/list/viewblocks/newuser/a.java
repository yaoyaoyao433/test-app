package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.poilist.mach.a b;
    com.sankuai.waimai.mach.recycler.c c;
    private ViewGroup d;
    private ViewGroup e;
    private LinearLayout f;
    private View g;
    private com.sankuai.waimai.mach.recycler.c h;

    public static /* synthetic */ void a(a aVar, com.sankuai.waimai.mach.node.a aVar2) {
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "89dd20e1f63d33d808fc3cd643b0a4a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "89dd20e1f63d33d808fc3cd643b0a4a7");
        } else if (aVar2.f != null) {
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = aVar2.f.searchNodeWithViewReport();
            if (CollectionUtils.isEmpty(searchNodeWithViewReport)) {
                return;
            }
            for (final com.sankuai.waimai.mach.node.a aVar3 : searchNodeWithViewReport) {
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "eebc2bb3c93b38cc1e700eac7ad6a3b7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "eebc2bb3c93b38cc1e700eac7ad6a3b7");
                } else if (aVar3 != null) {
                    Object[] objArr3 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "f4ee920382946419ec797a33acf4c5b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "f4ee920382946419ec797a33acf4c5b6");
                    } else if (aVar3 != null && aVar3.g() != null) {
                        String str = null;
                        if (aVar3.h() != null && aVar3.h().containsKey("expose-key")) {
                            str = String.valueOf(aVar3.h().get("expose-key"));
                        }
                        if (t.a(str)) {
                            str = String.valueOf(System.identityHashCode(aVar3));
                        }
                        com.sankuai.waimai.store.expose.v2.entity.a aVar4 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar3.g(), str);
                        aVar4.a(new c.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.a.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                            public final void a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2167f50e521b52a13cebcda15abb4e24", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2167f50e521b52a13cebcda15abb4e24");
                                } else {
                                    aVar3.f.triggerViewReport(aVar3);
                                }
                            }
                        });
                        com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) aVar.mContext, aVar4);
                    }
                }
            }
        }
    }

    public a(@NonNull Context context, com.sankuai.waimai.store.poilist.mach.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afdf581dc630d25fccd88c7237c71476", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afdf581dc630d25fccd88c7237c71476");
        } else {
            this.b = aVar;
        }
    }

    public final void a(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceae81b367d22f0dfe34d52e63c0e511", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceae81b367d22f0dfe34d52e63c0e511");
        } else if (bVar == null || bVar.t == null || bVar.s == null) {
        } else {
            u.c(this.f);
            BaseModuleDesc.a aVar = bVar.t.layoutInfo;
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (aVar != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = com.sankuai.shangou.stone.util.h.a(this.mContext, aVar.a);
                    marginLayoutParams.bottomMargin = com.sankuai.shangou.stone.util.h.a(this.mContext, aVar.b);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams2.topMargin = 0;
                    marginLayoutParams2.bottomMargin = 0;
                }
            }
            this.h = bVar.s.b;
            if (this.h != null && this.b != null) {
                u.a(this.d);
                final com.sankuai.waimai.mach.node.a b = this.h.b();
                b.a("mach_extra_key_position", Integer.valueOf(i));
                com.sankuai.waimai.mach.recycler.b b2 = this.b.b();
                b2.a(this.h);
                b2.a(this.d, this.h, b2.a(this.h.a()));
                this.c = this.h;
                this.d.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "817e646abd0bfb5648a7a57093aa705a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "817e646abd0bfb5648a7a57093aa705a");
                        } else {
                            a.a(a.this, b);
                        }
                    }
                }, 0L);
                com.sankuai.waimai.store.goods.list.utils.e.a(this.g, this.mContext, bVar.l);
                return;
            }
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cb38d6955739ef5468a54b48059ac86", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cb38d6955739ef5468a54b48059ac86");
            } else if (this.d != null) {
                if (bVar != null && bVar.q == 8) {
                    u.a(this.f);
                }
                u.c(this.d);
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83e3ff823d342dca929f2619c5d801b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83e3ff823d342dca929f2619c5d801b9");
        }
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.wm_sc_new_user_land_mach_item, viewGroup, false);
        this.d = (ViewGroup) inflate.findViewById(R.id.common_mach_container);
        this.e = (ViewGroup) inflate.findViewById(R.id.mach_container_wrapper);
        this.f = (LinearLayout) inflate.findViewById(R.id.ll_error);
        this.mView = inflate;
        this.g = inflate.findViewById(R.id.item_bg);
        return inflate;
    }
}
