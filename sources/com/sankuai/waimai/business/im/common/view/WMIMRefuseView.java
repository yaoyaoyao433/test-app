package com.sankuai.waimai.business.im.common.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.android.ptcommonim.pageadapter.message.view.PTIMAbstractRefuseView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.b;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMIMRefuseView extends PTIMAbstractRefuseView {
    public static ChangeQuickRedirect b;
    private String e;
    private String f;

    public WMIMRefuseView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e234ddf9feb0d022d081f024eb30ad0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e234ddf9feb0d022d081f024eb30ad0a");
            return;
        }
        this.e = "-999";
        this.f = "";
    }

    public WMIMRefuseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f838471acf654e51cd2f9575444811ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f838471acf654e51cd2f9575444811ae");
            return;
        }
        this.e = "-999";
        this.f = "";
    }

    public WMIMRefuseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e666230e50d016ab6a8eb2e4b93b86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e666230e50d016ab6a8eb2e4b93b86");
            return;
        }
        this.e = "-999";
        this.f = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r1.equals("groupInviteReject") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    @Override // com.meituan.android.ptcommonim.pageadapter.message.view.PTIMAbstractRefuseView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> getBusinessMap() {
        /*
            r13 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.business.im.common.view.WMIMRefuseView.b
            java.lang.String r10 = "ce75e628a159bf285dafc8b2fbf9851f"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r9, r0, r10)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L1b:
            com.sankuai.xm.imui.session.entity.b r1 = r13.getMessage()
            java.lang.String r1 = com.sankuai.waimai.business.im.a.a(r1)
            r2 = 1
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.business.im.common.view.WMIMRefuseView.b
            java.lang.String r12 = "dd6d61a3cd74ed6d77fabc975ab22950"
            r6 = 0
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r10
            r4 = r13
            r5 = r11
            r7 = r12
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L40
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r13, r11, r0, r12)
            java.lang.String r0 = (java.lang.String) r0
            goto L86
        L40:
            r3 = -1
            int r4 = r1.hashCode()
            r5 = -1987778521(0xffffffff8984e827, float:-3.199616E-33)
            if (r4 == r5) goto L6a
            r0 = -257826718(0xfffffffff0a1e062, float:-4.007868E29)
            if (r4 == r0) goto L5f
            r0 = 498824600(0x1dbb7598, float:4.9620077E-21)
            if (r4 == r0) goto L55
            goto L74
        L55:
            java.lang.String r0 = "evaluateReject"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L74
            r0 = 1
            goto L75
        L5f:
            java.lang.String r0 = "saleReplyReject"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L74
            r0 = 2
            goto L75
        L6a:
            java.lang.String r2 = "groupInviteReject"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L74
            goto L75
        L74:
            r0 = -1
        L75:
            switch(r0) {
                case 0: goto L83;
                case 1: goto L7f;
                case 2: goto L7b;
                default: goto L78;
            }
        L78:
            java.lang.String r0 = ""
            goto L86
        L7b:
            java.lang.String r0 = "售后接待消息"
            goto L86
        L7f:
            java.lang.String r0 = "评价邀请"
            goto L86
        L83:
            java.lang.String r0 = "粉丝群进群邀请"
        L86:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "buId"
            r4 = 1705(0x6a9, float:2.389E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r3, r4)
            java.lang.String r3 = "sceneType"
            r2.put(r3, r1)
            java.lang.String r1 = "sceneTypeDesc"
            r2.put(r1, r0)
            java.lang.String r0 = "realCid"
            java.lang.String r1 = com.sankuai.waimai.business.im.utils.d.a
            r2.put(r0, r1)
            java.lang.String r0 = "poiId"
            java.lang.String r1 = r13.getPoiIdStr()
            r2.put(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.common.view.WMIMRefuseView.getBusinessMap():java.util.Map");
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.view.PTIMAbstractRefuseView
    public final IMMessage a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e950922a34d1eef2d630b13cdb500e4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e950922a34d1eef2d630b13cdb500e4e");
        }
        if (iMMessage == null) {
            iMMessage = new IMMessage();
        }
        b a = b.a();
        if (a != null) {
            iMMessage.setFromUid(a.d());
            iMMessage.setChatId(a.d());
            iMMessage.setCategory(a.e());
            iMMessage.setToUid(a.d());
            iMMessage.setToAppId(a.g());
            iMMessage.setPeerAppId(a.g());
            iMMessage.setChannel(a.f() != null ? a.f().g : (short) 0);
            iMMessage.setMsgStatus(9);
            HashMap hashMap = new HashMap();
            hashMap.put("poi_id", getPoiId());
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, getPoiIdStr());
            hashMap.put("poiType", 0);
            iMMessage.appendExtension(hashMap);
        }
        return iMMessage;
    }

    private String getPoiId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6976c0e4c5e3517b022ec2f6ecca87c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6976c0e4c5e3517b022ec2f6ecca87c3");
        }
        if (!TextUtils.equals(this.e, "-999")) {
            return this.e;
        }
        com.sankuai.xm.imui.session.b b2 = com.sankuai.xm.imui.session.b.b(getContext());
        if (b2 == null || b2.c.u == null) {
            return "-999";
        }
        long j = b2.c.u.getLong("param_poi_poi_id");
        if (j != 0) {
            this.e = String.valueOf(j);
            return this.e;
        }
        return "-999";
    }

    private String getPoiIdStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f4694711e584ad1a9ec1389dfb5a2c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f4694711e584ad1a9ec1389dfb5a2c0");
        }
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        com.sankuai.xm.imui.session.b b2 = com.sankuai.xm.imui.session.b.b(getContext());
        if (b2 == null || b2.c.u == null) {
            return "";
        }
        String string = b2.c.u.getString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        this.f = string;
        return this.f;
    }
}
