package com.sankuai.waimai.business.page.kingkong.view.searchbox.searchboxinlist;

import android.support.annotation.Keep;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SearchBoxPlaceHolderBlock extends com.meituan.android.cube.pga.block.a<a, b, com.sankuai.waimai.business.page.kingkong.a> {
    public static ChangeQuickRedirect r;
    private View s;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e64ad922b6ba99524fee16bb28e8bba", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e64ad922b6ba99524fee16bb28e8bba") : new b(null);
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b636aefb4201b11b89100af02d6fcff", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b636aefb4201b11b89100af02d6fcff") : new a(l());
    }

    @Keep
    public SearchBoxPlaceHolderBlock(com.sankuai.waimai.business.page.kingkong.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f7664f7e8b6f06ecbb92f0a36268be3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f7664f7e8b6f06ecbb92f0a36268be3");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "516e1b8d85269ce6697dd4aa3b5d75d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "516e1b8d85269ce6697dd4aa3b5d75d0");
        } else {
            super.s();
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d73fa85f17a926db186ae284385b7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d73fa85f17a926db186ae284385b7b");
            return;
        }
        super.I();
        a aVar = (a) this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.d;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5338315fe4ebde15961bf47e6aa2c71c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5338315fe4ebde15961bf47e6aa2c71c");
        } else {
            KingkongInfo a = aVar.h.d.a();
            Boolean a2 = aVar.h.i.a();
            if (a != null && a.b == 910 && (a2 == null || !a2.booleanValue())) {
                aVar.e.setBackgroundColor(1358954495);
                ((TextView) aVar.f.getCurrentView()).setTextColor(-1);
                aVar.g.setImageResource(R.drawable.wm_common_ic_search_white);
            }
        }
        this.s = ((a) this.g).a().findViewById(R.id.head_search_box);
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.searchboxinlist.SearchBoxPlaceHolderBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f49e011668e54a516778726e975e13fa", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f49e011668e54a516778726e975e13fa");
                } else {
                    ((com.sankuai.waimai.business.page.kingkong.a) SearchBoxPlaceHolderBlock.this.F()).N.a((com.meituan.android.cube.pga.common.b<List<RecommendedSearchKeyword>>) null);
                }
            }
        });
    }
}
