package com.meituan.v8jse;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class JSExecption extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;

    public JSExecption(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "627929145c1b3f32359eaf4b4227655d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "627929145c1b3f32359eaf4b4227655d");
        }
    }

    private static void throwExecption(String str, int i, String str2, String str3, int i2, int i3, int i4, int i5, String str4) throws RuntimeException {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (!PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06d3390045b4df232985dc2055119279", RobustBitConfig.DEFAULT_VALUE)) {
            throw new JSExecption(createExecptionMessage(str, i, str2, str3, i2, i3, i4, i5, str4));
        }
        PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06d3390045b4df232985dc2055119279");
    }

    private static String createExecptionMessage(String str, int i, String str2, String str3, int i2, int i3, int i4, int i5, String str4) {
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d14997205abd22f404188f4f61106a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d14997205abd22f404188f4f61106a3");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("jsFileName：" + str + " #|# 行号：" + i);
        StringBuilder sb2 = new StringBuilder(" #|# startPosition：");
        sb2.append(i4);
        sb.append(sb2.toString());
        sb.append(" #|# endPosition：" + i5);
        sb.append(" #|# startColumn：" + i2);
        sb.append(" #|# endColumn：" + i3);
        sb.append(" #|# 异常信息：" + str2);
        sb.append(" #|# 异常堆栈：" + str4);
        return sb.toString();
    }
}
