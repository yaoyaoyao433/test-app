package com.meituan.snare;

import android.text.TextUtils;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class s {
    public static ChangeQuickRedirect a;
    public boolean b;
    public String c;
    public Map<String, String> d;
    public boolean e;
    LinkedHashMap<String, File> f;
    public boolean g;
    private String h;
    private String i;
    private String j;
    private final CatchException k;

    public s(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abbbd0438165f2b36e96507f77daa2f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abbbd0438165f2b36e96507f77daa2f8");
            return;
        }
        this.b = true;
        this.h = null;
        this.d = new LinkedHashMap(64);
        this.i = null;
        this.j = null;
        this.e = false;
        this.f = new LinkedHashMap<>(8);
        this.g = false;
        this.k = new CatchException("TombStone", 1, LocationStrategy.LOCATION_TIMEOUT);
        this.c = str;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ede5f37be9eef96603789bc98b4aa7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ede5f37be9eef96603789bc98b4aa7a")).booleanValue();
        }
        String a2 = a("Crash type");
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        return a2.trim().equals(CommonConstant.File.JAVA);
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6433d4f92245b96a8d1a6e51e35f3f19", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6433d4f92245b96a8d1a6e51e35f3f19");
        }
        f();
        return this.h;
    }

    public final JSONObject c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2932480e8ab18a2fc2694a177a63efe", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2932480e8ab18a2fc2694a177a63efe");
        }
        f();
        try {
            return new JSONObject(this.i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69456dc98c50b5e102469c88bc735623", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69456dc98c50b5e102469c88bc735623");
        }
        f();
        return this.d.get(str);
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db0ed336017d12eec018336539bc1f53", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db0ed336017d12eec018336539bc1f53");
        }
        f();
        return this.j;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d8efaed6cdac7c3a96d28d9208d984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d8efaed6cdac7c3a96d28d9208d984");
            return;
        }
        f.a().e(this.c);
        for (File file : this.f.values()) {
            f.a().e(file.getAbsolutePath());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void f() {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.snare.s.f():void");
    }

    private void a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a09199d3414742fa15a3f00bb021896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a09199d3414742fa15a3f00bb021896");
            return;
        }
        String str = this.c == null ? "" : this.c;
        if (map.containsKey("Crash type")) {
            return;
        }
        if (str.indexOf("Java-crash") != -1) {
            map.put("Crash type", "Java");
        } else if (str.indexOf("native-Crash") != -1) {
            map.put("Crash type", "jni");
        }
    }

    private void b(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bfc5f2580370074b2d93a13b1a627b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bfc5f2580370074b2d93a13b1a627b");
        } else if (map.containsKey("Crash time")) {
        } else {
            map.put("Crash time", g());
        }
    }

    private void c(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14f8e031d58f2ecb01de3d9fac2b462a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14f8e031d58f2ecb01de3d9fac2b462a");
            return;
        }
        String str = this.c == null ? "" : this.c;
        int indexOf = str.indexOf("appVersion");
        if (map.containsKey("App version") || indexOf == -1) {
            return;
        }
        String substring = str.substring(indexOf);
        String[] split = substring.substring(0, substring.indexOf(CommonConstant.Symbol.UNDERLINE)).split(CommonConstant.Symbol.COLON);
        map.put("App version", split.length > 1 ? split[1] : "");
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4246a07648c6d5819d59a118a1e0658a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4246a07648c6d5819d59a118a1e0658a")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("Crash type") || str.equals("Start time") || str.equals("Crash time") || str.equals("APK Hash") || str.equals("App version") || str.equals("Chrome version") || str.equals("WebView PackageName") || str.equals("Rooted") || str.equals("API level") || str.equals("OS version") || str.equals("Kernel version") || str.equals("ABI list") || str.equals("Manufacturer") || str.equals("Brand") || str.equals("Model") || str.equals("Build fingerprint") || str.equals("ABI") || str.equals("Pid") || str.equals("Tid") || str.equals("Process name") || str.equals("Thread name") || str.equals("Abort message") || str.equals("Elf hash") || str.equals("Memory near") || str.equals("HprofFile") || str.equals("Logcat") || str.equals("Open files") || str.equals("Memory info") || str.equals("Other threads") || str.equals("FD info") || str.equals("Crash UUID") || str.equals("Crash signal") || str.equals("Process Memory Info") || str.equals("Java stacktrace") || str.equals("Main thread") || str.equals("Java stacktrace from native") || str.equals("Thread info") || str.equals("Stderr Watchdog Info") || str.equals("Thread Watchdog Info") || str.equals("FD Watchdog Info") || str.equals("Memory Watchdog Info") || str.equals("maxMemApp") || str.equals("totalMemPhone") || str.equals("totalMemApp") || str.equals("App state") || str.equals("MRN JS Details") || str.equals("dfpid") || str.equals("OOMPage") || str.equals("appLaunched") || str.equals("processABI") || str.equals("stacktrace from Backtrace");
    }

    private String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f88c0e631bb1a4df56edfd059961a22c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f88c0e631bb1a4df56edfd059961a22c");
        }
        if (this.c == null) {
            return "";
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(new File(this.c).lastModified()));
    }
}
