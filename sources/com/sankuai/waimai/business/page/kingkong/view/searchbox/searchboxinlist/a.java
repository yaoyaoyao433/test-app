package com.sankuai.waimai.business.page.kingkong.view.searchbox.searchboxinlist;

import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.view.TextSwitchView;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    View e;
    TextSwitchView f;
    ImageView g;
    KingKongViewModel h;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_page_kingkong_searchbox_placeholder;
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ef0cb250f78f682207567d446f02de7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ef0cb250f78f682207567d446f02de7b");
        } else {
            aVar.b.setVisibility(z ? 0 : 4);
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979ced9d0ec34b30ea393f7b30c83a31", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979ced9d0ec34b30ea393f7b30c83a31");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "904c1900b890d211755ea259835cf701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "904c1900b890d211755ea259835cf701");
            return;
        }
        super.b();
        this.e = this.b.findViewById(R.id.head_search_box);
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            this.e.setVisibility(8);
            this.b.findViewById(R.id.privacy_place).setVisibility(0);
        } else {
            this.b.findViewById(R.id.privacy_place).setVisibility(8);
        }
        this.f = (TextSwitchView) this.e.findViewById(R.id.search_txt);
        this.g = (ImageView) this.e.findViewById(R.id.search_button);
        this.h = (KingKongViewModel) q.a((FragmentActivity) ((KingKongActivity) this.c)).a(KingKongViewModel.class);
        this.h.m.a((KingKongActivity) this.c, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.searchboxinlist.a.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                boolean z = true;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01895500af162294fdf9a0bbafa6a97e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01895500af162294fdf9a0bbafa6a97e");
                } else {
                    a.a(a.this, (bool2 == null || !bool2.booleanValue()) ? false : false);
                }
            }
        });
        this.h.n.a((KingKongActivity) this.c, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.searchboxinlist.a.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v2, types: [boolean, byte] */
            /* JADX WARN: Type inference failed for: r1v4 */
            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46ddece8aa9c98829d3bf6c4c6e95338", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46ddece8aa9c98829d3bf6c4c6e95338");
                    return;
                }
                a aVar = a.this;
                ?? r1 = (bool2 == null || !bool2.booleanValue()) ? 0 : 1;
                Object[] objArr3 = {Byte.valueOf((byte) r1)};
                ChangeQuickRedirect changeQuickRedirect3 = a.d;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "672d1e4c6fbd2b0049b37a8a5900cee7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "672d1e4c6fbd2b0049b37a8a5900cee7");
                } else {
                    aVar.e.setSelected(r1);
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bce91b1be9f1294548d036775feae26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bce91b1be9f1294548d036775feae26");
            return;
        }
        Boolean a = this.h.i.a();
        if (a == null || !a.booleanValue()) {
            return;
        }
        ((LinearLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = -g.a(com.meituan.android.singleton.b.a, 0.0f);
    }
}
