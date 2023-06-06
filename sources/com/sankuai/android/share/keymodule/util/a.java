package com.sankuai.android.share.keymodule.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Environment;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "utilService")
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;

    @NomApiInterface(alias = "isWeixinInstall")
    private boolean isWeixinInstall(LyingkitTraceBody lyingkitTraceBody, Context context) {
        Object[] objArr = {lyingkitTraceBody, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d7c82c9e6750ce8b5b09345ad36bbe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d7c82c9e6750ce8b5b09345ad36bbe")).booleanValue();
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用分享--判断微信是否安装--接口成功");
        return isAppInstall(lyingkitTraceBody, context, "com.tencent.mm");
    }

    @NomApiInterface(alias = "isQQInstall")
    private boolean isQQInstall(LyingkitTraceBody lyingkitTraceBody, Context context) {
        Object[] objArr = {lyingkitTraceBody, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd3bc11bb19d6c0cbb1184e3d794524", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd3bc11bb19d6c0cbb1184e3d794524")).booleanValue();
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用分享--判断qq是否安装--接口成功");
        return isAppInstall(lyingkitTraceBody, context, "com.tencent.mobileqq");
    }

    @NomApiInterface(alias = "isAppInstall")
    private boolean isAppInstall(LyingkitTraceBody lyingkitTraceBody, Context context, String str) {
        Object[] objArr = {lyingkitTraceBody, context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717a4acd26522a14cd5c676eee16c46e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717a4acd26522a14cd5c676eee16c46e")).booleanValue();
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用分享--判断app是否安装--接口成功,pkgName: " + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @NomApiInterface(alias = "getLocalImageUrl")
    private String getLocalImageUrl(LyingkitTraceBody lyingkitTraceBody, Context context, Bitmap bitmap) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {lyingkitTraceBody, context, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d557c923a3cb9e42ba9aa63ed4d9bf2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d557c923a3cb9e42ba9aa63ed4d9bf2c");
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用分享--getLocalImageUrl--接口成功");
        if (context == null || bitmap == null || !"mounted".equals(Environment.getExternalStorageState())) {
            return null;
        }
        File b = q.b(context, "homepage_share", "", u.e);
        if (!b.exists()) {
            try {
                b.mkdirs();
            } catch (Exception unused) {
                return null;
            }
        }
        File file = new File(b, String.format("%s_%s%s", AbsApiFactory.PASSPORT_ONLINE_URL, Long.toHexString(new Date().getTime()), ".jpg"));
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception unused2) {
                return null;
            }
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                fileOutputStream.flush();
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用分享--getLocalImageUrl--成功, url: " + file.getAbsolutePath());
                String absolutePath = file.getAbsolutePath();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                return absolutePath;
            } catch (Exception unused4) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused6) {
                    }
                }
                throw th;
            }
        } catch (Exception unused7) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    @NomApiInterface(alias = "getShareChannelName")
    private String getShareChannelName(LyingkitTraceBody lyingkitTraceBody, Context context, int i) {
        Object[] objArr = {lyingkitTraceBody, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abce81d780991ea685ea6b8ea9c84fd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abce81d780991ea685ea6b8ea9c84fd3");
        }
        String str = "";
        if (i == 2) {
            str = context.getString(R.string.share_channel_qzone);
        } else if (i == 4) {
            str = context.getString(R.string.share_oauth_tencent_weibo);
        } else if (i == 8) {
            str = context.getString(R.string.share_oauth_renren_name);
        } else if (i == 12) {
            str = context.getString(R.string.share_channel_oauth);
        } else if (i == 32) {
            str = context.getString(R.string.share_channel_sms);
        } else if (i == 64) {
            str = context.getString(R.string.share_channel_email);
        } else if (i == 128) {
            str = context.getString(R.string.share_channel_weixin_friend);
        } else if (i == 256) {
            str = context.getString(R.string.share_channel_weixin_circle);
        } else if (i == 512) {
            str = context.getString(R.string.share_channel_qq);
        } else if (i == 1024) {
            str = context.getString(R.string.share_channel_more);
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用分享--getShareChannelName--接口成功。name: " + str);
        return str;
    }
}
