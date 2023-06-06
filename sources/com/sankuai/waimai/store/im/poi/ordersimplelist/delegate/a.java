package com.sankuai.waimai.store.im.poi.ordersimplelist.delegate;

import android.app.Activity;
import android.app.Dialog;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.poi.model.IMServiceEvaluationInfo;
import com.sankuai.waimai.store.im.poi.ordersimplelist.b;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.am;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.im.poi.ordersimplelist.a {
    public static ChangeQuickRedirect a;
    public Activity b;
    b c;
    public Dialog d;
    String e;
    String f;
    public long g;
    public String h;
    public int i;
    public boolean j;
    public j<IMServiceEvaluationInfo> k;
    private com.sankuai.waimai.store.im.poi.listener.a l;
    private final String m;
    private final String n;
    private final String o;
    private final int p;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c31f1c23a9df97d33a3269afb1b1954", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c31f1c23a9df97d33a3269afb1b1954");
            return;
        }
        this.m = "SimpleListDialogDelegateImpl";
        this.n = "14060";
        this.o = "14090";
        this.p = 1;
        this.k = new j<IMServiceEvaluationInfo>() { // from class: com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "552960be23aa45a92e3035ce346b4d23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "552960be23aa45a92e3035ce346b4d23");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(IMServiceEvaluationInfo iMServiceEvaluationInfo) {
                IMServiceEvaluationInfo iMServiceEvaluationInfo2 = iMServiceEvaluationInfo;
                Object[] objArr2 = {iMServiceEvaluationInfo2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bf986434d1f077e4e8d7932511ced6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bf986434d1f077e4e8d7932511ced6c");
                } else if (a.this.b == null || a.this.b != com.sankuai.waimai.foundation.utils.activity.a.a().b()) {
                } else {
                    a aVar = a.this;
                    boolean z = a.this.j;
                    Object[] objArr3 = {iMServiceEvaluationInfo2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "6126e594d32a2c607afca75526d92a2a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "6126e594d32a2c607afca75526d92a2a");
                    } else if (iMServiceEvaluationInfo2 == null || aVar.b == null || com.sankuai.waimai.store.util.b.a(aVar.b)) {
                    } else {
                        if (iMServiceEvaluationInfo2.showMerchantEvaluate == 1) {
                            if (t.a(iMServiceEvaluationInfo2.scheme)) {
                                return;
                            }
                            d.a(aVar.b, iMServiceEvaluationInfo2.scheme);
                        } else if (z) {
                            am.a(aVar.b, aVar.b.getString(R.string.wm_sg_im_no_today_chat_to_business));
                        }
                    }
                }
            }
        };
    }

    public a(Activity activity, com.sankuai.waimai.store.im.poi.listener.a aVar, long j, String str, String str2, String str3) {
        Object[] objArr = {activity, aVar, new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb999f5b9c1187f5f92f1f810f8596a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb999f5b9c1187f5f92f1f810f8596a");
            return;
        }
        this.m = "SimpleListDialogDelegateImpl";
        this.n = "14060";
        this.o = "14090";
        this.p = 1;
        this.k = new j<IMServiceEvaluationInfo>() { // from class: com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "552960be23aa45a92e3035ce346b4d23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "552960be23aa45a92e3035ce346b4d23");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(IMServiceEvaluationInfo iMServiceEvaluationInfo) {
                IMServiceEvaluationInfo iMServiceEvaluationInfo2 = iMServiceEvaluationInfo;
                Object[] objArr2 = {iMServiceEvaluationInfo2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bf986434d1f077e4e8d7932511ced6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bf986434d1f077e4e8d7932511ced6c");
                } else if (a.this.b == null || a.this.b != com.sankuai.waimai.foundation.utils.activity.a.a().b()) {
                } else {
                    a aVar2 = a.this;
                    boolean z = a.this.j;
                    Object[] objArr3 = {iMServiceEvaluationInfo2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "6126e594d32a2c607afca75526d92a2a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "6126e594d32a2c607afca75526d92a2a");
                    } else if (iMServiceEvaluationInfo2 == null || aVar2.b == null || com.sankuai.waimai.store.util.b.a(aVar2.b)) {
                    } else {
                        if (iMServiceEvaluationInfo2.showMerchantEvaluate == 1) {
                            if (t.a(iMServiceEvaluationInfo2.scheme)) {
                                return;
                            }
                            d.a(aVar2.b, iMServiceEvaluationInfo2.scheme);
                        } else if (z) {
                            am.a(aVar2.b, aVar2.b.getString(R.string.wm_sg_im_no_today_chat_to_business));
                        }
                    }
                }
            }
        };
        this.b = activity;
        this.l = aVar;
        this.c = new b(this);
        this.g = j;
        this.h = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.sankuai.waimai.store.im.poi.ordersimplelist.a
    public final Activity a() {
        return this.b;
    }

    @Override // com.sankuai.waimai.store.im.poi.ordersimplelist.a
    public final com.sankuai.waimai.store.im.poi.listener.a c() {
        return this.l;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3cc0339f29d94690de368a19e71bff1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3cc0339f29d94690de368a19e71bff1");
        } else {
            com.sankuai.waimai.store.im.base.net.b.a("SimpleListDialogDelegateImpl").b(j, this.h, this.k);
        }
    }

    public final void a(int i, int i2) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ed32e1fff9cf52b6f56cb30da0aae8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ed32e1fff9cf52b6f56cb30da0aae8a");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6407a012954d4c6c1690ec6bf87e79ef", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6407a012954d4c6c1690ec6bf87e79ef")).booleanValue();
        } else if (i == 11 || i == 12 || i == 13 || i == 14 || i == 101) {
            z = true;
        }
        if (z) {
            com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_leydgtcv_mc").a("poi_id", Long.valueOf(this.g)).a("button_code", Integer.valueOf(i)).a("chat_type", 1).a("status", Integer.valueOf(i2)).a();
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.ordersimplelist.a
    public final int b() {
        return this.i;
    }
}
