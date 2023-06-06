package com.taobao.gcanvas;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Build;
import com.taobao.gcanvas.util.GLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GCanvasJNI {
    public static volatile boolean GCanvaslibEnable = false;
    private static boolean assetsLoaded = false;
    private static List<Runnable> callbacks = null;
    private static volatile boolean isRuntimeEnable = false;

    public static native void addFallbackFontFamily(String[] strArr);

    public static native void addFontFamily(String[] strArr, String[] strArr2);

    public static native void bindTexture(String str, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6);

    public static native String getImageData(String str, int i, int i2, int i3, int i4);

    public static native int getNativeFps(String str);

    public static native boolean isFboSupport(String str);

    public static native boolean isNeonSupport();

    public static native void registerCallback(String str, int i);

    public static native void release();

    public static native String render(String str, String str2, int i);

    public static native boolean sendEvent(String str);

    public static native void setClearColor(String str, String str2);

    public static native void setConfig(String str, int i);

    public static native void setContextType(String str, int i, boolean z);

    public static native void setDevicePixelRatio(String str, double d);

    public static native void setFallbackFont(String str, String str2);

    public static native void setLogLevel(String str);

    public static native void setNativeAssetManager(AssetManager assetManager);

    public static native void setOrtho(String str, int i, int i2);

    public static native void setPreCompilePath(String str);

    public static native void setTyOffsetFlag(String str, boolean z);

    public static native void texSubImage2D(String str, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7);

    static {
        loadInternal("StaticBlock");
    }

    public static void load() {
        loadInternal("load()");
    }

    public static synchronized void addGCanvasInitCallback(Runnable runnable) {
        synchronized (GCanvasJNI.class) {
            if (callbacks == null) {
                callbacks = new ArrayList();
            }
            callbacks.add(runnable);
            tryExecCallbacks();
        }
    }

    public static void loadRuntime() {
        if (isRuntimeEnable) {
            return;
        }
        GLog.i(GLog.TAG, "GCanvasJNI load runtime ");
        try {
            isRuntimeEnable = true;
            System.loadLibrary("c++_shared");
            System.loadLibrary("gcanvas_runtime");
        } catch (Exception e) {
            isRuntimeEnable = false;
            GLog.e(GLog.TAG, "fail to load gcanvas_runtime" + e.getLocalizedMessage());
        } catch (UnsatisfiedLinkError e2) {
            isRuntimeEnable = false;
            GLog.e(GLog.TAG, "gcanvas_runtime is not found." + e2.getLocalizedMessage());
        }
    }

    private static void loadInternal(String str) {
        if (GCanvaslibEnable) {
            return;
        }
        GLog.i(GLog.TAG, "GCanvasJNI init from " + str);
        try {
            GCanvaslibEnable = true;
            System.loadLibrary("freetype");
            System.loadLibrary("gcanvas");
            setFontFamilies();
        } catch (Exception e) {
            GCanvaslibEnable = false;
            GLog.e(GLog.TAG, "fail to load gcanvas." + e.getLocalizedMessage());
        } catch (UnsatisfiedLinkError e2) {
            GCanvaslibEnable = false;
            GLog.e(GLog.TAG, "gcanvas is not found." + e2.getLocalizedMessage());
        }
        GLog.i(GLog.TAG, "GCanvasJNI init end---- ");
    }

    private static synchronized void tryExecCallbacks() {
        synchronized (GCanvasJNI.class) {
            if (callbacks == null) {
                return;
            }
            if (GCanvaslibEnable) {
                for (Runnable runnable : callbacks) {
                    runnable.run();
                }
                callbacks.clear();
            }
        }
    }

    public static void setFontFamilies() {
        GFontConfigParser gFontConfigParser = new GFontConfigParser();
        setFallbackFont(gFontConfigParser.getFallbackFont(), gFontConfigParser.getSystemFontLocation());
        HashMap<List<String>, List<String>> fontFamilies = gFontConfigParser.getFontFamilies();
        if (fontFamilies != null) {
            GLog.d(GLog.TAG, "setFontFamilies() fontFamilies.size() " + fontFamilies.size());
        } else {
            GLog.d(GLog.TAG, "setFontFamilies() error! fontFamilies is empty");
        }
        if (fontFamilies != null) {
            for (List<String> list : fontFamilies.keySet()) {
                int size = list.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    strArr[i] = list.get(i);
                }
                List<String> list2 = fontFamilies.get(list);
                int size2 = list2.size();
                String[] strArr2 = new String[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    strArr2[i2] = list2.get(i2);
                }
                addFontFamily(strArr, strArr2);
            }
        }
        List<String> fallbackFontsList = gFontConfigParser.getFallbackFontsList();
        if (fallbackFontsList == null) {
            return;
        }
        int size3 = fallbackFontsList.size();
        String[] strArr3 = new String[size3];
        for (int i3 = 0; i3 < size3; i3++) {
            strArr3[i3] = fallbackFontsList.get(i3);
        }
        addFallbackFontFamily(strArr3);
    }

    public static void setAssetResource(Context context) {
        if (assetsLoaded) {
            return;
        }
        AssetManager assets = context.getAssets();
        setNativeAssetManager(assets);
        traverseAssets(assets);
        assetsLoaded = true;
    }

    private static void traverseAssets(AssetManager assetManager) {
        try {
            ArrayList<String> arrayList = new ArrayList();
            String[] list = assetManager.list("");
            String[] list2 = assetManager.list("fonts");
            if (list2 != null) {
                for (int i = 0; i < list2.length; i++) {
                    list2[i] = "fonts/" + list2[i];
                }
            }
            if (list != null && list.length > 0) {
                arrayList.addAll(Arrays.asList(list));
            }
            if (list2 != null && list2.length > 0) {
                arrayList.addAll(Arrays.asList(list2));
            }
            for (String str : arrayList) {
                if (str.contains(".ttf") || str.contains(".TTF") || str.contains(".otf") || str.contains(".OTF") || str.contains(".ttc") || str.contains(".TTC")) {
                    addFontFamily(new String[]{str.substring(0, str.indexOf(46))}, new String[]{str});
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void registerWXCallNativeFunc(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 24) {
            str = context.getApplicationInfo().nativeLibraryDir + "/libweexcore.so";
            GLog.i("start to test load gcanvas library,path=" + str);
        } else {
            str = null;
        }
        registerCallback(str, Build.VERSION.SDK_INT);
    }
}
