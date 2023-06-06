package com.meituan.robust;

import com.meituan.robust.common.ResourceConstant;
import java.io.IOException;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PatchTypeUtil {
    private static final int PATCH_DEX_AND_RESOURCE_TYPE = 3;
    private static final int PATCH_DEX_TYPE = 1;
    private static final int PATCH_NONE_TYPE = 0;
    private static final int PATCH_RESOURCE_TYPE = 2;

    static boolean isDexAndResourceType(int i) {
        return i == 3;
    }

    static boolean isDexType(int i) {
        return i == 1;
    }

    static boolean isResourceType(int i) {
        return i == 2;
    }

    private PatchTypeUtil() {
    }

    static int getPatchType(Patch patch) {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(patch.getTempPath());
        } catch (IOException e) {
            e.printStackTrace();
            zipFile = null;
        }
        boolean z = zipFile.getEntry(Constants.CLASSES_DEX_NAME) != null;
        boolean z2 = zipFile.getEntry(ResourceConstant.ROBUST_RESOURCES_DIFF_RELATIVE_PATH) != null;
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        if (z && z2) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }
}
