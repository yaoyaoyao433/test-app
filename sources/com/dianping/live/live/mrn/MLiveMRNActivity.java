package com.dianping.live.live.mrn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dianping.archive.DPObject;
import com.dianping.live.live.mrn.list.MLiveListRecyclerView;
import com.dianping.live.live.mrn.list.e;
import com.dianping.live.live.mrn.list.f;
import com.dianping.live.live.utils.NetWorkStateReceiver;
import com.dianping.live.live.utils.i;
import com.dianping.model.SimpleMsg;
import com.dianping.sdk.pike.h;
import com.google.gson.Gson;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.dfingerprint.collection.utils.StringUtils;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.mrn.config.w;
import com.meituan.android.mrn.engine.u;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoDrawableTarget;
import com.squareup.picasso.RequestCreator;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MLiveMRNActivity extends AppCompatActivity implements View.OnClickListener, com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, com.dianping.dataservice.mapi.f>, a {
    public static ChangeQuickRedirect a = null;
    public static String b = "MLiveMRNListActivity";
    public static String e;
    public static long f;
    private boolean A;
    private boolean B;
    private long C;
    private String D;
    private String E;
    private com.dianping.live.live.mrn.list.c F;
    private boolean G;
    private long H;
    private ArrayList<String> I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private String N;
    public BroadcastReceiver c;
    public BroadcastReceiver d;
    public View g;
    private e.a h;
    private com.dianping.dataservice.mapi.e i;
    private Handler j;
    private NetWorkStateReceiver k;
    private NetWorkStateReceiver l;
    private final String m;
    private final String n;
    private final String o;
    private int p;
    private final int q;
    private int r;
    private String s;
    private String t;
    private boolean u;
    private final String v;
    private MLiveListRecyclerView w;
    private CustomLinearLayoutManager x;
    private com.dianping.live.live.mrn.list.d y;
    private boolean z;

    public MLiveMRNActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab8d63c7cbb92047f8ff412201e0148", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab8d63c7cbb92047f8ff412201e0148");
            return;
        }
        this.j = new Handler();
        this.m = "https://mlive.dianping.com/api/mlive/portal/querylivechannel.bin";
        this.n = "https://p1.meituan.net/scarlett/b8d159de72a6f2c6722f2040cad8c0c890326.webp";
        this.o = "https://p0.meituan.net/mlive/6dbdca7824597e15bdd0588a4e9b71e38320.png";
        this.p = 0;
        this.q = 5;
        this.r = 0;
        this.s = "";
        this.t = "";
        this.u = true;
        this.v = "MLiveListHasShowedTip";
        this.w = null;
        this.y = null;
        this.z = false;
        this.D = "";
        this.E = "";
        this.G = b.c.booleanValue();
        this.J = false;
        this.K = true;
        this.L = 4;
        this.M = 5;
        this.N = "";
    }

    public static /* synthetic */ boolean d(MLiveMRNActivity mLiveMRNActivity, boolean z) {
        mLiveMRNActivity.z = true;
        return true;
    }

    public static /* synthetic */ boolean e(MLiveMRNActivity mLiveMRNActivity, boolean z) {
        mLiveMRNActivity.J = true;
        return true;
    }

    public static /* synthetic */ void h(MLiveMRNActivity mLiveMRNActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mLiveMRNActivity, changeQuickRedirect, false, "c6c1463870566e6bfee4a6fb0b93f4d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mLiveMRNActivity, changeQuickRedirect, false, "c6c1463870566e6bfee4a6fb0b93f4d4");
            return;
        }
        mLiveMRNActivity.findViewById(R.id.out_live_list_tip).setVisibility(8);
        mLiveMRNActivity.J = false;
    }

    @Override // com.dianping.dataservice.d
    public /* synthetic */ void onRequestFailed(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.mapi.f fVar) {
        com.dianping.dataservice.mapi.e eVar2 = eVar;
        com.dianping.dataservice.mapi.f fVar2 = fVar;
        Object[] objArr = {eVar2, fVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37f6e297a9f4befc485e29c312e94178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37f6e297a9f4befc485e29c312e94178");
            return;
        }
        Object[] objArr2 = {eVar2, fVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3fe03da3cbd8f53cc7c18aa6e29be3bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3fe03da3cbd8f53cc7c18aa6e29be3bb");
            return;
        }
        com.dianping.live.live.utils.j.a("MLive_Logan_Channelrequest failed：" + fVar2);
        if (this.y != null && this.y.getItemCount() == 0) {
            p();
        } else if (this.y == null || this.p != this.y.getItemCount() - 1) {
        } else {
            this.u = false;
            a(new ArrayList<>(), Boolean.FALSE);
        }
    }

    @Override // com.dianping.dataservice.d
    public /* synthetic */ void onRequestFinish(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.mapi.f fVar) {
        Uri parse;
        com.dianping.dataservice.mapi.e eVar2 = eVar;
        com.dianping.dataservice.mapi.f fVar2 = fVar;
        Object[] objArr = {eVar2, fVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d621ade4d849429c063cfb46a7c48565", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d621ade4d849429c063cfb46a7c48565");
        } else if (f().booleanValue()) {
            Object[] objArr2 = {eVar2, fVar2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "001710ecea43d9fbe1410cb638df619a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "001710ecea43d9fbe1410cb638df619a");
                return;
            }
            q();
            ArrayList<com.dianping.live.live.mrn.list.model.a> arrayList = new ArrayList<>();
            DPObject dPObject = (DPObject) fVar2.a();
            if (dPObject == null || dPObject.g("data") == null || !dPObject.g("data").b("liveChannelVOList") || dPObject.g("data").h("liveChannelVOList") == null) {
                com.dianping.live.live.utils.j.a("MLive_Logan_Channelresponse data is empty all null:" + fVar2);
                if (this.y != null && this.y.getItemCount() == 0) {
                    p();
                    return;
                } else if (this.y == null || this.p != this.y.getItemCount() - 1) {
                    return;
                } else {
                    this.u = false;
                    a(arrayList, Boolean.FALSE);
                    return;
                }
            }
            DPObject g = dPObject.g("data");
            DPObject[] h = g.h("liveChannelVOList");
            if (g.e("extData") != null) {
                this.N = g.e("extData");
            }
            if (h != null && h.length > 0) {
                if (this.r == 0) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "768b36fc21f8bb063323f211451b51d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "768b36fc21f8bb063323f211451b51d4");
                    } else if (r() && this.K) {
                        getPreferences(0).edit().putInt("MLiveListHasShowedTip", 1).apply();
                        final ImageView imageView = (ImageView) findViewById(R.id.first_tip);
                        final View findViewById = findViewById(R.id.out_live_list_tip);
                        final View findViewById2 = findViewById(R.id.inner_live_list_tip);
                        final RequestCreator d = Picasso.g(this).d("https://p1.meituan.net/scarlett/b8d159de72a6f2c6722f2040cad8c0c890326.webp");
                        d.k();
                        Picasso.g(this).d("https://p0.meituan.net/mlive/6dbdca7824597e15bdd0588a4e9b71e38320.png").a(new PicassoDrawableTarget() { // from class: com.dianping.live.live.mrn.MLiveMRNActivity.6
                            public static ChangeQuickRedirect a;

                            @Override // com.squareup.picasso.PicassoDrawableTarget
                            public final void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
                                Object[] objArr4 = {picassoDrawable, loadedFrom};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0c52323a23aab50a7d4ef11b2d0eea3b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0c52323a23aab50a7d4ef11b2d0eea3b");
                                } else {
                                    findViewById2.setBackground(picassoDrawable);
                                }
                            }
                        });
                        if (this.j == null) {
                            this.j = new Handler();
                        }
                        this.j.postDelayed(new Runnable() { // from class: com.dianping.live.live.mrn.MLiveMRNActivity.7
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "67ada4e05625c41d037c660af47596ca", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "67ada4e05625c41d037c660af47596ca");
                                } else if (MLiveMRNActivity.this.z || MLiveMRNActivity.this.y == null || MLiveMRNActivity.this.y.getItemCount() == 0) {
                                } else {
                                    com.dianping.live.live.utils.j.a("MLive_Logan_Channelshow first animation tip");
                                    MLiveMRNActivity.e(MLiveMRNActivity.this, true);
                                    findViewById.setVisibility(0);
                                    d.a(imageView, 0);
                                    String liveStatus = MLiveMRNActivity.this.F != null ? MLiveMRNActivity.this.F.getLiveStatus() : "2";
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("page_source", MLiveMRNActivity.this.D);
                                    hashMap.put("page_status", liveStatus);
                                    hashMap.put("zhibo_id", MLiveMRNActivity.this.s);
                                    hashMap.put("scenekey_name", MLiveMRNActivity.this.t);
                                    Statistics.getChannel("live").writeModelView(AppUtil.generatePageInfoKey(this), "b_live_oitdkjwk_mv", hashMap, "c_live_ygl7wl8c");
                                    MLiveMRNActivity.this.j.postDelayed(new Runnable() { // from class: com.dianping.live.live.mrn.MLiveMRNActivity.7.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "42451f4c8b4e505a04ead55cc68a3755", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "42451f4c8b4e505a04ead55cc68a3755");
                                            } else {
                                                MLiveMRNActivity.h(MLiveMRNActivity.this);
                                            }
                                        }
                                    }, MLiveMRNActivity.this.L * 1000);
                                }
                            }
                        }, this.M * 1000);
                    }
                }
                this.r += h.length;
                this.u = g.c("hasNext");
                for (DPObject dPObject2 : h) {
                    String e2 = dPObject2.e("actionUrl");
                    int d2 = dPObject2.d("playStatus");
                    String e3 = dPObject2.e("eventTracking");
                    String str = e2 + "&isChannelContainer=true&channelPlayStatus=" + d2 + "&eventTracking=" + e3 + this.E;
                    long f2 = dPObject2.f("liveId");
                    String e4 = dPObject2.e("buId");
                    DPObject[] h2 = dPObject2.h("pullStreamUrl");
                    com.dianping.live.live.mrn.list.model.a aVar = new com.dianping.live.live.mrn.list.model.a(1, str, d2, f2);
                    aVar.e = e4;
                    aVar.f = h2;
                    aVar.g = e3;
                    arrayList.add(aVar);
                    this.I.add(String.valueOf(f2));
                    if (this.I.size() > 10) {
                        this.I.remove(0);
                    }
                    if (str != null && str.contains("liveId") && (parse = Uri.parse(str)) != null && parse.getQueryParameter("liveId") != null && !parse.getQueryParameter("liveId").equals(String.valueOf(f2))) {
                        com.dianping.live.live.utils.j.a("MLive_Logan_Channel：QueryList Response:liveId：" + f2 + " is not same as url liveId：" + parse.getQueryParameter("liveId") + " MRN URL:" + str);
                    }
                }
                a(arrayList, Boolean.valueOf(this.u));
                this.w.setBackgroundResource(R.drawable.live_room_new_bg);
                return;
            }
            this.u = false;
            if (this.r == 0) {
                p();
            } else {
                a(arrayList, Boolean.FALSE);
            }
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14730a6f3873bccb4bc5afe17072f0ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14730a6f3873bccb4bc5afe17072f0ea");
            return;
        }
        super.onCreate(bundle);
        f = System.currentTimeMillis();
        e();
        getWindow().setFlags(16777216, 16777216);
        u.b(this, "rn_hotel_hotel-mlive", "rn_joy_joy-live", "rn_medical_medical-live");
        com.dianping.live.live.utils.c.a(getApplicationContext());
        com.dianping.live.report.d.b.e = GetUUID.getInstance().getSyncUUID(this, null);
        if (f().booleanValue()) {
            com.dianping.live.live.utils.j.a("MLive_Logan: Preplay onCreate isMultiplePage true");
            this.g = b((Context) this);
            this.g.setVisibility(0);
            setContentView(this.g);
            h();
            m();
            l();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89d39939a1872ef87b93604a003cbc41", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89d39939a1872ef87b93604a003cbc41");
            } else if (r()) {
                com.sankuai.android.jarvis.c.a("mlive_get_horn_guide", new Runnable() { // from class: com.dianping.live.live.mrn.MLiveMRNActivity.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ed7237561e71bc76bc047a47a8efb90", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ed7237561e71bc76bc047a47a8efb90");
                            return;
                        }
                        final Map<String, Object> a2 = com.dianping.live.live.utils.f.a(this);
                        MLiveMRNActivity.this.j.post(new Runnable() { // from class: com.dianping.live.live.mrn.MLiveMRNActivity.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3ff8f9361c18d94fe0c41aa011f6cbe8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3ff8f9361c18d94fe0c41aa011f6cbe8");
                                    return;
                                }
                                MLiveMRNActivity.this.K = ((Boolean) a2.get("live_list_guide_enabled")).booleanValue();
                                MLiveMRNActivity.this.L = ((Integer) a2.get("live_list_guide_time")).intValue();
                                MLiveMRNActivity.this.M = ((Integer) a2.get("live_list_guide_wait_time")).intValue();
                            }
                        });
                    }
                }).start();
            }
        } else {
            com.dianping.live.live.utils.j.a("MLive_Logan: Preplay onCreate isSingle false");
            this.g = a((Context) this);
            this.g.setBackground(getResources().getDrawable(R.drawable.live_room_new_bg));
            setContentView(this.g);
            k();
        }
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5691ff6ababda52850e75713ec44438b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5691ff6ababda52850e75713ec44438b");
        } else if (Build.VERSION.SDK_INT >= 19) {
            if (Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(1280);
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(0);
                getWindow().addFlags(1024);
                getWindow().clearFlags(2048);
            } else {
                getWindow().addFlags(67108864);
            }
        }
        final com.dianping.live.report.d dVar = com.dianping.live.report.d.b;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.dianping.live.report.d.a;
        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "1f6174fb6f0dfd0c1bb9e600c140e93f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "1f6174fb6f0dfd0c1bb9e600c140e93f");
            return;
        }
        ScheduledExecutorService c = com.sankuai.android.jarvis.c.c("MLiveReport");
        if (dVar.c != null) {
            dVar.c.cancel(true);
        }
        dVar.c = c.scheduleAtFixedRate(new Runnable() { // from class: com.dianping.live.report.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7623785ea11a481e339366e866cc6bf3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7623785ea11a481e339366e866cc6bf3");
                    return;
                }
                try {
                    if (dVar.e != null) {
                        String str = h.b("dzu_live_pike") ? "pike_online" : "pike_offline";
                        HashMap hashMap = new HashMap();
                        hashMap.put("MTLIVE_EVENT_TYPE", str);
                        hashMap.put("MTLIVE_UUID", dVar.e);
                        Babel.logRT(new Log.Builder("").reportChannel("prism-report-mtlive").tag("MTLIVE_EVENT").value(0L).optional(hashMap).build());
                        i.a(i.e, str);
                    }
                } catch (Exception unused) {
                }
            }
        }, 10000L, 10000L, TimeUnit.MILLISECONDS);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c79ab1b73d476a10c3ca550109f62a8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c79ab1b73d476a10c3ca550109f62a8b");
            return;
        }
        if (getIntent() != null && getIntent().getData() != null) {
            String path = getIntent().getData().getPath();
            String host = getIntent().getData().getHost();
            if ((path != null && path.contains("mlivemrnlist")) || (host != null && host.contains("mlivemrnlist"))) {
                this.h = e.a.multiple;
                com.dianping.live.report.d.b.g = this.h;
                return;
            }
        }
        this.h = e.a.single;
    }

    private Boolean a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "621a766c1980b0652fa1ee50c9f64d15", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "621a766c1980b0652fa1ee50c9f64d15");
        }
        if (intent == null || intent.getData() == null) {
            return Boolean.FALSE;
        }
        String path = intent.getData().getPath();
        if (path != null && path.contains("mlivemrnlist")) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private Boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3649f1b8fd3d994962e039f70b84cb8b", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3649f1b8fd3d994962e039f70b84cb8b") : Boolean.valueOf(this.h.equals(e.a.multiple));
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb31ba3e0d4ccd21bed250e22aaf1ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb31ba3e0d4ccd21bed250e22aaf1ef");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        if (this.F != null && this.F.getMRNFragment() != null) {
            this.F.getMRNFragment().onActivityResult(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7152635fbec9c8a935afc7a9e04972e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7152635fbec9c8a935afc7a9e04972e5");
        } else if (f().booleanValue() && this.y != null && this.y.getItemCount() == 0) {
            super.onBackPressed();
        } else if (this.F == null) {
            super.onBackPressed();
        } else {
            MLiveMRNFragment mRNFragment = this.F.getMRNFragment();
            if (mRNFragment != null && mRNFragment.isAdded()) {
                mRNFragment.k();
            } else if (System.currentTimeMillis() - this.H > MetricsAnrManager.ANR_THRESHOLD) {
                super.onBackPressed();
            }
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bfd7760fc322622626cc3677f7d8eaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bfd7760fc322622626cc3677f7d8eaa");
            return;
        }
        super.onDestroy();
        if (!"1".equals(e) || f().booleanValue()) {
            try {
                MLiveFloatBridgeModule.killMLiveFloat();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            if (this.l != null) {
                unregisterReceiver(this.l);
            }
            if (this.c != null) {
                unregisterReceiver(this.c);
                this.c = null;
            }
            if (this.d != null) {
                unregisterReceiver(this.d);
                this.d = null;
            }
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
        }
        if (this.j != null) {
            this.j.removeCallbacksAndMessages(null);
            this.j = null;
        }
        j();
        com.dianping.live.report.d dVar = com.dianping.live.report.d.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.live.report.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "3ad24d19cfee315e8da4192e9eafe159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "3ad24d19cfee315e8da4192e9eafe159");
        } else if (dVar.c != null) {
            dVar.c.cancel(true);
        }
        com.dianping.live.live.utils.c.a();
        com.dianping.live.report.d dVar2 = com.dianping.live.report.d.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.live.report.d.a;
        if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "27bbdbcf460c2eb4a1623f61a8543302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "27bbdbcf460c2eb4a1623f61a8543302");
            return;
        }
        dVar2.f = null;
        if (dVar2.d != null) {
            dVar2.d.clear();
            dVar2.d = null;
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "373286e1f5d762b514a634c7c1097d42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "373286e1f5d762b514a634c7c1097d42");
            return;
        }
        super.onNewIntent(intent);
        if (f().booleanValue()) {
            Object[] objArr2 = {intent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53710926e5f29f844c5c92f64a1a115e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53710926e5f29f844c5c92f64a1a115e");
                return;
            } else if (a(intent).booleanValue()) {
                if (c(intent)) {
                    return;
                }
                b(intent);
                i();
                h();
                return;
            } else if (c(intent)) {
                return;
            } else {
                b(intent);
                j();
                g();
                k();
                return;
            }
        }
        Object[] objArr3 = {intent};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cc3ac347e513c6b6e26e514d4e8f833b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cc3ac347e513c6b6e26e514d4e8f833b");
        } else if (a(intent).booleanValue()) {
            i();
            b(intent);
            g();
            h();
            m();
            l();
        } else {
            b(intent);
            if (c(intent)) {
                return;
            }
            i();
            ((ViewGroup) this.g).removeAllViews();
            k();
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4dcbae39b68777fcc6d57e7611f1a98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4dcbae39b68777fcc6d57e7611f1a98");
            return;
        }
        if (f().booleanValue()) {
            this.g = b((Context) this);
        } else {
            this.g = a((Context) this);
            this.g.setBackground(getResources().getDrawable(R.drawable.live_room_new_bg));
        }
        this.g.setVisibility(0);
        setContentView(this.g);
    }

    private void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "270919ead8c4ec934092fc7e0aea73b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "270919ead8c4ec934092fc7e0aea73b6");
            return;
        }
        setIntent(intent);
        e();
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "941a2b95308bce027a8acf237d775612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "941a2b95308bce027a8acf237d775612");
            return;
        }
        n();
        d();
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a84a3e1b35d29be75b8cec0a360e08e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a84a3e1b35d29be75b8cec0a360e08e0");
            return;
        }
        if (this.y != null) {
            this.y.a(this.w);
            this.F = null;
            this.I.clear();
            this.A = false;
            this.B = false;
            this.C = 0L;
        }
        if (this.F != null) {
            this.F.c(this.p);
            this.F.e();
            this.F = null;
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "991b0ce158b32b678a85290e329690ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "991b0ce158b32b678a85290e329690ba");
            return;
        }
        i();
        if (this.w != null) {
            this.w.setAdapter(null);
            this.w = null;
            this.y = null;
        }
    }

    @Override // com.dianping.live.live.mrn.a
    public NetWorkStateReceiver getPlayerNetWorkStateReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c86840fd65044dc9f723cad1ad25853", RobustBitConfig.DEFAULT_VALUE)) {
            return (NetWorkStateReceiver) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c86840fd65044dc9f723cad1ad25853");
        }
        if (this.F == null) {
            return null;
        }
        return this.F.getPlayerNetWorkStateReceiver();
    }

    @Override // com.dianping.live.live.mrn.a
    public void setPlayerNetWorkStateReceiver(NetWorkStateReceiver netWorkStateReceiver) {
        Object[] objArr = {netWorkStateReceiver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0d45a5ae1c96e18bb748ac41cd9ea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0d45a5ae1c96e18bb748ac41cd9ea8");
        } else if (this.F == null) {
        } else {
            this.F.setPlayerNetWorkStateReceiver(netWorkStateReceiver);
        }
    }

    @Override // com.dianping.live.live.mrn.a
    public NetWorkStateReceiver getPusherNetWorkStateReceiver() {
        return this.k;
    }

    @Override // com.dianping.live.live.mrn.a
    public void setPusherNetWorkStateReceiver(NetWorkStateReceiver netWorkStateReceiver) {
        this.k = netWorkStateReceiver;
    }

    @Override // com.dianping.live.live.mrn.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3355006078cdec6fceff4fa668320dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3355006078cdec6fceff4fa668320dc")).booleanValue();
        }
        if (this.F == null) {
            return false;
        }
        return this.F.h;
    }

    @Override // com.dianping.live.live.mrn.a
    public void setmLivePlayerListener(com.sankuai.meituan.mtlive.player.library.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1fcc5d020e6482c50787a722f317716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1fcc5d020e6482c50787a722f317716");
        } else if (this.F == null) {
        } else {
            this.F.setmLivePlayerListener(bVar);
        }
    }

    @Override // com.dianping.live.live.mrn.a
    public void setmLivePlayConfig(com.sankuai.meituan.mtlive.player.library.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c916f53efdfbbc8e72663788a63f696", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c916f53efdfbbc8e72663788a63f696");
        } else if (this.F == null) {
        } else {
            this.F.setmLivePlayConfig(dVar);
        }
    }

    @Override // com.dianping.live.live.mrn.a
    public int getRetCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9b254824b1e1f5fee3ddcd177fcf6eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9b254824b1e1f5fee3ddcd177fcf6eb")).intValue();
        }
        if (this.F == null) {
            return 1;
        }
        return this.F.getRetCode();
    }

    @Override // com.dianping.live.live.mrn.a
    public List<Integer> getCodes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96401b03060fb0a844b893e29e316492", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96401b03060fb0a844b893e29e316492");
        }
        if (this.F == null) {
            return null;
        }
        return this.F.getCodes();
    }

    @Override // com.dianping.live.live.mrn.a
    public void setmLivePlayer(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d00ed51ee922722c36f72d32f32a6bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d00ed51ee922722c36f72d32f32a6bd");
        } else if (this.F == null) {
        } else {
            this.F.setmLivePlayer(dVar);
        }
    }

    @Override // com.dianping.live.live.mrn.a
    public com.dianping.live.report.c getMLivePlayerStatusMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5af96ab4d07d9f849f71f23f23c140", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.live.report.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5af96ab4d07d9f849f71f23f23c140");
        }
        if (this.F == null) {
            return null;
        }
        return this.F.getMLivePlayerStatusMonitor();
    }

    @Override // com.dianping.live.live.mrn.a
    public e.a getChannelType() {
        return this.h;
    }

    @Override // com.dianping.live.live.mrn.a
    public int getIndexInChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6d62ca569ce7ad72ecad360dd1c35a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6d62ca569ce7ad72ecad360dd1c35a")).intValue();
        }
        if (this.F == null) {
            return 0;
        }
        return this.F.getIndexInChannel();
    }

    @Override // com.dianping.live.live.mrn.a
    public long getStartTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8ab35cf8e08cad9a75f3730e8045429", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8ab35cf8e08cad9a75f3730e8045429")).longValue();
        }
        if (this.F == null) {
            return f;
        }
        return this.F.getStartTime();
    }

    @Override // com.dianping.live.live.mrn.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce8b6e5c4bc8b574d44848b686af2112", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce8b6e5c4bc8b574d44848b686af2112")).booleanValue();
        }
        if (this.F == null) {
            return false;
        }
        return this.F.k;
    }

    @Override // com.dianping.live.live.mrn.a
    public String getLiveId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d6283bd8449881b472cef2422f4686", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d6283bd8449881b472cef2422f4686") : this.F == null ? "" : this.F.getLiveId();
    }

    @Override // com.dianping.live.live.mrn.a
    public final boolean b() {
        return this.G;
    }

    @Override // com.dianping.live.live.mrn.a
    public void setFftReported(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62cccdcaa9a01d28e2b619a95fe1ee5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62cccdcaa9a01d28e2b619a95fe1ee5f");
        } else if (this.F == null) {
        } else {
            this.F.setFftReported(z);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4a4597de94e0b2f39a0e8ce99fd0f5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4a4597de94e0b2f39a0e8ce99fd0f5");
        } else if (view.getId() == R.id.mlive_list_retry) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e57cdf40316dea05953add16382483d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e57cdf40316dea05953add16382483d");
                return;
            }
            this.u = true;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "536df021d3b456f19717c5bfe7228dd4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "536df021d3b456f19717c5bfe7228dd4");
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1a2f08ebcffbdb2f6125280e55e0c80f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1a2f08ebcffbdb2f6125280e55e0c80f");
                } else {
                    View findViewById = findViewById(R.id.mlive_list_error_view);
                    if (findViewById.getVisibility() == 0) {
                        findViewById.setVisibility(8);
                    }
                }
                View findViewById2 = findViewById(R.id.mlive_list_progress_view);
                if (findViewById2.getVisibility() == 8) {
                    findViewById2.setVisibility(0);
                }
            }
            d();
        }
    }

    private boolean c(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58e6fd43ae52285dc2da9eda19f12484", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58e6fd43ae52285dc2da9eda19f12484")).booleanValue();
        }
        if (this.F == null || intent.getData() == null) {
            return false;
        }
        String liveId = this.F.getLiveId();
        return liveId != null && liveId.equals(intent.getData().getQueryParameter("liveId"));
    }

    private View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c2389ca019f8ae0f69d46f8f65f09e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c2389ca019f8ae0f69d46f8f65f09e") : LayoutInflater.from(context).inflate(R.layout.prelive_view, (ViewGroup) null);
    }

    private void k() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8083dde44405af496343652b69a5413e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8083dde44405af496343652b69a5413e");
            return;
        }
        str = "0";
        if (o()) {
            Set<String> queryParameterNames = getIntent().getData().getQueryParameterNames();
            str = queryParameterNames.contains("liveId") ? getIntent().getData().getQueryParameter("liveId") : "0";
            if (queryParameterNames.contains("type")) {
                e = getIntent().getData().getQueryParameter("type");
            }
        }
        if (str == null) {
            str = "0";
        }
        try {
            this.F = new com.dianping.live.live.mrn.list.c(this, new com.dianping.live.live.mrn.list.model.a(0, getIntent().getData().toString(), 2, Long.valueOf(str.trim()).longValue()), true, 0, this.h);
            this.F.b(0);
            ((ViewGroup) this.g).addView(this.F);
            HashMap hashMap = new HashMap();
            hashMap.put("liveId", str);
            hashMap.put("code", "0000");
            Statistics.getChannel("gc").writeSystemCheck(AppUtil.generatePageInfoKey(this), "b_gc_mlive_sc", hashMap, "c_gc_6uvcyn40");
        } catch (Exception e2) {
            com.dianping.live.live.utils.j.a("MLive_Logan_Channelparse liveId error");
            e2.printStackTrace();
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfe8eae1fe66191331bc35c1aa9a0d8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfe8eae1fe66191331bc35c1aa9a0d8a");
            return;
        }
        IntentFilter intentFilter = new IntentFilter("mlive_list_notify_from_mrn");
        IntentFilter intentFilter2 = new IntentFilter("mlive_disable_scroll_from_mrn");
        this.c = new BroadcastReceiver() { // from class: com.dianping.live.live.mrn.MLiveMRNActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0188787bf8c16b4def345ace313f44fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0188787bf8c16b4def345ace313f44fd");
                    return;
                }
                Bundle extras = intent.getExtras();
                if (extras == null || MLiveMRNActivity.this.y == null) {
                    return;
                }
                String string = extras.getString("data");
                Long b2 = MLiveMRNActivity.this.y.b(MLiveMRNActivity.this.p);
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("type");
                    Long valueOf = Long.valueOf(jSONObject.getString("liveId"));
                    com.dianping.live.live.utils.j.a("MLive_Logan_Channelknb message from mrn：" + string + " 当前liveId：" + b2);
                    if (valueOf.equals(b2)) {
                        if (string2.equals("mlive_end")) {
                            MLiveMRNActivity.this.A = false;
                            MLiveMRNActivity.this.x.a(true, 1);
                            com.dianping.live.live.mrn.list.d dVar = MLiveMRNActivity.this.y;
                            int i = MLiveMRNActivity.this.p;
                            Object[] objArr3 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.live.live.mrn.list.d.a;
                            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "fd9b54f816d78fc01c13cdb59b98f847", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "fd9b54f816d78fc01c13cdb59b98f847");
                            } else {
                                dVar.b.remove(i);
                                dVar.notifyItemRemoved(i);
                                dVar.notifyDataSetChanged();
                                dVar.k = true;
                                com.dianping.live.live.utils.j.a("MLive_Logan_Channel删除结束的直播:" + dVar.b(i) + " index：" + i);
                            }
                        }
                        if (string2.equals("mlive_show_popup")) {
                            MLiveMRNActivity.this.A = true;
                            MLiveMRNActivity.this.C = valueOf.longValue();
                            MLiveMRNActivity.this.x.a(false, 1);
                        }
                        if (string2.equals("mlive_dismiss_popup")) {
                            MLiveMRNActivity.this.A = false;
                            MLiveMRNActivity.this.x.a(true, 1);
                        }
                    }
                } catch (JSONException e2) {
                    com.dianping.live.live.utils.j.a("MLive_Logan_Channelknb message parse failed：" + string + " liveId：" + b2);
                    e2.printStackTrace();
                }
            }
        };
        this.d = new BroadcastReceiver() { // from class: com.dianping.live.live.mrn.MLiveMRNActivity.3
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "217df84a6f77997228c16e641cbbee6e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "217df84a6f77997228c16e641cbbee6e");
                    return;
                }
                Bundle extras = intent.getExtras();
                if (extras == null || MLiveMRNActivity.this.y == null) {
                    return;
                }
                String string = extras.getString("data");
                Long b2 = MLiveMRNActivity.this.y.b(MLiveMRNActivity.this.p);
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Long valueOf = Long.valueOf(jSONObject.getString("liveId"));
                    Boolean valueOf2 = Boolean.valueOf(jSONObject.getBoolean("value"));
                    com.dianping.live.live.utils.j.a("MLive_Logan_Channelknb message from mrn：" + string + " 当前liveId：" + b2);
                    if (valueOf.equals(b2)) {
                        if (valueOf2.booleanValue()) {
                            MLiveMRNActivity.this.B = true;
                            MLiveMRNActivity.this.C = valueOf.longValue();
                            MLiveMRNActivity.this.x.a(false, 3);
                            return;
                        }
                        MLiveMRNActivity.this.B = false;
                        MLiveMRNActivity.this.x.a(true, 3);
                    }
                } catch (JSONException e2) {
                    com.dianping.live.live.utils.j.a("MLive_Logan_Channelknb message parse failed：" + string + " liveId：" + b2);
                    e2.printStackTrace();
                }
            }
        };
        registerReceiver(this.c, intentFilter);
        registerReceiver(this.d, intentFilter2);
    }

    private View b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f30eb77bc6cf4ee9032977472e00fedc", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f30eb77bc6cf4ee9032977472e00fedc") : LayoutInflater.from(context).inflate(R.layout.mlive_list_view, (ViewGroup) null);
    }

    private void m() {
        FrameLayout frameLayout;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14112a036da4671a71ffca9ad42b3dc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14112a036da4671a71ffca9ad42b3dc7");
            return;
        }
        View findViewById = findViewById(R.id.mlive_list_error_view);
        if (findViewById != null && (frameLayout = (FrameLayout) findViewById.findViewById(R.id.mlive_list_retry)) != null) {
            frameLayout.setOnClickListener(this);
        }
        ArrayList arrayList = new ArrayList();
        this.w = (MLiveListRecyclerView) findViewById(R.id.recyclerview_vertical);
        this.w.setNestedScrollingEnabled(false);
        this.x = new CustomLinearLayoutManager(this, 1, false);
        this.w.setLayoutManager(this.x);
        this.y = new com.dianping.live.live.mrn.list.d(getSupportFragmentManager(), arrayList, this);
        this.w.setAdapter(this.y);
        this.w.setItemViewCacheSize(1);
        this.y.a(new f.a() { // from class: com.dianping.live.live.mrn.MLiveMRNActivity.4
            public static ChangeQuickRedirect a;

            @Override // com.dianping.live.live.mrn.list.f.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85a14eafa4e5b6ae96edf66d2bf6e569", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85a14eafa4e5b6ae96edf66d2bf6e569");
                    return;
                }
                MLiveMRNActivity.this.p = i;
                if (!MLiveMRNActivity.this.y.b(i).equals(Long.valueOf(MLiveMRNActivity.this.C)) || (!MLiveMRNActivity.this.A && !MLiveMRNActivity.this.B)) {
                    MLiveMRNActivity.this.A = false;
                    MLiveMRNActivity.this.B = false;
                    MLiveMRNActivity.this.C = 0L;
                    MLiveMRNActivity.this.x.a(true, 4);
                    return;
                }
                if (MLiveMRNActivity.this.A) {
                    MLiveMRNActivity.this.x.a(false, 1);
                }
                if (MLiveMRNActivity.this.B) {
                    MLiveMRNActivity.this.x.a(false, 3);
                }
            }

            @Override // com.dianping.live.live.mrn.list.f.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bf634bd18df83987f77f4f8bec8ab11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bf634bd18df83987f77f4f8bec8ab11");
                } else {
                    MLiveMRNActivity.this.d();
                }
            }

            @Override // com.dianping.live.live.mrn.list.f.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6a9aaf0d4bb3d4c0928f92dcbfcea00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6a9aaf0d4bb3d4c0928f92dcbfcea00");
                    return;
                }
                MLiveMRNActivity.h(MLiveMRNActivity.this);
                MLiveMRNActivity.d(MLiveMRNActivity.this, true);
            }

            @Override // com.dianping.live.live.mrn.list.f.a
            public final void a(long j, int i, String str, String str2, String str3) {
                Object[] objArr2 = {new Long(j), Integer.valueOf(i), str, str2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65776c6831405863c6bd96ac88ad2a1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65776c6831405863c6bd96ac88ad2a1f");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("page_source", MLiveMRNActivity.this.D);
                hashMap.put("view_duration", Long.valueOf(j));
                hashMap.put("button_name", Integer.valueOf(i));
                hashMap.put("page_status", str);
                hashMap.put("zhibo_id", str2);
                hashMap.put("scenekey_name", MLiveMRNActivity.this.t);
                try {
                    hashMap.put("extension", (Map) new Gson().fromJson(URLDecoder.decode(str3, "UTF-8"), (Class<Object>) HashMap.class));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                Statistics.getChannel("live").writeModelClick(AppUtil.generatePageInfoKey(this), "b_live_1b4kf0d3_mc", hashMap, "c_live_ygl7wl8c");
            }

            @Override // com.dianping.live.live.mrn.list.f.a
            public final void a(com.dianping.live.live.mrn.list.c cVar) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8fe48b8c4efe30b1ed48f29d1e18e11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8fe48b8c4efe30b1ed48f29d1e18e11");
                    return;
                }
                MLiveMRNActivity.this.H = System.currentTimeMillis();
                MLiveMRNActivity.this.F = cVar;
            }

            @Override // com.dianping.live.live.mrn.list.f.a
            public final boolean c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79826168a9b3bfbdb04911a2eb994f9e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79826168a9b3bfbdb04911a2eb994f9e")).booleanValue() : MLiveMRNActivity.this.J;
            }
        });
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f8321e8eff43515c78b246a3bf93e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f8321e8eff43515c78b246a3bf93e3");
            return;
        }
        this.r = 0;
        this.u = true;
        if (this.I != null) {
            this.I.clear();
        } else {
            this.I = new ArrayList<>();
        }
        if (!o() || getIntent() == null || getIntent().getData() == null || getIntent().getData().getQueryParameterNames() == null || getIntent().getData().getQueryParameterNames().size() <= 0) {
            return;
        }
        for (String str : getIntent().getData().getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                String queryParameter = getIntent().getData().getQueryParameter(str);
                if (str.equals("liveId")) {
                    this.s = queryParameter;
                } else {
                    if (str.equals("scenekey")) {
                        this.t = queryParameter;
                    }
                    if (str.equals("page_source")) {
                        this.D = queryParameter;
                    }
                    if (!TextUtils.isEmpty(str) && !str.equals("mrn_biz") && !str.equals("mrn_entry") && !str.equals("mrn_component") && !TextUtils.isEmpty(queryParameter)) {
                        this.E += "&" + str + "=" + queryParameter;
                    }
                }
            }
        }
    }

    private boolean o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3247a2cf3119efab43b14e0fdb09cb18", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3247a2cf3119efab43b14e0fdb09cb18")).booleanValue() : (getIntent() == null || getIntent().getData() == null || getIntent().getData().getQueryParameterNames() == null || getIntent().getData().getQueryParameterNames().size() <= 0) ? false : true;
    }

    private void a(ArrayList<com.dianping.live.live.mrn.list.model.a> arrayList, Boolean bool) {
        Object[] objArr = {arrayList, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd9ba19c2479c25a70f2f7843bdd7c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd9ba19c2479c25a70f2f7843bdd7c9");
            return;
        }
        if (!bool.booleanValue()) {
            arrayList.add(new com.dianping.live.live.mrn.list.model.a(-1, "", -1, -1L));
        }
        if (this.y == null) {
            return;
        }
        this.y.a(arrayList);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8cae00d4bff06631ff3e30745356b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8cae00d4bff06631ff3e30745356b3c");
        } else if (this.u) {
            try {
                com.dianping.live.live.utils.j.a("MLive_Logan: Preplay multiple requestNextPage ");
                Uri.parse("https://mlive.dianping.com/api/mlive/portal/querylivechannel.bin").buildUpon();
                long max = Math.max(0L, com.dianping.live.live.utils.a.a());
                double b2 = com.dianping.live.live.utils.a.b();
                double c = com.dianping.live.live.utils.a.c();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Constants.Environment.KEY_CITYID);
                arrayList.add(String.valueOf(max));
                arrayList.add("limit");
                arrayList.add("5");
                arrayList.add("start");
                arrayList.add(String.valueOf(this.r));
                arrayList.add("scenekey");
                arrayList.add(this.t);
                arrayList.add("topliveid");
                arrayList.add(this.s);
                arrayList.add("recentliveids");
                arrayList.add(StringUtils.join(this.I, ','));
                arrayList.add("lat");
                arrayList.add(String.valueOf(b2));
                arrayList.add("lng");
                arrayList.add(String.valueOf(c));
                arrayList.add("extrainfo");
                arrayList.add(this.N);
                this.i = com.dianping.dataservice.mapi.b.a("https://mlive.dianping.com/api/mlive/portal/querylivechannel.bin", SimpleMsg.b, (String[]) arrayList.toArray(new String[arrayList.size()]));
                w.a(getApplicationContext()).exec(this.i, this);
            } catch (Exception unused) {
                com.dianping.live.live.utils.j.a("MLive_Logan_Channel：QueryList Exception");
            }
        }
    }

    private void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c485897f6f9296e2ed32c01e7fdf78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c485897f6f9296e2ed32c01e7fdf78");
            return;
        }
        com.dianping.live.live.utils.j.a("MLive_Logan_Channelno Data show error view");
        q();
        View findViewById = findViewById(R.id.mlive_list_error_view);
        final ImageView imageView = (ImageView) findViewById(R.id.mlive_list_err_pic);
        Picasso.g(this).d("https://p1.meituan.net/travelcube/9a90a0802158c9cd81bac376bac0c0ed62736.png").a(new PicassoDrawableTarget() { // from class: com.dianping.live.live.mrn.MLiveMRNActivity.5
            public static ChangeQuickRedirect a;

            @Override // com.squareup.picasso.PicassoDrawableTarget
            public final void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
                Object[] objArr2 = {picassoDrawable, loadedFrom};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eec0e4d66edcfa1c987d8adbecbeeb62", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eec0e4d66edcfa1c987d8adbecbeeb62");
                } else {
                    imageView.setImageDrawable(picassoDrawable);
                }
            }
        });
        if (findViewById.getVisibility() == 8) {
            findViewById.setVisibility(0);
        }
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b91806aa7edb9429fb051fdee23cb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b91806aa7edb9429fb051fdee23cb5e");
            return;
        }
        View findViewById = findViewById(R.id.mlive_list_progress_view);
        if (findViewById.getVisibility() == 0) {
            findViewById.setVisibility(8);
        }
    }

    private boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2474b51d7300b6fe238bb03a1dc369cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2474b51d7300b6fe238bb03a1dc369cd")).booleanValue() : getPreferences(0).getInt("MLiveListHasShowedTip", 0) == 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class CustomLinearLayoutManager extends LinearLayoutManager {
        public static ChangeQuickRedirect a;
        private boolean c;

        public CustomLinearLayoutManager(Context context) {
            super(context);
            Object[] objArr = {MLiveMRNActivity.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40158cddf12734a242647137eef37595", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40158cddf12734a242647137eef37595");
            } else {
                this.c = true;
            }
        }

        public CustomLinearLayoutManager(Context context, int i, boolean z) {
            super(context, i, z);
            Object[] objArr = {MLiveMRNActivity.this, context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b128ad1324b876d5826e5050a160899", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b128ad1324b876d5826e5050a160899");
            } else {
                this.c = true;
            }
        }

        public final void a(boolean z, int i) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ebb8cc0b3b68966f0d0ae29c20b16b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ebb8cc0b3b68966f0d0ae29c20b16b4");
                return;
            }
            int scrollState = MLiveMRNActivity.this.w.getScrollState();
            if (!z && scrollState != 0) {
                if (i == 1) {
                    MLiveMRNActivity.this.A = true;
                }
                if (i == 3) {
                    MLiveMRNActivity.this.B = true;
                }
            } else if (i != 4 && z && (MLiveMRNActivity.this.A || MLiveMRNActivity.this.B)) {
            } else {
                this.c = z;
            }
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d02ce09dfb46615dd5edfaf164632b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d02ce09dfb46615dd5edfaf164632b")).booleanValue() : this.c && super.canScrollVertically();
        }
    }
}
