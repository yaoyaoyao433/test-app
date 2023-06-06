package com.sankuai.waimai.business.im.group.prepare;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.b;
import com.sankuai.waimai.business.im.group.api.WmImGroupService;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m extends com.sankuai.waimai.business.im.prepare.b {
    public static ChangeQuickRedirect d;
    final String e;
    final int f;
    private final long h;
    private final long i;
    private final String j;
    private final b.a k;
    private final int l;
    private final int m;

    public static /* synthetic */ void a(m mVar, Activity activity, SessionId sessionId, com.sankuai.waimai.business.im.group.model.c cVar, com.sankuai.waimai.business.im.group.model.d dVar, int i, boolean z, boolean z2, int i2) {
        Object[] objArr = {activity, sessionId, cVar, dVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, mVar, changeQuickRedirect, false, "0368a2a51f555764236c3a8b3f1c0f43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mVar, changeQuickRedirect, false, "0368a2a51f555764236c3a8b3f1c0f43");
            return;
        }
        f fVar = new f();
        SessionParams sessionParams = new SessionParams();
        Bundle bundle = sessionParams.u;
        bundle.putSerializable("group_im_info", cVar);
        bundle.putSerializable("group_member_info", dVar);
        bundle.putLong("order_view_id", mVar.h);
        bundle.putLong("poi_id", mVar.i);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, mVar.j);
        bundle.putInt("param_from", i);
        bundle.putBoolean("is_rider_changed", z);
        bundle.putBoolean("param_isBackendPush", z2);
        bundle.putInt("show_emotion", i2);
        bundle.putInt("ref", mVar.m);
        sessionParams.o = new String[]{"104", "107"};
        sessionParams.a(com.sankuai.waimai.imbase.manager.f.a().a(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
        int a = com.sankuai.xm.ui.a.a().a(activity, sessionId, fVar, sessionParams);
        mVar.a(a == 0);
        if (a == -1) {
            mVar.a("enter chat page fail");
            ae.a(activity, (int) R.string.wm_im_error_response);
            com.sankuai.waimai.imbase.manager.b.a().a(activity.getApplication());
            if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                com.sankuai.waimai.imbase.manager.b.a().a(activity);
                return;
            }
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "d46d0e1489f52456869d6a67d85a8933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "d46d0e1489f52456869d6a67d85a8933");
        } else {
            com.sankuai.waimai.business.im.common.log.b.a("group_enter", String.valueOf(mVar.f));
        }
    }

    public static /* synthetic */ void a(m mVar, IMMessage iMMessage, long j, long j2) {
        Object[] objArr = {iMMessage, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, mVar, changeQuickRedirect, false, "67015514207f9af7d76b6974af6a558c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mVar, changeQuickRedirect, false, "67015514207f9af7d76b6974af6a558c");
        } else if (iMMessage != null) {
            if (iMMessage.getFromUid() != IMClient.a().k()) {
                iMMessage.setFromUid(j);
            }
            iMMessage.setToUid(j2);
            iMMessage.setChatId(j2);
            iMMessage.setPeerAppId((short) 0);
            iMMessage.setToAppId((short) 0);
            iMMessage.setPeerUid(0L);
            iMMessage.setMsgUuid("");
            iMMessage.setChannel((short) 1025);
            iMMessage.setCategory(2);
            iMMessage.setMsgId(0L);
            HashMap hashMap = new HashMap();
            hashMap.put("order_id", String.valueOf(mVar.h));
            iMMessage.appendExtension(hashMap);
        }
    }

    public m(Activity activity, long j, long j2, String str, String str2, int i, int i2, boolean z, b.a aVar, int i3) {
        super(activity, z);
        Object[] objArr = {activity, new Long(j), new Long(j2), str, str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868cd8187e7e70eee8c6235f4fd6c114", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868cd8187e7e70eee8c6235f4fd6c114");
            return;
        }
        this.h = j;
        this.i = j2;
        this.j = str;
        this.e = str2;
        this.f = i;
        this.k = aVar;
        this.l = i2;
        this.m = i3;
    }

    void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ac84cfec31bdcda3023f1f0c7a17185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ac84cfec31bdcda3023f1f0c7a17185");
        } else if (this.k != null) {
            this.k.a(z);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32a05da0af03f97f6e0c4a323742a300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32a05da0af03f97f6e0c4a323742a300");
            return;
        }
        final Activity activity = this.b != null ? this.b.get() : null;
        if (activity == null || activity.isFinishing()) {
            a("Activity is finishing before request");
            a(false);
            return;
        }
        if (!com.sankuai.waimai.imbase.manager.b.a().e()) {
            com.sankuai.waimai.imbase.manager.b.a().a(activity);
        }
        final Dialog a = com.sankuai.waimai.foundation.core.utils.d.a(activity);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupImInfo(this.h, this.i, this.j, this.l), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.group.model.c>>() { // from class: com.sankuai.waimai.business.im.group.prepare.m.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1354c068c821313dfd98f97b10387dd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1354c068c821313dfd98f97b10387dd");
                    return;
                }
                Activity activity2 = m.this.b != null ? (Activity) m.this.b.get() : null;
                if (activity2 == null || activity2.isFinishing()) {
                    m.this.a("Activity is finishing after request[groupinfo]");
                    com.sankuai.waimai.foundation.core.utils.d.a(a);
                    m.this.b(m.this.f, activity);
                    m.this.a(false);
                } else if (baseResponse == null || baseResponse.code != 0) {
                    if (baseResponse == null) {
                        m.this.a("response[groupinfo] is null");
                    } else {
                        m mVar = m.this;
                        mVar.a("response[groupinfo] code is " + baseResponse.code);
                    }
                    if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                        ae.a(activity.getApplicationContext(), baseResponse.msg);
                    } else {
                        ae.a(activity, (int) R.string.wm_im_error_response);
                    }
                    com.sankuai.waimai.foundation.core.utils.d.a(a);
                    m.this.b(m.this.f, activity);
                    m.this.a(false);
                } else {
                    final com.sankuai.waimai.business.im.group.model.c cVar = (com.sankuai.waimai.business.im.group.model.c) baseResponse.data;
                    if (cVar == null || cVar.a == null || cVar.d == null || cVar.d.a == -2147483648L) {
                        if (cVar == null) {
                            m.this.a("response[groupinfo] data is null");
                        } else if (cVar.a == null) {
                            m.this.a("response[groupinfo] data[groupImInfo.poiInfo] is null");
                        } else if (cVar.d == null) {
                            m.this.a("response[groupinfo] data[groupImInfo.basicInfo] is null");
                        } else if (cVar.d.a == -2147483648L) {
                            m.this.a("response[groupinfo] data[groupImInfo.basicInfo.groupId] is null");
                        }
                        if (!TextUtils.isEmpty(baseResponse.msg)) {
                            ae.a(activity.getApplicationContext(), baseResponse.msg);
                        } else {
                            ae.a(activity, (int) R.string.wm_im_error_response);
                        }
                        com.sankuai.waimai.foundation.core.utils.d.a(a);
                        m.this.b(m.this.f, activity);
                        m.this.a(false);
                        return;
                    }
                    final int i = cVar.d.t;
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupMemberInfo(cVar.d.a), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.group.model.d>>() { // from class: com.sankuai.waimai.business.im.group.prepare.m.1.1
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
                        /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
                        @Override // rx.e
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final /* synthetic */ void onNext(java.lang.Object r31) {
                            /*
                                Method dump skipped, instructions count: 539
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.group.prepare.m.AnonymousClass1.C07441.onNext(java.lang.Object):void");
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                            Object[] objArr3 = {th};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "93afc7626c365ab964faeba87365816e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "93afc7626c365ab964faeba87365816e");
                                return;
                            }
                            m.this.a("request[memberinfos] error");
                            ae.a(activity, (int) R.string.wm_im_net_error_retry_later);
                            com.sankuai.waimai.foundation.core.utils.d.a(a);
                            m.this.a(m.this.f, activity);
                            m.this.a(false);
                        }
                    }, m.this.e);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3af569aff97acd51e88ed42ad2f612ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3af569aff97acd51e88ed42ad2f612ef");
                    return;
                }
                m.this.a("request[groupinfo] error");
                ae.a(activity, (int) R.string.wm_im_net_error_retry_later);
                com.sankuai.waimai.foundation.core.utils.d.a(a);
                m.this.a(m.this.f, activity);
                m.this.a(false);
            }
        }, this.e);
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7153b5b0dabca34e0971145a6b84573c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7153b5b0dabca34e0971145a6b84573c");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("orderViewId", String.valueOf(this.h));
        hashMap.put("poiId", String.valueOf(this.i));
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.j);
        hashMap.put("from", String.valueOf(this.f));
        hashMap.put(KnbConstants.PARAMS_SCENE, String.valueOf(this.l));
        com.sankuai.waimai.business.im.common.log.b.a("group_enter", String.valueOf(this.f), str, hashMap);
    }
}
