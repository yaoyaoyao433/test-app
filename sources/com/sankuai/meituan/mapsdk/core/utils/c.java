package com.sankuai.meituan.mapsdk.core.utils;

import com.meituan.mtmap.rendersdk.LogRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.config.MapConfig;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends LogRecord {
    public static ChangeQuickRedirect a;
    private final Executor b;

    @Override // com.meituan.mtmap.rendersdk.LogRecord
    public final void onRecord(int i, int i2, long j, String str) {
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abc0c5b6068cefe423f2cf8e23da3ab5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abc0c5b6068cefe423f2cf8e23da3ab5");
        } else {
            this.b = com.sankuai.meituan.mapfoundation.threadcenter.a.a();
        }
    }

    @Override // com.meituan.mtmap.rendersdk.LogRecord
    public final void onAlarmRecord(int i, int i2, long j, String str, String str2) {
        boolean z;
        MapConfig.AllConfig allConfig;
        MapConfig.MapDebugInfo mapDebugInfo;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8162f753b3177e1e2251bc9fc31eb54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8162f753b3177e1e2251bc9fc31eb54");
            return;
        }
        boolean z2 = false;
        if (i != LogRecord.EventSeverity.Warning.ordinal() && i != LogRecord.EventSeverity.Error.ordinal()) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce93f15e8a9bfb424a0dcf59812230b1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce93f15e8a9bfb424a0dcf59812230b1")).booleanValue();
            } else {
                MapConfig b = com.sankuai.meituan.mapsdk.mapcore.a.b();
                if (b != null && (allConfig = b.getAllConfig()) != null && (mapDebugInfo = allConfig.getMapDebugInfo()) != null) {
                    int renderUploadLevel = mapDebugInfo.getRenderUploadLevel();
                    int i3 = renderUploadLevel / 1000;
                    int i4 = (renderUploadLevel % 1000) / 100;
                    int i5 = (renderUploadLevel % 100) / 10;
                    int i6 = renderUploadLevel % 10;
                    if ((i3 == 1 && i == LogRecord.EventSeverity.Error.ordinal()) || ((i4 == 1 && i == LogRecord.EventSeverity.Warning.ordinal()) || ((i5 == 1 && i == LogRecord.EventSeverity.Info.ordinal()) || (i6 == 1 && i == LogRecord.EventSeverity.Debug.ordinal())))) {
                        z = true;
                    }
                }
                z = false;
            }
            if (!z) {
                return;
            }
            z2 = z;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(this.b, new a(i, i2, j, str, str2, z2));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        private final int b;
        private final int c;
        private final long d;
        private final String e;
        private final String f;
        private final boolean g;

        public a(int i, int i2, long j, String str, String str2, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a27656fc88b8afa0c041edafeccf09c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a27656fc88b8afa0c041edafeccf09c");
                return;
            }
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = str;
            this.f = str2;
            this.g = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.mapsdk.core.utils.c.a.run():void");
        }
    }
}
