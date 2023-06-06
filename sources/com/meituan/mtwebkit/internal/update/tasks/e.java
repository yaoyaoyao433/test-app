package com.meituan.mtwebkit.internal.update.tasks;

import android.content.pm.PackageInfo;
import com.meituan.mtwebkit.internal.c;
import com.meituan.mtwebkit.internal.task.Depend;
import com.meituan.mtwebkit.internal.update.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends com.meituan.mtwebkit.internal.task.a<Boolean> {
    public static ChangeQuickRedirect a;
    @Depend
    private j b;
    @Depend
    private DDVersionInfoTask k;
    @Depend
    private h l;
    @Depend
    private g m;
    @Depend
    private f n;

    @Override // com.meituan.mtwebkit.internal.task.a
    public final /* synthetic */ Boolean b() throws Throwable {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b90751dfb281413433a44bfb4c41ddd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b90751dfb281413433a44bfb4c41ddd");
        }
        this.n.c();
        VersionInfo c = this.k.c();
        PackageInfo c2 = this.b.c();
        Object[] objArr2 = {c2, c};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fc3bbbf8e003387051c210323d2563f4", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fc3bbbf8e003387051c210323d2563f4")).booleanValue();
        } else {
            z = c != null && (c2 == null || com.meituan.mtwebkit.internal.h.b(c2) || c.currentVersion > c2.versionCode);
        }
        if (z) {
            com.meituan.mtwebkit.internal.e.c("CheckUpdateTask", "检查更新开始远端包下载");
            com.meituan.mtwebkit.internal.e.c("CheckUpdateTask", "检查更新下载完成, 开始解压写入本地");
            PackageInfo a2 = com.meituan.mtwebkit.internal.l.a(new File(this.l.c()));
            com.meituan.mtwebkit.internal.e.c("CheckUpdateTask", "检查更新下载解压成功, 开始dex2oat优化");
            com.meituan.mtwebkit.internal.j.b(a2);
            com.meituan.mtwebkit.internal.c.a(com.meituan.mtwebkit.internal.g.b(), (c.a<String, Boolean>) null);
            com.meituan.mtwebkit.internal.h.b(1);
            this.m.c();
            return Boolean.TRUE;
        }
        com.meituan.mtwebkit.internal.e.c("CheckUpdateTask", "本地包已经是最新, 检查更新不需要下载远端包");
        if (c2 != null) {
            com.meituan.mtwebkit.internal.j.c(c2);
        }
        com.meituan.mtwebkit.internal.h.b(0);
        return Boolean.FALSE;
    }
}
