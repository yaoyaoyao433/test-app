package com.sankuai.titans.base.utils;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import android.webkit.ValueCallback;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShowFileChooserUtils {
    public static final String BASE_FILE_DIR = "titans";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static File pathInFiles;

    public static void handleActivityResult(ValueCallback<Uri[]> valueCallback, int i, Intent intent) {
        ClipData clipData;
        String str;
        Object[] objArr = {valueCallback, Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Uri[] uriArr = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3156795a21b034848b62a8785d2b1dc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3156795a21b034848b62a8785d2b1dc2");
            return;
        }
        if (i == -1) {
            if (pathInFiles != null && pathInFiles.exists() && pathInFiles.length() > 0) {
                Uri[] uriArr2 = {Uri.parse("file://" + pathInFiles.getAbsolutePath())};
                pathInFiles = null;
                uriArr = uriArr2;
            } else {
                try {
                    clipData = intent.getClipData();
                    str = intent.getDataString();
                } catch (Exception e) {
                    Titans.serviceManager().getStatisticsService().reportClassError("ShowFileChooserUtils", "handleActivityResult", e);
                    clipData = null;
                    str = null;
                }
                if (clipData != null) {
                    uriArr = new Uri[clipData.getItemCount()];
                    for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
                        uriArr[i2] = clipData.getItemAt(i2).getUri();
                    }
                } else if (str != null) {
                    uriArr = new Uri[]{Uri.parse(str)};
                }
            }
        }
        valueCallback.onReceiveValue(uriArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    @android.support.annotation.RequiresApi(api = 21)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean showFileChooserImplNew(android.app.Activity r17, android.webkit.WebChromeClient.FileChooserParams r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.base.utils.ShowFileChooserUtils.showFileChooserImplNew(android.app.Activity, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }

    private static File getPathInFiles(Context context, String str) {
        File parentFile;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eac8be4e95a2ac685e5e69efd76eb830", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eac8be4e95a2ac685e5e69efd76eb830");
        }
        File b = q.b(context, "titans", str);
        if (b == null || (parentFile = b.getParentFile()) == null) {
            return null;
        }
        if (parentFile.exists() || parentFile.mkdirs()) {
            return b;
        }
        return null;
    }

    private static Intent dispatchTakePictureIntent(Context context, File file) {
        Uri fromFile;
        Object[] objArr = {context, file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1b91ed7c9052405102f24cc573de5be", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1b91ed7c9052405102f24cc573de5be");
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                fromFile = FileProvider.getUriForFile(context, context.getPackageName() + ".titans.fileprovider", file);
            } else {
                fromFile = Uri.fromFile(file);
            }
            if (fromFile != null) {
                intent.putExtra("output", fromFile);
            }
        }
        return intent;
    }
}
