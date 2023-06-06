package com.sankuai.meituan.mtliveqos.utils.cpu;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileFilter;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;
    private int b;

    @Override // com.sankuai.meituan.mtliveqos.utils.cpu.a
    public final float a() {
        return 0.0f;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "446c31b53a097f279152e69182711982", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "446c31b53a097f279152e69182711982");
            return;
        }
        int i = 1;
        this.b = 1;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5ea1480506c5a57a4cdd064a02f8286", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5ea1480506c5a57a4cdd064a02f8286")).intValue();
        } else {
            int length = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.sankuai.meituan.mtliveqos.utils.cpu.c.1
                public static ChangeQuickRedirect a;

                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    Object[] objArr3 = {file};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fa19ae2f4c9ede6da885b22fa9e466d1", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fa19ae2f4c9ede6da885b22fa9e466d1")).booleanValue();
                    }
                    String name = file.getName();
                    if (name.startsWith(Constants.CPU)) {
                        for (int i2 = 3; i2 < name.length(); i2++) {
                            if (name.charAt(i2) < '0' || name.charAt(i2) > '9') {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
            }).length;
            if (length != 0) {
                i = length;
            }
        }
        this.b = i;
    }

    @Override // com.sankuai.meituan.mtliveqos.utils.cpu.a
    public final float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8300b5887c7a77309881ac0a79a89203", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8300b5887c7a77309881ac0a79a89203")).floatValue();
        }
        float c = c();
        if (c < 0.0f) {
            return 0.0f;
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float c() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mtliveqos.utils.cpu.c.c():float");
    }
}
