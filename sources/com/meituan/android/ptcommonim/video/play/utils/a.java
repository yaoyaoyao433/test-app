package com.meituan.android.ptcommonim.video.play.utils;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final LruCache<String, Map<String, String>> b = new LruCache<>(2);

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07f7773a84ae715336a77f625af98f8f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07f7773a84ae715336a77f625af98f8f") : a(j, false);
    }

    public static String a(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ed5c221225a3f845ad44defbf869255", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ed5c221225a3f845ad44defbf869255");
        }
        if (j <= 0 || j >= 86400000) {
            return "00:00";
        }
        long j2 = j / 1000;
        long j3 = j % 1000;
        if (j3 > 150 && z) {
            j2++;
        } else if (j3 > 500) {
            j2++;
        }
        long j4 = j2 % 60;
        long j5 = (j2 / 60) % 60;
        long j6 = j2 / 3600;
        Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
        return j6 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)).toString() : formatter.format("%02d:%02d", Long.valueOf(j5), Long.valueOf(j4)).toString();
    }

    @NonNull
    public static Map<String, String> a(Context context, String str) {
        MediaMetadataRetriever mediaMetadataRetriever;
        String extractMetadata;
        String extractMetadata2;
        String extractMetadata3;
        String extractMetadata4;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c5607d9f7ba35532ea592b457c279a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c5607d9f7ba35532ea592b457c279a4");
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        Map<String, String> map = b.get(str);
        if (map != null) {
            return map;
        }
        try {
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                Object[] objArr2 = {context, mediaMetadataRetriever, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "014c18418df758288ac3c505ee8f3cba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "014c18418df758288ac3c505ee8f3cba");
                } else if (str.startsWith("content")) {
                    mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                } else {
                    mediaMetadataRetriever.setDataSource(str);
                }
                extractMetadata = mediaMetadataRetriever.extractMetadata(19);
                extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                extractMetadata4 = mediaMetadataRetriever.extractMetadata(24);
            } catch (Exception unused) {
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                }
                return hashMap;
            } catch (Throwable th) {
                th = th;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            mediaMetadataRetriever = null;
        }
        if (!"90".equals(extractMetadata4) && !"270".equals(extractMetadata4)) {
            hashMap.put("info_height", extractMetadata);
            hashMap.put("info_width", extractMetadata2);
            hashMap.put("info_duration", extractMetadata3);
            b.put(str, hashMap);
            mediaMetadataRetriever.release();
            return hashMap;
        }
        hashMap.put("info_height", extractMetadata2);
        hashMap.put("info_width", extractMetadata);
        hashMap.put("info_duration", extractMetadata3);
        b.put(str, hashMap);
        mediaMetadataRetriever.release();
        return hashMap;
    }
}
