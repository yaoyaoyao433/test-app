package com.tencent.smtt.sdk;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import com.tencent.smtt.sdk.stat.MttLoader;
/* loaded from: classes6.dex */
public class b implements com.tencent.smtt.export.external.interfaces.DownloadListener {
    private DownloadListener a;
    private WebView b;

    public b(WebView webView, DownloadListener downloadListener, boolean z) {
        this.a = downloadListener;
        this.b = webView;
    }

    @Override // com.tencent.smtt.export.external.interfaces.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        onDownloadStart(str, null, null, str2, str3, str4, j, null, null);
    }

    @Override // com.tencent.smtt.export.external.interfaces.DownloadListener
    public void onDownloadStart(String str, String str2, byte[] bArr, String str3, String str4, String str5, long j, String str6, String str7) {
        if (this.a != null) {
            this.a.onDownloadStart(str, str3, str4, str5, j);
        } else if (!QbSdk.canOpenMimeFileType(this.b.getContext(), str5)) {
            ApplicationInfo applicationInfo = this.b.getContext().getApplicationInfo();
            if (applicationInfo == null || !"com.tencent.mm".equals(applicationInfo.packageName)) {
                MttLoader.loadUrl(this.b.getContext(), str, null, null);
            }
        } else {
            Intent intent = new Intent("com.tencent.QQBrowser.action.sdk.document");
            intent.setFlags(com.tencent.mapsdk.internal.y.a);
            intent.putExtra("key_reader_sdk_url", str);
            intent.putExtra("key_reader_sdk_type", 1);
            intent.setData(Uri.parse(str));
            this.b.getContext().startActivity(intent);
        }
    }

    @Override // com.tencent.smtt.export.external.interfaces.DownloadListener
    public void onDownloadVideo(String str, long j, int i) {
    }
}
