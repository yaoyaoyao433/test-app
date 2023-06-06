package com.sankuai.waimai.business.page.home.layer.remind;

import android.app.Activity;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.HomePagePoiListResponse;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.platform.widget.dialog.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect v;
    private ImageView A;
    private View w;
    private Activity x;
    private View y;
    private TextView z;

    public static /* synthetic */ void a(a aVar, HomePagePoiListResponse homePagePoiListResponse, boolean z) {
        Object[] objArr = {homePagePoiListResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6ca54e9ef29225b6fcff5fb35c1c29f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6ca54e9ef29225b6fcff5fb35c1c29f9");
        } else if (homePagePoiListResponse == null || d.a(homePagePoiListResponse.remindInfos)) {
        } else {
            View view = aVar.w;
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = v;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "947e70ecb1e5ab43c3aa85a3a24909c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "947e70ecb1e5ab43c3aa85a3a24909c0");
            } else {
                aVar.y = view.findViewById(R.id.layout_remind);
                aVar.z = (TextView) aVar.y.findViewById(R.id.txt_remind);
                aVar.A = (ImageView) aVar.y.findViewById(R.id.img_close);
            }
            b.a(homePagePoiListResponse.remindInfos, aVar.x, aVar.y, aVar.z, aVar.A, z);
        }
    }

    public a(Activity activity, View view) {
        Object[] objArr = {activity, view};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c4e97a768aff90ecea9ae5a136dcb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c4e97a768aff90ecea9ae5a136dcb6");
            return;
        }
        this.x = activity;
        this.w = view;
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        Object[] objArr2 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "481ce7c4896494def9bc48c466e48ce5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "481ce7c4896494def9bc48c466e48ce5");
        } else {
            ((RemindViewModel) q.a(fragmentActivity).a(RemindViewModel.class)).b.a(new l<Pair<HomePagePoiListResponse, Boolean>>() { // from class: com.sankuai.waimai.business.page.home.layer.remind.a.1
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Pair<HomePagePoiListResponse, Boolean> pair) {
                    Pair<HomePagePoiListResponse, Boolean> pair2 = pair;
                    Object[] objArr3 = {pair2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "af6244b3f9980919a3af8fc34bcfb029", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "af6244b3f9980919a3af8fc34bcfb029");
                    } else if (pair2 != null) {
                        a.a(a.this, (HomePagePoiListResponse) pair2.first, ((Boolean) pair2.second).booleanValue());
                    }
                }
            });
        }
    }
}
