package com.dianping.live.live.mrn.list;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.alipay.sdk.app.PayTask;
import com.dianping.archive.DPObject;
import com.dianping.live.live.mrn.MLiveMRNActivity;
import com.dianping.live.live.mrn.MLiveMRNFragment;
import com.dianping.live.live.mrn.MLivePlayerView;
import com.dianping.live.live.mrn.list.e;
import com.dianping.live.live.utils.NetWorkStateReceiver;
import com.dianping.live.live.utils.h;
import com.dianping.live.live.utils.i;
import com.dianping.live.live.utils.j;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.mrn.config.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends FrameLayout implements com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, com.dianping.dataservice.mapi.f>, com.dianping.live.live.mrn.a {
    public static ChangeQuickRedirect a;
    private long A;
    private Map<String, Object> B;
    private String C;
    private long D;
    private String E;
    private Handler F;
    private String G;
    String b;
    public View c;
    public MLiveMRNFragment d;
    public String e;
    public int f;
    com.dianping.live.live.mrn.d g;
    public boolean h;
    boolean i;
    public boolean j;
    public boolean k;
    boolean l;
    boolean m;
    int n;
    public com.dianping.live.report.c o;
    public e.a p;
    private com.dianping.dataservice.mapi.e q;
    private String r;
    private MLivePlayerView s;
    private com.sankuai.meituan.mtlive.player.library.d t;
    private com.sankuai.meituan.mtlive.player.library.b u;
    private boolean v;
    private NetWorkStateReceiver w;
    private List<Integer> x;
    private int y;
    private long z;

    @Override // com.dianping.live.live.mrn.a
    public final NetWorkStateReceiver getPusherNetWorkStateReceiver() {
        return null;
    }

    @Override // com.dianping.live.live.mrn.a
    public final void setPusherNetWorkStateReceiver(NetWorkStateReceiver netWorkStateReceiver) {
    }

    public static /* synthetic */ boolean a(c cVar, Map map) {
        boolean z;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "9dc17af0359027c50bb4e8eb91898a73", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "9dc17af0359027c50bb4e8eb91898a73")).booleanValue();
        }
        boolean booleanValue = ((Boolean) map.get("fftSwitchInChannelFirst")).booleanValue();
        boolean booleanValue2 = ((Boolean) map.get("fftSwitchInChannelOther")).booleanValue();
        boolean booleanValue3 = ((Boolean) map.get("fftSwitchInChannelPlayback")).booleanValue();
        boolean booleanValue4 = ((Boolean) map.get("fftSwitch")).booleanValue();
        JSONArray jSONArray = (JSONArray) map.get("fftType");
        if (jSONArray == null || jSONArray.length() <= 0) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= jSONArray.length()) {
                z = false;
                break;
            }
            String optString = jSONArray.optString(i);
            if (cVar.G != null && cVar.G.equals(optString)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            if (cVar.getLiveStatus() != null && cVar.getLiveStatus().equals("2")) {
                if (booleanValue && cVar.m && cVar.f().booleanValue()) {
                    return true;
                }
                if (booleanValue2 && !cVar.m && cVar.f().booleanValue()) {
                    return true;
                }
                if (booleanValue4 && !cVar.f().booleanValue()) {
                    return true;
                }
            }
            if (cVar.getLiveStatus() != null && cVar.getLiveStatus().equals("3") && booleanValue3 && cVar.f().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean b(c cVar, boolean z) {
        cVar.v = true;
        return true;
    }

    public static /* synthetic */ boolean c(c cVar, boolean z) {
        cVar.l = true;
        return true;
    }

    @Override // com.dianping.dataservice.d
    public final /* synthetic */ void onRequestFailed(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.mapi.f fVar) {
        Object[] objArr = {eVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e261acfc8953a6ad0675da2f956d4b8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e261acfc8953a6ad0675da2f956d4b8d");
            return;
        }
        j.a("MLive_Logan: Preplay joinnewlive onRequestFailed");
        d();
    }

    @Override // com.dianping.dataservice.d
    public final /* synthetic */ void onRequestFinish(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.mapi.f fVar) {
        DPObject[] h;
        com.dianping.dataservice.mapi.f fVar2 = fVar;
        int i = 0;
        Object[] objArr = {eVar, fVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c004af7708d766cfae31eba826cbd6cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c004af7708d766cfae31eba826cbd6cf");
            return;
        }
        j.a("MLive_Logan: Preplay joinnewlive onRequestFinish");
        DPObject dPObject = (DPObject) fVar2.a();
        if (dPObject != null && dPObject.h("showUrl") != null && dPObject.h("showUrl").length > 0) {
            String str = "";
            String str2 = "";
            for (DPObject dPObject2 : dPObject.h("showUrl")) {
                if (dPObject2 != null) {
                    String e = dPObject2.e("url");
                    if (dPObject2.c("defaultType")) {
                        this.e = e;
                        if (dPObject2.b(LocalIdUtils.QUERY_QUALITY) && dPObject2.b("streamId")) {
                            String e2 = dPObject2.e(LocalIdUtils.QUERY_QUALITY);
                            str2 = dPObject2.e("streamId");
                            str = e2;
                        }
                    }
                }
            }
            DPObject g = dPObject.g("liveBaseVO");
            if (g != null) {
                i = g.d("buId");
                this.f = g.d("status");
            }
            com.dianping.live.report.d.b.a(String.valueOf(this.D), str, str2, String.valueOf(i), "", this.f, this.p);
            StringBuilder sb = new StringBuilder("resp success:");
            sb.append(System.currentTimeMillis() - this.A);
            sb.append(StringUtil.SPACE);
            sb.append(this.e);
            com.dianping.live.report.a.b = System.currentTimeMillis() - this.A;
            if (this.e != null && this.e.length() > 0) {
                g();
                return;
            } else {
                d();
                return;
            }
        }
        d();
    }

    public c(@NonNull Context context, com.dianping.live.live.mrn.list.model.a aVar, boolean z, int i, e.a aVar2) {
        super(context);
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object[] objArr = {context, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89b86ff9a3ab741be4f2536cd97c891", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89b86ff9a3ab741be4f2536cd97c891");
            return;
        }
        this.b = "MLiveItemFragment";
        this.r = "https://mapi.dianping.com/mapi/dzu/live/joinnewlive.bin";
        this.f = 2;
        this.h = false;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.y = 1;
        this.z = 0L;
        this.A = 0L;
        this.B = new HashMap();
        this.F = new Handler();
        this.A = System.currentTimeMillis();
        this.C = aVar.a;
        this.D = aVar.c;
        this.m = z;
        this.i = !z ? 1 : 0;
        this.n = i;
        this.p = aVar2;
        this.E = aVar.g;
        this.f = aVar.b;
        this.c = LayoutInflater.from(context).inflate(R.layout.item_fragment, this);
        this.s = (MLivePlayerView) this.c.findViewById(R.id.live_pre_play_view_list);
        com.dianping.live.report.d.b.a(String.valueOf(this.D), StringUtil.NULL, StringUtil.NULL, StringUtil.NULL, "", this.f, this.p);
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c97f6867bfc5e804c76e89de55ecf799", RobustBitConfig.DEFAULT_VALUE)) {
            z5 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c97f6867bfc5e804c76e89de55ecf799")).booleanValue();
        } else {
            boolean z6 = aVar.b == 2 || (aVar.b == 3 && f().booleanValue());
            Uri parse = Uri.parse(this.C);
            if (parse == null || parse.getQueryParameterNames() == null || parse.getQueryParameterNames().size() <= 0) {
                z2 = false;
                z3 = false;
                z4 = false;
            } else {
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (!queryParameterNames.contains("type") || parse.getQueryParameter("type") == null) {
                    z2 = false;
                } else {
                    this.G = parse.getQueryParameter("type");
                    z2 = true;
                }
                z3 = queryParameterNames.contains("isOrganizer") && parse.getQueryParameter("isOrganizer").equals("false");
                z4 = !queryParameterNames.contains("fftClose") || parse.getQueryParameter("fftClose") == null;
                if (queryParameterNames.contains("fftClose") && !parse.getQueryParameter("fftClose").equals("1")) {
                    z4 = true;
                }
            }
            z5 = z6 && z2 && z3 && z4;
        }
        if (!z5) {
            if (z) {
                a(i);
                return;
            }
            return;
        }
        j.a("MLive_Logan: Preplay checkPreByParams true");
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8ecce0201a6c7d90d92c40626f03b8be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8ecce0201a6c7d90d92c40626f03b8be");
        } else {
            new StringBuilder("start init sdk:").append(System.currentTimeMillis() - this.A);
            j.a("MLive_Logan: Preplay start init sdk");
            if (com.dianping.live.live.mrn.b.a().a(getContext())) {
                new StringBuilder("pre checkMLiveReady:").append(System.currentTimeMillis() - this.A);
                j.a("MLive_Logan: Preplay pre checkMLiveReady");
                com.dianping.live.report.a.c = System.currentTimeMillis() - this.A;
                this.v = true;
                g();
            } else {
                com.dianping.live.live.mrn.b.a().a(getContext(), new h.a() { // from class: com.dianping.live.live.mrn.list.c.3
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.live.live.utils.h.a
                    public final void a(int i2) {
                        Object[] objArr4 = {200};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "589215ee20e69360023da855bfb1c6bd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "589215ee20e69360023da855bfb1c6bd");
                            return;
                        }
                        String unused = c.this.b;
                        new StringBuilder("pre initSuccess:").append(System.currentTimeMillis() - c.this.A);
                        j.a("MLive_Logan: Preplay pre initSuccess");
                        com.dianping.live.report.a.c = System.currentTimeMillis() - c.this.A;
                        c.b(c.this, true);
                        c.this.g();
                    }

                    @Override // com.dianping.live.live.utils.h.a
                    public final void b(int i2) {
                        Object[] objArr4 = {202};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f646b1c95dfa2e7c0af32fddf8e61f36", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f646b1c95dfa2e7c0af32fddf8e61f36");
                            return;
                        }
                        String unused = c.this.b;
                        new StringBuilder("pre initFailed:").append(System.currentTimeMillis() - c.this.A);
                        j.a("MLive_Logan: Preplay pre initFailed");
                        c.this.d();
                    }
                });
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "05f20696630ff913d5801e8fbdf425b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "05f20696630ff913d5801e8fbdf425b5");
        } else {
            com.sankuai.android.jarvis.c.a("mlive_get_horn", new Runnable() { // from class: com.dianping.live.live.mrn.list.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3b2b214d76b2cc5aac32593d96048d30", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3b2b214d76b2cc5aac32593d96048d30");
                        return;
                    }
                    String unused = c.this.b;
                    new StringBuilder("开始拉取horn:").append(System.currentTimeMillis() - c.this.A);
                    j.a("MLive_Logan: Preplay 开始拉取horn ");
                    final Map<String, Object> a2 = com.dianping.live.live.utils.f.a(c.this.getContext());
                    c.this.F.post(new Runnable() { // from class: com.dianping.live.live.mrn.list.c.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "07b83e95881475979b9dd338200d2c6f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "07b83e95881475979b9dd338200d2c6f");
                                return;
                            }
                            c.this.h = c.a(c.this, a2);
                            if (c.this.h) {
                                j.a("MLive_Logan: Preplay 拉取horn结果 true ");
                                c.this.g();
                                return;
                            }
                            j.a("MLive_Logan: Preplay 拉取horn结果 false ");
                            if (c.this.m) {
                                c.this.d();
                            }
                        }
                    });
                }
            }).start();
        }
        if (aVar.f != null && this.m) {
            a(aVar);
        } else {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1cd5cbec7355f575fff2814bf16b5c4d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1cd5cbec7355f575fff2814bf16b5c4d");
            } else {
                try {
                    new StringBuilder("start sendRequest:").append(System.currentTimeMillis() - this.A);
                    j.a("MLive_Logan: Preplay start sendRequest");
                    com.dianping.live.report.a.a = System.currentTimeMillis() - this.A;
                    Uri.Builder buildUpon = Uri.parse(this.r).buildUpon();
                    buildUpon.appendQueryParameter("liveid", String.valueOf(this.D));
                    buildUpon.appendQueryParameter("trylive", "false");
                    buildUpon.appendQueryParameter("streamprotocol", "FLV");
                    this.q = com.dianping.dataservice.mapi.b.a(buildUpon.toString(), com.dianping.dataservice.mapi.c.DISABLED);
                    w.a(getContext()).exec(this.q, this);
                } catch (NullPointerException e) {
                    new StringBuilder("sendRequest exception:").append(com.dianping.util.exception.a.a(e));
                    j.a("MLive_LogansendRequest exception:" + com.dianping.util.exception.a.a(e));
                }
            }
        }
        new Handler().postDelayed(new Runnable() { // from class: com.dianping.live.live.mrn.list.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4a729a41c08a5b0e0cd8461c15991cf9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4a729a41c08a5b0e0cd8461c15991cf9");
                } else if (c.this.l) {
                } else {
                    String unused = c.this.b;
                    new StringBuilder("timeout:").append(System.currentTimeMillis() - c.this.A);
                    j.a("MLive_Logan: Preplay prePlay timeout");
                    c.this.d();
                }
            }
        }, PayTask.j);
    }

    private Boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3899bc604a30e271bf88eb68f143dd", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3899bc604a30e271bf88eb68f143dd") : Boolean.valueOf(this.p.equals(e.a.multiple));
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fe646b581b301bde4e161625703f6a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fe646b581b301bde4e161625703f6a0");
            return;
        }
        j.a("MLive_Logan: Preplay failedToPrePlay");
        if (this.m) {
            a(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e48da0a6dd29bb04344db628c32cf99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e48da0a6dd29bb04344db628c32cf99");
        } else if (this.d == null) {
            String str = this.b;
            i.a(str, "addMRNFragment called: " + i + this.n);
            StringBuilder sb = new StringBuilder("MLive_Logan: Preplay addMRNFragment called ");
            sb.append(i);
            j.a(sb.toString());
            this.d = new MLiveMRNFragment();
            Bundle bundle = new Bundle();
            Uri.Builder builder = new Uri.Builder();
            Uri parse = Uri.parse(this.C);
            if (parse == null || parse.getQueryParameterNames() == null || parse.getQueryParameterNames().size() <= 0) {
                return;
            }
            for (String str2 : parse.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str2)) {
                    String queryParameter = parse.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        builder.appendQueryParameter(str2, queryParameter);
                        if (str2.equals("mrn_min_version")) {
                            bundle.putString("mrn_min_version", queryParameter);
                        }
                        if (str2.equals("liveId") && !queryParameter.equals(String.valueOf(this.D))) {
                            j.a("MLive_Logan_ChanneladdMRNFragment LiveId：" + queryParameter + " is not same as pre LiveId：" + this.D + " RN URL:" + this.C);
                        }
                    }
                }
            }
            bundle.putString("channelIndex", String.valueOf(i));
            bundle.putParcelable("mrn_arg", builder.build());
            this.d.setArguments(bundle);
            FragmentTransaction beginTransaction = ((AppCompatActivity) getContext()).getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.frag_son_container, this.d, getTAG());
            beginTransaction.commitAllowingStateLoss();
            com.dianping.live.report.d.b.f = getLiveId();
        } else {
            j.a("MLive_Logan_ChannelMLiveMRNFragment is not show because MLiveItemFragment is not added ");
        }
    }

    public final MLiveMRNFragment getMRNFragment() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b01caba87c7b899dab7d78ac5260af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b01caba87c7b899dab7d78ac5260af1");
            return;
        }
        j.a("MLive_Logan: Preplay checkAndPreplay");
        if (!this.v || !this.h || this.e == null || this.e.length() <= 0) {
            return;
        }
        j.a("MLive_Logan: Preplay checkAndPreplay result true");
        h();
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7d49248dd53180ef45e9adbd912f6c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7d49248dd53180ef45e9adbd912f6c6");
            return;
        }
        new StringBuilder("initPrePlayer:").append(System.currentTimeMillis() - this.A);
        if (this.g == null) {
            this.g = com.dianping.live.playerManager.a.a(getContext()).a(getContext(), this.e);
        }
        if (this.t == null) {
            this.t = new com.sankuai.meituan.mtlive.player.library.d();
        }
        if (this.u == null) {
            this.x = new ArrayList();
            this.u = new com.sankuai.meituan.mtlive.player.library.b() { // from class: com.dianping.live.live.mrn.list.c.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.player.library.b
                public final void a(Bundle bundle) {
                }

                @Override // com.sankuai.meituan.mtlive.player.library.b
                public final void a(int i, Bundle bundle) {
                    Object[] objArr2 = {Integer.valueOf(i), bundle};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "617038dbea0fbe9cb8d52c7af3b913b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "617038dbea0fbe9cb8d52c7af3b913b8");
                        return;
                    }
                    c.this.x.add(Integer.valueOf(i));
                    j.a("MLive_Logan: Player Code " + i + "秒播开启 liveId " + c.this.D);
                    if (i == 2007) {
                        long currentTimeMillis = System.currentTimeMillis();
                        String unused = c.this.b;
                        new StringBuilder("better loading:").append(currentTimeMillis - c.this.A);
                    } else if (i == 2001) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        String unused2 = c.this.b;
                        new StringBuilder("better 已连接服务器:").append(currentTimeMillis2 - c.this.A);
                        com.dianping.live.report.a.e = currentTimeMillis2 - c.this.A;
                    } else if (i == 2002) {
                        long currentTimeMillis3 = System.currentTimeMillis();
                        String unused3 = c.this.b;
                        new StringBuilder("better 开始拉流:").append(currentTimeMillis3 - c.this.A);
                    } else if (i == 2004) {
                        long currentTimeMillis4 = System.currentTimeMillis();
                        String unused4 = c.this.b;
                        new StringBuilder("better 视频播放开始:").append(currentTimeMillis4 - c.this.A);
                        com.dianping.live.report.a.f = currentTimeMillis4 - c.this.A;
                    } else if (i == 2008) {
                        long currentTimeMillis5 = System.currentTimeMillis();
                        String unused5 = c.this.b;
                        new StringBuilder("better 启动解码:").append(currentTimeMillis5 - c.this.A);
                    } else if (i != 2003) {
                        if (i == 2009) {
                            Object obj = bundle.get("EVT_PARAM1");
                            int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : 0;
                            Object obj2 = bundle.get("EVT_PARAM2");
                            int intValue2 = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                            StringBuilder sb = new StringBuilder("width:");
                            sb.append(intValue);
                            sb.append(",height:");
                            sb.append(intValue2);
                            if (intValue == 0 || intValue2 == 0 || (intValue * 9) / 16 < intValue2) {
                                return;
                            }
                            c.this.g.a(1);
                        }
                    } else {
                        long currentTimeMillis6 = System.currentTimeMillis();
                        String unused6 = c.this.b;
                        StringBuilder sb2 = new StringBuilder("better FFT:");
                        sb2.append(c.this.n);
                        sb2.append(CommonConstant.Symbol.COLON);
                        sb2.append(currentTimeMillis6 - c.this.A);
                        c.c(c.this, true);
                        c cVar = c.this;
                        Object[] objArr3 = {new Long(currentTimeMillis6)};
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "cdcdc0872d78069253579758f8e92bc1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "cdcdc0872d78069253579758f8e92bc1");
                            return;
                        }
                        if (cVar.m) {
                            cVar.a(0);
                        } else {
                            if (!cVar.j && cVar.g != null && !cVar.g.d) {
                                cVar.g.c();
                                cVar.i = false;
                            }
                            if (cVar.g != null && !cVar.g.d && cVar.getLiveStatus().equals("3") && cVar.j && cVar.d == null) {
                                cVar.g.c(true);
                            }
                        }
                        if (cVar.j) {
                            cVar.getMLivePlayerStatusMonitor().a(cVar.getLiveId());
                            cVar.a(currentTimeMillis6);
                        }
                    }
                }
            };
        }
        a(this.g);
    }

    private void a(com.dianping.live.live.mrn.list.model.a aVar) {
        DPObject[] dPObjectArr;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4ea71c5c6cd1f55e7a9ba7d199b8ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4ea71c5c6cd1f55e7a9ba7d199b8ea");
            return;
        }
        j.a("MLive_Logan: Preplay parsePlayurl");
        String str = "";
        String str2 = "";
        for (DPObject dPObject : aVar.f) {
            if (dPObject != null) {
                String e = dPObject.e("url");
                if (dPObject.c("defaultType")) {
                    this.e = e;
                    if (dPObject.b(LocalIdUtils.QUERY_QUALITY) && dPObject.b("streamId")) {
                        String e2 = dPObject.e(LocalIdUtils.QUERY_QUALITY);
                        str2 = dPObject.e("streamId");
                        str = e2;
                    }
                }
            }
        }
        this.f = aVar.b;
        com.dianping.live.report.d.b.a(String.valueOf(this.D), str, str2, String.valueOf(aVar.e), "", this.f, this.p);
        StringBuilder sb = new StringBuilder("resp success:");
        sb.append(System.currentTimeMillis() - this.A);
        sb.append(StringUtil.SPACE);
        sb.append(this.e);
        if (this.e != null && this.e.length() > 0) {
            g();
        } else {
            d();
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6931ff4c6a31470262a1a81974ec61d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6931ff4c6a31470262a1a81974ec61d1");
            return;
        }
        this.z = System.currentTimeMillis();
        this.o = new com.dianping.live.report.c();
        String str = this.b;
        StringBuilder sb = new StringBuilder("onViewAttached called:1 ");
        sb.append(i);
        sb.append(this.n);
        sb.append(this.g != null);
        sb.append(CommonConstant.Symbol.COLON);
        sb.append(this.l);
        sb.append(CommonConstant.Symbol.COLON);
        sb.append(this.s != null);
        i.a(str, sb.toString());
        if (this.g != null && this.s != null && !this.g.d && this.h) {
            if (!this.l) {
                String str2 = this.b;
                i.a(str2, "onViewAttached called: attach时未播放第一帧" + i + this.n);
            }
            this.g.a(this.s);
            this.g.c(true);
            this.g.d();
            String str3 = this.b;
            i.a(str3, "onViewAttached called: setMute+resume" + i + this.n);
        }
        if (this.l) {
            getMLivePlayerStatusMonitor().a(getLiveId());
            a(System.currentTimeMillis());
        }
        this.j = true;
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d11b69bafed592920ea08bf0c84430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d11b69bafed592920ea08bf0c84430");
            return;
        }
        i.a(i.g, "测试只有声音：onViewDetached" + i + CommonConstant.Symbol.COLON + this.n);
        i.a(this.b, "onViewDetached called: " + i + this.n);
        d(i);
        if (!this.h && getLiveStatus().equals("3")) {
            i();
        }
        j();
        double currentTimeMillis = System.currentTimeMillis() - this.z;
        if (getMLivePlayerStatusMonitor() != null) {
            getMLivePlayerStatusMonitor().a(getLiveId(), 2, currentTimeMillis, this.h);
            this.o = null;
        }
        this.j = false;
        this.k = false;
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e38f7f683b3e5babc1595e04eb06112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e38f7f683b3e5babc1595e04eb06112");
            return;
        }
        String str = this.b;
        i.a(str, "pausePlayer called: " + i);
        if (this.g == null || this.g.d) {
            return;
        }
        this.g.c();
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96ff2997057e639e9fadfb9ddd00475e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96ff2997057e639e9fadfb9ddd00475e");
        } else if (this.g == null || this.g.d) {
        } else {
            this.g.a((com.sankuai.meituan.mtlive.player.library.b) null);
            this.g.a(true);
        }
    }

    private void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f9d4127cf1df953d310cf4adf174163", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f9d4127cf1df953d310cf4adf174163");
            return;
        }
        String str = this.b;
        i.a(str, "stopAndRelease called: " + i);
        if (this.g == null || this.g.d) {
            return;
        }
        j.a("MLive_Logan: Player stopAndRelease has called liveId " + this.D);
        this.g.a((com.sankuai.meituan.mtlive.player.library.b) null);
        this.g.a(true);
        com.dianping.live.playerManager.a.a(getContext()).a(getContext(), this.g);
        this.g = null;
        this.t = null;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9a45e2faa42263134036ca50aafb96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9a45e2faa42263134036ca50aafb96");
            return;
        }
        String str = i.g;
        i.a(str, "MLiveItemFragment onDestroy " + this.n);
        j();
        if (this.g != null) {
            e(this.n);
            this.s = null;
            this.d = null;
        }
        com.dianping.live.live.mrn.b.a().b();
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09e4cd169cfc48ce7a17d3c4c01f04f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09e4cd169cfc48ce7a17d3c4c01f04f3");
            return;
        }
        String str = i.g;
        i.a(str, "测试只有声音：destroy-destroyMRNFragment1:" + this.n);
        if (this.d != null) {
            String str2 = i.g;
            i.a(str2, "测试只有声音：destroy-destroyMRNFragment2:" + this.n);
            String str3 = this.b;
            i.a(str3, "destroyMRNFragment called: " + this.n + this.n);
            FragmentTransaction beginTransaction = ((AppCompatActivity) getContext()).getSupportFragmentManager().beginTransaction();
            beginTransaction.remove(this.d);
            beginTransaction.commitAllowingStateLoss();
            this.d = null;
            try {
                if (this.w == null || getContext() == null) {
                    return;
                }
                getContext().unregisterReceiver(this.w);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.dianping.live.live.mrn.a
    public final boolean a() {
        return this.k;
    }

    @Override // com.dianping.live.live.mrn.a
    public final String getLiveId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99633155451b0425586e3a547cb8178", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99633155451b0425586e3a547cb8178") : String.valueOf(this.D);
    }

    @Override // com.dianping.live.live.mrn.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ded9bc81f1b469d3a9fb66b25e6ede06", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ded9bc81f1b469d3a9fb66b25e6ede06")).booleanValue() : com.dianping.live.live.mrn.b.c.booleanValue();
    }

    @Override // com.dianping.live.live.mrn.a
    public final void setFftReported(boolean z) {
        this.k = z;
    }

    @Override // com.dianping.live.live.mrn.a
    public final NetWorkStateReceiver getPlayerNetWorkStateReceiver() {
        return this.w;
    }

    @Override // com.dianping.live.live.mrn.a
    public final void setPlayerNetWorkStateReceiver(NetWorkStateReceiver netWorkStateReceiver) {
        this.w = netWorkStateReceiver;
    }

    @Override // com.dianping.live.live.mrn.a
    public final boolean c() {
        return this.h;
    }

    @Override // com.dianping.live.live.mrn.a
    public final void setmLivePlayerListener(com.sankuai.meituan.mtlive.player.library.b bVar) {
        this.u = bVar;
    }

    @Override // com.dianping.live.live.mrn.a
    public final void setmLivePlayConfig(com.sankuai.meituan.mtlive.player.library.d dVar) {
        this.t = dVar;
    }

    @Override // com.dianping.live.live.mrn.a
    public final int getRetCode() {
        return this.y;
    }

    @Override // com.dianping.live.live.mrn.a
    public final List<Integer> getCodes() {
        return this.x;
    }

    public final com.dianping.live.live.mrn.d getmLivePlayer() {
        return this.g;
    }

    @Override // com.dianping.live.live.mrn.a
    public final void setmLivePlayer(com.dianping.live.live.mrn.d dVar) {
        this.g = dVar;
    }

    @Override // com.dianping.live.live.mrn.a
    public final com.dianping.live.report.c getMLivePlayerStatusMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d0534f19024ee2422244fa9ab53ebd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.live.report.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d0534f19024ee2422244fa9ab53ebd");
        }
        if (this.o == null) {
            this.o = new com.dianping.live.report.c();
        }
        return this.o;
    }

    @Override // com.dianping.live.live.mrn.a
    public final e.a getChannelType() {
        return this.p;
    }

    @Override // com.dianping.live.live.mrn.a
    public final int getIndexInChannel() {
        return this.n;
    }

    void a(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6b040baaacc60493e9f0faf4187aac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6b040baaacc60493e9f0faf4187aac");
        } else if (this.k) {
        } else {
            this.B.put("liveId", getLiveId());
            this.B.put("fft", Long.valueOf(j - getStartTime()));
            this.B.put("isFloat", Boolean.FALSE);
            this.B.put("pullUrl", this.e);
            this.B.put("isCold", com.dianping.live.live.mrn.b.c);
            this.B.put("isPreOpt", Boolean.TRUE);
            this.B.put("code", "2003");
            this.B.put("startRequest", Long.valueOf(com.dianping.live.report.a.a));
            this.B.put("endRequest", Long.valueOf(com.dianping.live.report.a.b));
            this.B.put("initPlayer", Long.valueOf(com.dianping.live.report.a.c));
            this.B.put("startPlaySuccess", Long.valueOf(com.dianping.live.report.a.d));
            this.B.put("connectSuccess", Long.valueOf(com.dianping.live.report.a.e));
            this.B.put("beginPlay", Long.valueOf(com.dianping.live.report.a.f));
            Statistics.getChannel("gc").writeSystemCheck(AppUtil.generatePageInfoKey(this), "b_gc_mlive_sc", this.B, "c_gc_6uvcyn40");
            com.dianping.live.live.utils.c.a(new com.dianping.live.live.utils.d() { // from class: com.dianping.live.live.mrn.list.c.5
                public static ChangeQuickRedirect a;

                @Override // com.dianping.live.live.utils.d
                public final void a(Map<String, Object> map) {
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f931e93b7ec0b3649f5ac81e27ca7487", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f931e93b7ec0b3649f5ac81e27ca7487");
                    } else if (map.containsKey("isOpen") && map.containsKey("fft")) {
                        boolean booleanValue = ((Boolean) map.get("isOpen")).booleanValue();
                        boolean booleanValue2 = ((Boolean) map.get("fft")).booleanValue();
                        if (booleanValue && booleanValue2) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("MLIVE_IS_COLD", Integer.valueOf(c.this.b() ? 1 : 0));
                            hashMap.put("MLIVE_IS_FLOAT", 0);
                            hashMap.put("MLIVE_IS_PRE_OPT", 1);
                            hashMap.put("MLIVE_IS_CHANNEL_FIRST", Boolean.valueOf(c.this.n == 0));
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("MLIVE_FFT", Double.valueOf(j - c.this.getStartTime()));
                            if (com.dianping.live.report.a.a > 0) {
                                hashMap2.put("MLIVE_START_REQUEST", Double.valueOf(com.dianping.live.report.a.a));
                            }
                            if (com.dianping.live.report.a.b > 0) {
                                hashMap2.put("MLIVE_END_REQUEST", Double.valueOf(com.dianping.live.report.a.b));
                            }
                            hashMap2.put("MLIVE_INIT_PLAYER", Double.valueOf(com.dianping.live.report.a.c));
                            hashMap2.put("MLIVE_START_PLAY_SUCCESS", Double.valueOf(com.dianping.live.report.a.d));
                            hashMap2.put("MLIVE_CONNECT_SUCCESS", Double.valueOf(com.dianping.live.report.a.e));
                            hashMap2.put("MLIVE_BEGIN_PLAY", Double.valueOf(com.dianping.live.report.a.f));
                            com.dianping.live.report.d.b.a(String.valueOf(c.this.D), hashMap2, hashMap);
                        }
                    }
                }
            });
            this.k = true;
        }
    }

    private String getTAG() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9834f4a593a58898e18d60689f38a4c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9834f4a593a58898e18d60689f38a4c6");
        }
        return this.D + CommonConstant.Symbol.COLON;
    }

    public final String getLiveStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f85df87e5fe80f2fffba1e5ce8f5b0e7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f85df87e5fe80f2fffba1e5ce8f5b0e7") : String.valueOf(this.f);
    }

    @Override // com.dianping.live.live.mrn.a
    public final long getStartTime() {
        return this.m ? MLiveMRNActivity.f : this.z;
    }

    public final String getEventTracking() {
        return this.E;
    }

    private void a(com.dianping.live.live.mrn.d dVar) {
        int i = 1;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2bdc99bb14c891dba0c9fcaa8e8a69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2bdc99bb14c891dba0c9fcaa8e8a69");
        } else if (dVar == null || dVar.d) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9af396c0a690989a6b162c796ee1e63e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9af396c0a690989a6b162c796ee1e63e");
            } else if (this.g != null && !this.g.d && this.s != null) {
                this.g.a(this.s);
            }
            dVar.a(this.u);
            dVar.a(this.t);
            new StringBuilder("开始播放时是否静音：").append(this.i);
            dVar.c(this.i);
            if (this.e.matches("^rtmp://.*")) {
                i = 0;
            } else if (!this.e.matches(".*\\.flv$")) {
                if (!this.e.contains(".m3u8")) {
                    d();
                    return;
                }
                i = 3;
            }
            int a2 = dVar.a(this.e, i);
            this.y = a2;
            if (a2 == 0) {
                new StringBuilder("startPrePlay success: ").append(System.currentTimeMillis() - this.A);
                com.dianping.live.report.a.d = System.currentTimeMillis() - this.A;
                return;
            }
            d();
        }
    }
}
