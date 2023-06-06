package com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import java.io.File;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements d.a {
    public static ChangeQuickRedirect a;
    private final ImageView b;
    private final String c;

    public b(ImageView imageView, String str) {
        this.b = imageView;
        this.c = str;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        File file;
        Pair pair;
        int a2;
        String[] split;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f93a8a6404319d00f0598b38445678c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f93a8a6404319d00f0598b38445678c");
            return;
        }
        ImageView imageView = this.b;
        String str = this.c;
        j jVar = (j) obj;
        Object[] objArr2 = {imageView, str, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bda114140d3841dbda46d767cc181c2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bda114140d3841dbda46d767cc181c2d");
            return;
        }
        try {
            Context context = imageView.getContext();
            Object[] objArr3 = {context, str};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "32da777c94888ff93208c6ed8115c2e5", RobustBitConfig.DEFAULT_VALUE)) {
                pair = (Pair) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "32da777c94888ff93208c6ed8115c2e5");
            } else {
                Object[] objArr4 = {context, str};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e7e80b33e0f267e39c968a3f73d58b0f", RobustBitConfig.DEFAULT_VALUE)) {
                    file = (File) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e7e80b33e0f267e39c968a3f73d58b0f");
                } else {
                    File a3 = a.a(context);
                    if (a3 != null) {
                        File file2 = new File(a3, "/mach/loading/picture");
                        if (a3.exists()) {
                            File[] listFiles = file2.listFiles();
                            if (!com.sankuai.shangou.stone.util.a.b(listFiles)) {
                                for (File file3 : listFiles) {
                                    if (file3 != null && file3.isFile()) {
                                        String name = file3.getName();
                                        if (!TextUtils.isEmpty(name) && name.contains(str)) {
                                            file = file3;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    file = null;
                }
                if (file != null) {
                    Object[] objArr5 = {file};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "82291fd97915af1a5005953fe9f72be8", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = ((Integer) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "82291fd97915af1a5005953fe9f72be8")).intValue();
                    } else {
                        String name2 = file.getName();
                        a2 = (TextUtils.isEmpty(name2) || (split = name2.split("#")) == null || split.length != 3) ? -1 : r.a(split[1], -1);
                    }
                    pair = Pair.create(file, Integer.valueOf(a2));
                } else {
                    pair = null;
                }
            }
            if (pair != null && pair.first != null && ((File) pair.first).exists()) {
                jVar.onNext(Pair.create(com.sankuai.waimai.launcher.util.image.a.a(((File) pair.first).getPath()), pair.second));
            } else {
                jVar.onNext(null);
            }
        } catch (Exception unused) {
            jVar.onNext(null);
        }
    }
}
