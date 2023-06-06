package com.sankuai.waimai.business.im.prepare;

import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.WmImCommonAdapter;
import com.sankuai.waimai.business.im.model.PoiImInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.imui.common.view.titlebar.DefaultTitleBarAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class i extends c {
    public static ChangeQuickRedirect s;

    @Override // com.sankuai.waimai.business.im.prepare.c
    public void a(SessionParams sessionParams) {
    }

    @Override // com.sankuai.waimai.business.im.prepare.a
    public String t() {
        return null;
    }

    @Override // com.sankuai.waimai.business.im.prepare.c
    public int u() {
        return 0;
    }

    public i(SessionFragment sessionFragment, SessionParams sessionParams) {
        super(sessionFragment, sessionParams);
        Object[] objArr = {sessionFragment, sessionParams};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "485813878393595d7c35716813006666", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "485813878393595d7c35716813006666");
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c
    public final void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d29314fe0ca3e0dd275ff18d3273c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d29314fe0ca3e0dd275ff18d3273c9");
        } else if (this.m == null || this.m.poiImStatus != 0) {
        } else {
            long b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) this.e, "poi_im_tip_insert_time_stamp", 0L);
            if (n.b().a() && DateUtils.isToday(b)) {
                return;
            }
            if (this.m != null) {
                a(this.m.tipMsg, true);
            }
            n.b().a(true);
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) this.e, "poi_im_tip_insert_time_stamp", System.currentTimeMillis());
        }
    }

    public final void a(Context context, long j, PoiImInfo poiImInfo) {
        Object[] objArr = {context, new Long(j), poiImInfo};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7122d8c9c6f71c532330961d99540c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7122d8c9c6f71c532330961d99540c5a");
        } else {
            a(context, j, "", poiImInfo);
        }
    }

    @Override // com.sankuai.waimai.business.im.prepare.c
    public final void a(Context context, long j, String str, PoiImInfo poiImInfo) {
        Object[] objArr = {context, new Long(j), str, poiImInfo};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "952f35e5728d1219f0fcd5c1b12a83b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "952f35e5728d1219f0fcd5c1b12a83b8");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poiId", j);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        bundle.putString("poiName", poiImInfo.poiName);
        com.sankuai.waimai.platform.shop.helper.a.a(context, poiImInfo.restaurantScheme, bundle);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576d2537184c82a3c66b2d6869d5ec4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576d2537184c82a3c66b2d6869d5ec4b");
            return;
        }
        com.sankuai.waimai.foundation.router.a.a(this.e, com.sankuai.waimai.foundation.router.interfaces.b.c + "/detail?spuid=" + j + "&wmpoiid=" + this.n + "&poi_id_str=" + this.o);
    }

    @Override // com.sankuai.waimai.business.im.chatpage.a, com.sankuai.waimai.business.im.chatpage.c
    public TitleBarAdapter g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea36fcfdfd7bdbf86b9b4e55ec8212e", RobustBitConfig.DEFAULT_VALUE) ? (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea36fcfdfd7bdbf86b9b4e55ec8212e") : new DefaultTitleBarAdapter();
    }

    @Override // com.sankuai.waimai.business.im.prepare.c, com.sankuai.waimai.business.im.prepare.a
    public ICommonAdapter w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "195aad5ada339256f791f9f6becb8567", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "195aad5ada339256f791f9f6becb8567") : new WmImCommonAdapter(super.w());
    }

    @Override // com.sankuai.waimai.business.im.common.contract.a
    public final Map<String, Object> a(String str, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebc1e3701c670099f986a6da535ba20e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebc1e3701c670099f986a6da535ba20e");
        }
        char c = 65535;
        if (str.hashCode() == 1045301049 && str.equals("im_feed_message_nox")) {
            c = 0;
        }
        if (c != 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.m.bizType);
        hashMap.put("biz_type", sb.toString());
        return hashMap;
    }
}
