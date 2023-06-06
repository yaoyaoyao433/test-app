package com.meituan.android.common.babel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.kitefly.CrashInfo;
import com.meituan.android.common.kitefly.KiteFly;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.helpers.UrlFactory;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Babel {
    private static final int FILE_UPLOAD_DELAY_MS = 15000;
    public static String PROXYHOST = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isInit = false;
    private static boolean isNetOfThings = false;
    private static volatile BabelConfig mBabelConfig;
    private static volatile Babel self;

    @Deprecated
    public static void flush() {
    }

    @Deprecated
    public static void flushQuickly() {
    }

    @Deprecated
    public static void flushToday() {
    }

    @Deprecated
    public static void init(Context context) {
    }

    @Deprecated
    public static void log(Throwable th) {
    }

    @Deprecated
    public static void log(Throwable th, CrashInfo crashInfo) {
    }

    @Deprecated
    public static void logLocal(Log log) {
    }

    @Deprecated
    public static void logLocal(String str, String str2) {
    }

    @Deprecated
    public static void logLocal(String str, String str2, Map<String, Object> map) {
    }

    @Deprecated
    public static void logLocalNew(Log log) {
    }

    public static void setSensitiveCheckPattern(@NonNull Pattern pattern) {
    }

    public Babel(Context context, BabelConfig babelConfig) {
        this(context, babelConfig, null);
        Object[] objArr = {context, babelConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c6df1d1ccf310c7e84792edac663efd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c6df1d1ccf310c7e84792edac663efd");
        }
    }

    public Babel(Context context, BabelConfig babelConfig, DeviceIdGetter deviceIdGetter) {
        Object[] objArr = {context, babelConfig, deviceIdGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c75bc5543fb90acb7aa1d679c35fce1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c75bc5543fb90acb7aa1d679c35fce1");
            return;
        }
        mBabelConfig = babelConfig;
        KiteFly.init(context);
        UrlFactory.setNetType(!isNetOfThings ? 1 : 0);
    }

    public static synchronized void init(Context context, @NonNull BabelConfig babelConfig) {
        synchronized (Babel.class) {
            Object[] objArr = {context, babelConfig};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d73015339bb61204a54504175e5b72fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d73015339bb61204a54504175e5b72fc");
            } else if (context == null) {
            } else {
                if (isInit) {
                    return;
                }
                synchronized (Babel.class) {
                    if (!isInit) {
                        self = new Babel(context, babelConfig);
                        isInit = true;
                    }
                }
            }
        }
    }

    @Deprecated
    public static synchronized void init(Context context, DeviceIdGetter deviceIdGetter) {
        synchronized (Babel.class) {
            Object[] objArr = {context, deviceIdGetter};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "91adfe41570da2a0a405b578beec8e1a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "91adfe41570da2a0a405b578beec8e1a");
                return;
            }
            if (KiteFly.isDebug) {
                Logger.getBabelLogger().e("DeviceIdGetter deprecated, please don't use it");
            }
            init(context);
        }
    }

    public static void debug(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "044d370af2c22607fd82c0bfdb42df9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "044d370af2c22607fd82c0bfdb42df9b");
        } else {
            KiteFly.debug(context, z);
        }
    }

    public static void mock(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "903399d5b65f35ec324b89bf7979e13b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "903399d5b65f35ec324b89bf7979e13b");
        } else {
            KiteFly.mock(context, z);
        }
    }

    public static void isNetOfThings(boolean z) {
        isNetOfThings = z;
    }

    @Deprecated
    public static boolean isMock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ed449c7c20e571595c176e853de31d2e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ed449c7c20e571595c176e853de31d2e")).booleanValue() : KiteFly.isMock();
    }

    public static void attach(String str, Observer observer) {
        Object[] objArr = {str, observer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77cdac64987246b64f968a8408c66ee9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77cdac64987246b64f968a8408c66ee9");
        } else {
            Subject.getInstance().attach(str, observer);
        }
    }

    @Deprecated
    public static void initSDK(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95655db57b52e88c3479c31cc6ddf2f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95655db57b52e88c3479c31cc6ddf2f9");
            return;
        }
        init(context);
        KiteFly.setDefaultToken(str, str2);
    }

    public static void initSDK(Context context, String str, String str2, @NonNull BabelConfig babelConfig) {
        Object[] objArr = {context, str, str2, babelConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2da388b9597976994fd54888981502a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2da388b9597976994fd54888981502a4");
            return;
        }
        init(context, babelConfig);
        KiteFly.setDefaultToken(str, str2);
    }

    @Deprecated
    public static void initSDK(Context context, String str, String str2, DeviceIdGetter deviceIdGetter) {
        Object[] objArr = {context, str, str2, deviceIdGetter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c2dba01d01a7d3b284b12c71ca0eca72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c2dba01d01a7d3b284b12c71ca0eca72");
            return;
        }
        if (KiteFly.isDebug) {
            Logger.getBabelLogger().e("DeviceIdGetter deprecated, please don't use it");
        }
        initSDK(context, str, str2);
    }

    public static void log(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9779081cdede713955648907a8472217", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9779081cdede713955648907a8472217");
        } else if (isInit) {
            if (KiteFly.isDebug && mBabelConfig == null) {
                throw new RuntimeException("Please call Babel.init(context,babelConfig) instead of Babel.init(context). See https://km.sankuai.com/page/357220127");
            }
            if (self != null) {
                KiteFly.log(str, str2);
            }
        }
    }

    public static void log(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41c50b3fe6f252570a2335cd1197a695", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41c50b3fe6f252570a2335cd1197a695");
        } else if (isInit) {
            if (KiteFly.isDebug && mBabelConfig == null) {
                throw new RuntimeException("Please call Babel.init(context,babelConfig) instead of Babel.init(context). See https://km.sankuai.com/page/357220127");
            }
            if (self != null) {
                KiteFly.log(str, str2, map);
            }
        }
    }

    public static void logRT(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16b660f9fedf9954943d2b1b793bbe26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16b660f9fedf9954943d2b1b793bbe26");
        } else if (isInit) {
            if (KiteFly.isDebug && mBabelConfig == null) {
                throw new RuntimeException("Please call Babel.init(context,babelConfig) instead of Babel.init(context). See https://km.sankuai.com/page/357220127");
            }
            if (self != null) {
                KiteFly.logRT(str, str2);
            }
        }
    }

    public static void logRT(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72772f235d857be0bd4c2ef8021942d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72772f235d857be0bd4c2ef8021942d1");
        } else if (isInit) {
            if (KiteFly.isDebug && mBabelConfig == null) {
                throw new RuntimeException("Please call Babel.init(context,babelConfig) instead of Babel.init(context). See https://km.sankuai.com/page/357220127");
            }
            if (self != null) {
                KiteFly.logRT(str, str2, map);
            }
        }
    }

    public static void log(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d32a7809a1a1f9ba30c09442f5172d84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d32a7809a1a1f9ba30c09442f5172d84");
        } else if (isInit) {
            if (KiteFly.isDebug && mBabelConfig == null) {
                throw new RuntimeException("Please call Babel.init(context,babelConfig) instead of Babel.init(context). See https://km.sankuai.com/page/357220127");
            }
            if (self != null) {
                KiteFly.log(log);
            }
        }
    }

    public static void logRT(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b970249d71cc86bf3284e4974d9b6c62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b970249d71cc86bf3284e4974d9b6c62");
        } else if (isInit) {
            if (KiteFly.isDebug && mBabelConfig == null) {
                throw new RuntimeException("Please call Babel.init(context,babelConfig) instead of Babel.init(context). See https://km.sankuai.com/page/357220127");
            }
            if (self != null) {
                KiteFly.logRT(log);
            }
        }
    }

    public static void logRT(List<Log> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b4af76cbb879e00ba320e651911cb8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b4af76cbb879e00ba320e651911cb8c");
        } else if (isInit) {
            if (KiteFly.isDebug && mBabelConfig == null) {
                throw new RuntimeException("Please call Babel.init(context,babelConfig) instead of Babel.init(context). See https://km.sankuai.com/page/357220127");
            }
            if (self != null) {
                KiteFly.logRT(list);
            }
        }
    }

    public static void logUrgent(Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "67640b14245f01fcfd67f1a8003cb413", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "67640b14245f01fcfd67f1a8003cb413");
        } else if (isInit) {
            if (KiteFly.isDebug && mBabelConfig == null) {
                throw new RuntimeException("Please call Babel.init(context,babelConfig) instead of Babel.init(context). See https://km.sankuai.com/page/357220127");
            }
            KiteFly.logUrgent(log);
        }
    }

    public static void setupProxyHost(String str) {
        PROXYHOST = str;
    }

    @Nullable
    public static BabelConfig getBabelConfig() {
        return mBabelConfig;
    }

    public static void activateReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a134c447fccec49938eb4dccd2578dba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a134c447fccec49938eb4dccd2578dba");
        } else if (isInit) {
            KiteFly.getInstance().activateReportOnce();
        }
    }

    public static boolean isInit() {
        return isInit;
    }
}
