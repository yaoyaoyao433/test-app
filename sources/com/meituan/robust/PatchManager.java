package com.meituan.robust;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.resource.util.ProcessUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PatchManager {
    private static final String ROBUST_PATCH_CACHE_DIR = "patch_cache";
    private static final String ROBUST_PATCH_TEMP_DIR = "patch_temp";
    private static transient Map<Patch, ClassLoader> fattyPatches = new LinkedHashMap();
    private static File currentProcessPatchTempDir = null;
    private static File currentProcessPatchCacheDir = null;

    private static void clearCurrentProcessPatchTempAndCacheDir(File file) {
    }

    static void addPatch(Patch patch) {
        if (containsPatch(patch)) {
            return;
        }
        fattyPatches.put(patch, null);
    }

    static boolean containsPatch(Patch patch) {
        return fattyPatches.containsKey(patch);
    }

    static void removePatch(Patch patch) {
        fattyPatches.remove(patch);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Patch> mergePatches(Collection<Patch> collection) {
        if (collection == null) {
            return new ArrayList(fattyPatches.keySet());
        }
        for (Patch patch : collection) {
            if (!containsPatch(patch)) {
                fattyPatches.put(patch, null);
            }
        }
        return new ArrayList(fattyPatches.keySet());
    }

    public static File getPatchTempDirPath(Context context) {
        File dir = context.getDir(ROBUST_PATCH_TEMP_DIR, 0);
        if (!dir.exists()) {
            dir.mkdir();
        }
        return dir;
    }

    public static File getPatchCacheDirPath(Context context) {
        File dir = context.getDir(ROBUST_PATCH_CACHE_DIR, 0);
        if (!dir.exists()) {
            dir.mkdir();
        }
        return dir;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File getCurrentProcessPatchTempDir(Context context) {
        if (currentProcessPatchTempDir == null) {
            File patchTempProcessDir = getPatchTempProcessDir(context);
            currentProcessPatchTempDir = patchTempProcessDir;
            clearCurrentProcessPatchTempAndCacheDir(patchTempProcessDir);
        }
        return currentProcessPatchTempDir;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File getCurrentProcessPatchCacheDir(Context context) {
        if (currentProcessPatchCacheDir == null) {
            File patchCacheProcessDir = getPatchCacheProcessDir(context);
            currentProcessPatchCacheDir = patchCacheProcessDir;
            clearCurrentProcessPatchTempAndCacheDir(patchCacheProcessDir);
        }
        return currentProcessPatchCacheDir;
    }

    private static File getPatchTempProcessDir(Context context) {
        File file = new File(getPatchTempDirPath(context), ProcessUtil.getCurrentProcessName(context).replace(CommonConstant.Symbol.COLON, CommonConstant.Symbol.UNDERLINE));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private static File getPatchCacheProcessDir(Context context) {
        File file = new File(getPatchCacheDirPath(context), ProcessUtil.getCurrentProcessName(context).replace(CommonConstant.Symbol.COLON, CommonConstant.Symbol.UNDERLINE));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static ClassLoader getPatchClassLoader(Patch patch) {
        if (fattyPatches.containsKey(patch)) {
            return fattyPatches.get(patch);
        }
        return null;
    }

    public static void setPatchClassLoader(Patch patch, ClassLoader classLoader) {
        fattyPatches.put(patch, classLoader);
    }
}
