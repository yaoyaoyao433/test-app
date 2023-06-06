package com.sankuai.waimai.store.im.poi.provider;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.im.poi.block.e;
import com.sankuai.waimai.store.im.poi.model.SGIMRobotReplyData;
import com.sankuai.waimai.store.im.poi.model.SGReceiveAddressData;
import com.sankuai.xm.im.message.bean.GeneralMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.im.base.b<SGReceiveAddressData> {
    public static ChangeQuickRedirect g;
    private String h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public TextView a;
        public TextView b;
        public com.sankuai.waimai.store.im.poi.block.e c;
    }

    @Override // com.sankuai.waimai.store.im.base.c
    public final int a() {
        return R.layout.wm_sc_common_im_auto_receive_address;
    }

    @Override // com.sankuai.waimai.store.im.base.b
    public final /* bridge */ /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable SGReceiveAddressData sGReceiveAddressData) {
        a2(view, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) bVar, sGReceiveAddressData);
    }

    @Override // com.sankuai.waimai.store.im.base.b, com.sankuai.waimai.store.im.base.c
    public final /* bridge */ /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable Object obj) {
        a2(view, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) bVar, (SGReceiveAddressData) obj);
    }

    public c(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, long j, String str) {
        super(aVar, null, j);
        Object[] objArr = {aVar, null, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd0aa282c2e453caf78891e6082db519", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd0aa282c2e453caf78891e6082db519");
        } else {
            this.h = str;
        }
    }

    @Override // com.sankuai.waimai.store.im.base.c, com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07bd3b06f9d2ea822b9af93316760dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07bd3b06f9d2ea822b9af93316760dcf");
        }
        View a2 = super.a(context, bVar, viewGroup);
        a2.setLayoutParams(new AbsListView.LayoutParams((com.sankuai.shangou.stone.util.h.a(context) - context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_66)) - context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_45), -2));
        a aVar = new a();
        aVar.a = (TextView) a2.findViewById(R.id.tv_im_auto_receive_address);
        aVar.b = (TextView) a2.findViewById(R.id.tv_im_auto_receive_copy_address);
        com.sankuai.waimai.store.im.poi.block.e eVar = new com.sankuai.waimai.store.im.poi.block.e(context, this.d);
        eVar.f = this.h;
        View findViewById = a2.findViewById(R.id.ll_praise_root);
        if (findViewById != null) {
            eVar.bindView(findViewById);
            aVar.c = eVar;
        }
        a2.setTag(aVar);
        return a2;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private void a2(View view, @NonNull final com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, @Nullable final SGReceiveAddressData sGReceiveAddressData) {
        Object[] objArr = {view, bVar, sGReceiveAddressData};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "330ae3c92e0927c8522dfea6466582d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "330ae3c92e0927c8522dfea6466582d5");
            return;
        }
        super.a(view, bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) sGReceiveAddressData);
        if (!(view.getTag() instanceof a) || sGReceiveAddressData == null) {
            return;
        }
        try {
            com.sankuai.waimai.store.manager.judas.b.b(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_rxp1wmug_mv").a();
        } catch (Throwable unused) {
        }
        final a aVar = (a) view.getTag();
        final GeneralMessage generalMessage = bVar.b;
        if (sGReceiveAddressData == null || sGReceiveAddressData.mAddressData == null) {
            return;
        }
        u.a(aVar.a, sGReceiveAddressData.mAddressData.poiAddress);
        if (aVar.c != null) {
            if (com.sankuai.waimai.store.im.util.b.a(generalMessage.getExtension())) {
                aVar.c.a(a(sGReceiveAddressData, generalMessage));
                aVar.c.h = new e.a() { // from class: com.sankuai.waimai.store.im.poi.provider.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.im.poi.block.e.a
                    public final void a(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e49a2a7f0f7798dcdfab1ad5081b436", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e49a2a7f0f7798dcdfab1ad5081b436");
                            return;
                        }
                        sGReceiveAddressData.robotPraiseOperation = i;
                        c.this.a(bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) sGReceiveAddressData);
                        aVar.c.a(c.this.a(sGReceiveAddressData, generalMessage));
                    }
                };
                return;
            }
            aVar.c.setVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SGIMRobotReplyData a(SGReceiveAddressData sGReceiveAddressData, GeneralMessage generalMessage) {
        Object[] objArr = {sGReceiveAddressData, generalMessage};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7edb9c947bd1b01d206ddc6c06900972", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGIMRobotReplyData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7edb9c947bd1b01d206ddc6c06900972");
        }
        SGIMRobotReplyData sGIMRobotReplyData = new SGIMRobotReplyData();
        sGIMRobotReplyData.mPoiId = this.b;
        sGIMRobotReplyData.msgId = generalMessage.getMsgId();
        sGIMRobotReplyData.robotPraiseOperation = sGReceiveAddressData.robotPraiseOperation;
        return sGIMRobotReplyData;
    }
}
