package com.meituan.android.common.mtguard.collect;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.InputDevice;
import android.view.MotionEvent;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.dfingerprint.store.BioSharedPref;
import com.meituan.android.common.mtguard.LifecycleManager;
import com.meituan.android.common.mtguard.NBridge;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.List;
import java.util.Vector;
/* loaded from: classes2.dex */
public class d implements com.meituan.android.common.mtguard.collect.c {
    public static C0227d c = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static d j = null;
    private static final int m = 322;
    private static final int n = 321;
    private static final String o = "unknown";
    private static final int p = 1000;
    public e a;
    public List<C0227d> b;
    public List<c> d;
    public boolean e;
    public boolean f;
    public boolean g;
    public a h;
    public Context i;
    private boolean k;
    private boolean l;

    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("valid")
        public boolean a;
        @SerializedName("type")
        public String b;
        @SerializedName("freq")
        public int c;
        @SerializedName("start_delay")
        public int d;
        @SerializedName("duration")
        public int e;
        @SerializedName("interval_in_min")
        public int f;
        @SerializedName("max_count")
        public int g;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cd857bd925f63db807c8c6068150f2c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cd857bd925f63db807c8c6068150f2c");
                return;
            }
            this.a = true;
            this.b = "1|2|3";
            this.c = 1;
            this.d = 30;
            this.e = 15;
            this.f = 15;
            this.g = 0;
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65271aacbc8037dfd4386e59f2b1622b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65271aacbc8037dfd4386e59f2b1622b")).booleanValue() : this.a && this.d >= 0 && this.e > 0 && this.f > 0 && this.g >= 0;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7a83781ee2297495ff4ed7dabb4183b", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7a83781ee2297495ff4ed7dabb4183b");
            }
            return "BioConfig{valid=" + this.a + ", type=" + this.b + ", freq=" + this.c + ", start_delay=" + this.d + ", duration=" + this.e + ", interval=" + this.f + ", max_count=" + this.g + '}';
        }
    }

    /* loaded from: classes2.dex */
    public final class b {
        public static ChangeQuickRedirect changeQuickRedirect;
        public float a;
        public float b;
        public float c;
        public float d;
        public long e;

        public b() {
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aa72c24f00fc20198b2a7a3d2561783", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aa72c24f00fc20198b2a7a3d2561783");
            }
            return "[" + this.a + CommonConstant.Symbol.COMMA + this.b + CommonConstant.Symbol.COMMA + this.c + CommonConstant.Symbol.COMMA + this.d + CommonConstant.Symbol.COMMA + this.e + ']';
        }
    }

    /* loaded from: classes2.dex */
    public final class c {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;

        public c(boolean z) {
            Object[] objArr = {d.this, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79572a2cf5161dcebdf884ed92a2fe8f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79572a2cf5161dcebdf884ed92a2fe8f");
            } else {
                this.g = z;
            }
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3069b5190e09b4d5ce529471e890d760", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3069b5190e09b4d5ce529471e890d760");
            }
            if (this.g) {
                return "[\"" + this.a + "\"," + this.b + CommonConstant.Symbol.COMMA + this.c + CommonConstant.Symbol.COMMA + this.d + CommonConstant.Symbol.COMMA + this.e + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
            }
            return "[" + this.a + CommonConstant.Symbol.COMMA + this.b + CommonConstant.Symbol.COMMA + this.c + CommonConstant.Symbol.COMMA + this.d + CommonConstant.Symbol.COMMA + this.e + CommonConstant.Symbol.COMMA + this.f + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }
    }

    /* renamed from: com.meituan.android.common.mtguard.collect.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0227d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public b a;
        public List<b> b;
        public b c;
        public c d;
        public long e;
        public long f;

        public C0227d() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00d1af2394ada3fdf03aac0e570ddf45", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00d1af2394ada3fdf03aac0e570ddf45");
                return;
            }
            this.a = new b();
            this.b = new Vector();
            this.c = new b();
            this.d = new c(true);
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9c71c85ec7b8df023147847d4349d28", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9c71c85ec7b8df023147847d4349d28");
            }
            return "{\"start\":" + this.a + ",\"trail\":" + this.b + ",\"end\":" + this.c + ",\"extra\":" + this.d + '}';
        }
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f72e8426f4a8d5d1b4357380033bc68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f72e8426f4a8d5d1b4357380033bc68");
            return;
        }
        this.b = new Vector();
        this.d = new Vector();
        this.k = true;
        this.l = true;
        this.e = false;
        this.f = false;
        this.g = true;
        this.i = context;
    }

    public static d a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50502636c03eaf2204a9f23b26c8222a", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50502636c03eaf2204a9f23b26c8222a");
        }
        if (j == null) {
            synchronized (d.class) {
                if (j == null) {
                    j = new d(context);
                }
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(MotionEvent motionEvent) {
        List list;
        C0227d c0227d;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a678fdb02cafc03853115d91a1f87eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a678fdb02cafc03853115d91a1f87eb");
            return;
        }
        if (motionEvent.getActionMasked() == 0 && this.d.size() < 1000) {
            this.d.add(a(motionEvent, false));
        }
        if (this.a == null || this.h == null || !this.h.a()) {
            return;
        }
        BioSharedPref bioSharedPref = BioSharedPref.getInstance(this.i);
        if (LifecycleManager.firstProcessBootTime <= 0) {
            if (LifecycleManager.isFirstProcess()) {
                return;
            }
            LifecycleManager.firstProcessBootTime = bioSharedPref.readLong(BioSharedPref.FIRST_PROCESS_BOOT_TIME_KEY);
        }
        int readInt = bioSharedPref.readInt(BioSharedPref.BIO_COLLECT_INDEX);
        long readLong = bioSharedPref.readLong(BioSharedPref.BIO_COLLECT_CURRENTTIMEMILLIS);
        if ((readLong != -1 || SystemClock.elapsedRealtime() - LifecycleManager.firstProcessBootTime >= this.h.d * 1000) && System.currentTimeMillis() >= readLong + (this.h.f * 60000)) {
            if (readInt > this.h.g + 2) {
                if (this.e) {
                    return;
                }
                this.e = true;
                return;
            }
            String readString = bioSharedPref.readString(BioSharedPref.BIO_COLLECT_MTX_KEY);
            String a2 = com.meituan.android.common.mtguard.utils.b.a();
            if (TextUtils.isEmpty(readString) || readString.equals(a2)) {
                if (TextUtils.isEmpty(readString)) {
                    this.f = true;
                }
                if (this.f && this.g) {
                    bioSharedPref.writeString(BioSharedPref.BIO_COLLECT_MTX_KEY, a2);
                    this.f = false;
                    this.g = false;
                    MTGuardLog.setLogan("start collect bio, processName:" + a2 + ", process_pid:" + Process.myPid());
                    o.c().a(this.a, this.h.b, this.h.c, this.h.e);
                    new com.meituan.android.common.mtguard.collect.b(this.a).a((long) this.h.e, false, true);
                }
                if (this.b.size() >= 1000) {
                    return;
                }
                switch (motionEvent.getActionMasked()) {
                    case 0:
                        C0227d c0227d2 = new C0227d();
                        c = c0227d2;
                        c0227d2.e = motionEvent.getDownTime();
                        int actionIndex = motionEvent.getActionIndex();
                        c.a.a = motionEvent.getRawX();
                        c.a.b = motionEvent.getRawY();
                        c.a.c = motionEvent.getSize(actionIndex);
                        c.a.d = motionEvent.getPressure(actionIndex);
                        c.a.e = System.currentTimeMillis();
                        c.f = motionEvent.getEventTime();
                        c.d = a(motionEvent, true);
                        list = this.b;
                        c0227d = c;
                        break;
                    case 1:
                        if (c == null || c.e != motionEvent.getDownTime()) {
                            return;
                        }
                        int actionIndex2 = motionEvent.getActionIndex();
                        c.c.a = motionEvent.getRawX();
                        c.c.b = motionEvent.getRawY();
                        c.c.c = motionEvent.getSize(actionIndex2);
                        c.c.d = motionEvent.getPressure(actionIndex2);
                        c.c.e = motionEvent.getEventTime() - c.f;
                        c.f = motionEvent.getEventTime();
                        return;
                    case 2:
                        if (c != null && c.e == motionEvent.getDownTime() && c.b.size() < 1000) {
                            b bVar = new b();
                            int actionIndex3 = motionEvent.getActionIndex();
                            bVar.a = motionEvent.getRawX();
                            bVar.b = motionEvent.getRawY();
                            bVar.c = motionEvent.getSize(actionIndex3);
                            bVar.d = motionEvent.getPressure(actionIndex3);
                            bVar.e = motionEvent.getEventTime() - c.f;
                            c.f = motionEvent.getEventTime();
                            list = c.b;
                            c0227d = bVar;
                            break;
                        } else {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                list.add(c0227d);
            }
        }
    }

    private void b() {
        if (this.e) {
            return;
        }
        this.e = true;
    }

    private String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad68244ed3b713b81d3dae12682f7b3a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad68244ed3b713b81d3dae12682f7b3a");
        }
        MTGuardLog.setLogan("get click info in bio thread:".concat(String.valueOf(com.meituan.android.common.mtguard.collect.b.a())));
        return this.b.toString();
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a437c00f56f9952fd0a8d187d129f28", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a437c00f56f9952fd0a8d187d129f28") : this.d.toString();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c93c8cf023c152f7c5e3e2f9595e674d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c93c8cf023c152f7c5e3e2f9595e674d");
            return;
        }
        o.c().d();
        MTGuardLog.setLogan("stop collect click:" + this.b.size() + ", extral info:" + this.d.size());
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9ff8cda769baa25bdaea5217897cc3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9ff8cda769baa25bdaea5217897cc3a");
            return;
        }
        try {
            o.c().e();
            if (this.b.size() == 0) {
                return;
            }
            this.b.clear();
            MTGuardLog.setLogan("clear click info");
            NBridge.main3(50, new Object[]{322});
        } catch (Throwable unused) {
        }
    }

    public final c a(MotionEvent motionEvent, boolean z) {
        Object[] objArr = {motionEvent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "268e20e29837422e119754610aadb672", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "268e20e29837422e119754610aadb672");
        }
        c cVar = new c(z);
        cVar.b = motionEvent.getSource();
        InputDevice device = motionEvent.getDevice();
        if (device == null) {
            cVar.a = "unknown";
            cVar.c = 0;
        } else {
            String name = device.getName();
            if (name == null) {
                name = "unknown";
            }
            cVar.a = name;
            cVar.c = device.getKeyboardType();
        }
        cVar.d = motionEvent.getDeviceId();
        cVar.e = motionEvent.getToolType(0);
        if (!z) {
            if (device == null) {
                cVar.f = 3;
            }
            cVar.f = !device.isVirtual() ? 1 : 2;
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[Catch: Exception -> 0x00e8, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e8, blocks: (B:7:0x001f, B:9:0x0038, B:12:0x0042, B:14:0x0068, B:19:0x0076, B:21:0x008b, B:25:0x0097, B:27:0x00a2), top: B:32:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.android.common.mtguard.collect.e r13) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.mtguard.collect.d.a(com.meituan.android.common.mtguard.collect.e):void");
    }

    @Override // com.meituan.android.common.mtguard.collect.c
    public final void a(boolean z) {
        if (z) {
            this.k = false;
            this.l = false;
        }
    }

    public final boolean a() {
        return !this.e && this.k && this.l;
    }
}
