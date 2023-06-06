package com.sankuai.waimai.store.poi.list.newp.sg;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.BaseTileNew;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.monitor.monitor.SGModuleRenderLossRate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> extends com.sankuai.waimai.store.base.b implements com.sankuai.waimai.store.base.idata.a {
    public static ChangeQuickRedirect b;
    private boolean a;
    public final com.sankuai.waimai.store.param.a c;
    public final ViewGroup d;
    public int e;
    public int f;
    public BaseModuleDesc g;
    protected Map<String, Object> h;
    private boolean i;
    private C1279a j;

    public abstract void a(@NonNull C1279a c1279a);

    public abstract void a(@NonNull T t);

    public abstract int b();

    public a(@NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup.getContext());
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d34c5fb62aae2fe627bc0ae72789228f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d34c5fb62aae2fe627bc0ae72789228f");
            return;
        }
        this.e = 0;
        this.f = -1;
        this.a = false;
        this.i = true;
        this.j = new C1279a();
        this.g = null;
        this.h = null;
        this.d = viewGroup;
        this.c = aVar;
    }

    public static BaseModuleDesc a(a aVar, com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar, int i) {
        BaseTileNew baseTileNew;
        Object[] objArr = {aVar, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e373c3fe44e85664fee1b4481aa56e56", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseModuleDesc) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e373c3fe44e85664fee1b4481aa56e56");
        }
        if (aVar.g != null) {
            return aVar.g;
        }
        if ((aVar.getContext() instanceof FragmentActivity) && bVar.a(i).blocks != null && bVar.a(i).blocks.bannerBlock != null && (baseTileNew = (BaseTileNew) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar.a(i).blocks.bannerBlock, i)) != null) {
            return (BaseModuleDesc) baseTileNew.data;
        }
        return (BaseModuleDesc) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar.a(i).moduleList, i);
    }

    public final void b(a aVar, com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar, int i) {
        Object[] objArr = {aVar, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0015820dc18a40378d9e34e29559f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0015820dc18a40378d9e34e29559f9c");
            return;
        }
        String str = "sm_type_home_" + aVar.g.moduleId;
        if (bVar == null || bVar.a(0).blocks == null || bVar.a(0).blocks.bannerBlock == null) {
            return;
        }
        for (int i2 = 0; i2 < bVar.a(0).blocks.bannerBlock.size(); i2++) {
            BaseTileNew baseTileNew = (BaseTileNew) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar.a(0).blocks.bannerBlock, i2);
            if ((baseTileNew != null && str.equals(baseTileNew.sType)) || (baseTileNew != null && "sm_type_channel_double_row_kingkong".equals(baseTileNew.sType))) {
                Map<String, Object> a = com.sankuai.waimai.store.poi.list.util.e.a(baseTileNew.propsData);
                if (a == null || a.size() <= 0) {
                    return;
                }
                this.h = a;
                return;
            }
        }
    }

    public final void c(a aVar, com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar, int i) {
        Object[] objArr = {aVar, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f368d6ab3a1b8d5a831225a755f0b46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f368d6ab3a1b8d5a831225a755f0b46");
        } else if (bVar != null && bVar.a(0).blocks != null && bVar.a(0).blocks.bannerBlock != null) {
            for (int i2 = 0; i2 < bVar.a(0).blocks.bannerBlock.size(); i2++) {
                BaseTileNew baseTileNew = (BaseTileNew) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar.a(0).blocks.bannerBlock, i2);
                if (baseTileNew != null && "sm_type_home_porcelain".equals(baseTileNew.sType)) {
                    Map<String, Object> a = com.sankuai.waimai.store.poi.list.util.e.a(baseTileNew.propsData);
                    if (a == null || a.size() <= 0) {
                        return;
                    }
                    this.h = a;
                    return;
                }
            }
        }
    }

    public final String c() {
        return this.g != null ? this.g.moduleId : "";
    }

    public final void a(@Nullable ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66b255708aac22922e2161811e29f4a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66b255708aac22922e2161811e29f4a5");
            return;
        }
        d();
        if (this.mView != null) {
            if (this.mView.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.mView.getParent()).removeView(this.mView);
            }
            ViewGroup.LayoutParams layoutParams2 = this.mView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
            }
            this.d.addView(this.mView, layoutParams2);
        }
    }

    public final void b(@NonNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575ee418fd00047dcf70dadfef565661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575ee418fd00047dcf70dadfef565661");
            return;
        }
        d();
        a(this.j);
        u.a(this.mView);
        try {
            a((a<T>) t);
        } catch (Exception e) {
            u.c(this.mView);
            com.sankuai.shangou.stone.util.log.a.a("%s", e.getMessage());
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2617fec907c124188e0e1588364a086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2617fec907c124188e0e1588364a086");
        } else if (this.a) {
        } else {
            this.a = true;
            int b2 = b();
            if (-1 != b2) {
                bindView(this.mInflater.inflate(b2, this.d, false));
            } else if (this.mView == null) {
                com.sankuai.shangou.stone.util.log.a.d("BaseChannelViewBlock", "接口数据错误，下发了已下线或不存在的模块儿! Type = " + this.e, new Object[0]);
            }
        }
    }

    public final a b(@Nullable C1279a c1279a) {
        if (c1279a != null) {
            this.j = c1279a;
        }
        return this;
    }

    @Override // com.sankuai.waimai.store.base.idata.a
    public final boolean a() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.base.idata.a
    public final void a(boolean z) {
        this.i = z;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poi.list.newp.sg.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1279a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;

        public C1279a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48e061eccbef280600654509ddb83401", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48e061eccbef280600654509ddb83401");
                return;
            }
            this.b = -1;
            this.c = -1;
        }

        public final int a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cf97540a4da1ff2c0874c6e30f5dda1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cf97540a4da1ff2c0874c6e30f5dda1")).intValue() : this.b > 0 ? a(context, this.b) : this.b;
        }

        public final int b(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "346e3c1944394de86e60a7069897702e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "346e3c1944394de86e60a7069897702e")).intValue() : this.c > 0 ? a(context, this.c) : this.c;
        }

        private int a(Context context, int i) {
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "433fb3407457ab5e11136fc7f42e927f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "433fb3407457ab5e11136fc7f42e927f")).intValue() : h.a(context, i);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "637dc78f6d7afbf0d5a722abad2d7eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "637dc78f6d7afbf0d5a722abad2d7eae");
        } else if (o.j() && !t.a(str) && this.c != null) {
            ArrayList arrayList = (ArrayList) j.h().a(SCConfigPath.EXPOSE_TARGET_MODULE, new TypeToken<List<Map<String, String>>>() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.a.1
            }.getType(), new ArrayList());
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                return;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                Map map = (Map) com.sankuai.shangou.stone.util.a.a((List<Object>) arrayList, i);
                if (map.get("templateID") != null && ((String) map.get("templateID")).equals(str)) {
                    com.sankuai.waimai.store.util.monitor.b.a().a(SGModuleRenderLossRate.SGModuleRenderLossRate).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(this.c.c)).a("module_name", str).a(z ? "SGModuleRenderLossRateSuccess" : "SGModuleRenderLossRateFailure").a(!z ? 1 : 0).a();
                }
            }
        }
    }
}
