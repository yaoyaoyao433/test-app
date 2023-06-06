package com.meituan.robust.resource.apply;

import android.os.Build;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Array;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustLibraryApply {
    public static synchronized boolean addNativeLibraryDirectories(PathClassLoader pathClassLoader, File file) throws Exception {
        synchronized (RobustLibraryApply.class) {
            if (pathClassLoader == null) {
                try {
                    pathClassLoader = getClassLoader();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Object fieldPathList = getFieldPathList(getClassLoader());
            if (Build.VERSION.SDK_INT > 22) {
                ((List) RobustLibraryReflect.getFieldValue(fieldPathList.getClass(), fieldPathList, "nativeLibraryDirectories")).add(0, file);
                Object fieldValue = RobustLibraryReflect.getFieldValue(fieldPathList.getClass(), fieldPathList, "nativeLibraryPathElements");
                Object fieldPathList2 = getFieldPathList(pathClassLoader);
                RobustLibraryReflect.setField(fieldPathList.getClass(), fieldPathList, "nativeLibraryPathElements", mergeArrary(fieldValue, RobustLibraryReflect.getFieldValue(fieldPathList2.getClass(), fieldPathList2, "nativeLibraryPathElements")));
            } else {
                File[] fileArr = (File[]) RobustLibraryReflect.getFieldValueWithTryCatch(fieldPathList.getClass(), fieldPathList, "nativeLibraryDirectories");
                int length = fileArr.length;
                File[] fileArr2 = new File[length + 1];
                fileArr2[0] = file;
                System.arraycopy(fileArr, 0, fileArr2, 1, length);
                RobustLibraryReflect.setField(fieldPathList.getClass(), fieldPathList, "nativeLibraryDirectories", fileArr2);
            }
        }
        return true;
    }

    private static Object getFieldPathList(Object obj) throws Exception {
        return RobustLibraryReflect.getFieldValue(Class.forName("dalvik.system.BaseDexClassLoader"), obj, "pathList");
    }

    private static PathClassLoader getClassLoader() {
        return (PathClassLoader) RobustLibraryApply.class.getClassLoader();
    }

    private static Object mergeArrary(Object obj, Object obj2) {
        Class<?> componentType = obj.getClass().getComponentType();
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2) + length;
        Object newInstance = Array.newInstance(componentType, length2);
        for (int i = 0; i < length2; i++) {
            if (i < length) {
                Array.set(newInstance, i, Array.get(obj, i));
            } else {
                Array.set(newInstance, i, Array.get(obj2, i - length));
            }
        }
        return newInstance;
    }
}
