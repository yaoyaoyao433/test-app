package com.meituan.android.common.locate.wifi;

import android.os.SystemClock;
import android.util.LongSparseArray;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.util.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* loaded from: classes2.dex */
public final class a {
    private static volatile a c;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Object d = new Object();
    private LongSparseArray<C0225a> a;
    private final Object b;

    /* renamed from: com.meituan.android.common.locate.wifi.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0225a {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int a;
        public long b;
        public boolean c;

        public C0225a() {
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53722357194cb41c7a6f79d6bada04a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53722357194cb41c7a6f79d6bada04a4");
            return;
        }
        this.a = new LongSparseArray<>();
        this.b = new Object();
    }

    private static long a(LongSparseArray<C0225a> longSparseArray, long j) {
        c.a aVar;
        Object[] objArr = {longSparseArray, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b7710ce9b5863e26db725f7d37d707fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b7710ce9b5863e26db725f7d37d707fd")).longValue();
        }
        if (longSparseArray == null || longSparseArray.size() == 0) {
            aVar = new c.a("module_age_get_zero", "1", "dataList == null || dataList.size() == 0", b());
        } else {
            C0225a c0225a = longSparseArray.get(j);
            if (c0225a != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - c0225a.b;
                if (elapsedRealtime < 1000) {
                    com.meituan.android.common.locate.platform.sniffer.c.b(new c.a("module_age_get_zero", "3", "return SystemClock.elapsedRealtime() - currentDataItem.realTime", b()));
                }
                return elapsedRealtime;
            }
            aVar = new c.a("module_age_get_zero", "2", "currentDataItem == null", b());
        }
        com.meituan.android.common.locate.platform.sniffer.c.b(aVar);
        return 0L;
    }

    private static LongSparseArray<C0225a> a(List<b> list, LongSparseArray<C0225a> longSparseArray) {
        Object[] objArr = {list, longSparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d169bae44d1aa22c7be7b66c17564383", RobustBitConfig.DEFAULT_VALUE)) {
            return (LongSparseArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d169bae44d1aa22c7be7b66c17564383");
        }
        LongSparseArray<C0225a> longSparseArray2 = new LongSparseArray<>();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (longSparseArray.size() != 0) {
            for (b bVar : list) {
                long a = bVar.a();
                C0225a c0225a = longSparseArray.get(a);
                if (c0225a == null) {
                    c0225a = new C0225a();
                } else if (c0225a.a == bVar.b()) {
                    longSparseArray2.put(a, c0225a);
                }
                c0225a.a = bVar.b();
                c0225a.b = elapsedRealtime;
                c0225a.c = true;
                longSparseArray2.put(a, c0225a);
            }
        } else {
            for (b bVar2 : list) {
                C0225a c0225a2 = new C0225a();
                c0225a2.a = bVar2.b();
                c0225a2.b = elapsedRealtime;
                c0225a2.c = false;
                longSparseArray2.put(bVar2.a(), c0225a2);
            }
        }
        return longSparseArray2;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "910cec72f605862e45f0723c00450f52", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "910cec72f605862e45f0723c00450f52");
        }
        if (c == null) {
            synchronized (d) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84541ec2426e8c2563dacd67decfb2c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84541ec2426e8c2563dacd67decfb2c9");
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            com.meituan.android.common.locate.platform.logs.c.a("msg run timeout > 5s");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < Math.min(20, stackTrace.length); i++) {
                sb.append(stackTrace[i].getClassName());
                sb.append(CommonConstant.Symbol.DOT);
                sb.append(stackTrace[i].getMethodName());
                sb.append(CommonConstant.Symbol.BRACKET_LEFT);
                sb.append(stackTrace[i].getLineNumber());
                sb.append(")\n");
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final long a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a392f915bcdacbe7d49a57ca7f0e59bf", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a392f915bcdacbe7d49a57ca7f0e59bf")).longValue() : a(this.a, s.b(str));
    }

    public final void a(List<b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4592597d8bdd3aa15ac0d1a4e9f44a42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4592597d8bdd3aa15ac0d1a4e9f44a42");
        } else if (list.isEmpty()) {
        } else {
            synchronized (this.b) {
                this.a = a(list, this.a);
            }
        }
    }
}
