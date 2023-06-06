package com.dianping.titans.utils;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.image.KNBBase64Parser;
import com.dianping.titans.js.jshandler.image.KNBImageDownloader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ImageDownloadUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface DownloadCallback {
        void onFail(KNBJsErrorInfo kNBJsErrorInfo);

        void onSuccess(String str);
    }

    public static void downloadFile(Context context, String str, String str2, final DownloadCallback downloadCallback) {
        Object[] objArr = {context, str, str2, downloadCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c892d3f85e1f4d74552cdb11dab6390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c892d3f85e1f4d74552cdb11dab6390");
        } else if (context == null || TextUtils.isEmpty(str) || downloadCallback == null) {
        } else {
            if (Pattern.compile(KNBBase64Parser.BASE64_REG).matcher(str).matches()) {
                KNBBase64Parser.parse(context, str, str2, new KNBBase64Parser.KNBBase64ParserCallback() { // from class: com.dianping.titans.utils.ImageDownloadUtil.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.titans.js.jshandler.image.KNBBase64Parser.KNBBase64ParserCallback
                    public final void onSuccess(String str3) {
                        Object[] objArr2 = {str3};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b2d1ea17c14a2c2a83ecb2f6fe13c0b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b2d1ea17c14a2c2a83ecb2f6fe13c0b");
                        } else {
                            DownloadCallback.this.onSuccess(str3);
                        }
                    }

                    @Override // com.dianping.titans.js.jshandler.image.KNBBase64Parser.KNBBase64ParserCallback
                    public final void onError(KNBJsErrorInfo kNBJsErrorInfo) {
                        Object[] objArr2 = {kNBJsErrorInfo};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "06c3c40a7e5d72e6f0cc5070e79b74ef", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "06c3c40a7e5d72e6f0cc5070e79b74ef");
                        } else {
                            DownloadCallback.this.onFail(kNBJsErrorInfo);
                        }
                    }
                });
            } else {
                new KNBImageDownloader(context, str2).downloadImage(str, new KNBImageDownloader.KNBImageDownloaderCallback() { // from class: com.dianping.titans.utils.ImageDownloadUtil.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.dianping.titans.js.jshandler.image.KNBImageDownloader.KNBImageDownloaderCallback
                    public final void onSuccess(String str3) {
                        Object[] objArr2 = {str3};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2931a159e3eb088f95b16e62011e4ef2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2931a159e3eb088f95b16e62011e4ef2");
                        } else {
                            DownloadCallback.this.onSuccess(str3);
                        }
                    }

                    @Override // com.dianping.titans.js.jshandler.image.KNBImageDownloader.KNBImageDownloaderCallback
                    public final void onError(KNBJsErrorInfo kNBJsErrorInfo) {
                        Object[] objArr2 = {kNBJsErrorInfo};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c50a4262083a4ea55aa18070720410e0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c50a4262083a4ea55aa18070720410e0");
                        } else {
                            DownloadCallback.this.onFail(kNBJsErrorInfo);
                        }
                    }
                });
            }
        }
    }
}
