package com.sankuai.waimai.store.poi.list.newp.filterbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.logreport.f;
import com.sankuai.waimai.store.poi.list.newp.filterbar.a;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.SGSortFilterBarController;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.i;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import com.sankuai.waimai.store.widgets.filterbar.home.model.c;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.FilterBaseDataItem;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements a.InterfaceC1277a {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.param.a b;
    final b c;
    public a d;
    public SGSortFilterBarController e;
    protected com.sankuai.waimai.store.widgets.filterbar.home.controller.c f;
    private final Context g;
    private final LinearLayout h;
    private final LinearLayout i;
    private final com.sankuai.waimai.store.widgets.filterbar.home.controller.a j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(int i);

        void a(long j, boolean z, String str, String str2);

        void a(String str);

        void b();
    }

    public d(com.sankuai.waimai.store.widgets.filterbar.home.controller.c cVar, @NonNull View view, @NonNull com.sankuai.waimai.store.param.a aVar, @NonNull com.sankuai.waimai.store.widgets.filterbar.home.controller.a aVar2) {
        Object[] objArr = {cVar, view, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89ee60c8f98db5fccf75c8661199f897", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89ee60c8f98db5fccf75c8661199f897");
            return;
        }
        this.f = cVar;
        this.g = view.getContext();
        this.b = aVar;
        this.j = aVar2;
        this.c = new b(view.getContext());
        this.h = (LinearLayout) view.findViewById(R.id.fl_filter_bar);
        this.i = (LinearLayout) view.findViewById(R.id.fl_filter_bar_dropdown);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a1cb6165991e92538f1b3810a7af5a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a1cb6165991e92538f1b3810a7af5a2");
            return;
        }
        this.e = new SGSortFilterBarController(this.f, this.g, this.b, this.j);
        if (this.b.l() && (this.g instanceof SCBaseActivity)) {
            this.e.f = new f((SCBaseActivity) this.g, this.b);
        }
        this.e.a(this.b.l(), this.g instanceof SCBaseActivity ? ((SCBaseActivity) this.g).w() : "", this.c.b.b(), this.h, this.i);
        this.e.d(false);
        this.e.e = new com.sankuai.waimai.store.widgets.filterbar.home.controller.e() { // from class: com.sankuai.waimai.store.poi.list.newp.filterbar.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.e
            public final void a(long j, boolean z, List<String> list, List<FilterBaseDataItem> list2) {
                Object[] objArr3 = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), list, list2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e7c5775791606c89123bd6d6479977b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e7c5775791606c89123bd6d6479977b8");
                } else {
                    d.this.a(j, z, list, list2);
                }
            }

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.e
            public final void a(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7f663c03cfe98e3a500237b94163dac9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7f663c03cfe98e3a500237b94163dac9");
                    return;
                }
                d.this.b.a(str);
                if (d.this.d != null) {
                    d.this.d.a(str);
                }
            }

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.e
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "48fdcdc7e69f3b792a58f5e326e59cfa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "48fdcdc7e69f3b792a58f5e326e59cfa");
                    return;
                }
                d dVar = d.this;
                Object[] objArr4 = {(byte) 1};
                ChangeQuickRedirect changeQuickRedirect4 = d.a;
                if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "56a227e0b258c6239a6fad2a7cc81ee1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "56a227e0b258c6239a6fad2a7cc81ee1");
                } else {
                    dVar.e.d(true);
                }
                if (d.this.d != null) {
                    d.this.d.a(d.this.c.b.c());
                }
            }

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.e
            public final void b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4cc955cb81f3443283a698fc0f2f1d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4cc955cb81f3443283a698fc0f2f1d7");
                } else if (d.this.d != null) {
                    d.this.d.a();
                }
            }

            @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.e
            public final void c() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb6ada432dc3204bd44f90ec55e8e7d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb6ada432dc3204bd44f90ec55e8e7d5");
                } else if (d.this.d != null) {
                    d.this.d.b();
                }
            }
        };
    }

    public final void a(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae46ceac297fe2544135ef6f0dc5a6a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae46ceac297fe2544135ef6f0dc5a6a9");
        } else {
            this.e.a(aVar);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b67e3fd212ac028443468bea070b383b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b67e3fd212ac028443468bea070b383b");
        } else {
            this.e.b(z);
        }
    }

    public final void b(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d8501859a7e34730aa9791864dbe5e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d8501859a7e34730aa9791864dbe5e5");
        } else {
            this.e.b(aVar);
        }
    }

    @NonNull
    public final View b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bee365ee5b0c7ab024192ac5e9c63fc5", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bee365ee5b0c7ab024192ac5e9c63fc5") : this.c.b.getView();
    }

    public final void a(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7334c4ad80850d127144a4747f3d9b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7334c4ad80850d127144a4747f3d9b2a");
        } else {
            this.c.b.a(0);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "108e2566760388a87218eb1c3a80dabc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "108e2566760388a87218eb1c3a80dabc");
            return;
        }
        this.e.a(this.b.c, this.b.f, this.b.y ? 1 : 0);
        this.e.c();
    }

    public final void a(i.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b407d5d656306f2484ca174ad2424f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b407d5d656306f2484ca174ad2424f1");
        } else {
            this.e.a(aVar);
        }
    }

    public final void a(@NonNull FilterConditionResponse filterConditionResponse, i.a aVar) {
        Object[] objArr = {filterConditionResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e661b9034e97ece6de3cae867c112185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e661b9034e97ece6de3cae867c112185");
        } else {
            this.e.a(filterConditionResponse, aVar);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d3e78d8ed71b311ced4683ee328f18b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d3e78d8ed71b311ced4683ee328f18b");
        } else {
            this.e.d();
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e9e201e37692a4b20de5aba566658f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e9e201e37692a4b20de5aba566658f6");
        } else {
            this.e.e(i);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27cd94849f76d04d24471e4bdddd04f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27cd94849f76d04d24471e4bdddd04f3");
        } else {
            this.e.c(z);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.filterbar.a.InterfaceC1277a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd83f4b04eda5ed1293253961dacbbf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd83f4b04eda5ed1293253961dacbbf7");
            return;
        }
        this.e.e();
        a(this.b.g, true, null, null);
    }

    void a(long j, boolean z, List<String> list, List<FilterBaseDataItem> list2) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b91a02f7bfe3d904ff1a2843f95b89ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b91a02f7bfe3d904ff1a2843f95b89ca");
            return;
        }
        this.b.g = j;
        this.b.i = t.a(list, CommonConstant.Symbol.COMMA);
        this.b.j = a(list2);
        if (this.d != null) {
            this.d.a(this.b.g, z, this.b.i, this.b.j);
        }
    }

    private String a(List<FilterBaseDataItem> list) {
        int i = 1;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52b1a8b17dceefe412fc687e3b66e527", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52b1a8b17dceefe412fc687e3b66e527");
        }
        if (list == null || com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (FilterBaseDataItem filterBaseDataItem : list) {
                if (!filterBaseDataItem.code.equals("-99")) {
                    JSONObject jSONObject = new JSONObject();
                    com.sankuai.waimai.store.widgets.filterbar.home.model.c cVar = c.a.a;
                    String str = filterBaseDataItem.groupName;
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = str;
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.widgets.filterbar.home.model.c.a;
                    jSONObject.put("group_code", PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "43ca00e67d33759a827619ebe71358f2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "43ca00e67d33759a827619ebe71358f2") : cVar.b.get(str));
                    jSONObject.put("code", filterBaseDataItem.code);
                    jSONArray.put(jSONObject);
                }
                i = 1;
            }
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        return jSONArray.toString();
    }

    public final void a(BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50321d23275abb27786d939cbd5abbcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50321d23275abb27786d939cbd5abbcc");
        } else {
            this.e.a(baseModuleDesc);
        }
    }
}
