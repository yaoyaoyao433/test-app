package com.sankuai.waimai.business.search.ui.result.pouch;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.util.k;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.pouch.a;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.sankuai.waimai.platform.base.a<PouchDynamicAd, Nullable> {
    public static ChangeQuickRedirect a;
    int b;
    ViewGroup c;
    int d;
    Map<String, Object> e;
    public com.sankuai.waimai.pouch.a f;
    private String h;
    private PouchDynamicAd i;

    public f(@NonNull Context context, Fragment fragment) {
        super(context);
        Object[] objArr = {context, fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9320dfc5a3eac1c6f42e4b6263a9b00a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9320dfc5a3eac1c6f42e4b6263a9b00a");
            return;
        }
        this.b = 0;
        this.h = AppUtil.generatePageInfoKey(fragment.getActivity());
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a2d11b9cd019757160744d65e7b7f45", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a2d11b9cd019757160744d65e7b7f45");
        }
        this.c = new FrameLayout(this.y);
        this.c.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.c.setMinimumHeight(1);
        return this.c;
    }

    @Override // com.sankuai.waimai.platform.base.a
    public final void a(int i, @NonNull final PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {Integer.valueOf(i), pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc29ded0dd3927ae5512f856b74e025d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc29ded0dd3927ae5512f856b74e025d");
        } else if (this.b == 0 && com.sankuai.waimai.ad.gray.c.a()) {
            this.f = pouchDynamicAd.getPouchAds();
            if (this.f != null) {
                if (this.f.b() != null && this.f.b().getCustomEnvParams() != null) {
                    this.f.b().getCustomEnvParams().put("index", Integer.valueOf(pouchDynamicAd.index));
                    this.f.b().synchronizeEnvironment();
                }
                this.f.a(this.c, pouchDynamicAd);
                this.f.f = new com.sankuai.waimai.pouch.view.c() { // from class: com.sankuai.waimai.business.search.ui.result.pouch.f.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.pouch.view.c
                    public final void a() {
                    }

                    @Override // com.sankuai.waimai.pouch.view.c
                    public final void b() {
                    }

                    @Override // com.sankuai.waimai.pouch.view.c
                    public final void c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "edd9bad52839cd090aa49f138377ad11", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "edd9bad52839cd090aa49f138377ad11");
                        } else {
                            f.this.c.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.pouch.f.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4444e6793c92a44e292854f4430d44b0", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4444e6793c92a44e292854f4430d44b0");
                                    } else {
                                        b.a(pouchDynamicAd);
                                    }
                                }
                            }, 500L);
                        }
                    }
                };
            }
        } else if (this.i != pouchDynamicAd) {
            if (this.b == 2) {
                int a2 = g.a(f(), 6.0f);
                int a3 = g.a(f(), 12.0f);
                this.c.setPadding(a3, 0, a3, a2);
            } else {
                this.c.setPadding(0, 0, 0, 0);
            }
            com.sankuai.waimai.pouch.model.c cVar = new com.sankuai.waimai.pouch.model.c();
            cVar.b = "c_nfqbfvw";
            cVar.e = "search_nox";
            HashMap hashMap = new HashMap();
            hashMap.put("use_pouch", "1");
            hashMap.put("index", Integer.valueOf(pouchDynamicAd.index));
            SearchShareData a4 = SearchShareData.a(f());
            if (a4 != null) {
                hashMap.put("no_result_scene", com.sankuai.waimai.business.search.statistics.c.a(a4));
                hashMap.put("no_delivery_scene", com.sankuai.waimai.business.search.statistics.c.b(a4));
                hashMap.put("mixed_mode", com.sankuai.waimai.business.search.statistics.c.a(a4, 7));
                hashMap.put("is_filter_result", k.a(a4));
                hashMap.put("sort_type", Integer.valueOf(a4.R));
                hashMap.put("filter_codes", a4.S == null ? "0" : a4.S);
                hashMap.put("search_log_id", a4.l);
                hashMap.put("qw_type_id", a4.e);
                hashMap.put("label_word", a4.h);
                hashMap.put("template_type", Integer.valueOf(a4.y));
                hashMap.put("keyword", a4.g);
                hashMap.put("stid", a4.d);
                hashMap.put("search_trace_info", a4.ad);
                hashMap.put("cat_id", Integer.valueOf(a4.w));
            }
            cVar.h = hashMap;
            a.C1112a c1112a = new a.C1112a();
            if (this.b != 1) {
                if (this.b == 2) {
                    c1112a.e = new e(this.h);
                }
            } else {
                c1112a.e = new d(this.h, this.d, this.e);
            }
            if (this.f != null) {
                this.f.f();
            }
            c1112a.c = this.c;
            c1112a.b = f();
            c1112a.d = cVar;
            this.f = c1112a.a();
            pouchDynamicAd.setPouchAds(this.f);
            this.f.f = new com.sankuai.waimai.pouch.view.c() { // from class: com.sankuai.waimai.business.search.ui.result.pouch.f.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.pouch.view.c
                public final void a() {
                }

                @Override // com.sankuai.waimai.pouch.view.c
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "362f0a6006acf8909bb378fdec210d87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "362f0a6006acf8909bb378fdec210d87");
                    } else {
                        f.this.c.setVisibility(8);
                    }
                }

                @Override // com.sankuai.waimai.pouch.view.c
                public final void c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7324d35d4baa7eecfb7d2db17f396e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7324d35d4baa7eecfb7d2db17f396e6");
                        return;
                    }
                    DisplayMetrics displayMetrics = f.this.f().getResources().getDisplayMetrics();
                    f.this.f.a(new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels));
                    f.this.f.a(b.b, pouchDynamicAd.stringData);
                    f.this.c.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.pouch.f.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6775f0b0bff7fd5dbd15414398f96ae9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6775f0b0bff7fd5dbd15414398f96ae9");
                            } else {
                                b.a(pouchDynamicAd);
                            }
                        }
                    }, 500L);
                }
            };
            this.f.a(pouchDynamicAd);
            this.i = pouchDynamicAd;
        }
    }
}
