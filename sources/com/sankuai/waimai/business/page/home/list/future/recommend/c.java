package com.sankuai.waimai.business.page.home.list.future.recommend;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.platform.dynamic.g;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.view.viewmodel.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    static final String b = "c";
    public com.sankuai.waimai.rocks.view.a c;
    public PageFragment d;
    public com.sankuai.waimai.mach.node.a e;
    public g f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public HashMap<Integer, View> k;
    DynamicCardStatisticsBean l;
    public e m;
    public com.sankuai.waimai.business.page.home.list.future.complex.e n;
    private com.sankuai.waimai.business.page.common.list.ai.c o;
    private boolean p;
    private b q;

    public c(com.sankuai.waimai.rocks.view.a aVar, com.sankuai.waimai.business.page.common.list.ai.c cVar, com.sankuai.waimai.business.page.home.list.future.complex.e eVar, PageFragment pageFragment) {
        Object[] objArr = {aVar, cVar, eVar, pageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b02af046d821ecbfafd1e640f562dd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b02af046d821ecbfafd1e640f562dd4");
            return;
        }
        this.i = -1;
        this.j = 10;
        this.p = false;
        this.q = new b();
        this.c = aVar;
        this.o = cVar;
        this.d = pageFragment;
        this.n = eVar;
        this.k = new HashMap<>();
    }

    public final void a(View view, int i) {
        int i2;
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4615c09d777c475911aabc25ffdebd64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4615c09d777c475911aabc25ffdebd64");
        } else if (i < 50 || this.c == null || this.c.d == null || this.k.size() <= 0 || this.p) {
        } else {
            this.p = true;
            RecyclerView.LayoutManager layoutManager = this.c.d.g.getLayoutManager();
            int i3 = -1;
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                i3 = linearLayoutManager.findFirstVisibleItemPosition();
                i2 = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                i2 = -1;
            }
            Iterator<Map.Entry<Integer, View>> it = this.k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, View> next = it.next();
                if (next.getKey().intValue() < i3 || next.getKey().intValue() > i2) {
                    next.getValue().setVisibility(8);
                    ViewGroup viewGroup = (ViewGroup) next.getValue().getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(next.getValue());
                    }
                    it.remove();
                }
            }
            this.p = false;
        }
    }

    public int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8113a25202f843b9d97d4381e78456b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8113a25202f843b9d97d4381e78456b2")).intValue();
        }
        RecyclerView recyclerView = this.c.d.g;
        int itemCount = recyclerView.getAdapter().getItemCount();
        RecyclerView.s findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        if (i >= itemCount) {
            return -1;
        }
        if ((i == itemCount - 1 && recyclerView.getAdapter().getItemViewType(i) == -2) || findViewHolderForAdapterPosition == null || findViewHolderForAdapterPosition.itemView == null) {
            return -1;
        }
        return i + 1;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6982361c93dabafd9759e7234124012a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6982361c93dabafd9759e7234124012a");
            return;
        }
        this.e = null;
        this.f = null;
        this.m = null;
        this.i = -1;
    }

    public GradientDrawable a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98bc50abee63b228cca86be1775ed2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (GradientDrawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98bc50abee63b228cca86be1775ed2e");
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        try {
            gradientDrawable.setColor(Color.parseColor(str));
        } catch (Exception unused) {
        }
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(RocksServerModel rocksServerModel, DynamicCardStatisticsBean dynamicCardStatisticsBean) {
        Object[] objArr = {rocksServerModel, dynamicCardStatisticsBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a768b592c02b2f69695fd3de579c160", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a768b592c02b2f69695fd3de579c160");
        }
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(rocksServerModel.stringData);
        if (a2 == null) {
            return rocksServerModel.stringData;
        }
        a2.put("rank_list_id", dynamicCardStatisticsBean.rankListId);
        a2.put("rank_trace_id", dynamicCardStatisticsBean.rankTraceId);
        a2.put("card_list_id", dynamicCardStatisticsBean.cardListId);
        a2.put("ref_index", Integer.valueOf(dynamicCardStatisticsBean.refIndex));
        a2.put("ref_poi_id", dynamicCardStatisticsBean.refPoiId);
        a2.put("ref_poi_id_str", dynamicCardStatisticsBean.refPoiIdStr);
        a2.put("card_intent_type", Integer.valueOf(dynamicCardStatisticsBean.cardIntentType));
        a2.put("interactive_recommend", "1");
        a2.put("ref_trace_id", dynamicCardStatisticsBean.rankTraceId);
        a2.put("ref_list_id", dynamicCardStatisticsBean.rankListId);
        a2.put("data_id", dynamicCardStatisticsBean.dataId);
        a2.put("trigger_poi_index", Integer.valueOf(dynamicCardStatisticsBean.triggerPoiIndex));
        return new JSONObject(a2).toString();
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a461306202915ea3fec4d586103125f4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a461306202915ea3fec4d586103125f4")).intValue() : this.o.b + e() + 1;
    }

    public final int c() {
        int itemCount;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd9a22fb2fc4dbbbc866e2b01533291e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd9a22fb2fc4dbbbc866e2b01533291e")).intValue();
        }
        int b2 = b();
        if (this.o.b <= b2 && (itemCount = this.c.d.g.getAdapter().getItemCount()) > b2) {
            return itemCount - b2;
        }
        return 0;
    }

    private int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86f825c7df8f8138899af23c8cd72d21", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86f825c7df8f8138899af23c8cd72d21")).intValue();
        }
        int i = com.sankuai.waimai.business.page.common.list.ai.a.a().c;
        if (i > 0) {
            return i;
        }
        return 5;
    }
}
