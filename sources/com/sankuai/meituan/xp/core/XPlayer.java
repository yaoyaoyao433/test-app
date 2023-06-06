package com.sankuai.meituan.xp.core;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.b;
import com.sankuai.meituan.xp.core.annotations.AccessedByNative;
import com.sankuai.meituan.xp.core.annotations.CalledByNative;
import com.sankuai.meituan.xp.core.bean.XPMediaInfo;
import com.sankuai.meituan.xp.core.bean.XPMediaMeta;
import java.io.IOException;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class XPlayer {
    private static final int LOG_DEBUG = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean sIsNativeInitialized;
    private static final b sLoader = new b() { // from class: com.sankuai.meituan.xp.core.XPlayer.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.sankuai.meituan.xp.b
        public final void loadLibrary(String str) throws UnsatisfiedLinkError, SecurityException {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9abae0b76b66bc172ab72986737c3a79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9abae0b76b66bc172ab72986737c3a79");
            } else {
                System.loadLibrary(str);
            }
        }
    };
    private IPlayerCallback mCallback;
    @AccessedByNative
    private long mNativeAndroidIO;
    @AccessedByNative
    private long mNativeMediaDataSource;
    @AccessedByNative
    private long mNativeMediaPlayer;
    private boolean sIsSoLoaded;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface IPlayerCallback {
        boolean onNativeInvoke(int i, Bundle bundle);

        String onSelectCodec(String str, int i, int i2);

        void postEventFromNative(int i, int i2, int i3, Object obj);
    }

    private native void _release();

    public static native void native_init();

    public static native void native_preDns(String str);

    public static native void native_setLogLevel(int i);

    private native void native_setup(Object obj);

    public native String _getAudioCodecInfo();

    public native int _getLoopCount();

    public native Bundle _getMediaMeta();

    public native float _getPropertyFloat(int i, float f);

    public native long _getPropertyLong(int i, long j);

    public native String _getVideoCodecInfo();

    public native boolean _isPlaying();

    public native void _pause() throws IllegalStateException;

    public native void _prepareAsync() throws IllegalStateException;

    public native void _reset();

    public native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException;

    public native void _setLoopCount(int i);

    public native void _setOption(int i, String str, long j);

    public native void _setOption(int i, String str, String str2);

    public native void _setPropertyFloat(int i, float f);

    public native void _setPropertyLong(int i, long j);

    public native void _setSpeed(float f);

    public native void _setVideoSurface(Surface surface);

    public native void _setVolume(float f, float f2);

    public native void _start() throws IllegalStateException;

    public native void _stop() throws IllegalStateException;

    public native long getCurrentPosition();

    public native long getDuration();

    public native long getVideoFrozenDuration();

    public native long getVideoFrozenDurationByDecode();

    public native void native_message_loop(Object obj);

    public native void resetFrozenStatus();

    public native void seekTo(long j);

    private void initNativeOnce() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45a4737fceb6354b4d700f4ee8a299a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45a4737fceb6354b4d700f4ee8a299a8");
        } else if (sIsNativeInitialized) {
        } else {
            native_init();
            sIsNativeInitialized = true;
        }
    }

    public XPlayer(b bVar, IPlayerCallback iPlayerCallback) {
        Object[] objArr = {bVar, iPlayerCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0c12d7ae70a94521740bad1ecd0b155", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0c12d7ae70a94521740bad1ecd0b155");
            return;
        }
        if (!this.sIsSoLoaded) {
            if (bVar != null) {
                bVar.loadLibrary("ijkffmpeg");
                bVar.loadLibrary("xplayer");
            } else {
                sLoader.loadLibrary("ijkffmpeg");
                sLoader.loadLibrary("xplayer");
            }
            this.sIsSoLoaded = true;
        }
        this.mCallback = iPlayerCallback;
        initNativeOnce();
        native_setup(new WeakReference(this));
        native_setLogLevel(3);
    }

    public float getPropertyFloat(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0577c52b9a21849e5690909dae70e10", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0577c52b9a21849e5690909dae70e10")).floatValue() : _getPropertyFloat(i, f);
    }

    public long getPropertyLong(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "847c38d5e1784805fccf5d2475dfcdd2", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "847c38d5e1784805fccf5d2475dfcdd2")).longValue() : _getPropertyLong(i, j);
    }

    public long getNativeMediaPlayer() {
        return this.mNativeMediaPlayer;
    }

    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9afdddd53624985deda9871cf1885cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9afdddd53624985deda9871cf1885cf");
            return;
        }
        _release();
        this.mCallback = null;
    }

    @CalledByNative
    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        XPlayer xPlayer;
        Object[] objArr = {obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3db524ee1bcb598fc74e63ca41f986e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3db524ee1bcb598fc74e63ca41f986e2");
        } else if (obj == null || !(obj instanceof WeakReference) || (xPlayer = (XPlayer) ((WeakReference) obj).get()) == null || xPlayer.mCallback == null) {
        } else {
            xPlayer.mCallback.postEventFromNative(i, i2, i3, obj2);
        }
    }

    @CalledByNative
    private static boolean onNativeInvoke(Object obj, int i, Bundle bundle) {
        XPlayer xPlayer;
        Object[] objArr = {obj, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "20d856f0292e0cd9005a0b6570eff0fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "20d856f0292e0cd9005a0b6570eff0fb")).booleanValue();
        }
        if (obj == null || !(obj instanceof WeakReference) || (xPlayer = (XPlayer) ((WeakReference) obj).get()) == null || xPlayer.mCallback == null) {
            return false;
        }
        return xPlayer.mCallback.onNativeInvoke(i, bundle);
    }

    @CalledByNative
    private static String onSelectCodec(Object obj, String str, int i, int i2) {
        Object[] objArr = {obj, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93a34ac06f4f1b009ed4c56fd42cea40", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93a34ac06f4f1b009ed4c56fd42cea40");
        }
        if (obj == null || !(obj instanceof WeakReference)) {
            return "";
        }
        XPlayer xPlayer = (XPlayer) ((WeakReference) obj).get();
        if (xPlayer == null || xPlayer.mCallback == null) {
            return null;
        }
        return xPlayer.mCallback.onSelectCodec(str, i, i2);
    }

    public XPMediaInfo getMediaInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fbb08bbf8c8d41efc46ff510c9ef015", RobustBitConfig.DEFAULT_VALUE)) {
            return (XPMediaInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fbb08bbf8c8d41efc46ff510c9ef015");
        }
        XPMediaInfo xPMediaInfo = new XPMediaInfo();
        xPMediaInfo.mMediaPlayerName = "xplayer";
        String _getVideoCodecInfo = _getVideoCodecInfo();
        if (!TextUtils.isEmpty(_getVideoCodecInfo)) {
            String[] split = _getVideoCodecInfo.split(CommonConstant.Symbol.COMMA);
            if (split.length >= 2) {
                xPMediaInfo.mVideoDecoder = split[0];
                xPMediaInfo.mVideoDecoderImpl = split[1];
            } else if (split.length > 0) {
                xPMediaInfo.mVideoDecoder = split[0];
                xPMediaInfo.mVideoDecoderImpl = "";
            }
        }
        String _getAudioCodecInfo = _getAudioCodecInfo();
        if (!TextUtils.isEmpty(_getAudioCodecInfo)) {
            String[] split2 = _getAudioCodecInfo.split(CommonConstant.Symbol.COMMA);
            if (split2.length >= 2) {
                xPMediaInfo.mAudioDecoder = split2[0];
                xPMediaInfo.mAudioDecoderImpl = split2[1];
            } else if (split2.length > 0) {
                xPMediaInfo.mAudioDecoder = split2[0];
                xPMediaInfo.mAudioDecoderImpl = "";
            }
        }
        try {
            xPMediaInfo.mMeta = XPMediaMeta.parse(_getMediaMeta());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return xPMediaInfo;
    }
}
