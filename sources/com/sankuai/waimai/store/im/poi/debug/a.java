package com.sankuai.waimai.store.im.poi.debug;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.router.h;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    public static /* synthetic */ String a(a aVar) {
        return "flashbuy-im-message-debug";
    }

    public static /* synthetic */ String b(a aVar) {
        return "flashbuy-im-message-debug";
    }

    public static /* synthetic */ Bundle c(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "0cf01ec63ebfdc0d2089ec1bebbbe7d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "0cf01ec63ebfdc0d2089ec1bebbbe7d9");
        }
        SessionId f = b.a().f();
        if (f == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("uid", String.valueOf(f.b));
        bundle.putString(Message.PEER_UID, String.valueOf(f.c));
        bundle.putString(Message.PEER_APPID, String.valueOf((int) f.d));
        bundle.putString(RemoteMessageConst.Notification.CHANNEL_ID, String.valueOf((int) f.g));
        bundle.putString("sessionType", String.valueOf(f.e));
        return bundle;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58394d43587942764d07bc67566f7abe", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58394d43587942764d07bc67566f7abe");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final void a(ViewStub viewStub) {
        View inflate;
        Object[] objArr = {viewStub};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "281ed8fbf62d73cf6c65c3e881904704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "281ed8fbf62d73cf6c65c3e881904704");
        } else if (viewStub == null || !k.a() || (inflate = viewStub.inflate()) == null) {
        } else {
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.debug.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ad14884d73c58eb13d3ca76d04a4387", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ad14884d73c58eb13d3ca76d04a4387");
                    } else {
                        d.a(view.getContext(), com.sankuai.waimai.store.router.a.a(h.g, "sgc", a.a(a.this), a.b(a.this)), a.c(a.this));
                    }
                }
            });
        }
    }
}
