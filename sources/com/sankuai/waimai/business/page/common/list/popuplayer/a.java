package com.sankuai.waimai.business.page.common.list.popuplayer;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.callback.a;
import com.sankuai.waimai.business.page.common.list.model.b;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    b b;
    d c;
    View d;
    View e;
    com.sankuai.waimai.business.page.common.list.model.b f;
    Config g;
    private ImageView h;

    public final void a(final View view, d dVar, Config config) {
        Object[] objArr = {view, dVar, config};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3af6572bb0a25f37bc95e44d981fb257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3af6572bb0a25f37bc95e44d981fb257");
            return;
        }
        this.g = config;
        this.b = config.g;
        this.c = dVar;
        this.e = view;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ad8bf582c1b5ac9d470ff11ea559a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ad8bf582c1b5ac9d470ff11ea559a6b");
            return;
        }
        this.h = (ImageView) view.findViewById(R.id.iv_back);
        if (this.g.e == 5 || this.g.e == 6) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        this.d = view.findViewById(R.id.ll_dislike_container);
        this.d.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_dislike);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
        Context context = view.getContext();
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        this.f = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4628775042125e8eaefae33f32bfcaf8", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.page.common.list.model.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4628775042125e8eaefae33f32bfcaf8") : (com.sankuai.waimai.business.page.common.list.model.b) com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "dislike_reason_info", (Class<Object>) com.sankuai.waimai.business.page.common.list.model.b.class);
        if (this.f == null || this.f.c == null) {
            return;
        }
        int size = this.f.c.size();
        ArrayList<b.a> arrayList = this.f.c;
        if (size > 4) {
            size = 4;
        }
        com.sankuai.waimai.business.page.common.list.callback.a aVar = new com.sankuai.waimai.business.page.common.list.callback.a(arrayList.subList(0, size));
        recyclerView.setAdapter(aVar);
        Object[] objArr4 = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "21304d5e4e3164a50002520c94af2e8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "21304d5e4e3164a50002520c94af2e8b");
            return;
        }
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr5 = {view2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "de5fccdadbe335ad4c2afa8d8b86dcd0", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "de5fccdadbe335ad4c2afa8d8b86dcd0");
                    return;
                }
                a.this.d.setVisibility(8);
                view.findViewById(R.id.ll_float_tag).setVisibility(0);
            }
        });
        aVar.c = new a.b() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.common.list.callback.a.b
            public final void a(final b.a aVar2) {
                b.a aVar3;
                Object[] objArr5 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "942e03e9532a11ebfb272e82d51c19eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "942e03e9532a11ebfb272e82d51c19eb");
                } else if (aVar2 == null) {
                } else {
                    a.this.e.setVisibility(8);
                    if (a.this.c != null) {
                        final d dVar2 = a.this.c;
                        final String str = a.this.g.l;
                        final long j = a.this.g.f;
                        final Context context2 = view.getContext();
                        final com.sankuai.waimai.business.page.common.list.model.b bVar = a.this.f;
                        final b bVar2 = a.this.b;
                        Object[] objArr6 = {str, new Long(j), aVar2, (byte) 0, context2, bVar, bVar2};
                        ChangeQuickRedirect changeQuickRedirect6 = d.a;
                        if (PatchProxy.isSupport(objArr6, dVar2, changeQuickRedirect6, false, "c7722f594ee74a28e622c610cae8d994", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, dVar2, changeQuickRedirect6, false, "c7722f594ee74a28e622c610cae8d994");
                        } else if (aVar2 != null) {
                            if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                                aVar3 = aVar2;
                                dVar2.a(str, j, aVar2, false, context2, bVar, bVar2);
                            } else {
                                Object[] objArr7 = {str, new Long(j), aVar2, context2, bVar, bVar2};
                                ChangeQuickRedirect changeQuickRedirect7 = d.a;
                                if (PatchProxy.isSupport(objArr7, dVar2, changeQuickRedirect7, false, "538c2b9c2aaad194cc63818c474135e9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, dVar2, changeQuickRedirect7, false, "538c2b9c2aaad194cc63818c474135e9");
                                    aVar3 = aVar2;
                                } else {
                                    aVar3 = aVar2;
                                    com.sankuai.waimai.platform.domain.manager.user.a.a(context2, new Runnable() { // from class: com.sankuai.waimai.business.page.common.list.popuplayer.d.4
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr8 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "91e931c4ad96739840a26e250422ea40", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "91e931c4ad96739840a26e250422ea40");
                                            } else {
                                                dVar2.a(str, j, aVar2, true, context2, bVar, bVar2);
                                            }
                                        }
                                    });
                                }
                            }
                            e.a(aVar3.b, a.this.g.h, a.this.g.k, a.this.g.e, a.this.g.m);
                        }
                    }
                    aVar3 = aVar2;
                    e.a(aVar3.b, a.this.g.h, a.this.g.k, a.this.g.e, a.this.g.m);
                }
            }
        };
    }
}
