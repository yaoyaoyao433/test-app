package com.meituan.robust.resource.apply;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustResourceApply {
    private static final String BAIDU_ASSET_MANAGER = "android.content.res.BAIDU_ASSET_MANAGER";
    private static String baseApkPath;

    public static boolean patchExistingResourcesOnUiThread(final Context context, final String str) {
        final ArrayList arrayList = new ArrayList(1);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            try {
                arrayList.add(Boolean.valueOf(patchExistingResources(context, str)));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            synchronized (RobustResourceApply.class) {
                Handler handler = new Handler(Looper.getMainLooper());
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                handler.post(new Runnable() { // from class: com.meituan.robust.resource.apply.RobustResourceApply.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            arrayList.add(Boolean.valueOf(RobustResourceApply.patchExistingResources(context, str)));
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        countDownLatch.countDown();
                    }
                });
                try {
                    countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((Boolean) arrayList.get(0)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean patchExistingResources(Context context, String str) throws Throwable {
        Class<?> cls;
        AssetManager assetManager;
        Collection<WeakReference> values;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(baseApkPath)) {
            baseApkPath = new String(context.getApplicationInfo().sourceDir);
            new StringBuilder("context.getApplicationInfo().sourceDir 144: ").append(baseApkPath);
        }
        Class<?> cls2 = Class.forName("android.app.ActivityThread");
        try {
            cls = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException unused) {
            cls = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        Field declaredField = cls.getDeclaredField("mResDir");
        declaredField.setAccessible(true);
        String[] strArr = {"mPackages", "mResourcePackages"};
        for (int i = 0; i < 2; i++) {
            Field declaredField2 = cls2.getDeclaredField(strArr[i]);
            declaredField2.setAccessible(true);
            for (Map.Entry entry : ((Map) declaredField2.get(RobustResourceReflect.getCurrentActivityThread(context))).entrySet()) {
                Object obj = ((WeakReference) entry.getValue()).get();
                if (obj != null && !TextUtils.isEmpty(str)) {
                    Object obj2 = declaredField.get(obj);
                    if (obj2 instanceof String) {
                        new StringBuilder("mResDir value is 187:").append((String) obj2);
                    }
                    declaredField.set(obj, str);
                }
            }
        }
        AssetManager assets = context.getAssets();
        ArrayList<String> assetPath = getAssetPath(context.getAssets());
        Iterator<String> it = assetPath.iterator();
        while (it.hasNext()) {
            new StringBuilder("oldAssetManager asset path 153: ").append(it.next());
        }
        Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
        declaredMethod.setAccessible(true);
        if (assets.getClass().getName().equals(BAIDU_ASSET_MANAGER)) {
            assetManager = (AssetManager) Class.forName(BAIDU_ASSET_MANAGER).getConstructor(new Class[0]).newInstance(new Object[0]);
        } else {
            assetManager = (AssetManager) AssetManager.class.getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        new StringBuilder("newAssetManager add assetPath 192:").append(str);
        if (((Integer) declaredMethod.invoke(assetManager, str)).intValue() == 0) {
            Log.e("robust", "invoke newAssetManager 's mAddAssetPath method result : false");
            return false;
        }
        ArrayList<String> assetPath2 = getAssetPath(assetManager);
        Iterator<String> it2 = assetPath2.iterator();
        while (it2.hasNext()) {
            new StringBuilder("before add hydra ,newAssetManager asset path 227: ").append(it2.next());
        }
        Iterator<String> it3 = assetPath.iterator();
        while (it3.hasNext()) {
            String next = it3.next();
            new StringBuilder("old assets 's AssetPath : ").append(next);
            if (assetPath2.contains(next) || TextUtils.equals(baseApkPath, next)) {
                new StringBuilder("newAssetManager not add assetPath 241:").append(next);
            } else {
                new StringBuilder("newAssetManager add assetPath 243:").append(next);
                if (((Integer) declaredMethod.invoke(assetManager, next)).intValue() == 0) {
                    Log.e("robust", "invoke newAssetManager 's mAddAssetPath method result : false");
                }
            }
        }
        Iterator<String> it4 = getAssetPath(assetManager).iterator();
        while (it4.hasNext()) {
            new StringBuilder("after add hydra ,newAssetManager asset path 251: ").append(it4.next());
        }
        List<Activity> allCurrentActivities = GetActivityUtils.getAllCurrentActivities(context);
        if (allCurrentActivities != null) {
            for (Activity activity : allCurrentActivities) {
                Resources resources = activity.getResources();
                try {
                    Field declaredField3 = Resources.class.getDeclaredField("mAssets");
                    declaredField3.setAccessible(true);
                    declaredField3.set(resources, assetManager);
                } catch (Throwable unused2) {
                    Field declaredField4 = Resources.class.getDeclaredField("mResourcesImpl");
                    declaredField4.setAccessible(true);
                    Object obj3 = declaredField4.get(resources);
                    Field declaredField5 = obj3.getClass().getDeclaredField("mAssets");
                    declaredField5.setAccessible(true);
                    declaredField5.set(obj3, assetManager);
                }
                Resources.Theme theme = activity.getTheme();
                try {
                    try {
                        Field declaredField6 = Resources.Theme.class.getDeclaredField("mAssets");
                        declaredField6.setAccessible(true);
                        declaredField6.set(theme, assetManager);
                    } catch (NoSuchFieldException unused3) {
                        Field declaredField7 = Resources.Theme.class.getDeclaredField("mThemeImpl");
                        declaredField7.setAccessible(true);
                        Object obj4 = declaredField7.get(theme);
                        Field declaredField8 = obj4.getClass().getDeclaredField("mAssets");
                        declaredField8.setAccessible(true);
                        declaredField8.set(obj4, assetManager);
                    }
                    Field declaredField9 = ContextThemeWrapper.class.getDeclaredField("mTheme");
                    declaredField9.setAccessible(true);
                    declaredField9.set(activity, null);
                    Method declaredMethod2 = ContextThemeWrapper.class.getDeclaredMethod("initializeTheme", new Class[0]);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(activity, new Object[0]);
                    Method declaredMethod3 = AssetManager.class.getDeclaredMethod("createTheme", new Class[0]);
                    declaredMethod3.setAccessible(true);
                    Object invoke = declaredMethod3.invoke(assetManager, new Object[0]);
                    Field declaredField10 = Resources.Theme.class.getDeclaredField("mTheme");
                    declaredField10.setAccessible(true);
                    declaredField10.set(theme, invoke);
                } catch (Throwable th) {
                    Log.e("robust", "Failed to update existing theme for activity " + activity, th);
                }
                pruneResourceCaches(resources);
            }
        }
        if (Build.VERSION.SDK_INT >= 19) {
            Class<?> cls3 = Class.forName("android.app.ResourcesManager");
            Method declaredMethod4 = cls3.getDeclaredMethod("getInstance", new Class[0]);
            declaredMethod4.setAccessible(true);
            Object invoke2 = declaredMethod4.invoke(null, new Object[0]);
            try {
                Field declaredField11 = cls3.getDeclaredField("mActiveResources");
                declaredField11.setAccessible(true);
                values = ((ArrayMap) declaredField11.get(invoke2)).values();
            } catch (NoSuchFieldException unused4) {
                Field declaredField12 = cls3.getDeclaredField("mResourceReferences");
                declaredField12.setAccessible(true);
                values = (Collection) declaredField12.get(invoke2);
            }
        } else {
            Field declaredField13 = cls2.getDeclaredField("mActiveResources");
            declaredField13.setAccessible(true);
            values = ((HashMap) declaredField13.get(RobustResourceReflect.getCurrentActivityThread(context))).values();
        }
        if (values == null) {
            return false;
        }
        for (WeakReference weakReference : values) {
            Resources resources2 = (Resources) weakReference.get();
            if (resources2 != null) {
                pruneResourceCaches(resources2);
                try {
                    Field declaredField14 = Resources.class.getDeclaredField("mAssets");
                    declaredField14.setAccessible(true);
                    declaredField14.set(resources2, assetManager);
                } catch (Throwable unused5) {
                    Field declaredField15 = Resources.class.getDeclaredField("mResourcesImpl");
                    declaredField15.setAccessible(true);
                    Object obj5 = declaredField15.get(resources2);
                    Field declaredField16 = obj5.getClass().getDeclaredField("mAssets");
                    declaredField16.setAccessible(true);
                    declaredField16.set(obj5, assetManager);
                }
                resources2.updateConfiguration(resources2.getConfiguration(), resources2.getDisplayMetrics());
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Field declaredField17 = ApplicationInfo.class.getDeclaredField("publicSourceDir");
                if (declaredField17 != null) {
                    declaredField17.set(context.getApplicationInfo(), str);
                }
            } catch (Throwable unused6) {
            }
        }
        return true;
    }

    private static void pruneResourceCaches(Object obj) {
        Object obj2;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mTypedArrayPool");
                declaredField.setAccessible(true);
                Object obj3 = declaredField.get(obj);
                Class<?> cls = obj3.getClass();
                int intValue = ((Integer) cls.getDeclaredField("mPoolSize").get(obj3)).intValue();
                Method declaredMethod = cls.getDeclaredMethod("acquire", new Class[0]);
                declaredMethod.setAccessible(true);
                while (declaredMethod.invoke(obj3, new Object[0]) != null) {
                }
                Constructor<?> constructor = cls.getConstructor(Integer.TYPE);
                constructor.setAccessible(true);
                declaredField.set(obj, constructor.newInstance(Integer.valueOf(intValue)));
            } catch (Throwable unused) {
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Field declaredField2 = Resources.class.getDeclaredField("mResourcesImpl");
                declaredField2.setAccessible(true);
                obj = declaredField2.get(obj);
            } catch (Throwable unused2) {
            }
        }
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                Field declaredField3 = obj.getClass().getDeclaredField("mAccessLock");
                declaredField3.setAccessible(true);
                obj2 = declaredField3.get(obj);
            } else {
                Field declaredField4 = Resources.class.getDeclaredField("mTmpValue");
                declaredField4.setAccessible(true);
                obj2 = declaredField4.get(obj);
            }
        } catch (Throwable unused3) {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = RobustResourceReflect.class;
        }
        synchronized (obj2) {
            pruneResourceCache(obj, "mDrawableCache");
            pruneResourceCache(obj, "mColorDrawableCache");
            pruneResourceCache(obj, "mColorStateListCache");
            if (Build.VERSION.SDK_INT >= 23) {
                pruneResourceCache(obj, "mAnimatorCache");
                pruneResourceCache(obj, "mStateListAnimatorCache");
            }
        }
    }

    private static boolean pruneResourceCache(Object obj, String str) {
        Field declaredField;
        try {
            try {
                declaredField = obj.getClass().getDeclaredField(str);
            } catch (NoSuchFieldException unused) {
                declaredField = Resources.class.getDeclaredField(str);
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Class<?> type = declaredField.getType();
            if (Build.VERSION.SDK_INT < 16) {
                if (obj2 instanceof SparseArray) {
                    ((SparseArray) obj2).clear();
                    return true;
                } else if (Build.VERSION.SDK_INT >= 14 && (obj2 instanceof LongSparseArray)) {
                    ((LongSparseArray) obj2).clear();
                    return true;
                }
            } else if (Build.VERSION.SDK_INT < 23) {
                if ("mColorStateListCache".equals(str)) {
                    if (obj2 instanceof LongSparseArray) {
                        ((LongSparseArray) obj2).clear();
                    }
                } else if (type.isAssignableFrom(ArrayMap.class)) {
                    Method declaredMethod = Resources.class.getDeclaredMethod("clearDrawableCachesLocked", ArrayMap.class, Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(obj, obj2, -1);
                    return true;
                } else if (type.isAssignableFrom(LongSparseArray.class)) {
                    Method declaredMethod2 = Resources.class.getDeclaredMethod("clearDrawableCachesLocked", LongSparseArray.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(obj, obj2, -1);
                    return true;
                }
            } else if (type != null) {
                Method declaredMethod3 = type.getDeclaredMethod("onConfigurationChange", Integer.TYPE);
                declaredMethod3.setAccessible(true);
                declaredMethod3.invoke(obj2, -1);
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }

    public static ArrayList<String> getAssetPath(AssetManager assetManager) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Method declaredMethod = assetManager.getClass().getDeclaredMethod("getStringBlockCount", new Class[0]);
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke(assetManager, new Object[0])).intValue();
            int i = 0;
            while (i < intValue) {
                i++;
                String str = (String) assetManager.getClass().getMethod("getCookieName", Integer.TYPE).invoke(assetManager, Integer.valueOf(i));
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }
}
