package com.meituan.msc.common.aov_task;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    final d b;
    private final String c;
    private final Map<com.meituan.msc.common.aov_task.task.c<?>, String> d;
    private final Set<String> e;

    public e(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ef97d47d2d701307963b22f956653a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ef97d47d2d701307963b22f956653a8");
            return;
        }
        this.c = DiagnoseLog.ITEM_START;
        this.d = new HashMap();
        this.e = new HashSet();
        this.b = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(@NonNull com.meituan.msc.common.aov_task.task.c<?> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07bc1142b7d183fc88cd585ecec1dd3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07bc1142b7d183fc88cd585ecec1dd3f");
        }
        String str = this.d.get(cVar);
        if (str == null) {
            str = cVar.b();
            if (str.indexOf(32) >= 0) {
                str = CommonConstant.Symbol.DOUBLE_QUOTES + str + CommonConstant.Symbol.DOUBLE_QUOTES;
            }
            if (this.e.contains(str) || TextUtils.equals(str, DiagnoseLog.ITEM_START)) {
                str = str + CommonConstant.Symbol.UNDERLINE + cVar.hashCode();
            }
            this.e.add(str);
            this.d.put(cVar, str);
        }
        return str;
    }
}
