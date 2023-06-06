package com.sankuai.waimai.sa.ui.assistant.chat.multiperson;

import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.f;
import com.sankuai.waimai.sa.ui.assistant.adapter.h;
import com.sankuai.waimai.sa.ui.assistant.chat.g;
import com.sankuai.waimai.sa.ui.assistant.chat.i;
import com.sankuai.waimai.sa.ui.assistant.view.multiperson.MultiPersonStatisticsItemView;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements g {
    public static ChangeQuickRedirect a;
    public RelativeLayout b;
    private FrameLayout c;
    private MultiPersonStatisticsItemView d;
    private final com.sankuai.waimai.sa.ui.assistant.a e;
    private String f;
    private i g;
    private int h;
    private com.sankuai.waimai.sa.ui.assistant.view.a i;
    private com.sankuai.waimai.sa.ui.assistant.view.a j;
    private com.sankuai.waimai.sa.model.b k;

    public c(com.sankuai.waimai.sa.ui.assistant.a aVar, i iVar, String str, int i) {
        Object[] objArr = {aVar, iVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "895ab5aa8d335c094d980b15809250d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "895ab5aa8d335c094d980b15809250d3");
            return;
        }
        this.e = aVar;
        this.g = iVar;
        this.f = str;
        this.h = i;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a(int i, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41810de98525c196bd7a09165f807add", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41810de98525c196bd7a09165f807add");
        }
        if (this.c == null || (this.k != null && this.h != this.k.b)) {
            this.c = (FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_smart_assistant_chat_multi_statistics_content_layout, viewGroup, false);
            this.d = (MultiPersonStatisticsItemView) this.c.findViewById(R.id.multi_person_horizontal_item_view);
            this.b = (RelativeLayout) this.c.findViewById(R.id.multi_person_slide_prompt);
            int a2 = com.sankuai.waimai.foundation.utils.g.a(viewGroup.getContext(), 15.0f);
            if (this.i == null) {
                this.i = new com.sankuai.waimai.sa.ui.assistant.view.a(viewGroup.getContext(), 0, com.sankuai.waimai.foundation.utils.g.a(viewGroup.getContext(), 5.0f), true);
                this.i.b = a2;
                this.i.c = a2;
            }
            if (this.j == null) {
                this.j = new com.sankuai.waimai.sa.ui.assistant.view.a(viewGroup.getContext(), 1, com.sankuai.waimai.foundation.utils.g.a(viewGroup.getContext(), 10.0f), false);
                this.j.c = 1;
            }
            if (this.h == 0) {
                this.d.setLayoutManager(new LinearLayoutManager(this.d.getContext(), 0, false));
                this.d.addItemDecoration(this.i);
            } else {
                this.d.setLayoutManager(new LinearLayoutManager(this.d.getContext(), 1, false));
                this.d.addItemDecoration(this.j);
            }
            this.d.setAdapter(new h(this.e, this.g, this.f, this.d, this.h));
        }
        return this.c;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final View a() {
        return this.c;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.chat.g
    public final void a(final com.sankuai.waimai.sa.model.b bVar) {
        h hVar;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3fe440275b8d7bb126f0d45655ac2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3fe440275b8d7bb126f0d45655ac2d");
        } else if (bVar == null) {
        } else {
            this.k = bVar;
            if (bVar.b != this.h) {
                this.d.setAdapter(new h(this.e, this.g, this.f, this.d, bVar.b));
            }
            com.sankuai.waimai.sa.ui.assistant.view.a aVar = (com.sankuai.waimai.sa.ui.assistant.view.a) this.d.getItemDecorationAt(0);
            if (bVar.b == 0) {
                this.d.setLayoutManager(new LinearLayoutManager(this.d.getContext(), 0, false));
                if (aVar != null && aVar.d == 1) {
                    this.d.removeItemDecoration(aVar);
                    this.d.addItemDecoration(this.i);
                } else if (aVar == null) {
                    this.d.addItemDecoration(this.i);
                }
            } else {
                this.d.setLayoutManager(new LinearLayoutManager(this.d.getContext(), 1, false));
                if (aVar != null && aVar.d == 0) {
                    this.d.removeItemDecoration(aVar);
                    this.d.addItemDecoration(this.j);
                } else if (aVar == null) {
                    this.d.addItemDecoration(this.j);
                }
            }
            if (bVar.b == 0) {
                this.d.a();
                this.d.setOnLogReportListener(new f.b() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.multiperson.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.log.judas.f.b
                    public final void b(int i) {
                    }

                    @Override // com.sankuai.waimai.log.judas.f.b
                    public final void a(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2890fba817ba59db65c2abb05b9580b3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2890fba817ba59db65c2abb05b9580b3");
                        } else if (bVar == null || d.a(bVar.p) || i >= bVar.p.size() || bVar.p.get(i) == null || bVar.p.get(i).A) {
                        } else {
                            bVar.p.get(i).A = true;
                            JudasManualManager.b("b_fqiog4ph").a("c_6tg6wz4r").a("result_id", bVar.c).a("package_key_sku", bVar.p.get(i).p != null ? bVar.p.get(i).p : "").a("poi_id", bVar.p.get(i).c).a("index", i).a("layout_type", bVar.b).a("package_price", String.format(Locale.US, "¥%s", com.sankuai.waimai.foundation.utils.h.a(bVar.p.get(i).j))).a();
                            if (i != 0 || d.a(bVar.p.get(0).C) || bVar.p.get(0).B) {
                                return;
                            }
                            JudasManualManager.b("b_solew3lv").a("c_6tg6wz4r").a("result_id", bVar.c).a("package_key_sku", bVar.p.get(0).p).a("poi_id", bVar.p.get(0).c).a("index", 0).a("layout_type", bVar.b).a();
                            bVar.p.get(0).B = true;
                        }
                    }
                });
            }
            MultiPersonStatisticsItemView multiPersonStatisticsItemView = this.d;
            com.sankuai.waimai.sa.ui.assistant.a aVar2 = this.e;
            i iVar = this.g;
            int i = this.h;
            Object[] objArr2 = {bVar, aVar2, iVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = MultiPersonStatisticsItemView.a;
            if (PatchProxy.isSupport(objArr2, multiPersonStatisticsItemView, changeQuickRedirect2, false, "42bf17a25aebf536f1ecf8d68eacd102", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, multiPersonStatisticsItemView, changeQuickRedirect2, false, "42bf17a25aebf536f1ecf8d68eacd102");
                return;
            }
            multiPersonStatisticsItemView.e = bVar;
            RecyclerView.a adapter = multiPersonStatisticsItemView.getAdapter();
            if (adapter != null && (adapter instanceof h)) {
                hVar = (h) adapter;
            } else {
                h hVar2 = new h(aVar2, iVar, "MultiPersonStatisticsHorizontalItemView", multiPersonStatisticsItemView, i);
                multiPersonStatisticsItemView.setAdapter(adapter);
                hVar = hVar2;
            }
            com.sankuai.waimai.sa.model.b bVar2 = multiPersonStatisticsItemView.e;
            Object[] objArr3 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "3d8b1f102f2705ec66eefed84d2db8a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "3d8b1f102f2705ec66eefed84d2db8a0");
            } else {
                hVar.b = bVar2;
                hVar.notifyDataSetChanged();
            }
            if (bVar.b == 0) {
                multiPersonStatisticsItemView.scrollToPosition(0);
            }
        }
    }
}
