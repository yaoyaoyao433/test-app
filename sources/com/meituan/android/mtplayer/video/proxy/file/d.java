package com.meituan.android.mtplayer.video.proxy.file;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class a implements Serializable, Comparator<File> {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            Object[] objArr = {file3, file4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfa65199928b1b00d894ffed314106b6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfa65199928b1b00d894ffed314106b6")).intValue();
            }
            long lastModified = file3.lastModified();
            long lastModified2 = file4.lastModified();
            Object[] objArr2 = {new Long(lastModified), new Long(lastModified2)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4c853f310fde2bdbc2d42c3bc2455bc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4c853f310fde2bdbc2d42c3bc2455bc")).intValue();
            }
            int i = (lastModified > lastModified2 ? 1 : (lastModified == lastModified2 ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            return i == 0 ? 0 : 1;
        }
    }
}
