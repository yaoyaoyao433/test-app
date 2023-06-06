package com.meituan.robust;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PatchExecutor extends Thread {
    protected Context context;
    protected PatchManipulate patchManipulate;
    protected RobustCallBack robustCallBack;

    public PatchExecutor(Context context, PatchManipulate patchManipulate, RobustCallBack robustCallBack) {
        this.context = context.getApplicationContext();
        this.patchManipulate = patchManipulate;
        this.robustCallBack = robustCallBack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            applyPatchList(fetchPatchList());
        } catch (Throwable th) {
            th.printStackTrace();
            this.robustCallBack.exceptionNotify(th, "PatchExecutor run Throwable");
        }
    }

    protected List<Patch> fetchPatchList() {
        return this.patchManipulate.fetchPatchList(this.context);
    }

    protected void applyPatchList(List<Patch> list) {
        boolean z;
        boolean z2;
        List<Patch> mergePatches = PatchManager.mergePatches(list);
        if (mergePatches == null || mergePatches.isEmpty()) {
            return;
        }
        new StringBuilder(" patchManipulate list size is ").append(mergePatches.size());
        ArrayList arrayList = new ArrayList();
        for (Patch patch : mergePatches) {
            if (patch.isAppliedSuccess()) {
                new StringBuilder("p.isAppliedSuccess() skip ").append(patch.getLocalPath());
            } else {
                try {
                    z = this.patchManipulate.ensurePatchExist(patch);
                } catch (Throwable th) {
                    th.printStackTrace();
                    this.robustCallBack.exceptionNotify(th, "class:PatchExecutor method:applyPatchList line:69");
                    Log.e("ROBUST", "class:PatchExecutor method:applyPatchList line:69", th);
                    z = false;
                }
                if (z) {
                    try {
                        z2 = patch(this.context, patch);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        this.robustCallBack.exceptionNotify(th2, "class:PatchExecutor method:applyPatchList line:78");
                        Log.e("ROBUST", "class:PatchExecutor method:applyPatchList line:78", th2);
                        z2 = false;
                    }
                    if (z2) {
                        patch.setAppliedSuccess(true);
                        this.robustCallBack.onPatchApplied(true, patch);
                    } else {
                        Log.e("robust", "patch need retry! ");
                        arrayList.add(patch);
                        this.robustCallBack.onPatchApplied(false, patch);
                    }
                    StringBuilder sb = new StringBuilder("patch LocalPath:");
                    sb.append(patch.getLocalPath());
                    sb.append(",apply result ");
                    sb.append(z2);
                }
            }
        }
    }

    protected boolean patch(Context context, Patch patch) {
        if (isVerified(patch) && hasDex(patch)) {
            return patchClass(context, patch);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isVerified(Patch patch) {
        boolean z = false;
        if (patch != null && RobustApkHashUtils.readRobustApkHash(this.context).equals(patch.getAppHash())) {
            try {
                patch.setTempPath(PatchManager.getCurrentProcessPatchTempDir(this.context).getAbsolutePath() + (File.separator + patch.getMd5() + CommonConstant.Symbol.UNDERLINE + RobustApkHashUtils.readRobustApkHash(this.context)));
                z = this.patchManipulate.verifyPatch(this.context, patch);
            } catch (Throwable th) {
                th.printStackTrace();
                this.robustCallBack.exceptionNotify(th, "class:PatchExecutor method:isVerified, patch info:" + patch.toString());
            }
            if (!z) {
                this.robustCallBack.logNotify("verifyPatch failure, patch info: id = " + patch.getName() + ", md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:107");
            }
            return z;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean hasDex(Patch patch) {
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(patch.getTempPath());
            try {
                boolean z = zipFile2.getEntry(Constants.CLASSES_DEX_NAME) != null;
                try {
                    zipFile2.close();
                } catch (Exception unused) {
                }
                return z;
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                try {
                    RobustCallBack robustCallBack = this.robustCallBack;
                    robustCallBack.exceptionNotify(th, "class:PatchExecutor method:hasDex ,patch info:" + patch.toString());
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception unused2) {
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean patchClass(Context context, Patch patch) {
        PatchesInfo patchesInfo;
        Field field;
        ClassLoader patchClassLoader = PatchManager.getPatchClassLoader(patch);
        if (patchClassLoader == null) {
            try {
                patchClassLoader = new DexClassLoader(patch.getTempPath(), PatchManager.getCurrentProcessPatchCacheDir(context).getAbsolutePath(), null, PatchExecutor.class.getClassLoader());
            } catch (Throwable th) {
                th.printStackTrace();
                RobustCallBack robustCallBack = this.robustCallBack;
                robustCallBack.exceptionNotify(th, "class:PatchExecutor method:patchClass>>>new DexClassLoader ,patch info:" + patch.toString());
            }
            if (patchClassLoader == null) {
                return false;
            }
            PatchManager.setPatchClassLoader(patch, patchClassLoader);
        }
        try {
            new StringBuilder("patch patch_info_name:").append(patch.getPatchesInfoImplClassFullName());
            patchesInfo = (PatchesInfo) patchClassLoader.loadClass(patch.getPatchesInfoImplClassFullName()).newInstance();
        } catch (Throwable th2) {
            th2.printStackTrace();
            RobustCallBack robustCallBack2 = this.robustCallBack;
            robustCallBack2.exceptionNotify(th2, "class:PatchExecutor method:patchClass>>>loadClassPatchesInfoImpl ,patch info:" + patch.toString());
            patchesInfo = null;
        }
        if (patchesInfo == null) {
            RobustCallBack robustCallBack3 = this.robustCallBack;
            Exception exc = new Exception("patchesInfoImpl is null");
            robustCallBack3.exceptionNotify(exc, "class:PatchExecutor method:patchClass>>>loadClassPatchesInfoImpl is null ,patch info:" + patch.toString());
            return false;
        }
        List<PatchedClassInfo> patchedClassesInfo = patchesInfo.getPatchedClassesInfo();
        if (patchedClassesInfo == null || patchedClassesInfo.isEmpty()) {
            return true;
        }
        int i = 0;
        for (PatchedClassInfo patchedClassInfo : patchedClassesInfo) {
            String str = patchedClassInfo.patchedClassName;
            String str2 = patchedClassInfo.patchClassName;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                RobustCallBack robustCallBack4 = this.robustCallBack;
                robustCallBack4.logNotify("patchedClasses or patchClassName is empty, patch info:id = " + patch.getName() + ",md5 = " + patch.getMd5(), "class:PatchExecutor method:patch line:131");
            } else {
                new StringBuilder("current path:").append(str);
                try {
                    try {
                        Class<?> loadClass = patchClassLoader.loadClass(str.trim());
                        Field[] declaredFields = loadClass.getDeclaredFields();
                        StringBuilder sb = new StringBuilder("oldClass :");
                        sb.append(loadClass);
                        sb.append("     fields ");
                        sb.append(declaredFields.length);
                        int length = declaredFields.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                field = null;
                                break;
                            }
                            field = declaredFields[i2];
                            try {
                                if (TextUtils.equals(field.getType().getCanonicalName(), ChangeQuickRedirect.class.getCanonicalName()) && TextUtils.equals(field.getDeclaringClass().getCanonicalName(), loadClass.getCanonicalName())) {
                                    break;
                                }
                                i2++;
                            } catch (Throwable th3) {
                                th = th3;
                                th.printStackTrace();
                                RobustCallBack robustCallBack5 = this.robustCallBack;
                                robustCallBack5.exceptionNotify(th, "class:PatchExecutor method:patchClass ,patch info:" + patch.toString());
                            }
                        }
                        if (field == null) {
                            RobustCallBack robustCallBack6 = this.robustCallBack;
                            robustCallBack6.exceptionNotify(new Exception("changeQuickRedirectField  is null, patch info:" + patch.toString()), "class:PatchExecutor method:patchClass>>>get changeQuickRedirectField");
                            StringBuilder sb2 = new StringBuilder("current path:");
                            sb2.append(str);
                            sb2.append(" something wrong !! can  not find:ChangeQuickRedirect in");
                            sb2.append(str2);
                        } else {
                            StringBuilder sb3 = new StringBuilder("current path:");
                            sb3.append(str);
                            sb3.append(" find:ChangeQuickRedirect ");
                            sb3.append(str2);
                            try {
                                Object newInstance = patchClassLoader.loadClass(str2).newInstance();
                                field.setAccessible(true);
                                try {
                                    field.set(null, newInstance);
                                    i++;
                                    new StringBuilder("changeQuickRedirectField set success ").append(str2);
                                } catch (Throwable th4) {
                                    th = th4;
                                    th.printStackTrace();
                                    RobustCallBack robustCallBack7 = this.robustCallBack;
                                    robustCallBack7.exceptionNotify(th, "class:PatchExecutor method:patchClass, loadClass " + str2 + " ,patch info:" + patch.toString());
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        RobustCallBack robustCallBack8 = this.robustCallBack;
                        robustCallBack8.exceptionNotify(e, "class:PatchExecutor method:patchClass>>>loadClass patchedClassName " + str + " ,patch info:" + patch.toString());
                        e.printStackTrace();
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        return i == patchedClassesInfo.size();
    }
}
