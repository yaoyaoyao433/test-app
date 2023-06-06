package com.sankuai.waimai.business.restaurant.goodsdetail.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.i;
import com.meituan.android.mrn.engine.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.business.restaurant.goodsdetail.GoodDetailActivity;
import com.sankuai.waimai.foundation.core.service.poi.b;
import com.sankuai.waimai.platform.domain.core.order.a;
import com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GoodsDetailRNFragment extends WMRNBaseFragment {
    public static ChangeQuickRedirect a;
    private long b;
    private b c;

    public GoodsDetailRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6915331bfbf3e252624bd67e6f3b5c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6915331bfbf3e252624bd67e6f3b5c1");
        } else {
            this.c = new com.sankuai.waimai.platform.domain.manager.poi.b() { // from class: com.sankuai.waimai.business.restaurant.goodsdetail.fragments.GoodsDetailRNFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.core.service.poi.b
                public final void a(String str, String str2) {
                }

                @Override // com.sankuai.waimai.foundation.core.service.poi.b
                public final void a(String str, String str2, long j) {
                }

                @Override // com.sankuai.waimai.foundation.core.service.poi.b
                public final void a(String str, String str2, long j, boolean z) {
                }

                @Override // com.sankuai.waimai.foundation.core.service.poi.b
                public final void a(String str, List<a> list) {
                }

                @Override // com.sankuai.waimai.foundation.core.service.poi.b
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae570690dd1087de1eac39f6344e1e41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae570690dd1087de1eac39f6344e1e41");
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("poiId", String.valueOf(com.sankuai.waimai.platform.domain.core.poi.b.a(str)));
                    createMap.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
                    GoodsDetailRNFragment.a(GoodsDetailRNFragment.this, "refreshPage", createMap);
                }

                @Override // com.sankuai.waimai.platform.domain.manager.poi.b
                public final boolean a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "311cc74d19a1545322092c013d0dbdd7", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "311cc74d19a1545322092c013d0dbdd7")).booleanValue();
                    }
                    if (GoodsDetailRNFragment.this.getActivity() instanceof GoodDetailActivity) {
                        GoodDetailActivity goodDetailActivity = (GoodDetailActivity) GoodsDetailRNFragment.this.getActivity();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = GoodDetailActivity.a;
                        if (PatchProxy.isSupport(objArr3, goodDetailActivity, changeQuickRedirect3, false, "8a541c9fcdd67d62d69182fb435a81f9", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr3, goodDetailActivity, changeQuickRedirect3, false, "8a541c9fcdd67d62d69182fb435a81f9")).booleanValue();
                        }
                        if (goodDetailActivity.k) {
                            goodDetailActivity.finish();
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
            };
        }
    }

    public static /* synthetic */ void a(GoodsDetailRNFragment goodsDetailRNFragment, String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, goodsDetailRNFragment, changeQuickRedirect, false, "c1cda1e2f79ad47ed5bc7e1b17d508d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, goodsDetailRNFragment, changeQuickRedirect, false, "c1cda1e2f79ad47ed5bc7e1b17d508d5");
            return;
        }
        try {
            n.a(goodsDetailRNFragment.o(), str, writableMap);
        } catch (Exception unused) {
        }
    }

    public static GoodsDetailRNFragment p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22c258f970bc8b05a974903aa21f6bb9", RobustBitConfig.DEFAULT_VALUE) ? (GoodsDetailRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22c258f970bc8b05a974903aa21f6bb9") : new GoodsDetailRNFragment();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final List<i> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1445ed6283f635b4c09bb6c853ea2c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1445ed6283f635b4c09bb6c853ea2c6");
        }
        List<i> d = super.d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.sankuai.waimai.business.restaurant.goodsdetail.module.b());
        if (d != null) {
            arrayList.addAll(d);
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb6dfe0fc26a40443ad7e302a56f72e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb6dfe0fc26a40443ad7e302a56f72e");
            return;
        }
        super.onCreate(bundle);
        this.b = System.currentTimeMillis();
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "048434f082db9748caa5d89f595239e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "048434f082db9748caa5d89f595239e6");
            return;
        }
        super.onViewCreated(view, bundle);
        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(this.c);
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c9db89da95f0c68cc91aee956d4608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c9db89da95f0c68cc91aee956d4608");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.platform.domain.manager.poi.a.a().b(this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri m() {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.goodsdetail.fragments.GoodsDetailRNFragment.m():android.net.Uri");
    }
}
