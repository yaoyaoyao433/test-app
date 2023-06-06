package com.unionpay.mobile.android.pro.pboc.engine;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.nocard.utils.UPPayEngine;
import com.unionpay.mobile.android.pboctransaction.AppIdentification;
import com.unionpay.mobile.android.pboctransaction.samsung.f;
import com.unionpay.mobile.android.plugin.BaseActivity;
import com.unionpay.mobile.android.utils.k;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes6.dex */
public class b implements Handler.Callback, f.a {
    private Context g;
    private Handler h;
    private ArrayList<com.unionpay.mobile.android.model.c> i;
    private com.unionpay.mobile.android.pboctransaction.d n;
    private com.unionpay.mobile.android.pboctransaction.c o;
    private com.unionpay.mobile.android.pboctransaction.d q;
    private com.unionpay.mobile.android.pboctransaction.remoteapdu.a r;
    private com.unionpay.mobile.android.pboctransaction.d t;
    private com.unionpay.mobile.android.pboctransaction.simapdu.b u;
    private com.unionpay.mobile.android.pboctransaction.d w;
    private com.unionpay.mobile.android.pboctransaction.samsung.b x;
    private com.unionpay.mobile.android.pboctransaction.samsung.f y;
    private final int a = 0;
    private final int b = 1;
    private final int c = 2;
    private final int d = 4;
    private final int e = 8;
    private int f = 0;
    private ArrayList<com.unionpay.mobile.android.model.c> j = null;
    private ArrayList<com.unionpay.mobile.android.model.c> k = null;
    private ArrayList<com.unionpay.mobile.android.model.c> l = null;
    private ArrayList<com.unionpay.mobile.android.model.c> m = null;
    private final com.unionpay.mobile.android.pboctransaction.b p = new c(this);
    private final com.unionpay.mobile.android.pboctransaction.b s = new d(this);
    private final com.unionpay.mobile.android.pboctransaction.b v = new e(this);
    private final com.unionpay.mobile.android.pboctransaction.b z = new f(this);
    private a A = null;
    private boolean B = false;

    public b(Context context, String str) {
        this.g = null;
        this.h = null;
        this.i = null;
        this.n = null;
        this.o = null;
        this.q = null;
        this.r = null;
        this.t = null;
        this.u = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.g = context;
        this.h = new Handler(this);
        this.i = new ArrayList<>(1);
        com.unionpay.mobile.android.fully.a aVar = (com.unionpay.mobile.android.fully.a) ((BaseActivity) context).a(UPPayEngine.class.toString());
        this.o = a("cn.gov.pbc.tsm.client.mobile.andorid", 1) ? new com.unionpay.mobile.android.pboctransaction.icfcc.a() : new com.unionpay.mobile.android.pboctransaction.sdapdu.a();
        this.n = new com.unionpay.mobile.android.pboctransaction.d(this.o, aVar, str);
        try {
            Class.forName("org.simalliance.openmobileapi.c");
            this.r = new com.unionpay.mobile.android.pboctransaction.remoteapdu.a();
            this.q = new com.unionpay.mobile.android.pboctransaction.d(this.r, aVar, str);
            this.u = com.unionpay.mobile.android.pboctransaction.simapdu.b.e();
            this.t = new com.unionpay.mobile.android.pboctransaction.d(this.u, aVar, str);
            if (a("com.unionpay.tsmservice", 18)) {
                this.y = new com.unionpay.mobile.android.pboctransaction.samsung.f(this);
                this.y.a(this.h);
                this.w = new com.unionpay.mobile.android.pboctransaction.d(this.y, aVar, str);
                return;
            }
            com.unionpay.mobile.android.model.b.aB = false;
            this.x = new com.unionpay.mobile.android.pboctransaction.samsung.b();
            this.w = new com.unionpay.mobile.android.pboctransaction.d(this.x, aVar, str);
            this.z.b();
        } catch (ClassNotFoundException | Exception unused) {
            this.s.b();
            this.v.b();
            this.z.b();
        }
    }

