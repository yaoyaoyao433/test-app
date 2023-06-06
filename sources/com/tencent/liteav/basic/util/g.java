package com.tencent.liteav.basic.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.avroom.TXCAVRoomConstants;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.a;
import com.tencent.rtmp.TXLiveConstants;
import com.unionpay.tsmservice.mi.data.Constant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g {
    public static long a = 0;
    private static boolean b = true;
    private static String c = "";
    private static int d = 0;
    private static long e = 0;
    private static boolean f = false;
    private static a<b> g = new a<>(new a.InterfaceC1447a<b>() { // from class: com.tencent.liteav.basic.util.g.1
        @Override // com.tencent.liteav.basic.util.a.InterfaceC1447a
        /* renamed from: b */
        public final b a() {
            return new b();
        }
    });
    private static final Object h = new Object();
    private static boolean i = false;
    private static int[] j = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    public static int[] a() {
        if (b) {
            b = false;
            g.a().a();
            return new int[]{0, 0};
        }
        return g.a().a();
    }

    public static int b() {
        if (f || (e != 0 && TXCTimeUtil.getTimeTick() - e < 15000)) {
            return d;
        }
        f = true;
        AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.basic.util.g.2
            @Override // java.lang.Runnable
            public final void run() {
                System.currentTimeMillis();
                boolean unused = g.f = false;
                try {
                    Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                    Debug.getMemoryInfo(memoryInfo);
                    int totalPss = memoryInfo.getTotalPss();
                    long unused2 = g.e = TXCTimeUtil.getTimeTick();
                    int unused3 = g.d = totalPss / 1024;
                } catch (Exception unused4) {
                }
            }
        });
        return d;
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager.getRunningTasks(1) == null) {
                TXCLog.e("TXCSystemUtil", "running task is null, ams is abnormal!!!");
                return false;
            }
            ActivityManager.RunningTaskInfo runningTaskInfo = activityManager.getRunningTasks(1).get(0);
            if (runningTaskInfo != null && runningTaskInfo.topActivity != null) {
                return !runningTaskInfo.topActivity.getPackageName().equals(context.getPackageName());
            }
            TXCLog.e("TXCSystemUtil", "failed to get RunningTaskInfo");
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String b(Context context) {
        return TXCDRApi.getSimulateIDFA(context);
    }

    public static String c(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static boolean d(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            System.currentTimeMillis();
            if (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int e(Context context) {
        NetworkInfo networkInfo;
        if (context == null) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            TXCLog.e("TXCSystemUtil", "getNetworkType: error occurred.", e2);
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            if (networkInfo.getType() == 9) {
                return 5;
            }
            if (networkInfo.getType() == 1) {
                return 1;
            }
            if (networkInfo.getType() == 0) {
                switch (telephonyManager.getNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 4;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 3;
                    case 13:
                        return 2;
                    default:
                        return 2;
                }
            }
            return 0;
        }
        return 0;
    }

    public static String c() {
        return Build.MODEL;
    }

    public static String d() {
        return Build.VERSION.RELEASE;
    }

    public static String e() {
        return UUID.randomUUID().toString();
    }

    public static String f(Context context) {
        return TXCDRApi.getDevUUID(context, TXCDRApi.getSimulateIDFA(context));
    }

    public static void a(WeakReference<com.tencent.liteav.basic.c.b> weakReference, String str, int i2, String str2, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString(TXCAVRoomConstants.EVT_USERID, str);
        bundle.putInt(TXCAVRoomConstants.EVT_ID, i2);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        bundle.putLong(TXLiveConstants.EVT_BLOCK_DURATION, j2);
        if (str2 != null) {
            bundle.putCharSequence("EVT_MSG", str2);
        }
        a(weakReference, i2, bundle);
    }

    public static void a(WeakReference<com.tencent.liteav.basic.c.b> weakReference, int i2, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(TXCAVRoomConstants.EVT_ID, i2);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putLong(TXLiveConstants.EVT_UTC_TIME, TXCTimeUtil.getUtcTimeTick());
        if (str != null) {
            bundle.putCharSequence("EVT_MSG", str);
        }
        a(weakReference, i2, bundle);
    }

    public static void a(WeakReference<com.tencent.liteav.basic.c.b> weakReference, int i2, Bundle bundle) {
        com.tencent.liteav.basic.c.b bVar;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            return;
        }
        bVar.onNotifyEvent(i2, bundle);
    }

    public static void a(WeakReference<com.tencent.liteav.basic.c.b> weakReference, String str, int i2, Bundle bundle) {
        com.tencent.liteav.basic.c.b bVar;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            return;
        }
        bundle.putString(TXCAVRoomConstants.EVT_USERID, str);
        bVar.onNotifyEvent(i2, bundle);
    }

    public static com.tencent.liteav.basic.opengl.a a(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i2 * i5;
        int i9 = i3 * i4;
        if (i8 >= i9) {
            i7 = i9 / i5;
            i6 = i3;
        } else {
            i6 = i8 / i4;
            i7 = i2;
        }
        return new com.tencent.liteav.basic.opengl.a(i2 > i7 ? (i2 - i7) >> 1 : 0, i3 > i6 ? (i3 - i6) >> 1 : 0, i7, i6);
    }

    public static boolean f() {
        boolean z;
        synchronized (h) {
            if (!i) {
                new StringBuilder("load library txffmpeg ").append(a("txffmpeg"));
                new StringBuilder("load library traeimp-rtmp ").append(a("traeimp-rtmp"));
                i = a("liteavsdk");
                new StringBuilder("load library liteavsdk ").append(i);
            }
            z = i;
        }
        return z;
    }

    public static boolean a(String str) {
        try {
            StringBuilder sb = new StringBuilder("load library ");
            sb.append(str);
            sb.append(" from system path ");
            System.loadLibrary(str);
            return true;
        } catch (Error e2) {
            new StringBuilder("load library : ").append(e2.toString());
            return b(c, str);
        } catch (Exception e3) {
            new StringBuilder("load library : ").append(e3.toString());
            return b(c, str);
        }
    }

    private static boolean b(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            StringBuilder sb = new StringBuilder("load library ");
            sb.append(str2);
            sb.append(" from path ");
            sb.append(str);
            System.load(str + "/lib" + str2 + ".so");
            return true;
        } catch (Error e2) {
            new StringBuilder("load library : ").append(e2.toString());
            return false;
        } catch (Exception e3) {
            new StringBuilder("load library : ").append(e3.toString());
            return false;
        }
    }

    public static void b(String str) {
        new StringBuilder("setLibraryPath ").append(str);
        c = str;
    }

    public static String g() {
        return c;
    }

    public static int a(int i2) {
        int i3 = 0;
        while (i3 < j.length && j[i3] != i2) {
            i3++;
        }
        if (i3 >= j.length) {
            return -1;
        }
        return i3;
    }

    @TargetApi(16)
    public static MediaFormat a(int i2, int i3, int i4) {
        int a2 = a(i2);
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.put(0, (byte) ((i4 << 3) | (a2 >> 1)));
        allocate.put(1, (byte) (((a2 & 1) << 7) | (i3 << 3)));
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i2, i3);
        createAudioFormat.setInteger("channel-count", i3);
        createAudioFormat.setInteger("sample-rate", i2);
        createAudioFormat.setByteBuffer("csd-0", allocate);
        return createAudioFormat;
    }

    public static boolean a(String str, String str2) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap frameAtTime;
        FileOutputStream fileOutputStream;
        if (str == null || str2 == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            if (new File(str).exists()) {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(str);
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                        File file = new File(str2);
                        if (file.exists()) {
                            file.delete();
                        }
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                    mediaMetadataRetriever.release();
                    return true;
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    TXCLog.e("TXCSystemUtil", "get video thumb failed.", e);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (mediaMetadataRetriever != null) {
                        mediaMetadataRetriever.release();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (mediaMetadataRetriever != null) {
                        mediaMetadataRetriever.release();
                    }
                    throw th;
                }
            }
            return false;
        } catch (Exception e4) {
            e = e4;
            mediaMetadataRetriever = null;
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever = null;
        }
    }

    public static boolean h() {
        if (Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") && Build.MODEL.equalsIgnoreCase("NEM-L22")) {
            return true;
        }
        return Build.MANUFACTURER.equalsIgnoreCase(Constant.DEVICE_XIAOMI) && Build.MODEL.equalsIgnoreCase("MIX 2S");
    }

    private static void a(String str, MediaFormat mediaFormat, byte[] bArr, int i2, int i3) {
        int i4 = i3 - i2;
        ByteBuffer allocate = ByteBuffer.allocate(i4);
        allocate.put(bArr, i2, i4);
        allocate.position(0);
        mediaFormat.setByteBuffer(str, allocate);
    }

    @TargetApi(16)
    public static MediaFormat a(byte[] bArr, int i2, int i3) {
        int i4;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i2, i3);
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        int i7 = 0;
        while (true) {
            int i8 = i5 + 3;
            if (i8 < bArr.length) {
                int i9 = (bArr[i5] == 0 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 0 && bArr[i8] == 1) ? 4 : (bArr[i5] == 0 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 1) ? 3 : 0;
                if (i9 > 0) {
                    if (i6 == 0) {
                        i5 += i9;
                        i6 = i9;
                    } else {
                        int i10 = bArr[i6] & 31;
                        if (i10 == 7) {
                            a("csd-0", createVideoFormat, bArr, i6, i5);
                            z = true;
                        } else if (i10 == 8) {
                            a("csd-1", createVideoFormat, bArr, i6, i5);
                            z2 = true;
                        }
                        i4 = i9 + i5;
                        if (z && z2) {
                            return createVideoFormat;
                        }
                        i7 = i5;
                        i6 = i4;
                        i5 = i4 + 1;
                    }
                }
                i4 = i5;
                i5 = i4 + 1;
            } else {
                int i11 = bArr[i6] & 31;
                if (z && i11 == 8) {
                    a("csd-1", createVideoFormat, bArr, i6, i7);
                    return createVideoFormat;
                } else if (z2 && i11 == 7) {
                    a("csd-0", createVideoFormat, bArr, i6, i7);
                    return createVideoFormat;
                } else {
                    return null;
                }
            }
        }
    }
}
