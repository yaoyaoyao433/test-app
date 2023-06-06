package com.sankuai.meituan.takeoutnew.manager.share;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.base.WmBaseActivity;
import com.sankuai.meituan.takeoutnew.net.api.WmApi;
import com.sankuai.waimai.kit.share.b;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.share.listener.b;
import com.sankuai.waimai.kit.share.util.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShareShadowActivity extends WmBaseActivity {
    public static ChangeQuickRedirect b;
    private b c;
    private ShareBean d;
    private boolean e;

    public static /* synthetic */ void a(ShareShadowActivity shareShadowActivity, ShareBean shareBean) {
        Object[] objArr = {shareBean};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, shareShadowActivity, changeQuickRedirect, false, "c0d28e450a48f0d8200870501508815d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, shareShadowActivity, changeQuickRedirect, false, "c0d28e450a48f0d8200870501508815d");
            return;
        }
        if (shareBean.getSourceId() == 2) {
            try {
                String orderId = shareBean.getOrderId();
                String url = shareBean.getUrl();
                int indexOf = url.indexOf("urlKey") + 7;
                if (indexOf > 0 && indexOf < url.length()) {
                    url = url.substring(indexOf);
                }
                a(orderId, url, com.sankuai.waimai.share.a.a(shareBean.getChannel()), shareShadowActivity.w());
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e(shareShadowActivity.getClass().getSimpleName(), e.getMessage(), new Object[0]);
            }
        }
        if (shareBean.getSourceId() == 8) {
            EventInfo eventInfo = new EventInfo();
            eventInfo.nm = EventName.MGE;
            eventInfo.val_bid = "b_SKC0N";
            eventInfo.event_type = "click";
            Statistics.getChannel().writeEvent((String) null, eventInfo);
        }
    }

    public static /* synthetic */ void b(ShareShadowActivity shareShadowActivity, ShareBean shareBean) {
        Object[] objArr = {shareBean};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, shareShadowActivity, changeQuickRedirect, false, "3ee9f2fa706fc7b37eb78d6c96d701aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, shareShadowActivity, changeQuickRedirect, false, "3ee9f2fa706fc7b37eb78d6c96d701aa");
        } else if (shareBean.getSourceId() == 2) {
            String orderId = shareBean.getOrderId();
            String url = shareBean.getUrl();
            int indexOf = url.indexOf("urlKey") + 7;
            if (indexOf > 0 && indexOf < url.length()) {
                url = url.substring(indexOf);
            }
            a(orderId, url, com.sankuai.waimai.share.a.a(shareBean.getChannel()), shareShadowActivity.w());
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386fba6577fd934012df035e21d0c6a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386fba6577fd934012df035e21d0c6a1");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "062a5b3816cec9fcb40419f835a47ee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "062a5b3816cec9fcb40419f835a47ee6");
        } else if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.meituan.takeoutnew.manager.share.ShareShadowActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr3 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27285433cd674ab3fa3c45d0dbb112c6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27285433cd674ab3fa3c45d0dbb112c6")).booleanValue();
                }
                ShareShadowActivity.this.finish();
                return false;
            }
        });
        this.c = new b(this);
        final Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        this.d = (ShareBean) extras.getParcelable("shareTip");
        f.a(this, this.c, extras.getInt("source"), extras.getInt("appId"), extras.getString(Constants.EventConstants.KEY_ORDER_ID), extras.getString("shareIconButtonUrl"), (ShareBean) extras.getParcelable("shareTip"), new com.sankuai.waimai.kit.share.listener.b() { // from class: com.sankuai.meituan.takeoutnew.manager.share.ShareShadowActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.kit.share.listener.b
            public final void a(ShareBean shareBean, b.a aVar) {
                Object[] objArr3 = {shareBean, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "973f43a02d6a6984b601192404c6a533", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "973f43a02d6a6984b601192404c6a533");
                    return;
                }
                int channel = shareBean != null ? shareBean.getChannel() : 0;
                if (aVar == b.a.COMPLETE) {
                    if (channel == 2 || channel == 4) {
                        ShareShadowActivity.a(ShareShadowActivity.this, shareBean);
                    } else if (channel == 1 || channel == 8) {
                        ShareShadowActivity.b(ShareShadowActivity.this, shareBean);
                    }
                }
                com.sankuai.waimai.foundation.core.service.share.listener.b a2 = a.a(extras.getString("resultListenerHash"));
                if (a2 != null) {
                    a2.a(com.sankuai.waimai.share.a.a(channel), aVar.f);
                }
                ShareShadowActivity.this.finish();
            }
        });
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ab9e0c725429c86e666e92a10de300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ab9e0c725429c86e666e92a10de300");
            return;
        }
        super.onStart();
        if (this.e) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16d71386465012e859c8a6aa5a9eb1fa", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16d71386465012e859c8a6aa5a9eb1fa")).booleanValue();
            } else if (this.d != null && (this.d.getChannel() == 1 || this.d.getChannel() == 8)) {
                z = true;
            }
            if (!z) {
                finish();
                return;
            }
        }
        this.e = true;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fdb4baa2545a663af981a9e453386c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fdb4baa2545a663af981a9e453386c3");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        com.sankuai.waimai.kit.share.strategy.b bVar = this.c.c;
        if (bVar != null) {
            bVar.a(i, i2, intent);
        }
        finish();
        com.meituan.android.privacy.aop.a.b();
    }

    public static void a(String str, String str2, int i, Object obj) {
        Object[] objArr = {str, str2, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4aefbe4c26a2cdf1d8eb86706398665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4aefbe4c26a2cdf1d8eb86706398665");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmApi.class)).shareRemind(str, str2, String.valueOf(i)), null, obj);
        }
    }
}
