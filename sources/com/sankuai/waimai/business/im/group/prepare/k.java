package com.sankuai.waimai.business.im.group.prepare;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.api.WmImUserGroupService;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k extends com.sankuai.waimai.business.im.prepare.b {
    public static ChangeQuickRedirect d;
    private final String e;
    private final int f;
    private final long h;
    private final String i;
    private final long j;
    private final int k;

    public static /* synthetic */ void a(k kVar, Activity activity, Dialog dialog) {
        Object[] objArr = {activity, dialog};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "e93c355623bb31766f7115f02b060c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "e93c355623bb31766f7115f02b060c3b");
            return;
        }
        kVar.a("request[groupinfo] error");
        ae.a(activity, (int) R.string.wm_im_net_error_retry_later);
        com.sankuai.waimai.foundation.core.utils.d.a(dialog);
        kVar.a(kVar.f, activity);
    }

    public static /* synthetic */ void a(k kVar, Activity activity, Dialog dialog, BaseResponse baseResponse) {
        Object[] objArr = {activity, dialog, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, kVar, changeQuickRedirect, false, "02a8fb718116e7104ce66bf32ef44386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, kVar, changeQuickRedirect, false, "02a8fb718116e7104ce66bf32ef44386");
            return;
        }
        Activity activity2 = kVar.b != null ? kVar.b.get() : null;
        if (activity2 == null || activity2.isFinishing()) {
            kVar.a("Activity is finishing after request[groupinfo]");
            com.sankuai.waimai.foundation.core.utils.d.a(dialog);
            kVar.b(kVar.f, activity);
        } else if (baseResponse == null || baseResponse.code != 0) {
            if (baseResponse == null) {
                kVar.a("response[groupinfo] is null");
            } else {
                kVar.a("response[groupinfo] code is " + baseResponse.code);
            }
            if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                ae.a(activity, baseResponse.msg);
            } else {
                ae.a(activity, (int) R.string.wm_im_error_response);
            }
            com.sankuai.waimai.foundation.core.utils.d.a(dialog);
            kVar.b(kVar.f, activity);
        } else {
            com.sankuai.waimai.business.im.group.model.g gVar = (com.sankuai.waimai.business.im.group.model.g) baseResponse.data;
            if (gVar == null || gVar.a == null || gVar.b == null) {
                if (gVar == null) {
                    kVar.a("response[groupinfo] data is null");
                } else if (gVar.a == null) {
                    kVar.a("response[groupinfo] data[groupImInfo.poiInfo] is null");
                } else if (gVar.b == null) {
                    kVar.a("response[groupinfo] data[groupImInfo.basicInfo] is null");
                }
                if (!TextUtils.isEmpty(baseResponse.msg)) {
                    ae.a(activity.getApplicationContext(), baseResponse.msg);
                } else {
                    ae.a(activity, (int) R.string.wm_im_error_response);
                }
                com.sankuai.waimai.foundation.core.utils.d.a(dialog);
                kVar.b(kVar.f, activity);
                return;
            }
            com.sankuai.waimai.foundation.core.utils.d.a(dialog);
            kVar.a(kVar.f, activity2);
            Object[] objArr2 = {activity2, gVar};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "eb1423305789655fbde1a4701b3b4bc6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "eb1423305789655fbde1a4701b3b4bc6");
                return;
            }
            l lVar = new l();
            SessionParams sessionParams = new SessionParams();
            Bundle bundle = sessionParams.u;
            SessionId a = SessionId.a(kVar.j, 0L, 2, (short) 0, (short) 1036);
            bundle.putSerializable("chat_param_data", gVar);
            bundle.putLong("group_im_id", kVar.j);
            sessionParams.o = new String[]{"104", "107"};
            sessionParams.a(gVar.r - 86400000);
            if (com.sankuai.xm.ui.a.a().a(activity2, a, lVar, sessionParams) == -1) {
                kVar.a("enter chat page fail");
                ae.a(activity2, (int) R.string.wm_im_error_response);
                com.sankuai.waimai.imbase.manager.b.a().a(activity2.getApplication());
                if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                    com.sankuai.waimai.imbase.manager.b.a().a(activity2);
                    return;
                }
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "f4d1f2e7750cfbb8043ebb07c48d1c80", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "f4d1f2e7750cfbb8043ebb07c48d1c80");
            } else {
                com.sankuai.waimai.business.im.common.log.b.a("user_group_enter", String.valueOf(kVar.f));
            }
        }
    }

    public k(Activity activity, String str, int i, boolean z, long j, int i2, long j2, String str2) {
        super(activity, z);
        Object[] objArr = {activity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i2), new Long(j2), str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7192ed02e8c172dbc2e233180c639e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7192ed02e8c172dbc2e233180c639e1");
            return;
        }
        this.e = str;
        this.f = i;
        this.h = j2;
        this.i = str2;
        this.j = j;
        this.k = i2;
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9992ca91c387057c3177bee45034ab82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9992ca91c387057c3177bee45034ab82");
            return;
        }
        final Activity activity = this.b != null ? this.b.get() : null;
        if (activity == null || activity.isFinishing()) {
            a("Activity is finishing before request");
            return;
        }
        if (!com.sankuai.waimai.imbase.manager.b.a().e()) {
            com.sankuai.waimai.imbase.manager.b.a().a(activity);
        }
        final Dialog a = com.sankuai.waimai.foundation.core.utils.d.a(activity);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImUserGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImUserGroupService.class)).getUserGroupChatInfo(this.h, this.i, this.j, this.k), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.group.model.g>>() { // from class: com.sankuai.waimai.business.im.group.prepare.k.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f95291f38c4bbcf4d4798267befb687", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f95291f38c4bbcf4d4798267befb687");
                } else {
                    k.a(k.this, activity, a, baseResponse);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a07903aef5242a41bc0b055731427cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a07903aef5242a41bc0b055731427cb");
                } else {
                    k.a(k.this, activity, a);
                }
            }
        }, this.e);
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8d946d3005b006b14ddd6967260a7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8d946d3005b006b14ddd6967260a7b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from", String.valueOf(this.f));
        hashMap.put("is_backend_push", String.valueOf(this.c));
        hashMap.put("group_id", String.valueOf(this.j));
        hashMap.put("group_type", String.valueOf(this.k));
        com.sankuai.waimai.business.im.common.log.b.a("user_group_enter", String.valueOf(this.f), str, hashMap);
    }
}
