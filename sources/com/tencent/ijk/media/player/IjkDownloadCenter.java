package com.tencent.ijk.media.player;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.common.StringUtil;
import com.tencent.ijk.media.player.annotations.CalledByNative;
import com.tencent.liteav.basic.util.g;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class IjkDownloadCenter {
    private static final int DC_PROP_LONG_DOWNLOAD_SIZE = 1003;
    private static final int DC_PROP_LONG_SIZE = 1002;
    private static final int DC_PROP_LONG_SPEED = 1004;
    private static final int DC_PROP_STRING_URL = 1001;
    private static final int MSG_ERROR = 500;
    private static final int MSG_FINISH = 600;
    private static final int MSG_PROGRESS = 900;
    private static final int MSG_RESUME = 100;
    private static final int MSG_STOP = 300;
    private static final String TAG = "IjkDownloadCenter";
    private static IjkDownloadCenter instance = null;
    private static volatile boolean mIsLibLoaded = false;
    private static final IjkLibLoader sLocalLibLoader = new IjkLibLoader() { // from class: com.tencent.ijk.media.player.IjkDownloadCenter.1
        @Override // com.tencent.ijk.media.player.IjkLibLoader
        public final void loadLibrary(String str) throws UnsatisfiedLinkError, SecurityException {
            g.a(str);
        }
    };
    private EventHandler mEventHandler;
    protected Map<String, String> mHeaders;
    private OnDownloadListener mListener;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnDownloadListener {
        void downloadBegin(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        void downloadEnd(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        void downloadError(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia, int i, String str);

        void downloadFinish(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        void downloadProgress(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia);

        int hlsKeyVerify(IjkDownloadCenter ijkDownloadCenter, IjkDownloadMedia ijkDownloadMedia, String str, byte[] bArr);
    }

    private native int download_get_task_prop_long(int i, int i2);

    private native String download_get_task_prop_string(int i, int i2);

    private native void native_download_free();

    private native int native_download_hls_start(String str, String str2, String str3);

    private native void native_download_setup(Object obj);

    private native void native_download_stop(int i);

    protected final void finalize() throws Throwable {
        try {
            native_download_free();
        } finally {
            super.finalize();
        }
    }

    public final IjkDownloadCenter setListener(OnDownloadListener onDownloadListener) {
        this.mListener = onDownloadListener;
        return this;
    }

    public IjkDownloadCenter(IjkLibLoader ijkLibLoader) {
        loadLibrariesOnce(ijkLibLoader);
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.mEventHandler = new EventHandler(this, mainLooper);
        } else {
            this.mEventHandler = null;
        }
        native_download_setup(new WeakReference(this));
    }

    public IjkDownloadCenter() {
        this(sLocalLibLoader);
    }

    public static IjkDownloadCenter getInstance() {
        if (instance == null) {
            instance = new IjkDownloadCenter();
        }
        return instance;
    }

    public final void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public static void loadLibrariesOnce(IjkLibLoader ijkLibLoader) {
        synchronized (IjkMediaPlayer.class) {
            if (!mIsLibLoaded) {
                if (ijkLibLoader == null) {
                    ijkLibLoader = sLocalLibLoader;
                }
                ijkLibLoader.loadLibrary("txffmpeg");
                ijkLibLoader.loadLibrary("txsdl");
                ijkLibLoader.loadLibrary("txplayer");
                mIsLibLoaded = true;
            }
        }
    }

    public final void stop(int i) {
        native_download_stop(i);
    }

    public final int downloadHls(String str, String str2) {
        String str3 = "";
        if (this.mHeaders != null) {
            for (String str4 : this.mHeaders.keySet()) {
                str3 = str3 == null ? String.format("%s: %s", str4, this.mHeaders.get(str4)) : str3 + StringUtil.CRLF_STRING + String.format("%s: %s", str4, this.mHeaders.get(str4));
            }
        }
        return native_download_hls_start(str, str2, str3);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class NativeEvent {
        int error;
        IjkDownloadMedia media;
        String reason;

        private NativeEvent() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class EventHandler extends Handler {
        private final WeakReference<IjkDownloadCenter> mWeakCenter;

        public EventHandler(IjkDownloadCenter ijkDownloadCenter, Looper looper) {
            super(looper);
            this.mWeakCenter = new WeakReference<>(ijkDownloadCenter);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            NativeEvent nativeEvent;
            IjkDownloadMedia ijkDownloadMedia;
            IjkDownloadCenter ijkDownloadCenter = this.mWeakCenter.get();
            if (ijkDownloadCenter == null || ijkDownloadCenter.mListener == null || (ijkDownloadMedia = (nativeEvent = (NativeEvent) message.obj).media) == null) {
                return;
            }
            int i = message.what;
            if (i == 100) {
                ijkDownloadCenter.mListener.downloadBegin(ijkDownloadCenter, ijkDownloadMedia);
            } else if (i == 300) {
                ijkDownloadCenter.mListener.downloadEnd(ijkDownloadCenter, ijkDownloadMedia);
            } else if (i == 500) {
                ijkDownloadCenter.mListener.downloadError(ijkDownloadCenter, ijkDownloadMedia, nativeEvent.error, nativeEvent.reason);
            } else if (i == 600) {
                ijkDownloadCenter.mListener.downloadFinish(ijkDownloadCenter, ijkDownloadMedia);
            } else if (i != 900) {
            } else {
                ijkDownloadCenter.mListener.downloadProgress(ijkDownloadCenter, ijkDownloadMedia);
            }
        }
    }

    @CalledByNative
    private static int hlsVerifyForNative(Object obj, int i, String str, byte[] bArr) {
        IjkDownloadCenter ijkDownloadCenter;
        if (obj == null || (ijkDownloadCenter = (IjkDownloadCenter) ((WeakReference) obj).get()) == null) {
            return 0;
        }
        return ijkDownloadCenter.mListener.hlsKeyVerify(ijkDownloadCenter, ijkDownloadCenter.convertMedia(i), str, bArr);
    }

    @CalledByNative
    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        IjkDownloadCenter ijkDownloadCenter;
        if (obj == null || (ijkDownloadCenter = (IjkDownloadCenter) ((WeakReference) obj).get()) == null || ijkDownloadCenter.mEventHandler == null) {
            return;
        }
        NativeEvent nativeEvent = new NativeEvent();
        nativeEvent.media = ijkDownloadCenter.convertMedia(i2);
        nativeEvent.error = i3;
        if (obj2 != null) {
            nativeEvent.reason = (String) obj2;
        }
        ijkDownloadCenter.mEventHandler.sendMessage(ijkDownloadCenter.mEventHandler.obtainMessage(i, i2, i3, nativeEvent));
    }

    final IjkDownloadMedia convertMedia(int i) {
        String download_get_task_prop_string = download_get_task_prop_string(1001, i);
        if (download_get_task_prop_string == null) {
            return null;
        }
        IjkDownloadMedia ijkDownloadMedia = new IjkDownloadMedia();
        ijkDownloadMedia.size = download_get_task_prop_long(1002, i);
        ijkDownloadMedia.downloadSize = download_get_task_prop_long(1003, i);
        ijkDownloadMedia.speed = download_get_task_prop_long(1004, i);
        ijkDownloadMedia.url = download_get_task_prop_string;
        ijkDownloadMedia.tid = i;
        return ijkDownloadMedia;
    }
}
