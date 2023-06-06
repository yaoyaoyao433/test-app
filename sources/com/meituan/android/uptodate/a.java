package com.meituan.android.uptodate;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.Toast;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.downloadmanager.model.DownloadInfo;
import com.meituan.android.patch_service.PatchService;
import com.meituan.android.uptodate.a;
import com.meituan.android.uptodate.interfac.c;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.android.uptodate.util.b;
import com.meituan.android.uptodate.util.d;
import com.meituan.android.uptodate.util.g;
import com.meituan.android.walle.e;
import com.meituan.android.walle.f;
import com.meituan.android.walle.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static a m = null;
    private static boolean w = false;
    public c b;
    public String c;
    public int d;
    public String e;
    public int f;
    public String g;
    public Executor h;
    private boolean i;
    private boolean j;
    private Handler k;
    private Context l;
    private VersionInfo n;
    private String o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private b u;
    private boolean v;

    public static /* synthetic */ File a(a aVar, String str, boolean z) {
        File file;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "aff393621db521d0410a5224d0199545", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "aff393621db521d0410a5224d0199545");
        }
        File file2 = new File(str);
        if (!z) {
            file = new File(d.c(aVar.l));
        } else {
            file = new File(d.b(aVar.l));
        }
        file.delete();
        file2.renameTo(file);
        return file;
    }

    public static /* synthetic */ void a(final a aVar, final VersionInfo versionInfo, final String str) {
        String a2;
        Object[] objArr = {versionInfo, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "eecf295bb6f627f349a0141ddbd9dbb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "eecf295bb6f627f349a0141ddbd9dbb9");
            return;
        }
        String h = d.h(aVar.l);
        String d = d.d(aVar.l);
        String b2 = d.b(aVar.l);
        Context context = aVar.l;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9741adb689c809078e9d5cc6808f3527", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9741adb689c809078e9d5cc6808f3527");
        } else {
            a2 = d.a(context);
            if (!TextUtils.isEmpty(a2)) {
                a2 = a2 + File.separator + "update_merge.temp";
            }
        }
        String str2 = a2;
        aVar.k.postDelayed(new Runnable() { // from class: com.meituan.android.uptodate.a.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c668ff5c9163308c66044405cc29cb9f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c668ff5c9163308c66044405cc29cb9f");
                } else if (a.this.j) {
                } else {
                    a.this.a("patch time out", 20);
                    a.this.i = true;
                    a.this.d = 7;
                    if (a.this.b != null && !a.this.p) {
                        a.this.b.a(7, versionInfo, null);
                    }
                    com.sankuai.waimai.launcher.util.aop.b.a(new AsyncTaskC0371a(null), new Void[0]);
                    a.a(a.this, versionInfo.appHttpsUrl, false, str);
                }
            }
        }, 300000L);
        final long currentTimeMillis = System.currentTimeMillis();
        Context context2 = aVar.l;
        final Handler handler = new Handler(aVar.l.getMainLooper());
        PatchService.a(context2, h, d, b2, str2, new ResultReceiver(handler) { // from class: com.meituan.android.uptodate.UpdateManagerV2$4
            public static ChangeQuickRedirect a;

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                boolean z;
                Handler handler2;
                int i2;
                String a3;
                Object[] objArr3 = {Integer.valueOf(i), bundle};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5fc118d6343c2253394c9a320ee49b0a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5fc118d6343c2253394c9a320ee49b0a");
                    return;
                }
                super.onReceiveResult(i, bundle);
                z = a.this.i;
                if (z) {
                    return;
                }
                handler2 = a.this.k;
                handler2.removeCallbacksAndMessages(null);
                a.this.j = true;
                try {
                    a3 = PatchService.a(bundle);
                } catch (Exception e) {
                    a.this.a("do patch error", 22);
                    b.a(e);
                }
                if (!TextUtils.equals(versionInfo.diffInfo.md5New, g.a(new File(a3)))) {
                    a.this.a("patch file md5 error", 23);
                    if (a.this.b == null || a.this.p) {
                        i2 = 7;
                    } else {
                        i2 = 7;
                        a.this.b.a(7, versionInfo, null);
                    }
                    a.this.d = i2;
                    com.sankuai.waimai.launcher.util.aop.b.a(new a.AsyncTaskC0371a(d.d(a.this.l)), new Void[0]);
                    a.a(a.this, versionInfo.appHttpsUrl, false, str);
                    return;
                }
                VersionInfo.DiffInfo diffInfo = versionInfo.diffInfo;
                File file = new File(a3);
                String str3 = diffInfo.channel;
                Map<String, String> map = diffInfo.extraInfo;
                Object[] objArr4 = {file, str3, map, (byte) 1};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "86646c49f04b85dc49acb5cb420b75a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "86646c49f04b85dc49acb5cb420b75a5");
                } else {
                    HashMap hashMap = new HashMap();
                    Map<String, String> a4 = e.a(file);
                    if (a4 != null) {
                        hashMap.putAll(a4);
                    }
                    if (map != null) {
                        map.remove("channel");
                        hashMap.putAll(map);
                    }
                    if (str3 != null && str3.length() > 0) {
                        hashMap.put("channel", str3);
                    }
                    String jSONObject = new JSONObject(hashMap).toString();
                    Object[] objArr5 = {file, jSONObject, (byte) 1};
                    ChangeQuickRedirect changeQuickRedirect5 = f.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "eafd064a6e46910974292aec5776da20", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "eafd064a6e46910974292aec5776da20");
                    } else {
                        Object[] objArr6 = {file, 1903654775, jSONObject, (byte) 1};
                        ChangeQuickRedirect changeQuickRedirect6 = i.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "77779523ac9675f13b2a5766140d05d8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "77779523ac9675f13b2a5766140d05d8");
                        } else {
                            byte[] bytes = jSONObject.getBytes("UTF-8");
                            ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
                            allocate.order(ByteOrder.LITTLE_ENDIAN);
                            allocate.put(bytes, 0, bytes.length);
                            allocate.flip();
                            Object[] objArr7 = {file, 1903654775, allocate, (byte) 1};
                            ChangeQuickRedirect changeQuickRedirect7 = i.a;
                            if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "b0601821badca8ddc94ea80eb3171fbf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "b0601821badca8ddc94ea80eb3171fbf");
                            } else {
                                final HashMap hashMap2 = new HashMap();
                                hashMap2.put(1903654775, allocate);
                                Object[] objArr8 = {file, hashMap2, (byte) 1};
                                ChangeQuickRedirect changeQuickRedirect8 = i.a;
                                if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "20b1f1db22fe4782e8e64175b4d5642b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "20b1f1db22fe4782e8e64175b4d5642b");
                                } else {
                                    i.a(file, new i.a() { // from class: com.meituan.android.walle.i.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.meituan.android.walle.i.a
                                        public final com.meituan.android.walle.a a(Map<Integer, ByteBuffer> map2) {
                                            Object[] objArr9 = {map2};
                                            ChangeQuickRedirect changeQuickRedirect9 = a;
                                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "b2bf8910dc0836dbab3d3749cf648f63", RobustBitConfig.DEFAULT_VALUE)) {
                                                return (com.meituan.android.walle.a) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "b2bf8910dc0836dbab3d3749cf648f63");
                                            }
                                            if (hashMap2 != null && !hashMap2.isEmpty()) {
                                                map2.putAll(hashMap2);
                                            }
                                            com.meituan.android.walle.a aVar2 = new com.meituan.android.walle.a();
                                            for (Map.Entry<Integer, ByteBuffer> entry : map2.entrySet()) {
                                                aVar2.a(new b(entry.getKey().intValue(), entry.getValue()));
                                            }
                                            return aVar2;
                                        }
                                    }, true);
                                }
                            }
                        }
                    }
                }
                a.this.d = 7;
                new File(a3).renameTo(new File(d.c(a.this.l)));
                com.sankuai.waimai.launcher.util.aop.b.a(new a.AsyncTaskC0371a(a3), new Void[0]);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                a.this.a("do patch success", 21);
                a.a(a.this, "do patch time", 24, currentTimeMillis2);
                if (a.this.b != null && !a.this.p) {
                    a.this.b.a(7, versionInfo, null);
                }
                if (a.this.p || a.this.r || a.this.s) {
                    return;
                }
                g.a(a.this.l, a.this.c, versionInfo.currentVersion, a.this.b);
            }
        });
    }

    public static /* synthetic */ void a(a aVar, String str, int i, long j) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f501c48372bde9ce08163c98001e613b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f501c48372bde9ce08163c98001e613b");
            return;
        }
        String str2 = aVar.e;
        if (TextUtils.isEmpty(str2)) {
            str2 = aVar.l.getPackageName();
        }
        Object[] objArr2 = {str, Integer.valueOf(i), str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.uptodate.util.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a8826c32da0a539c5eaa1a2ee0ace9b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a8826c32da0a539c5eaa1a2ee0ace9b1");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("cause", str);
        hashMap.put("reportType", str2);
        hashMap.put("duration", Long.valueOf(j));
        Babel.log("meituan-update", "meituan-update", hashMap);
    }

    public static /* synthetic */ void a(a aVar, String str, boolean z, String str2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "14589eaffa7f682a1ce44987457a605c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "14589eaffa7f682a1ce44987457a605c");
            return;
        }
        if (!TextUtils.equals(str, aVar.o)) {
            aVar.cancel();
        }
        aVar.q = false;
        aVar.o = str;
        aVar.r = false;
        String a2 = d.a(aVar.l);
        if (aVar.u == null) {
            aVar.u = new b(str, z);
        } else if (aVar.u.c != z || !TextUtils.equals(aVar.u.b, str)) {
            com.meituan.android.downloadmanager.b.a(aVar.l).cancel(str, aVar.u);
            aVar.u = new b(str, z);
        }
        com.meituan.android.downloadmanager.b.a(aVar.l).a(str, a2, str2, aVar.e, aVar.u);
    }

    public static /* synthetic */ boolean a(a aVar, VersionInfo versionInfo) {
        Object[] objArr = {versionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "7730c5b7b9f57317f24471f0b53f39f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "7730c5b7b9f57317f24471f0b53f39f6")).booleanValue();
        }
        String str = "";
        if (versionInfo != null && versionInfo.diffInfo != null && !TextUtils.isEmpty(versionInfo.diffInfo.md5Diff)) {
            str = versionInfo.diffInfo.md5Diff;
        }
        return TextUtils.equals(str, g.a(new File(d.b(aVar.l))));
    }

    public static /* synthetic */ boolean c(a aVar, boolean z) {
        aVar.q = true;
        return true;
    }

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe66cc4f38ce85f7b171b01271db9796", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe66cc4f38ce85f7b171b01271db9796");
            return;
        }
        this.i = false;
        this.j = false;
        this.k = new Handler();
        this.t = true;
        this.v = false;
        this.h = com.sankuai.android.jarvis.c.b("update-pool", 5);
        this.l = context.getApplicationContext();
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7a3206c70d77f7b0ecea539643eed28", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7a3206c70d77f7b0ecea539643eed28");
        }
        if (m == null) {
            synchronized (a.class) {
                m = new a(context);
            }
        }
        return m;
    }

    public static boolean a() {
        return w;
    }

    public final void b() {
        this.r = false;
        if (this.b != null) {
            this.b = null;
        }
    }

    public final void a(int i, String str, String str2, long j, long j2, boolean z, Map<String, String> map, final com.meituan.android.uptodate.interfac.a aVar) {
        int i2;
        Object[] objArr = {Integer.valueOf(i), str, str2, new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d3c47825f738a550d853364a45ee2b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d3c47825f738a550d853364a45ee2b7");
        } else if (aVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            if (i <= 0) {
                try {
                } catch (Exception e) {
                    e = e;
                }
                try {
                    i2 = this.l.getPackageManager().getPackageInfo(this.l.getPackageName(), 0).versionCode;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    i2 = i;
                    com.sankuai.waimai.launcher.util.aop.b.a(new com.meituan.android.uptodate.download.a(this.l, i2, str, str2, j, this.g, j2, z, map) { // from class: com.meituan.android.uptodate.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.os.AsyncTask
                        public final /* synthetic */ void onPostExecute(VersionInfo versionInfo) {
                            VersionInfo versionInfo2 = versionInfo;
                            Object[] objArr2 = {versionInfo2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c6377f0edb080c6315102e39e87f92e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c6377f0edb080c6315102e39e87f92e");
                            } else if (aVar != null) {
                                if (aVar instanceof com.meituan.android.uptodate.interfac.b) {
                                    if (versionInfo2 == null || versionInfo2.exception != null) {
                                        return;
                                    }
                                } else if (versionInfo2 != null && versionInfo2.exception != null) {
                                    versionInfo2 = null;
                                }
                                aVar.a(versionInfo2);
                            }
                        }
                    }, this.h, new Void[0]);
                }
                com.sankuai.waimai.launcher.util.aop.b.a(new com.meituan.android.uptodate.download.a(this.l, i2, str, str2, j, this.g, j2, z, map) { // from class: com.meituan.android.uptodate.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.os.AsyncTask
                    public final /* synthetic */ void onPostExecute(VersionInfo versionInfo) {
                        VersionInfo versionInfo2 = versionInfo;
                        Object[] objArr2 = {versionInfo2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c6377f0edb080c6315102e39e87f92e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c6377f0edb080c6315102e39e87f92e");
                        } else if (aVar != null) {
                            if (aVar instanceof com.meituan.android.uptodate.interfac.b) {
                                if (versionInfo2 == null || versionInfo2.exception != null) {
                                    return;
                                }
                            } else if (versionInfo2 != null && versionInfo2.exception != null) {
                                versionInfo2 = null;
                            }
                            aVar.a(versionInfo2);
                        }
                    }
                }, this.h, new Void[0]);
            }
            i2 = i;
            com.sankuai.waimai.launcher.util.aop.b.a(new com.meituan.android.uptodate.download.a(this.l, i2, str, str2, j, this.g, j2, z, map) { // from class: com.meituan.android.uptodate.a.1
                public static ChangeQuickRedirect a;

                @Override // android.os.AsyncTask
                public final /* synthetic */ void onPostExecute(VersionInfo versionInfo) {
                    VersionInfo versionInfo2 = versionInfo;
                    Object[] objArr2 = {versionInfo2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c6377f0edb080c6315102e39e87f92e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c6377f0edb080c6315102e39e87f92e");
                    } else if (aVar != null) {
                        if (aVar instanceof com.meituan.android.uptodate.interfac.b) {
                            if (versionInfo2 == null || versionInfo2.exception != null) {
                                return;
                            }
                        } else if (versionInfo2 != null && versionInfo2.exception != null) {
                            versionInfo2 = null;
                        }
                        aVar.a(versionInfo2);
                    }
                }
            }, this.h, new Void[0]);
        }
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf13b674c443435175e42a187d753ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf13b674c443435175e42a187d753ca");
        } else if (this.n == null || this.n.forceupdate != 1) {
            com.meituan.android.downloadmanager.b.a(this.l).cancel(this.o, this.u);
            this.r = true;
            if (this.b != null) {
                if (this.d == 4) {
                    this.b.a(5, this.n, null);
                } else if (this.d == 6) {
                    this.b.a(7, this.n, null);
                }
            }
        }
    }

    public final void a(boolean z, String str, boolean z2) {
        Object[] objArr = {(byte) 0, str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "701ccac99cdf4c2ec831a02d4207d1da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "701ccac99cdf4c2ec831a02d4207d1da");
            return;
        }
        this.s = z2;
        a(false, str);
    }

    public final void a(final boolean z, final String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f25f0f60764abd75c8ab31163ba46ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f25f0f60764abd75c8ab31163ba46ae");
            return;
        }
        this.p = z;
        if (!this.q && !this.r && !TextUtils.equals(this.o, this.n.appHttpsUrl)) {
            if (this.n.diffInfo != null && !TextUtils.equals(this.o, this.n.diffInfo.diffHttpsUrl)) {
                cancel();
                this.q = true;
            } else if (this.n.diffInfo == null) {
                cancel();
                this.q = true;
            }
        }
        if (this.d == 6 && this.b != null) {
            if (z) {
                return;
            }
            this.b.a(6, this.n, null);
            this.d = 6;
        } else if (g.a(this.l, this.n.currentVersion)) {
            if (z) {
                return;
            }
            a("has apk", 11);
            if (this.b != null) {
                this.b.a(2, this.n, null);
            }
        } else if (TextUtils.isEmpty(this.n.appHttpsUrl)) {
        } else {
            if (!d.a()) {
                if (!z) {
                    if (this.b != null) {
                        this.b.a(10, null, null);
                    } else {
                        Toast.makeText(this.l, this.l.getString(R.string.update_no_sdcard), 0).show();
                    }
                }
                a("no sdcard", 13);
                return;
            }
            com.sankuai.waimai.launcher.util.aop.b.a(new AsyncTask<Void, Void, Boolean>() { // from class: com.meituan.android.uptodate.a.2
                public static ChangeQuickRedirect a;

                @Override // android.os.AsyncTask
                public final /* synthetic */ void onPostExecute(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14770340a9d48640b7014e2fdaa9105e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14770340a9d48640b7014e2fdaa9105e");
                        return;
                    }
                    String str2 = a.this.n.appHttpsUrl;
                    if (bool2.booleanValue()) {
                        if (((a.this.n.diffInfo == null || TextUtils.isEmpty(a.this.n.diffInfo.diffHttpsUrl)) ? false : true) && (z || a.this.f == 0)) {
                            a.a(a.this, a.this.n.diffInfo.diffHttpsUrl, true, str);
                            return;
                        }
                    }
                    a.a(a.this, str2, false, str);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public Boolean doInBackground(Void... voidArr) {
                    Object[] objArr2 = {voidArr};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2f16dde90407dc6d917885d223dcdb7", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2f16dde90407dc6d917885d223dcdb7");
                    }
                    try {
                        return Boolean.valueOf(new com.google.archivepatcher.shared.b().b());
                    } catch (Exception unused) {
                        return Boolean.FALSE;
                    }
                }
            }, this.h, new Void[0]);
        }
    }

    public final void a(VersionInfo versionInfo, String str) {
        Object[] objArr = {versionInfo, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d5f6c699190728e4caa102d4048d5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d5f6c699190728e4caa102d4048d5b");
            return;
        }
        this.n = versionInfo;
        this.c = str;
        if (versionInfo == null || !versionInfo.isUpdated) {
            return;
        }
        a("need update", 10);
        if (!this.q && !this.r && !TextUtils.equals(this.o, versionInfo.appHttpsUrl)) {
            if (versionInfo.diffInfo != null && !TextUtils.equals(this.o, versionInfo.diffInfo.diffHttpsUrl)) {
                cancel();
                this.q = true;
            } else if (versionInfo.diffInfo == null) {
                cancel();
                this.q = true;
            }
        }
        if (!this.p && !this.r) {
            if (this.d == 4 && this.b != null) {
                this.b.a(4, versionInfo, null);
                this.d = 4;
                return;
            } else if (this.d == 6 && this.b != null) {
                this.b.a(6, versionInfo, null);
                this.d = 6;
                return;
            }
        }
        if (!(this.b != null ? this.b.a() : false)) {
            a("sign unvalid", 12);
        } else if (g.a(this.l, versionInfo.currentVersion) && this.b != null) {
            this.b.a(2, versionInfo, null);
            a("has apk", 11);
        } else if (this.b != null) {
            this.b.a(3, versionInfo, null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b implements com.meituan.android.downloadmanager.callback.b {
        public static ChangeQuickRedirect a;
        String b;
        boolean c;
        private long e;

        public b(String str, boolean z) {
            Object[] objArr = {a.this, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe0c4b258d637755ea408775fc747223", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe0c4b258d637755ea408775fc747223");
                return;
            }
            this.b = str;
            this.c = z;
        }

        @Override // com.meituan.android.downloadmanager.callback.b
        public final void a(@NonNull final DownloadInfo downloadInfo) {
            Object[] objArr = {downloadInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b791770c0a0872abc784bc43c73c951f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b791770c0a0872abc784bc43c73c951f");
                return;
            }
            a.this.i = false;
            a.this.j = false;
            this.e = System.currentTimeMillis();
            if (a.this.b != null && !a.this.p && !a.this.r) {
                a.this.b.a(4, a.this.n, null);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.android.uptodate.a.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b30954cb46fa5c8bd00d21dd15eae6b9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b30954cb46fa5c8bd00d21dd15eae6b9");
                        } else if (a.this.b != null) {
                            a.this.b.a(63L, downloadInfo.b);
                        }
                    }
                });
            }
            a.this.d = 4;
        }

        @Override // com.meituan.android.downloadmanager.callback.b
        public final void b(@NonNull DownloadInfo downloadInfo) {
            Object[] objArr = {downloadInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778c2c0d98bc1bee18f1a85919a04cef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778c2c0d98bc1bee18f1a85919a04cef");
            } else if (a.this.b == null || a.this.p) {
            } else {
                a.this.b.a(downloadInfo.c, downloadInfo.b);
            }
        }

        @Override // com.meituan.android.downloadmanager.callback.b
        public final void c(@NonNull DownloadInfo downloadInfo) {
            Object[] objArr = {downloadInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "616f266295218680a8c621f14d6bae54", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "616f266295218680a8c621f14d6bae54");
            } else if (TextUtils.isEmpty(downloadInfo.d)) {
            } else {
                a.a(a.this, downloadInfo.d, this.c);
                if (a.this.b != null && !a.this.p) {
                    a.this.b.a(5, a.this.n, null);
                }
                a.this.d = 5;
                long currentTimeMillis = System.currentTimeMillis() - this.e;
                if (!this.c) {
                    a.this.a("download fullapk success", 14);
                    a.a(a.this, "download fullapk time", 26, currentTimeMillis);
                    a.c(a.this, true);
                    if (!a.this.p && !a.this.s) {
                        g.a(a.this.l, a.this.c, a.this.n.currentVersion, a.this.b);
                    }
                    if (!a.this.p || a.this.b == null) {
                        return;
                    }
                    a.this.b.a(15, a.this.n, null);
                    return;
                }
                a.this.a("download patch success", 15);
                a.a(a.this, "download patch time", 25, currentTimeMillis);
                if (a.a(a.this, a.this.n)) {
                    if (a.this.b != null && !a.this.p && !a.this.r) {
                        a.this.b.a(6, a.this.n, null);
                    }
                    a.this.d = 6;
                    com.sankuai.waimai.launcher.util.aop.b.a(new AsyncTask<Void, Void, Boolean>() { // from class: com.meituan.android.uptodate.a.b.2
                        public static ChangeQuickRedirect a;

                        @Override // android.os.AsyncTask
                        public final /* synthetic */ Boolean doInBackground(Void[] voidArr) {
                            Object[] objArr2 = {voidArr};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cddc7b35a5c0286bb16e2983830394c3", RobustBitConfig.DEFAULT_VALUE)) {
                                return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cddc7b35a5c0286bb16e2983830394c3");
                            }
                            return Boolean.valueOf(d.f(a.this.l) != null);
                        }

                        @Override // android.os.AsyncTask
                        public final /* synthetic */ void onPostExecute(Boolean bool) {
                            Boolean bool2 = bool;
                            Object[] objArr2 = {bool2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79475706918d637f654b2d232d0dafae", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79475706918d637f654b2d232d0dafae");
                            } else if (bool2.booleanValue()) {
                                a.a(a.this, a.this.n, a.this.g);
                            } else {
                                a.this.a("copy old apk error", 18);
                                a.a(a.this, a.this.n.appHttpsUrl, false, a.this.g);
                                if (a.this.b != null && !a.this.p) {
                                    a.this.b.a(7, a.this.n, null);
                                }
                                com.sankuai.waimai.launcher.util.aop.b.a(new AsyncTaskC0371a(null), new Void[0]);
                                a.this.d = 7;
                            }
                        }
                    }, a.this.h, new Void[0]);
                    return;
                }
                a.this.a("patch valid error", 19);
                com.sankuai.waimai.launcher.util.aop.b.a(new AsyncTaskC0371a(null), a.this.h, new Void[0]);
                if (a.this.n == null || TextUtils.isEmpty(a.this.n.appHttpsUrl)) {
                    return;
                }
                a.a(a.this, a.this.n.appHttpsUrl, false, a.this.g);
            }
        }

        @Override // com.meituan.android.downloadmanager.callback.b
        public final void a(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "088ef47bb82d2cc80bc274e928ca66b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "088ef47bb82d2cc80bc274e928ca66b3");
                return;
            }
            a.this.d = 5;
            a.c(a.this, true);
            if (a.this.b != null && !a.this.p) {
                a.this.b.a(5, a.this.n, exc);
            }
            if (this.c) {
                a.a(a.this, a.this.n.appHttpsUrl, false, a.this.g);
                a.this.a("download patch error", 27);
                return;
            }
            a.this.a("download full error", 28);
            if (a.this.p) {
                return;
            }
            if (a.this.b != null) {
                a.this.b.a(8, null, exc);
            } else if (a.this.t) {
                Toast.makeText(a.this.l, (int) R.string.update_download_failed, 0).show();
            }
        }

        @Override // com.meituan.android.downloadmanager.callback.b
        public final void b(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61fdd0fbc0abeac6a0741e32f5e9321c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61fdd0fbc0abeac6a0741e32f5e9321c");
                return;
            }
            a.this.d = 5;
            a.c(a.this, true);
            if (a.this.b != null && !a.this.p) {
                a.this.b.a(5, a.this.n, exc);
            }
            if (this.c) {
                a.a(a.this, a.this.n.appHttpsUrl, false, a.this.g);
            } else if (a.this.p) {
            } else {
                if (a.this.b != null) {
                    a.this.b.a(9, null, exc);
                } else if (a.this.t) {
                    Toast.makeText(a.this.l, (int) R.string.update_download_timeout, 0).show();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.uptodate.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class AsyncTaskC0371a extends AsyncTask<Void, Void, Void> {
        public static ChangeQuickRedirect a;
        private String c;

        @Override // android.os.AsyncTask
        public final /* synthetic */ Void doInBackground(Void[] voidArr) {
            Object[] objArr = {voidArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "298102ccc905a1cbf3311bee41ac9502", RobustBitConfig.DEFAULT_VALUE)) {
                return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "298102ccc905a1cbf3311bee41ac9502");
            }
            if (!TextUtils.isEmpty(this.c)) {
                Context context = a.this.l;
                String str = this.c;
                Object[] objArr2 = {context, str};
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4b89de0084b0fa102fcb9d04cf313097", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4b89de0084b0fa102fcb9d04cf313097");
                } else if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        file.delete();
                    }
                }
            }
            d.g(a.this.l);
            Context context2 = a.this.l;
            Object[] objArr3 = {context2};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "791c7b08341396452d1bd0ffd9c229a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "791c7b08341396452d1bd0ffd9c229a2");
            } else {
                File file2 = new File(d.b(context2));
                if (file2.exists()) {
                    file2.delete();
                }
            }
            return null;
        }

        public AsyncTaskC0371a(String str) {
            Object[] objArr = {a.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e576aaabf6f43ae198dd0a7d89f0e1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e576aaabf6f43ae198dd0a7d89f0e1");
            } else {
                this.c = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5450b067e138be3d6ad83aa97471b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5450b067e138be3d6ad83aa97471b55");
            return;
        }
        String str2 = this.e;
        if (TextUtils.isEmpty(str2)) {
            str2 = this.l.getPackageName();
        }
        com.meituan.android.uptodate.util.b.a(str, i, str2);
    }
}
