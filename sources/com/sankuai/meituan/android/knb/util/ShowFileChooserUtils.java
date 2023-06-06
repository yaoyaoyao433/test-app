package com.sankuai.meituan.android.knb.util;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.support.v4.content.FileProvider;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.utils.TitansReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShowFileChooserUtils {
    private static final String TAG = "ShowFileChooserUtils";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static File pathInFiles;

    public static void handleActivityResult(ValueCallback<Uri[]> valueCallback, int i, Intent intent) {
        ClipData clipData;
        String str;
        Object[] objArr = {valueCallback, Integer.valueOf(i), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Uri[] uriArr = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc93dc9a1292d30644dbc90dff3d08f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc93dc9a1292d30644dbc90dff3d08f8");
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
                } catch (Exception unused) {
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

    @RequiresApi(api = 21)
    public static void showFileChooserImplOri(JsHost jsHost, WebChromeClient.FileChooserParams fileChooserParams) {
        Object[] objArr = {jsHost, fileChooserParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dfb2ecd43623905506809e38487022e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dfb2ecd43623905506809e38487022e0");
            return;
        }
        try {
            jsHost.startActivityForResult(Intent.createChooser(fileChooserParams.createIntent(), jsHost.getContext().getString(R.string.file_chooser)), 3);
        } catch (Exception e) {
            TitansReporter.reportException("ShowFileChooserUtils_showFileChooserImplOri", jsHost.getUrl(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    @android.support.annotation.RequiresApi(api = 21)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean showFileChooserImplNew(com.dianping.titans.js.JsHost r17, android.webkit.WebChromeClient.FileChooserParams r18) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.android.knb.util.ShowFileChooserUtils.showFileChooserImplNew(com.dianping.titans.js.JsHost, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }

    private static Intent dispatchTakePictureIntent(Context context, File file) {
        Uri fromFile;
        Object[] objArr = {context, file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba30b0f85ceb3f79d2c100784edf09b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba30b0f85ceb3f79d2c100784edf09b8");
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
