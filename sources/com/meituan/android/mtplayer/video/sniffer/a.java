package com.meituan.android.mtplayer.video.sniffer;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<String, Object> b = new HashMap(4);
    private static final Map<String, Object> c = new HashMap(4);
    private static final Map<String, Object> d = new HashMap(4);
    private static final Map<String, Object> e = new HashMap(4);
    private static final Map<String, Object> f = new HashMap(4);
    private static final Map<String, Object> g = new HashMap(4);

    static {
        b.put("mtplayer_filter_type", 0);
        b.put("mtplayer_is_audio", 0);
        c.put("mtplayer_filter_type", 1);
        c.put("mtplayer_error_type", 0);
        c.put("mtplayer_is_audio", 0);
        d.put("mtplayer_filter_type", 1);
        d.put("mtplayer_error_type", 1);
        d.put("mtplayer_is_audio", 0);
        e.put("mtplayer_filter_type", 0);
        e.put("mtplayer_is_audio", 1);
        f.put("mtplayer_filter_type", 1);
        f.put("mtplayer_error_type", 0);
        f.put("mtplayer_is_audio", 1);
        g.put("mtplayer_filter_type", 1);
        g.put("mtplayer_error_type", 1);
        g.put("mtplayer_is_audio", 1);
    }

    public static Map<String, Object> a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5efeb5e7f8768dc4fb46756bc0d490b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5efeb5e7f8768dc4fb46756bc0d490b3");
        }
        if (z) {
            return e;
        }
        HashMap hashMap = new HashMap(b);
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        hashMap.put("mtplayer_current_page", str);
        return hashMap;
    }

    public static Map<String, Object> a(int i, boolean z, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f301f42a868d6664de30ddf61d1e5b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f301f42a868d6664de30ddf61d1e5b1");
        }
        switch (i) {
            case 0:
                if (z) {
                    return f;
                }
                HashMap hashMap = new HashMap(c);
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("mtplayer_current_page", str);
                }
                hashMap.put("mtplayer_video_url", str2);
                return hashMap;
            case 1:
                if (z) {
                    return g;
                }
                HashMap hashMap2 = new HashMap(d);
                if (!TextUtils.isEmpty(str)) {
                    hashMap2.put("mtplayer_current_page", str);
                }
                hashMap2.put("mtplayer_video_url", str2);
                return hashMap2;
            default:
                return null;
        }
    }

    public static Map<String, Object> a(long j, boolean z, String str) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60c405489fe5961a47d1988878bc1c65", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60c405489fe5961a47d1988878bc1c65");
        }
        HashMap hashMap = new HashMap(8);
        hashMap.put("mtplayer_filter_type", 2);
        hashMap.put("mtplayer_first_load_time", Long.valueOf(j));
        hashMap.put("mtplayer_is_audio", Integer.valueOf(z ? 1 : 0));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("mtplayer_current_page", str);
        }
        return hashMap;
    }
}
