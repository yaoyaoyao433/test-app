package com.sankuai.waimai.store.poi.list.newp.filterbar;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.o;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    InterfaceC1277a b;
    private com.sankuai.waimai.store.expose.v2.entity.b c;
    private com.sankuai.waimai.store.param.a d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.poi.list.newp.filterbar.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1277a {
        void a();
    }

    public a(@NonNull ViewGroup viewGroup, InterfaceC1277a interfaceC1277a) {
        super(viewGroup.getContext());
        Object[] objArr = {viewGroup, interfaceC1277a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2f8725768ae8c4160f1e386475a4742", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2f8725768ae8c4160f1e386475a4742");
            return;
        }
        this.b = interfaceC1277a;
        NetInfoLoadView netInfoLoadView = new NetInfoLoadView(viewGroup.getContext());
        netInfoLoadView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        bindView(netInfoLoadView);
        Object[] objArr2 = {netInfoLoadView};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d819c549d7da3886220079b3f80daa1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d819c549d7da3886220079b3f80daa1b");
        } else {
            netInfoLoadView.setReloadButtonText(R.string.wm_sc_filter_reset);
            netInfoLoadView.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.filterbar.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "017267de44d1cbb31ab9a063dfb7f466", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "017267de44d1cbb31ab9a063dfb7f466");
                    } else if (a.this.b != null) {
                        a.this.b.a();
                    }
                }
            });
            netInfoLoadView.a(getContext().getString(R.string.wm_sc_home_filter_empty_tip), "", a(), R.drawable.wm_sc_home_filter_empty, false, "", "");
            netInfoLoadView.setBackgroundColor(Color.parseColor("#F5F5F5"));
        }
        this.c = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_0in8qcy0_mv", getView());
    }

    public final void a(@NonNull com.sankuai.waimai.store.param.a aVar, int i) {
        Object[] objArr = {aVar, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a0092fe1255c29882462642e38d1df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a0092fe1255c29882462642e38d1df");
            return;
        }
        this.d = aVar;
        this.c.a("category_code", Long.valueOf(aVar.c)).a("sec_cate_id", aVar.f);
        com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) getContext(), this.c);
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0595cbea85558b3dd38b46dc1e82dea9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0595cbea85558b3dd38b46dc1e82dea9");
        }
        if (o.l()) {
            try {
                ErrorCode errorCode = new ErrorCode(ErrorCode.ERROR_TYPE_B, "302", "41SD");
                String replace = com.sankuai.waimai.store.diting.a.a(errorCode, getContext().getApplicationContext()).b("28616").b.buildErrorCodeStr().replace('(', Constants.SPACE).replace(')', Constants.SPACE);
                com.sankuai.waimai.store.diting.a.a(errorCode);
                return replace;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
        return "";
    }
}
