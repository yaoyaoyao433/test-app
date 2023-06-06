package com.sankuai.android.share.util;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.msc.modules.api.msi.navigation.MiniProgramApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.constant.a;
import com.sankuai.android.share.interfaces.b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8ebf7ec4f1c15d19fc361f465228bef", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8ebf7ec4f1c15d19fc361f465228bef") : i != 2 ? i != 128 ? i != 256 ? i != 512 ? i != 1024 ? i != 2048 ? i != 4096 ? "" : "password" : "copy" : "more" : "qq" : "pyq" : MiniProgramApi.NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX : "qqzone";
    }

    public static String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62b7be54b7181a9b7fca1cde24c0d972", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62b7be54b7181a9b7fca1cde24c0d972");
        }
        switch (i) {
            case 1:
                return MiniProgramApi.NavigateMiniProgramParams.TARGET_MP_PLATFORM_WX;
            case 2:
                return "pyq";
            case 3:
                return "qq";
            case 4:
                return "qqzone";
            case 5:
                return "copy";
            case 6:
                return "more";
            case 7:
                return "sms";
            case 8:
                return "password";
            default:
                return "";
        }
    }

    public static void a(Context context, b.a aVar, ShareBaseBean shareBaseBean, a.EnumC0540a enumC0540a) {
        Object[] objArr = {context, aVar, shareBaseBean, enumC0540a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f3954f4a92e864af389ea0537bbe97a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f3954f4a92e864af389ea0537bbe97a");
        } else {
            b(context, aVar, shareBaseBean, enumC0540a);
        }
    }

    public static void a(Context context, b.a aVar, ShareBaseBean shareBaseBean) {
        Object[] objArr = {context, aVar, shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85960f82464bd1da786850debe758741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85960f82464bd1da786850debe758741");
        } else {
            b(context, aVar, shareBaseBean, null);
        }
    }

    private static void b(Context context, b.a aVar, ShareBaseBean shareBaseBean, a.EnumC0540a enumC0540a) {
        Object[] objArr = {context, aVar, shareBaseBean, enumC0540a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c20fa41804a5aecbc89a7d6c7198b37c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c20fa41804a5aecbc89a7d6c7198b37c");
        } else if (Statistics.isInitialized()) {
            int a2 = a(aVar);
            HashMap hashMap = new HashMap();
            hashMap.put("title", a(a2));
            hashMap.put("title_name", context != null ? a(context, a2) : "");
            hashMap.put("share_id", j.a(context, aVar, shareBaseBean));
            hashMap.put("bg_name", a(shareBaseBean));
            hashMap.put("bu_name", j.a(context) ? "game" : j.a(shareBaseBean));
            hashMap.put("url", b(shareBaseBean));
            String a3 = a(aVar, shareBaseBean);
            hashMap.put("type", a3);
            if (TextUtils.equals(a3, "小程序")) {
                hashMap.put("wxapp", c(shareBaseBean));
            } else {
                hashMap.put("wxapp", "");
            }
            hashMap.put("cid", j.b(shareBaseBean));
            hashMap.put("pagenm", com.meituan.android.base.share.b.a());
            hashMap.put("appshare", d(shareBaseBean));
            hashMap.put("share_source", e(shareBaseBean));
            if (TextUtils.equals(a(aVar, shareBaseBean), "小程序")) {
                hashMap.put("main_title", "-999");
                hashMap.put("sub_title", "-999");
                if (shareBaseBean != null && shareBaseBean.getMiniProgramInfo() != null) {
                    hashMap.put("image_url", shareBaseBean.getMiniProgramInfo().imageUrl != null ? shareBaseBean.getMiniProgramInfo().imageUrl : "-999");
                } else {
                    hashMap.put("image_url", "");
                }
            } else {
                hashMap.put("main_title", shareBaseBean != null ? shareBaseBean.getTitle() : "");
                hashMap.put("sub_title", shareBaseBean != null ? shareBaseBean.getContent() : "");
                hashMap.put("image_url", shareBaseBean != null ? shareBaseBean.getImgUrl() : "");
            }
            if (enumC0540a == null) {
                hashMap.put("result", 1);
                hashMap.put("message", "-999");
                hashMap.put("message_id", -999);
            } else {
                hashMap.put("result", 0);
                hashMap.put("message", enumC0540a.m);
                hashMap.put("message_id", Integer.valueOf(enumC0540a.l));
            }
            i.c("b_group_rf8pdvpt_mv", hashMap).a("c_sxr976a").a();
        }
    }

    public static int a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "772d7e5712606761778bacaefcf85446", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "772d7e5712606761778bacaefcf85446")).intValue();
        }
        switch (aVar) {
            case QQ:
                return 512;
            case QZONE:
                return 2;
            case WEIXIN_FRIEDN:
                return 128;
            case WEIXIN_CIRCLE:
                return 256;
            case MORE_SHARE:
                return 1024;
            case COPY:
                return 2048;
            case PASSWORD:
                return 4096;
            default:
                return -1;
        }
    }

    public static String a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfc7e3b2113f10fa53369fe6bafca0d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfc7e3b2113f10fa53369fe6bafca0d9");
        }
        if (i != 2) {
            if (i != 128) {
                if (i != 256) {
                    if (i != 512) {
                        if (i != 1024) {
                            if (i != 2048) {
                                return i != 4096 ? "" : context.getString(R.string.share_channel_copy_password);
                            }
                            return context.getString(R.string.share_channel_copy_url);
                        }
                        return context.getString(R.string.share_channel_more);
                    }
                    return context.getString(R.string.share_channel_qq);
                }
                return context.getString(R.string.share_channel_weixin_circle);
            }
            return context.getString(R.string.share_channel_weixin_friend);
        }
        return context.getString(R.string.share_channel_qzone);
    }

    public static b.a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9ed0bd867e7231b33fe9585737125f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9ed0bd867e7231b33fe9585737125f1");
        }
        if (i != 2) {
            if (i != 128) {
                if (i != 256) {
                    if (i != 512) {
                        if (i != 1024) {
                            if (i != 2048) {
                                if (i != 4096) {
                                    return null;
                                }
                                return b.a.PASSWORD;
                            }
                            return b.a.COPY;
                        }
                        return b.a.MORE_SHARE;
                    }
                    return b.a.QQ;
                }
                return b.a.WEIXIN_CIRCLE;
            }
            return b.a.WEIXIN_FRIEDN;
        }
        return b.a.QZONE;
    }

    public static void a(Object obj, String str, String str2, Map<String, Object> map) {
        Object[] objArr = {obj, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f60df56d68263b9cef2373c86abbd61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f60df56d68263b9cef2373c86abbd61");
        } else if (Statistics.isInitialized()) {
            Statistics.getChannel("group").writeModelView(AppUtil.generatePageInfoKey(obj), str, map, str2);
        }
    }

    public static String a(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aef30042cda9414657c7ad4b6d622ce7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aef30042cda9414657c7ad4b6d622ce7") : (shareBaseBean == null || TextUtils.isEmpty(shareBaseBean.getBg())) ? "" : shareBaseBean.getBg();
    }

    public static String b(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86d9c3a45cfd30ca76797163f4aa0b60", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86d9c3a45cfd30ca76797163f4aa0b60") : (shareBaseBean == null || TextUtils.isEmpty(shareBaseBean.getUrl())) ? "" : shareBaseBean.getUrl();
    }

    public static String a(b.a aVar, ShareBaseBean shareBaseBean) {
        Object[] objArr = {aVar, shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a1dda648ccc48d08e4f314085b611b3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a1dda648ccc48d08e4f314085b611b3") : shareBaseBean == null ? "" : aVar == b.a.COPY ? "口令" : aVar != b.a.PASSWORD ? (TextUtils.isEmpty(shareBaseBean.getPassword()) || aVar != b.a.WEIXIN_FRIEDN) ? (aVar != b.a.WEIXIN_FRIEDN || TextUtils.isEmpty(shareBaseBean.getMiniProgramPath()) || TextUtils.isEmpty(shareBaseBean.getMiniProgramId())) ? (!TextUtils.isEmpty(shareBaseBean.getUrl()) || shareBaseBean.hasShortUrl()) ? DiagnoseLog.H5 : !TextUtils.isEmpty(shareBaseBean.getImgUrl()) ? "图片" : "" : "小程序" : "分享口令" : "分享口令";
    }

    public static String c(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "921641cb3ebda4119227a3947cedfd9e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "921641cb3ebda4119227a3947cedfd9e") : (shareBaseBean == null || TextUtils.isEmpty(shareBaseBean.getMiniProgramPath()) || TextUtils.isEmpty(shareBaseBean.getMiniProgramId())) ? "" : shareBaseBean.getMiniProgramId();
    }

    public static String d(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2a274ae056b583236f94ef084937447", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2a274ae056b583236f94ef084937447") : (shareBaseBean == null || TextUtils.isEmpty(shareBaseBean.getAppshare())) ? "" : shareBaseBean.getAppshare();
    }

    public static String e(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d14597943bbfe1b8ae8f58534b61d40f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d14597943bbfe1b8ae8f58534b61d40f") : shareBaseBean != null ? shareBaseBean.getOriginTransformAppShare() : "";
    }
}
