package com.sankuai.waimai.business.page.kingkong.view.servicelabels;

import android.arch.lifecycle.q;
import android.support.annotation.Keep;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.meituan.android.cube.pga.action.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.common.model.ChannelService;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ServiceLabelsBlock extends com.meituan.android.cube.pga.block.a<a, b, com.sankuai.waimai.business.page.kingkong.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fa58b91ee48cad45ca7a9ad67d0bd58", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fa58b91ee48cad45ca7a9ad67d0bd58") : new b(null);
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0698c3f76a1283c20a8eb6f60bad4df", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0698c3f76a1283c20a8eb6f60bad4df") : new a(l());
    }

    @Keep
    public ServiceLabelsBlock(com.sankuai.waimai.business.page.kingkong.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea9340f54b55cbed143274703179675c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea9340f54b55cbed143274703179675c");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15caf38a77dff8e9fe4ee5b05ee4e8bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15caf38a77dff8e9fe4ee5b05ee4e8bc");
        } else {
            ((com.sankuai.waimai.business.page.kingkong.a) F()).M.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.view.servicelabels.ServiceLabelsBlock.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.d
                public final Object a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a17c0cc197d01edc5c43ce1ee2e4a6f2", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a17c0cc197d01edc5c43ce1ee2e4a6f2");
                    }
                    com.sankuai.waimai.business.page.kingkong.net.b a2 = ((KingKongViewModel) q.a((FragmentActivity) ((KingKongActivity) ((com.sankuai.waimai.business.page.kingkong.a) ServiceLabelsBlock.this.F()).b())).a(KingKongViewModel.class)).b.a();
                    if (a2 != null && a2.a != null && a2.a.data != null && a2.a.data.shouldShowChannelService()) {
                        return Integer.valueOf(((a) ServiceLabelsBlock.this.g).e());
                    }
                    return 0;
                }
            };
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e11e87f49a6d6150f9287a3f08c7c757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e11e87f49a6d6150f9287a3f08c7c757");
            return;
        }
        super.I();
        a aVar = (a) this.g;
        ArrayList<ChannelService> e = ((b) this.n).e();
        char c = 1;
        Object[] objArr2 = {e};
        ChangeQuickRedirect changeQuickRedirect2 = a.d;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "97af8e841c0d1fba26500424fff7b535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "97af8e841c0d1fba26500424fff7b535");
        } else if (e == null || e.size() < 3) {
            aVar.a(false);
        } else {
            aVar.a(true);
            int i = 0;
            while (i < aVar.g.length) {
                b.C0608b c2 = com.sankuai.meituan.mtimageloader.loader.a.c();
                c2.c = e.get(i).icon;
                c2.a(aVar.e[i]);
                TextView textView = aVar.f[i];
                String str = e.get(i).desc;
                Object[] objArr3 = new Object[2];
                objArr3[0] = textView;
                objArr3[c] = str;
                ChangeQuickRedirect changeQuickRedirect3 = a.d;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b31ea0a1cfc4dee2db2ca6e362488c9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b31ea0a1cfc4dee2db2ca6e362488c9a");
                } else if (str.length() > 5) {
                    textView.setText(str.substring(0, 5) + "...");
                } else {
                    textView.setText(str);
                }
                i++;
                c = 1;
            }
        }
        ArrayList<ChannelService> e2 = ((b) this.n).e();
        Object[] objArr4 = {e2};
        ChangeQuickRedirect changeQuickRedirect4 = r;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dbcb5757c447b736ff49ff84d3c68677", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dbcb5757c447b736ff49ff84d3c68677");
        } else if (e2 == null || e2.size() < 3) {
        } else {
            ((com.sankuai.waimai.business.page.kingkong.a) F()).M.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.view.servicelabels.ServiceLabelsBlock.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.d
                public final Object a() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dd51207fe03d40eef07b0fb69fa95f50", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dd51207fe03d40eef07b0fb69fa95f50") : Integer.valueOf(((a) ServiceLabelsBlock.this.g).e());
                }
            };
        }
    }
}
