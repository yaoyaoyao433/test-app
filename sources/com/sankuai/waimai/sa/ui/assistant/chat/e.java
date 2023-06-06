package com.sankuai.waimai.sa.ui.assistant.chat;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.f;
import com.sankuai.waimai.sa.ui.assistant.view.HorizontalItemView;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements g {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.sa.model.b b;
    private Context c;
    private HorizontalItemView d;
    private final com.sankuai.waimai.sa.ui.assistant.a e;
    private m f;

    public static /* synthetic */ void a(e eVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "ed0a9dce918e68c2dd69e62e7a6492b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "ed0a9dce918e68c2dd69e62e7a6492b5");
        } else if (eVar.b.a != 2 || com.sankuai.waimai.foundation.utils.d.a(eVar.b.i) || i >= eVar.b.i.size() || i < 0 || eVar.b.i.get(i) == null || eVar.b.i.get(i).k) {
        } else {
            JsonArray jsonArray = new JsonArray();
            if (!com.sankuai.waimai.foundation.utils.d.a(eVar.b.i.get(i).j)) {
                Iterator<com.sankuai.waimai.sa.model.inner.d> it = eVar.b.i.get(i).j.iterator();
                while (it.hasNext()) {
                    com.sankuai.waimai.sa.model.inner.d next = it.next();
                    if (next != null) {
                        jsonArray.add(String.valueOf(next.a));
                    }
                }
            }
            JudasManualManager.b("b_n5bu0t45").a("result_id", eVar.b.c).a("poi_id", eVar.b.i.get(i).a).a("spu_id", jsonArray.toString()).a("index", i).a("c_6tg6wz4r").a();
            eVar.b.i.get(i).k = true;
        }
    }

    public e(Context context, com.sankuai.waimai.sa.ui.assistant.a aVar, m mVar) {
        Object[] objArr = {context, aVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b85919c16d20ec61e3289b09e7d3340", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b85919c16d20ec61e3289b09e7d3340");
            return;
        }
        this.c = context;
        this.e = aVar;
        this.f = mVar;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a(int i, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f423766096e55ef46e36cdccd98d40", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f423766096e55ef46e36cdccd98d40");
        }
        if (this.d == null) {
            this.d = (HorizontalItemView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_chat_horizonal_content_layout, viewGroup, false);
            HorizontalItemView horizontalItemView = this.d;
            int a2 = com.sankuai.waimai.foundation.utils.g.a(viewGroup.getContext(), 5.0f);
            int a3 = com.sankuai.waimai.foundation.utils.g.a(viewGroup.getContext(), 15.0f);
            Object[] objArr2 = {Integer.valueOf(a2), Integer.valueOf(a3)};
            ChangeQuickRedirect changeQuickRedirect2 = HorizontalItemView.a;
            if (PatchProxy.isSupport(objArr2, horizontalItemView, changeQuickRedirect2, false, "df0d60266b058a4200e2d19be813e44c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, horizontalItemView, changeQuickRedirect2, false, "df0d60266b058a4200e2d19be813e44c");
            } else if (a2 > 0 || a3 > 0) {
                com.sankuai.waimai.sa.ui.assistant.view.a aVar = new com.sankuai.waimai.sa.ui.assistant.view.a(horizontalItemView.getContext(), 0, a2, true);
                aVar.b = a3;
                aVar.c = a3;
                horizontalItemView.addItemDecoration(aVar);
            }
            this.d.setAdapter(new com.sankuai.waimai.sa.ui.assistant.adapter.f(this.e, this.f));
            this.d.a();
            this.d.setOnLogReportListener(new f.b() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.log.judas.f.b
                public final void b(int i2) {
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
                @Override // com.sankuai.waimai.log.judas.f.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(int r14) {
                    /*
                        Method dump skipped, instructions count: 582
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.sa.ui.assistant.chat.e.AnonymousClass1.a(int):void");
                }
            });
        }
        return this.d;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a() {
        return this.d;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final void a(com.sankuai.waimai.sa.model.b bVar) {
        com.sankuai.waimai.sa.ui.assistant.adapter.f fVar;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b91d5dc9da9a5e7005dd3c9952071b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b91d5dc9da9a5e7005dd3c9952071b7");
            return;
        }
        this.b = bVar;
        HorizontalItemView horizontalItemView = this.d;
        com.sankuai.waimai.sa.model.b bVar2 = this.b;
        com.sankuai.waimai.sa.ui.assistant.a aVar = this.e;
        m mVar = this.f;
        Object[] objArr2 = {bVar2, aVar, mVar};
        ChangeQuickRedirect changeQuickRedirect2 = HorizontalItemView.a;
        if (PatchProxy.isSupport(objArr2, horizontalItemView, changeQuickRedirect2, false, "073d5c3c253275dad15c08514490989b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, horizontalItemView, changeQuickRedirect2, false, "073d5c3c253275dad15c08514490989b");
            return;
        }
        horizontalItemView.e = bVar2;
        RecyclerView.a adapter = horizontalItemView.getAdapter();
        if (adapter != null && (adapter instanceof com.sankuai.waimai.sa.ui.assistant.adapter.f)) {
            fVar = (com.sankuai.waimai.sa.ui.assistant.adapter.f) adapter;
        } else {
            com.sankuai.waimai.sa.ui.assistant.adapter.f fVar2 = new com.sankuai.waimai.sa.ui.assistant.adapter.f(aVar, mVar);
            horizontalItemView.setAdapter(adapter);
            fVar = fVar2;
        }
        com.sankuai.waimai.sa.model.b bVar3 = horizontalItemView.e;
        Object[] objArr3 = {bVar3};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.sa.ui.assistant.adapter.f.a;
        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "0f35b139a033cef4663bc7e3bf4b2e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "0f35b139a033cef4663bc7e3bf4b2e76");
        } else {
            fVar.b = bVar3;
            fVar.notifyDataSetChanged();
        }
        horizontalItemView.scrollToPosition(0);
    }
}
