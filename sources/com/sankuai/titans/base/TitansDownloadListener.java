package com.sankuai.titans.base;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.constraint.R;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.utils.AppUtils;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.StringTokenizer;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansDownloadListener implements DownloadListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AbsJsHost jsHost;

    public TitansDownloadListener(AbsJsHost absJsHost) {
        Object[] objArr = {absJsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a39b21c076a52d19d40b4cd91c19db0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a39b21c076a52d19d40b4cd91c19db0");
        } else {
            this.jsHost = absJsHost;
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(final String str, String str2, String str3, final String str4, long j) {
        String str5;
        Object[] objArr = {str, str2, str3, str4, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05c62951cf4c8da88051b227a2c0eb48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05c62951cf4c8da88051b227a2c0eb48");
            return;
        }
        final Activity activity = this.jsHost.getActivity();
        if (AppUtils.isActivityAlive(activity)) {
            final IStatisticsService statisticsService = Titans.serviceManager().getStatisticsService();
            try {
                boolean canWebViewDownload = Titans.getAppAdaptor().canWebViewDownload(str);
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("case", "WebViewDownload");
                    hashMap.put("component", "titans");
                    hashMap.put("url", str);
                    hashMap.put("userAgent", str2);
                    hashMap.put("contentDisposition", str3);
                    hashMap.put("mimeType", str4);
                    hashMap.put("contentLength", Long.valueOf(j));
                    hashMap.put(DeviceInfo.TM, Long.valueOf(System.currentTimeMillis()));
                    hashMap.put("canDownload", Integer.valueOf(canWebViewDownload ? 1 : 0));
                    statisticsService.reportGeneralInfo(hashMap);
                } catch (Exception unused) {
                }
                this.jsHost.getHostState().currentDownloadUrl = str;
                if (str4 != null && str4.contains("pdf")) {
                    this.jsHost.getUiManager().loadUrl("https://static.meituan.net/bs/mbs-pages/master/pdf-viewer.html?url=" + URLEncoder.encode(str));
                    return;
                }
                String guessFileName = guessFileName(str, str3, str4);
                if (TextUtils.isEmpty(guessFileName)) {
                    guessFileName = URLUtil.guessFileName(str, str3, str4);
                }
                final String str6 = guessFileName;
                if (!canWebViewDownload) {
                    this.jsHost.getTitansContext().getServiceManager().getToastService().showShortToast(activity, activity.getString(R.string.titans_download_forbidden) + str6);
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                final Context applicationContext = activity.getApplicationContext();
                double d = (((100 * j) / 1024) / 1024) / 100.0d;
                String str7 = applicationContext.getString(R.string.titans_download_file) + str6 + applicationContext.getString(R.string.titans_download_size);
                if (d > 0.0d) {
                    str5 = str7 + d + ErrorCode.ERROR_TYPE_M;
                } else {
                    str5 = str7 + applicationContext.getString(R.string.titans_download_unknown);
                }
                builder.setMessage(str5);
                builder.setTitle(applicationContext.getString(R.string.titans_download_ensure));
                builder.setPositiveButton(applicationContext.getString(R.string.titans_sure), new DialogInterface.OnClickListener() { // from class: com.sankuai.titans.base.TitansDownloadListener.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1bb0056b126967af0cbc310598068170", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1bb0056b126967af0cbc310598068170");
                            return;
                        }
                        dialogInterface.dismiss();
                        TitansPermissionUtil.requestPermission(activity, PermissionGuard.PERMISSION_STORAGE, "pt-1772329138bd898d", new IRequestPermissionCallback() { // from class: com.sankuai.titans.base.TitansDownloadListener.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.sankuai.titans.result.IRequestPermissionCallback
                            public void onResult(boolean z, int i2) {
                                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "25c47ac374ed18de7d9a3d3d69e75fe3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "25c47ac374ed18de7d9a3d3d69e75fe3");
                                } else if (!z) {
                                    TitansDownloadListener.this.downloadByOther(str);
                                } else {
                                    try {
                                        TitansDownloadListener.this.downloadByDM(applicationContext, str, str4, str6);
                                    } catch (Throwable th) {
                                        statisticsService.reportClassError("TitansDownloadListener", "onDownloadStart", th);
                                        TitansDownloadListener.this.downloadByOther(str);
                                    }
                                }
                            }
                        });
                    }
                });
                builder.show();
            } catch (Throwable th) {
                statisticsService.reportClassError("TitansDownloadListener", "onDownloadStart", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadByOther(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d1bad45d51996825accc44a1303bf0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d1bad45d51996825accc44a1303bf0b");
            return;
        }
        IStatisticsService statisticsService = Titans.serviceManager().getStatisticsService();
        Activity activity = this.jsHost.getActivity();
        if (AppUtils.isActivityAlive(activity)) {
            try {
                this.jsHost.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Throwable th) {
                String string = activity.getString(R.string.titans_download_fail_text);
                statisticsService.reportClassError("TitansDownloadListener", "onDownloadStart", th);
                this.jsHost.getTitansContext().getServiceManager().getToastService().showShortToast(activity, string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadByDM(Context context, String str, String str2, String str3) {
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e7efa910cc1def0ffb1c947bdbd753b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e7efa910cc1def0ffb1c947bdbd753b");
            return;
        }
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setMimeType(str2);
        request.setNotificationVisibility(1);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str3);
        request.allowScanningByMediaScanner();
        if (downloadManager != null) {
            downloadManager.enqueue(request);
            return;
        }
        IStatisticsService statisticsService = Titans.serviceManager().getStatisticsService();
        statisticsService.reportClassError("DownloadListener", "downloadByDM", new Exception("DownloadManager为空. url是 " + str));
    }

    public static String guessFileName(String str, String str2, String str3) {
        String valueOf;
        String valueOf2;
        String[] stringSplit;
        String[] stringSplit2;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        String str4 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e08d1414e1533e221b46bcf26aef44d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e08d1414e1533e221b46bcf26aef44d7");
        }
        try {
            if (!TextUtils.isEmpty(str2) && (stringSplit = stringSplit(str2, ";")) != null) {
                int length = stringSplit.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str5 = stringSplit[i];
                    if (str5 != null && str5.contains(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME) && (stringSplit2 = stringSplit(str5.trim(), "=")) != null) {
                        String replace = stringSplit2[0].replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
                        String replace2 = stringSplit2[1].replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
                        if (!TextUtils.isEmpty(stringSplit2[1]) && TextUtils.equals(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME, replace) && !TextUtils.isEmpty(replace2)) {
                            str4 = replace2;
                            break;
                        }
                    }
                    i++;
                }
            }
            if (TextUtils.isEmpty(str4)) {
                String decode = URLDecoder.decode(str, "utf-8");
                int lastIndexOf = decode.lastIndexOf(47);
                if (lastIndexOf > 0 && lastIndexOf < decode.length() - 1) {
                    valueOf = decode.substring(lastIndexOf + 1);
                    try {
                        int indexOf = valueOf.indexOf(CommonConstant.Symbol.QUESTION_MARK);
                        if (indexOf > 0) {
                            if (indexOf < valueOf.length() - 1) {
                                valueOf2 = valueOf.substring(0, indexOf);
                            } else {
                                valueOf2 = String.valueOf(System.currentTimeMillis());
                            }
                            str4 = valueOf2;
                        }
                    } catch (Exception e) {
                        str4 = valueOf;
                        e = e;
                        Titans.serviceManager().getStatisticsService().reportClassError("TitansDownloadListener", "guessFileName", e);
                        return str4;
                    }
                } else {
                    valueOf = String.valueOf(System.currentTimeMillis());
                }
                str4 = valueOf;
            }
            if (!str4.contains(CommonConstant.Symbol.DOT)) {
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str3);
                if (!TextUtils.isEmpty(extensionFromMimeType)) {
                    str4 = str4 + CommonConstant.Symbol.DOT + extensionFromMimeType;
                }
            }
            return URLDecoder.decode(str4, "UTF-8");
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static String[] stringSplit(String str, String str2) {
        int i = 0;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a2f50dbd00087e04cff2b026040caec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a2f50dbd00087e04cff2b026040caec");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2, false);
        String[] strArr = new String[stringTokenizer.countTokens()];
        while (stringTokenizer.hasMoreElements()) {
            strArr[i] = stringTokenizer.nextToken();
            i++;
        }
        return strArr;
    }
}
