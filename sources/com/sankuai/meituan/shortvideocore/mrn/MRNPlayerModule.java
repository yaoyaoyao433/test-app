package com.sankuai.meituan.shortvideocore.mrn;

import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.proxy.l;
import com.meituan.android.mtplayer.video.proxy.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nonnull;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MRNPlayerModule extends ReactContextBaseJavaModule {
    public static final long MAX_CACHE_SIZE = 5242880;
    private static final String TAG = "MRNPlayerModule";
    public static HashMap<String, Long> cacheSizeMap = new HashMap<>();
    public static ChangeQuickRedirect changeQuickRedirect;
    public m.b callback;
    private final Set<VideoPlayerParam> mVideoCachePlayerParam;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return TAG;
    }

    public MRNPlayerModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6def8a347a85fb42684e082fde26e587", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6def8a347a85fb42684e082fde26e587");
            return;
        }
        this.mVideoCachePlayerParam = new HashSet();
        this.callback = new m.b() { // from class: com.sankuai.meituan.shortvideocore.mrn.MRNPlayerModule.1
            @Override // com.meituan.android.mtplayer.video.proxy.m.b
            public final void a(String str) {
            }

            @Override // com.meituan.android.mtplayer.video.proxy.m.b
            public final void a(String str, int i) {
            }

            @Override // com.meituan.android.mtplayer.video.proxy.m.b
            public final void a(String str, Exception exc) {
            }
        };
    }

    @ReactMethod
    public void preVideo(ReadableArray readableArray, String str, ReadableMap readableMap, int i, int i2) {
        Object[] objArr = {readableArray, str, readableMap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dae07de8735b5bf73d6b24d57e27831a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dae07de8735b5bf73d6b24d57e27831a");
        } else if (i >= 0 && readableArray != null && readableArray.size() != 0) {
            ArrayList arrayList = new ArrayList(readableArray.size());
            for (int i3 = 0; i3 < readableArray.size(); i3++) {
                arrayList.add(readableArray.getString(i3));
            }
            cacheSizeMap = getCacheSize(arrayList);
            preVideo(arrayList, i2);
        }
    }

    @ReactMethod
    public void getCacheVideos(ReadableArray readableArray, Callback callback) {
        Object[] objArr = {readableArray, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9b55805a12f6a081b6bee795a529caa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9b55805a12f6a081b6bee795a529caa");
            return;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            arrayList.add(readableArray.getString(i));
        }
        HashMap<String, Long> cacheSize = getCacheSize(arrayList);
        JSONObject jSONObject = new JSONObject();
        if (cacheSize != null) {
            for (Map.Entry<String, Long> entry : cacheSize.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            callback.invoke(jSONObject.toString());
        }
    }

    @ReactMethod
    public void stopPreVideo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bbf6ba22b0ee9b284a41c198f6a31fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bbf6ba22b0ee9b284a41c198f6a31fe");
        } else {
            stopPreloadVideo();
        }
    }

    @ReactMethod
    public void isH265Support(Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b9c9b413bbe604e6ee9896cca621fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b9c9b413bbe604e6ee9896cca621fd");
        } else {
            callback.invoke(Boolean.valueOf(a.a()));
        }
    }

    @ReactMethod
    public void clearPool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4d6eebc002a2e7a7014c4363d2caf04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4d6eebc002a2e7a7014c4363d2caf04");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "8f1bdac0e3e270eae1ad154fd15256e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "8f1bdac0e3e270eae1ad154fd15256e6");
        } else {
            com.sankuai.meituan.shortvideocore.mrn.cache.b.a().b();
        }
    }

    @ReactMethod
    public static void clearPoolWithUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3108afa6585155310ff783a2742f2754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3108afa6585155310ff783a2742f2754");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "96f1c37c1ecb5bb42986b0e8e94f09ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "96f1c37c1ecb5bb42986b0e8e94f09ed");
        } else {
            com.sankuai.meituan.shortvideocore.mrn.cache.b.a().c(str);
        }
    }

    @ReactMethod
    public void clearPreVideoServer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20f10ce547e5165a84a5b36f4c18907b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20f10ce547e5165a84a5b36f4c18907b");
            return;
        }
        try {
            l.a().c();
        } catch (Exception unused) {
        }
    }

    private void preVideo(List<String> list, long j) {
        ReactApplicationContext reactApplicationContext;
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cef961162692b93a9ae0b0d4b2584b76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cef961162692b93a9ae0b0d4b2584b76");
        } else if (list != null && list.size() != 0 && (reactApplicationContext = getReactApplicationContext()) != null) {
            new StringBuilder("preVideo: cacheSize param = ").append(j);
            if (j == 0) {
                j = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            int size = list.size();
            long j2 = size;
            if (j2 * j > MAX_CACHE_SIZE) {
                j = MAX_CACHE_SIZE / j2;
            }
            new StringBuilder("preVideo: list size = ").append(size);
            new StringBuilder("preVideo: downloadSize = ").append(j);
            for (String str : list) {
                VideoPlayerParam videoPlayerParam = new VideoPlayerParam(str);
                videoPlayerParam.a(reactApplicationContext, "MRNVideoCache");
                videoPlayerParam.a(this.callback, m.d.a(j));
                this.mVideoCachePlayerParam.add(videoPlayerParam);
            }
        }
    }

    private void stopPreloadVideo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f37ba097479b3ff773faeca8dbc0445b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f37ba097479b3ff773faeca8dbc0445b");
            return;
        }
        for (VideoPlayerParam videoPlayerParam : this.mVideoCachePlayerParam) {
            videoPlayerParam.e();
        }
        this.mVideoCachePlayerParam.clear();
    }

    private HashMap<String, Long> getCacheSize(List<String> list) {
        ReactApplicationContext reactApplicationContext;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ccce2990feff346c44b9cd703685851", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ccce2990feff346c44b9cd703685851");
        }
        HashMap<String, Long> hashMap = new HashMap<>();
        if (list == null || list.size() == 0 || (reactApplicationContext = getReactApplicationContext()) == null) {
            return hashMap;
        }
        for (String str : list) {
            VideoPlayerParam videoPlayerParam = new VideoPlayerParam(str);
            videoPlayerParam.a(reactApplicationContext, "MRNVideoCache");
            long d = videoPlayerParam.d();
            if (d > 0) {
                hashMap.put(str, Long.valueOf(d));
            }
        }
        return hashMap;
    }

    public static long getCacheSizeByUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f30f2b49a425c080f5e3bb9b79d5152b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f30f2b49a425c080f5e3bb9b79d5152b")).longValue();
        }
        if (cacheSizeMap == null || !cacheSizeMap.containsKey(str)) {
            return -1L;
        }
        return cacheSizeMap.get(str).longValue();
    }
}
