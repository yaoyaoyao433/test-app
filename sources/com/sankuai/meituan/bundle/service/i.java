package com.sankuai.meituan.bundle.service;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.meituan.android.bsdiff.BSPatchUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.bundle.service.b;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i extends d {
    public static ChangeQuickRedirect t;
    public a u;
    public a v;
    public File w;
    public File x;

    @Override // com.sankuai.meituan.bundle.service.d
    public final /* bridge */ /* synthetic */ void a(int i) {
        super.a(i);
    }

    @Override // com.sankuai.meituan.bundle.service.d
    public final /* bridge */ /* synthetic */ void a(File file) {
        super.a(file);
    }

    @Override // com.sankuai.meituan.bundle.service.d
    public final /* bridge */ /* synthetic */ int b() {
        return super.b();
    }

    public i(c cVar, a aVar, a aVar2, a aVar3, g gVar, b.a aVar4) {
        super(cVar, gVar, aVar2, 5, aVar4);
        Object[] objArr = {cVar, aVar, aVar2, aVar3, gVar, aVar4};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a147af70dbdf0b38d1cc0c1ab87c01af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a147af70dbdf0b38d1cc0c1ab87c01af");
            return;
        }
        this.u = aVar;
        this.v = aVar3;
    }

    @Override // com.sankuai.meituan.bundle.service.d
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1167ebed533141fcf5313ebdf2b5af90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1167ebed533141fcf5313ebdf2b5af90")).booleanValue();
        }
        if (super.a()) {
            if (TextUtils.isEmpty(this.v.c)) {
                this.w = new File(this.k, this.v.a);
            } else if (URLUtil.isAssetUrl(this.v.c)) {
                if (b.b != null) {
                    try {
                        String substring = this.v.c.substring(22);
                        String substring2 = substring.substring(substring.lastIndexOf("/"));
                        File file = this.k;
                        this.w = new File(file, "temp" + substring2);
                        k.c(this.w);
                        k.a(this.w, b.b.getAssets().open(substring));
                    } catch (IOException e) {
                        com.sankuai.meituan.bundle.service.util.a.a("PatchBundleTask,initFilesAndCheck", "Asset file catch IOException:" + Log.getStackTraceString(e));
                        j.a("PatchBundleTask,initFilesAndCheck", e);
                        k.a("aasset file exception=" + e.getMessage(), new Object[0]);
                    }
                }
            } else if (URLUtil.isFileUrl(this.v.c)) {
                this.w = new File(Uri.parse(this.v.c).getPath());
            } else {
                this.w = new File(this.v.c);
            }
            if (this.w == null) {
                com.sankuai.meituan.bundle.service.util.a.a("PatchBundleTask,initFilesAndCheck", "sourceL0File is null");
                b.a(this.h, 7, this);
                return false;
            } else if (!this.w.exists()) {
                com.sankuai.meituan.bundle.service.util.a.a("PatchBundleTask,initFilesAndCheck", "sourceL0File.exists() return false");
                b.a(this.h, 7, this);
                return false;
            } else if (this.w.isFile()) {
                return true;
            } else {
                com.sankuai.meituan.bundle.service.util.a.a("PatchBundleTask,initFilesAndCheck", "sourceL0File.isFile() return false");
                b.a(this.h, 7, this);
                return false;
            }
        }
        return false;
    }

    @Override // com.sankuai.meituan.bundle.service.d
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22905e48c0c4b143b9f1a80053baf448", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22905e48c0c4b143b9f1a80053baf448")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.x = new File(this.l, this.u.a);
        if (a(this.u.b, this.x, this.u.a)) {
            j.a("Fetch", System.currentTimeMillis() - currentTimeMillis, false, b.a(this.b, this.c.a), this.h.k, this.h.l);
            return true;
        }
        return false;
    }

    @Override // com.sankuai.meituan.bundle.service.d
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "059855ed05e6a737f621efc72e8c287e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "059855ed05e6a737f621efc72e8c287e")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            BSPatchUtil.a(this.w, this.n, this.x);
            if (TextUtils.isEmpty(this.v.c) || URLUtil.isAssetUrl(this.v.c)) {
                this.w.delete();
            }
            k.b(this.x);
            if (!this.n.exists()) {
                com.sankuai.meituan.bundle.service.util.a.a("PatchBundleTask,makeTargetL0", "targetL0File.exists() is false:" + this.n.getAbsolutePath());
                com.sankuai.meituan.bundle.service.util.b.a().a(e(), 8, 1, (int) (System.currentTimeMillis() - currentTimeMillis));
                b.a(this.h, 8, this);
                return false;
            } else if (!TextUtils.equals(this.c.a, k.a(this.n))) {
                com.sankuai.meituan.bundle.service.util.a.a("PatchBundleTask,makeTargetL0", "targetL0.hash doesn't equal targetL0File's md5:hash:" + this.c.a + "md5:" + k.a(this.n));
                k.b(this.n);
                com.sankuai.meituan.bundle.service.util.b.a().a(e(), 8, 1, (int) (System.currentTimeMillis() - currentTimeMillis));
                b.a(this.h, 8, this);
                return false;
            } else {
                j.a(Constants.PATCH_SUFFIX, System.currentTimeMillis() - currentTimeMillis, false, b.a(this.b, this.c.a), this.h.k, this.h.l);
                com.sankuai.meituan.bundle.service.util.b.a().a(e(), 200, 1, (int) (System.currentTimeMillis() - currentTimeMillis));
                return true;
            }
        } catch (Throwable th) {
            try {
                com.sankuai.meituan.bundle.service.util.a.a("PatchBundleTask,makeTargetL0", "bspatch catch throwable:" + Log.getStackTraceString(th));
                j.a("PatchBundleTask,makeTargetL0", th);
                com.sankuai.meituan.bundle.service.util.b.a().a(e(), 8, 1, (int) (System.currentTimeMillis() - currentTimeMillis));
                b.a(this.h, 8, this);
                return false;
            } finally {
                k.b(this.x);
            }
        }
    }
}
