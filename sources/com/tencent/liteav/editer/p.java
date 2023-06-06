package com.tencent.liteav.editer;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class p {
    public static MediaExtractor a(String str) {
        TXCLog.i("MediaModuleHelper", "generateMediaExtractor -> path = " + str);
        if (Build.VERSION.SDK_INT < 16) {
            TXCLog.e("MediaModuleHelper", "generateMediaExtractor -> un support android version  = " + Build.VERSION.SDK_INT);
            return null;
        }
        Context appContext = TXCCommonUtil.getAppContext();
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            if (c(str)) {
                TXCLog.i("MediaModuleHelper", "generateMediaExtractor -> set uri data source");
                ParcelFileDescriptor openFileDescriptor = appContext.getContentResolver().openFileDescriptor(Uri.parse(str), com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o);
                mediaExtractor.setDataSource(openFileDescriptor.getFileDescriptor());
                openFileDescriptor.close();
            } else {
                TXCLog.i("MediaModuleHelper", "generateMediaExtractor -> set path data source");
                File file = new File(str);
                boolean z = file.exists() && file.canRead();
                TXCLog.i("MediaModuleHelper", "generateMediaExtractor -> path is valid = " + z);
                if (!z) {
                    throw new IllegalArgumentException("path is invalid.");
                }
                mediaExtractor.setDataSource(str);
            }
            return mediaExtractor;
        } catch (Exception e) {
            TXCLog.i("MediaModuleHelper", "generateMediaExtractor -> exception happen ");
            e.printStackTrace();
            try {
                mediaExtractor.release();
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public static MediaMetadataRetriever b(String str) {
        TXCLog.i("MediaModuleHelper", "generateMediaMetadataRetriever -> path = " + str);
        if (Build.VERSION.SDK_INT < 16) {
            TXCLog.e("MediaModuleHelper", "generateMediaMetadataRetriever -> un support android version  = " + Build.VERSION.SDK_INT);
            return null;
        }
        Context appContext = TXCCommonUtil.getAppContext();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (c(str)) {
                TXCLog.i("MediaModuleHelper", "generateMediaMetadataRetriever -> set uri data source");
                mediaMetadataRetriever.setDataSource(appContext, Uri.parse(str));
            } else {
                TXCLog.i("MediaModuleHelper", "generateMediaMetadataRetriever -> set path data source");
                File file = new File(str);
                boolean z = file.exists() && file.canRead();
                TXCLog.i("MediaModuleHelper", "generateMediaMetadataRetriever -> path is valid = " + z);
                if (!z) {
                    throw new IllegalArgumentException("path is invalid.");
                }
                mediaMetadataRetriever.setDataSource(str);
            }
            return mediaMetadataRetriever;
        } catch (Exception e) {
            TXCLog.i("MediaModuleHelper", "generateMediaMetadataRetriever -> exception happen ");
            e.printStackTrace();
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public static boolean c(String str) {
        return str.startsWith("content://");
    }
}
