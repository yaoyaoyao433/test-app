package com.sankuai.waimai.business.im.prepare;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.LaunchModeProvider;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PrepareChatPageTransferDelegate extends BaseActivityDelegate implements LaunchModeProvider {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity, @Nullable Bundle bundle) {
        Object[] objArr = {transferActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c7414272e3f65abeb4fd21a1a169c4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c7414272e3f65abeb4fd21a1a169c4d");
            return;
        }
        Intent intent = transferActivity.getIntent();
        if (intent == null) {
            c();
            a((Activity) transferActivity);
            return;
        }
        b(transferActivity, intent);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity, Intent intent) {
        Object[] objArr = {transferActivity, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e984f4d60c59f94a7c37d1211034f6a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e984f4d60c59f94a7c37d1211034f6a5");
        } else if (intent != null) {
            b(transferActivity, intent);
        }
    }

    private int a(Intent intent) {
        int i = 1;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e4d102a8eef333298cb2dcfb848d10f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e4d102a8eef333298cb2dcfb848d10f")).intValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String path = data.getPath();
            if (!"immessage".equals(path) && !"/immessage".equals(path)) {
                if ("b2cimmessage".equals(path) || "/b2cimmessage".equals(path)) {
                    i = 2;
                }
            }
            return com.sankuai.waimai.foundation.router.a.a(intent, "prepare_chat_page_im_type", i);
        }
        i = -1;
        return com.sankuai.waimai.foundation.router.a.a(intent, "prepare_chat_page_im_type", i);
    }

    private void b(TransferActivity transferActivity, @NonNull Intent intent) {
        Object[] objArr = {transferActivity, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c025154247936d76f494ea51bd5e2ebc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c025154247936d76f494ea51bd5e2ebc");
        } else if (com.sankuai.waimai.foundation.router.a.a(intent)) {
            switch (a(intent)) {
                case 1:
                    a(1);
                    b(intent);
                    return;
                case 2:
                    a(2);
                    c(intent);
                    return;
                default:
                    c();
                    a((Activity) transferActivity);
                    return;
            }
        } else {
            switch (com.sankuai.waimai.platform.utils.f.a(intent, "prepare_chat_page_im_type", -1)) {
                case 1:
                    b(intent);
                    return;
                case 2:
                    c(intent);
                    return;
                default:
                    c();
                    a((Activity) transferActivity);
                    return;
            }
        }
    }

    private void b(@NonNull Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e287831ca9bcd4add20a3171825190b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e287831ca9bcd4add20a3171825190b6");
            return;
        }
        long a2 = com.sankuai.waimai.foundation.router.a.a(intent, Constants.EventConstants.KEY_ORDER_ID, 0L);
        long a3 = com.sankuai.waimai.foundation.router.a.a(intent, "riderId", 0L);
        boolean z = com.sankuai.waimai.foundation.router.a.a(intent, "from_backend_push", 0) == 1;
        int a4 = com.sankuai.waimai.foundation.router.a.a(intent, "from", 2);
        int a5 = com.sankuai.waimai.foundation.router.a.a(intent, "ref", 0);
        int a6 = com.sankuai.waimai.foundation.router.a.a(intent, "isPinHaoFan", 0);
        int a7 = com.sankuai.waimai.foundation.router.a.a(intent, "pinSource", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("ref", a5);
        bundle.putShort("rider_app_id", com.sankuai.waimai.imbase.utils.g.b(intent.getData() != null ? intent.getData().getQueryParameter(Message.PEER_APPID) : "0"));
        bundle.putInt("isPinHaoFan", a6);
        bundle.putInt("pinSource", a7);
        com.sankuai.waimai.business.im.api.a.a().a((Activity) this.h, (SessionId) null, a2, k(), a4, a3, z, false, bundle);
        b("rider_enter");
    }

    private void c(@NonNull Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f0bf0a23e8e4a8a0f3cdc1f028ba97d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f0bf0a23e8e4a8a0f3cdc1f028ba97d");
            return;
        }
        long a2 = com.sankuai.waimai.foundation.router.a.a(intent, Constants.EventConstants.KEY_ORDER_ID, 0L);
        long a3 = com.sankuai.waimai.foundation.router.a.a(intent, "poiId", 0L);
        String a4 = com.sankuai.waimai.foundation.router.a.a(intent, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
        boolean z = com.sankuai.waimai.foundation.router.a.a(intent, "from_backend_push", 0) == 1;
        int a5 = com.sankuai.waimai.foundation.router.a.a(intent, "ref", 0);
        HashSet<String> hashSet = new HashSet<>();
        String a6 = com.sankuai.waimai.foundation.router.a.a(intent, KnbConstants.PARAMS_SCENE, "");
        if (!TextUtils.isEmpty(a6)) {
            hashSet.add(a6);
        }
        int a7 = com.sankuai.waimai.foundation.router.a.a(intent, "biz_im_from", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("ref", a5);
        bundle.putInt("biz_im_from", a7);
        com.sankuai.waimai.business.im.api.a.a().a(this.h, null, z ? 5 : 4, a2, a3, a4, 0L, hashSet, z ? com.sankuai.waimai.foundation.router.a.a(intent, "from", 2) : 1, k(), z, bundle);
        b("poi_enter");
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9734a1d362cada862ec7869472af0b99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9734a1d362cada862ec7869472af0b99");
        } else {
            JudasManualManager.a("b_JXKMl").a("type", i).a();
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d798ad6fce649e2536f6abc25c29a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d798ad6fce649e2536f6abc25c29a2");
        } else {
            com.sankuai.waimai.business.im.common.log.b.a(str, "url");
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab80cc6f2cd495af95443a5a2fd2343d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab80cc6f2cd495af95443a5a2fd2343d");
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.h != null && this.h.getIntent() != null && this.h.getIntent().getData() != null) {
            hashMap.put("url", this.h.getIntent().getData().toString());
        }
        com.sankuai.waimai.business.im.common.log.b.a("unknown_enter", "url", "IM URL 跳转异常", hashMap);
    }

    private void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12df39e1cef16b49846bb7251fe863c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12df39e1cef16b49846bb7251fe863c9");
            return;
        }
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }
}
