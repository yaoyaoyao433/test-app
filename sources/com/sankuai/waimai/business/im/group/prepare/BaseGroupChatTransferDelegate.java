package com.sankuai.waimai.business.im.group.prepare;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.api.a;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.LaunchModeProvider;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.n;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseGroupChatTransferDelegate extends BaseActivityDelegate implements LaunchModeProvider {
    public static ChangeQuickRedirect a;
    private e b;
    private long c;
    private int d;
    private boolean e;
    private boolean f;

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity, @Nullable Bundle bundle) {
        Object[] objArr = {transferActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e15a549c803c7e9fe50df0a75b2e80e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e15a549c803c7e9fe50df0a75b2e80e2");
            return;
        }
        super.a(transferActivity, bundle);
        Intent intent = transferActivity.getIntent();
        if (intent == null || intent.getData() == null) {
            b("intent is null");
            a((Activity) transferActivity);
            return;
        }
        a(intent.getData(), transferActivity);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity, Intent intent) {
        Object[] objArr = {transferActivity, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dae6bd7ded9399367a6fe3959c1f143", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dae6bd7ded9399367a6fe3959c1f143");
            return;
        }
        super.a(transferActivity, intent);
        if (intent == null || intent.getData() == null) {
            return;
        }
        a(intent.getData(), transferActivity);
    }

    private void a(@NonNull Uri uri, TransferActivity transferActivity) {
        Object[] objArr = {uri, transferActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2c864af714d8620a0da11e582fcc51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2c864af714d8620a0da11e582fcc51");
            return;
        }
        this.c = com.sankuai.waimai.imbase.utils.g.a(uri.getQueryParameter("chatID"));
        this.e = com.sankuai.waimai.imbase.utils.g.c(uri.getQueryParameter("isRemote")) == 1;
        this.f = com.sankuai.waimai.imbase.utils.g.c(uri.getQueryParameter("conversationType")) == 1;
        String queryParameter = uri.getQueryParameter("from");
        this.d = TextUtils.isEmpty(queryParameter) ? 1 : com.sankuai.waimai.imbase.utils.g.c(queryParameter);
        a(transferActivity, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "908d169cd7d7e464cd235f49829ec41f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "908d169cd7d7e464cd235f49829ec41f");
        } else {
            com.sankuai.waimai.business.im.common.log.b.a("base_group_enter", "url", str, new HashMap());
        }
    }

    private void a(TransferActivity transferActivity, Uri uri) {
        Object[] objArr = {transferActivity, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2aae61f08c7b8f3c0c99a6f7ae9344c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2aae61f08c7b8f3c0c99a6f7ae9344c");
            return;
        }
        e.a a2 = com.sankuai.waimai.business.im.group.cache.b.a().a(this.c);
        if (a2 == null) {
            b(transferActivity, uri);
        } else {
            a(a2, transferActivity, uri);
        }
    }

    private void b(final TransferActivity transferActivity, Uri uri) {
        Object[] objArr = {transferActivity, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc6ddc167e8285488997a0b2965fb42e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc6ddc167e8285488997a0b2965fb42e");
        } else {
            com.sankuai.waimai.business.im.group.api.a.a(transferActivity, uri, String.valueOf(this.c), new a.InterfaceC0736a() { // from class: com.sankuai.waimai.business.im.group.prepare.BaseGroupChatTransferDelegate.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.im.group.api.a.InterfaceC0736a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbfa6726779eab200ca5dfdd6ba4168b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbfa6726779eab200ca5dfdd6ba4168b");
                    } else {
                        BaseGroupChatTransferDelegate.this.a((Activity) transferActivity);
                    }
                }

                @Override // com.sankuai.waimai.business.im.group.api.a.InterfaceC0736a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d63633d06756b0f2283a87f8f3583fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d63633d06756b0f2283a87f8f3583fe");
                    } else {
                        BaseGroupChatTransferDelegate.this.b(str);
                    }
                }

                @Override // com.sankuai.waimai.business.im.group.api.a.InterfaceC0736a
                public final void a(e.a aVar, TransferActivity transferActivity2, Uri uri2) {
                    Object[] objArr2 = {aVar, transferActivity2, uri2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d2da627c0fbb1012da3ffe998551d65", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d2da627c0fbb1012da3ffe998551d65");
                    } else {
                        BaseGroupChatTransferDelegate.this.a(aVar, transferActivity2, uri2);
                    }
                }
            }, transferActivity.w());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e.a aVar, TransferActivity transferActivity, Uri uri) {
        Object[] objArr = {aVar, transferActivity, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fe822e5f48f3fa08e2cf6e35c695ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fe822e5f48f3fa08e2cf6e35c695ca");
            return;
        }
        if (aVar.a()) {
            this.b = new g();
        } else if (aVar.d()) {
            this.b = new c();
        } else if (aVar.b()) {
            this.b = new a();
            c();
        } else if (aVar.c()) {
            if (com.sankuai.waimai.foundation.core.a.e()) {
                n.a();
            }
            this.b = new h();
        } else {
            this.b = null;
        }
        int c = com.sankuai.waimai.imbase.utils.g.c(uri.getQueryParameter("ref"));
        if (this.b != null) {
            this.b.a(transferActivity, uri, this.c, aVar, this.d, this.e, c);
            return;
        }
        b("group session type is not support! type is: " + aVar.k);
        ae.a((Activity) transferActivity, "不支持此群聊类型");
        a((Activity) transferActivity);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b139aa4867d2d38d0260b20c0ce21ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b139aa4867d2d38d0260b20c0ce21ba");
            return;
        }
        String str = "";
        if (this.f) {
            str = com.sankuai.waimai.business.im.utils.d.v;
        } else if (this.d == 1) {
            str = com.sankuai.waimai.business.im.utils.d.u;
        } else if (this.d == 2) {
            str = com.sankuai.waimai.business.im.utils.d.v;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JudasManualManager.a(str).a(com.sankuai.waimai.business.im.utils.d.a).a("tag_type", 1).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a496e89d1513fb6a9e61a766eeb13353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a496e89d1513fb6a9e61a766eeb13353");
            return;
        }
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }
}
