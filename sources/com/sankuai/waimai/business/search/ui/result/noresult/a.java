package com.sankuai.waimai.business.search.ui.result.noresult;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.datatype.FilterNoResultRemindInfoData;
import com.sankuai.waimai.business.search.datatype.NoResultRemindInfoData;
import com.sankuai.waimai.foundation.utils.g;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.search.adapterdelegates.b<Serializable, C0871a> {
    public static ChangeQuickRedirect e;
    private float f;

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ RecyclerView.s a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "528f54a24817e23b1561d6520310fb24", RobustBitConfig.DEFAULT_VALUE) ? (C0871a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "528f54a24817e23b1561d6520310fb24") : new C0871a(layoutInflater.inflate(R.layout.wm_nox_filter_no_result, viewGroup, false), this.f);
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* synthetic */ void a(Object obj, @NonNull RecyclerView.s sVar, @NonNull int i) {
        Serializable serializable = (Serializable) obj;
        C0871a c0871a = (C0871a) sVar;
        Object[] objArr = {serializable, c0871a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46a7085bb8e19c2137b8df41e68163f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46a7085bb8e19c2137b8df41e68163f");
        } else {
            c0871a.a.a((NoResultRemindInfoData) ((FilterNoResultRemindInfoData) serializable), true);
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Object obj, @NonNull List list, int i) {
        return ((Serializable) obj) instanceof FilterNoResultRemindInfoData;
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea966c306858aae78e803ae10e13fde7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea966c306858aae78e803ae10e13fde7");
            return;
        }
        this.f = (((g.b(this.b) - g.e(this.b)) - this.b.getResources().getDimension(R.dimen.wm_nox_search_filter_bar_height)) - this.b.getResources().getDimension(R.dimen.wm_nox_search_action_bar_height)) - g.a(this.b, 42.0f);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.result.noresult.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0871a extends RecyclerView.s {
        public com.sankuai.waimai.business.search.ui.result.view.a a;

        public C0871a(View view, float f) {
            super(view);
            this.a = new com.sankuai.waimai.business.search.ui.result.view.a(view, R.id.search_abnormal_view);
            this.a.a(R.color.wm_nox_search_light_gray);
            View findViewById = view.findViewById(R.id.search_abnormal_view);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = (int) f;
            findViewById.setLayoutParams(layoutParams);
        }
    }
}
