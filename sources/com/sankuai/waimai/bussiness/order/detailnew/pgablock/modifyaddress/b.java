package com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.cube.pga.action.d;
import com.meituan.android.cube.pga.common.j;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.model.AddressBackInfo;
import com.sankuai.waimai.bussiness.order.detailnew.util.h;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.block.b<a, com.sankuai.waimai.bussiness.order.detailnew.a> implements h.a {
    public static ChangeQuickRedirect f;
    public com.sankuai.waimai.bussiness.order.detailnew.controller.a g;
    public com.sankuai.waimai.business.order.api.detail.block.a h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.a> {
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b5483bce849ad92ddb036345d523ae0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b5483bce849ad92ddb036345d523ae0") : new a();
    }

    public b(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d752c0f31eef0db745a9f55f7813bcb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d752c0f31eef0db745a9f55f7813bcb1");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183cee99f61d7969ee9bb5166e6ee969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183cee99f61d7969ee9bb5166e6ee969");
            return;
        }
        super.s();
        F().ai.a((j<h.a>) this);
        F().ag.b = new d<com.sankuai.waimai.bussiness.order.detailnew.network.response.a>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ com.sankuai.waimai.bussiness.order.detailnew.network.response.a a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a3406d64032d80cbe127c96f0675cbd", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.bussiness.order.detailnew.network.response.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a3406d64032d80cbe127c96f0675cbd");
                }
                if (((a) b.this.n).e() != null) {
                    return ((a) b.this.n).e().c;
                }
                return null;
            }
        };
        F().ah.b = new d<String>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99b9851b4ca18e8814a53aeabd219177", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99b9851b4ca18e8814a53aeabd219177");
                }
                if (((a) b.this.n).e() != null) {
                    return ((a) b.this.n).e().d;
                }
                return null;
            }
        };
        this.h = F().u.a().b;
        F().o.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar) {
                boolean z;
                b.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a18e5db14873dd01f2e174c483f2968", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a18e5db14873dd01f2e174c483f2968");
                } else if (aVar2 != null) {
                    int i = aVar2.a;
                    int i2 = aVar2.b;
                    Intent intent = aVar2.c;
                    if (i == 2040 && i2 == -1) {
                        boolean a2 = f.a(intent, "modify_type", false);
                        String str = "";
                        String str2 = "";
                        if (intent != null) {
                            str2 = f.a(intent, "resultData");
                            str = f.a(intent, "appId");
                        }
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && "be7dcad4cf774fed".equals(str)) {
                            try {
                                AddressBackInfo addressBackInfo = (AddressBackInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(str2, (Class<Object>) AddressBackInfo.class);
                                if (addressBackInfo != null) {
                                    a2 = addressBackInfo.modifyType;
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                        if (!a2) {
                            String a3 = f.a(intent, "resultData");
                            if (!TextUtils.isEmpty(a3)) {
                                try {
                                    z = new JSONObject(a3).optBoolean("modify_type");
                                } catch (JSONException e2) {
                                    e2.printStackTrace();
                                }
                                if (z || b.this.h == null) {
                                }
                                b.this.h.c(true);
                                return;
                            }
                        }
                        z = a2;
                        if (z) {
                        }
                    }
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c33f122f57c6ac1b26e9fa0ddaa4bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c33f122f57c6ac1b26e9fa0ddaa4bf");
            return;
        }
        super.I();
        ((a) this.n).e().b = F().Y.a().b;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.util.h.a
    public final void q() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e07bc6fd2bd52c861a62c9ca751546", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e07bc6fd2bd52c861a62c9ca751546");
            return;
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.a e = ((a) this.n).e();
        com.sankuai.waimai.bussiness.order.detailnew.network.response.a aVar = e.c;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "af43eade63754aac9fc9ff175f0fa7e9", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "af43eade63754aac9fc9ff175f0fa7e9")).booleanValue();
        } else {
            if (aVar != null) {
                if (aVar.f == com.sankuai.waimai.bussiness.order.detailnew.network.response.a.c) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            Bundle bundle = new Bundle();
            long a2 = r.a(e.e.b, 0L);
            if (a2 != 0) {
                bundle.putString(Constants.EventConstants.KEY_ORDER_ID, String.valueOf(a2));
                bundle.putString("poiId", String.valueOf(e.e.c));
                bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, e.e.d);
                com.sankuai.waimai.foundation.router.a.a(m(), com.sankuai.waimai.foundation.router.interfaces.c.ac, bundle, 2040);
                return;
            }
            return;
        }
        if (this.g == null) {
            this.g = new com.sankuai.waimai.bussiness.order.detailnew.controller.a(m(), e, e.b);
        }
        final com.sankuai.waimai.bussiness.order.detailnew.controller.a aVar2 = this.g;
        com.sankuai.waimai.bussiness.order.detailnew.network.response.a aVar3 = e.c;
        Object[] objArr3 = {aVar3, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.controller.a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "b8db90605e4a30b6ef431b0c843aae6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "b8db90605e4a30b6ef431b0c843aae6d");
            return;
        }
        Object[] objArr4 = {aVar3};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.detailnew.controller.a.a;
        if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "8874baf2ef084b5b1d3a34e384b38fa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "8874baf2ef084b5b1d3a34e384b38fa2");
        } else if (aVar3 == null) {
            aVar2.e.setVisibility(8);
        } else {
            aVar2.e.setVisibility(0);
            if (!TextUtils.isEmpty(aVar3.g)) {
                aVar2.f.setText(aVar3.g);
            }
            if (!TextUtils.isEmpty(aVar3.h)) {
                aVar2.g.setVisibility(0);
                aVar2.g.setText(aVar3.h);
            } else {
                aVar2.g.setVisibility(8);
            }
            aVar2.a(aVar2.c);
        }
        aVar2.k = new CustomDialog.a(aVar2.b).a(aVar2.j).b(R.string.cancel, (DialogInterface.OnClickListener) null).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.a.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr5 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bb363b66ac5489444f979f4f1c1b10c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bb363b66ac5489444f979f4f1c1b10c2");
                } else {
                    aVar2.k = null;
                }
            }
        }).c();
        JudasManualManager.b("b_2rpcnqg6").a("c_hgowsqb").a("contacttype", (aVar2.e.getVisibility() == 0 && aVar2.h.getVisibility() == 0 && aVar2.i.getVisibility() == 0) ? "1" : "2").a(aVar2.b).a();
    }
}
