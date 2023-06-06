package com.meituan.android.ptcommonim.pageadapter.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.ptcommonim.base.network.BaseApiRetrofitService;
import com.meituan.android.ptcommonim.base.network.model.BaseDataEntity;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.android.ptcommonim.model.PTTransformBean;
import com.meituan.android.ptcommonim.pageadapter.message.mach.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e extends com.sankuai.xm.imui.session.widget.d {
    public static ChangeQuickRedirect a;
    public SessionId b;
    public PTTransformBean c;
    private RelativeLayout j;
    private PTFrameMachContainer k;

    public static /* synthetic */ void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abfce6b97fa105295c3a4727a73a3820", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abfce6b97fa105295c3a4727a73a3820");
        }
    }

    public static /* synthetic */ void a(e eVar, PTFloatInfo pTFloatInfo) {
        com.meituan.android.ptcommonim.pageadapter.message.mach.f b;
        Object[] objArr = {pTFloatInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "66a59479b3138afc641997ace66c992f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "66a59479b3138afc641997ace66c992f");
            return;
        }
        Activity a2 = com.meituan.android.ptcommonim.utils.a.a(eVar.j);
        if (a2 == null || a2.isFinishing() || pTFloatInfo.detailInfo == null || pTFloatInfo.detailInfo.isEmpty()) {
            return;
        }
        eVar.k = new PTFrameMachContainer(a2);
        eVar.k.setOnClickListener(f.a());
        PTFrameMachContainer pTFrameMachContainer = eVar.k;
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "0fa3f00892c1caec2109c274b0a77764", RobustBitConfig.DEFAULT_VALUE)) {
            b = (com.meituan.android.ptcommonim.pageadapter.message.mach.f) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "0fa3f00892c1caec2109c274b0a77764");
        } else {
            f.a aVar = new f.a();
            aVar.a(new com.meituan.android.ptcommonim.base.mach.a());
            aVar.a(a2);
            aVar.d = new com.meituan.android.ptcommonim.pageadapter.message.mach.a(a2);
            aVar.a(new com.meituan.android.ptcommonim.bridge.b(a2));
            b = aVar.b(a2);
        }
        pTFrameMachContainer.setMachProxy(b);
        eVar.k.a(a2, pTFloatInfo.getMachInfo(), com.meituan.android.ptcommonim.utils.b.a(eVar.j.getContext(), pTFloatInfo.detailInfo));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(14);
        eVar.j.addView(eVar.k, layoutParams);
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Map<String, Object> hashMap;
        Map<String, Object> hashMap2;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e078f7cc7e3f5662fcc886c6a78aa431", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e078f7cc7e3f5662fcc886c6a78aa431");
        }
        this.j = new RelativeLayout(com.meituan.android.ptcommonim.utils.a.a(viewGroup));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = com.meituan.android.ptcommonim.base.util.a.a(12);
        this.j.setLayoutParams(layoutParams);
        com.meituan.android.ptcommonim.base.network.a a2 = com.meituan.android.ptcommonim.base.network.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1eb35525e5ec3cb958b356f698b50a40", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1eb35525e5ec3cb958b356f698b50a40");
        } else {
            hashMap = new HashMap<>(8);
            hashMap.put("appId", com.meituan.android.ptcommonim.protocol.env.a.b);
            hashMap.put("entranceSource", this.c.entranceSource);
        }
        Map<String, Object> map = hashMap;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d2c0db895164233a0352d950b25e5cc6", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap2 = (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d2c0db895164233a0352d950b25e5cc6");
        } else {
            hashMap2 = new HashMap<>(16);
            HashMap hashMap3 = new HashMap(8);
            hashMap3.put("channel", Short.valueOf(this.b.d()));
            hashMap3.put("chatID", Long.valueOf(this.b.b()));
            hashMap2.put("dxSessionInfo", hashMap3);
            if (!TextUtils.isEmpty(this.c.orderId)) {
                hashMap2.put(Constants.EventConstants.KEY_ORDER_ID, this.c.orderId);
            } else if (!TextUtils.isEmpty(this.c.productId)) {
                HashMap hashMap4 = new HashMap(8);
                hashMap4.put("productId", this.c.productId);
                hashMap4.put("skuId", this.c.skuId);
                hashMap4.put("merchantIdStr", this.c.merchantIdStr);
                hashMap2.put("productIdInfo", hashMap4);
            }
        }
        Object[] objArr4 = {map, hashMap2};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.ptcommonim.base.network.a.a;
        (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "0b4b4b8ba625e917b5e5327fc04fae2e", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "0b4b4b8ba625e917b5e5327fc04fae2e") : ((BaseApiRetrofitService) a2.b.a(BaseApiRetrofitService.class)).getPTFloatInfo(a2.b(map), hashMap2, a2.b())).a(new com.sankuai.meituan.retrofit2.f<BaseDataEntity<PTFloatInfo>>() { // from class: com.meituan.android.ptcommonim.pageadapter.widget.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<BaseDataEntity<PTFloatInfo>> call, Throwable th) {
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<BaseDataEntity<PTFloatInfo>> call, Response<BaseDataEntity<PTFloatInfo>> response) {
                Object[] objArr5 = {call, response};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a74a0e5630709e2eaa929d127d718cc8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a74a0e5630709e2eaa929d127d718cc8");
                } else if (response == null || !response.f() || response.e() == null || response.e().data == null) {
                } else {
                    e.a(e.this, response.e().data);
                }
            }
        });
        return this.j;
    }

    public static boolean a(Context context) {
        List<com.sankuai.xm.imui.common.widget.b> list;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "463533a8312eca577e9e539bc50b7495", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "463533a8312eca577e9e539bc50b7495")).booleanValue();
        }
        try {
            list = com.sankuai.xm.imui.session.b.b(context).d();
        } catch (Throwable unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list)) {
            return false;
        }
        boolean z = false;
        for (com.sankuai.xm.imui.common.widget.b bVar : list) {
            if (bVar instanceof e) {
                e eVar = (e) bVar;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "0be6884da4237e1672b5f6d803f34d70", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "0be6884da4237e1672b5f6d803f34d70");
                } else {
                    eVar.j.setVisibility(4);
                }
                z = true;
            }
        }
        return z;
    }
}
