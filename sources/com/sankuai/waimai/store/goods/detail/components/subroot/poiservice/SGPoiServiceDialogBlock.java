package com.sankuai.waimai.store.goods.detail.components.subroot.poiservice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Cube
/* loaded from: classes5.dex */
public class SGPoiServiceDialogBlock extends com.sankuai.waimai.store.cube.a {
    public static ChangeQuickRedirect h;
    private RecyclerView i;
    private TextView j;
    private TextView k;
    private b l;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    public SGPoiServiceDialogBlock(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31528f83e98124225033b4ffc1dfad9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31528f83e98124225033b4ffc1dfad9e");
        }
    }

    @Override // com.sankuai.waimai.store.cube.a
    public final void b(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21a8cdfd550032003c9d4a6e46983797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21a8cdfd550032003c9d4a6e46983797");
            return;
        }
        this.i = (RecyclerView) a(R.id.wm_sc_goods_detail_poi_service_dialog_rv_list);
        this.j = (TextView) a(R.id.wm_sc_goods_detail_poi_service_dialog_tv_title);
        this.j.setText(m().getResources().getString(R.string.wm_sc_detail_poi_service_title));
        this.k = (TextView) a(R.id.wm_sc_goods_detail_poi_service_dialog_tv_close);
        this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.poiservice.SGPoiServiceDialogBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7100491cceec81288b48b395c9ce18e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7100491cceec81288b48b395c9ce18e");
                } else {
                    SGPoiServiceDialogBlock.this.s();
                }
            }
        });
        this.i.setLayoutManager(new LinearLayoutManager(m()));
        this.l = new b();
        this.i.setAdapter(this.l);
    }

    @Override // com.sankuai.waimai.store.cube.a
    public final void a(Window window) {
        Object[] objArr = {window};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ce818de24d9ff2c62fec87b92eedf84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ce818de24d9ff2c62fec87b92eedf84");
            return;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, (int) (displayMetrics.heightPixels * 0.6d));
        window.setGravity(80);
        decorView.setPadding(0, 0, 0, 0);
        decorView.setBackgroundResource(R.color.transparent);
    }

    public final void a(List<Poi.PoiImpressLabel> list, List<Poi.PoiImpressLabel> list2, a aVar) {
        Object[] objArr = {list, list2, aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1738839a652adca3a1a714d27c40f394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1738839a652adca3a1a714d27c40f394");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        for (int i = 0; i < a2; i++) {
            arrayList.add(new PoiServiceEntity(list.get(i), 0));
        }
        int a3 = com.sankuai.shangou.stone.util.a.a((List) list2);
        for (int i2 = 0; i2 < a3; i2++) {
            arrayList.add(new PoiServiceEntity(list2.get(i2), 1));
        }
        if (!arrayList.isEmpty() && r()) {
            this.l.a(arrayList);
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
