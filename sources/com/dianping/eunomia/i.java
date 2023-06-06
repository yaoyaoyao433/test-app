package com.dianping.eunomia;

import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004¨\u0006\n"}, d2 = {"Lcom/dianping/eunomia/ModuleProcessor;", "", "()V", "merge", "Lcom/dianping/eunomia/model/models/ModuleConfigResponse;", "delta", PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "process", "Lcom/dianping/eunomia/ProcessResult;", "mcr", "eunomia_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public static final i b = new i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077 A[Catch: Exception -> 0x01be, TryCatch #0 {Exception -> 0x01be, blocks: (B:34:0x0065, B:36:0x0069, B:45:0x0077, B:81:0x011a, B:83:0x011e, B:92:0x012c, B:93:0x0132, B:95:0x0142, B:97:0x0146, B:99:0x0150, B:100:0x015d, B:101:0x0160, B:103:0x0166, B:105:0x016a, B:107:0x016e, B:109:0x0176, B:111:0x0180, B:113:0x0184, B:114:0x0188, B:115:0x018b, B:116:0x018e, B:117:0x0198, B:119:0x019e, B:120:0x01ac, B:46:0x007d, B:48:0x008d, B:50:0x0091, B:52:0x009b, B:53:0x00a8, B:54:0x00ab, B:56:0x00b1, B:58:0x00b5, B:60:0x00b9, B:62:0x00c1, B:64:0x00cb, B:67:0x00d1, B:71:0x00de, B:73:0x00e1, B:74:0x00e5, B:75:0x00e8, B:76:0x00eb, B:77:0x00f5, B:79:0x00fb, B:80:0x0109), top: B:127:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d A[Catch: Exception -> 0x01be, TryCatch #0 {Exception -> 0x01be, blocks: (B:34:0x0065, B:36:0x0069, B:45:0x0077, B:81:0x011a, B:83:0x011e, B:92:0x012c, B:93:0x0132, B:95:0x0142, B:97:0x0146, B:99:0x0150, B:100:0x015d, B:101:0x0160, B:103:0x0166, B:105:0x016a, B:107:0x016e, B:109:0x0176, B:111:0x0180, B:113:0x0184, B:114:0x0188, B:115:0x018b, B:116:0x018e, B:117:0x0198, B:119:0x019e, B:120:0x01ac, B:46:0x007d, B:48:0x008d, B:50:0x0091, B:52:0x009b, B:53:0x00a8, B:54:0x00ab, B:56:0x00b1, B:58:0x00b5, B:60:0x00b9, B:62:0x00c1, B:64:0x00cb, B:67:0x00d1, B:71:0x00de, B:73:0x00e1, B:74:0x00e5, B:75:0x00e8, B:76:0x00eb, B:77:0x00f5, B:79:0x00fb, B:80:0x0109), top: B:127:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e A[Catch: Exception -> 0x01be, TryCatch #0 {Exception -> 0x01be, blocks: (B:34:0x0065, B:36:0x0069, B:45:0x0077, B:81:0x011a, B:83:0x011e, B:92:0x012c, B:93:0x0132, B:95:0x0142, B:97:0x0146, B:99:0x0150, B:100:0x015d, B:101:0x0160, B:103:0x0166, B:105:0x016a, B:107:0x016e, B:109:0x0176, B:111:0x0180, B:113:0x0184, B:114:0x0188, B:115:0x018b, B:116:0x018e, B:117:0x0198, B:119:0x019e, B:120:0x01ac, B:46:0x007d, B:48:0x008d, B:50:0x0091, B:52:0x009b, B:53:0x00a8, B:54:0x00ab, B:56:0x00b1, B:58:0x00b5, B:60:0x00b9, B:62:0x00c1, B:64:0x00cb, B:67:0x00d1, B:71:0x00de, B:73:0x00e1, B:74:0x00e5, B:75:0x00e8, B:76:0x00eb, B:77:0x00f5, B:79:0x00fb, B:80:0x0109), top: B:127:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012c A[Catch: Exception -> 0x01be, TryCatch #0 {Exception -> 0x01be, blocks: (B:34:0x0065, B:36:0x0069, B:45:0x0077, B:81:0x011a, B:83:0x011e, B:92:0x012c, B:93:0x0132, B:95:0x0142, B:97:0x0146, B:99:0x0150, B:100:0x015d, B:101:0x0160, B:103:0x0166, B:105:0x016a, B:107:0x016e, B:109:0x0176, B:111:0x0180, B:113:0x0184, B:114:0x0188, B:115:0x018b, B:116:0x018e, B:117:0x0198, B:119:0x019e, B:120:0x01ac, B:46:0x007d, B:48:0x008d, B:50:0x0091, B:52:0x009b, B:53:0x00a8, B:54:0x00ab, B:56:0x00b1, B:58:0x00b5, B:60:0x00b9, B:62:0x00c1, B:64:0x00cb, B:67:0x00d1, B:71:0x00de, B:73:0x00e1, B:74:0x00e5, B:75:0x00e8, B:76:0x00eb, B:77:0x00f5, B:79:0x00fb, B:80:0x0109), top: B:127:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132 A[Catch: Exception -> 0x01be, TryCatch #0 {Exception -> 0x01be, blocks: (B:34:0x0065, B:36:0x0069, B:45:0x0077, B:81:0x011a, B:83:0x011e, B:92:0x012c, B:93:0x0132, B:95:0x0142, B:97:0x0146, B:99:0x0150, B:100:0x015d, B:101:0x0160, B:103:0x0166, B:105:0x016a, B:107:0x016e, B:109:0x0176, B:111:0x0180, B:113:0x0184, B:114:0x0188, B:115:0x018b, B:116:0x018e, B:117:0x0198, B:119:0x019e, B:120:0x01ac, B:46:0x007d, B:48:0x008d, B:50:0x0091, B:52:0x009b, B:53:0x00a8, B:54:0x00ab, B:56:0x00b1, B:58:0x00b5, B:60:0x00b9, B:62:0x00c1, B:64:0x00cb, B:67:0x00d1, B:71:0x00de, B:73:0x00e1, B:74:0x00e5, B:75:0x00e8, B:76:0x00eb, B:77:0x00f5, B:79:0x00fb, B:80:0x0109), top: B:127:0x0065 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dianping.eunomia.model.models.ModuleConfigResponse a(com.dianping.eunomia.model.models.ModuleConfigResponse r14, com.dianping.eunomia.model.models.ModuleConfigResponse r15) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.eunomia.i.a(com.dianping.eunomia.model.models.ModuleConfigResponse, com.dianping.eunomia.model.models.ModuleConfigResponse):com.dianping.eunomia.model.models.ModuleConfigResponse");
    }
}
