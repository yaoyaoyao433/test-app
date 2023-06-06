package com.sankuai.meituan.shortvideocore.mrn;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c<T> {
        void pause(T t);

        void prepare(T t);

        void release(T t);

        void reset(T t);

        void saveVideoView(T t);

        void seekTo(T t, a aVar);

        void setVideoExtensionInfo(T t, HashMap<String, Object> hashMap);

        void setVideoMute(T t, boolean z);

        void setVideoPlaybackRate(T t, float f);

        void setVolume(T t, C0645b c0645b);

        void start(T t);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.shortvideocore.mrn.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0645b {
        public final double a;

        public C0645b(double d) {
            this.a = d;
        }
    }

    public static <T> void a(c<T> cVar, T t, int i, @Nullable ReadableArray readableArray) {
        ReadableMap map;
        Object[] objArr = {cVar, t, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e97ac5bba3ef31e7bfc86bf4f84aa360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e97ac5bba3ef31e7bfc86bf4f84aa360");
        } else if (t == null) {
        } else {
            switch (i) {
                case 0:
                    cVar.prepare(t);
                    return;
                case 1:
                    cVar.start(t);
                    return;
                case 2:
                    cVar.pause(t);
                    return;
                case 3:
                    cVar.release(t);
                    return;
                case 4:
                    cVar.reset(t);
                    return;
                case 5:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    cVar.seekTo(t, new a(readableArray.getInt(0)));
                    return;
                case 6:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    cVar.setVolume(t, new C0645b(readableArray.getDouble(0)));
                    return;
                case 7:
                    return;
                case 8:
                    return;
                case 9:
                    return;
                case 10:
                    return;
                case 11:
                    cVar.saveVideoView(t);
                    return;
                case 12:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    cVar.setVideoPlaybackRate(t, (float) readableArray.getDouble(0));
                    return;
                case 13:
                    if (readableArray == null || readableArray.isNull(0)) {
                        return;
                    }
                    cVar.setVideoMute(t, readableArray.getBoolean(0));
                    return;
                case 14:
                    if (readableArray == null || readableArray.isNull(0) || (map = readableArray.getMap(0)) == null) {
                        return;
                    }
                    HashMap<String, Object> hashMap = new HashMap<>();
                    Iterator<Map.Entry<String, Object>> entryIterator = map.getEntryIterator();
                    while (entryIterator.hasNext()) {
                        Map.Entry<String, Object> next = entryIterator.next();
                        hashMap.put(next.getKey(), next.getValue());
                    }
                    cVar.setVideoExtensionInfo(t, hashMap);
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), cVar.getClass().getSimpleName()));
            }
        }
    }
}
