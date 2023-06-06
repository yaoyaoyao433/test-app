package com.sankuai.waimai.kit.share;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.share.bean.WeixinBean;
import com.sankuai.waimai.kit.share.strategy.ShareByWeixinStrategy;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public ShareByWeixinStrategy b;
    public com.sankuai.waimai.kit.share.strategy.b c;
    public WeakReference<Activity> d;
    public Context e;

    public b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a07b1d61964b64870515392434308b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a07b1d61964b64870515392434308b4");
        } else if (activity != null) {
            this.d = new WeakReference<>(activity);
            this.e = activity.getApplicationContext();
            if (this.b == null) {
                this.b = new ShareByWeixinStrategy(this.e, this.d.get());
            }
        }
    }

    public final void a(ShareBean shareBean, com.sankuai.waimai.kit.share.listener.b bVar) {
        Object[] objArr = {shareBean, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7409740ec9d3c66d8c0523c27039ade6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7409740ec9d3c66d8c0523c27039ade6");
            return;
        }
        if (this.c == null) {
            this.c = new com.sankuai.waimai.kit.share.strategy.b(this.d.get(), this.e);
        }
        this.c.a(shareBean, bVar);
    }

    public final void a(WeixinBean weixinBean, com.sankuai.waimai.kit.share.listener.b bVar) {
        Object[] objArr = {weixinBean, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f60c5b6595d9071a889ee0838e1fc67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f60c5b6595d9071a889ee0838e1fc67");
            return;
        }
        if (this.b == null) {
            this.b = new ShareByWeixinStrategy(this.e, this.d.get());
        }
        this.b.a(weixinBean, bVar);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4a479039db5d9f9a8d452cf8f209b76", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4a479039db5d9f9a8d452cf8f209b76")).booleanValue() : this.b.b();
    }
}
