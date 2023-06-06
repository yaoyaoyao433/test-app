package com.dianping.picassocontroller.monitor;

import android.text.TextUtils;
import android.util.Pair;
import com.dianping.picasso.PicassoEnvironment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static AtomicInteger g = new AtomicInteger();
    public Map<String, Long> b;
    public int c;
    public f d;
    private volatile ArrayList<Pair<Long, Long>> e;
    private final int f;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da1f189d6e704076af7e201e45bc828f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da1f189d6e704076af7e201e45bc828f");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.e = new ArrayList<>();
        this.f = 20;
        this.c = 2;
        f("entry_point");
    }

    public a(a aVar) {
        this();
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3421fe80de31dfa5e5971cf4b7a18f58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3421fe80de31dfa5e5971cf4b7a18f58");
        } else {
            this.b.putAll(aVar.b);
        }
    }

    private void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83061beeb13a2b84215b5b2c672fbfcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83061beeb13a2b84215b5b2c672fbfcb");
        } else {
            this.b.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bfb00c47ef5cae4c9bf245d6a9e9faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bfb00c47ef5cae4c9bf245d6a9e9faa");
            return;
        }
        f(str + "_prepare");
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "108197411e30f25907aa9d215b80ca54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "108197411e30f25907aa9d215b80ca54");
            return;
        }
        f(str + "_start");
    }

    public final void c(String str) {
        long longValue;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2581d23f9fab40c8a99fc3cfe543a388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2581d23f9fab40c8a99fc3cfe543a388");
            return;
        }
        f(str + "_end");
        Long l = this.b.get(str + "_prepare");
        Long l2 = this.b.get(str + "_start");
        if (l2 == null) {
            return;
        }
        Long l3 = this.b.get(str + "_end");
        long j = 0;
        if (l != null) {
            j = l2.longValue() - l.longValue();
            longValue = (int) (l3.longValue() - l.longValue());
        } else {
            longValue = (int) (l3.longValue() - l2.longValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cost: ");
        sb.append(longValue);
        sb.append("ms, prepared cost: ");
        sb.append(j);
        sb.append("ms");
        if (this.d != null) {
            l2.longValue();
            l3.longValue();
        }
        if ("vc_precompute" != str || this.e.size() >= 20) {
            return;
        }
        this.e.add(new Pair<>(l3, Long.valueOf(longValue)));
    }

    public final void a(String str, String str2, int i) {
        int longValue;
        String substring;
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "505e36f6f675b614c2c10f07dc4b4392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "505e36f6f675b614c2c10f07dc4b4392");
            return;
        }
        Map<String, Long> map = this.b;
        Long l = map.get(str + "_start");
        Map<String, Long> map2 = this.b;
        Long l2 = map2.get(str + "_end");
        if (l == null || l2 == null || (longValue = (int) (l2.longValue() - l.longValue())) < 0) {
            return;
        }
        b a2 = b.a(PicassoEnvironment.globalContext);
        Object[] objArr2 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c425c36f8da30d24bb60f4d61fdd4d69", RobustBitConfig.DEFAULT_VALUE)) {
            substring = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c425c36f8da30d24bb60f4d61fdd4d69");
        } else {
            substring = (TextUtils.isEmpty(str2) || !str2.endsWith(".js")) ? str2 : str2.substring(0, str2.length() - 3);
        }
        Object[] objArr3 = {substring, Integer.valueOf(longValue), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "35d2d1d67fd88fc9f176f9676b1fc9de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "35d2d1d67fd88fc9f176f9676b1fc9de");
        } else {
            a2.pv(0L, substring, 0, 0, i, 0, 0, longValue);
        }
    }

    public final void b(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "723613187a9df40da76431a50e47d07f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "723613187a9df40da76431a50e47d07f");
            return;
        }
        c(str);
        a(str, str2, i);
    }

    public final String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aabfdd059df196aee5b43757922f4785", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aabfdd059df196aee5b43757922f4785");
        }
        return str + "@" + g.incrementAndGet();
    }

    public final String a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "f5733cc32caaaab46318e35e61ff0f65", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "f5733cc32caaaab46318e35e61ff0f65");
        }
        StringBuilder sb = new StringBuilder("controller_invoke");
        sb.append(CommonConstant.Symbol.COLON);
        sb.append(str);
        if (objArr != null && objArr.length > 0 && this.c != 0) {
            sb.append(",args: ");
            int length = this.c == -1 ? objArr.length : Math.min(objArr.length, this.c);
            for (int i = 0; i < length; i++) {
                sb.append(objArr[i]);
                sb.append(CommonConstant.Symbol.COMMA);
            }
        }
        sb.append("@");
        sb.append(g.incrementAndGet());
        return sb.toString();
    }

    public final long e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b3443cb79ce8852632165d5cfbdf24", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b3443cb79ce8852632165d5cfbdf24")).longValue();
        }
        if (this.b == null) {
            return -1L;
        }
        Map<String, Long> map = this.b;
        Long l = map.get(str + "_start");
        Map<String, Long> map2 = this.b;
        Long l2 = map2.get(str + "_end");
        if (l == null || l2 == null || l2.longValue() - l.longValue() < 0) {
            return -1L;
        }
        return l2.longValue() - l.longValue();
    }
}
