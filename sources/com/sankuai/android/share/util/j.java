package com.sankuai.android.share.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.meituan.android.common.badge.data.Data;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.util.d;
import com.sankuai.android.share.util.g;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.common.utils.StringUtils;
import com.unionpay.tsmservice.data.Constant;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", com.huawei.hms.opendevice.c.a, "d", "e", "f", com.meituan.android.neohybrid.neo.bridge.presenter.g.n, "h", "i", "j", Data.TB_DATA_COL_KEY, "l", "m", "n", "o", "p", "q", r.o, "s", "t", "u", "v", "w", Constants.GestureMoveEvent.KEY_X, Constants.GestureMoveEvent.KEY_Y, "z"};

    public static Intent a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb02c7744f4e9b3488893bca5729a480", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb02c7744f4e9b3488893bca5729a480");
        }
        Object[] objArr2 = {uri, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4ca7932a2d84527f86b17cea28f7f76e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4ca7932a2d84527f86b17cea28f7f76e");
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addCategory("android.intent.category.DEFAULT");
        return intent;
    }

    public static void a(TextView textView, String str) {
        Object[] objArr = {textView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97440f2fd55630c98e55945f53e01001", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97440f2fd55630c98e55945f53e01001");
        } else if (textView == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
        }
    }

    private static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a7a5f4693d9f8888b8df6139747b9af", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a7a5f4693d9f8888b8df6139747b9af");
        }
        String str = "";
        while (j != 0) {
            str = b[(int) (j % 36)] + str;
            j = Math.round(Math.floor(j / 36));
        }
        switch (str.length() % 8) {
            case 0:
                return str;
            case 1:
                return "0000000" + str;
            case 2:
                return "000000" + str;
            case 3:
                return "00000" + str;
            case 4:
                return "0000" + str;
            case 5:
                return Constant.DEFAULT_CVN2 + str;
            case 6:
                return "00" + str;
            case 7:
                return "0" + str;
            default:
                return "";
        }
    }

    private static String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68900931b4803a90ade42c39be62eba2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68900931b4803a90ade42c39be62eba2");
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(b[(int) ((Math.random() * 36.0d) + 0.0d)]);
        }
        String stringBuffer2 = stringBuffer.toString();
        return TextUtils.isEmpty(stringBuffer2) ? "" : stringBuffer2;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "712a6f5885035e2cb3c6eff1244aa9a5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "712a6f5885035e2cb3c6eff1244aa9a5") : a(4);
    }

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4166d536b74b8a7eed54484941fa3fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4166d536b74b8a7eed54484941fa3fb");
        }
        String a2 = a(com.meituan.android.time.c.b());
        String b2 = b(i);
        return a2 + b2;
    }

    public static String a(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7d30a8e05a2132ea5e585da62f4da82", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7d30a8e05a2132ea5e585da62f4da82");
        }
        if (shareBaseBean != null && !TextUtils.isEmpty(shareBaseBean.getTransformBu())) {
            return shareBaseBean.getTransformBu();
        }
        if (com.sankuai.android.share.a.b != null) {
            return b.a(com.sankuai.android.share.a.b.a(), "category");
        }
        c.a("bu 获取为空，appShareListener = null");
        return "";
    }

    public static String b(ShareBaseBean shareBaseBean) {
        Object[] objArr = {shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95828ae91c26412b1b995ff1ad429735", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95828ae91c26412b1b995ff1ad429735");
        }
        if (shareBaseBean != null && !TextUtils.isEmpty(shareBaseBean.getTransformCid())) {
            return shareBaseBean.getTransformCid();
        }
        if (com.sankuai.android.share.a.b != null) {
            return b.a(com.sankuai.android.share.a.b.a(), "val_cid");
        }
        c.a("cid 获取为空，appShareListener = null");
        return "";
    }

    public static String a(Context context, b.a aVar, ShareBaseBean shareBaseBean) {
        Object[] objArr = {context, aVar, shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a721fe13dd66041f11e3008ad2d2636", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a721fe13dd66041f11e3008ad2d2636") : a(aVar, shareBaseBean, a(context));
    }

    public static void a(Context context, @NonNull ShareBaseBean shareBaseBean, b.a aVar) {
        boolean asBoolean;
        String builder;
        boolean z = true;
        Object[] objArr = {context, shareBaseBean, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "377bfbf6b3bb752c6319bbcd35789621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "377bfbf6b3bb752c6319bbcd35789621");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.share.common.util.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fefba235e7840d1453900d44411e701b", RobustBitConfig.DEFAULT_VALUE)) {
            asBoolean = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fefba235e7840d1453900d44411e701b")).booleanValue();
        } else {
            JsonObject f = com.sankuai.android.share.common.util.a.f();
            asBoolean = (f == null || f.get("lch_enable") == null) ? false : f.get("lch_enable").getAsBoolean();
        }
        if (asBoolean) {
            Object[] objArr3 = {context, shareBaseBean, aVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.android.share.keymodule.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "856ddfb8e840d7a91f3d09a1119d08cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "856ddfb8e840d7a91f3d09a1119d08cb");
            } else if (shareBaseBean != null && !TextUtils.isEmpty(shareBaseBean.getUrl())) {
                Uri parse = Uri.parse(shareBaseBean.getUrl());
                StringBuilder sb = new StringBuilder();
                if (parse == null || TextUtils.isEmpty(parse.getQueryParameter("lch"))) {
                    z = false;
                } else {
                    sb.append(parse.getQueryParameter("lch") + "___");
                }
                if (com.sankuai.android.share.common.util.a.c()) {
                    sb.append("appshare_" + a(context, aVar, shareBaseBean));
                } else {
                    sb.append("appshare_" + shareBaseBean.getAppshare());
                }
                if (z) {
                    builder = shareBaseBean.getUrl().replace("lch=" + parse.getQueryParameter("lch"), "lch=" + sb.toString());
                } else {
                    builder = parse != null ? parse.buildUpon().appendQueryParameter("lch", sb.toString()).toString() : null;
                }
                if (!TextUtils.isEmpty(builder)) {
                    shareBaseBean.setUrl(builder);
                }
            }
            if (!TextUtils.isEmpty(shareBaseBean.getUrl()) && shareBaseBean.getUrl().contains("lch")) {
                com.sankuai.meituan.skyeye.library.core.e.a().a("biz_share", "share_flow_append_lch", "share_flow_append_lch_success", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("url", shareBaseBean.getUrl());
            hashMap.put("belong", com.meituan.android.base.share.b.a());
            com.sankuai.meituan.skyeye.library.core.e.a().a("biz_share", "share_flow_append_lch", "share_flow_append_lch_error", "拼接lch失败", hashMap);
        }
    }

    private static String a(b.a aVar, ShareBaseBean shareBaseBean, boolean z) {
        int i;
        int i2 = 3;
        Object[] objArr = {aVar, shareBaseBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa8e0fb61021e76fb5b020dade40ffe6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa8e0fb61021e76fb5b020dade40ffe6");
        }
        try {
            Object[] objArr2 = {aVar, shareBaseBean};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fe1392c723980826c10419e6d026cba9", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fe1392c723980826c10419e6d026cba9")).intValue();
            } else if (aVar == b.a.COPY) {
                i = 1;
            } else {
                if (aVar != b.a.PASSWORD && (TextUtils.isEmpty(shareBaseBean.getPassword()) || aVar != b.a.WEIXIN_FRIEDN)) {
                    if (aVar != b.a.WEIXIN_FRIEDN || TextUtils.isEmpty(shareBaseBean.getMiniProgramPath()) || TextUtils.isEmpty(shareBaseBean.getMiniProgramId())) {
                        if (TextUtils.isEmpty(shareBaseBean.getUrl()) && !shareBaseBean.hasShortUrl()) {
                            i = !TextUtils.isEmpty(shareBaseBean.getImgUrl()) ? 5 : 0;
                        }
                        i = 4;
                    } else {
                        i = 3;
                    }
                }
                i = 2;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.android.share.common.util.a.a;
            if ((PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "30e4e07edf077559698d0c99d922cff7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "30e4e07edf077559698d0c99d922cff7")).booleanValue() : b.a(com.sankuai.android.share.common.util.a.d(), "share_lch_transform_new_tag", true)) && !com.sankuai.android.share.common.util.a.e().contains(b(shareBaseBean))) {
                if (i != 2 && i != 4) {
                    if (i == 3) {
                        sb.append(shareBaseBean.getTitle());
                        sb.append(shareBaseBean.getMiniProgramPath());
                        sb.append("&");
                    } else if (!TextUtils.isEmpty(shareBaseBean.getTitle())) {
                        sb.append(shareBaseBean.getTitle());
                        sb.append("&");
                    }
                }
                if (!TextUtils.isEmpty(b(shareBaseBean))) {
                    sb.append(b(shareBaseBean));
                    sb.append("&");
                } else if (!TextUtils.isEmpty(shareBaseBean.getTitle())) {
                    sb.append(shareBaseBean.getTitle());
                    sb.append("&");
                }
            } else if (!TextUtils.isEmpty(shareBaseBean.getTitle())) {
                sb.append(shareBaseBean.getTitle());
                sb.append("&");
            }
            String a2 = z ? "game" : a(shareBaseBean);
            shareBaseBean.setTransformBu(a2);
            shareBaseBean.setTransformCid(b(shareBaseBean));
            if (!TextUtils.isEmpty(a2)) {
                sb.append(a2);
                sb.append("&");
            }
            sb.append(i);
            shareBaseBean.setOriginTransformAppShare(sb.toString());
            c.a("shareId = " + sb.toString());
            StringBuilder sb2 = new StringBuilder(StringUtils.md5(sb.toString()).substring(8, 24));
            sb2.append("A");
            Object[] objArr4 = {aVar};
            ChangeQuickRedirect changeQuickRedirect4 = d.a;
            if (!PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c3223b8e53e63fa381f88d1e8914287e", RobustBitConfig.DEFAULT_VALUE)) {
                switch (d.AnonymousClass1.a[aVar.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        i2 = 4;
                        break;
                    case 3:
                        i2 = 1;
                        break;
                    case 4:
                        i2 = 2;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 5;
                        break;
                    case 7:
                        i2 = 8;
                        break;
                    case 8:
                        i2 = 7;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
            } else {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c3223b8e53e63fa381f88d1e8914287e")).intValue();
            }
            sb2.append(i2);
            shareBaseBean.setTransFormAppshare(sb2.toString());
            return sb2.toString();
        } catch (Exception e) {
            c.a("TransformShareId md5 异常：" + e.toString());
            return "";
        }
    }

    public static boolean a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "185c693c0a109dbd6bd81dedcf96b62d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "185c693c0a109dbd6bd81dedcf96b62d")).booleanValue();
        }
        if (ProcessUtils.isMainProcess(context)) {
            return false;
        }
        return ProcessUtils.isProcess(context, ".MgcProcess") || ProcessUtils.isProcess(context, ".MgcProcess1") || ProcessUtils.isProcess(context, ".MgcProcess2") || ProcessUtils.isProcess(context, ".MgcProcess3") || ProcessUtils.isProcess(context, ".MgcProcess4");
    }

    public static void a(Context context, g.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f808e087f6e2cb82cd94de235d6990c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f808e087f6e2cb82cd94de235d6990c4");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.share.common.util.a.a;
        if (!(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8585bcc698cf5656547cf57f8ee614bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8585bcc698cf5656547cf57f8ee614bd")).booleanValue() : b.a(com.sankuai.android.share.common.util.a.d(), "share_aidata_enable", true))) {
            bVar.a();
        } else if (context == null || a(context)) {
            bVar.a();
        } else {
            g.a(context.getApplicationContext(), bVar);
        }
    }
}
