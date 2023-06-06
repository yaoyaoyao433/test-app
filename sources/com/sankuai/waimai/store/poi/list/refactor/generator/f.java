package com.sankuai.waimai.store.poi.list.refactor.generator;

import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.repository.model.BaseTileNew;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends c<List<BaseCard>> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.param.a e;

    public f(@NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "552cd274882c80b6e2fa09c5870f5b3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "552cd274882c80b6e2fa09c5870f5b3a");
        } else {
            this.e = ((PoiPageViewModel) q.a(fragmentActivity).a(PoiPageViewModel.class)).d.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0335 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.sankuai.waimai.store.assembler.component.BaseCard> a(@android.support.annotation.NonNull com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse r19) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.refactor.generator.f.a(com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse):java.util.List");
    }

    private boolean b(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        BaseTileNew<BaseModuleDesc, Object> searchTipsBlocks;
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c59be17de22581e460721f236a7ac040", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c59be17de22581e460721f236a7ac040")).booleanValue();
        }
        if (poiVerticalityDataResponse != null && poiVerticalityDataResponse.getSearchTipsBlocks() != null && (searchTipsBlocks = poiVerticalityDataResponse.getSearchTipsBlocks()) != null && searchTipsBlocks.data != null && searchTipsBlocks.data.jsonData != null && searchTipsBlocks.data.jsonData.get("search_keyword") != null) {
            Object obj = searchTipsBlocks.data.jsonData.get("search_keyword");
            if ((obj instanceof ArrayList) && ((ArrayList) obj).size() > 0) {
                return true;
            }
        }
        return false;
    }
}
