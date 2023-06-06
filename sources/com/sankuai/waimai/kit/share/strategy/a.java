package com.sankuai.waimai.kit.share.strategy;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.share.bean.WeixinBean;
import com.sankuai.waimai.kit.share.listener.b;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends ShareByWeixinStrategy {
    public static ChangeQuickRedirect a;

    public a(Context context, Activity activity) {
        super(context, activity);
        Object[] objArr = {context, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78aa48d705bf496d44f37847f9e87550", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78aa48d705bf496d44f37847f9e87550");
        }
    }

    @Override // com.sankuai.waimai.kit.share.strategy.ShareByWeixinStrategy
    public final void a(WeixinBean weixinBean, com.sankuai.waimai.kit.share.listener.b bVar) {
        Object[] objArr = {weixinBean, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68d7da0b3301ff85c6100cc278513916", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68d7da0b3301ff85c6100cc278513916");
        } else if (weixinBean == null || this.f == null) {
            bVar.a(null, b.a.FAILED);
        } else {
            this.i = bVar;
            this.h = weixinBean;
            this.g = weixinBean.getType();
            a(this.c, this.h);
            a();
            String imagePath = weixinBean.getImagePath();
            byte[] imageData = weixinBean.getImageData();
            byte[] thumbData = weixinBean.getThumbData();
            this.d = new WXMediaMessage();
            this.d.title = weixinBean.getTitle();
            this.d.description = weixinBean.getContent();
            this.d.thumbData = thumbData;
            WXImageObject wXImageObject = new WXImageObject();
            wXImageObject.imageData = imageData;
            wXImageObject.imagePath = imagePath;
            this.d.mediaObject = wXImageObject;
            weixinBean.setImageData(null, null);
            if (!this.d.mediaObject.checkArgs()) {
                bVar.a(null, b.a.FAILED);
            } else {
                c();
            }
        }
    }
}
