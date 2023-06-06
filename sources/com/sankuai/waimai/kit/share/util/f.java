package com.sankuai.waimai.kit.share.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.kit.share.ShareConstant;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.share.bean.WeixinBean;
import com.sankuai.waimai.kit.share.listener.b;
import com.sankuai.waimai.kit.share.strategy.ShareByWeixinStrategy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, int i, @NonNull ShareBean shareBean, com.sankuai.waimai.kit.share.listener.b bVar) {
        Object[] objArr = {activity, Integer.valueOf(i), shareBean, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d54204903d2a3cfed1460868fa51281a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d54204903d2a3cfed1460868fa51281a");
            return;
        }
        Object[] objArr2 = {activity, 0, Integer.valueOf(i), shareBean, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "03fb0934919966de4d537deb875e1eba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "03fb0934919966de4d537deb875e1eba");
        } else {
            a(activity, new com.sankuai.waimai.kit.share.b(activity), 0, i, "", "", shareBean, bVar);
        }
    }

    public static void a(Context context, com.sankuai.waimai.kit.share.b bVar, int i, int i2, String str, String str2, ShareBean shareBean, com.sankuai.waimai.kit.share.listener.b bVar2) {
        int i3;
        Object[] objArr = {context, bVar, Integer.valueOf(i), Integer.valueOf(i2), str, str2, shareBean, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fce147255923a03c6fdf72b07a3b5000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fce147255923a03c6fdf72b07a3b5000");
        } else if (context == null || bVar == null) {
            ShareByWeixinStrategy.a(i2);
            com.sankuai.waimai.kit.share.strategy.b.a(i2);
            bVar2.a(shareBean, b.a.FAILED);
        } else {
            String b = com.sankuai.waimai.kit.utils.a.b(context, ShareConstant.i, context.getString(R.string.wm_share_title));
            String b2 = com.sankuai.waimai.kit.utils.a.b(context, ShareConstant.f, "");
            String b3 = com.sankuai.waimai.kit.utils.a.b(context, ShareConstant.g, "");
            String b4 = com.sankuai.waimai.kit.utils.a.b(context, ShareConstant.h, "");
            String str3 = "";
            String str4 = "";
            if (shareBean != null) {
                b = shareBean.getTitle();
                b2 = shareBean.getImgUrl();
                b3 = shareBean.getContent();
                b4 = shareBean.getUrl();
                str3 = shareBean.getMiniProgramPath();
                str4 = shareBean.getMiniProgramId();
                i3 = shareBean.getMiniprogramType();
            } else {
                i3 = 0;
            }
            String a2 = ImageQualityUtil.a(context, b2, 2, (int) context.getResources().getDimension(R.dimen.wm_share_thumbnail_in_restaurant_width));
            if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b4)) {
                ShareByWeixinStrategy.a(i2);
                com.sankuai.waimai.kit.share.strategy.b.a(i2);
                com.sankuai.waimai.kit.utils.e.a(context, context.getString(R.string.wm_share_info_empty));
                return;
            }
            int i4 = !TextUtils.isEmpty(str2) ? 2 : 1;
            if (i2 != 4) {
                if (i2 != 8) {
                    switch (i2) {
                        case 1:
                            break;
                        case 2:
                            String a3 = ImageQualityUtil.a(context, b2, 2, 400);
                            WeixinBean weixinBean = WeixinBean.getWeixinBean(shareBean);
                            weixinBean.setSourceId(i);
                            weixinBean.setType(0);
                            weixinBean.setChannel(i2);
                            weixinBean.setTitle(b);
                            weixinBean.setContent(b3);
                            weixinBean.setImgUrl(a3);
                            weixinBean.setUrl(b4);
                            weixinBean.setMiniProgramPath(str3);
                            weixinBean.setMiniprogramType(i3);
                            weixinBean.setOrderId(str);
                            weixinBean.setDimType(i4);
                            if (!TextUtils.isEmpty(str4)) {
                                weixinBean.setUserName(str4);
                            }
                            bVar.a(weixinBean, bVar2);
                            return;
                        default:
                            return;
                    }
                }
                ShareBean shareBean2 = shareBean;
                if (shareBean2 == null) {
                    shareBean2 = new ShareBean();
                }
                shareBean2.setSourceId(i);
                shareBean2.setTitle(b);
                shareBean2.setContent(b3);
                shareBean2.setImgUrl(a2);
                shareBean2.setUrl(b4);
                shareBean2.setOrderId(str);
                shareBean2.setChannel(i2);
                shareBean2.setDimType(i4);
                bVar.a(shareBean2, bVar2);
                return;
            }
            WeixinBean weixinBean2 = new WeixinBean();
            weixinBean2.setSourceId(i);
            weixinBean2.setType(1);
            weixinBean2.setChannel(i2);
            weixinBean2.setTitle(b);
            weixinBean2.setContent(b3);
            weixinBean2.setImgUrl(a2);
            weixinBean2.setUrl(b4);
            weixinBean2.setOrderId(str);
            weixinBean2.setDimType(i4);
            bVar.a(weixinBean2, bVar2);
        }
    }

    public static boolean a(Activity activity, int i, int i2, Bitmap bitmap, com.sankuai.waimai.kit.share.listener.b bVar) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), bitmap, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61d7746dbe0d90d676a4ef75dc4eb550", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61d7746dbe0d90d676a4ef75dc4eb550")).booleanValue();
        }
        if (i == 4 || i == 2) {
            com.sankuai.waimai.launcher.util.aop.b.a(new g(activity, i, i2, bitmap, bVar), new Void[0]);
            return true;
        }
        return false;
    }

    public static boolean a(final Activity activity, final int i, final int i2, String str, final com.sankuai.waimai.kit.share.listener.b bVar) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4a8291383711b39ebd7cd9c536d0b2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4a8291383711b39ebd7cd9c536d0b2e")).booleanValue();
        }
        if ((i == 4 || i == 2) && !TextUtils.isEmpty(str)) {
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.c = str;
            c.a(new b.a() { // from class: com.sankuai.waimai.kit.share.util.f.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b248ed68c0c616722a8bda750222e13", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b248ed68c0c616722a8bda750222e13");
                    } else {
                        com.sankuai.waimai.launcher.util.aop.b.a(new g(activity, i, i2, bitmap, bVar), new Void[0]);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ad0dfcd1602a193b56abbf7d5e3b741", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ad0dfcd1602a193b56abbf7d5e3b741");
                    } else if (bVar != null) {
                        WeixinBean weixinBean = new WeixinBean();
                        weixinBean.setChannel(i);
                        weixinBean.setSourceId(i2);
                        bVar.a(weixinBean, b.a.FAILED);
                    }
                }
            });
            return true;
        }
        return false;
    }
}
