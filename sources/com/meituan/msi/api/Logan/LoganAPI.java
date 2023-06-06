package com.meituan.msi.api.Logan;

import com.dianping.networklog.c;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LoganAPI implements IMsiApi {
    public static ChangeQuickRedirect a;
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd");

    @MsiApiMethod(name = "loganWrite", request = WriteParam.class)
    public void write(WriteParam writeParam, MsiContext msiContext) {
        Object[] objArr = {writeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b7fdf1cb43c591a1ae8c56a1b1b9d50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b7fdf1cb43c591a1ae8c56a1b1b9d50");
            return;
        }
        c.a(writeParam.logString, writeParam.logType, writeParam.logTags);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "loganEvent", request = EventParam.class)
    public void event(EventParam eventParam, MsiContext msiContext) {
        Object[] objArr = {eventParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2615b3f95c37238c1536ed13d0f75872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2615b3f95c37238c1536ed13d0f75872");
            return;
        }
        HashMap hashMap = new HashMap();
        if (eventParam.logDetails != null) {
            for (Map.Entry<String, String> entry : eventParam.logDetails.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        c.a(eventParam.logTag, eventParam.logDesc, hashMap);
        msiContext.onSuccess(null);
    }

    @MsiApiMethod(name = "loganUpload", request = UploadParam.class)
    public void upload(UploadParam uploadParam, MsiContext msiContext) {
        Object[] objArr = {uploadParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1522a5c2696fed2cf36ec3e94d4688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1522a5c2696fed2cf36ec3e94d4688");
        } else if (!NVLinker.isLinkerInit()) {
            msiContext.onError(500, "inner error");
        } else {
            c.a(new String[]{b.format(new Date(com.meituan.android.time.c.b()))}, NVLinker.getUnionID(), String.valueOf(uploadParam.bizid));
            msiContext.onSuccess(null);
        }
    }

    @MsiApiMethod(name = "loganFlush")
    public void flush(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4e38225b3961aab261360822fabcd10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4e38225b3961aab261360822fabcd10");
            return;
        }
        c.b();
        msiContext.onSuccess(null);
    }
}
