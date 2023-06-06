package com.sankuai.waimai.business.im.group.prepare;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.api.WmImFoodSafetyGroupService;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j extends com.sankuai.waimai.business.im.prepare.b {
    public static ChangeQuickRedirect d;
    private final String e;
    private final int f;
    private final long h;
    private final int i;
    private final int j;

    public static /* synthetic */ void a(j jVar, Activity activity, Dialog dialog) {
        Object[] objArr = {activity, dialog};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "0dca97a735bedfec21c96365ed89b734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "0dca97a735bedfec21c96365ed89b734");
            return;
        }
        jVar.a("request[groupinfo] error");
        ae.a(activity, (int) R.string.wm_im_net_error_retry_later);
        com.sankuai.waimai.foundation.core.utils.d.a(dialog);
        jVar.a(jVar.f, activity);
    }

    public static /* synthetic */ void a(j jVar, Activity activity, Dialog dialog, BaseResponse baseResponse) {
        Object[] objArr = {activity, dialog, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "44166d8f44d498ca24118226380254aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "44166d8f44d498ca24118226380254aa");
            return;
        }
        Activity activity2 = jVar.b != null ? jVar.b.get() : null;
        if (activity2 == null || activity2.isFinishing()) {
            jVar.a("Activity is finishing after request[groupinfo]");
            com.sankuai.waimai.foundation.core.utils.d.a(dialog);
            jVar.b(jVar.f, activity);
        } else if (baseResponse == null || baseResponse.code != 0) {
            if (baseResponse == null) {
                jVar.a("response[groupinfo] is null");
            } else {
                jVar.a("response[groupinfo] code is " + baseResponse.code);
            }
            if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                ae.a(activity.getApplicationContext(), baseResponse.msg);
            } else {
                ae.a(activity, (int) R.string.wm_im_error_response);
            }
            com.sankuai.waimai.foundation.core.utils.d.a(dialog);
            jVar.b(jVar.f, activity);
        } else {
            com.sankuai.waimai.business.im.common.model.a aVar = (com.sankuai.waimai.business.im.common.model.a) baseResponse.data;
            if (aVar == null || aVar.a == null || aVar.b == null || aVar.b.a == -2147483648L) {
                if (aVar == null) {
                    jVar.a("response[groupinfo] data is null");
                } else if (aVar.a == null) {
                    jVar.a("response[groupinfo] data[groupImInfo.poiInfo] is null");
                } else if (aVar.b == null) {
                    jVar.a("response[groupinfo] data[groupImInfo.basicInfo] is null");
                } else if (aVar.b.a == -2147483648L) {
                    jVar.a("response[groupinfo] data[groupImInfo.basicInfo.groupId] is null");
                }
                if (!TextUtils.isEmpty(baseResponse.msg)) {
                    ae.a(activity.getApplicationContext(), baseResponse.msg);
                } else {
                    ae.a(activity, (int) R.string.wm_im_error_response);
                }
                com.sankuai.waimai.foundation.core.utils.d.a(dialog);
                jVar.b(jVar.f, activity);
                return;
            }
            int i = aVar.b.m;
            com.sankuai.waimai.foundation.core.utils.d.a(dialog);
            jVar.a(jVar.f, activity2);
            Object[] objArr2 = {activity2, aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "088ff3f82b380f5225d8f56b4ba69484", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "088ff3f82b380f5225d8f56b4ba69484");
                return;
            }
            d dVar = new d();
            SessionParams sessionParams = new SessionParams();
            Bundle bundle = sessionParams.u;
            SessionId a = SessionId.a(aVar.b.a, 0L, 2, (short) 0, (short) 1050);
            e.a a2 = com.sankuai.waimai.business.im.group.cache.b.a().a(jVar.h);
            long j = a2 != null ? a2.j : 0L;
            bundle.putSerializable("chat_param_data", aVar);
            bundle.putInt("chat_param_from", jVar.f);
            bundle.putBoolean("chat_param_is_backend_push", jVar.c);
            bundle.putLong("chat_param_comment_id", j);
            bundle.putInt("show_emotion", i);
            bundle.putInt("ref", jVar.j);
            sessionParams.o = new String[]{"104", "107"};
            sessionParams.a(com.sankuai.waimai.imbase.manager.f.a().a(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
            if (com.sankuai.xm.ui.a.a().a(activity2, a, dVar, sessionParams) == -1) {
                jVar.a("enter chat page fail");
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
            if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "33a3b02f0ff11b100881f07c5f94efd3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "33a3b02f0ff11b100881f07c5f94efd3");
            } else {
                com.sankuai.waimai.business.im.common.log.b.a("food_safety_group_enter", String.valueOf(jVar.f));
            }
        }
    }

    public j(Activity activity, String str, int i, boolean z, long j, int i2, int i3) {
        super(activity, z);
        Object[] objArr = {activity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "376bc2dd5b0eb8a29ac8f6e10c79781e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "376bc2dd5b0eb8a29ac8f6e10c79781e");
            return;
        }
        this.e = str;
        this.f = i;
        this.h = j;
        this.i = i2;
        this.j = i3;
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f98afc4e79beace53128ea9b5077679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f98afc4e79beace53128ea9b5077679");
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
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImFoodSafetyGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImFoodSafetyGroupService.class)).getFoodSafetyGroupChatInfo(this.h, this.i), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.common.model.a>>() { // from class: com.sankuai.waimai.business.im.group.prepare.j.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d3d78f30de616c61b099140886b3ba3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d3d78f30de616c61b099140886b3ba3");
                } else {
                    j.a(j.this, activity, a, baseResponse);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d22ada6a7df63ff10ccca9019f173d5a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d22ada6a7df63ff10ccca9019f173d5a");
                } else {
                    j.a(j.this, activity, a);
                }
            }
        }, this.e);
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f728de19f9bf805769ca62c12bd2d8ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f728de19f9bf805769ca62c12bd2d8ee");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from", String.valueOf(this.f));
        hashMap.put("is_backend_push", String.valueOf(this.c));
        hashMap.put("group_id", String.valueOf(this.h));
        hashMap.put("group_type", String.valueOf(this.i));
        com.sankuai.waimai.business.im.common.log.b.a("food_safety_group_enter", String.valueOf(this.f), str, hashMap);
    }
}
