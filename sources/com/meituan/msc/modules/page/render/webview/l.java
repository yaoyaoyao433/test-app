package com.meituan.msc.modules.page.render.webview;

import android.util.DisplayMetrics;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.page.render.webview.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static DisplayMetrics b;

    public static boolean a(com.meituan.msc.modules.update.f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c0df87ce869616d1a4d6fe9cb71faaf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c0df87ce869616d1a4d6fe9cb71faaf")).booleanValue() : k.a(fVar, str) && com.meituan.msc.common.config.b.e() && fVar.k(str);
    }

    public static String a(e.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e16042ea37f36e48ca80396d3cd59bf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e16042ea37f36e48ca80396d3cd59bf2");
        }
        String sourcePackageDir = aVar.q.getSourcePackageDir();
        DioFile dioFile = new DioFile(sourcePackageDir, aVar.a + ".template.html");
        String sourcePackageDir2 = aVar.q.getSourcePackageDir();
        DioFile dioFile2 = new DioFile(sourcePackageDir2, aVar.a + ".data.json");
        if (dioFile.c() && dioFile2.c()) {
            try {
                String a2 = r.a(dioFile);
                String a3 = r.a(dioFile2);
                if (a2 != null) {
                    a2 = a(a2);
                    com.meituan.msc.modules.reporter.g.b("load CompileTimeTemplate view@" + i + StringUtil.SPACE + aVar.a);
                    aVar.z = a3;
                }
                return a2;
            } catch (IOException e) {
                com.meituan.msc.modules.reporter.g.a(e);
                aVar.z = null;
                return null;
            } catch (Exception e2) {
                com.meituan.msc.modules.reporter.g.a("CompileTimeTemplate", e2);
                aVar.z = null;
                return null;
            }
        }
        return null;
    }

    private static String a(String str) throws NumberFormatException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1f1f9821638b37be9c767b198838617", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1f1f9821638b37be9c767b198838617");
        }
        Matcher matcher = Pattern.compile("<\\$.*?\\$>").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group();
            String trim = group.substring(2, group.length() - 2).trim();
            Object[] objArr2 = {trim};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            double d = 0.0d;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c8e3704d3f86dbc1cb3a32b4d991838f", RobustBitConfig.DEFAULT_VALUE)) {
                d = ((Double) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c8e3704d3f86dbc1cb3a32b4d991838f")).doubleValue();
            } else {
                double parseDouble = Double.parseDouble(trim);
                if (parseDouble != 0.0d) {
                    if (b == null) {
                        b = MSCEnvHelper.getContext().getResources().getDisplayMetrics();
                    }
                    double d2 = (parseDouble / 375.0d) * (b.widthPixels / b.density);
                    double floor = d2 >= 0.0d ? Math.floor(d2 + 1.0E-4d) : Math.ceil(d2 - 1.0E-4d);
                    if (floor == 0.0d) {
                        floor = 1.0d;
                    }
                    d = floor;
                }
            }
            matcher.appendReplacement(stringBuffer, String.valueOf(d));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
