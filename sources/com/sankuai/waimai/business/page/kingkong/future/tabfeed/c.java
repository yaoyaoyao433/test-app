package com.sankuai.waimai.business.page.kingkong.future.tabfeed;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import com.google.gson.Gson;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout;
import com.sankuai.waimai.business.page.kingkong.future.bean.FKKJsonData;
import com.sankuai.waimai.business.page.kingkong.future.bean.FkkPageInfo;
import com.sankuai.waimai.platform.monitor.DovePageMonitor;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.tablist.rocklist.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a<CustomTabLayout> implements CustomTabLayout.b {
    public static ChangeQuickRedirect d;
    final List<d> e;
    a f;
    private boolean g;
    private d h;
    private int i;
    private com.sankuai.waimai.business.page.common.net.request.a j;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(CustomTabLayout.e eVar);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_page_future_kingkong_tab_layout;
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d32a7bcff1f31d5c52c9088e029dff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d32a7bcff1f31d5c52c9088e029dff");
            return;
        }
        this.g = false;
        this.e = new ArrayList();
        this.i = 0;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888fba94a8ac980ee2798d3564498ac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888fba94a8ac980ee2798d3564498ac1");
            return;
        }
        super.b();
        ((CustomTabLayout) this.b).a(this);
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2 */
    public final void a(com.sankuai.waimai.business.page.kingkong.a aVar, RocksServerModel rocksServerModel, List<FkkTabItem> list) {
        View view;
        f fVar;
        int i;
        FkkPageInfo fkkPageInfo;
        FKKJsonData fKKJsonData;
        f fVar2;
        int i2 = 0;
        int i3 = 1;
        Object[] objArr = {aVar, rocksServerModel, list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09045900cae1169c1582467750ef1207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09045900cae1169c1582467750ef1207");
            return;
        }
        if (this.j == null) {
            this.j = aVar.u.a().b.b(1);
        }
        if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
            int i4 = 0;
            while (i4 < list.size()) {
                FkkTabItem fkkTabItem = list.get(i4);
                CustomTabLayout.e a2 = ((CustomTabLayout) this.b).a();
                if (a2 != null) {
                    Object[] objArr2 = new Object[i2];
                    ChangeQuickRedirect changeQuickRedirect2 = CustomTabLayout.e.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "25409e45eb99ef08159371937b4c3b4a", RobustBitConfig.DEFAULT_VALUE)) {
                        view = (View) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, i2, "25409e45eb99ef08159371937b4c3b4a");
                    } else {
                        view = a2.e == null ? null : a2.e.d;
                    }
                    ((CustomTabLayout) this.b).a(a2, i4 == 0);
                    if (view != null) {
                        b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                        a3.b = aVar.a();
                        a3.c = a2.a() ? fkkTabItem.clickTitleIcon : fkkTabItem.titleIcon;
                        a3.e = i3;
                        a3.j = a2.a() ? R.drawable.wm_page_table_layout_img_selected_default : R.drawable.wm_page_table_layout_img_unselecte_default;
                        a3.a((ImageView) view.findViewById(R.id.tab_tv));
                        HashMap hashMap = new HashMap();
                        if (i4 == 0) {
                            f fVar3 = new f();
                            fVar3.a = rocksServerModel;
                            Object[] objArr3 = new Object[i3];
                            objArr3[i2] = rocksServerModel;
                            ChangeQuickRedirect changeQuickRedirect3 = d;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "03b47b316a7b9d5223b5b4b1aa3c13e0", RobustBitConfig.DEFAULT_VALUE)) {
                                fkkPageInfo = (FkkPageInfo) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, i2, "03b47b316a7b9d5223b5b4b1aa3c13e0");
                            } else {
                                if (rocksServerModel.jsonData != null) {
                                    Map<String, Object> map = rocksServerModel.jsonData;
                                    Object[] objArr4 = new Object[1];
                                    objArr4[i2] = map;
                                    ChangeQuickRedirect changeQuickRedirect4 = d;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "deee00b5bbdd8c01c46cc2f64cb5128a", RobustBitConfig.DEFAULT_VALUE)) {
                                        fKKJsonData = (FKKJsonData) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "deee00b5bbdd8c01c46cc2f64cb5128a");
                                    } else {
                                        Gson gson = new Gson();
                                        fKKJsonData = (FKKJsonData) gson.fromJson(gson.toJson(map), (Class<Object>) FKKJsonData.class);
                                    }
                                    if (fKKJsonData != null) {
                                        fkkPageInfo = fKKJsonData.pageInfo;
                                    }
                                }
                                fkkPageInfo = null;
                            }
                            if (fkkPageInfo != null) {
                                fVar2 = fVar3;
                                fVar2.c = fkkPageInfo.has_next_page;
                                String str = fkkPageInfo.rank_trace_id;
                                if (this.j != null) {
                                    this.j.p = str;
                                }
                                hashMap = hashMap;
                                hashMap.put("rank_trace_id", str);
                            } else {
                                hashMap = hashMap;
                                fVar2 = fVar3;
                            }
                            fVar2.d = false;
                            fVar2.e = true;
                            fVar = fVar2;
                        } else {
                            fVar = null;
                        }
                        d dVar = new d(aVar, fVar, fkkTabItem, i4, hashMap);
                        if (i4 == 0) {
                            i = 1;
                            dVar.p = true;
                            this.h = dVar;
                        } else {
                            i = 1;
                        }
                        this.e.add(dVar);
                        if (list.size() == i) {
                            ((CustomTabLayout) this.b).setVisibility(8);
                        } else {
                            ((CustomTabLayout) this.b).setVisibility(0);
                            i4++;
                            i2 = 0;
                            i3 = 1;
                        }
                    }
                }
                i4++;
                i2 = 0;
                i3 = 1;
            }
            DovePageMonitor.a(aVar.b(), 200);
        } else {
            DovePageMonitor.a(aVar.b(), (int) UserCenter.TYPE_LOGOUT_NEGATIVE);
        }
        this.g = true;
    }

    @Override // com.sankuai.waimai.business.page.common.widget.tablayout.CustomTabLayout.b
    public final void a(CustomTabLayout.e eVar, boolean z, int i) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7cfbb38eb71556119e723f7780cae13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7cfbb38eb71556119e723f7780cae13");
            return;
        }
        if (this.f != null) {
            this.f.a(eVar);
        }
        if (this.g) {
            d dVar = this.e.get(eVar.c);
            if (dVar != this.h) {
                dVar.p = true;
                this.h.p = false;
                this.h = dVar;
            }
            ((CustomTabLayout) this.b).postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.c.1
                @Override // java.lang.Runnable
                public final void run() {
                }
            }, 100L);
        }
    }
}
