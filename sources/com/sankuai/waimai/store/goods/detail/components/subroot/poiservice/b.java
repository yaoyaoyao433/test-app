package com.sankuai.waimai.store.goods.detail.components.subroot.poiservice;

import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    private final List<PoiServiceEntity> b;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90de1b34ef8051e95d6916d08a337de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90de1b34ef8051e95d6916d08a337de");
            return;
        }
        PoiServiceEntity poiServiceEntity = (PoiServiceEntity) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        Object[] objArr2 = {poiServiceEntity};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "0af7054e4e9c1c43883f4e74d1f6a387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "0af7054e4e9c1c43883f4e74d1f6a387");
        } else if (poiServiceEntity == null || poiServiceEntity.mPoiLabel == null) {
        } else {
            Poi.PoiImpressLabel poiImpressLabel = poiServiceEntity.mPoiLabel;
            u.a(aVar2.b, poiImpressLabel.mLabelText);
            u.a(aVar2.c, poiImpressLabel.labelDescText);
            if (aVar2.d != null) {
                if (TextUtils.isEmpty(poiImpressLabel.mLabelUrl)) {
                    aVar2.d.setVisibility(4);
                    return;
                }
                m.b(poiImpressLabel.mLabelUrl, ImageQualityUtil.a()).a(aVar2.d);
                aVar2.d.setVisibility(0);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbe209d8e2e0bbaaf49f2981c4edd5dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbe209d8e2e0bbaaf49f2981c4edd5dc");
        }
        if (i == 1) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_goods_detail_poi_service_dialog_list_item_last, viewGroup, false));
        }
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_goods_detail_poi_service_dialog_list_item, viewGroup, false));
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cd7d8b024cbb464afa092a6f93590d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cd7d8b024cbb464afa092a6f93590d1");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aabd55a704124172eb4297d4393aa8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aabd55a704124172eb4297d4393aa8c")).intValue();
        }
        PoiServiceEntity poiServiceEntity = (PoiServiceEntity) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (poiServiceEntity != null) {
            return poiServiceEntity.mShowType;
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9917cc81a463a82e0361473845e9b3c2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9917cc81a463a82e0361473845e9b3c2")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    public final void a(List<PoiServiceEntity> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f9b4ccbe930ebfa22db0cd1cef756a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f9b4ccbe930ebfa22db0cd1cef756a0");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            this.b.clear();
            this.b.addAll(list);
            notifyDataSetChanged();
        }
    }
}
