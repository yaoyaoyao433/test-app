package com.sankuai.waimai.store.goods.detail.components.subroot.guesslike;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.b;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.platform.domain.manager.poi.a;
/* compiled from: ProGuard */
@Cube
/* loaded from: classes5.dex */
public class SGDetailGuessLikeTitleBlock extends j {
    public static ChangeQuickRedirect g;
    public TextView h;
    public b i;
    public a j;
    private LinearLayout k;

    public SGDetailGuessLikeTitleBlock(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3788f10e82688e08f5673322d02a717f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3788f10e82688e08f5673322d02a717f");
        } else {
            this.j = aVar;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87b030a128f0c48a94de870ee487c3f8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87b030a128f0c48a94de870ee487c3f8") : layoutInflater.inflate(R.layout.wm_sc_goods_list_mach_title, viewGroup, false);
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b6954972cc44339135d4827a69e4e18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b6954972cc44339135d4827a69e4e18");
            return;
        }
        super.a_(view);
        this.h = (TextView) view.findViewById(R.id.tv_title);
        this.k = (LinearLayout) view.findViewById(R.id.ll_container);
        if (view.getContext() instanceof SCBaseActivity) {
            this.i = new b("b_uzunod3r", view);
            com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) view.getContext(), this.i);
        }
    }
}
