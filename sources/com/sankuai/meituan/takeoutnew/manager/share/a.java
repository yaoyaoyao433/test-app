package com.sankuai.meituan.takeoutnew.manager.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.share.listener.b;
import com.sankuai.waimai.kit.share.util.f;
import com.sankuai.waimai.kit.share.util.g;
import com.sankuai.waimai.kit.share.util.h;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import com.sankuai.waimai.share.b;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b.a {
    public static ChangeQuickRedirect a;
    private static HashMap<String, com.sankuai.waimai.foundation.core.service.share.listener.b> b = new HashMap<>();

    public static /* synthetic */ void a(a aVar, ShareBean shareBean) {
        Object[] objArr = {shareBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "104ba140431a84b67ef4888c8f5f5fe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "104ba140431a84b67ef4888c8f5f5fe4");
        } else if (shareBean.getSourceId() == 2) {
            try {
                String orderId = shareBean.getOrderId();
                String url = shareBean.getUrl();
                int indexOf = url.indexOf("urlKey") + 7;
                if (indexOf > 0 && indexOf < url.length()) {
                    url = url.substring(indexOf);
                }
                ShareShadowActivity.a(orderId, url, com.sankuai.waimai.share.a.a(shareBean.getChannel()), com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e(aVar.getClass().getSimpleName(), e.getMessage(), new Object[0]);
            }
        } else if (shareBean.getSourceId() == 8) {
            EventInfo eventInfo = new EventInfo();
            eventInfo.nm = EventName.MGE;
            eventInfo.val_bid = "b_SKC0N";
            eventInfo.event_type = "click";
            Statistics.getChannel().writeEvent((String) null, eventInfo);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0498, code lost:
        if (r6 != false) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d4 A[Catch: Exception -> 0x0617, TryCatch #0 {Exception -> 0x0617, blocks: (B:28:0x00e6, B:30:0x010b, B:31:0x0110, B:33:0x0119, B:35:0x0138, B:55:0x0229, B:57:0x0251, B:66:0x02b9, B:68:0x02d4, B:164:0x05fd, B:69:0x02dc, B:71:0x02f7, B:72:0x02ff, B:74:0x0318, B:75:0x0320, B:77:0x033b, B:82:0x035a, B:84:0x0361, B:86:0x0367, B:87:0x036c, B:89:0x0386, B:152:0x05bb, B:154:0x05d4, B:155:0x05d8, B:157:0x05dc, B:160:0x05e1, B:162:0x05f7, B:91:0x038c, B:93:0x039c, B:95:0x03b6, B:96:0x03ba, B:98:0x03f4, B:118:0x049d, B:120:0x04bc, B:129:0x0500, B:131:0x051e, B:139:0x054b, B:141:0x054e, B:144:0x056d, B:143:0x0554, B:132:0x0529, B:134:0x0534, B:136:0x0538, B:137:0x0547, B:121:0x04c7, B:124:0x04d4, B:126:0x04da, B:128:0x04fa, B:127:0x04f1, B:99:0x0400, B:101:0x040b, B:103:0x042e, B:108:0x044a, B:110:0x0472, B:111:0x047e, B:113:0x0484, B:114:0x0489, B:105:0x043c, B:106:0x0441, B:145:0x0576, B:147:0x0590, B:148:0x0595, B:150:0x05b0, B:151:0x05b3, B:78:0x0346, B:59:0x0259, B:61:0x027a, B:62:0x0281, B:64:0x02a5, B:65:0x02ac, B:36:0x0140, B:38:0x0184, B:41:0x018d, B:49:0x01fa, B:51:0x01fe, B:53:0x0206, B:54:0x0223, B:42:0x0191, B:44:0x019c, B:45:0x01a8, B:47:0x01b0, B:48:0x01e3, B:165:0x0609, B:167:0x0611), top: B:172:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02dc A[Catch: Exception -> 0x0617, TryCatch #0 {Exception -> 0x0617, blocks: (B:28:0x00e6, B:30:0x010b, B:31:0x0110, B:33:0x0119, B:35:0x0138, B:55:0x0229, B:57:0x0251, B:66:0x02b9, B:68:0x02d4, B:164:0x05fd, B:69:0x02dc, B:71:0x02f7, B:72:0x02ff, B:74:0x0318, B:75:0x0320, B:77:0x033b, B:82:0x035a, B:84:0x0361, B:86:0x0367, B:87:0x036c, B:89:0x0386, B:152:0x05bb, B:154:0x05d4, B:155:0x05d8, B:157:0x05dc, B:160:0x05e1, B:162:0x05f7, B:91:0x038c, B:93:0x039c, B:95:0x03b6, B:96:0x03ba, B:98:0x03f4, B:118:0x049d, B:120:0x04bc, B:129:0x0500, B:131:0x051e, B:139:0x054b, B:141:0x054e, B:144:0x056d, B:143:0x0554, B:132:0x0529, B:134:0x0534, B:136:0x0538, B:137:0x0547, B:121:0x04c7, B:124:0x04d4, B:126:0x04da, B:128:0x04fa, B:127:0x04f1, B:99:0x0400, B:101:0x040b, B:103:0x042e, B:108:0x044a, B:110:0x0472, B:111:0x047e, B:113:0x0484, B:114:0x0489, B:105:0x043c, B:106:0x0441, B:145:0x0576, B:147:0x0590, B:148:0x0595, B:150:0x05b0, B:151:0x05b3, B:78:0x0346, B:59:0x0259, B:61:0x027a, B:62:0x0281, B:64:0x02a5, B:65:0x02ac, B:36:0x0140, B:38:0x0184, B:41:0x018d, B:49:0x01fa, B:51:0x01fe, B:53:0x0206, B:54:0x0223, B:42:0x0191, B:44:0x019c, B:45:0x01a8, B:47:0x01b0, B:48:0x01e3, B:165:0x0609, B:167:0x0611), top: B:172:0x00e6 }] */
    @Override // com.sankuai.waimai.share.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final android.app.Activity r26, final com.sankuai.waimai.platform.domain.core.Share.ShareTip r27, final com.sankuai.waimai.foundation.core.service.share.listener.a r28, final com.sankuai.waimai.foundation.core.service.share.listener.b r29, final android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.manager.share.a.a(android.app.Activity, com.sankuai.waimai.platform.domain.core.Share.ShareTip, com.sankuai.waimai.foundation.core.service.share.listener.a, com.sankuai.waimai.foundation.core.service.share.listener.b, android.os.Bundle):void");
    }

    @Override // com.sankuai.waimai.share.b.a
    public final void a(Activity activity, ShareTip shareTip, int i, com.sankuai.waimai.foundation.core.service.share.listener.b bVar, Bundle bundle) {
        Object[] objArr = {activity, shareTip, Integer.valueOf(i), bVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df9de07e8b740a3d4fdcb8c00f363a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df9de07e8b740a3d4fdcb8c00f363a7");
            return;
        }
        ShareBean a2 = a(shareTip, activity);
        int a3 = com.sankuai.waimai.share.a.a(i);
        if ((bundle != null ? bundle.getInt("source") : 0) == 2 && a3 == 2 && !aa.a(shareTip.getMiniProgramPath())) {
            String string = !TextUtils.isEmpty(bundle.getString("miniProgramTitle")) ? bundle.getString("miniProgramTitle") : "";
            String string2 = !TextUtils.isEmpty(bundle.getString("miniProgramDesc")) ? bundle.getString("miniProgramDesc") : "";
            a2.setTitle(string);
            a2.setContent(string2);
        }
        Intent intent = new Intent(activity, ShareShadowActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("appId", com.sankuai.waimai.share.a.b(i));
        intent.putExtra("shareTip", a2);
        if (bVar != null) {
            String valueOf = String.valueOf(bVar.hashCode());
            b.put(valueOf, bVar);
            intent.putExtra("resultListenerHash", valueOf);
        }
        activity.startActivity(intent);
    }

    @Override // com.sankuai.waimai.share.b.a
    public final boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed081919996e2a79a167b8bb4a9df968", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed081919996e2a79a167b8bb4a9df968")).booleanValue() : new com.sankuai.waimai.kit.share.b(activity).a();
    }

    @Override // com.sankuai.waimai.share.b.a
    public final boolean a(Activity activity, Bitmap bitmap, int i, int i2, final com.sankuai.waimai.foundation.core.service.share.listener.b bVar, String str) {
        Object[] objArr = {activity, bitmap, Integer.valueOf(i), Integer.valueOf(i2), bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc12f55c3e30b6b4a8f9104703713ec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc12f55c3e30b6b4a8f9104703713ec")).booleanValue() : f.a(activity, com.sankuai.waimai.share.a.b(i), i2, bitmap, new com.sankuai.waimai.kit.share.listener.b() { // from class: com.sankuai.meituan.takeoutnew.manager.share.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.kit.share.listener.b
            public final void a(ShareBean shareBean, b.a aVar) {
                Object[] objArr2 = {shareBean, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "882c4965b9bcb68c5706513806448e26", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "882c4965b9bcb68c5706513806448e26");
                    return;
                }
                if (aVar == b.a.COMPLETE) {
                    a.a(a.this, shareBean);
                }
                if (bVar != null) {
                    bVar.a(com.sankuai.waimai.share.a.a(shareBean.getChannel()), aVar.f);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.share.b.a
    public final boolean a(Activity activity, boolean z, String str, int i, int i2, final com.sankuai.waimai.foundation.core.service.share.listener.b bVar, String str2) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), Integer.valueOf(i2), bVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6f526b2dcc20563646c58dc6945ca81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6f526b2dcc20563646c58dc6945ca81")).booleanValue();
        }
        if (z) {
            int b2 = com.sankuai.waimai.share.a.b(i);
            com.sankuai.waimai.kit.share.listener.b bVar2 = new com.sankuai.waimai.kit.share.listener.b() { // from class: com.sankuai.meituan.takeoutnew.manager.share.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.kit.share.listener.b
                public final void a(ShareBean shareBean, b.a aVar) {
                    Object[] objArr2 = {shareBean, aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58bfed06fd16e20ce529514b35a9e5c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58bfed06fd16e20ce529514b35a9e5c8");
                        return;
                    }
                    if (aVar == b.a.COMPLETE) {
                        a.a(a.this, shareBean);
                    }
                    if (bVar != null) {
                        bVar.a(com.sankuai.waimai.share.a.a(shareBean.getChannel()), aVar.f);
                    }
                }
            };
            Object[] objArr2 = {activity, str, Integer.valueOf(b2), bVar2};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3e1f7cf61b3fc4d06d0301226efd1603", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3e1f7cf61b3fc4d06d0301226efd1603")).booleanValue();
            }
            if ((b2 == 4 || b2 == 2) && !TextUtils.isEmpty(str)) {
                com.sankuai.waimai.launcher.util.aop.b.a(new g(activity, b2, str, bVar2), new Void[0]);
                return true;
            }
            return false;
        }
        return f.a(activity, com.sankuai.waimai.share.a.b(i), i2, str, new com.sankuai.waimai.kit.share.listener.b() { // from class: com.sankuai.meituan.takeoutnew.manager.share.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.kit.share.listener.b
            public final void a(ShareBean shareBean, b.a aVar) {
                Object[] objArr3 = {shareBean, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2f7fb87e000a9267da56541b5f6f2722", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2f7fb87e000a9267da56541b5f6f2722");
                    return;
                }
                if (aVar == b.a.COMPLETE) {
                    a.a(a.this, shareBean);
                }
                if (bVar != null) {
                    bVar.a(com.sankuai.waimai.share.a.a(shareBean.getChannel()), aVar.f);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.share.b.a
    public final boolean a(Activity activity, ShareTip shareTip, Bitmap bitmap, final com.sankuai.waimai.foundation.core.service.share.listener.b bVar) {
        Object[] objArr = {activity, shareTip, bitmap, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8affa87a8f72ea22944db49f7fc57b3a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8affa87a8f72ea22944db49f7fc57b3a")).booleanValue();
        }
        ShareBean a2 = a(shareTip, activity);
        if (TextUtils.isEmpty(a2.getContent())) {
            a2.setContent(a2.getTitle());
        }
        if (TextUtils.isEmpty(a2.getUrl())) {
            a2.setUrl(shareTip.getWeixinUrl());
        }
        a2.setChannel(2);
        com.sankuai.waimai.kit.share.listener.b bVar2 = new com.sankuai.waimai.kit.share.listener.b() { // from class: com.sankuai.meituan.takeoutnew.manager.share.a.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.kit.share.listener.b
            public final void a(ShareBean shareBean, b.a aVar) {
                Object[] objArr2 = {shareBean, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a57091e0448d61c288402d05ea9329e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a57091e0448d61c288402d05ea9329e");
                } else if (bVar != null) {
                    bVar.a(com.sankuai.waimai.share.a.a(shareBean.getChannel()), aVar.f);
                }
            }
        };
        Object[] objArr2 = {activity, a2, bitmap, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c931162713d46c8880fbbcd4ba022be9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c931162713d46c8880fbbcd4ba022be9")).booleanValue();
        }
        if (a2 == null) {
            return false;
        }
        if (a2.getChannel() == 4 || a2.getChannel() == 2) {
            com.sankuai.waimai.launcher.util.aop.b.a(new h(activity, a2, bitmap, bVar2), new Void[0]);
            return true;
        }
        return false;
    }

    public static com.sankuai.waimai.foundation.core.service.share.listener.b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e63bf1bbbcef21936358eae17df802e8", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.foundation.core.service.share.listener.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e63bf1bbbcef21936358eae17df802e8") : b.remove(str);
    }

    private ShareBean a(ShareTip shareTip, Activity activity) {
        Object[] objArr = {shareTip, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d9821454946cca09336b4444342b49", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d9821454946cca09336b4444342b49");
        }
        String icon = shareTip.getIcon();
        String weixinUrl = shareTip.getWeixinUrl();
        int miniprogramType = shareTip.getMiniprogramType();
        miniprogramType = (miniprogramType < 0 || miniprogramType > 2) ? 0 : 0;
        if (com.sankuai.meituan.takeoutnew.a.f) {
            miniprogramType = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "WxMiniProgramType", 0);
        }
        if (!aa.a(shareTip.getMiniProgramImage()) && !aa.a(shareTip.getMiniProgramPath())) {
            icon = shareTip.getMiniProgramImage();
            weixinUrl = shareTip.getMiniProgramPath();
        }
        ShareBean shareBean = new ShareBean(shareTip.getTitle(), shareTip.getContent(), shareTip.getUrl());
        if (URLUtil.isHttpsUrl(icon) || URLUtil.isHttpUrl(icon)) {
            shareBean.setMiniProgramLocalImage(false);
            shareBean.setImgUrl(icon);
        } else {
            shareBean.setMiniProgramLocalImage(true);
            shareBean.setImagePath(icon);
        }
        shareBean.setMiniProgramId(shareTip.getMiniProgramId());
        shareBean.setMiniProgramPath(weixinUrl);
        shareBean.setMiniprogramType(miniprogramType);
        shareBean.setMiniProgramWithShareTicket(shareTip.miniprogramWithShareTicket());
        return shareBean;
    }

    @Override // com.sankuai.waimai.share.b.a
    public final boolean a(Activity activity, String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {activity, str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "675bb7f793b96288a9aa85462a5117c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "675bb7f793b96288a9aa85462a5117c3")).booleanValue();
        }
        ShareBean shareBean = new ShareBean();
        shareBean.setChannel(2);
        shareBean.setContent(str);
        shareBean.setImagePath(str3);
        shareBean.setMiniProgramLocalImage(true);
        shareBean.setMiniProgramPath(str2);
        shareBean.setTitle(str);
        shareBean.setUrl(str4);
        f.a(activity, new com.sankuai.waimai.kit.share.b(activity), 0, 2, null, "", shareBean, null);
        return true;
    }
}
