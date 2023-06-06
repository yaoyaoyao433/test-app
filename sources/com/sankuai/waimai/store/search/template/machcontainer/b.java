package com.sankuai.waimai.store.search.template.machcontainer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.mach.d;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.view.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    Context b;
    ViewGroup c;
    ViewGroup d;
    SearchShareData e;
    c f;
    com.sankuai.waimai.store.search.mach.a g;
    com.sankuai.waimai.store.search.mach.secondfilter.a h;
    com.sankuai.waimai.store.search.mach.dropdownfilter.a i;
    boolean j;
    boolean k;
    private d.b l;
    private boolean m;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ void a(b bVar, com.sankuai.waimai.mach.node.a aVar) {
        List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "b556e9c0b83d586301323f306f47fe58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "b556e9c0b83d586301323f306f47fe58");
            return;
        }
        if (bVar.e.aU && bVar.a(aVar.f.getTemplateId())) {
            bVar.e.aU = false;
            bVar.e.aS = MetricsSpeedMeterTask.createCustomSpeedMeterTask("search_mach_report_span");
        }
        if (aVar.f != null) {
            if (bVar.m) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "8e07698e70c9062a691bf3bed328b004", RobustBitConfig.DEFAULT_VALUE)) {
                    searchNodeWithViewReport = (List) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "8e07698e70c9062a691bf3bed328b004");
                } else {
                    searchNodeWithViewReport = new ArrayList<>();
                    if (aVar != null) {
                        bVar.a(aVar, searchNodeWithViewReport);
                    }
                }
            } else {
                searchNodeWithViewReport = aVar.f.searchNodeWithViewReport();
            }
            if (CollectionUtils.isEmpty(searchNodeWithViewReport)) {
                bVar.l.a();
                bVar.d(aVar);
                if (!com.sankuai.shangou.stone.util.a.b(bVar.l.c)) {
                    for (com.sankuai.waimai.mach.node.a aVar2 : bVar.l.c) {
                        bVar.b(aVar2);
                    }
                }
                bVar.l.a();
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar3 : searchNodeWithViewReport) {
                bVar.a(aVar3);
            }
        }
    }

    public b(Context context, boolean z, boolean z2) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b29f380709fae9451803b857252e8ee9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b29f380709fae9451803b857252e8ee9");
            return;
        }
        this.l = new d.b();
        this.b = context;
        this.e = SearchShareData.a(this.b);
        this.j = z;
        this.m = z2;
    }

    public final View a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080fd58d488d5a8b6a343b5e63178bdc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080fd58d488d5a8b6a343b5e63178bdc");
        }
        if (i == -5 || i == -6) {
            f fVar = new f(this.b);
            fVar.setUpwardSticky(true);
            fVar.setDownwardSticky(false);
            fVar.setLayoutParams(new RecyclerView.g(-1, -2));
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_sc_nox_search_layout_store_mach_block, (ViewGroup) fVar, true);
            this.c = (ViewGroup) inflate.findViewById(R.id.common_mach_container);
            this.d = (ViewGroup) inflate.findViewById(R.id.mach_container_wrapper);
            this.k = false;
            return fVar;
        }
        View inflate2 = LayoutInflater.from(this.b).inflate(R.layout.wm_sc_nox_search_layout_store_mach_block, viewGroup, false);
        this.c = (ViewGroup) inflate2.findViewById(R.id.common_mach_container);
        this.d = (ViewGroup) inflate2.findViewById(R.id.mach_container_wrapper);
        this.k = true;
        return inflate2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a98460a6a190f1adb421b3fa6fd073fb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a98460a6a190f1adb421b3fa6fd073fb")).booleanValue() : TextUtils.equals(str, "supermarket-search-poi") || TextUtils.equals(str, "supermarket-search-product") || TextUtils.equals(str, "supermarket-search-product-v2") || TextUtils.equals(str, "supermarket-search-product-flower");
    }

    private void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c37a1fea288ad60b30ac612e589f7fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c37a1fea288ad60b30ac612e589f7fa");
        } else if (aVar != null) {
            d(aVar);
            if (!com.sankuai.shangou.stone.util.a.b(this.l.c)) {
                for (com.sankuai.waimai.mach.node.a aVar2 : this.l.c) {
                    b(aVar2);
                }
                this.l.a();
                ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                com.sankuai.waimai.store.mach.a.b(aVar, arrayList);
                if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                    return;
                }
                for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                    if (aVar3 != null) {
                        if (this.m) {
                            aVar3.f.triggerViewReport(aVar3);
                        } else {
                            c(aVar3);
                        }
                    }
                }
                return;
            }
            this.l.a();
            if (this.m) {
                aVar.f.triggerViewReport(aVar);
            } else {
                c(aVar);
            }
        }
    }

    private void c(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaeae15f2f86cbce9edc8cd9caa125ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaeae15f2f86cbce9edc8cd9caa125ae");
        } else if (aVar == null || aVar.g() == null) {
        } else {
            String str = null;
            if (aVar.h() != null && aVar.h().containsKey("expose-key")) {
                str = String.valueOf(aVar.h().get("expose-key"));
            }
            if (t.a(str)) {
                str = String.valueOf(System.identityHashCode(aVar));
            }
            com.sankuai.waimai.store.expose.v2.entity.a aVar2 = new com.sankuai.waimai.store.expose.v2.entity.a(aVar.g(), str);
            aVar2.a(new C1312b(aVar));
            com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) this.b, aVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.machcontainer.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1312b implements c.a {
        public static ChangeQuickRedirect a;
        private final WeakReference<com.sankuai.waimai.mach.node.a> b;

        public C1312b(com.sankuai.waimai.mach.node.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9cecd1212f0231007dd91444d74b2d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9cecd1212f0231007dd91444d74b2d");
            } else {
                this.b = new WeakReference<>(aVar);
            }
        }

        @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fe785415492b78b22b7e5bd68d79633", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fe785415492b78b22b7e5bd68d79633");
                return;
            }
            com.sankuai.waimai.mach.node.a aVar = this.b.get();
            if (aVar != null) {
                aVar.f.triggerViewReport(aVar);
            }
        }
    }

    private void d(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb42684f0872856e53247d9b1013a08c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb42684f0872856e53247d9b1013a08c");
        } else if (aVar != null) {
            e(aVar);
            List<com.sankuai.waimai.mach.node.a> b = aVar.b();
            if (com.sankuai.shangou.stone.util.a.b(b)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar2 : b) {
                if (aVar2 != null) {
                    e(aVar2);
                }
                d(aVar2);
            }
        }
    }

    private void e(@NonNull com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d84b836a7f3df6c46cb62f5e86bfa429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d84b836a7f3df6c46cb62f5e86bfa429");
        } else if (com.sankuai.waimai.store.mach.a.b(aVar)) {
            this.l.b = aVar;
        } else if (com.sankuai.waimai.store.mach.a.c(aVar)) {
            this.l.d.add(aVar);
        } else if (com.sankuai.waimai.store.mach.a.d(aVar)) {
            this.l.c.add(aVar);
        }
    }

    private void a(@NonNull com.sankuai.waimai.mach.node.a aVar, List<com.sankuai.waimai.mach.node.a> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18dd63e75cfbd8ad40f8750a55b8cec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18dd63e75cfbd8ad40f8750a55b8cec0");
        } else if (!TextUtils.equals(aVar.j, "sg-scroller")) {
            if (aVar.k() || aVar.l() || aVar.m() || aVar.n()) {
                list.add(aVar);
            }
            if (aVar.j()) {
                for (int i = 0; i < aVar.b().size(); i++) {
                    com.sankuai.waimai.mach.node.a aVar2 = aVar.b().get(i);
                    if (aVar2 != null) {
                        a(aVar2, list);
                    }
                }
            }
        }
    }

    private void b(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04c1b85a72293bff2a9aebb711de4ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04c1b85a72293bff2a9aebb711de4ebb");
        } else if (aVar != null && (aVar.h instanceof com.sankuai.waimai.mach.component.scroller.b)) {
            if (com.sankuai.waimai.store.mach.a.a(aVar)) {
                c(aVar);
            }
            List<Integer> e = ((com.sankuai.waimai.mach.component.scroller.b) aVar.h).e();
            List<com.sankuai.waimai.mach.node.a> b = aVar.b();
            if (com.sankuai.shangou.stone.util.a.b(e) || com.sankuai.shangou.stone.util.a.b(b)) {
                return;
            }
            for (Integer num : e) {
                com.sankuai.waimai.mach.node.a aVar2 = (com.sankuai.waimai.mach.node.a) com.sankuai.shangou.stone.util.a.a((List<Object>) b, num.intValue());
                if (aVar2 != null && aVar2.g() != null && !com.sankuai.waimai.store.mach.a.c(aVar2)) {
                    ArrayList<com.sankuai.waimai.mach.node.a> arrayList = new ArrayList();
                    com.sankuai.waimai.store.mach.a.a(aVar2, arrayList);
                    if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                        for (com.sankuai.waimai.mach.node.a aVar3 : arrayList) {
                            c(aVar3);
                        }
                    }
                }
            }
        }
    }
}
