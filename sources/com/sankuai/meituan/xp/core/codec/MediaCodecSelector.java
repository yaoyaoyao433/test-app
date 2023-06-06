package com.sankuai.meituan.xp.core.codec;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MediaCodecSelector {
    private static final String TAG = "XPlayer";
    private static final ConcurrentHashMap<String, String> cacheCodecSelect = new ConcurrentHashMap<>();
    public static ChangeQuickRedirect changeQuickRedirect;

    @TargetApi(16)
    public static String getSelectedCodec(String str, int i, int i2) {
        String[] supportedTypes;
        XPMediaCodecInfo xPMediaCodecInfo;
        int i3 = 2;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07960589b71c6c44b3ae9777a68108ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07960589b71c6c44b3ae9777a68108ce");
        }
        if (Build.VERSION.SDK_INT >= 16 && !TextUtils.isEmpty(str)) {
            if (cacheCodecSelect.containsKey(str)) {
                return cacheCodecSelect.get(str);
            }
            String.format(Locale.US, "onSelectCodec: mime=%s, profile=%d, level=%d", str, Integer.valueOf(i), Integer.valueOf(i2));
            ArrayList arrayList = new ArrayList();
            int codecCount = MediaCodecList.getCodecCount();
            int i4 = 0;
            while (i4 < codecCount) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i4);
                String.format(Locale.US, "  found codec: %s", codecInfoAt.getName());
                if (!codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int length = supportedTypes.length;
                    int i5 = 0;
                    while (i5 < length) {
                        String str2 = supportedTypes[i5];
                        if (!TextUtils.isEmpty(str2)) {
                            String.format(Locale.US, "    mime: %s", str2);
                            if (str2.equalsIgnoreCase(str) && (xPMediaCodecInfo = XPMediaCodecInfo.setupCandidate(codecInfoAt, str)) != null) {
                                arrayList.add(xPMediaCodecInfo);
                                Locale locale = Locale.US;
                                Object[] objArr2 = new Object[i3];
                                objArr2[0] = codecInfoAt.getName();
                                objArr2[1] = Integer.valueOf(xPMediaCodecInfo.mRank);
                                String.format(locale, "candidate codec: %s rank=%d", objArr2);
                                xPMediaCodecInfo.dumpProfileLevels(str);
                            }
                        }
                        i5++;
                        i3 = 2;
                    }
                }
                i4++;
                i3 = 2;
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            XPMediaCodecInfo xPMediaCodecInfo2 = (XPMediaCodecInfo) arrayList.get(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                XPMediaCodecInfo xPMediaCodecInfo3 = (XPMediaCodecInfo) it.next();
                if (xPMediaCodecInfo3.mRank > xPMediaCodecInfo2.mRank) {
                    xPMediaCodecInfo2 = xPMediaCodecInfo3;
                }
            }
            if (xPMediaCodecInfo2.mRank < 600) {
                String.format(Locale.US, "unaccetable codec: %s", xPMediaCodecInfo2.mCodecInfo.getName());
                return null;
            }
            cacheCodecSelect.put(str, xPMediaCodecInfo2.mCodecInfo.getName());
            String.format(Locale.US, "selected codec: %s rank=%d", xPMediaCodecInfo2.mCodecInfo.getName(), Integer.valueOf(xPMediaCodecInfo2.mRank));
            return xPMediaCodecInfo2.mCodecInfo.getName();
        }
        return null;
    }
}