    private final void a(int i) {
        if (i == 4) {
            k.c("UPCardEngine", "se");
            if (a("com.unionpay.tsmservice", 18) && this.y != null) {
                Log.e("uppay-spay", "type se  start init");
                this.y.a(this.z, this.g);
            } else if (this.x != null) {
                this.z.b();
            }
        } else if (i != 8) {
            switch (i) {
                case 1:
                    k.c("UPCardEngine", "cmcc");
                    if (!a("com.unionpay.mobile.tsm", 12)) {
                        this.s.b();
                        return;
                    } else if (this.r != null) {
                        this.r.a(this.B);
                        this.r.a(this.s, this.g);
                        return;
                    } else {
                        return;
                    }
                case 2:
                    k.c("UPCardEngine", "ic");
                    if (this.u != null) {
                        if (b().contains("ZTE")) {
                            this.u.a(this.v, this.g);
                            return;
                        } else {
                            this.v.b();
                            return;
                        }
                    }
                    return;
                default:
                    k.c("UPCardEngine", "sd");
                    if (this.o != null) {
                        this.o.a(this.p, this.g);
                        return;
                    }
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, int i) {
        PackageInfo packageInfo = null;
        try {
            packageInfo = this.g.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        if (packageInfo != null) {
            k.a("tsm-client", "tsm version code=" + packageInfo.versionCode);
            return packageInfo.versionCode >= i;
        }
        return false;
    }

    private static String b() {
        return Build.BRAND + CommonConstant.Symbol.UNDERLINE + Build.MODEL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Thread thread;
        if (i == 1) {
            thread = new Thread(new g(this));
        } else if (i == 2) {
            thread = new Thread(new h(this));
        } else if (i != 4) {
            if (i == 8) {
                new Thread(new j(this)).start();
                return;
            }
            return;
        } else if (!b().contains("ZTE")) {
            return;
        } else {
            thread = new Thread(new i(this));
        }
        thread.start();
    }

    public final Bundle a(com.unionpay.mobile.android.model.c cVar, String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str2) {
        com.unionpay.mobile.android.pboctransaction.d dVar;
        if (cVar == null) {
            return null;
        }
        int c = cVar.c();
        int d = cVar.d();
        if (d != 1) {
            if (d == 2) {
                return this.n.a(Integer.parseInt(cVar.a()), str, hashMap2, str2);
            }
            return null;
        }
        AppIdentification appIdentification = new AppIdentification(cVar.a(), null);
        String str3 = cVar.d() == 1 ? "2" : "1";
        if (c == 8) {
            dVar = this.n;
        } else if (c == 4) {
            dVar = this.q;
        } else if (c == 16) {
            dVar = this.t;
        } else if (c == 1) {
            dVar = this.w;
        } else if (c != 32) {
            return null;
        } else {
            dVar = this.w;
            str3 = "10";
        }
        return dVar.a(appIdentification, str, str3, hashMap, hashMap2, str2);
    }

    public final void a() {
        if (this.r != null) {
            this.r.a();
            this.r = null;
        }
        if (this.o != null) {
            this.o.a();
            this.o = null;
        }
        if (this.u != null) {
            this.u.a();
            this.u = null;
        }
        if (this.x != null) {
            this.x.a();
            this.x = null;
        }
        if (this.y != null) {
            this.y.a();
            this.y = null;
        }
        this.g = null;
        this.A = null;
        this.h.removeCallbacksAndMessages(null);
        this.h = null;
        this.w = null;
        this.n = null;
        this.q = null;
        this.t = null;
        this.f = 0;
    }

    public final void a(Handler handler, String str, String str2) {
        if (com.unionpay.mobile.android.model.b.aA && com.unionpay.mobile.android.model.b.aB) {
            com.unionpay.mobile.android.model.b.bo = true;
            if (this.y == null || this.w == null) {
                return;
            }
            this.y.a(handler);
            this.y.b(str);
            this.y.c(str2);
            Log.e("uppay-spay", "tsmservice  get spay card list");
            this.w.b();
        }
    }

    public final void a(a aVar, boolean z) {
        this.B = z;
        this.A = aVar;
        this.f = 0;
        a(0);
    }

    @Override // com.unionpay.mobile.android.pboctransaction.samsung.f.a
    public final void a(boolean z) {
        k.c("uppay", "startReadList  spay");
        com.unionpay.mobile.android.model.b.aB = z;
        b(8);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        k.c("UPCardEngine", " msg.what = " + message.what);
        if (message.what == 1 || message.what == 2 || message.what == 4 || message.what == 8) {
            this.f ^= message.what;
            k.c("UPCardEngine", " mTag = " + this.f);
            if (message.obj != null) {
                if (message.what == 1) {
                    this.j = (ArrayList) message.obj;
                } else if (message.what == 2) {
                    this.k = (ArrayList) message.obj;
                } else if (message.what == 4) {
                    this.l = (ArrayList) message.obj;
                } else if (message.what == 8) {
                    this.m = (ArrayList) message.obj;
                }
            }
            a(message.what);
        }
        if (this.f == 15 && this.A != null) {
            if (this.j != null && this.j.size() > 0) {
                this.i.addAll(this.j);
            }
            if (this.k != null && this.k.size() > 0) {
                this.i.addAll(this.k);
            }
            if (this.l != null && this.l.size() > 0) {
                this.i.addAll(this.l);
            }
            if (this.m != null && this.m.size() > 0) {
                this.i.addAll(this.m);
            }
            this.A.a(this.i);
        }
        return true;
    }
}
