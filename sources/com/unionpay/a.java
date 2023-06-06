package com.unionpay;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.mtwebkit.MTURLUtil;
import com.unionpay.utils.UPUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/* loaded from: classes6.dex */
public final class a extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Context context2;
        boolean c;
        String str2;
        String str3;
        String str4;
        BroadcastReceiver broadcastReceiver;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        long a = com.sankuai.waimai.platform.utils.f.a(intent, "extra_download_id", -1L);
        long c2 = UPUtils.c(context, "id");
        if (c2 == a) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(c2);
            String str5 = "";
            if (uriForDownloadedFile != null) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(uriForDownloadedFile.getPath()));
                    String absolutePath = context.getFilesDir().getAbsolutePath();
                    if (absolutePath != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(absolutePath);
                        sb.append(File.separator);
                        str3 = UPPayAssistEx.N;
                        sb.append(str3);
                        str5 = sb.toString();
                        str4 = UPPayAssistEx.N;
                        FileOutputStream openFileOutput = context.openFileOutput(str4, 1);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            openFileOutput.write(bArr, 0, read);
                        }
                        openFileOutput.close();
                        fileInputStream.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    str5 = uriForDownloadedFile.getPath();
                }
                try {
                    String b = com.unionpay.utils.b.b(str5);
                    str = UPPayAssistEx.L;
                    if (str.equalsIgnoreCase(b)) {
                        context2 = UPPayAssistEx.G;
                        c = UPPayAssistEx.c(context2);
                        if (!c) {
                            Uri parse = Uri.parse(MTURLUtil.FILE_BASE.concat(String.valueOf(str5)));
                            str2 = UPPayAssistEx.S;
                            intent2.setDataAndType(parse, str2);
                            intent2.addFlags(com.tencent.mapsdk.internal.y.a);
                            context.startActivity(intent2);
                        }
                    } else {
                        com.unionpay.utils.b.c(uriForDownloadedFile.getPath());
                    }
                } catch (FileNotFoundException unused) {
                }
                com.unionpay.utils.j.b("uppay", "downloadFileUri".concat(String.valueOf(uriForDownloadedFile)));
            }
            broadcastReceiver = UPPayAssistEx.Y;
            context.unregisterReceiver(broadcastReceiver);
            UPPayAssistEx.f();
        }
    }
}
