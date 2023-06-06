package com.sankuai.waimai.business.restaurant.poicontainer.pga;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewStub;
import com.google.gson.JsonObject;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.platform.shop.channellabel.ChannelLabelController;
import com.sankuai.waimai.platform.utils.h;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    public com.sankuai.waimai.platform.widget.emptylayout.d e;
    public d.a f;
    public ChannelLabelController g;
    private boolean h;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_restaurant_main_layout;
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f16650cd968ea9b9e9425ab0f324b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f16650cd968ea9b9e9425ab0f324b4");
        } else {
            this.h = false;
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc18851dce1c0e450f4fac7c9695731d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc18851dce1c0e450f4fac7c9695731d");
            return;
        }
        super.b();
        Object[] objArr2 = {(byte) 1, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6298f71c9245c3395c4be68f12ef932a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6298f71c9245c3395c4be68f12ef932a");
        } else {
            com.sankuai.waimai.platform.capacity.immersed.a.b(e(), false);
            com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) e(), true);
        }
        this.e = new com.sankuai.waimai.platform.widget.emptylayout.d(this.b);
        this.e.a("c_CijEL");
    }

    public final void a(com.sankuai.waimai.platform.domain.core.channel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5953db05b56424b4092ac91776c7832e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5953db05b56424b4092ac91776c7832e");
            return;
        }
        ViewStub viewStub = (ViewStub) this.b.findViewById(R.id.layout_channel_label);
        if (viewStub == null) {
            return;
        }
        this.g = new ChannelLabelController((Activity) e(), viewStub);
        this.g.a(aVar, 2);
    }

    public BaseActivity e() {
        if (this.c instanceof BaseActivity) {
            return (BaseActivity) this.c;
        }
        return null;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488387ad87ebe83a2cebd66666c79ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488387ad87ebe83a2cebd66666c79ab2");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.log.c.a("Loading hide", new Object[0]);
        BaseActivity e = e();
        if (this.h) {
            l.b(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9deb803961fe08bb371fea81087bfdf7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9deb803961fe08bb371fea81087bfdf7");
                    } else {
                        d.this.e.h();
                    }
                }
            }, e != null ? e.w() : "");
        } else if (e != null) {
            e.v();
        }
    }

    public final void a(String str, String str2, com.sankuai.waimai.platform.modular.network.error.a aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef7c4a169a59bde4fb93e7093281cc7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef7c4a169a59bde4fb93e7093281cc7c");
            return;
        }
        Throwable d2 = aVar.d();
        Throwable th = aVar;
        if (d2 != null) {
            th = aVar.d();
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("msg", str);
        if (th != null) {
            jsonObject.addProperty(LogMonitor.EXCEPTION_TAG, th.toString());
            jsonObject.addProperty("stacktrace", Arrays.toString(th.getStackTrace()));
        }
        jsonObject.addProperty("data", str2);
        com.sankuai.waimai.business.restaurant.base.log.c.b("Loading hide with exception: %s", jsonObject.toString());
        BaseActivity e = e();
        if (e != null) {
            e.v();
        }
        String a = h.a(this.c, th);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        this.e.b(str, new com.sankuai.waimai.platform.widget.emptylayout.b(th, true));
    }
}
