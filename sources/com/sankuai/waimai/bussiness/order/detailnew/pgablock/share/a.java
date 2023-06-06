package com.sankuai.waimai.bussiness.order.detailnew.pgablock.share;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.b;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.view.a implements com.sankuai.waimai.foundation.core.service.share.listener.a, com.sankuai.waimai.foundation.core.service.share.listener.b {
    public static ChangeQuickRedirect d;
    b e;
    private ImageView f;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_share_icon;
    }

    public a(Context context, @Nullable ViewStub viewStub) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05736ac3601e8b3fd372292ec862b17a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05736ac3601e8b3fd372292ec862b17a");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adc02bd20a18186e7673b50ada1df9cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adc02bd20a18186e7673b50ada1df9cb");
            return;
        }
        super.b();
        this.f = (ImageView) this.b.findViewById(R.id.txt_share_order);
    }

    public final void a(final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b624c7a0c088a3c7a98fb379c7eabc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b624c7a0c088a3c7a98fb379c7eabc9");
        } else if (bVar == null) {
        } else {
            this.e = bVar;
            final b.a aVar = bVar.e;
            if (aVar != null && com.sankuai.waimai.foundation.utils.b.a(aVar.a)) {
                this.f.setVisibility(0);
                this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.share.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShareTip shareTip;
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fdea344432a4c4929ca2b5bfb65fe49", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fdea344432a4c4929ca2b5bfb65fe49");
                            return;
                        }
                        JudasManualManager.a("b_waimai_qmo8t448_mc").a("c_hgowsqb").a("poi_id", i.a(a.this.e.c, a.this.e.d)).a("order_id", a.this.e.b).a(a.this.c).a();
                        try {
                            a.this.a(aVar.a, Long.parseLong(bVar.b));
                            Activity activity = (Activity) a.this.c;
                            a aVar2 = a.this;
                            b.a aVar3 = aVar;
                            Object[] objArr3 = {aVar3};
                            ChangeQuickRedirect changeQuickRedirect3 = a.d;
                            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "344a5ba07a0765d36ac14380717fb2a9", RobustBitConfig.DEFAULT_VALUE)) {
                                shareTip = (ShareTip) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "344a5ba07a0765d36ac14380717fb2a9");
                            } else {
                                shareTip = new ShareTip();
                                shareTip.channels = aVar3.a;
                                shareTip.setIcon(aVar3.g);
                                shareTip.miniProgramId = aVar3.f;
                                shareTip.getClass();
                                shareTip.shareInfo = new ShareTip.ShareInfo();
                                shareTip.shareInfo.icon = aVar3.g;
                                shareTip.shareInfo.weixinUrl = aVar3.h;
                                shareTip.setWeixinUrl(aVar3.h);
                                shareTip.setContent(aVar3.j);
                                shareTip.setUrl(aVar3.i);
                                shareTip.setTitle(aVar3.b);
                                shareTip.setCid("c_hgowsqb");
                                if (com.sankuai.waimai.foundation.core.a.c()) {
                                    shareTip.setMiniprogramType(0);
                                } else {
                                    shareTip.setMiniprogramType(2);
                                }
                            }
                            com.sankuai.waimai.share.b.a(activity, shareTip, a.this, a.this, (Bundle) null);
                        } catch (Exception e) {
                            com.sankuai.waimai.foundation.utils.log.a.e("ShareAppUtill-showShare", e.getMessage(), new Object[0]);
                        }
                    }
                });
                JudasManualManager.b("b_waimai_qmo8t448_mv").a("c_hgowsqb").a("poi_id", i.a(bVar.c, bVar.d)).a("order_id", bVar.b).a(this.c).a();
                return;
            }
            this.f.setVisibility(8);
        }
    }

    public final void a(List<Integer> list, long j) {
        int i = 2;
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "375de4c7131d6df45014f7f6daba354f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "375de4c7131d6df45014f7f6daba354f");
        } else if (list != null) {
            for (Integer num : list) {
                int intValue = num.intValue();
                Object[] objArr2 = new Object[i];
                objArr2[0] = Integer.valueOf(intValue);
                objArr2[1] = new Long(j);
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e22156b1d7e58713790d8b3067490e97", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e22156b1d7e58713790d8b3067490e97");
                } else {
                    if (intValue != 1 && intValue != 2) {
                    }
                    if (com.sankuai.waimai.share.b.a((Activity) this.c)) {
                        JudasManualManager.b("b_eIBhM").a("channel_id", intValue).a("orderid", j).a("c_hgowsqb").a(this.c).a();
                    }
                }
                i = 2;
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.share.listener.a
    public final void a(int i) {
        long j;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87cc11eccbaa82b55b5c6a276bac0211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87cc11eccbaa82b55b5c6a276bac0211");
            return;
        }
        try {
            j = Long.parseLong(this.e.b);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("ShareAppUtill-selectShareChannel", e.getMessage(), new Object[0]);
            j = 0;
        }
        if (this.e == null || j <= 0) {
            return;
        }
        JudasManualManager.a("b_SAAAL").a("orderid", this.e.b).a("channel_id", i).a("c_hgowsqb").a(this.c).a();
    }

    @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c01b6d81523b0ee318c750b2279f8c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c01b6d81523b0ee318c750b2279f8c8");
        } else if (i2 == 2) {
            ae.a((Activity) this.c, this.c.getString(R.string.wm_order_detail_share_fail));
        }
    }
}
