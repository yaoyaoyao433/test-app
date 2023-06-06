package com.meituan.android.loader.impl;

import android.text.TextUtils;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;

    public static /* synthetic */ void b(Set set) {
        Set set2;
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedReader bufferedReader = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9149e86ec26af839ff9aebbbdcb861c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9149e86ec26af839ff9aebbbdcb861c7");
            return;
        }
        try {
            Object[] objArr2 = {set};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e70bfe2d6ac2ce025acec9935fbfd6f2", RobustBitConfig.DEFAULT_VALUE)) {
                set2 = (Set) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e70bfe2d6ac2ce025acec9935fbfd6f2");
            } else {
                HashSet hashSet = new HashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    DynFile dynFile = (DynFile) it.next();
                    if (dynFile != null && dynFile.isInnerSo() && !TextUtils.isEmpty(dynFile.getName())) {
                        hashSet.add(dynFile.getName());
                    }
                }
                set2 = hashSet;
            }
            HashSet<String> hashSet2 = new HashSet();
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/self/maps"));
            try {
                for (String readLine = bufferedReader2.readLine(); readLine != null; readLine = bufferedReader2.readLine()) {
                    if (a(readLine, set2)) {
                        char[] charArray = readLine.toCharArray();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i >= charArray.length) {
                                break;
                            }
                            if (!Character.isWhitespace(charArray[i]) && ((i == 0 || Character.isWhitespace(charArray[i - 1])) && (i2 = i2 + 1) == 6)) {
                                hashSet2.add(readLine.substring(i));
                                break;
                            }
                            i++;
                        }
                    }
                }
                for (String str : hashSet2) {
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8b5d45d68cef63939ca587111a5d7347", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8b5d45d68cef63939ca587111a5d7347");
                    } else {
                        String substring = str.substring(str.lastIndexOf("/") + 1);
                        boolean contains = str.contains("/dynlib/");
                        HashMap hashMap = new HashMap();
                        hashMap.put("so_full_path", str);
                        hashMap.put("so_name", substring);
                        hashMap.put("is_hotfix", Boolean.valueOf(contains));
                        a.b().a("DynLoader_RunningSo", hashMap);
                    }
                }
                try {
                    bufferedReader2.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                try {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(NetLogConstants.Details.ERROR_MSG, th.getMessage() == null ? StringUtil.NULL : th.getMessage());
                    a.b().a("DynLoader_Error_DoReportSomeRunningSo", hashMap2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    BufferedReader bufferedReader3 = bufferedReader;
                    if (bufferedReader3 != null) {
                        try {
                            bufferedReader3.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void a(final Set<DynFile> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bad40abd7bbdeed74258d289474d8105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bad40abd7bbdeed74258d289474d8105");
        } else if (b) {
        } else {
            com.sankuai.android.jarvis.c.c("dynloader_running_so_reporter").schedule(new Runnable() { // from class: com.meituan.android.loader.impl.i.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebe64004b5e814434edf48c728ac5a65", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebe64004b5e814434edf48c728ac5a65");
                    } else {
                        i.b(set);
                    }
                }
            }, 5L, TimeUnit.MINUTES);
            b = true;
        }
    }

    private static boolean a(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9feede59c79297d614bb0c0fe24d8f44", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9feede59c79297d614bb0c0fe24d8f44")).booleanValue();
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String lowerCase = str.toLowerCase();
            if (lowerCase.endsWith("/lib" + it.next() + ".so")) {
                return true;
            }
        }
        return false;
    }
}
