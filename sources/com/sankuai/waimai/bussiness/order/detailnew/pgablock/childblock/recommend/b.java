package com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.mach.e;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.RecommendModel;
import com.sankuai.waimai.bussiness.order.detailnew.util.g;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private String e;
    private String f;
    private e g;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_recommend_mach_container;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cffa488bf721213b509cc511d495f5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cffa488bf721213b509cc511d495f5b");
        } else {
            this.f = ListIDHelper.a.a.a("order", "order_detail_recommend_product");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa7e4ac52303ffa6be1715c9c0aba9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa7e4ac52303ffa6be1715c9c0aba9d");
            return;
        }
        super.b();
        ViewGroup viewGroup = (ViewGroup) this.b.findViewById(R.id.mach_container);
        Activity activity = (Activity) this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16c84fda76bf83c8b8dc8e8234c0a499", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16c84fda76bf83c8b8dc8e8234c0a499");
        } else if (this.c instanceof BaseActivity) {
            str = ((BaseActivity) this.c).w();
        } else {
            str = getClass().getSimpleName() + System.currentTimeMillis();
        }
        this.g = new e(activity, str, "c_hgowsqb");
        this.g.a(viewGroup, "order_detail_recommend", "waimai");
        this.b.setVisibility(8);
    }

    public final void a(RecommendModel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6f8d4d90902503f36b03b7a310dedb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6f8d4d90902503f36b03b7a310dedb");
        } else if (aVar == null) {
            e();
        } else {
            this.b.setVisibility(0);
            this.e = aVar.a;
            if (aVar.b != null && !TextUtils.isEmpty(aVar.b.b)) {
                com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.crossshoppurchase.a aVar2 = aVar.b;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4826ed0def4110092bf03c41dc6c044b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4826ed0def4110092bf03c41dc6c044b");
                } else if (this.b == 0 || aVar2 == null) {
                } else {
                    Map<String, Object> a = com.sankuai.waimai.mach.utils.b.a(aVar2.b);
                    e eVar = this.g;
                    String str = aVar2.a;
                    Object[] objArr3 = {str, a};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.base.mach.b.a;
                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "eb87c4514b1a44a45363d03abd7ac70e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "eb87c4514b1a44a45363d03abd7ac70e");
                    } else {
                        ((com.sankuai.waimai.bussiness.order.base.mach.b) eVar).c = false;
                        eVar.c(str, a);
                    }
                    this.g.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.b.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                        public final void e() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a1d4354fe126b230015e3a7607e877a3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a1d4354fe126b230015e3a7607e877a3");
                                return;
                            }
                            super.e();
                            g.a(b.this.b, com.sankuai.waimai.foundation.utils.g.a(b.this.c, 6.0f));
                        }
                    });
                }
            } else if (aVar.c != null && !TextUtils.isEmpty(aVar.c.stringData)) {
                RecommendModel.RecommendResponse recommendResponse = aVar.c;
                Object[] objArr4 = {recommendResponse};
                ChangeQuickRedirect changeQuickRedirect4 = d;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "400af7933befc692fd1344d7ee64ff97", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "400af7933befc692fd1344d7ee64ff97");
                } else if (this.b == 0 || recommendResponse == null || TextUtils.isEmpty(recommendResponse.stringData)) {
                } else {
                    Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(recommendResponse.stringData);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("order_id", this.e == null ? "" : this.e);
                    hashMap2.put("list_id", this.f == null ? "" : this.f);
                    hashMap.put("custom_env_vip_task", hashMap2);
                    this.g.a(recommendResponse.templateId, recommendResponse.defaultId, a2, hashMap);
                }
            } else {
                e();
            }
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4404c36a696fc029aa7337041208637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4404c36a696fc029aa7337041208637");
        } else {
            this.b.setVisibility(8);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e22fbe73f8f7afec390b4a168e8686b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e22fbe73f8f7afec390b4a168e8686b6");
        } else if (this.g != null) {
            this.g.e();
        }
    }
}
