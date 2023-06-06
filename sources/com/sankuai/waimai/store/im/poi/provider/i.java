package com.sankuai.waimai.store.im.poi.provider;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.im.poi.model.SGIMRelatedCouponListData;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends com.sankuai.waimai.store.im.base.c<SGIMRelatedCouponListData> {
    public static ChangeQuickRedirect a;
    private boolean b;
    private int g;
    private UserGroupImInfo h;
    private String i;

    @Override // com.sankuai.waimai.store.im.base.c
    public final int a() {
        return R.layout.wm_sg_common_im_related_coupon;
    }

    @Override // com.sankuai.waimai.store.im.base.c
    public final /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable SGIMRelatedCouponListData sGIMRelatedCouponListData) {
        SGIMRelatedCouponListData sGIMRelatedCouponListData2 = sGIMRelatedCouponListData;
        Object[] objArr = {view, bVar, sGIMRelatedCouponListData2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d392fc3c0acbc97be8149af4df7b1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d392fc3c0acbc97be8149af4df7b1d");
        } else if (view.getTag() instanceof com.sankuai.waimai.store.im.poi.block.d) {
            com.sankuai.waimai.store.im.poi.block.d dVar = (com.sankuai.waimai.store.im.poi.block.d) view.getTag();
            sGIMRelatedCouponListData2.msgId = String.valueOf(((GeneralMessage) bVar.b).getMsgId());
            if (dVar == null || sGIMRelatedCouponListData2.mCouponInfo == null) {
                return;
            }
            Object[] objArr2 = {sGIMRelatedCouponListData2, bVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.poi.block.d.g;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "a19a1b3dfd15a4a018ee0a4b625c9ee3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "a19a1b3dfd15a4a018ee0a4b625c9ee3");
            } else if (sGIMRelatedCouponListData2 == null || sGIMRelatedCouponListData2.mCouponInfo == null || com.sankuai.shangou.stone.util.a.b(sGIMRelatedCouponListData2.mCouponInfo.couponList)) {
            } else {
                dVar.i = sGIMRelatedCouponListData2;
                com.sankuai.waimai.store.im.poi.adapter.c cVar = dVar.h;
                ArrayList<SGIMRelatedCouponListData.CouponInfo.CouponItem> arrayList = sGIMRelatedCouponListData2.mCouponInfo.couponList;
                Object[] objArr3 = {arrayList, sGIMRelatedCouponListData2, bVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.im.poi.adapter.c.c;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "cd2959bc517d228fba64daab32f600b3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "cd2959bc517d228fba64daab32f600b3");
                } else {
                    cVar.d.clear();
                    cVar.f = sGIMRelatedCouponListData2;
                    cVar.g = bVar;
                    if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                        cVar.d.addAll(arrayList);
                    }
                    cVar.notifyDataSetChanged();
                }
                SGIMRelatedCouponListData.CouponInfo couponInfo = sGIMRelatedCouponListData2.mCouponInfo;
                Object[] objArr4 = {couponInfo};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.im.poi.block.d.g;
                if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "c952c704bb0782c7591ee24cc7b4eb38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "c952c704bb0782c7591ee24cc7b4eb38");
                } else if (dVar.k == null || dVar.j == null) {
                } else {
                    if (!t.a(couponInfo.couponTip)) {
                        u.a(dVar.k, couponInfo.couponTip);
                    }
                    if (t.a(couponInfo.couponDesc)) {
                        return;
                    }
                    u.a(dVar.j, couponInfo.couponDesc);
                }
            }
        }
    }

    public i(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, boolean z, int i, String str) {
        super(aVar, bundle);
        Object[] objArr = {aVar, bundle, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fb00ff9cd80dfb50bc5d307dba6e71a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fb00ff9cd80dfb50bc5d307dba6e71a");
            return;
        }
        this.b = z;
        this.g = i;
        this.h = com.sankuai.waimai.store.im.util.b.a(bundle);
        this.i = str;
    }

    @Override // com.sankuai.waimai.store.im.base.c, com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07c200631c4a84adbfac429e684e33b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07c200631c4a84adbfac429e684e33b8");
        }
        View a2 = super.a(context, bVar, viewGroup);
        com.sankuai.waimai.store.im.poi.block.d dVar = new com.sankuai.waimai.store.im.poi.block.d(context, this.d, this.b);
        dVar.b(this.g);
        dVar.f = this.i;
        dVar.a(this.h);
        dVar.bindView(a2.findViewById(R.id.wm_sg_related_coupon_root));
        a2.setTag(dVar);
        return a2;
    }
}
