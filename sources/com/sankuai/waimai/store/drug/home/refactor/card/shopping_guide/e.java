package com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide;

import android.graphics.Bitmap;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements rx.functions.b {
    public static ChangeQuickRedirect a;
    private final int[] b;
    private final int c;
    private final int d;
    private final View e;
    private final String f;

    public e(int[] iArr, int i, int i2, View view, String str) {
        this.b = iArr;
        this.c = i;
        this.d = i2;
        this.e = view;
        this.f = str;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        FileOutputStream fileOutputStream;
        File a2;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b6a01753bdf0ef35eb00e360ab3b31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b6a01753bdf0ef35eb00e360ab3b31");
            return;
        }
        int[] iArr = this.b;
        int i = this.c;
        int i2 = this.d;
        View view = this.e;
        String str = this.f;
        Object[] objArr2 = {iArr, Integer.valueOf(i), Integer.valueOf(i2), view, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6260f76ece310d6db7281c1203d687f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6260f76ece310d6db7281c1203d687f6");
        } else if (!(obj instanceof Bitmap)) {
        } else {
            try {
                Bitmap createBitmap = Bitmap.createBitmap((Bitmap) obj, iArr[0], iArr[1], i, i2);
                if (createBitmap == null || (a2 = a.a(view.getContext().getApplicationContext(), str, i2)) == null) {
                    return;
                }
                fileOutputStream = new FileOutputStream(a2);
                try {
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream);
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                } catch (Exception unused2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
