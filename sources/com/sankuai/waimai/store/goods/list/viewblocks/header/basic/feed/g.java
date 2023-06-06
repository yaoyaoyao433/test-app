package com.sankuai.waimai.store.goods.list.viewblocks.header.basic.feed;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.util.w;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g {
    public static ChangeQuickRedirect b;
    @NonNull
    private final ViewGroup a;
    @NonNull
    private final f c;
    private final List<com.sankuai.waimai.store.base.b> d;
    private LinearLayout.LayoutParams e;
    private LinearLayout.LayoutParams f;
    private boolean g;

    public g(@NonNull f fVar, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {fVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1386cb0c913471bdc796cf5e1c453408", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1386cb0c913471bdc796cf5e1c453408");
            return;
        }
        this.d = new ArrayList();
        this.g = false;
        this.a = viewGroup;
        this.c = fVar;
        a(this.c, this.a);
    }

    public g(@NonNull f fVar, @NonNull ViewGroup viewGroup, boolean z) {
        Object[] objArr = {fVar, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5044ce85f5ffe7cfe464b3eef7150e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5044ce85f5ffe7cfe464b3eef7150e4");
            return;
        }
        this.d = new ArrayList();
        this.g = false;
        this.a = viewGroup;
        this.c = fVar;
        a(this.c, this.a);
        this.g = z;
    }

    private void a(@NonNull f fVar, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {fVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f1f4eb83887c139ea0a81be48449193", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f1f4eb83887c139ea0a81be48449193");
            return;
        }
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_1);
        int dimensionPixelSize2 = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_20);
        int dimensionPixelSize3 = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_15);
        this.e = new LinearLayout.LayoutParams(-1, dimensionPixelSize);
        this.e.leftMargin = dimensionPixelSize2;
        this.e.rightMargin = dimensionPixelSize2;
        this.f = new LinearLayout.LayoutParams(-1, dimensionPixelSize);
        this.f.leftMargin = dimensionPixelSize3;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf2661433d014a67c52a4cae3144cba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf2661433d014a67c52a4cae3144cba7");
            return;
        }
        for (com.sankuai.waimai.store.base.b bVar : this.d) {
            if (bVar != null) {
                bVar.onDestroy();
            }
        }
        this.d.clear();
    }

    public final void a(List<BaseModuleDesc> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6839fc8122ab0cb139d14804c0414349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6839fc8122ab0cb139d14804c0414349");
            return;
        }
        this.a.removeAllViews();
        d();
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BaseModuleDesc baseModuleDesc = list.get(i);
            if (baseModuleDesc != null && baseModuleDesc.jsonData != null) {
                int c = c(baseModuleDesc);
                View view = null;
                if (c != 5) {
                    switch (c) {
                        case 1:
                            view = a(baseModuleDesc);
                            break;
                        case 2:
                            view = b(baseModuleDesc);
                            break;
                        case 3:
                            view = a(baseModuleDesc, i);
                            break;
                    }
                } else if (w.a(this.c.e().b)) {
                    view = b(baseModuleDesc, i);
                }
                if (view != null) {
                    this.a.addView(view, new ViewGroup.LayoutParams(-1, -2));
                    a(list, i, baseModuleDesc);
                }
            }
        }
    }

    public void a(List<BaseModuleDesc> list, int i, @NonNull BaseModuleDesc baseModuleDesc) {
        boolean e;
        boolean z = false;
        Object[] objArr = {list, Integer.valueOf(i), baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9716a1b3a889560c62772decc051bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9716a1b3a889560c62772decc051bc3");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a42e4f5d4c6077771cbb01246b686461", RobustBitConfig.DEFAULT_VALUE)) {
            e = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a42e4f5d4c6077771cbb01246b686461")).booleanValue();
        } else {
            e = (this.c == null || this.c.e() == null || this.c.e().b == null) ? false : w.e(this.c.e().b);
        }
        if (e) {
            if (i != com.sankuai.shangou.stone.util.a.a((List) list) - 1) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c48e52efb3ce85be9d2eb924b384e2f", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c48e52efb3ce85be9d2eb924b384e2f")).booleanValue();
                } else if (this.c != null && this.c.e() != null && this.c.e().b != null) {
                    z = this.c.e().b.headerMachHaveDivider();
                }
                if (z) {
                    TextView textView = new TextView(this.a.getContext());
                    textView.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.a.getContext(), R.color.wm_sg_color_EFEFEF));
                    this.a.addView(textView, this.f);
                }
            }
        } else if (i == com.sankuai.shangou.stone.util.a.a((List) list) - 1 || TextUtils.equals(baseModuleDesc.templateId, "supermarket-poi-header-info")) {
        } else {
            TextView textView2 = new TextView(this.a.getContext());
            textView2.setBackgroundColor(com.sankuai.waimai.store.util.b.b(this.a.getContext(), R.color.wm_sg_color_EFEFEF));
            this.a.addView(textView2, this.e);
        }
    }

    private View a(@NonNull BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd26c35a44d13c077c977043a52a893", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd26c35a44d13c077c977043a52a893");
        }
        h hVar = new h(this.c.f(), baseModuleDesc);
        this.d.add(hVar);
        View createView = hVar.createView(this.a);
        hVar.a(baseModuleDesc, i, this.g);
        return createView;
    }

    private View b(@NonNull BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4ecdf88e95e2512469bcc9ef0bbd9f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4ecdf88e95e2512469bcc9ef0bbd9f3");
        }
        b bVar = new b(this.c.f(), baseModuleDesc);
        this.d.add(bVar);
        View createView = bVar.createView(this.a);
        bVar.a(baseModuleDesc, i, this.g);
        return createView;
    }

    private View a(@NonNull BaseModuleDesc baseModuleDesc) {
        Poi.RecommendRank recommendRank;
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36a2c66d06375d742914e2930941538e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36a2c66d06375d742914e2930941538e");
        }
        JSONObject optJSONObject = new JSONObject(baseModuleDesc.jsonData).optJSONObject("recommend_rank_vo");
        if (optJSONObject == null || (recommendRank = (Poi.RecommendRank) com.sankuai.waimai.store.util.i.a().fromJson(optJSONObject.toString(), (Class<Object>) Poi.RecommendRank.class)) == null) {
            return null;
        }
        com.sankuai.waimai.store.goods.list.viewblocks.header.basic.a aVar = new com.sankuai.waimai.store.goods.list.viewblocks.header.basic.a(this.c.f());
        this.d.add(aVar);
        View createView = aVar.createView(this.a);
        aVar.a(recommendRank);
        return createView;
    }

    private View b(@NonNull BaseModuleDesc baseModuleDesc) {
        Poi.PoiComment poiComment;
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8090d2513385cafaf68b65cb113507ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8090d2513385cafaf68b65cb113507ef");
        }
        JSONObject optJSONObject = new JSONObject(baseModuleDesc.jsonData).optJSONObject("poi_comment");
        if (optJSONObject == null || (poiComment = (Poi.PoiComment) com.sankuai.waimai.store.util.i.a().fromJson(optJSONObject.toString(), (Class<Object>) Poi.PoiComment.class)) == null) {
            return null;
        }
        com.sankuai.waimai.store.goods.list.viewblocks.header.basic.b bVar = new com.sankuai.waimai.store.goods.list.viewblocks.header.basic.b(this.c.f());
        this.d.add(bVar);
        View createView = bVar.createView(this.a);
        bVar.a(poiComment);
        return createView;
    }

    private int c(BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f326b2be1979bdd18e2c318424e77ff3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f326b2be1979bdd18e2c318424e77ff3")).intValue();
        }
        if (baseModuleDesc == null) {
            return 4;
        }
        if ("native".equals(baseModuleDesc.nativeId)) {
            if ("food_poi_comment".equals(baseModuleDesc.moduleId)) {
                return 2;
            }
            if ("food_recommend_rank".equals(baseModuleDesc.moduleId)) {
                return 1;
            }
        } else if ("mach".equals(baseModuleDesc.nativeId)) {
            return "food_discount".equals(baseModuleDesc.moduleId) ? 5 : 3;
        }
        return 4;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11e26b8a2d5be35b9d558c02e25e17a8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11e26b8a2d5be35b9d558c02e25e17a8")).intValue() : this.a.getHeight();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd536666ec05e224ef3820f955992135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd536666ec05e224ef3820f955992135");
            return;
        }
        for (com.sankuai.waimai.store.base.b bVar : this.d) {
            if (bVar != null) {
                bVar.onDestroy();
            }
        }
    }

    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d37d0902c199c66757b668efc0d50f57", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d37d0902c199c66757b668efc0d50f57");
        }
        if (com.sankuai.shangou.stone.util.a.b(this.d)) {
            return null;
        }
        for (com.sankuai.waimai.store.base.b bVar : this.d) {
            if (bVar instanceof b) {
                return bVar.getView();
            }
        }
        return null;
    }
}
