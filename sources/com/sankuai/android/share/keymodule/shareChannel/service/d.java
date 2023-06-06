package com.sankuai.android.share.keymodule.shareChannel.service;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.constraint.R;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.constant.a;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.tencent.mapsdk.internal.y;
import java.io.File;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "systemService")
/* loaded from: classes3.dex */
public class d extends com.sankuai.android.share.keymodule.b {
    public static ChangeQuickRedirect a;
    private String b;
    private Context c;

    @NomApiInterface(alias = "system")
    public void share(LyingkitTraceBody lyingkitTraceBody, Context context, b.a aVar, ShareBaseBean shareBaseBean, com.sankuai.android.share.interfaces.c cVar) {
        String str;
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f783920498f87393c563453ff933a0e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f783920498f87393c563453ff933a0e7");
        } else if (context == null) {
            this.b = "";
        } else {
            this.b = context.getPackageName() + ".ShareFileProvider";
            this.c = context;
            if (shareBaseBean != null) {
                if (TextUtils.isEmpty(shareBaseBean.getContent())) {
                    str = shareBaseBean.getTitle(b.a.MORE_SHARE) + shareBaseBean.getUrl();
                } else {
                    str = shareBaseBean.getContent() + shareBaseBean.getUrl();
                }
                String str2 = str;
                if (!TextUtils.isEmpty(shareBaseBean.getImgUrl()) && shareBaseBean.isLocalImage()) {
                    a(str2, shareBaseBean.getImgUrl(), shareBaseBean, aVar, cVar);
                    return;
                } else {
                    a(str2, "", shareBaseBean, aVar, cVar);
                    return;
                }
            }
            if (cVar != null) {
                cVar.a(b.a.QZONE, c.a.FAILED);
            }
            com.sankuai.android.share.util.d.a(context, aVar, shareBaseBean, a.EnumC0540a.Data);
        }
    }

    private void a(String str, String str2, ShareBaseBean shareBaseBean, b.a aVar, com.sankuai.android.share.interfaces.c cVar) {
        Object[] objArr = {str, str2, shareBaseBean, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cafdfa266b3e9757b87cefdab63f1bd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cafdfa266b3e9757b87cefdab63f1bd9");
        } else if (this.c == null) {
        } else {
            boolean z = !TextUtils.isEmpty(str2);
            if (!z && TextUtils.isEmpty(str)) {
                if (cVar != null) {
                    cVar.a(aVar, c.a.FAILED);
                }
                com.sankuai.android.share.util.d.a(this.c, aVar, shareBaseBean, a.EnumC0540a.Data);
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            if (z) {
                intent.setType("image/*");
            } else {
                intent.setType("text/plain");
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("android.intent.extra.TEXT", str);
            }
            if (z) {
                if (Build.VERSION.SDK_INT >= 24) {
                    if (a(str2) != null) {
                        intent.putExtra("android.intent.extra.STREAM", a(str2));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.parse("file://" + str2));
                }
            }
            intent.addFlags(y.a);
            this.c.startActivity(Intent.createChooser(intent, this.c.getString(R.string.share_system_title)));
            if (cVar != null) {
                cVar.a(aVar, c.a.COMPLETE);
            }
            com.sankuai.android.share.util.d.a(this.c, aVar, shareBaseBean);
        }
    }

    private Uri a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779197464c109f28d6339b543c50c967", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779197464c109f28d6339b543c50c967");
        }
        Uri uri = null;
        if (ActivityCompat.checkSelfPermission(this.c, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            t createContentResolver = Privacy.createContentResolver(this.c, "pt-b4f8997b6cd97630");
            if (createContentResolver != null) {
                Cursor a2 = createContentResolver.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{str}, null);
                if (a2 != null && a2.moveToFirst()) {
                    uri = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, String.valueOf(a2.getInt(a2.getColumnIndex("_id"))));
                }
                if (a2 != null) {
                    a2.close();
                }
            } else {
                com.sankuai.android.share.util.c.a("MtContentResolver获取失败");
            }
        }
        if (uri == null) {
            try {
                return FileProvider.getUriForFile(this.c, this.b, new File(str));
            } catch (Exception unused) {
                return uri;
            }
        }
        return uri;
    }
}
