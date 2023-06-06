package com.sankuai.waimai.store.im.poi.provider;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.im.poi.block.e;
import com.sankuai.waimai.store.im.poi.model.SGIMRobotReplyData;
import com.sankuai.xm.im.message.bean.GeneralMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends com.sankuai.waimai.store.im.base.b<SGIMRobotReplyData> {
    public static ChangeQuickRedirect g;
    public String h;

    @Override // com.sankuai.waimai.store.im.base.c
    public final int a() {
        return R.layout.wm_sg_im_robot_relpy;
    }

    @Override // com.sankuai.waimai.store.im.base.b
    public final /* bridge */ /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable SGIMRobotReplyData sGIMRobotReplyData) {
        a2(view, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) bVar, sGIMRobotReplyData);
    }

    @Override // com.sankuai.waimai.store.im.base.b, com.sankuai.waimai.store.im.base.c
    public final /* bridge */ /* synthetic */ void a(View view, @NonNull com.sankuai.xm.imui.session.entity.b bVar, @Nullable Object obj) {
        a2(view, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) bVar, (SGIMRobotReplyData) obj);
    }

    public j(@Nullable com.sankuai.waimai.store.expose.v2.a aVar, @Nullable Bundle bundle, long j, String str) {
        super(aVar, null, j);
        Object[] objArr = {aVar, null, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0647aad9fe3e1e68ae27f0be38ec245", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0647aad9fe3e1e68ae27f0be38ec245");
        } else {
            this.h = str;
        }
    }

    @Override // com.sankuai.waimai.store.im.base.c, com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e13af2b8896a61f01cb6be46ef9c357", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e13af2b8896a61f01cb6be46ef9c357");
        }
        View a = super.a(context, bVar, viewGroup);
        com.sankuai.waimai.store.im.poi.block.f fVar = new com.sankuai.waimai.store.im.poi.block.f(context, this.h, this.d);
        fVar.bindView(a);
        a.setTag(fVar);
        return a;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private void a2(View view, @NonNull final com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, @Nullable final SGIMRobotReplyData sGIMRobotReplyData) {
        Object[] objArr = {view, bVar, sGIMRobotReplyData};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9fc79d34b5bc31dd4ca36a37ee5de79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9fc79d34b5bc31dd4ca36a37ee5de79");
            return;
        }
        super.a(view, bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) sGIMRobotReplyData);
        if (!(view.getTag() instanceof com.sankuai.waimai.store.im.poi.block.f) || sGIMRobotReplyData == null) {
            return;
        }
        final com.sankuai.waimai.store.im.poi.block.f fVar = (com.sankuai.waimai.store.im.poi.block.f) view.getTag();
        GeneralMessage generalMessage = bVar.b;
        sGIMRobotReplyData.msgId = generalMessage.getMsgId();
        sGIMRobotReplyData.mPoiId = this.b;
        if (fVar == null || t.a(sGIMRobotReplyData.content)) {
            return;
        }
        String extension = generalMessage.getExtension();
        fVar.a(new e.a() { // from class: com.sankuai.waimai.store.im.poi.provider.j.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.poi.block.e.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95fa65a2689d378d2da73139789c86d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95fa65a2689d378d2da73139789c86d8");
                    return;
                }
                sGIMRobotReplyData.robotPraiseOperation = i;
                j.this.a(bVar, (com.sankuai.xm.imui.session.entity.b<GeneralMessage>) sGIMRobotReplyData);
                com.sankuai.waimai.store.im.poi.block.f fVar2 = fVar;
                SGIMRobotReplyData sGIMRobotReplyData2 = sGIMRobotReplyData;
                Object[] objArr3 = {sGIMRobotReplyData2};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.im.poi.block.f.i;
                if (PatchProxy.isSupport(objArr3, fVar2, changeQuickRedirect3, false, "bd073007e54439a576eac423b66328d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, fVar2, changeQuickRedirect3, false, "bd073007e54439a576eac423b66328d3");
                    return;
                }
                fVar2.j = sGIMRobotReplyData2;
                if (sGIMRobotReplyData2 == null) {
                    return;
                }
                fVar2.a(sGIMRobotReplyData2.mPoiId, sGIMRobotReplyData2.msgId, sGIMRobotReplyData2.robotPraiseOperation);
            }
        });
        boolean a = com.sankuai.waimai.store.im.util.b.a(extension);
        Object[] objArr2 = {sGIMRobotReplyData, Byte.valueOf(a ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.poi.block.f.i;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "7c17fb75501e6d67c023ab0a048cbfef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "7c17fb75501e6d67c023ab0a048cbfef");
            return;
        }
        fVar.j = sGIMRobotReplyData;
        if (sGIMRobotReplyData == null) {
            return;
        }
        if (!t.a(sGIMRobotReplyData.content) && fVar.k != null) {
            fVar.k.setText(Html.fromHtml(sGIMRobotReplyData.content));
        }
        if (a) {
            fVar.a(sGIMRobotReplyData.mPoiId, sGIMRobotReplyData.msgId, sGIMRobotReplyData.robotPraiseOperation);
        } else {
            fVar.b();
        }
    }
}
