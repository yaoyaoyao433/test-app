package com.meituan.mmp.lib.update;

import android.support.annotation.Nullable;
import com.meituan.mmp.lib.mp.b;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j implements i {
    public static ChangeQuickRedirect a;
    @Nullable
    final i b;
    boolean c;
    private b.a d;

    public j(@Nullable i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc753d04483d7f3a1b2e5cd4e0aa838d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc753d04483d7f3a1b2e5cd4e0aa838d");
            return;
        }
        this.d = new b.a() { // from class: com.meituan.mmp.lib.update.j.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.mp.b.a
            public final void a(com.meituan.mmp.lib.mp.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6be9489493c210515bf012244b8ae2c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6be9489493c210515bf012244b8ae2c9");
                } else if (j.this.c) {
                } else {
                    HashMap hashMap = new HashMap();
                    com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
                    hashMap.put("process", e == null ? "" : e.b());
                    hashMap.put("remoteProcess", aVar.b());
                    StringBuilder sb = new StringBuilder("checkUpdateFor: ");
                    sb.append(j.this.b != null ? j.this.b.getClass().getName() : StringUtil.NULL);
                    hashMap.put("task", sb.toString());
                    MMPEnvHelper.getLogger().log("mmp.stability.count.remote.process.die.when.ipc", null, hashMap);
                    j.this.a(null, "remote process died", null);
                }
            }
        };
        this.b = iVar;
        com.meituan.mmp.lib.mp.b.a(com.meituan.mmp.lib.mp.a.MAIN, this.d);
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp, List<MMPPackageInfo> list) {
        Object[] objArr = {mMPAppProp, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68876228e0ed62497923e7ab0c841c1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68876228e0ed62497923e7ab0c841c1a");
            return;
        }
        this.c = true;
        if (this.b != null) {
            this.b.a(mMPAppProp, list);
        }
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3543c936b9d9d358503a81a27c1ebfa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3543c936b9d9d358503a81a27c1ebfa6");
        } else if (this.b != null) {
            this.b.a(mMPAppProp, mMPPackageInfo);
        }
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp, String str, Exception exc) {
        Object[] objArr = {mMPAppProp, str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b207d73f2b6653d30b1f8055812074de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b207d73f2b6653d30b1f8055812074de");
            return;
        }
        this.c = true;
        if (this.b != null) {
            this.b.a(mMPAppProp, str, exc);
        }
    }

    @Override // com.meituan.mmp.lib.update.i
    public final void a(MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33936c98592fa9bad63f1fbb971f1975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33936c98592fa9bad63f1fbb971f1975");
        } else if (this.b != null) {
            this.b.a(mMPAppProp);
        }
    }
}
