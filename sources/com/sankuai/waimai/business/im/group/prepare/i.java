package com.sankuai.waimai.business.im.group.prepare;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.api.WmImBadCommentGroupService;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.session.entity.SessionParams;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i extends com.sankuai.waimai.business.im.prepare.b {
    public static ChangeQuickRedirect d;
    private final String e;
    private final int f;
    private final long h;
    private final int i;
    private final int j;

    public static /* synthetic */ void a(i iVar, Activity activity, Dialog dialog) {
        Object[] objArr = {activity, dialog};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "bfe5df1c26c5844ea38a46c5824d7e66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "bfe5df1c26c5844ea38a46c5824d7e66");
            return;
        }
        iVar.a("request[groupinfo] error");
        ae.a(activity, (int) R.string.wm_im_net_error_retry_later);
        com.sankuai.waimai.foundation.core.utils.d.a(dialog);
        iVar.a(iVar.f, activity);
    }

    public static /* synthetic */ void a(i iVar, Activity activity, Dialog dialog, BaseResponse baseResponse) {
        Object[] objArr = {activity, dialog, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "62ab60931cd6af9d9bbe1ed70f2f3b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "62ab60931cd6af9d9bbe1ed70f2f3b4c");
            return;
        }
        Activity activity2 = iVar.b != null ? iVar.b.get() : null;
        if (activity2 == null || activity2.isFinishing()) {
            iVar.a("Activity is finishing after request[groupinfo]");
            com.sankuai.waimai.foundation.core.utils.d.a(dialog);
            iVar.b(iVar.f, activity);
        } else if (baseResponse == null || baseResponse.code != 0) {
            if (baseResponse == null) {
                iVar.a("response[groupinfo] is null");
            } else {
                iVar.a("response[groupinfo] code is " + baseResponse.code);
            }
            if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                ae.a(activity.getApplicationContext(), baseResponse.msg);
            } else {
                ae.a(activity, (int) R.string.wm_im_error_response);
            }
            com.sankuai.waimai.foundation.core.utils.d.a(dialog);
            iVar.b(iVar.f, activity);
        } else {
            com.sankuai.waimai.business.im.common.model.a aVar = (com.sankuai.waimai.business.im.common.model.a) baseResponse.data;
            if (aVar == null || aVar.a == null || aVar.b == null || aVar.b.a == -2147483648L) {
                if (aVar == null) {
                    iVar.a("response[groupinfo] data is null");
                } else if (aVar.a == null) {
                    iVar.a("response[groupinfo] data[groupImInfo.poiInfo] is null");
                } else if (aVar.b == null) {
                    iVar.a("response[groupinfo] data[groupImInfo.basicInfo] is null");
                } else if (aVar.b.a == -2147483648L) {
                    iVar.a("response[groupinfo] data[groupImInfo.basicInfo.groupId] is null");
                }
                if (!TextUtils.isEmpty(baseResponse.msg)) {
                    ae.a(activity.getApplicationContext(), baseResponse.msg);
                } else {
                    ae.a(activity, (int) R.string.wm_im_error_response);
                }
                com.sankuai.waimai.foundation.core.utils.d.a(dialog);
                iVar.b(iVar.f, activity);
                return;
            }
            int i = aVar.b.m;
            com.sankuai.waimai.foundation.core.utils.d.a(dialog);
            iVar.a(iVar.f, activity2);
            Object[] objArr2 = {activity2, aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "e57027694586bac45ff39ceab7c35e3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "e57027694586bac45ff39ceab7c35e3b");
                return;
            }
            b bVar = new b();
            SessionParams sessionParams = new SessionParams();
            Bundle bundle = sessionParams.u;
            SessionId a = SessionId.a(aVar.b.a, 0L, 2, (short) 0, (short) 1025);
            e.a a2 = com.sankuai.waimai.business.im.group.cache.b.a().a(iVar.h);
            long j = a2 != null ? a2.j : 0L;
            bundle.putSerializable("chat_param_data", aVar);
            bundle.putInt("chat_param_from", iVar.f);
            bundle.putBoolean("chat_param_is_backend_push", iVar.c);
            bundle.putLong("chat_param_comment_id", j);
            bundle.putInt("show_emotion", i);
            bundle.putInt("ref", iVar.j);
            sessionParams.o = new String[]{"104", "107"};
            sessionParams.a(com.sankuai.waimai.imbase.manager.f.a().a(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
            if (com.sankuai.xm.ui.a.a().a(activity2, a, bVar, sessionParams) == -1) {
                iVar.a("enter chat page fail");
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
            if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "e3899c104bbd1ccfb8b5ad9a1ddac761", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "e3899c104bbd1ccfb8b5ad9a1ddac761");
            } else {
                com.sankuai.waimai.business.im.common.log.b.a("bad_comment_group_enter", String.valueOf(iVar.f));
            }
        }
    }

    public i(Activity activity, String str, int i, boolean z, long j, int i2, int i3) {
        super(activity, z);
        Object[] objArr = {activity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1abeb7e2daae9612341df2b46623fbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1abeb7e2daae9612341df2b46623fbf");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b159486b2578dfebce6697ce2ec78849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b159486b2578dfebce6697ce2ec78849");
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
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImBadCommentGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImBadCommentGroupService.class)).getBadCommentGroupChatInfo(this.h, this.i), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.common.model.a>>() { // from class: com.sankuai.waimai.business.im.group.prepare.i.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0d028121f4822efe0a4e6285844a5b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0d028121f4822efe0a4e6285844a5b6");
                } else {
                    i.a(i.this, activity, a, baseResponse);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5216046146d175159dfe3be56c27928f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5216046146d175159dfe3be56c27928f");
                } else {
                    i.a(i.this, activity, a);
                }
            }
        }, this.e);
    }

    @Override // com.sankuai.waimai.business.im.common.prepare.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e8b6561be35a672afb0ca00510c6452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e8b6561be35a672afb0ca00510c6452");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from", String.valueOf(this.f));
        hashMap.put("is_backend_push", String.valueOf(this.c));
        hashMap.put("group_id", String.valueOf(this.h));
        hashMap.put("group_type", String.valueOf(this.i));
        com.sankuai.waimai.business.im.common.log.b.a("bad_comment_group_enter", String.valueOf(this.f), str, hashMap);
    }
}
