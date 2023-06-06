package com.sankuai.waimai.business.page.home.factory;

import android.app.Activity;
import android.content.Context;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.base.activity.c;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.rebuild.mach.g;
import com.sankuai.waimai.touchmatrix.show.b;
import com.sankuai.waimai.touchmatrix.show.f;
import com.sankuai.waimai.touchmatrix.utils.e;
import com.sankuai.waimai.touchmatrix.views.ITMatrixView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements f {
    public static ChangeQuickRedirect a;
    public FuTiaoMatrixView b;

    public a(FuTiaoMatrixView fuTiaoMatrixView) {
        Object[] objArr = {fuTiaoMatrixView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "381e8f9192342e72a7607864b97b48c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "381e8f9192342e72a7607864b97b48c4");
        } else {
            this.b = fuTiaoMatrixView;
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.show.f
    public final ITMatrixView a(com.sankuai.waimai.touchmatrix.data.a aVar) {
        boolean z;
        a.C1348a b;
        a.c cVar;
        Map<String, String> Z_;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f20b308674255b33a394fb07cb3a7796", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITMatrixView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f20b308674255b33a394fb07cb3a7796");
        }
        if (this.b != null) {
            FuTiaoMatrixView fuTiaoMatrixView = this.b;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = FuTiaoMatrixView.a;
            if (PatchProxy.isSupport(objArr2, fuTiaoMatrixView, changeQuickRedirect2, false, "5548b558d515d67f3b4df5fb7be7a1d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fuTiaoMatrixView, changeQuickRedirect2, false, "5548b558d515d67f3b4df5fb7be7a1d3");
            } else {
                Activity activity = (Activity) fuTiaoMatrixView.getContext();
                fuTiaoMatrixView.e = aVar;
                try {
                    fuTiaoMatrixView.f = fuTiaoMatrixView.e.k.businessData.modules.get(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if ((activity instanceof c) && (Z_ = ((c) activity).Z_()) != null && !Z_.isEmpty() && com.sankuai.waimai.touchmatrix.utils.f.a() != null && !com.sankuai.waimai.touchmatrix.utils.f.a().isEmpty()) {
                    fuTiaoMatrixView.d = Z_.get("page_id");
                    fuTiaoMatrixView.c = com.sankuai.waimai.touchmatrix.utils.f.a().get(fuTiaoMatrixView.d);
                }
                fuTiaoMatrixView.b = new com.sankuai.waimai.touchmatrix.show.a(activity, activity instanceof BaseActivity ? ((BaseActivity) activity).w() : "");
                if (fuTiaoMatrixView.e != null && fuTiaoMatrixView.e.k.bizId != null && (b = com.sankuai.waimai.touchmatrix.a.a().b(fuTiaoMatrixView.e.k.bizId)) != null && (cVar = b.b) != null) {
                    fuTiaoMatrixView.b.t = cVar;
                }
                fuTiaoMatrixView.b.a(fuTiaoMatrixView.h);
                fuTiaoMatrixView.b.a(fuTiaoMatrixView, fuTiaoMatrixView.f.moduleId, "waimai");
                fuTiaoMatrixView.g = new b(fuTiaoMatrixView, fuTiaoMatrixView.getContext());
                com.sankuai.waimai.touchmatrix.show.a aVar2 = fuTiaoMatrixView.b;
                b bVar = fuTiaoMatrixView.g;
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.touchmatrix.show.a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "523fe5b4619b6fd0e13f0990f2276767", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "523fe5b4619b6fd0e13f0990f2276767");
                } else if (!aVar2.b.contains(bVar)) {
                    aVar2.b.add(bVar);
                }
                fuTiaoMatrixView.b.a(new com.sankuai.waimai.touchmatrix.views.a(fuTiaoMatrixView.c, AppUtil.generatePageInfoKey(activity), aVar.e(), aVar.f()));
                HashMap hashMap = new HashMap();
                hashMap.put("page_id", fuTiaoMatrixView.d);
                Context context = fuTiaoMatrixView.getContext();
                Object[] objArr4 = {context};
                ChangeQuickRedirect changeQuickRedirect4 = e.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e547bce8ff5a299438959cb719f9cc19", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e547bce8ff5a299438959cb719f9cc19")).booleanValue();
                } else if (e.b) {
                    z = e.c;
                } else if (context instanceof Activity) {
                    e.b = true;
                    e.c = true;
                    z = !e.a((Activity) context);
                    e.c = z;
                } else {
                    z = false;
                }
                hashMap.put("safe_area", z ? "1" : "0");
                com.sankuai.waimai.touchmatrix.show.a aVar3 = fuTiaoMatrixView.b;
                Object[] objArr5 = {hashMap};
                ChangeQuickRedirect changeQuickRedirect5 = g.f;
                if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "dd445e3aa5452a5028dd5b595e7b1998", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "dd445e3aa5452a5028dd5b595e7b1998");
                } else if (!com.sankuai.waimai.mach.utils.e.a(hashMap)) {
                    aVar3.u.clear();
                    aVar3.u.putAll(hashMap);
                }
            }
            return this.b;
        }
        return null;
    }
}
