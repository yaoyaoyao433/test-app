package com.meituan.robust.assistant;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.Patch;
import com.meituan.robust.PatchExecutor;
import com.meituan.robust.RobustCallBack;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PatchHelper {
    private static PatchHelper instance;
    private final Context context;
    private final Handler handler;
    private static Gson gson = new Gson();
    private static long DELAY_TIME = 200;
    private static final Type PATCH_TYPE = new TypeToken<List<Patch>>() { // from class: com.meituan.robust.assistant.PatchHelper.1
    }.getType();
    private static String LOCAL_PATCH_LIST = "patch.list";
    private static String LOCAL_PATCH_LIST_LOCK = "patch.list.lock";
    private static String LOCAL_PATCH_WRITE_LOCK = "patch.write.lock";
    private ArrayList<Runnable> updatePatchListLocalRunnables = new ArrayList<>();
    private final HandlerThread mTaskThread = new HandlerThread("robust", -1);

    private PatchHelper(Context context) {
        this.mTaskThread.start();
        this.context = context.getApplicationContext();
        initLock(this.context);
        initCrashHandler(this.context);
        this.handler = new Handler(this.mTaskThread.getLooper());
    }

    private void initLock(Context context) {
        String patchDirPath = PatchManipulateImpl.getPatchDirPath(context);
        LOCAL_PATCH_LIST = patchDirPath + LOCAL_PATCH_LIST;
        try {
            ensureFileExist(LOCAL_PATCH_LIST);
        } catch (IOException unused) {
        }
        LOCAL_PATCH_LIST_LOCK = patchDirPath + LOCAL_PATCH_LIST_LOCK;
        LOCAL_PATCH_WRITE_LOCK = patchDirPath + LOCAL_PATCH_WRITE_LOCK;
    }

    private void initCrashHandler(Context context) {
        new RobustCrashHandler(context).setDefaultUncaughtExceptionHandlerSelf();
    }

    private boolean ensureFileExist(String str) throws IOException {
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        try {
            try {
                return file.createNewFile();
            } catch (IOException e) {
                throw e;
            }
        } catch (IOException unused) {
            return file.createNewFile();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized PatchHelper getInstance(Context context) {
        PatchHelper patchHelper;
        synchronized (PatchHelper.class) {
            if (instance == null) {
                instance = new PatchHelper(context);
            }
            patchHelper = instance;
        }
        return patchHelper;
    }

    public synchronized void execute(PatchManipulateImpl patchManipulateImpl, RobustCallBack robustCallBack) {
        this.handler.post(new PatchExecutor(this.context, patchManipulateImpl, robustCallBack));
    }

    public synchronized void execute(PatchManipulateImpl patchManipulateImpl, RobustCallBack robustCallBack, PatchExecutorStartEndCallBack patchExecutorStartEndCallBack) {
        this.handler.post(new PatchExecutorProxy(this.context, patchManipulateImpl, robustCallBack, patchExecutorStartEndCallBack));
    }

    public synchronized void updateLocalPatchListDelay(final List<Patch> list, final String str, final RobustCallBack robustCallBack) {
        if (list == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.meituan.robust.assistant.PatchHelper.2
            @Override // java.lang.Runnable
            public void run() {
                PatchHelper.updatePatchListJsonToLocal(list, str, robustCallBack);
            }
        };
        this.updatePatchListLocalRunnables.add(runnable);
        this.handler.postDelayed(runnable, DELAY_TIME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean updatePatchListJsonToLocal(List<Patch> list, String str, RobustCallBack robustCallBack) {
        String str2;
        if (list == null) {
            return false;
        }
        try {
            Collections.sort(list, new Comparator<Patch>() { // from class: com.meituan.robust.assistant.PatchHelper.3
                @Override // java.util.Comparator
                public final int compare(Patch patch, Patch patch2) {
                    return patch.getName().compareTo(patch2.getName());
                }
            });
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            for (Patch patch : list) {
                if (TextUtils.isEmpty(patch.getAppHash())) {
                    patch.setAppHash(str);
                }
            }
        }
        try {
            str2 = gson.toJson(list, PATCH_TYPE);
        } catch (Throwable th) {
            if (robustCallBack != null) {
                try {
                    robustCallBack.exceptionNotify(th, "class:PatchHelper method:updatePatchListJsonToLocal line:148");
                } catch (Throwable unused2) {
                }
            }
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            List<Patch> localPatchList = getLocalPatchList(str);
            if (localPatchList != null) {
                for (Patch patch2 : localPatchList) {
                    String md5 = patch2.getMd5();
                    if (!TextUtils.isEmpty(md5) && !str2.contains(md5)) {
                        deletePatchSafe(patch2);
                    }
                }
            }
        } catch (Throwable th2) {
            if (robustCallBack != null) {
                try {
                    robustCallBack.exceptionNotify(th2, "class:PatchHelper method:updatePatchListJsonToLocal line:173");
                } catch (Throwable unused3) {
                }
            }
        }
        return writePatchListLocal(str2);
    }

    private static List<Patch> parseJsonToPatches(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (List) gson.fromJson(str, PATCH_TYPE);
    }

    private static String readPatchListFromLocal() {
        try {
            return ProcessSafeOperateUtils.readPatchListLocal(new File(LOCAL_PATCH_LIST), LOCAL_PATCH_LIST_LOCK);
        } catch (IOException unused) {
            return null;
        }
    }

    private static boolean writePatchListLocal(String str) {
        try {
            return ProcessSafeOperateUtils.writePatchListLocal(new File(LOCAL_PATCH_LIST), str, LOCAL_PATCH_LIST_LOCK);
        } catch (IOException unused) {
            return false;
        }
    }

    public static List<Patch> getLocalPatchList(String str) throws Exception {
        String readPatchListFromLocal = readPatchListFromLocal();
        if (TextUtils.isEmpty(readPatchListFromLocal)) {
            return null;
        }
        List<Patch> parseJsonToPatches = parseJsonToPatches(readPatchListFromLocal);
        if (parseJsonToPatches != null) {
            Iterator<Patch> it = parseJsonToPatches.iterator();
            while (it.hasNext()) {
                Patch next = it.next();
                if (next instanceof Patch) {
                    Patch patch = next;
                    if (!TextUtils.equals(patch.getAppHash(), str)) {
                        it.remove();
                        deletePatchSafe(patch);
                    }
                } else {
                    it.remove();
                }
            }
        }
        return parseJsonToPatches;
    }

    private static void deletePatchSafe(Patch patch) {
        if (patch == null) {
            return;
        }
        try {
            ProcessSafeOperateUtils.deletePatchSafe(new File(patch.getLocalPath()), LOCAL_PATCH_WRITE_LOCK);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean downloadPatchSafe(String str, File file) {
        try {
            return ProcessSafeOperateUtils.downLoadPatchSafe(str, file, LOCAL_PATCH_WRITE_LOCK);
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            if (file != null) {
                hashMap.put("localPatchFile", file.getAbsolutePath());
            }
            ThrowableReporter.report(th, hashMap);
            return false;
        }
    }

    public void deleteLocalPatchList() {
        List<Patch> list;
        String readPatchListFromLocal = readPatchListFromLocal();
        if (!TextUtils.isEmpty(readPatchListFromLocal)) {
            try {
                list = parseJsonToPatches(readPatchListFromLocal);
            } catch (Throwable unused) {
                list = null;
            }
            if (list != null) {
                Iterator<Patch> it = list.iterator();
                while (it.hasNext()) {
                    it.remove();
                    deletePatchSafe(it.next());
                }
            }
        }
        cancelUdatePatchListToLocal();
        writePatchListLocal("");
    }

    private void cancelUdatePatchListToLocal() {
        Iterator<Runnable> it = this.updatePatchListLocalRunnables.iterator();
        while (it.hasNext()) {
            this.handler.removeCallbacks(it.next());
        }
    }
}
